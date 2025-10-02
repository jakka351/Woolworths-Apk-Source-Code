package com.woolworths.scanlibrary.ui.tandc;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.TermsAndConditionsScreenTracking;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.domain.login.TermsNConditionUC;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.user.TermsConditionInfo;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsContract$View;", "Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsContract$Presenter;", "TermsNConditionObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TermsConditionsPresenter extends BasePresenter<TermsConditionsContract.View> implements TermsConditionsContract.Presenter {
    public final TermsConditionsContract.View c;
    public final TermsNConditionUC d;
    public final AuthenticatedUser e;
    public final UserConfigurations f;
    public final DeviceInfoProvider g;
    public final AnalyticsProvider h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tandc/TermsConditionsPresenter$TermsNConditionObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/login/TermsNConditionUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsNConditionObserver extends BaseDisposableObserver<TermsNConditionUC.ResponseValue> {
        public final TermsConditionsContract.View g;
        public final AuthenticatedUser h;
        public final UserConfigurations i;
        public final DeviceInfoProvider j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TermsNConditionObserver(TermsConditionsContract.View view, AuthenticatedUser authenticatedUser, UserConfigurations userConfigurations, DeviceInfoProvider deviceInfoProvider) {
            super(view, 15);
            Intrinsics.h(view, "view");
            Intrinsics.h(authenticatedUser, "authenticatedUser");
            Intrinsics.h(userConfigurations, "userConfigurations");
            Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
            this.g = view;
            this.h = authenticatedUser;
            this.i = userConfigurations;
            this.j = deviceInfoProvider;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            TermsNConditionUC.ResponseValue response = (TermsNConditionUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            TermsConditionsContract.View view = this.g;
            view.N3(false);
            AuthenticatedUser authenticatedUser = this.h;
            SharedPreferenceExtKt$string$$inlined$delegate$1 sharedPreferenceExtKt$string$$inlined$delegate$1 = authenticatedUser.h;
            KProperty[] kPropertyArr = AuthenticatedUser.i;
            if (!((String) sharedPreferenceExtKt$string$$inlined$delegate$1.getValue(authenticatedUser, kPropertyArr[7])).equals(Banner.GUEST.getBannerName())) {
                if (((Boolean) authenticatedUser.g.getValue(authenticatedUser, kPropertyArr[6])).booleanValue()) {
                    view.K2();
                    return;
                } else {
                    view.t();
                    return;
                }
            }
            DeviceInfoProvider deviceInfoProvider = this.j;
            int appVersionCode = deviceInfoProvider.getAppVersionCode();
            UserConfigurations userConfigurations = this.i;
            userConfigurations.e.setValue(userConfigurations, UserConfigurations.k[5], Integer.valueOf(appVersionCode));
            userConfigurations.b(deviceInfoProvider.getAppVersionName());
            view.K2();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsConditionsPresenter(TermsConditionsContract.View view, TermsNConditionUC termsNConditionUC, AuthenticatedUser authenticatedUser, UserConfigurations userConfigurations, DeviceInfoProvider deviceInfoProvider, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = view;
        this.d = termsNConditionUC;
        this.e = authenticatedUser;
        this.f = userConfigurations;
        this.g = deviceInfoProvider;
        this.h = analyticsAggregator;
        view.k1(this);
        analyticsAggregator.a(new TermsAndConditionsScreenTracking("Terms & Conditions Screen"));
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        ((TermsConditionsContract.View) this.f21139a).X3();
    }

    @Override // com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract.Presenter
    public final void c0() {
        AuthenticatedUser authenticatedUser = this.e;
        authenticatedUser.d(true);
        TermsNConditionUC.RequestValues requestValues = new TermsNConditionUC.RequestValues(new TermsConditionInfo(true));
        TermsConditionsContract.View view = this.c;
        view.N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(requestValues).f(AndroidSchedulers.a());
        TermsNConditionObserver termsNConditionObserver = new TermsNConditionObserver(view, authenticatedUser, this.f, this.g);
        singleObserveOnF.a(termsNConditionObserver);
        this.b.d(termsNConditionObserver);
    }
}
