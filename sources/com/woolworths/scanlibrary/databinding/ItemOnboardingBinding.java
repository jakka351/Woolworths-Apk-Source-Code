package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPageTemplateData;

/* loaded from: classes7.dex */
public abstract class ItemOnboardingBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public OnBoardingPageTemplateData D;
    public final AppCompatButton y;
    public final ImageView z;

    public ItemOnboardingBinding(DataBindingComponent dataBindingComponent, View view, AppCompatButton appCompatButton, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = appCompatButton;
        this.z = imageView;
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
    }

    public abstract void L(OnBoardingPageTemplateData onBoardingPageTemplateData);
}
