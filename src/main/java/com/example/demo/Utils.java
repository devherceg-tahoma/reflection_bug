package com.example.demo;

import java.lang.reflect.Field;
import java.util.Map;

public class Utils {


    private Utils() {
        throw new IllegalStateException("Class is not instantiable");
    }

    public static <T> T getInstance(Class<T> objectClass, Map<String, Object> propertyMap) {
        if (propertyMap != null && !propertyMap.isEmpty()) {
            final T object;
            try {
                object = objectClass.getDeclaredConstructor().newInstance();
                System.out.println(object);
            } catch (Exception e) {
                throw new RuntimeException("Creating Object Instance with Properties failed", e);
            }
            propertyMap.forEach((k, v) -> {
                Field field;
                try {
                    field = object.getClass().getDeclaredField(k);
                    field.setAccessible(true);
                    field.set(object, v);
                    System.out.println(field);
                } catch (Exception e) {
                    throw new RuntimeException("Creating Object Instance with Properties failed", e);
                }
            });
            return object;
        }
        return null;
    }
}
