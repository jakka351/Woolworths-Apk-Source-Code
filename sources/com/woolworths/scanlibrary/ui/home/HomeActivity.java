package com.woolworths.scanlibrary.ui.home;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.base.shopapp.customviews.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.HomeScreenTracking;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.databinding.ActivityHomeBinding;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity;
import com.woolworths.scanlibrary.ui.home.HomeActivityContract;
import com.woolworths.scanlibrary.ui.home.homeview.HomeFragment;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.ui.navigation.ScreenNavigator;
import com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivity;", "Lcom/woolworths/scanlibrary/base/dagger/NavDrawerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$Presenter;", "Lcom/woolworths/scanlibrary/databinding/ActivityHomeBinding;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewFragment$ProductViewInteractionListener;", "Lcom/woolworths/scanlibrary/ui/home/HomeActivityContract$View;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeActivity extends NavDrawerBaseActivity<HomeActivityContract.Presenter, ActivityHomeBinding> implements ItemViewFragment.ProductViewInteractionListener, HomeActivityContract.View, CartSessionScopedActivity {
    public static final /* synthetic */ int W = 0;
    public SnGShoppingListUtils U;
    public ScreenNavigator V;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/HomeActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentActivity fragmentActivity, boolean z, Bundle bundle) {
            int i = z ? R.anim.anim_enter : 0;
            int i2 = z ? R.anim.anim_exit : 0;
            Pair[] pairArr = bundle != null ? new Pair[]{new Pair("scan_success", bundle)} : new Pair[0];
            Intent intent = new Intent(fragmentActivity, (Class<?>) HomeActivity.class);
            intent.addFlags(872448000);
            if (pairArr.length != 0) {
                intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            }
            fragmentActivity.startActivity(intent);
            fragmentActivity.overridePendingTransition(i, i2);
            fragmentActivity.finish();
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void A1() {
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new HomeActivity$openLists$1(this, null), 3);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void B0(String ean) {
        Intrinsics.h(ean, "ean");
        ((HomeActivityContract.Presenter) S4()).F();
        ScreenNavigator screenNavigator = this.V;
        if (screenNavigator != null) {
            screenNavigator.a(this, ean);
        } else {
            Intrinsics.p("screenNavigator");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void C() {
        m5("-1");
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void C3() {
        ((HomeActivityContract.Presenter) S4()).U();
        Intent intent = new Intent(this, (Class<?>) ShoppingCartActivity.class);
        intent.addFlags(67108864);
        startActivityForResult(intent, 5000);
        overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return new BackButtonExitHandler() { // from class: com.woolworths.scanlibrary.ui.home.HomeActivity$backButtonHandler$1
            {
                super(this.e);
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final boolean j() {
                return this.e.getSupportFragmentManager().J() < 1;
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final void k() {
                HomeActivity homeActivity = this.e;
                if (homeActivity.getSupportFragmentManager().J() == 0) {
                    i(false);
                } else {
                    homeActivity.getSupportFragmentManager().a0();
                }
            }

            @Override // com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler
            public final void l() {
                i(false);
                this.e.getF().d();
            }
        };
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_home;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity, com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ViewDataBinding viewDataBindingD = DataBindingUtil.d(this, R.layout.activity_home);
        Intrinsics.h(viewDataBindingD, "<set-?>");
        this.P = viewDataBindingD;
        Bundle bundleExtra = getIntent().getBundleExtra("scan_success");
        String string = "-1";
        if (bundleExtra != null) {
            string = bundleExtra.getString("cartItemLineNo", "-1");
            Intrinsics.g(string, "getString(...)");
        }
        m5(string);
        Toolbar toolbar = ((ActivityHomeBinding) e5()).A.y;
        Intrinsics.g(toolbar, "toolbar");
        ((ActivityHomeBinding) e5()).A.z.setText(k5());
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        super.V4();
        View searchBar = ((ActivityHomeBinding) e5()).D;
        Intrinsics.g(searchBar, "searchBar");
        searchBar.setOnClickListener(new a(this, 20));
        ((HomeActivityContract.Presenter) S4()).t0().f(this, new androidx.compose.runtime.livedata.a(this, 7));
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void d5() {
        ((HomeActivityContract.Presenter) S4()).a();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void f5() {
        ((HomeActivityContract.Presenter) S4()).b();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final DrawerLayout g5() {
        DrawerLayout navigationDrawer = ((ActivityHomeBinding) e5()).C;
        Intrinsics.g(navigationDrawer, "navigationDrawer");
        return navigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final LayoutNavigationDrawerBinding h5() {
        LayoutNavigationDrawerBinding layoutNavigationDrawer = ((ActivityHomeBinding) e5()).z;
        Intrinsics.g(layoutNavigationDrawer, "layoutNavigationDrawer");
        return layoutNavigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void i0(MvpView.ErrorType errorType) {
        super.i0(errorType);
        m5("-1");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final Toolbar i5() {
        Toolbar toolbar = ((ActivityHomeBinding) e5()).A.y;
        Intrinsics.g(toolbar, "toolbar");
        return toolbar;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void j5() {
        ((HomeActivityContract.Presenter) S4()).l0();
    }

    public final String k5() throws Resources.NotFoundException {
        int iL = ((HomeActivityContract.Presenter) S4()).l();
        String string = getString(R.string.sng_label_cart_amount, ((HomeActivityContract.Presenter) S4()).V());
        Intrinsics.g(string, "getString(...)");
        String quantityString = getResources().getQuantityString(R.plurals.sng_label_cart_count, iL, Integer.valueOf(iL));
        Intrinsics.g(quantityString, "getQuantityString(...)");
        return string + " | " + quantityString;
    }

    public final void l5(String str, boolean z) {
        ItemViewFragment itemViewFragment = new ItemViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("cartItemLineNo", str);
        bundle.putBoolean("cartAddedMsg", z);
        itemViewFragment.setArguments(bundle);
        DaggerBaseFragmentActivity.c5(this, itemViewFragment, R.id.contentHome, null, 28);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void m2() {
        ((HomeActivityContract.Presenter) S4()).F();
        ScreenNavigator screenNavigator = this.V;
        if (screenNavigator != null) {
            screenNavigator.a(this, null);
        } else {
            Intrinsics.p("screenNavigator");
            throw null;
        }
    }

    public final void m5(String str) {
        if (((HomeActivityContract.Presenter) S4()).J0()) {
            l5(str, !str.equals("-1"));
        } else {
            DaggerBaseFragmentActivity.c5(this, new HomeFragment(), R.id.contentHome, "HomeFragment", 20);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        Bundle extras2;
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            if (i == 5000) {
                if (i2 != -1) {
                    if (i2 == 0) {
                        m5("-1");
                    }
                } else if (intent == null || (extras2 = intent.getExtras()) == null) {
                    m5("-1");
                } else {
                    String string = extras2.getString("cartItemLineNo", "-1");
                    Intrinsics.g(string, "getString(...)");
                    l5(string, true);
                }
            }
        } else if (i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("cartItemLineNo", "-1");
            Intrinsics.g(string2, "getString(...)");
            l5(string2, true);
        }
        ((ActivityHomeBinding) e5()).A.z.setText(k5());
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity, com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((HomeActivityContract.Presenter) S4()).i(false);
        N4().a(new HomeScreenTracking("Home Screen"));
        O4().a(Screens.d);
        m5("-1");
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment.ProductViewInteractionListener
    public final void y0() {
        ((ActivityHomeBinding) e5()).A.z.setText(k5());
    }
}
