package com.woolworths.scanlibrary.ui.cart;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.databinding.ActivityShoppingCartBinding;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.ui.cart.ShoppingCartContract;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartActivity;", "Lcom/woolworths/scanlibrary/base/dagger/NavDrawerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartContract$Presenter;", "Lcom/woolworths/scanlibrary/databinding/ActivityShoppingCartBinding;", "Lcom/woolworths/scanlibrary/di/session/CartSessionScopedActivity;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/ShoppingCartFragment$OnCartInteractionListener;", "Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartContract$View;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingCartActivity extends NavDrawerBaseActivity<ShoppingCartContract.Presenter, ActivityShoppingCartBinding> implements CartSessionScopedActivity, ShoppingCartFragment.OnCartInteractionListener, ShoppingCartContract.View {
    public static final /* synthetic */ int V = 0;
    public final ShoppingCartActivity$backButtonHandler$1 U = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            ShoppingCartActivity shoppingCartActivity = this.d;
            if (shoppingCartActivity.getSupportFragmentManager().J() != 0) {
                shoppingCartActivity.getSupportFragmentManager().a0();
            } else {
                i(false);
                shoppingCartActivity.finish();
            }
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/ShoppingCartActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.U;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_shopping_cart;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity, com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        ViewDataBinding viewDataBindingD = DataBindingUtil.d(this, R.layout.activity_shopping_cart);
        Intrinsics.h(viewDataBindingD, "<set-?>");
        this.P = viewDataBindingD;
        setSupportActionBar(((ActivityShoppingCartBinding) e5()).A.y);
        ((ActivityShoppingCartBinding) e5()).A.z.setText(getResources().getString(R.string.sng_title_my_items));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        super.V4();
        ((ShoppingCartContract.Presenter) S4()).z0().f(this, new ShoppingCartActivity$sam$androidx_lifecycle_Observer$0(new i(this, 19)));
        DaggerBaseFragmentActivity.c5(this, new ShoppingCartFragment(), R.id.contentHome, "ShoppingCartFragment", 20);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void d5() {
        ((ShoppingCartContract.Presenter) S4()).a();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void f5() {
        ((ShoppingCartContract.Presenter) S4()).b();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final DrawerLayout g5() {
        DrawerLayout navigationDrawer = ((ActivityShoppingCartBinding) e5()).C;
        Intrinsics.g(navigationDrawer, "navigationDrawer");
        return navigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final LayoutNavigationDrawerBinding h5() {
        LayoutNavigationDrawerBinding layoutNavigationDrawer = ((ActivityShoppingCartBinding) e5()).z;
        Intrinsics.g(layoutNavigationDrawer, "layoutNavigationDrawer");
        return layoutNavigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final Toolbar i5() {
        Toolbar toolbar = ((ActivityShoppingCartBinding) e5()).A.y;
        Intrinsics.g(toolbar, "toolbar");
        return toolbar;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void j5() {
        O4().a(Screens.k);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void k1(MvpPresenter mvpPresenter) {
    }
}
