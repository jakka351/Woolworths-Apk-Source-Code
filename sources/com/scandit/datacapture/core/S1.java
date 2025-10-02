package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
abstract class S1 {
    public abstract int a(Object obj);

    public abstract boolean a(Object obj, Object obj2);

    public final boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
