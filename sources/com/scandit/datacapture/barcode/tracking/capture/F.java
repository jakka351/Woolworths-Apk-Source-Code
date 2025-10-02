package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeFrameData f18162a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(NativeFrameData nativeFrameData) {
        super(0);
        this.f18162a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18162a);
    }
}
