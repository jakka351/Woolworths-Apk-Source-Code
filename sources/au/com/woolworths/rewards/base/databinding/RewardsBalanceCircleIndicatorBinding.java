package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;

/* loaded from: classes4.dex */
public abstract class RewardsBalanceCircleIndicatorBinding extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;
    public final TextView A;
    public final ImageView B;
    public RewardsPointsBalance C;
    public final ContentLoadingProgressBar y;
    public final TextView z;

    public RewardsBalanceCircleIndicatorBinding(DataBindingComponent dataBindingComponent, View view, ContentLoadingProgressBar contentLoadingProgressBar, TextView textView, TextView textView2, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = contentLoadingProgressBar;
        this.z = textView;
        this.A = textView2;
        this.B = imageView;
    }

    public abstract void L(RewardsPointsBalance rewardsPointsBalance);
}
