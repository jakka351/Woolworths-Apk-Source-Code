package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.l;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat b;

    /* renamed from: a, reason: collision with root package name */
    public final Impl f2500a;

    @RequiresApi
    @SuppressLint
    /* loaded from: classes2.dex */
    public static class Api21ReflectionHolder {
        static {
            try {
                View.class.getDeclaredField("mAttachInfo").setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                cls.getDeclaredField("mStableInsets").setAccessible(true);
                cls.getDeclaredField("mContentInsets").setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class BuilderImpl {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2502a;
        public Insets[] b;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            Insets[] insetsArr = this.b;
            if (insetsArr != null) {
                Insets insetsG = insetsArr[0];
                Insets insetsG2 = insetsArr[1];
                WindowInsetsCompat windowInsetsCompat = this.f2502a;
                if (insetsG2 == null) {
                    insetsG2 = windowInsetsCompat.f2500a.g(2);
                }
                if (insetsG == null) {
                    insetsG = windowInsetsCompat.f2500a.g(1);
                }
                g(Insets.a(insetsG, insetsG2));
                Insets insets = this.b[Type.a(16)];
                if (insets != null) {
                    f(insets);
                }
                Insets insets2 = this.b[Type.a(32)];
                if (insets2 != null) {
                    d(insets2);
                }
                Insets insets3 = this.b[Type.a(64)];
                if (insets3 != null) {
                    h(insets3);
                }
            }
        }

        public WindowInsetsCompat b() {
            a();
            return this.f2502a;
        }

        public void c(int i, Insets insets) {
            if (this.b == null) {
                this.b = new Insets[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[Type.a(i2)] = insets;
                }
            }
        }

        public void d(Insets insets) {
        }

        public void e(Insets insets) {
        }

        public void f(Insets insets) {
        }

        public void g(Insets insets) {
        }

        public void h(Insets insets) {
        }

        public BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.f2502a = windowInsetsCompat;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void c(int i, Insets insets) {
            this.c.setInsets(TypeImpl30.a(i), insets.e());
        }

        public BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BuilderImpl34 extends BuilderImpl30 {
        public BuilderImpl34() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void c(int i, Insets insets) {
            this.c.setInsets(TypeImpl34.a(i), insets.e());
        }

        public BuilderImpl34(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* loaded from: classes2.dex */
    public static class Impl {
        public static final WindowInsetsCompat b = new Builder().f2501a.b().f2500a.a().f2500a.b().f2500a.c();

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2503a;

        public Impl(WindowInsetsCompat windowInsetsCompat) {
            this.f2503a = windowInsetsCompat;
        }

        public WindowInsetsCompat a() {
            return this.f2503a;
        }

        public WindowInsetsCompat b() {
            return this.f2503a;
        }

        public WindowInsetsCompat c() {
            return this.f2503a;
        }

        public void d(View view) {
        }

        public void e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return p() == impl.p() && o() == impl.o() && Objects.equals(l(), impl.l()) && Objects.equals(j(), impl.j()) && Objects.equals(f(), impl.f());
        }

        public DisplayCutoutCompat f() {
            return null;
        }

        public Insets g(int i) {
            return Insets.e;
        }

        public Insets h(int i) {
            if ((i & 8) == 0) {
                return Insets.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public Insets i() {
            return l();
        }

        public Insets j() {
            return Insets.e;
        }

        public Insets k() {
            return l();
        }

        public Insets l() {
            return Insets.e;
        }

        public Insets m() {
            return l();
        }

        public WindowInsetsCompat n(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void r(Insets[] insetsArr) {
        }

        public void s(Insets insets) {
        }

        public void t(WindowInsetsCompat windowInsetsCompat) {
        }

        public void u(Insets insets) {
        }

        public void v(int i) {
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl28 extends Impl21 {
        public Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.s(null, this.c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.c, impl28.c) && Objects.equals(this.g, impl28.g) && Impl20.C(this.h, impl28.h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public DisplayCutoutCompat f() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.c.hashCode();
        }

        public Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl30 extends Impl29 {
        public static final WindowInsetsCompat r = WindowInsetsCompat.s(null, WindowInsets.CONSUMED);

        public Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets g(int i) {
            return Insets.d(this.c.getInsets(TypeImpl30.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets h(int i) {
            return Insets.d(this.c.getInsetsIgnoringVisibility(TypeImpl30.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean q(int i) {
            return this.c.isVisible(TypeImpl30.a(i));
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl34 extends Impl30 {
        public static final WindowInsetsCompat s = WindowInsetsCompat.s(null, WindowInsets.CONSUMED);

        public Impl34(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets g(int i) {
            return Insets.d(this.c.getInsets(TypeImpl34.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets h(int i) {
            return Insets.d(this.c.getInsetsIgnoringVisibility(TypeImpl34.a(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean q(int i) {
            return this.c.isVisible(TypeImpl34.a(i));
        }

        public Impl34(WindowInsetsCompat windowInsetsCompat, Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Side {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface InsetsSide {
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes2.dex */
        public @interface InsetsType {
        }

        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new IllegalArgumentException(YU.a.d(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class TypeImpl30 {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class TypeImpl34 {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = Impl34.s;
        } else if (i >= 30) {
            b = Impl30.r;
        } else {
            b = Impl.b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f2500a = new Impl34(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f2500a = new Impl30(this, windowInsets);
        } else if (i >= 29) {
            this.f2500a = new Impl29(this, windowInsets);
        } else {
            this.f2500a = new Impl28(this, windowInsets);
        }
    }

    public static Insets o(Insets insets, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, insets.f2430a - i);
        int iMax2 = Math.max(0, insets.b - i2);
        int iMax3 = Math.max(0, insets.c - i3);
        int iMax4 = Math.max(0, insets.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? insets : Insets.c(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat s(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            WindowInsetsCompat windowInsetsCompatA = ViewCompat.Api23Impl.a(view);
            Impl impl = windowInsetsCompat.f2500a;
            impl.t(windowInsetsCompatA);
            impl.d(view.getRootView());
            impl.v(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    public final WindowInsetsCompat a() {
        return this.f2500a.a();
    }

    public final WindowInsetsCompat b() {
        return this.f2500a.b();
    }

    public final WindowInsetsCompat c() {
        return this.f2500a.c();
    }

    public final DisplayCutoutCompat d() {
        return this.f2500a.f();
    }

    public final Insets e(int i) {
        return this.f2500a.g(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.f2500a, ((WindowInsetsCompat) obj).f2500a);
        }
        return false;
    }

    public final Insets f(int i) {
        return this.f2500a.h(i);
    }

    public final Insets g() {
        return this.f2500a.k();
    }

    public final int h() {
        return this.f2500a.l().d;
    }

    public final int hashCode() {
        Impl impl = this.f2500a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public final int i() {
        return this.f2500a.l().f2430a;
    }

    public final int j() {
        return this.f2500a.l().c;
    }

    public final int k() {
        return this.f2500a.l().b;
    }

    public final boolean l() {
        Impl impl = this.f2500a;
        Insets insetsG = impl.g(-1);
        Insets insets = Insets.e;
        return (insetsG.equals(insets) && impl.h(-9).equals(insets) && impl.f() == null) ? false : true;
    }

    public final boolean m() {
        return !this.f2500a.l().equals(Insets.e);
    }

    public final WindowInsetsCompat n(int i, int i2, int i3, int i4) {
        return this.f2500a.n(i, i2, i3, i4);
    }

    public final boolean p() {
        return this.f2500a.o();
    }

    public final boolean q(int i) {
        return this.f2500a.q(i);
    }

    public final WindowInsets r() {
        Impl impl = this.f2500a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).c;
        }
        return null;
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BuilderImpl20 extends BuilderImpl {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor g = null;
        public static boolean h = false;
        public WindowInsets c;
        public Insets d;

        public BuilderImpl20() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor constructor = g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(null, this.c);
            Insets[] insetsArr = this.b;
            Impl impl = windowInsetsCompatS.f2500a;
            impl.r(insetsArr);
            impl.u(this.d);
            return windowInsetsCompatS;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(Insets insets) {
            this.d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(Insets insets) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(insets.f2430a, insets.b, insets.c, insets.d);
            }
        }

        public BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.c = windowInsetsCompat.r();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class BuilderImpl29 extends BuilderImpl {
        public final WindowInsets.Builder c;

        public BuilderImpl29() {
            this.c = l.d();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(null, this.c.build());
            windowInsetsCompatS.f2500a.r(this.b);
            return windowInsetsCompatS;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void d(Insets insets) {
            this.c.setMandatorySystemGestureInsets(insets.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(Insets insets) {
            this.c.setStableInsets(insets.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void f(Insets insets) {
            this.c.setSystemGestureInsets(insets.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(Insets insets) {
            this.c.setSystemWindowInsets(insets.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void h(Insets insets) {
            this.c.setTappableElementInsets(insets.e());
        }

        public BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderD;
            super(windowInsetsCompat);
            WindowInsets windowInsetsR = windowInsetsCompat.r();
            if (windowInsetsR != null) {
                builderD = l.e(windowInsetsR);
            } else {
                builderD = l.d();
            }
            this.c = builderD;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl21 extends Impl20 {
        public Insets n;

        public Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.n = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.s(null, this.c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.s(null, this.c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets j() {
            if (this.n == null) {
                WindowInsets windowInsets = this.c;
                this.n = Insets.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void u(Insets insets) {
            this.n = insets;
        }

        public Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.n = null;
            this.n = impl21.n;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl20 extends Impl {
        public static boolean i = false;
        public static Method j;
        public static Class k;
        public static Field l;
        public static Field m;
        public final WindowInsets c;
        public Insets[] d;
        public Insets e;
        public WindowInsetsCompat f;
        public Insets g;
        public int h;

        public Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint
        private static void B() throws ClassNotFoundException, SecurityException {
            try {
                j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                k = cls;
                l = cls.getDeclaredField("mVisibleInsets");
                m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                l.setAccessible(true);
                m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            i = true;
        }

        public static boolean C(int i2, int i3) {
            return (i2 & 6) == (i3 & 6);
        }

        @SuppressLint
        private Insets w(int i2, boolean z) {
            Insets insetsA = Insets.e;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insetsA = Insets.a(insetsA, x(i3, z));
                }
            }
            return insetsA;
        }

        private Insets y() {
            WindowInsetsCompat windowInsetsCompat = this.f;
            return windowInsetsCompat != null ? windowInsetsCompat.f2500a.j() : Insets.e;
        }

        private Insets z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!i) {
                B();
            }
            Method method = j;
            if (method != null && k != null && l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) l.get(m.get(objInvoke));
                    if (rect != null) {
                        return Insets.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        public boolean A(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !x(i2, false).equals(Insets.e);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Insets insetsZ = z(view);
            if (insetsZ == null) {
                insetsZ = Insets.e;
            }
            s(insetsZ);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.f2500a.t(this.f);
            Insets insets = this.g;
            Impl impl = windowInsetsCompat.f2500a;
            impl.s(insets);
            impl.v(this.h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Impl20 impl20 = (Impl20) obj;
            return Objects.equals(this.g, impl20.g) && C(this.h, impl20.h);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets g(int i2) {
            return w(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets h(int i2) {
            return w(i2, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets l() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = Insets.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.s(null, this.c));
            builder.b(WindowInsetsCompat.o(l(), i2, i3, i4, i5));
            Insets insetsO = WindowInsetsCompat.o(j(), i2, i3, i4, i5);
            BuilderImpl builderImpl = builder.f2501a;
            builderImpl.e(insetsO);
            return builderImpl.b();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean p() {
            return this.c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @SuppressLint
        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0 && !A(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void r(Insets[] insetsArr) {
            this.d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void s(Insets insets) {
            this.g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void t(WindowInsetsCompat windowInsetsCompat) {
            this.f = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void v(int i2) {
            this.h = i2;
        }

        public Insets x(int i2, boolean z) {
            Insets insetsJ;
            int i3;
            Insets insets = Insets.e;
            if (i2 == 1) {
                return z ? Insets.c(0, Math.max(y().b, l().b), 0, 0) : (this.h & 4) != 0 ? insets : Insets.c(0, l().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    Insets insetsY = y();
                    Insets insetsJ2 = j();
                    return Insets.c(Math.max(insetsY.f2430a, insetsJ2.f2430a), 0, Math.max(insetsY.c, insetsJ2.c), Math.max(insetsY.d, insetsJ2.d));
                }
                if ((this.h & 2) != 0) {
                    return insets;
                }
                Insets insetsL = l();
                WindowInsetsCompat windowInsetsCompat = this.f;
                insetsJ = windowInsetsCompat != null ? windowInsetsCompat.f2500a.j() : null;
                int iMin = insetsL.d;
                if (insetsJ != null) {
                    iMin = Math.min(iMin, insetsJ.d);
                }
                return Insets.c(insetsL.f2430a, 0, insetsL.c, iMin);
            }
            if (i2 == 8) {
                Insets[] insetsArr = this.d;
                insetsJ = insetsArr != null ? insetsArr[Type.a(8)] : null;
                if (insetsJ != null) {
                    return insetsJ;
                }
                Insets insetsL2 = l();
                Insets insetsY2 = y();
                int i4 = insetsL2.d;
                if (i4 > insetsY2.d) {
                    return Insets.c(0, 0, 0, i4);
                }
                Insets insets2 = this.g;
                return (insets2 == null || insets2.equals(insets) || (i3 = this.g.d) <= insetsY2.d) ? insets : Insets.c(0, 0, 0, i3);
            }
            if (i2 == 16) {
                return k();
            }
            if (i2 == 32) {
                return i();
            }
            if (i2 == 64) {
                return m();
            }
            if (i2 != 128) {
                return insets;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f;
            DisplayCutoutCompat displayCutoutCompatF = windowInsetsCompat2 != null ? windowInsetsCompat2.f2500a.f() : f();
            if (displayCutoutCompatF == null) {
                return insets;
            }
            DisplayCutout displayCutout = displayCutoutCompatF.f2476a;
            return Insets.c(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        }

        public Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.c));
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl29 extends Impl28 {
        public Insets o;
        public Insets p;
        public Insets q;

        public Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets i() {
            if (this.p == null) {
                this.p = Insets.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets k() {
            if (this.o == null) {
                this.o = Insets.d(this.c.getSystemGestureInsets());
            }
            return this.o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets m() {
            if (this.q == null) {
                this.q = Insets.d(this.c.getTappableElementInsets());
            }
            return this.q;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat n(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.s(null, this.c.inset(i, i2, i3, i4));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void u(Insets insets) {
        }

        public Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.o = null;
            this.p = null;
            this.q = null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final BuilderImpl f2501a;

        public Builder() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2501a = new BuilderImpl34();
                return;
            }
            if (i >= 30) {
                this.f2501a = new BuilderImpl30();
            } else if (i >= 29) {
                this.f2501a = new BuilderImpl29();
            } else {
                this.f2501a = new BuilderImpl20();
            }
        }

        public final WindowInsetsCompat a() {
            return this.f2501a.b();
        }

        public final void b(Insets insets) {
            this.f2501a.g(insets);
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2501a = new BuilderImpl34(windowInsetsCompat);
                return;
            }
            if (i >= 30) {
                this.f2501a = new BuilderImpl30(windowInsetsCompat);
            } else if (i >= 29) {
                this.f2501a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f2501a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.f2500a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (impl instanceof Impl34)) {
                this.f2500a = new Impl34(this, (Impl34) impl);
            } else if (i >= 30 && (impl instanceof Impl30)) {
                this.f2500a = new Impl30(this, (Impl30) impl);
            } else if (i >= 29 && (impl instanceof Impl29)) {
                this.f2500a = new Impl29(this, (Impl29) impl);
            } else if (impl instanceof Impl28) {
                this.f2500a = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.f2500a = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.f2500a = new Impl20(this, (Impl20) impl);
            } else {
                this.f2500a = new Impl(this);
            }
            impl.e(this);
            return;
        }
        this.f2500a = new Impl(this);
    }
}
