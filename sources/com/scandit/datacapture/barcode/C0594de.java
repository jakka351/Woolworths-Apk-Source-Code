package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0594de extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0610ee f17621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594de(Boolean bool, C0610ee c0610ee) {
        super(bool);
        this.f17621a = c0610ee;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.h(property, "property");
        if (Intrinsics.c(obj, obj2)) {
            return;
        }
        ((Boolean) obj2).getClass();
        this.f17621a.a();
    }
}
