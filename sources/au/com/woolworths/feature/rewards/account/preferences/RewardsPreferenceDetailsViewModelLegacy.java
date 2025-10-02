package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import au.com.woolworths.feature.rewards.account.preferences.analytics.RewardsPreferenceDetailsActionData;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsViewModelLegacy;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsClickHandler;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public class RewardsPreferenceDetailsViewModelLegacy extends ViewModel implements FullPageErrorStateClickHandler, RewardsPreferenceDetailsClickHandler {
    public final RewardsPreferenceDetailsInteractor e;
    public final RewardsActivityInteractor f;
    public final AnalyticsManager g;
    public String h;
    public String i;
    public boolean j;
    public final Lazy k;
    public final MutableLiveData l;
    public final SharedFlowImpl m;
    public final MutableLiveData n;
    public final Flow o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsViewModelLegacy$Companion;", "", "", "RECEIPTS_KEY", "Ljava/lang/String;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsPreferenceDetailsViewModelLegacy(RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor, RewardsActivityInteractor rewardsActivityInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(rewardsActivityInteractor, "rewardsActivityInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = rewardsPreferenceDetailsInteractor;
        this.f = rewardsActivityInteractor;
        this.g = analyticsManager;
        this.k = LazyKt.b(new androidx.lifecycle.a(this, 23));
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.l = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = mutableLiveData;
        this.o = FlowKt.a(sharedFlowImplB);
    }

    public static void q6(RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy, MutableLiveData mutableLiveData, boolean z) {
        Object objE = mutableLiveData.e();
        Intrinsics.e(objE);
        Text text = ((RewardsPreferenceDetailsContractLegacy.ViewState) objE).f5739a;
        Object objE2 = mutableLiveData.e();
        Intrinsics.e(objE2);
        List items = ((RewardsPreferenceDetailsContractLegacy.ViewState) objE2).b;
        Object objE3 = mutableLiveData.e();
        Intrinsics.e(objE3);
        boolean z2 = ((RewardsPreferenceDetailsContractLegacy.ViewState) objE3).c;
        Object objE4 = mutableLiveData.e();
        Intrinsics.e(objE4);
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = ((RewardsPreferenceDetailsContractLegacy.ViewState) objE4).d;
        Intrinsics.h(mutableLiveData, "<this>");
        Intrinsics.h(items, "items");
        mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(text, items, z2, rewardsPreferenceDetailsErrorState, z));
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler
    public final void H1(RewardsWebLink data) {
        Intrinsics.h(data, "data");
        this.m.f(new RewardsPreferenceDetailsContractLegacy.Actions.OpenExternalLink(data.getUrl()));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        String str = this.h;
        if (str == null) {
            Intrinsics.p("preferencesKey");
            throw null;
        }
        if (str.equals("receipts") && this.j) {
            this.f.notifyActivityFeedShouldBeRefreshed();
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public void onSecondaryActionClicked() {
        p6();
    }

    public void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPreferenceDetailsViewModelLegacy$fetchPage$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsClickHandler
    public final void x5(PreferenceToggleData data, boolean z) {
        Intrinsics.h(data, "data");
        RewardsPreferenceDetailsActionData rewardsPreferenceDetailsActionData = z ? RewardsPreferenceDetailsActionData.f : RewardsPreferenceDetailsActionData.g;
        Screens screens = (Screens) this.k.getD();
        rewardsPreferenceDetailsActionData.getClass();
        Intrinsics.h(screens, "<set-?>");
        rewardsPreferenceDetailsActionData.d = screens;
        String label = data.getAnalytics().getLabel();
        Intrinsics.h(label, "<set-?>");
        rewardsPreferenceDetailsActionData.e = label;
        this.g.c(rewardsPreferenceDetailsActionData);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1(this, data, z, null), 3);
    }
}
