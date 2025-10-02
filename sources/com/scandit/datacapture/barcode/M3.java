package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class M3 {
    private M3() {
    }

    public static /* synthetic */ BarcodePickGuidanceHandler a(Context context, InterfaceC0732m8 loadingViewFactory, InterfaceC0667i7 guidanceViewFactory) {
        Intrinsics.h(context, "context");
        Intrinsics.h(loadingViewFactory, "loadingViewFactory");
        Intrinsics.h(guidanceViewFactory, "guidanceViewFactory");
        return new S3(context, loadingViewFactory, guidanceViewFactory);
    }
}
