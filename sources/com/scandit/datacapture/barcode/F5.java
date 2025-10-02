package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class F5 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F5 f17158a = new F5();

    public F5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null));
    }
}
