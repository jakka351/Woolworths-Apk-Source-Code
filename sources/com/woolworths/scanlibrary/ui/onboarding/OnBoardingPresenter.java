package com.woolworths.scanlibrary.ui.onboarding;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingContract;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingContract$View;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnBoardingPresenter extends BasePresenter<OnBoardingContract.View> implements OnBoardingContract.Presenter {
    public final DeviceInfoProvider c;
    public final FeatureToggleManager d;
    public final AnalyticsManager e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingPresenter(OnBoardingContract.View view, UserConfigurations userConfigurations, DeviceInfoProvider deviceInfoProvider, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager) {
        super(view);
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.c = deviceInfoProvider;
        this.d = featureToggleManager;
        this.e = analyticsManager;
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void W0() {
        this.e.a(Screens.l);
    }

    @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingContract.Presenter
    public final ArrayList b1() {
        ArrayList arrayList = new ArrayList();
        OnBoardingPagerAdapter.PageStateType pageStateType = OnBoardingPagerAdapter.PageStateType.d;
        arrayList.add(new OnBoardingPageTemplateData(2131232197, R.string.sng_onboarding_refresh_title_1, R.string.sng_onboarding_refresh_message_1, R.string.sng_onboarding_refresh_title_1_analytics, 96));
        arrayList.add(new OnBoardingPageTemplateData(2131232198, R.string.sng_onboarding_refresh_title_2, R.string.sng_onboarding_refresh_message_2, R.string.sng_onboarding_refresh_title_2_analytics, 96));
        arrayList.add(new OnBoardingPageTemplateData(2131232199, R.string.sng_onboarding_refresh_title_3, R.string.sng_onboarding_refresh_message_3, R.string.sng_onboarding_refresh_title_3_analytics, 96));
        ScanAndGoFeature scanAndGoFeature = ScanAndGoFeature.e;
        FeatureToggleManager featureToggleManager = this.d;
        if (!featureToggleManager.c(scanAndGoFeature)) {
            arrayList.add(new OnBoardingPageTemplateData(2131232200, R.string.sng_onboarding_refresh_title_4, R.string.sng_onboarding_refresh_message_4, R.string.sng_onboarding_refresh_title_4_analytics, 32));
        }
        arrayList.add(new OnBoardingPageTemplateData(2131232201, !featureToggleManager.c(scanAndGoFeature) ? R.string.sng_onboarding_refresh_title_5 : R.string.sng_onboarding_refresh_title_5_payment_off, !featureToggleManager.c(scanAndGoFeature) ? R.string.sng_onboarding_refresh_message_5 : R.string.sng_onboarding_refresh_message_5_payment_off, R.string.sng_onboarding_refresh_title_5_analytics, 64));
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.ui.onboarding.OnBoardingContract.Presenter
    public final void x0(int i, Action action, String str) {
        Intrinsics.h(action, "action");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.r, "Page " + (i + 1));
        trackingMetadataA.b(TrackableValue.q, str);
        this.e.j(action, trackingMetadataA);
    }
}
