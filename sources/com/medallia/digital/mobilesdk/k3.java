package com.medallia.digital.mobilesdk;

import android.util.Base64;

/* loaded from: classes.dex */
public final class k3 {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return b(str.split("\\.")[0]);
        } catch (Exception e) {
            a4.f(e.getMessage());
            return null;
        }
    }

    private static String b(String str) {
        try {
            return new String(Base64.decode(str, 8), "UTF-8");
        } catch (Exception e) {
            a4.f(e.getMessage());
            return null;
        }
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return b(str.split("\\.")[1]);
        } catch (Exception e) {
            a4.f(e.getMessage());
            return null;
        }
    }
}
