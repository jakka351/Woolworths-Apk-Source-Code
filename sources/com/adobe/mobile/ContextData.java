package com.adobe.mobile;

import java.util.HashMap;

/* loaded from: classes4.dex */
final class ContextData {

    /* renamed from: a, reason: collision with root package name */
    public Object f13263a = null;
    public final HashMap b = new HashMap();

    public final synchronized String toString() {
        Object obj;
        try {
            obj = this.f13263a;
        } catch (Throwable th) {
            throw th;
        }
        return super.toString() + (obj != null ? obj.toString() : "");
    }
}
