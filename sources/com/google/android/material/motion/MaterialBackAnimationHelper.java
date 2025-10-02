package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.BackEventCompat;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes6.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f14611a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public BackEventCompat f;

    public MaterialBackAnimationHelper(View view) {
        this.b = view;
        Context context = view.getContext();
        this.f14611a = MotionUtils.d(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f));
        this.c = MotionUtils.c(context, R.attr.motionDurationMedium2, nlnlnnn.xxx00780078x0078);
        this.d = MotionUtils.c(context, R.attr.motionDurationShort3, 150);
        this.e = MotionUtils.c(context, R.attr.motionDurationShort2, 100);
    }

    public final BackEventCompat a() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f;
        this.f = null;
        return backEventCompat;
    }
}
