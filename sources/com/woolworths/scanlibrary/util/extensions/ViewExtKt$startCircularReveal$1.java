package com.woolworths.scanlibrary.util.extensions;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/woolworths/scanlibrary/util/extensions/ViewExtKt$startCircularReveal$1", "Landroid/view/View$OnLayoutChangeListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewExtKt$startCircularReveal$1 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.h(v, "v");
        v.removeOnLayoutChangeListener(this);
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(v, v.getRight(), v.getBottom(), BitmapDescriptorFactory.HUE_RED, (int) Math.hypot(i3, i4));
        animatorCreateCircularReveal.setInterpolator(new DecelerateInterpolator(2.0f));
        animatorCreateCircularReveal.setDuration(350L);
        animatorCreateCircularReveal.start();
    }
}
