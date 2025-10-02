package au.com.woolworths.android.onesite.modules.customviews.loadingdialog;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public class ProgressDialogView extends LottieAnimationView {
    public ProgressDialogView(Context context) {
        super(context);
        setSpeed(0.85f);
    }

    public ProgressDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSpeed(0.85f);
    }

    public ProgressDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSpeed(0.85f);
    }
}
