package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.choice.RedemptionSettingsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.base.rewards.account.data.RewardsTwoFactorAuth;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionSettingsList;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1", f = "RewardsRedemptionSettingsViewModel.kt", l = {160}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsRedemptionSettingsViewModel q;
    public final /* synthetic */ RewardsRedemptionSettingsItem r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1(RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsRedemptionSettingsViewModel;
        this.r = rewardsRedemptionSettingsItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsRedemptionSettingsViewModel$changeRedemptionSetting$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = rewardsRedemptionSettingsViewModel.h;
        RewardsRedemptionSettingsInteractor rewardsRedemptionSettingsInteractor = rewardsRedemptionSettingsViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.r;
                this.p = 1;
                obj = rewardsRedemptionSettingsInteractor.f6433a.a(rewardsRedemptionSettingsItem.getTitle(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RewardsRedemptionSettingsList rewardsRedemptionSettingsList = (RewardsRedemptionSettingsList) obj;
            RewardsTwoFactorAuth rewardsTwoFactorAuth = rewardsRedemptionSettingsList.b;
            ArrayList arrayList = rewardsRedemptionSettingsList.f6438a;
            rewardsRedemptionSettingsViewModel.j = rewardsTwoFactorAuth;
            rewardsRedemptionSettingsViewModel.i.m(new RewardsRedemptionSettingsContract.ViewState(false, arrayList, rewardsRedemptionSettingsList.c, null, null));
        } catch (NoConnectivityException unused) {
            sharedFlowImpl.f(new RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage(RewardsRedemptionSettingsContract.SoftErrorType.f));
            RewardsRedemptionSettingsViewModel.t6(rewardsRedemptionSettingsViewModel.i, null, null, 15);
        } catch (ServerErrorException unused2) {
            sharedFlowImpl.f(new RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage(RewardsRedemptionSettingsContract.SoftErrorType.e));
            RewardsRedemptionSettingsViewModel.t6(rewardsRedemptionSettingsViewModel.i, null, null, 15);
        }
        for (Object obj2 : arrayList) {
            if (((RewardsRedemptionSettingsItem) obj2).isSelected()) {
                RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem2 = (RewardsRedemptionSettingsItem) obj2;
                AnalyticsManager analyticsManager = rewardsRedemptionSettingsViewModel.g;
                RedemptionSettingsAnalytics.RedemptionSettings.Action.Companion companion = RedemptionSettingsAnalytics.RedemptionSettings.Action.d;
                final String redemptionSetting = rewardsRedemptionSettingsItem2.getTitle();
                companion.getClass();
                Intrinsics.h(redemptionSetting, "redemptionSetting");
                analyticsManager.g(new Event(redemptionSetting) { // from class: au.com.woolworths.analytics.rewards.choice.RedemptionSettingsAnalytics$RedemptionSettings$Action$Companion$switchSuccess$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(RedemptionSettingsAnalytics.RedemptionSettings.e);
                        spreadBuilder.a(new Pair("event.Category", "button"));
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        spreadBuilder.a(new Pair("event.Label", "Switch"));
                        spreadBuilder.a(new Pair("event.Description", "success"));
                        a.y("rewards.RedemptionSetting", redemptionSetting, spreadBuilder);
                        ArrayList arrayList2 = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "rw_redemption_settings_update";
                    }

                    public final boolean equals(Object obj3) {
                        if (!(obj3 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj3;
                        return "rw_redemption_settings_update".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                rewardsRedemptionSettingsInteractor.getClass();
                rewardsRedemptionSettingsInteractor.b.setRedemptionSetting(rewardsRedemptionSettingsItem2);
                return Unit.f24250a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
