package com.google.firebase.firestore.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ApiUtil {
    public static void a(Method method, Object obj, Object... objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
