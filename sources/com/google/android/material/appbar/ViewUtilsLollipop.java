package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RequiresApi
/* loaded from: classes6.dex */
class ViewUtilsLollipop {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14517a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(com.woolworths.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.woolworths.R.attr.state_liftable, -2130969919}, ObjectAnimator.ofFloat(appBarLayout, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", BitmapDescriptorFactory.HUE_RED).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
