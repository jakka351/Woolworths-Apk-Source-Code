package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a, reason: collision with root package name */
    public Impl f2495a;

    public static abstract class Callback {
        public WindowInsetsCompat d;
        public final int e;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes2.dex */
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.e = i;
        }

        public void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list);

        public BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            return boundsCompat;
        }
    }

    public static class Impl {

        /* renamed from: a, reason: collision with root package name */
        public final int f2497a;
        public float b;
        public final Interpolator c;
        public final long d;

        public Impl(int i, Interpolator interpolator, long j) {
            this.f2497a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int d() {
            return this.f2497a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl21 extends Impl {
        public static final PathInterpolator e = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 1.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        public static final FastOutLinearInInterpolator f = new FastOutLinearInInterpolator();
        public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
        public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

        @RequiresApi
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f2498a;
            public WindowInsetsCompat b;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                this.f2498a = callback;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                WindowInsetsCompat windowInsetsCompatA = ViewCompat.Api23Impl.a(view);
                this.b = windowInsetsCompatA != null ? new WindowInsetsCompat.Builder(windowInsetsCompatA).f2501a.b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                int[] iArr;
                boolean z;
                if (!view.isLaidOut()) {
                    this.b = WindowInsetsCompat.s(view, windowInsets);
                    return Impl21.j(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(view, windowInsets);
                WindowInsetsCompat.Impl impl = windowInsetsCompatS.f2500a;
                if (this.b == null) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    this.b = ViewCompat.Api23Impl.a(view);
                }
                if (this.b == null) {
                    this.b = windowInsetsCompatS;
                    return Impl21.j(view, windowInsets);
                }
                Callback callbackK = Impl21.k(view);
                if (callbackK != null && Objects.equals(callbackK.d, windowInsetsCompatS)) {
                    return Impl21.j(view, windowInsets);
                }
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                WindowInsetsCompat windowInsetsCompat = this.b;
                int i = 1;
                while (i <= 512) {
                    Insets insetsG = impl.g(i);
                    Insets insetsG2 = windowInsetsCompat.f2500a.g(i);
                    int i2 = insetsG.f2430a;
                    int i3 = insetsG.d;
                    int i4 = insetsG.c;
                    int i5 = insetsG.b;
                    int i6 = insetsG2.f2430a;
                    int i7 = insetsG2.d;
                    int i8 = insetsG2.c;
                    int i9 = insetsG2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr2;
                        z = true;
                    } else {
                        iArr = iArr2;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr[0] = iArr[0] | i;
                        } else {
                            iArr3[0] = iArr3[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                final int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = windowInsetsCompatS;
                    return Impl21.j(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat2 = this.b;
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i12, (i10 & 8) != 0 ? Impl21.e : (i11 & 8) != 0 ? Impl21.f : (i10 & 519) != 0 ? Impl21.g : (i11 & 519) != 0 ? Impl21.h : null, (i12 & 8) != 0 ? 160L : 250L);
                windowInsetsAnimationCompat.f2495a.e(BitmapDescriptorFactory.HUE_RED);
                final ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(windowInsetsAnimationCompat.f2495a.b());
                Insets insetsG3 = impl.g(i12);
                Insets insetsG4 = windowInsetsCompat2.f2500a.g(i12);
                int iMin = Math.min(insetsG3.f2430a, insetsG4.f2430a);
                int i13 = insetsG3.b;
                int i14 = insetsG4.b;
                int iMin2 = Math.min(i13, i14);
                int i15 = insetsG3.c;
                int i16 = insetsG4.c;
                int iMin3 = Math.min(i15, i16);
                int i17 = insetsG3.d;
                int i18 = insetsG4.d;
                final BoundsCompat boundsCompat = new BoundsCompat(Insets.c(iMin, iMin2, iMin3, Math.min(i17, i18)), Insets.c(Math.max(insetsG3.f2430a, insetsG4.f2430a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                Impl21.g(view, windowInsetsAnimationCompat, windowInsetsCompatS, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        Impl impl2 = windowInsetsAnimationCompat2.f2495a;
                        impl2.e(animatedFraction);
                        WindowInsetsCompat windowInsetsCompat3 = windowInsetsCompatS;
                        WindowInsetsCompat.Impl impl3 = windowInsetsCompat3.f2500a;
                        float fC = impl2.c();
                        PathInterpolator pathInterpolator = Impl21.e;
                        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat3);
                        int i19 = 1;
                        while (true) {
                            WindowInsetsCompat.BuilderImpl builderImpl = builder.f2501a;
                            if (i19 > 512) {
                                Impl21.h(view, builderImpl.b(), Collections.singletonList(windowInsetsAnimationCompat2));
                                return;
                            }
                            if ((i12 & i19) == 0) {
                                builderImpl.c(i19, impl3.g(i19));
                            } else {
                                Insets insetsG5 = impl3.g(i19);
                                Insets insetsG6 = windowInsetsCompat2.f2500a.g(i19);
                                float f = 1.0f - fC;
                                builderImpl.c(i19, WindowInsetsCompat.o(insetsG5, (int) (((insetsG5.f2430a - insetsG6.f2430a) * f) + 0.5d), (int) (((insetsG5.b - insetsG6.b) * f) + 0.5d), (int) (((insetsG5.c - insetsG6.c) * f) + 0.5d), (int) (((insetsG5.d - insetsG6.d) * f) + 0.5d)));
                            }
                            i19 <<= 1;
                        }
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        windowInsetsAnimationCompat2.f2495a.e(1.0f);
                        Impl21.f(view, windowInsetsAnimationCompat2);
                    }
                });
                OneShotPreDrawListener.a(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Impl21.i(view, windowInsetsAnimationCompat, boundsCompat);
                        duration.start();
                    }
                });
                this.b = windowInsetsCompatS;
                return Impl21.j(view, windowInsets);
            }
        }

        public Impl21(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static void f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackK = k(view);
            if (callbackK != null) {
                callbackK.a(windowInsetsAnimationCompat);
                if (callbackK.e == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        public static void g(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, boolean z) {
            Callback callbackK = k(view);
            if (callbackK != null) {
                callbackK.d = windowInsetsCompat;
                if (!z) {
                    callbackK.b(windowInsetsAnimationCompat);
                    z = callbackK.e == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsetsCompat, z);
                }
            }
        }

        public static void h(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackK = k(view);
            if (callbackK != null) {
                windowInsetsCompat = callbackK.c(windowInsetsCompat, list);
                if (callbackK.e == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        public static void i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackK = k(view);
            if (callbackK != null) {
                callbackK.d(windowInsetsAnimationCompat, boundsCompat);
                if (callbackK.e == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static WindowInsets j(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).f2498a;
            }
            return null;
        }

        public static void l(View view, Callback callback) {
            View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = callback != null ? new Impl21OnApplyWindowInsetsListener(view, callback) : null;
            view.setTag(R.id.tag_window_insets_animation_callback, impl21OnApplyWindowInsetsListener);
            if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                view.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
            }
        }
    }

    @RequiresApi
    public static class Impl30 extends Impl {
        public final WindowInsetsAnimation e;

        @RequiresApi
        public static class ProxyCallback extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f2499a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public ProxyCallback(Callback callback) {
                super(callback.e);
                this.d = new HashMap();
                this.f2499a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.f2495a = new Impl30(windowInsetsAnimation);
                    }
                    this.d.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2499a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2499a.b(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationK = h.k(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationK);
                    windowInsetsAnimationCompatA.f2495a.e(windowInsetsAnimationK.getFraction());
                    this.c.add(windowInsetsAnimationCompatA);
                }
                return this.f2499a.c(WindowInsetsCompat.s(null, windowInsets), this.b).r();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f2499a.d(a(windowInsetsAnimation), BoundsCompat.b(bounds)).a();
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final float a() {
            return this.e.getAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final long b() {
            return this.e.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final float c() {
            return this.e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final int d() {
            return this.e.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final void e(float f) {
            this.e.setFraction(f);
        }
    }

    public WindowInsetsAnimationCompat(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2495a = new Impl30(h.j(i, interpolator, j));
        } else {
            this.f2495a = new Impl21(i, interpolator, j);
        }
    }

    public final float a() {
        return this.f2495a.a();
    }

    public final long b() {
        return this.f2495a.b();
    }

    public final float c() {
        return this.f2495a.c();
    }

    public final int d() {
        return this.f2495a.d();
    }

    /* loaded from: classes2.dex */
    public static final class BoundsCompat {

        /* renamed from: a, reason: collision with root package name */
        public final Insets f2496a;
        public final Insets b;

        public BoundsCompat(Insets insets, Insets insets2) {
            this.f2496a = insets;
            this.b = insets2;
        }

        public static BoundsCompat b(WindowInsetsAnimation.Bounds bounds) {
            return new BoundsCompat(bounds);
        }

        public final WindowInsetsAnimation.Bounds a() {
            androidx.camera.camera2.internal.a.l();
            return h.i(this.f2496a.e(), this.b.e());
        }

        public final String toString() {
            return "Bounds{lower=" + this.f2496a + " upper=" + this.b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.f2496a = Insets.d(bounds.getLowerBound());
            this.b = Insets.d(bounds.getUpperBound());
        }
    }
}
