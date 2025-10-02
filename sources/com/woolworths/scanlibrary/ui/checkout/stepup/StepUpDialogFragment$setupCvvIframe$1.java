package com.woolworths.scanlibrary.ui.checkout.stepup;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$setupCvvIframe$1", "Landroid/view/View$OnTouchListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StepUpDialogFragment$setupCvvIframe$1 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return motionEvent != null && motionEvent.getAction() == 2;
    }
}
