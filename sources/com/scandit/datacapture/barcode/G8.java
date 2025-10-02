package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G8 implements BarcodePickIcon {
    public static final G8 b = new G8();

    private G8() {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.h(context, "context");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        return null;
    }
}
