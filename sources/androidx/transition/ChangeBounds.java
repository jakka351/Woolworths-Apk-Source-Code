package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {
    public static final String[] J = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property K = new AnonymousClass1(PointF.class, "topLeft");
    public static final Property L = new AnonymousClass2(PointF.class, "bottomRight");
    public static final Property M = new AnonymousClass3(PointF.class, "bottomRight");
    public static final Property N = new AnonymousClass4(PointF.class, "topLeft");
    public static final Property O = new AnonymousClass5(PointF.class, "position");
    public static final RectEvaluator P = new RectEvaluator();
    public final boolean I;

    /* renamed from: androidx.transition.ChangeBounds$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f3779a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.b = iRound;
            int i = viewBounds2.f + 1;
            viewBounds2.f = i;
            if (i == viewBounds2.g) {
                ViewUtils.a(viewBounds2.e, viewBounds2.f3779a, iRound, viewBounds2.c, viewBounds2.d);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.d = iRound;
            int i = viewBounds2.g + 1;
            viewBounds2.g = i;
            if (viewBounds2.f == i) {
                ViewUtils.a(viewBounds2.e, viewBounds2.f3779a, viewBounds2.b, viewBounds2.c, iRound);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$4, reason: invalid class name */
    public class AnonymousClass4 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$5, reason: invalid class name */
    public class AnonymousClass5 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            ViewUtils.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View d;
        public final Rect e;
        public final boolean f;
        public final Rect g;
        public final boolean h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public boolean q;

        public ClipListener(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.d = view;
            this.e = rect;
            this.f = z;
            this.g = rect2;
            this.h = z2;
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
            this.m = i5;
            this.n = i6;
            this.o = i7;
            this.p = i8;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            View view = this.d;
            view.setTag(com.woolworths.R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.h ? null : this.g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            View view = this.d;
            Rect rect = (Rect) view.getTag(com.woolworths.R.id.transition_clip);
            view.setTag(com.woolworths.R.id.transition_clip, null);
            view.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.q = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (this.q) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.f) {
                    rect = this.e;
                }
            } else if (!this.h) {
                rect = this.g;
            }
            View view = this.d;
            view.setClipBounds(rect);
            if (z) {
                ViewUtils.a(view, this.i, this.j, this.k, this.l);
            } else {
                ViewUtils.a(view, this.m, this.n, this.o, this.p);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            int i = this.k;
            int i2 = this.i;
            int i3 = this.o;
            int i4 = this.m;
            int iMax = Math.max(i - i2, i3 - i4);
            int i5 = this.l;
            int i6 = this.j;
            int i7 = this.p;
            int i8 = this.n;
            int iMax2 = Math.max(i5 - i6, i7 - i8);
            if (z) {
                i2 = i4;
            }
            if (z) {
                i6 = i8;
            }
            View view = this.d;
            ViewUtils.a(view, i2, i6, iMax + i2, iMax2 + i6);
            view.setClipBounds(z ? this.g : this.e);
        }
    }

    public static class SuppressLayoutListener extends TransitionListenerAdapter {
        public boolean d = false;
        public final ViewGroup e;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.e = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void a() {
            ViewGroupUtils.a(this.e, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void d() {
            ViewGroupUtils.a(this.e, true);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
            if (!this.d) {
                ViewGroupUtils.a(this.e, false);
            }
            transition.D(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            ViewGroupUtils.a(this.e, false);
            this.d = true;
        }
    }

    public static class ViewBounds {

        /* renamed from: a, reason: collision with root package name */
        public int f3779a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public ViewBounds(View view) {
            this.e = view;
        }
    }

    public ChangeBounds() {
        this.I = false;
    }

    public final void R(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap map = transitionValues.f3796a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", transitionValues.b.getParent());
        if (this.I) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Rect rect;
        R(transitionValues);
        if (!this.I || (rect = (Rect) transitionValues.b.getTag(com.woolworths.R.id.transition_clip)) == null) {
            return;
        }
        transitionValues.f3796a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.transition.ChangeBounds, androidx.transition.Transition] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.animation.Animator[]] */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.animation.Animator, android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        int i4;
        ObjectAnimator objectAnimatorOfObject;
        int i5;
        Rect rect;
        ?? animatorSet;
        ObjectAnimator objectAnimatorOfObject2;
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.f3796a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap map2 = transitionValues2.f3796a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.b;
        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
        int i6 = rect2.left;
        int i7 = rect3.left;
        int i8 = rect2.top;
        int i9 = rect3.top;
        int i10 = rect2.right;
        int i11 = rect3.right;
        int i12 = rect2.bottom;
        int i13 = rect3.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i = 0;
        } else {
            i = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i18 = i;
        if (i18 <= 0) {
            return null;
        }
        boolean z = this.I;
        Property property = O;
        if (z) {
            ViewUtils.a(view, i6, i8, i6 + Math.max(i14, i16), i8 + Math.max(i15, i17));
            if (i6 == i7 && i8 == i9) {
                i2 = i12;
                i4 = i7;
                i3 = i11;
                objectAnimatorOfObject = null;
            } else {
                i2 = i12;
                i3 = i11;
                i4 = i7;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) property, (TypeConverter) null, this.A.a(i6, i8, i7, i9));
            }
            boolean z2 = rect4 == null;
            if (z2) {
                i5 = 0;
                rect = new Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
                rect = rect4;
            }
            int i19 = rect5 == null ? 1 : i5;
            Rect rect6 = i19 != 0 ? new Rect(i5, i5, i16, i17) : rect5;
            if (rect.equals(rect6)) {
                animatorSet = 0;
            } else {
                view.setClipBounds(rect);
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, "clipBounds", P, rect, rect6);
                ClipListener clipListener = new ClipListener(view, rect, z2, rect6, i19, i6, i8, i10, i2, i4, i9, i3, i13);
                objectAnimatorOfObject3.addListener(clipListener);
                a(clipListener);
                animatorSet = objectAnimatorOfObject3;
            }
            if (objectAnimatorOfObject == null) {
                objectAnimatorOfObject2 = animatorSet;
            } else if (animatorSet == 0) {
                objectAnimatorOfObject2 = objectAnimatorOfObject;
            } else {
                ?? animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{objectAnimatorOfObject, animatorSet});
                objectAnimatorOfObject2 = animatorSet2;
            }
        } else {
            ViewUtils.a(view, i6, i8, i10, i12);
            if (i18 != 2) {
                objectAnimatorOfObject2 = (i6 == i7 && i8 == i9) ? ObjectAnimator.ofObject(view, (Property<View, V>) M, (TypeConverter) null, this.A.a(i10, i12, i11, i13)) : ObjectAnimator.ofObject(view, (Property<View, V>) N, (TypeConverter) null, this.A.a(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, (Property<View, V>) property, (TypeConverter) null, this.A.a(i6, i8, i7, i9));
            } else {
                ViewBounds viewBounds = new ViewBounds(view);
                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(viewBounds, (Property<ViewBounds, V>) K, (TypeConverter) null, this.A.a(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorOfObject5 = ObjectAnimator.ofObject(viewBounds, (Property<ViewBounds, V>) L, (TypeConverter) null, this.A.a(i10, i12, i11, i13));
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject4, objectAnimatorOfObject5);
                animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                    private final ViewBounds mViewBounds;

                    {
                        this.mViewBounds = viewBounds;
                    }
                });
                objectAnimatorOfObject2 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.a(viewGroup4, true);
            q().a(new SuppressLayoutListener(viewGroup4));
        }
        return objectAnimatorOfObject2;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return J;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.b);
        boolean z = TypedArrayUtils.f((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.I = z;
    }
}
