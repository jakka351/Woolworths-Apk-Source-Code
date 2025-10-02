package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0776p5 extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0794q5 f17879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776p5(Object obj, C0794q5 c0794q5) {
        super(obj);
        this.f17879a = c0794q5;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.h(property, "property");
        if (Intrinsics.c(obj2, obj)) {
            return;
        }
        C0794q5.a(this.f17879a);
    }
}
