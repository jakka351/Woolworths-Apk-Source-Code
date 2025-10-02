package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;

/* loaded from: classes2.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: a, reason: collision with root package name */
    public final Delegate f90a;
    public final DrawerLayout b;
    public final DrawerArrowDrawable c;
    public final int d;
    public final int e;
    public boolean f = false;

    public interface Delegate {
        Context a();

        boolean b();

        Drawable c();

        void d(Drawable drawable, int i);

        void e(int i);
    }

    /* loaded from: classes.dex */
    public interface DelegateProvider {
        Delegate getDrawerToggleDelegate();
    }

    public static class FrameworkActionBarDelegate implements Delegate {
        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context a() {
            throw null;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean b() {
            throw null;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable c() {
            TypedArray typedArrayObtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void d(Drawable drawable, int i) {
            throw null;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void e(int i) {
            throw null;
        }
    }

    public static class ToolbarCompatDelegate implements Delegate {

        /* renamed from: a, reason: collision with root package name */
        public final Toolbar f91a;
        public final Drawable b;
        public final CharSequence c;

        public ToolbarCompatDelegate(Toolbar toolbar) {
            this.f91a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Context a() {
            return this.f91a.getContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final Drawable c() {
            return this.b;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void d(Drawable drawable, int i) {
            this.f91a.setNavigationIcon(drawable);
            e(i);
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public final void e(int i) {
            Toolbar toolbar = this.f91a;
            if (i == 0) {
                toolbar.setNavigationContentDescription(this.c);
            } else {
                toolbar.setNavigationContentDescription(i);
            }
        }
    }

    public ActionBarDrawerToggle(NavDrawerBaseActivity navDrawerBaseActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f90a = new ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.app.ActionBarDrawerToggle.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.g(view);
                    try {
                        ActionBarDrawerToggle.this.e();
                    } finally {
                        Callback.h();
                    }
                }
            });
        } else {
            this.f90a = navDrawerBaseActivity.getDrawerToggleDelegate();
        }
        this.b = drawerLayout;
        this.d = com.woolworths.R.string.sng_navigation_drawer_open;
        this.e = com.woolworths.R.string.sng_navigation_drawer_close;
        this.c = new DrawerArrowDrawable(this.f90a.a());
        this.f90a.c();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void a(float f) {
        d(Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, f)));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void b(View view) {
        d(1.0f);
        this.f90a.e(this.e);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void c(View view) {
        d(BitmapDescriptorFactory.HUE_RED);
        this.f90a.e(this.d);
    }

    public final void d(float f) {
        DrawerArrowDrawable drawerArrowDrawable = this.c;
        if (f == 1.0f) {
            if (!drawerArrowDrawable.i) {
                drawerArrowDrawable.i = true;
                drawerArrowDrawable.invalidateSelf();
            }
        } else if (f == BitmapDescriptorFactory.HUE_RED && drawerArrowDrawable.i) {
            drawerArrowDrawable.i = false;
            drawerArrowDrawable.invalidateSelf();
        }
        drawerArrowDrawable.setProgress(f);
    }

    public final void e() {
        DrawerLayout drawerLayout = this.b;
        int iG = drawerLayout.g(8388611);
        View viewE = drawerLayout.e(8388611);
        if ((viewE != null ? DrawerLayout.o(viewE) : false) && iG != 2) {
            View viewE2 = drawerLayout.e(8388611);
            if (viewE2 != null) {
                drawerLayout.c(viewE2, true);
                return;
            } else {
                throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388611));
            }
        }
        if (iG != 1) {
            View viewE3 = drawerLayout.e(8388611);
            if (viewE3 != null) {
                drawerLayout.p(viewE3);
            } else {
                throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388611));
            }
        }
    }
}
