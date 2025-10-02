package com.scandit.datacapture.barcode;

import android.widget.RelativeLayout;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Na {
    public final void a(DeviceOrientation orientation, RelativeLayout.LayoutParams params) {
        Intrinsics.h(orientation, "orientation");
        Intrinsics.h(params, "params");
        params.removeRule(11);
        params.removeRule(10);
        params.removeRule(21);
        params.removeRule(9);
        params.removeRule(12);
        int i = Ma.f17240a[orientation.ordinal()];
        if (i == 1 || i == 2) {
            params.addRule(11);
            params.addRule(10);
        } else if (i == 3) {
            params.addRule(9);
            params.addRule(10);
        } else {
            if (i != 4) {
                return;
            }
            params.addRule(11);
            params.addRule(12);
        }
    }
}
