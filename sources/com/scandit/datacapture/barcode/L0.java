package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class L0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f17221a = new L0();

    public L0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(60, (Context) null, 1, (Object) null));
    }
}
