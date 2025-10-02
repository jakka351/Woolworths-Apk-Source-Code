package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.internal.z;
import androidx.compose.ui.platform.l;
import au.com.woolworths.android.onesite.modules.splash.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "Companion", "Impl", "Impl31", "KeepOnScreenCondition", "OnExitAnimationListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint
/* loaded from: classes.dex */
public final class SplashScreen {

    /* renamed from: a, reason: collision with root package name */
    public final Impl f2454a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "", "MASK_FACTOR", "F", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static SplashScreen a(AppCompatActivity appCompatActivity) {
            SplashScreen splashScreen = new SplashScreen(appCompatActivity);
            splashScreen.f2454a.a();
            return splashScreen;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl;", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Impl {

        /* renamed from: a, reason: collision with root package name */
        public final AppCompatActivity f2455a;
        public KeepOnScreenCondition b = new androidx.compose.ui.graphics.colorspace.a(7);

        public Impl(AppCompatActivity appCompatActivity) {
            this.f2455a = appCompatActivity;
        }

        public void a() throws Resources.NotFoundException {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f2455a.getTheme();
            theme.resolveAttribute(com.woolworths.R.attr.windowSplashScreenBackground, typedValue, true);
            if (theme.resolveAttribute(com.woolworths.R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(com.woolworths.R.attr.splashScreenIconSize, typedValue, true);
            c(theme, typedValue);
        }

        public void b(b bVar) {
            this.b = bVar;
            final View viewFindViewById = this.f2455a.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    if (this.d.b.j()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }

        public final void c(Resources.Theme theme, TypedValue typedValue) {
            int i;
            if (!theme.resolveAttribute(com.woolworths.R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
                return;
            }
            this.f2455a.setTheme(i);
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl31;", "Landroidx/core/splashscreen/SplashScreen$Impl;", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Impl31 extends Impl {
        public SplashScreen$Impl31$setKeepOnScreenCondition$1 c;
        public final SplashScreen$Impl31$hierarchyListener$1 d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1] */
        public Impl31(final AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            this.d = new ViewGroup.OnHierarchyChangeListener(this) { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewAdded(View view, View view2) {
                    if (z.B(view2)) {
                        SplashScreenView child = a.k(view2);
                        Intrinsics.h(child, "child");
                        WindowInsets windowInsetsBuild = l.d().build();
                        Intrinsics.g(windowInsetsBuild, "Builder().build()");
                        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                            rect.isEmpty();
                        }
                        ((ViewGroup) appCompatActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewRemoved(View view, View view2) {
                }
            };
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public final void a() {
            AppCompatActivity appCompatActivity = this.f2455a;
            Resources.Theme theme = appCompatActivity.getTheme();
            Intrinsics.g(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) appCompatActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1] */
        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public final void b(b bVar) {
            this.b = bVar;
            final View viewFindViewById = this.f2455a.findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.c != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    if (this.d.b.j()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.c = r1;
            viewTreeObserver.addOnPreDrawListener(r1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface KeepOnScreenCondition {
        boolean j();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnExitAnimationListener {
    }

    public SplashScreen(AppCompatActivity appCompatActivity) {
        this.f2454a = Build.VERSION.SDK_INT >= 31 ? new Impl31(appCompatActivity) : new Impl(appCompatActivity);
    }

    public final void a(b bVar) {
        this.f2454a.b(bVar);
    }
}
