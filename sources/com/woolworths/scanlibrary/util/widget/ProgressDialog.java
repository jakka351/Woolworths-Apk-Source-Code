package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes7.dex */
public class ProgressDialog extends LottieAnimationView {
    public ProgressDialog(Context context) {
        super(context);
        setSpeed(0.85f);
    }

    public ProgressDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSpeed(0.85f);
    }

    public ProgressDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSpeed(0.85f);
    }
}
