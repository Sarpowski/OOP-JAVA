

import java.lang.reflect.*;

public class Main
{

    public static void main(String[] args) {

        Class<Class_for_annotation> Stuff = Class_for_annotation.class;

        if (Stuff == null) {
            System.out.println("Class_for_annotation is null");//can't be null, but double check
            return;
        }

        for (Method method : Stuff.getDeclaredMethods()) {

            if (method.isAnnotationPresent(My_Annotation.class)) {
                if (Modifier.isPrivate(method.getModifiers())) {
                    method.setAccessible(true);
                }

                My_Annotation annotation = method.getAnnotation(My_Annotation.class);
                int number = annotation.n();
                for (int i = 0; i < number; i++) {
                    try {
                        if (method.getParameterCount() == 0) {
                            method.invoke(Stuff);
                        } else if (method.getParameterTypes()[0] == int.class) {
                            System.out.println("int protected " + method.invoke( Stuff,2));

                        } else if (method.getParameterTypes()[0] == String.class) {
                            method.invoke(Stuff, " Sarp ");

                        } else if (method.getParameterTypes()[0] == double.class) {
                            System.out.println( "double protected "+method.invoke( Stuff,1.0, 2.0));

                        }
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            }
        }
    }
}
