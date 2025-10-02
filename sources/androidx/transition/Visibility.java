package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    public static final String[] J = {"android:visibility:visibility", "android:visibility:parent"};
    public int I;

    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View d;
        public final int e;
        public final ViewGroup f;
        public boolean h;
        public boolean i = false;
        public final boolean g = true;

        public DisappearListener(int i, View view) {
            this.d = view;
            this.e = i;
            this.f = (ViewGroup) view.getParent();
            c(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            c(false);
            if (this.i) {
                return;
            }
            ViewUtils.c(this.e, this.d);
        }

        public final void c(boolean z) {
            ViewGroup viewGroup;
            if (!this.g || this.h == z || (viewGroup = this.f) == null) {
                return;
            }
            this.h = z;
            ViewGroupUtils.a(viewGroup, z);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            c(true);
            if (this.i) {
                return;
            }
            ViewUtils.c(0, this.d);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
            transition.D(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.i = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.i) {
                ViewUtils.c(this.e, this.d);
                ViewGroup viewGroup = this.f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                ViewUtils.c(0, this.d);
                ViewGroup viewGroup = this.f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.i) {
                ViewUtils.c(this.e, this.d);
                ViewGroup viewGroup = this.f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }
    }

    @SuppressLint
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final ViewGroup d;
        public final View e;
        public final View f;
        public boolean g = true;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.d = viewGroup;
            this.e = view;
            this.f = view2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
        }

        public final void c() {
            this.f.setTag(com.woolworths.R.id.save_overlay_view, null);
            this.d.getOverlay().remove(this.e);
            this.g = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
            transition.D(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            if (this.g) {
                c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.d.getOverlay().remove(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.e;
            if (view.getParent() == null) {
                ViewCompat.a(view, this.d);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.f;
                View view2 = this.e;
                view.setTag(com.woolworths.R.id.save_overlay_view, view2);
                ViewCompat.a(view2, this.d);
                this.g = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            c();
        }
    }

    public static class VisibilityInfo {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3802a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public Visibility() {
        this.I = 3;
    }

    public static void R(TransitionValues transitionValues) {
        int visibility = transitionValues.b.getVisibility();
        HashMap map = transitionValues.f3796a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", transitionValues.b.getParent());
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.transition.Visibility.VisibilityInfo S(androidx.transition.TransitionValues r8, androidx.transition.TransitionValues r9) {
        /*
            androidx.transition.Visibility$VisibilityInfo r0 = new androidx.transition.Visibility$VisibilityInfo
            r0.<init>()
            r1 = 0
            r0.f3802a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f3796a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f3796a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.f3802a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.f3802a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.f3802a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.f3802a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.f3802a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.f3802a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.S(androidx.transition.TransitionValues, androidx.transition.TransitionValues):androidx.transition.Visibility$VisibilityInfo");
    }

    public Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public final void V(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.I = i;
    }

    @Override // androidx.transition.Transition
    public void d(TransitionValues transitionValues) {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void g(TransitionValues transitionValues) {
        R(transitionValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (S(p(r4, false), t(r4, false)).f3802a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, androidx.transition.TransitionValues r26, androidx.transition.TransitionValues r27) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.k(android.view.ViewGroup, androidx.transition.TransitionValues, androidx.transition.TransitionValues):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return J;
    }

    @Override // androidx.transition.Transition
    public final boolean w(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f3796a.containsKey("android:visibility:visibility") != transitionValues.f3796a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo visibilityInfoS = S(transitionValues, transitionValues2);
        if (visibilityInfoS.f3802a) {
            return visibilityInfoS.c == 0 || visibilityInfoS.d == 0;
        }
        return false;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.c);
        int iD = TypedArrayUtils.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != 0) {
            V(iD);
        }
    }
}
