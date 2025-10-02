package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0697k5 {
    public static final InterfaceC0732m8 a(Context context, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(viewSettings, "viewSettings");
        boolean showLoadingDialog = viewSettings.getShowLoadingDialog();
        if (showLoadingDialog) {
            return new C0797q8(context, viewSettings.getLoadingDialogText());
        }
        if (showLoadingDialog) {
            throw new NoWhenBranchMatchedException();
        }
        return new C0748n8(context);
    }
}
