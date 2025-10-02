package com.google.firebase.firestore.util;

/* loaded from: classes6.dex */
public class Assert {
    public static void a(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        a(str, objArr);
        throw null;
    }

    public static void c(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        a(str, objArr);
        throw null;
    }
}
