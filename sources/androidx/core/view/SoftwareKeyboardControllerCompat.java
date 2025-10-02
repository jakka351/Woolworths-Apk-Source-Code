package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Impl20 f2484a;

    public static class Impl {
    }

    @RequiresApi
    public static class Impl20 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final View f2485a;

        public Impl20(View view) {
            this.f2485a = view;
        }

        public void a() {
            View view = this.f2485a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view = this.f2485a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new d(0, viewFindViewById));
        }
    }

    @RequiresApi
    public static class Impl30 extends Impl20 {
        public View b;
        public WindowInsetsController c;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.e] */
        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        public final void a() {
            View view = this.b;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.e
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        public final void b() {
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f2484a = new Impl20(view);
            return;
        }
        Impl30 impl30 = new Impl30(view);
        impl30.b = view;
        this.f2484a = impl30;
    }

    public final void a() {
        this.f2484a.a();
    }

    public final void b() {
        this.f2484a.b();
    }

    public SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        Impl30 impl30 = new Impl30(null);
        impl30.c = windowInsetsController;
        this.f2484a = impl30;
    }
}
