package com.woolworths.scanlibrary.base.dagger;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import dagger.android.support.AndroidSupportInjection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "P", "Landroidx/fragment/app/Fragment;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DaggerBaseFragment<P extends MvpPresenter> extends Fragment implements MvpView<P> {
    public MvpPresenter d;
    public UserManager e;
    public FeatureToggleManager f;
    public AnalyticsProvider g;
    public AnalyticsManager h;
    public ScanAndGoFeatureConfig i;
    public final Lazy j = LazyKt.b(new b(this, 0));
    public LoadingViewDelegate k;

    public void E1() {
        Q1().X0();
    }

    public final AnalyticsProvider I1() {
        AnalyticsProvider analyticsProvider = this.g;
        if (analyticsProvider != null) {
            return analyticsProvider;
        }
        Intrinsics.p("analyticsAggregator");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void N3(boolean z) {
        if (z) {
            LoadingViewDelegate loadingViewDelegate = this.k;
            if (loadingViewDelegate != null) {
                loadingViewDelegate.c();
                return;
            }
            return;
        }
        LoadingViewDelegate loadingViewDelegate2 = this.k;
        if (loadingViewDelegate2 != null) {
            loadingViewDelegate2.b();
        }
    }

    public final MvpPresenter Q1() {
        MvpPresenter mvpPresenter = this.d;
        if (mvpPresenter != null) {
            return mvpPresenter;
        }
        Intrinsics.p("mPresenter");
        throw null;
    }

    public final void R1(String str, Function0 function0) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_label_ok);
            Intrinsics.g(string, "getString(...)");
            AppCompatActivityExtKt.f(activity, str, string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(19, function0), new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(20, function0));
        }
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public final void W3(boolean z) {
        if (!z) {
            LoadingViewDelegate loadingViewDelegate = this.k;
            if (loadingViewDelegate != null) {
                loadingViewDelegate.b();
                return;
            }
            return;
        }
        LoadingViewDelegate loadingViewDelegate2 = this.k;
        if (loadingViewDelegate2 != null) {
            loadingViewDelegate2.b.setVisibility(0);
            loadingViewDelegate2.c();
        }
    }

    public final void b2(Function0 function0) {
        if (getActivity() != null) {
            String string = getString(R.string.sng_no_network);
            Intrinsics.g(string, "getString(...)");
            R1(string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(18, function0));
        }
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void i0(MvpView.ErrorType errorType) {
        ((ErrorHandlingDelegate) this.j.getD()).b(errorType);
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public void k1(MvpPresenter mvpPresenter) {
        this.d = mvpPresenter;
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpView
    public final void n(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
        ((ErrorHandlingDelegate) this.j.getD()).a(i, i2, apigeeErrorResponse, function0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        boolean zA;
        Intrinsics.h(context, "context");
        FragmentActivity activity = getActivity();
        Object application = activity != null ? activity.getApplication() : null;
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        UserManager userManagerD = ((SnGAppProvider) application).d();
        Intrinsics.h(userManagerD, "<set-?>");
        this.e = userManagerD;
        FragmentActivity activity2 = getActivity();
        Object application2 = activity2 != null ? activity2.getApplication() : null;
        Intrinsics.f(application2, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        Intrinsics.h(((SnGAppProvider) application2).b(), "<set-?>");
        FragmentActivity activity3 = getActivity();
        if (activity3 instanceof UserScopedActivity) {
            UserManager userManager = this.e;
            if (userManager == null) {
                Intrinsics.p("userManager");
                throw null;
            }
            zA = userManager.a();
        } else if (activity3 instanceof CartSessionScopedActivity) {
            UserManager userManager2 = this.e;
            if (userManager2 == null) {
                Intrinsics.p("userManager");
                throw null;
            }
            zA = userManager2.a();
        } else {
            zA = true;
        }
        if (zA) {
            AndroidSupportInjection.a(this);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.k = new LoadingViewDelegate(fragmentActivityRequireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LoadingViewDelegate loadingViewDelegate = this.k;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.a();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        E1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Q1().M0();
    }
}
