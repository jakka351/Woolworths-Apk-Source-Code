package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class Fade extends Visibility {

    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View d;
        public boolean e = false;

        public FadeAnimatorListener(View view) {
            this.d = view;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            View view = this.d;
            view.setTag(com.woolworths.R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? ViewUtils.f3800a.a(view) : BitmapDescriptorFactory.HUE_RED));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            this.d.setTag(com.woolworths.R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewUtils.b(this.d, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.d;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.e = true;
                view.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.e;
            View view = this.d;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            ViewUtils.b(view, 1.0f);
            ViewUtils.f3800a.getClass();
        }
    }

    public Fade(int i) {
        V(i);
    }

    public static float X(TransitionValues transitionValues, float f) {
        Float f2;
        return (transitionValues == null || (f2 = (Float) transitionValues.f3796a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility
    public final Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.f3800a.getClass();
        return W(view, X(transitionValues, BitmapDescriptorFactory.HUE_RED), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.f3800a.getClass();
        ObjectAnimator objectAnimatorW = W(view, X(transitionValues, 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (objectAnimatorW == null) {
            ViewUtils.b(view, X(transitionValues2, 1.0f));
        }
        return objectAnimatorW;
    }

    public final ObjectAnimator W(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ViewUtils.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.b, f2);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        objectAnimatorOfFloat.addListener(fadeAnimatorListener);
        q().a(fadeAnimatorListener);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.R(transitionValues);
        Float fValueOf = (Float) transitionValues.b.getTag(com.woolworths.R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (transitionValues.b.getVisibility() == 0) {
                fValueOf = Float.valueOf(ViewUtils.f3800a.a(transitionValues.b));
            } else {
                fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }
        }
        transitionValues.f3796a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.d);
        V(TypedArrayUtils.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.I));
        typedArrayObtainStyledAttributes.recycle();
    }
}
