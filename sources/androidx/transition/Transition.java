package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] E = new Animator[0];
    public static final int[] F = {2, 1, 3, 4};
    public static final PathMotion G = new AnonymousClass1();
    public static final ThreadLocal H = new ThreadLocal();
    public PathMotion A;
    public long B;
    public SeekController C;
    public long D;
    public final String d;
    public long e;
    public long f;
    public TimeInterpolator g;
    public final ArrayList h;
    public final ArrayList i;
    public TransitionValuesMaps j;
    public TransitionValuesMaps k;
    public TransitionSet l;
    public final int[] m;
    public ArrayList n;
    public ArrayList o;
    public TransitionListener[] p;
    public final ArrayList q;
    public Animator[] r;
    public int s;
    public boolean t;
    public boolean u;
    public Transition v;
    public ArrayList w;
    public ArrayList x;
    public TransitionPropagation y;
    public EpicenterCallback z;

    /* renamed from: androidx.transition.Transition$1, reason: invalid class name */
    public class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class AnimationInfo {

        /* renamed from: a, reason: collision with root package name */
        public View f3792a;
        public String b;
        public TransitionValues c;
        public WindowId d;
        public Transition e;
        public Animator f;
    }

    public static class ArrayListManager {
    }

    public static abstract class EpicenterCallback {
        public abstract Rect a();
    }

    @RequiresApi
    public static class Impl26 {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MatchOrder {
    }

    @RequiresApi
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {
        public boolean e;
        public boolean f;
        public SpringAnimation h;
        public final VelocityTracker1D i;
        public Runnable j;
        public final /* synthetic */ TransitionSet k;
        public long d = -1;
        public int g = 0;

        public SeekController(TransitionSet transitionSet) {
            this.k = transitionSet;
            VelocityTracker1D velocityTracker1D = new VelocityTracker1D();
            long[] jArr = new long[20];
            velocityTracker1D.f3798a = jArr;
            velocityTracker1D.b = new float[20];
            velocityTracker1D.c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.i = velocityTracker1D;
        }

        @Override // androidx.transition.TransitionSeekController
        public final long c() {
            return this.k.B;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void e() {
            if (this.e) {
                m();
                this.h.c(this.k.B + 1);
            } else {
                this.g = 1;
                this.j = null;
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public final void h(long j) {
            if (this.h != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j2 = this.d;
            if (j == j2 || !this.e) {
                return;
            }
            if (!this.f) {
                TransitionSet transitionSet = this.k;
                if (j != 0 || j2 <= 0) {
                    long j3 = transitionSet.B;
                    if (j == j3 && j2 < j3) {
                        j = 1 + j3;
                    }
                } else {
                    j = -1;
                }
                if (j != j2) {
                    transitionSet.I(j, j2);
                    this.d = j;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            VelocityTracker1D velocityTracker1D = this.i;
            int i = (velocityTracker1D.c + 1) % 20;
            velocityTracker1D.c = i;
            velocityTracker1D.f3798a[i] = jCurrentAnimationTimeMillis;
            velocityTracker1D.b[i] = j;
        }

        @Override // androidx.transition.TransitionSeekController
        public final boolean isReady() {
            return this.e;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void j(Runnable runnable) {
            this.j = runnable;
            if (!this.e) {
                this.g = 2;
            } else {
                m();
                this.h.c(BitmapDescriptorFactory.HUE_RED);
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.f = true;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public final void l(float f) {
            TransitionSet transitionSet = this.k;
            long jMax = Math.max(-1L, Math.min(transitionSet.B + 1, Math.round(f)));
            transitionSet.I(jMax, this.d);
            this.d = jMax;
        }

        public final void m() {
            char c;
            float f;
            if (this.h != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.d;
            VelocityTracker1D velocityTracker1D = this.i;
            int i = velocityTracker1D.c;
            float[] fArr = velocityTracker1D.b;
            long[] jArr = velocityTracker1D.f3798a;
            char c2 = 20;
            int i2 = (i + 1) % 20;
            velocityTracker1D.c = i2;
            jArr[i2] = jCurrentAnimationTimeMillis;
            fArr[i2] = f2;
            FloatValueHolder floatValueHolder = new FloatValueHolder();
            float fSqrt = BitmapDescriptorFactory.HUE_RED;
            floatValueHolder.f2694a = BitmapDescriptorFactory.HUE_RED;
            SpringAnimation springAnimation = new SpringAnimation(floatValueHolder);
            springAnimation.t = null;
            springAnimation.u = Float.MAX_VALUE;
            int i3 = 0;
            springAnimation.v = false;
            this.h = springAnimation;
            SpringForce springForce = new SpringForce();
            springForce.a(1.0f);
            springForce.b(200.0f);
            SpringAnimation springAnimation2 = this.h;
            springAnimation2.t = springForce;
            springAnimation2.b = this.d;
            springAnimation2.c = true;
            ArrayList arrayList = springAnimation2.l;
            if (springAnimation2.f) {
                throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            SpringAnimation springAnimation3 = this.h;
            int i4 = velocityTracker1D.c;
            long j = Long.MIN_VALUE;
            if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
                long j2 = jArr[i4];
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i4];
                    if (j4 == j) {
                        break;
                    }
                    float f3 = j2 - j4;
                    float fAbs = Math.abs(j4 - j3);
                    if (f3 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    i4--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    j3 = j4;
                    j = Long.MIN_VALUE;
                }
                if (i3 >= 2) {
                    float f4 = 1000.0f;
                    if (i3 == 2) {
                        int i5 = velocityTracker1D.c;
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f5 = jArr[i5] - jArr[i6];
                        if (f5 != BitmapDescriptorFactory.HUE_RED) {
                            fSqrt = ((fArr[i5] - fArr[i6]) / f5) * 1000.0f;
                        }
                    } else {
                        int i7 = velocityTracker1D.c;
                        int i8 = ((i7 - i3) + 21) % 20;
                        int i9 = (i7 + 21) % 20;
                        long j5 = jArr[i8];
                        float f6 = fArr[i8];
                        int i10 = i8 + 1;
                        int i11 = i10 % 20;
                        float f7 = 0.0f;
                        while (i11 != i9) {
                            long j6 = jArr[i11];
                            float f8 = fSqrt;
                            int i12 = i9;
                            float f9 = j6 - j5;
                            if (f9 == f8) {
                                c = c2;
                                f = f4;
                            } else {
                                float f10 = fArr[i11];
                                c = c2;
                                f = f4;
                                float f11 = (f10 - f6) / f9;
                                float fAbs2 = (Math.abs(f11) * (f11 - ((float) (Math.sqrt(2.0f * Math.abs(f7)) * Math.signum(f7))))) + f7;
                                if (i11 == i10) {
                                    fAbs2 *= 0.5f;
                                }
                                f7 = fAbs2;
                                f6 = f10;
                                j5 = j6;
                            }
                            i11 = (i11 + 1) % 20;
                            fSqrt = f8;
                            i9 = i12;
                            c2 = c;
                            f4 = f;
                        }
                        fSqrt = ((float) (Math.sqrt(Math.abs(f7) * 2.0f) * Math.signum(f7))) * f4;
                    }
                }
            }
            springAnimation3.f2691a = fSqrt;
            SpringAnimation springAnimation4 = this.h;
            springAnimation4.g = this.k.B + 1;
            springAnimation4.h = -1.0f;
            springAnimation4.j = 4.0f;
            DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.a
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void a(float f12) {
                    Transition.SeekController seekController = this.f3804a;
                    TransitionSet transitionSet = seekController.k;
                    Transition.TransitionNotification transitionNotification = Transition.TransitionNotification.b;
                    if (f12 >= 1.0f) {
                        transitionSet.A(transitionSet, transitionNotification, false);
                        return;
                    }
                    long j7 = transitionSet.B;
                    Transition transitionS = transitionSet.S(0);
                    Transition transition = transitionS.v;
                    transitionS.v = null;
                    transitionSet.I(-1L, seekController.d);
                    transitionSet.I(j7, -1L);
                    seekController.d = j7;
                    Runnable runnable = seekController.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                    transitionSet.x.clear();
                    if (transition != null) {
                        transition.A(transition, transitionNotification, true);
                    }
                }
            };
            ArrayList arrayList2 = springAnimation4.k;
            if (arrayList2.contains(onAnimationEndListener)) {
                return;
            }
            arrayList2.add(onAnimationEndListener);
        }
    }

    public interface TransitionListener {
        void a();

        default void b(Transition transition) {
            g(transition);
        }

        void d();

        default void f(Transition transition) {
            i(transition);
        }

        void g(Transition transition);

        void i(Transition transition);

        void k(Transition transition);
    }

    public interface TransitionNotification {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3793a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.b] */
        static {
            final int i = 0;
            f3793a = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i2 = 1;
            b = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i2) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i3 = 2;
            c = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i3) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i4 = 3;
            d = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i4) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
            final int i5 = 4;
            e = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i5) {
                        case 0:
                            transitionListener.b(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.a();
                            break;
                        default:
                            transitionListener.d();
                            break;
                    }
                }
            };
        }

        void a(TransitionListener transitionListener, Transition transition, boolean z);
    }

    public Transition() {
        this.d = getClass().getName();
        this.e = -1L;
        this.f = -1L;
        this.g = null;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new TransitionValuesMaps();
        this.k = new TransitionValuesMaps();
        this.l = null;
        this.m = F;
        this.q = new ArrayList();
        this.r = E;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = new ArrayList();
        this.A = G;
    }

    public static void c(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        ArrayMap arrayMap = transitionValuesMaps.f3797a;
        ArrayMap arrayMap2 = transitionValuesMaps.d;
        SparseArray sparseArray = transitionValuesMaps.b;
        LongSparseArray longSparseArray = transitionValuesMaps.c;
        arrayMap.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strO = ViewCompat.o(view);
        if (strO != null) {
            if (arrayMap2.containsKey(strO)) {
                arrayMap2.put(strO, null);
            } else {
                arrayMap2.put(strO, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (longSparseArray.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) longSparseArray.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayMap r() {
        ThreadLocal threadLocal = H;
        ArrayMap arrayMap = (ArrayMap) threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    public static boolean z(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f3796a.get(str);
        Object obj2 = transitionValues2.f3796a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(Transition transition, TransitionNotification transitionNotification, boolean z) {
        Transition transition2 = this.v;
        if (transition2 != null) {
            transition2.A(transition, transitionNotification, z);
        }
        ArrayList arrayList = this.w;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.w.size();
        TransitionListener[] transitionListenerArr = this.p;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.p = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.w.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.a(transitionListenerArr2[i], transition, z);
            transitionListenerArr2[i] = null;
        }
        this.p = transitionListenerArr2;
    }

    public void B(View view) {
        if (this.u) {
            return;
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.r);
        this.r = E;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.r = animatorArr;
        A(this, TransitionNotification.d, false);
        this.t = true;
    }

    public void C() {
        ArrayMap arrayMapR = r();
        this.B = 0L;
        for (int i = 0; i < this.x.size(); i++) {
            Animator animator = (Animator) this.x.get(i);
            AnimationInfo animationInfo = (AnimationInfo) arrayMapR.get(animator);
            if (animator != null && animationInfo != null) {
                Animator animator2 = animationInfo.f;
                long j = this.f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.e;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.g;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.q.add(animator);
                this.B = Math.max(this.B, animator.getTotalDuration());
            }
        }
        this.x.clear();
    }

    public Transition D(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.v) != null) {
                transition.D(transitionListener);
            }
            if (this.w.size() == 0) {
                this.w = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.i.remove(view);
    }

    public void G(View view) {
        if (this.t) {
            if (!this.u) {
                ArrayList arrayList = this.q;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.r);
                this.r = E;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.r = animatorArr;
                A(this, TransitionNotification.e, false);
            }
            this.t = false;
        }
    }

    public void H() {
        P();
        final ArrayMap arrayMapR = r();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (arrayMapR.containsKey(animator)) {
                P();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            arrayMapR.remove(animator2);
                            Transition.this.q.remove(animator2);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator2) {
                            Transition.this.q.add(animator2);
                        }
                    });
                    long j = this.f;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.e;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            Transition.this.o();
                            animator2.removeListener(this);
                        }
                    });
                    animator.start();
                }
            }
        }
        this.x.clear();
        o();
    }

    public void I(long j, long j2) {
        long j3 = this.B;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.u = false;
            A(this, TransitionNotification.f3793a, z);
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.r);
        this.r = E;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.r = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.u = true;
        }
        A(this, TransitionNotification.b, z);
    }

    public void J(long j) {
        this.f = j;
    }

    public void K(EpicenterCallback epicenterCallback) {
        this.z = epicenterCallback;
    }

    public void L(TimeInterpolator timeInterpolator) {
        this.g = timeInterpolator;
    }

    public void M(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.A = G;
        } else {
            this.A = pathMotion;
        }
    }

    public void N(TransitionPropagation transitionPropagation) {
        this.y = transitionPropagation;
    }

    public void O(long j) {
        this.e = j;
    }

    public final void P() {
        if (this.s == 0) {
            A(this, TransitionNotification.f3793a, false);
            this.u = false;
        }
        this.s++;
    }

    public String Q(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f != -1) {
            sb.append("dur(");
            sb.append(this.f);
            sb.append(") ");
        }
        if (this.e != -1) {
            sb.append("dly(");
            sb.append(this.e);
            sb.append(") ");
        }
        if (this.g != null) {
            sb.append("interp(");
            sb.append(this.g);
            sb.append(") ");
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(TransitionListener transitionListener) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(transitionListener);
    }

    public void b(View view) {
        this.i.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.r);
        this.r = E;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.r = animatorArr;
        A(this, TransitionNotification.c, false);
    }

    public abstract void d(TransitionValues transitionValues);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues = new TransitionValues(view);
            if (z) {
                g(transitionValues);
            } else {
                d(transitionValues);
            }
            transitionValues.c.add(this);
            f(transitionValues);
            if (z) {
                c(this.j, view, transitionValues);
            } else {
                c(this.k, view, transitionValues);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(TransitionValues transitionValues) {
        HashMap map = transitionValues.f3796a;
        if (this.y == null || map.isEmpty()) {
            return;
        }
        this.y.getClass();
        for (int i = 0; i < 2; i++) {
            if (!map.containsKey(VisibilityPropagation.f3803a[i])) {
                this.y.a(transitionValues);
                return;
            }
        }
    }

    public abstract void g(TransitionValues transitionValues);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                if (z) {
                    g(transitionValues);
                } else {
                    d(transitionValues);
                }
                transitionValues.c.add(this);
                f(transitionValues);
                if (z) {
                    c(this.j, viewFindViewById, transitionValues);
                } else {
                    c(this.k, viewFindViewById, transitionValues);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                g(transitionValues2);
            } else {
                d(transitionValues2);
            }
            transitionValues2.c.add(this);
            f(transitionValues2);
            if (z) {
                c(this.j, view, transitionValues2);
            } else {
                c(this.k, view, transitionValues2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            this.j.f3797a.clear();
            this.j.b.clear();
            this.j.c.a();
        } else {
            this.k.f3797a.clear();
            this.k.b.clear();
            this.k.c.a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.x = new ArrayList();
            transition.j = new TransitionValuesMaps();
            transition.k = new TransitionValuesMaps();
            transition.n = null;
            transition.o = null;
            transition.C = null;
            transition.v = this;
            transition.w = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i;
        boolean z;
        int i2;
        View view;
        TransitionValues transitionValues;
        TransitionValues transitionValues2;
        ArrayMap arrayMapR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = q().C != null;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            TransitionValues transitionValues3 = (TransitionValues) arrayList.get(i3);
            TransitionValues transitionValues4 = (TransitionValues) arrayList2.get(i3);
            if (transitionValues3 != null && !transitionValues3.c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.c.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || w(transitionValues3, transitionValues4)) && (animatorK = k(viewGroup, transitionValues3, transitionValues4)) != null)) {
                String str = this.d;
                if (transitionValues4 != null) {
                    View view2 = transitionValues4.b;
                    i = size;
                    String[] strArrS = s();
                    z = z2;
                    if (strArrS != null && strArrS.length > 0) {
                        transitionValues2 = new TransitionValues(view2);
                        i2 = i3;
                        TransitionValues transitionValues5 = (TransitionValues) transitionValuesMaps2.f3797a.get(view2);
                        if (transitionValues5 != null) {
                            int i4 = 0;
                            while (i4 < strArrS.length) {
                                String str2 = strArrS[i4];
                                transitionValues2.f3796a.put(str2, transitionValues5.f3796a.get(str2));
                                i4++;
                                strArrS = strArrS;
                            }
                        }
                        int size2 = arrayMapR.getSize();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) arrayMapR.get((Animator) arrayMapR.keyAt(i5));
                            if (animationInfo.c != null && animationInfo.f3792a == view2 && animationInfo.b.equals(str) && animationInfo.c.equals(transitionValues2)) {
                                animatorK = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i2 = i3;
                        transitionValues2 = null;
                    }
                    view = view2;
                    transitionValues = transitionValues2;
                } else {
                    i = size;
                    z = z2;
                    i2 = i3;
                    view = transitionValues3.b;
                    transitionValues = null;
                }
                if (animatorK != null) {
                    TransitionPropagation transitionPropagation = this.y;
                    if (transitionPropagation != null) {
                        long jB = transitionPropagation.b(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.x.size(), (int) jB);
                        jMin = Math.min(jB, jMin);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    AnimationInfo animationInfo2 = new AnimationInfo();
                    animationInfo2.f3792a = view;
                    animationInfo2.b = str;
                    animationInfo2.c = transitionValues;
                    animationInfo2.d = windowId;
                    animationInfo2.e = this;
                    animationInfo2.f = animatorK;
                    if (z) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animatorK);
                        animatorK = animatorSet;
                    }
                    arrayMapR.put(animatorK, animationInfo2);
                    this.x.add(animatorK);
                }
            } else {
                i = size;
                z = z2;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                AnimationInfo animationInfo3 = (AnimationInfo) arrayMapR.get((Animator) this.x.get(sparseIntArray.keyAt(i6)));
                animationInfo3.f.setStartDelay(animationInfo3.f.getStartDelay() + (sparseIntArray.valueAt(i6) - jMin));
            }
        }
    }

    public final void o() {
        int i = this.s - 1;
        this.s = i;
        if (i == 0) {
            A(this, TransitionNotification.b, false);
            for (int i2 = 0; i2 < this.j.c.j(); i2++) {
                View view = (View) this.j.c.k(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.k.c.j(); i3++) {
                View view2 = (View) this.k.c.k(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.u = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (androidx.transition.TransitionValues) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.transition.TransitionValues p(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            androidx.transition.TransitionSet r0 = r4.l
            if (r0 == 0) goto L9
            androidx.transition.TransitionValues r5 = r0.p(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.n
            goto L10
        Le:
            java.util.ArrayList r0 = r4.o
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            androidx.transition.TransitionValues r3 = (androidx.transition.TransitionValues) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.o
            goto L35
        L33:
            java.util.ArrayList r5 = r4.n
        L35:
            java.lang.Object r5 = r5.get(r2)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.p(android.view.View, boolean):androidx.transition.TransitionValues");
    }

    public final Transition q() {
        TransitionSet transitionSet = this.l;
        return transitionSet != null ? transitionSet.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final TransitionValues t(View view, boolean z) {
        TransitionSet transitionSet = this.l;
        if (transitionSet != null) {
            return transitionSet.t(view, z);
        }
        return (TransitionValues) (z ? this.j : this.k).f3797a.get(view);
    }

    public final String toString() {
        return Q("");
    }

    public boolean u() {
        return !this.q.isEmpty();
    }

    public boolean v() {
        return this instanceof ChangeBounds;
    }

    public boolean w(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] strArrS = s();
            if (strArrS != null) {
                for (String str : strArrS) {
                    if (z(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.f3796a.keySet().iterator();
                while (it.hasNext()) {
                    if (z(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public Transition(Context context, AttributeSet attributeSet) {
        this.d = getClass().getName();
        this.e = -1L;
        this.f = -1L;
        this.g = null;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new TransitionValuesMaps();
        this.k = new TransitionValuesMaps();
        this.l = null;
        int[] iArr = F;
        this.m = iArr;
        this.q = new ArrayList();
        this.r = E;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = new ArrayList();
        this.A = G;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f3791a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jD = TypedArrayUtils.d(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jD >= 0) {
            J(jD);
        }
        long j = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            O(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            L(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strE = TypedArrayUtils.e(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strE != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strE, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(YU.a.h("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.m = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 < 1 || i3 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.m = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
