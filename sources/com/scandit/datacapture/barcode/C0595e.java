package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0595e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f17622a;
    final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0595e(Function1 function1, View view) {
        super(1);
        this.f17622a = view;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0611f.a(this.f17622a, (C0527b) this.b.invoke(Float.valueOf(((Number) obj).floatValue())));
        return Unit.f24250a;
    }
}
