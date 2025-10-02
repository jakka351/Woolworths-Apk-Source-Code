package com.swrve.sdk.messaging;

import android.graphics.Rect;
import com.google.android.material.button.MaterialButton;
import com.swrve.sdk.SwrveHelper;

/* loaded from: classes6.dex */
public class SwrveInAppStoryButton extends MaterialButton {
    public static final /* synthetic */ int t = 0;

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            SwrveHelper.t(this, 1.0f, 1.2f);
        } else {
            SwrveHelper.t(this, 1.2f, 1.0f);
        }
    }
}
