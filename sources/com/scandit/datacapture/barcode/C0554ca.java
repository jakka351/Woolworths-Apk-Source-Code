package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0554ca extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0622fa f17401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0554ca(C0622fa c0622fa) {
        super(1);
        this.f17401a = c0622fa;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        return this.f17401a.a(it);
    }
}
