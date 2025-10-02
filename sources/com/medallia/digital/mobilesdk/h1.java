package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
abstract class h1<T> {
    public void a(boolean z, String str) {
        if (z) {
            a4.c(YU.a.p(new StringBuilder(), d(), " : Failed to ", str));
        }
    }

    public abstract boolean a(Object... objArr);

    public abstract long b();

    public abstract ContentValues b(T t);

    public abstract T b(Object... objArr);

    public abstract ArrayList<T> c(Object... objArr);

    public abstract HashMap<String, String> c();

    public boolean c(T t) {
        boolean z = f1.a().getWritableDatabase().insert(d(), null, b((h1<T>) t)) != -1;
        try {
            a(!z, "insert - ".concat(t.getClass().getSimpleName()));
            return z;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return z;
        }
    }

    public abstract String d();

    public boolean d(T t) {
        return true;
    }

    public String e() {
        return null;
    }

    public boolean a() {
        boolean z = f1.a().getWritableDatabase().delete(d(), "1", null) > 0;
        a(!z, "delete all");
        return z;
    }

    public boolean a(T t) {
        return true;
    }
}
