package com.woolworths.scanlibrary.ui.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.configuration.UserConfigurations;
import com.woolworths.scanlibrary.ui.entry.SngEntryContract;
import com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lcom/woolworths/scanlibrary/ui/entry/launcher/SngFullPageErrorStateHandler;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngEntryViewModel extends BaseViewModel implements FullPageErrorStateClickHandler, SngFullPageErrorStateHandler {
    public final RewardsAccountInteractor h;
    public final UserConfigurations i;
    public final AnalyticsManager j;
    public final FeatureToggleManager k;
    public final DeviceFingerprintInteractor l;
    public final SharedFlowImpl m;
    public final Flow n;
    public final MutableLiveData o;
    public boolean p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21251a;

        static {
            int[] iArr = new int[FetchSngErrorState.values().length];
            try {
                FetchSngErrorState fetchSngErrorState = FetchSngErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FetchSngErrorState fetchSngErrorState2 = FetchSngErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21251a = iArr;
        }
    }

    public SngEntryViewModel(RewardsAccountInteractor rewardsAccountInteractor, UserConfigurations userConfigurations, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, DeviceFingerprintInteractor deviceFingerprintInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(userConfigurations, "userConfigurations");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        this.h = rewardsAccountInteractor;
        this.i = userConfigurations;
        this.j = analyticsManager;
        this.k = featureToggleManager;
        this.l = deviceFingerprintInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = FlowKt.a(sharedFlowImplB);
        this.o = new MutableLiveData();
        if (featureToggleManager.c(ScanAndGoFeature.d)) {
            deviceFingerprintInteractor.a();
        }
    }

    public static void s6(SngEntryViewModel sngEntryViewModel, boolean z, boolean z2, FetchSngErrorState fetchSngErrorState, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            fetchSngErrorState = null;
        }
        sngEntryViewModel.o.j(new SngEntryContract.ViewState(z, z2, fetchSngErrorState));
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void cancel() {
        if (!this.i.a()) {
            s6(this, false, true, null, 4);
        } else {
            this.m.f(SngEntryContract.Actions.Close.f21245a);
            s6(this, false, false, null, 6);
        }
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void g() {
        r6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        MutableLiveData mutableLiveData = this.o;
        SngEntryContract.ViewState viewState = (SngEntryContract.ViewState) mutableLiveData.e();
        FetchSngErrorState fetchSngErrorState2 = viewState != null ? viewState.c : null;
        int i = fetchSngErrorState2 == null ? -1 : WhenMappings.f21251a[fetchSngErrorState2.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so can't click it.");
        }
        AnalyticsManager analyticsManager = this.j;
        if (i == 1) {
            analyticsManager.c(ScanAndGoEntryActions.h);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(ScanAndGoEntryActions.f);
        }
        SngEntryContract.ViewState viewState2 = (SngEntryContract.ViewState) mutableLiveData.e();
        if (viewState2 == null || (fetchSngErrorState = viewState2.c) == null) {
            return;
        }
        fetchSngErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        SngEntryContract.ViewState viewState = (SngEntryContract.ViewState) this.o.e();
        if (viewState == null || (fetchSngErrorState = viewState.c) == null) {
            return;
        }
        fetchSngErrorState.b(this);
    }

    public final void r6() {
        s6(this, true, !this.i.a(), null, 4);
        this.m.f(SngEntryContract.Actions.OpenSng.f21246a);
    }
}
