package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Y0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f17350a = new Y0();

    public Y0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(PixelExtensionsKt.pxFromDp$default(40.0f, (Context) null, 1, (Object) null));
    }
}
