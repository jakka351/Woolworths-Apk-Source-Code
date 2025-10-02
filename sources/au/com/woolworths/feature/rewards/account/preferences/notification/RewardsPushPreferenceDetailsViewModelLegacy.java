package au.com.woolworths.feature.rewards.account.preferences.notification;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.fragment.e;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/notification/RewardsPushPreferenceDetailsViewModelLegacy;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsViewModelLegacy;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public final class RewardsPushPreferenceDetailsViewModelLegacy extends RewardsPreferenceDetailsViewModelLegacy {
    public final NotificationManager p;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy$1", f = "RewardsPushPreferenceDetailsViewModelLegacy.kt", l = {37}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.rewards.account.preferences.notification.RewardsPushPreferenceDetailsViewModelLegacy$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ RewardsPreferenceDetailsInteractor q;
        public final /* synthetic */ RewardsPushPreferenceDetailsViewModelLegacy r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor, RewardsPushPreferenceDetailsViewModelLegacy rewardsPushPreferenceDetailsViewModelLegacy, Continuation continuation) {
            super(2, continuation);
            this.q = rewardsPreferenceDetailsInteractor;
            this.r = rewardsPushPreferenceDetailsViewModelLegacy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            e eVar = new e(this.r, 23);
            this.p = 1;
            this.q.a(eVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPushPreferenceDetailsViewModelLegacy(RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor, RewardsActivityInteractor rewardsActivityInteractor, AnalyticsManager analyticsManager, NotificationManager notificationManager) {
        super(rewardsPreferenceDetailsInteractor, rewardsActivityInteractor, analyticsManager);
        Intrinsics.h(rewardsActivityInteractor, "rewardsActivityInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(notificationManager, "notificationManager");
        this.p = notificationManager;
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(rewardsPreferenceDetailsInteractor, this, null), 3);
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy, au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        RewardsPreferenceDetailsContractLegacy.ViewState viewState = (RewardsPreferenceDetailsContractLegacy.ViewState) this.l.e();
        if ((viewState != null ? viewState.d : null) == RewardsPreferenceDetailsErrorState.f) {
            this.m.f(RewardsPreferenceDetailsContractLegacy.Actions.GoToPushSettings.f5735a);
        } else {
            p6();
        }
    }

    @Override // au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy
    public final void p6() {
        if (this.p.b(CollectionsKt.Q("1"))) {
            super.p6();
            return;
        }
        this.l.m(new RewardsPreferenceDetailsContractLegacy.ViewState(new ResText(R.string.rewards_push_preferences_title), null, RewardsPreferenceDetailsErrorState.f, 22));
    }
}
