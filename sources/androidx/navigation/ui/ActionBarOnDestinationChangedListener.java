package androidx.navigation.ui;

import android.content.Context;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "navigation-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    public final AppCompatActivity f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarOnDestinationChangedListener(AppCompatActivity appCompatActivity, AppBarConfiguration appBarConfiguration) {
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = appCompatActivity.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity + " does not have a DrawerToggleDelegate set").toString());
        }
        Context contextA = drawerToggleDelegate.a();
        Intrinsics.g(contextA, "getActionBarThemedContext(...)");
        super(contextA, appBarConfiguration);
        this.f = appCompatActivity;
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void b(DrawerArrowDrawable drawerArrowDrawable, int i) {
        AppCompatActivity appCompatActivity = this.f;
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.s(drawerArrowDrawable != null);
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = appCompatActivity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            drawerToggleDelegate.d(drawerArrowDrawable, i);
            return;
        }
        throw new IllegalStateException(("Activity " + appCompatActivity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    public final void c(String str) {
        AppCompatActivity appCompatActivity = this.f;
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A(str);
            return;
        }
        throw new IllegalStateException(("Activity " + appCompatActivity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
