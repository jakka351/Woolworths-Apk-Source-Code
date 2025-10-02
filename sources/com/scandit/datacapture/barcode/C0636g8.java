package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.g8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0636g8 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0652h8 f17680a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0636g8(C0652h8 c0652h8, int i, int i2) {
        super(1);
        this.f17680a = c0652h8;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.h(it, "it");
        C0552c8 c0552c8A = this.f17680a.a();
        if (c0552c8A != null) {
            c0552c8A.b(this.b);
        }
        C0552c8 c0552c8A2 = this.f17680a.a();
        if (c0552c8A2 != null) {
            c0552c8A2.a(this.c);
        }
        return Unit.f24250a;
    }
}
