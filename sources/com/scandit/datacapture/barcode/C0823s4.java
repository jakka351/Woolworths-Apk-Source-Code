package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.s4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0823s4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeFrameData f18000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823s4(NativeFrameData nativeFrameData) {
        super(0);
        this.f18000a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18000a);
    }
}
