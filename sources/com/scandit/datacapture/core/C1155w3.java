package com.scandit.datacapture.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.core.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1155w3 {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f18983a;
    private Object b;

    public C1155w3(Function0 initializer) {
        Intrinsics.h(initializer, "initializer");
        this.f18983a = initializer;
    }

    public final Object a(Object thisRef, KProperty property) {
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        synchronized (this) {
            Object obj = this.b;
            if (obj != null) {
                return obj;
            }
            Function0 function0 = this.f18983a;
            Intrinsics.e(function0);
            Object objInvoke = function0.invoke();
            if (objInvoke != null) {
                this.b = objInvoke;
                this.f18983a = null;
            }
            return objInvoke;
        }
    }
}
