package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0801qc extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0801qc f17983a = new C0801qc();

    public C0801qc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null));
    }
}
