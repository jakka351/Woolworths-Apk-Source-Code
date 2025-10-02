package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.woolworths.scanlibrary.util.widget.DotIndicatorView;

/* loaded from: classes7.dex */
public abstract class ActivityOnBoardingBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ViewPager2 B;
    public final ImageView y;
    public final DotIndicatorView z;

    public ActivityOnBoardingBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, DotIndicatorView dotIndicatorView, ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = dotIndicatorView;
        this.A = constraintLayout;
        this.B = viewPager2;
    }
}
