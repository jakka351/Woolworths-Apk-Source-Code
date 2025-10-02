package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;

/* loaded from: classes2.dex */
class TranslationAnimationCreator {
    public static ObjectAnimator a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Visibility visibility) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.b.getTag(com.woolworths.R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.b, translationX, translationY);
        visibility.a(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View d;
        public final View e;
        public int[] f;
        public float g;
        public float h;
        public final float i;
        public final float j;
        public boolean k;

        public TransitionPositionListener(View view, View view2, float f, float f2) {
            this.e = view;
            this.d = view2;
            this.i = f;
            this.j = f2;
            int[] iArr = (int[]) view2.getTag(com.woolworths.R.id.transition_position);
            this.f = iArr;
            if (iArr != null) {
                view2.setTag(com.woolworths.R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            if (this.f == null) {
                this.f = new int[2];
            }
            int[] iArr = this.f;
            View view = this.e;
            view.getLocationOnScreen(iArr);
            this.d.setTag(com.woolworths.R.id.transition_position, this.f);
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
            view.setTranslationX(this.i);
            view.setTranslationY(this.j);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            float f = this.g;
            View view = this.e;
            view.setTranslationX(f);
            view.setTranslationY(this.h);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            if (this.k) {
                return;
            }
            this.d.setTag(com.woolworths.R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
            f(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.k = true;
            float f = this.i;
            View view = this.e;
            view.setTranslationX(f);
            view.setTranslationY(this.j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.k = true;
            float f = this.i;
            View view = this.e;
            view.setTranslationX(f);
            view.setTranslationY(this.j);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            float f = this.i;
            View view = this.e;
            view.setTranslationX(f);
            view.setTranslationY(this.j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
