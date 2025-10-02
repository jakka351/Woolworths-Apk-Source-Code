package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* loaded from: classes2.dex */
class FragmentAnim {
    public static int a(int i, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class AnimationOrAnimator {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f2743a;
        public final AnimatorSet b;

        public AnimationOrAnimator(Animation animation) {
            this.f2743a = animation;
            this.b = null;
        }

        public AnimationOrAnimator(Animator animator) {
            this.f2743a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
        }
    }

    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        public final ViewGroup d;
        public final View e;
        public boolean f;
        public boolean g;
        public boolean h;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.h = true;
            this.d = viewGroup;
            this.e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f = true;
                OneShotPreDrawListener.a(this.d, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.f;
            ViewGroup viewGroup = this.d;
            if (z || !this.h) {
                viewGroup.endViewTransition(this.e);
                this.g = true;
            } else {
                this.h = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.h = true;
            if (this.f) {
                return !this.g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f = true;
                OneShotPreDrawListener.a(this.d, this);
            }
            return true;
        }
    }
}
