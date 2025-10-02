package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeScroll extends Transition {
    public static final String[] I = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void R(TransitionValues transitionValues) {
        HashMap map = transitionValues.f3796a;
        map.put("android:changeScroll:x", Integer.valueOf(transitionValues.b.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(transitionValues.b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (transitionValues != null) {
            HashMap map = transitionValues.f3796a;
            if (transitionValues2 != null) {
                HashMap map2 = transitionValues2.f3796a;
                View view = transitionValues2.b;
                int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
                int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
                int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
                int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
                if (iIntValue != iIntValue2) {
                    view.setScrollX(iIntValue);
                    objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                } else {
                    objectAnimatorOfInt = null;
                }
                if (iIntValue3 != iIntValue4) {
                    view.setScrollY(iIntValue3);
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                }
                if (objectAnimatorOfInt == null) {
                    return objectAnimatorOfInt2;
                }
                if (objectAnimatorOfInt2 == null) {
                    return objectAnimatorOfInt;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                return animatorSet;
            }
        }
        return null;
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
