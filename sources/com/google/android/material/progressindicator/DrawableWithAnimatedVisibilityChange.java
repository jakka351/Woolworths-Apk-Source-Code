package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    public static final Property n = new AnonymousClass3(Float.class, "growFraction");
    public final Context d;
    public final BaseProgressIndicatorSpec e;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public ArrayList i;
    public boolean j;
    public float k;
    public int m;
    public final Paint l = new Paint();
    public AnimatorDurationScaleProvider f = new AnimatorDurationScaleProvider();

    /* renamed from: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<DrawableWithAnimatedVisibilityChange, Float> {
        @Override // android.util.Property
        public final Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.b());
        }

        @Override // android.util.Property
        public final void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = drawableWithAnimatedVisibilityChange;
            float fFloatValue = f.floatValue();
            if (drawableWithAnimatedVisibilityChange2.k != fFloatValue) {
                drawableWithAnimatedVisibilityChange2.k = fFloatValue;
                drawableWithAnimatedVisibilityChange2.invalidateSelf();
            }
        }
    }

    public DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.d = context;
        this.e = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    public final float b() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.e;
        if (baseProgressIndicatorSpec.e == 0 && baseProgressIndicatorSpec.f == 0) {
            return 1.0f;
        }
        return this.k;
    }

    public void c() {
        f(false, false, false);
    }

    public boolean d() {
        ObjectAnimator objectAnimator = this.h;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean e() {
        ObjectAnimator objectAnimator = this.g;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean f(boolean z, boolean z2, boolean z3) {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f;
        ContentResolver contentResolver = this.d.getContentResolver();
        animatorDurationScaleProvider.getClass();
        return g(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > BitmapDescriptorFactory.HUE_RED);
    }

    public boolean g(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.g;
        Property property = n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.g = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.g.setInterpolator(AnimationUtils.b);
            ObjectAnimator objectAnimator2 = this.g;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.g = objectAnimator2;
            objectAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    ArrayList arrayList = drawableWithAnimatedVisibilityChange.i;
                    if (arrayList == null || drawableWithAnimatedVisibilityChange.j) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Animatable2Compat.AnimationCallback) it.next()).b(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<DrawableWithAnimatedVisibilityChange, Float>) property, 1.0f, BitmapDescriptorFactory.HUE_RED);
            this.h = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.h.setInterpolator(AnimationUtils.b);
            ObjectAnimator objectAnimator3 = this.h;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.h = objectAnimator3;
            objectAnimator3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = DrawableWithAnimatedVisibilityChange.this;
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    ArrayList arrayList = drawableWithAnimatedVisibilityChange.i;
                    if (arrayList == null || drawableWithAnimatedVisibilityChange.j) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Animatable2Compat.AnimationCallback) it.next()).a(drawableWithAnimatedVisibilityChange);
                    }
                }
            });
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.g : this.h;
            ObjectAnimator objectAnimator5 = z ? this.h : this.g;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.j = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.j = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.e;
                if (!z ? baseProgressIndicatorSpec.f != 0 : baseProgressIndicatorSpec.e != 0) {
                    boolean z7 = this.j;
                    this.j = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.j = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.i;
        if (arrayList == null || !arrayList.contains(animationCallback)) {
            return false;
        }
        this.i.remove(animationCallback);
        if (!this.i.isEmpty()) {
            return true;
        }
        this.i = null;
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return e() || d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return f(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        g(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        g(false, true, false);
    }
}
