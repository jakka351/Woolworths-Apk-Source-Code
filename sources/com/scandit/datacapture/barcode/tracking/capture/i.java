package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeJsonValue f18172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f18172a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18172a);
    }
}
