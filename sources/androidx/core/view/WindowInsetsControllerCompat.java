package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes2.dex */
public final class WindowInsetsControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Impl f2504a;

    public static class Impl {
        public void a(int i) {
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public void d(boolean z) {
        }

        public void e(boolean z) {
        }

        public void f() {
        }

        public void g() {
        }
    }

    @RequiresApi
    public static class Impl20 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final Window f2505a;
        public final SoftwareKeyboardControllerCompat b;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f2505a = window;
            this.b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        h(4);
                    } else if (i2 == 2) {
                        h(2);
                    } else if (i2 == 8) {
                        this.b.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void f() {
            this.f2505a.getDecorView().setTag(356039078, 2);
            i(2048);
            h(4096);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void g() {
            for (int i = 1; i <= 512; i <<= 1) {
                if ((8 & i) != 0) {
                    if (i == 1) {
                        i(4);
                        this.f2505a.clearFlags(1024);
                    } else if (i == 2) {
                        i(2);
                    } else if (i == 8) {
                        this.b.b();
                    }
                }
            }
        }

        public final void h(int i) {
            View decorView = this.f2505a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void i(int i) {
            View decorView = this.f2505a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    @RequiresApi
    public static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean c() {
            return (this.f2505a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(boolean z) {
            if (!z) {
                i(8192);
                return;
            }
            Window window = this.f2505a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            h(8192);
        }
    }

    @RequiresApi
    public static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean b() {
            return (this.f2505a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d(boolean z) {
            if (!z) {
                i(16);
                return;
            }
            Window window = this.f2505a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            h(16);
        }
    }

    @RequiresApi
    public static class Impl31 extends Impl30 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void f() {
            this.f2506a.setSystemBarsBehavior(2);
        }
    }

    @RequiresApi
    public static class Impl35 extends Impl31 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean b() {
            return (this.f2506a.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean c() {
            return (this.f2506a.getSystemBarsAppearance() & 8) != 0;
        }
    }

    public interface OnControllableInsetsChangedListener {
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2504a = new Impl35(windowInsetsController, new SoftwareKeyboardControllerCompat(windowInsetsController));
        } else {
            this.f2504a = new Impl30(windowInsetsController, new SoftwareKeyboardControllerCompat(windowInsetsController));
        }
    }

    public final void a(int i) {
        this.f2504a.a(i);
    }

    public final boolean b() {
        return this.f2504a.b();
    }

    public final boolean c() {
        return this.f2504a.c();
    }

    public final void d(boolean z) {
        this.f2504a.d(z);
    }

    public final void e(boolean z) {
        this.f2504a.e(z);
    }

    public final void f() {
        this.f2504a.f();
    }

    public final void g() {
        this.f2504a.g();
    }

    @RequiresApi
    public static class Impl30 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f2506a;
        public final SoftwareKeyboardControllerCompat b;
        public final Window c;

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {
            public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                throw null;
            }
        }

        public Impl30(WindowInsetsController windowInsetsController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            new SimpleArrayMap(0);
            this.f2506a = windowInsetsController;
            this.b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i) {
            if ((i & 8) != 0) {
                this.b.a();
            }
            this.f2506a.hide(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean b() {
            this.f2506a.setSystemBarsAppearance(0, 0);
            return (this.f2506a.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean c() {
            this.f2506a.setSystemBarsAppearance(0, 0);
            return (this.f2506a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d(boolean z) {
            Window window = this.c;
            if (z) {
                if (window != null) {
                    h(16);
                }
                this.f2506a.setSystemBarsAppearance(16, 16);
            } else {
                if (window != null) {
                    i(16);
                }
                this.f2506a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(boolean z) {
            Window window = this.c;
            if (z) {
                if (window != null) {
                    h(8192);
                }
                this.f2506a.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    i(8192);
                }
                this.f2506a.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void f() {
            Window window = this.c;
            if (window == null) {
                this.f2506a.setSystemBarsBehavior(2);
                return;
            }
            window.getDecorView().setTag(356039078, 2);
            i(2048);
            h(4096);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void g() {
            this.b.b();
            this.f2506a.show(0);
        }

        public final void h(int i) {
            View decorView = this.c.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void i(int i) {
            View decorView = this.c.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public Impl30(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), softwareKeyboardControllerCompat);
            this.c = window;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f2504a = new Impl35(window, softwareKeyboardControllerCompat);
        } else if (i >= 30) {
            this.f2504a = new Impl30(window, softwareKeyboardControllerCompat);
        } else {
            this.f2504a = new Impl26(window, softwareKeyboardControllerCompat);
        }
    }
}
