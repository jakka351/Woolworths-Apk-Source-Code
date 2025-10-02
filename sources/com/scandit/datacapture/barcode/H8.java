package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
final /* synthetic */ class H8 extends FunctionReferenceImpl implements Function1 {
    public H8(Object obj) {
        super(1, obj, NativeBarcodeFindSession.class, "getTransformedDataForData", "getTransformedDataForData(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((NativeBarcodeFindSession) this.receiver).getTransformedDataForData((String) obj);
    }
}
