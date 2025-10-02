package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;

/* loaded from: classes6.dex */
abstract class BaseMotionStrategy implements MotionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14577a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final AnimatorTracker d;
    public MotionSpec e;
    public MotionSpec f;

    public BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.b = extendedFloatingActionButton;
        this.f14577a = extendedFloatingActionButton.getContext();
        this.d = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet c() {
        MotionSpec motionSpec = this.f;
        if (motionSpec == null) {
            if (this.e == null) {
                this.e = MotionSpec.b(b(), this.f14577a);
            }
            motionSpec = this.e;
            motionSpec.getClass();
        }
        return g(motionSpec);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void d() {
        this.d.f14576a = null;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void f() {
        this.d.f14576a = null;
    }

    public final AnimatorSet g(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        boolean zG = motionSpec.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (zG) {
            arrayList.add(motionSpec.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (motionSpec.g("scale")) {
            arrayList.add(motionSpec.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(motionSpec.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (motionSpec.g("width")) {
            arrayList.add(motionSpec.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.I));
        }
        if (motionSpec.g("height")) {
            arrayList.add(motionSpec.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.J));
        }
        if (motionSpec.g("paddingStart")) {
            arrayList.add(motionSpec.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.K));
        }
        if (motionSpec.g("paddingEnd")) {
            arrayList.add(motionSpec.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.L));
        }
        if (motionSpec.g("labelOpacity")) {
            arrayList.add(motionSpec.d("labelOpacity", extendedFloatingActionButton, new Property<ExtendedFloatingActionButton, Float>() { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                @Override // android.util.Property
                public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton2) {
                    ExtendedFloatingActionButton extendedFloatingActionButton3 = extendedFloatingActionButton2;
                    return Float.valueOf(AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, 1.0f, (Color.alpha(extendedFloatingActionButton3.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton3.F.getColorForState(extendedFloatingActionButton3.getDrawableState(), BaseMotionStrategy.this.b.F.getDefaultColor()))));
                }

                @Override // android.util.Property
                public final void set(ExtendedFloatingActionButton extendedFloatingActionButton2, Float f) {
                    ExtendedFloatingActionButton extendedFloatingActionButton3 = extendedFloatingActionButton2;
                    Float f2 = f;
                    int colorForState = extendedFloatingActionButton3.F.getColorForState(extendedFloatingActionButton3.getDrawableState(), BaseMotionStrategy.this.b.F.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.a(BitmapDescriptorFactory.HUE_RED, Color.alpha(colorForState) / 255.0f, f2.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f2.floatValue() == 1.0f) {
                        extendedFloatingActionButton3.f(extendedFloatingActionButton3.F);
                    } else {
                        extendedFloatingActionButton3.f(colorStateListValueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(Animator animator) {
        AnimatorTracker animatorTracker = this.d;
        Animator animator2 = animatorTracker.f14576a;
        if (animator2 != null) {
            animator2.cancel();
        }
        animatorTracker.f14576a = animator;
    }
}
