package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0567m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeJsonValue f17450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567m(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f17450a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f17450a);
    }
}
