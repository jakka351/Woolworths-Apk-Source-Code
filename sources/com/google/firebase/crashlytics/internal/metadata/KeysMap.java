package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class KeysMap {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15290a = new HashMap();
    public final int b = 64;
    public final int c;

    public KeysMap(int i) {
        this.c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        String strA = a(this.c, str);
        if (this.f15290a.size() >= this.b && !this.f15290a.containsKey(strA)) {
            Logger.f15258a.f(null, "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String strA2 = a(this.c, str2);
        String str3 = (String) this.f15290a.get(strA);
        if (str3 == null ? strA2 == null : str3.equals(strA2)) {
            return false;
        }
        HashMap map = this.f15290a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.c, str);
                if (this.f15290a.size() < this.b || this.f15290a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f15290a.put(strA, str2 == null ? "" : a(this.c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Logger.f15258a.f(null, "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
