package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class E4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E4 f17145a = new E4();

    public E4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BarcodePickViewSettingsDefaults.getUiButtonsOffset();
    }
}
