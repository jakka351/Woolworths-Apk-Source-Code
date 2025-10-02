package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeLocalizedOnlyBarcode f17801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeLocalizedOnlyBarcode nativeLocalizedOnlyBarcode) {
        super(0);
        this.f17801a = nativeLocalizedOnlyBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocalizedOnlyBarcode(this.f17801a);
    }
}
