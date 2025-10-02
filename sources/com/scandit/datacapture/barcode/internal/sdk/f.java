package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBarcodePick f17813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NativeBarcodePick nativeBarcodePick) {
        super(0);
        this.f17813a = nativeBarcodePick;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodePickInternal(this.f17813a);
    }
}
