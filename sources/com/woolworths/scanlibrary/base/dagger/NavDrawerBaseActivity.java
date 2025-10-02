package com.woolworths.scanlibrary.base.dagger;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.navigation.NavigationView;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding;
import com.woolworths.scanlibrary.domain.login.LogoutManager;
import com.woolworths.scanlibrary.models.authentication.Banner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/NavDrawerBaseActivity;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "P", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragmentActivity;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class NavDrawerBaseActivity<P extends MvpPresenter, V extends ViewDataBinding> extends DaggerBaseFragmentActivity<P> {
    public static final /* synthetic */ int T = 0;
    public AuthenticatedUser I;
    public LogoutManager J;
    public String K;
    public String L;
    public String M;
    public String N;
    public ScanAndGoFeatureConfig O;
    public ViewDataBinding P;
    public DrawerLayout Q;
    public LayoutNavigationDrawerBinding R;
    public Toolbar S;

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public void V4() {
        this.S = i5();
        this.Q = g5();
        LayoutNavigationDrawerBinding layoutNavigationDrawerBindingH5 = h5();
        this.R = layoutNavigationDrawerBindingH5;
        NavigationView navigationView = layoutNavigationDrawerBindingH5.A;
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(new au.com.woolworths.product.details.epoxy.a(this, 28));
        }
        final DrawerLayout drawerLayout = this.Q;
        if (drawerLayout == null) {
            Intrinsics.p("navigationDrawer");
            throw null;
        }
        final Toolbar toolbar = this.S;
        if (toolbar == null) {
            Intrinsics.p("toolbar");
            throw null;
        }
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(drawerLayout, toolbar) { // from class: com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity$initViews$mDrawerToggle$1
            @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public final void b(View drawerView) {
                Intrinsics.h(drawerView, "drawerView");
                super.b(drawerView);
                this.g.j5();
            }
        };
        DrawerLayout drawerLayout2 = actionBarDrawerToggle.b;
        View viewE = drawerLayout2.e(8388611);
        if (viewE != null ? DrawerLayout.m(viewE) : false) {
            actionBarDrawerToggle.d(1.0f);
        } else {
            actionBarDrawerToggle.d(BitmapDescriptorFactory.HUE_RED);
        }
        View viewE2 = drawerLayout2.e(8388611);
        int i = viewE2 != null ? DrawerLayout.m(viewE2) : false ? actionBarDrawerToggle.e : actionBarDrawerToggle.d;
        boolean z = actionBarDrawerToggle.f;
        ActionBarDrawerToggle.Delegate delegate = actionBarDrawerToggle.f90a;
        if (!z && !delegate.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            actionBarDrawerToggle.f = true;
        }
        delegate.d(actionBarDrawerToggle.c, i);
        DrawerLayout drawerLayout3 = this.Q;
        if (drawerLayout3 != null) {
            drawerLayout3.a(actionBarDrawerToggle);
        } else {
            Intrinsics.p("navigationDrawer");
            throw null;
        }
    }

    public abstract void d5();

    public final ViewDataBinding e5() {
        ViewDataBinding viewDataBinding = this.P;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        Intrinsics.p("viewBinding");
        throw null;
    }

    public abstract void f5();

    public abstract DrawerLayout g5();

    public abstract LayoutNavigationDrawerBinding h5();

    public abstract Toolbar i5();

    public abstract void j5();

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LayoutNavigationDrawerBinding layoutNavigationDrawerBinding = this.R;
        if (layoutNavigationDrawerBinding == null) {
            Intrinsics.p("layoutNavigationDrawerBinding");
            throw null;
        }
        TextView textView = (TextView) layoutNavigationDrawerBinding.A.l.e.getChildAt(0).findViewById(R.id.userFirstName);
        AuthenticatedUser authenticatedUser = this.I;
        if (authenticatedUser == null) {
            Intrinsics.p("authenticatedUser");
            throw null;
        }
        textView.setText(getString(R.string.sng_greeting_msg, authenticatedUser.b()));
        LayoutNavigationDrawerBinding layoutNavigationDrawerBinding2 = this.R;
        if (layoutNavigationDrawerBinding2 == null) {
            Intrinsics.p("layoutNavigationDrawerBinding");
            throw null;
        }
        TextView textView2 = (TextView) layoutNavigationDrawerBinding2.A.l.e.getChildAt(0).findViewById(R.id.userRewardNumber);
        AuthenticatedUser authenticatedUser2 = this.I;
        if (authenticatedUser2 == null) {
            Intrinsics.p("authenticatedUser");
            throw null;
        }
        textView2.setText(authenticatedUser2.c());
        if (this.A == null) {
            Intrinsics.p("sngFeatureConfig");
            throw null;
        }
        LayoutNavigationDrawerBinding layoutNavigationDrawerBinding3 = this.R;
        if (layoutNavigationDrawerBinding3 == null) {
            Intrinsics.p("layoutNavigationDrawerBinding");
            throw null;
        }
        layoutNavigationDrawerBinding3.y.setVisibility(8);
        LayoutNavigationDrawerBinding layoutNavigationDrawerBinding4 = this.R;
        if (layoutNavigationDrawerBinding4 == null) {
            Intrinsics.p("layoutNavigationDrawerBinding");
            throw null;
        }
        layoutNavigationDrawerBinding4.z.setVisibility(8);
        AuthenticatedUser authenticatedUser3 = U4().g;
        if (((String) authenticatedUser3.h.getValue(authenticatedUser3, AuthenticatedUser.i[7])).equals(Banner.GUEST.getBannerName())) {
            LayoutNavigationDrawerBinding layoutNavigationDrawerBinding5 = this.R;
            if (layoutNavigationDrawerBinding5 == null) {
                Intrinsics.p("layoutNavigationDrawerBinding");
                throw null;
            }
            NavigationView navigationView = layoutNavigationDrawerBinding5.A;
            MenuItem menuItemFindItem = navigationView.getMenu().findItem(R.id.nav_account);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(false);
            }
            MenuItem menuItemFindItem2 = navigationView.getMenu().findItem(R.id.nav_trans_history);
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(false);
            }
            ((TextView) navigationView.l.e.getChildAt(0).findViewById(R.id.userRewardNumber)).setVisibility(8);
        }
    }
}
