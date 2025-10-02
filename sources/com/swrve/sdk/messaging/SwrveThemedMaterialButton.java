package com.swrve.sdk.messaging;

import android.graphics.Rect;
import com.google.android.material.button.MaterialButton;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveTextTemplating;
import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import java.util.Map;

/* loaded from: classes6.dex */
public class SwrveThemedMaterialButton extends MaterialButton {
    public SwrveButton t;
    public String u;

    public String getAction() {
        return this.u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            SwrveHelper.t(this, 1.0f, 1.2f);
        } else {
            SwrveHelper.t(this, 1.2f, 1.0f);
        }
    }

    public void setAction(Map<String, String> map) throws SwrveSDKTextTemplatingException {
        SwrveButton swrveButton = this.t;
        if (swrveButton == null) {
            return;
        }
        SwrveActionType swrveActionType = swrveButton.z;
        if ((swrveActionType == SwrveActionType.e || swrveActionType == SwrveActionType.g) && !SwrveHelper.p(swrveButton.x)) {
            this.u = SwrveTextTemplating.a(swrveButton.x, map);
        } else {
            this.u = swrveButton.x;
        }
    }
}
