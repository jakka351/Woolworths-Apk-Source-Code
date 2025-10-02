package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.woolworths.R;
import java.util.ArrayList;

@RequiresApi
/* loaded from: classes6.dex */
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {
    public StateListAnimator O;

    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final MaterialShapeDrawable e() {
        ShapeAppearanceModel shapeAppearanceModel = this.f14588a;
        shapeAppearanceModel.getClass();
        return new AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final float f() {
        return this.w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void g(Rect rect) {
        if (FloatingActionButton.this.n) {
            super.g(rect);
            return;
        }
        if (this.f) {
            FloatingActionButton floatingActionButton = this.w;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.k;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void h(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableE = e();
        this.b = materialShapeDrawableE;
        materialShapeDrawableE.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        MaterialShapeDrawable materialShapeDrawable = this.b;
        FloatingActionButton floatingActionButton = this.w;
        materialShapeDrawable.k(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            ShapeAppearanceModel shapeAppearanceModel = this.f14588a;
            shapeAppearanceModel.getClass();
            BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel);
            int color = context.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R.color.design_fab_stroke_end_outer_color);
            borderDrawable.i = color;
            borderDrawable.j = color2;
            borderDrawable.k = color3;
            borderDrawable.l = color4;
            float f = i;
            if (borderDrawable.h != f) {
                borderDrawable.h = f;
                borderDrawable.b.setStrokeWidth(f * 1.3333f);
                borderDrawable.n = true;
                borderDrawable.invalidateSelf();
            }
            if (colorStateList != null) {
                borderDrawable.m = colorStateList.getColorForState(borderDrawable.getState(), borderDrawable.m);
            }
            borderDrawable.p = colorStateList;
            borderDrawable.n = true;
            borderDrawable.invalidateSelf();
            this.d = borderDrawable;
            BorderDrawable borderDrawable2 = this.d;
            borderDrawable2.getClass();
            MaterialShapeDrawable materialShapeDrawable2 = this.b;
            materialShapeDrawable2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{borderDrawable2, materialShapeDrawable2});
        } else {
            this.d = null;
            layerDrawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.c(colorStateList2), layerDrawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void i() {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void j() {
        r();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void k(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void l(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.w;
        if (floatingActionButton.getStateListAnimator() == this.O) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(FloatingActionButtonImpl.I, s(f, f3));
            stateListAnimator.addState(FloatingActionButtonImpl.J, s(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.K, s(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.L, s(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(FloatingActionButtonImpl.D);
            stateListAnimator.addState(FloatingActionButtonImpl.M, animatorSet);
            stateListAnimator.addState(FloatingActionButtonImpl.N, s(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
            this.O = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (p()) {
            r();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void n(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.c(colorStateList));
        } else {
            super.n(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final boolean p() {
        if (FloatingActionButton.this.n) {
            return true;
        }
        return this.f && this.w.getSizeDimension() < this.k;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void q() {
    }

    public final AnimatorSet s(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.w;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(FloatingActionButtonImpl.D);
        return animatorSet;
    }
}
