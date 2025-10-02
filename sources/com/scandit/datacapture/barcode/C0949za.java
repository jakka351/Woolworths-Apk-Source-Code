package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0949za extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeFrameData f18289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0949za(NativeFrameData nativeFrameData) {
        super(0);
        this.f18289a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18289a);
    }
}
