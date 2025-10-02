package com.woolworths.scanlibrary.ui.menu.myaccount;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.MyAccountScreenTracking;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract;
import com.woolworths.scanlibrary.util.extensions.FeatureToggleManagerExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountsPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountsContract$View;", "Lcom/woolworths/scanlibrary/ui/menu/myaccount/MyAccountsContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MyAccountsPresenter extends BasePresenter<MyAccountsContract.View> implements MyAccountsContract.Presenter {
    public final FeatureToggleManager c;
    public final AuthenticatedUser d;
    public final AnalyticsProvider e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountsPresenter(MyAccountsContract.View view, FeatureToggleManager featureToggleManager, AuthenticatedUser authenticatedUser, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = featureToggleManager;
        this.d = authenticatedUser;
        this.e = analyticsAggregator;
        view.k1(this);
        analyticsAggregator.a(new MyAccountScreenTracking("My Account Screen"));
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        MyAccountsContract.View view = (MyAccountsContract.View) this.f21139a;
        AuthenticatedUser authenticatedUser = this.d;
        view.C1(b.o(authenticatedUser.b(), " ", (String) authenticatedUser.b.getValue(authenticatedUser, AuthenticatedUser.i[1])), authenticatedUser.a());
        if (StringsKt.D(authenticatedUser.c())) {
            view.k3();
        } else {
            view.C2(authenticatedUser.c());
        }
    }

    @Override // com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountsContract.Presenter
    public final long k() {
        return FeatureToggleManagerExtKt.a(this.c);
    }
}
