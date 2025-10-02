package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class C0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindDeserializer f17114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(BarcodeFindDeserializer barcodeFindDeserializer) {
        super(0);
        this.f17114a = barcodeFindDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f17114a;
    }
}
