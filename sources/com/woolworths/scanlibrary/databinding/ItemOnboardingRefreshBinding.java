package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData;

/* loaded from: classes7.dex */
public abstract class ItemOnboardingRefreshBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final ImageView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final TextView D;
    public OnBoardingPageTemplateData E;
    public final Button y;
    public final ImageView z;

    public ItemOnboardingRefreshBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = imageView;
        this.A = imageView2;
        this.B = constraintLayout;
        this.C = textView;
        this.D = textView2;
    }

    public abstract void L(OnBoardingPageTemplateData onBoardingPageTemplateData);
}
