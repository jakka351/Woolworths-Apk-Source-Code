package com.google.firebase.firestore.util;

/* loaded from: classes6.dex */
public class Preconditions {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
