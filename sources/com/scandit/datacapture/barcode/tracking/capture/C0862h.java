package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.tracking.capture.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0862h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeJsonValue f18171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0862h(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f18171a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18171a);
    }
}
