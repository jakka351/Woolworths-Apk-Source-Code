package com.woolworths.scanlibrary.ui.tap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.configuration.OnSngAppCloseHandler;
import com.woolworths.scanlibrary.databinding.ActivityTapOnBinding;
import com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.login.LogoutManager;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import com.woolworths.scanlibrary.ui.tap.TapContract;
import com.woolworths.scanlibrary.ui.tap.analytics.TapOnActionData;
import com.woolworths.scanlibrary.ui.tap.tapon.PaymentMethodWarning;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/TapActivity;", "Lcom/woolworths/scanlibrary/base/dagger/NavDrawerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/tap/TapContract$Presenter;", "Lcom/woolworths/scanlibrary/databinding/ActivityTapOnBinding;", "Lcom/woolworths/scanlibrary/ui/tap/TapContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "Lcom/woolworths/scanlibrary/ui/tap/tapon/TapOnFragment$TapOnFragmentInteraction;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TapActivity extends NavDrawerBaseActivity<TapContract.Presenter, ActivityTapOnBinding> implements TapContract.View, UserScopedActivity, TapOnFragment.TapOnFragmentInteraction {
    public static final /* synthetic */ int W = 0;
    public boolean U;
    public final TapActivity$backButtonHandler$1 V = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.tap.TapActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            TapActivity tapActivity = this.d;
            if (tapActivity.getSupportFragmentManager().J() != 0) {
                tapActivity.getSupportFragmentManager().a0();
            } else {
                i(false);
                tapActivity.getF().d();
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/TapActivity$Companion;", "", "", "EXTRA_PAYMENT_WARNING_SHOWN", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Activity activity, Integer num, PaymentMethodWarning paymentMethodWarning, int i) {
            int i2 = TapActivity.W;
            boolean z = (i & 2) != 0;
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                paymentMethodWarning = null;
            }
            Intrinsics.h(activity, "activity");
            ArrayList arrayList = new ArrayList();
            if (num != null) {
                arrayList.add(new Pair("store_no", Integer.valueOf(num.intValue())));
            }
            if (paymentMethodWarning != null) {
                arrayList.add(new Pair("payment_method_warning", paymentMethodWarning));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            Intent intent = new Intent(activity, (Class<?>) TapActivity.class);
            intent.addFlags(872448000);
            if (pairArr.length != 0) {
                intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            }
            activity.startActivity(intent);
            if (z) {
                activity.finish();
            }
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.V;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_tap_on;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int T4() {
        return 33;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity, com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V4() {
        /*
            r12 = this;
            r0 = 2131558520(0x7f0d0078, float:1.8742358E38)
            androidx.databinding.ViewDataBinding r0 = androidx.databinding.DataBindingUtil.d(r12, r0)
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r12.P = r0
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "store_no"
            if (r0 == 0) goto L1f
            int r0 = r0.getInt(r1)
            goto L20
        L1f:
            r0 = -1
        L20:
            boolean r2 = r12.U
            if (r2 != 0) goto L65
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r12.Q4()
            com.woolworths.scanlibrary.configuration.ScanAndGoFeature r3 = com.woolworths.scanlibrary.configuration.ScanAndGoFeature.e
            boolean r2 = r2.c(r3)
            if (r2 != 0) goto L65
            android.content.Intent r2 = r12.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L43
            java.lang.String r3 = "payment_method_warning"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            com.woolworths.scanlibrary.ui.tap.tapon.PaymentMethodWarning r2 = (com.woolworths.scanlibrary.ui.tap.tapon.PaymentMethodWarning) r2
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 == 0) goto L65
            r3 = 1
            r12.U = r3
            java.lang.String r5 = r2.d
            java.lang.String r6 = r2.e
            java.lang.String r7 = r2.f
            au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c r8 = new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c
            r3 = 25
            r8.<init>(r12, r3)
            java.lang.String r9 = r2.g
            com.woolworths.scanlibrary.domain.payment.b r10 = new com.woolworths.scanlibrary.domain.payment.b
            r2 = 8
            r10.<init>(r2)
            r11 = 1
            r4 = r12
            com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt.b(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L66
        L65:
            r4 = r12
        L66:
            com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment r2 = new com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putInt(r1, r0)
            r2.setArguments(r3)
            java.lang.String r0 = "TapOnFragment"
            r1 = 16
            r3 = 2131362312(0x7f0a0208, float:1.8344401E38)
            com.woolworths.scanlibrary.base.dagger.DaggerBaseFragmentActivity.c5(r12, r2, r3, r0, r1)
            androidx.databinding.ViewDataBinding r0 = r12.e5()
            com.woolworths.scanlibrary.databinding.ActivityTapOnBinding r0 = (com.woolworths.scanlibrary.databinding.ActivityTapOnBinding) r0
            androidx.appcompat.widget.Toolbar r0 = r0.D
            java.lang.String r1 = "toolbar"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            androidx.databinding.ViewDataBinding r1 = r12.e5()
            com.woolworths.scanlibrary.databinding.ActivityTapOnBinding r1 = (com.woolworths.scanlibrary.databinding.ActivityTapOnBinding) r1
            android.widget.TextView r1 = r1.E
            r2 = 2132019592(0x7f140988, float:1.9677523E38)
            java.lang.String r2 = r12.getString(r2)
            r1.setText(r2)
            r12.setSupportActionBar(r0)
            androidx.appcompat.app.ActionBar r0 = r12.getSupportActionBar()
            if (r0 == 0) goto Lab
            r0.u()
        Lab:
            super.V4()
            androidx.databinding.ViewDataBinding r0 = r12.e5()
            com.woolworths.scanlibrary.databinding.ActivityTapOnBinding r0 = (com.woolworths.scanlibrary.databinding.ActivityTapOnBinding) r0
            com.woolworths.scanlibrary.databinding.LayoutNavigationDrawerBinding r0 = r0.A
            com.google.android.material.navigation.NavigationView r0 = r0.A
            java.lang.String r1 = "navigationView"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            android.view.Menu r0 = r0.getMenu()
            java.lang.String r1 = "getMenu(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            r1 = 2131363128(0x7f0a0538, float:1.8346056E38)
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto Ld3
            r1 = 0
            r0.setVisible(r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.ui.tap.TapActivity.V4():void");
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.TapOnFragmentInteraction
    public final void X2() {
        ((ActivityTapOnBinding) e5()).C.setDrawerLockMode(1);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void d5() {
        Toast.makeText(this, "No active shopping cart to cancel", 0).show();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void f5() {
        ((TapContract.Presenter) S4()).b();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final DrawerLayout g5() {
        DrawerLayout navigationDrawer = ((ActivityTapOnBinding) e5()).C;
        Intrinsics.g(navigationDrawer, "navigationDrawer");
        return navigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final LayoutNavigationDrawerBinding h5() {
        LayoutNavigationDrawerBinding layoutNavigationDrawer = ((ActivityTapOnBinding) e5()).A;
        Intrinsics.g(layoutNavigationDrawer, "layoutNavigationDrawer");
        return layoutNavigationDrawer;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final Toolbar i5() {
        Toolbar toolbar = ((ActivityTapOnBinding) e5()).D;
        Intrinsics.g(toolbar, "toolbar");
        return toolbar;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity
    public final void j5() {
        O4().a(Screens.k);
        O4().c(TapOnActionData.g);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.TapOnFragmentInteraction
    public final void k(String cartId) {
        Intrinsics.h(cartId, "cartId");
        throw new IllegalStateException("MetroGo is deprecated");
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.TapOnFragmentInteraction
    public final void k4() {
        LogoutManager logoutManager = this.J;
        if (logoutManager == null) {
            Intrinsics.p("logoutManager");
            throw null;
        }
        logoutManager.a();
        U4().b();
        SngInitializerActivity.Companion.a(this, true);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.TapOnFragmentInteraction
    public final void o1() {
        FrameLayout loadingView = ((ActivityTapOnBinding) e5()).B;
        Intrinsics.g(loadingView, "loadingView");
        loadingView.bringToFront();
        FrameLayout loadingView2 = ((ActivityTapOnBinding) e5()).B;
        Intrinsics.g(loadingView2, "loadingView");
        loadingView2.setVisibility(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        OnSngAppCloseHandler onSngAppCloseHandler;
        super.onActivityResult(i, i2, intent);
        if (i != 101) {
            Fragment fragmentF = getSupportFragmentManager().F(R.id.contentHome);
            if (fragmentF != null) {
                fragmentF.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        if (i2 == 0) {
            if (isTaskRoot() && (onSngAppCloseHandler = this.B) != null) {
                onSngAppCloseHandler.a(this);
            }
            getF().d();
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity, com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.U = bundle.getBoolean("key.extra.paymentwarning.shown", false);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("key.extra.paymentwarning.shown", this.U);
    }

    @Override // com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment.TapOnFragmentInteraction
    public final void w1() {
        FrameLayout loadingView = ((ActivityTapOnBinding) e5()).B;
        Intrinsics.g(loadingView, "loadingView");
        loadingView.setVisibility(8);
    }
}
