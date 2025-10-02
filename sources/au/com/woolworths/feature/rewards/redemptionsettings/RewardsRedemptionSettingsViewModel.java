package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.f;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.choice.RedemptionSettingsAnalytics;
import au.com.woolworths.analytics.rewards.redemptionsettings.SecureRedemptionSettingsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingMessage;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.base.rewards.account.data.RewardsTwoFactorAuth;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RedemptionItemClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsViewModel extends ViewModel implements RedemptionItemClickListener, FullPageErrorStateClickHandler {
    public final RewardsRedemptionSettingsInteractor e;
    public final AppConfig f;
    public final AnalyticsManager g;
    public final SharedFlowImpl h;
    public final MutableLiveData i;
    public RewardsTwoFactorAuth j;
    public final SharedFlow k;
    public final MutableLiveData l;
    public RewardsRedemptionSettingsContract.AnalyticsImpressionType m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6435a;

        static {
            int[] iArr = new int[RewardsRedemptionSettingsErrorState.values().length];
            try {
                RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = RewardsRedemptionSettingsErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState2 = RewardsRedemptionSettingsErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6435a = iArr;
        }
    }

    public RewardsRedemptionSettingsViewModel(RewardsRedemptionSettingsInteractor rewardsRedemptionSettingsInteractor, AppConfig appConfig, AnalyticsManager analyticsManager) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = rewardsRedemptionSettingsInteractor;
        this.f = appConfig;
        this.g = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.i = mutableLiveData;
        this.k = FlowKt.a(sharedFlowImplB);
        this.l = mutableLiveData;
        this.m = RewardsRedemptionSettingsContract.AnalyticsImpressionType.f;
        mutableLiveData.m(new RewardsRedemptionSettingsContract.ViewState(false));
    }

    public static void t6(MutableLiveData mutableLiveData, RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, int i) {
        boolean z = (i & 1) != 0 ? ((RewardsRedemptionSettingsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).f6432a : false;
        List list = ((RewardsRedemptionSettingsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        RewardsRedemptionActionsList rewardsRedemptionActionsList = ((RewardsRedemptionSettingsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).c;
        if ((i & 8) != 0) {
            rewardsRedemptionSettingsErrorState = ((RewardsRedemptionSettingsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).d;
        }
        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState2 = rewardsRedemptionSettingsErrorState;
        if ((i & 16) != 0) {
            rewardsRedemptionSettingsItem = ((RewardsRedemptionSettingsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).e;
        }
        mutableLiveData.m(new RewardsRedemptionSettingsContract.ViewState(z, list, rewardsRedemptionActionsList, rewardsRedemptionSettingsErrorState2, rewardsRedemptionSettingsItem));
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener
    public final void X4(RewardsRedemptionAction action) {
        Intrinsics.h(action, "action");
        this.h.f(new RewardsRedemptionSettingsContract.Actions.OpenUrl(action.getActionUrl()));
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.RedemptionItemClickListener
    public final void e5(RewardsRedemptionSettingsItem redemptionSettingsItem) {
        ContentCta cta;
        String url;
        final String label;
        ContentCta cta2;
        Intrinsics.h(redemptionSettingsItem, "redemptionSettingsItem");
        boolean zIsSelected = redemptionSettingsItem.isSelected();
        AnalyticsManager analyticsManager = this.g;
        SharedFlowImpl sharedFlowImpl = this.h;
        if (!zIsSelected) {
            if (Intrinsics.c(redemptionSettingsItem.isChangeEnabled(), Boolean.TRUE)) {
                RewardsRedemptionSettingsContract.ViewState viewState = (RewardsRedemptionSettingsContract.ViewState) this.l.e();
                if ((viewState != null ? viewState.e : null) == null) {
                    RewardsTwoFactorAuth rewardsTwoFactorAuth = this.j;
                    if (rewardsTwoFactorAuth != null) {
                        sharedFlowImpl.f(new RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication(rewardsTwoFactorAuth.getStepUpUrl(), new f(18, this, redemptionSettingsItem)));
                    } else {
                        s6(redemptionSettingsItem);
                    }
                }
            } else {
                sharedFlowImpl.f(new RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings(redemptionSettingsItem, this.f.getM()));
            }
            analyticsManager.c(RewardsRedemptionSettingsActionData.g);
            return;
        }
        RewardsRedemptionSettingCta cta3 = redemptionSettingsItem.getCta();
        if (cta3 == null || (cta = cta3.getCta()) == null || (url = cta.getUrl()) == null) {
            return;
        }
        String str = url.length() > 0 ? url : null;
        if (str != null) {
            RewardsRedemptionSettingCta cta4 = redemptionSettingsItem.getCta();
            if (cta4 == null || (cta2 = cta4.getCta()) == null || (label = cta2.getLabel()) == null) {
                label = "";
            }
            SecureRedemptionSettingsAnalytics.Points.Action.d.getClass();
            analyticsManager.g(new Event(label) { // from class: au.com.woolworths.analytics.rewards.redemptionsettings.SecureRedemptionSettingsAnalytics$Points$Action$Companion$securePreferenceSelection$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(SecureRedemptionSettingsAnalytics.Points.e);
                    spreadBuilder.a(new Pair("event.Category", "secure redemption"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.y("event.Label", label, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "secure_preference_selection";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "secure_preference_selection".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            sharedFlowImpl.f(new RewardsRedemptionSettingsContract.Actions.OpenUrl(str));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        RewardsRedemptionSettingsContract.ViewState viewState = (RewardsRedemptionSettingsContract.ViewState) this.l.e();
        RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = viewState != null ? viewState.d : null;
        int i = rewardsRedemptionSettingsErrorState == null ? -1 : WhenMappings.f6435a[rewardsRedemptionSettingsErrorState.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so what did we click?");
        }
        AnalyticsManager analyticsManager = this.g;
        if (i == 1) {
            analyticsManager.c(RewardsRedemptionSettingsActionData.k);
            q6();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(RewardsRedemptionSettingsActionData.l);
            q6();
        }
    }

    public final void p6(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem) {
        t6(this.i, null, rewardsRedemptionSettingsItem, 15);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1(this, rewardsRedemptionSettingsItem, null), 3);
    }

    public final void q6() {
        this.i.m(new RewardsRedemptionSettingsContract.ViewState(true));
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsRedemptionSettingsViewModel$fetchRedemptionSettings$1(this, null), 3);
    }

    public final void r6(RewardsRedemptionSettingsItem selectedItem, String webSettingsUrl) {
        Intrinsics.h(selectedItem, "selectedItem");
        Intrinsics.h(webSettingsUrl, "webSettingsUrl");
        RedemptionSettingsAnalytics.RedemptionSettings.Action.Companion companion = RedemptionSettingsAnalytics.RedemptionSettings.Action.d;
        final String redemptionSetting = selectedItem.getTitle();
        companion.getClass();
        Intrinsics.h(redemptionSetting, "redemptionSetting");
        this.g.g(new Event(redemptionSetting) { // from class: au.com.woolworths.analytics.rewards.choice.RedemptionSettingsAnalytics$RedemptionSettings$Action$Companion$continueButtonClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(RedemptionSettingsAnalytics.RedemptionSettings.e);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", "continue", spreadBuilder, "rewards.RedemptionSetting", redemptionSetting);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "rw_redemption_settings_update";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "rw_redemption_settings_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        this.h.f(new RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings(webSettingsUrl));
    }

    public final void s6(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem) {
        List<RewardsRedemptionSettingMessage> confirmationMessages = rewardsRedemptionSettingsItem.getConfirmationMessages();
        List<RewardsRedemptionSettingMessage> list = confirmationMessages;
        if (list == null || list.isEmpty()) {
            p6(rewardsRedemptionSettingsItem);
        } else {
            this.h.f(new RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages(confirmationMessages, new au.com.woolworths.feature.rewards.card.overlay.ui.b(15, this, rewardsRedemptionSettingsItem)));
        }
    }
}
