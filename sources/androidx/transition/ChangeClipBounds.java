package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] I = {"android:clipBounds:clip"};
    public static final Rect J = new Rect();

    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Rect d;
        public final Rect e;
        public final View f;

        public Listener(View view, Rect rect, Rect rect2) {
            this.f = view;
            this.d = rect;
            this.e = rect2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            View view = this.f;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.J;
            }
            view.setTag(com.woolworths.R.id.transition_clip, clipBounds);
            view.setClipBounds(this.e);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            View view = this.f;
            view.setClipBounds((Rect) view.getTag(com.woolworths.R.id.transition_clip));
            view.setTag(com.woolworths.R.id.transition_clip, null);
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
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            View view = this.f;
            if (z) {
                view.setClipBounds(this.d);
            } else {
                view.setClipBounds(this.e);
            }
        }
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void R(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.b;
        HashMap map = transitionValues.f3796a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(com.woolworths.R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != J ? clipBounds : null;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        R(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        R(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.f3796a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap map2 = transitionValues2.f3796a;
        if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.b.setClipBounds(rect);
        Rect rect5 = new Rect();
        RectEvaluator rectEvaluator = new RectEvaluator();
        rectEvaluator.f3790a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.b, (Property<View, V>) ViewUtils.c, rectEvaluator, rect3, rect4);
        Listener listener = new Listener(transitionValues2.b, rect, rect2);
        objectAnimatorOfObject.addListener(listener);
        a(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return I;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
