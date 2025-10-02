package au.com.woolworths.feature.rewards.card.unlock;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.card.analytics.UnlockChristmasFundsActionData;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContractV2;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModelV2$unlockChristmasFund$1", f = "UnlockChristmasFundsViewModelV2.kt", l = {37}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class UnlockChristmasFundsViewModelV2$unlockChristmasFund$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ UnlockChristmasFundsViewModelV2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockChristmasFundsViewModelV2$unlockChristmasFund$1(UnlockChristmasFundsViewModelV2 unlockChristmasFundsViewModelV2, Continuation continuation) {
        super(2, continuation);
        this.q = unlockChristmasFundsViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnlockChristmasFundsViewModelV2$unlockChristmasFund$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UnlockChristmasFundsViewModelV2$unlockChristmasFund$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        UnlockChristmasFundsViewModelV2 unlockChristmasFundsViewModelV2 = this.q;
        MutableStateFlow mutableStateFlow = unlockChristmasFundsViewModelV2.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value3, null, false, true, false, false, 23)));
                UnlockChristmasFundsInteractor unlockChristmasFundsInteractor = unlockChristmasFundsViewModelV2.e;
                this.p = 1;
                UnlockChristmasFundsRepository unlockChristmasFundsRepository = unlockChristmasFundsInteractor.f5842a;
                unlockChristmasFundsRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new UnlockChristmasFundsRepository$unlockFunds$2(unlockChristmasFundsRepository, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation = (RewardsRedemptionUnlockConfirmation) obj;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value4, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value4, rewardsRedemptionUnlockConfirmation, true, false, true, false, 33)));
            unlockChristmasFundsViewModelV2.g.c(new UnlockChristmasFundsActionData.FundsReleased(rewardsRedemptionUnlockConfirmation.getAnalyticsLabel()));
            unlockChristmasFundsViewModelV2.f.notifyValueChanged();
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value2, null, true, false, false, true, 19)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value, null, true, false, false, true, 19)));
        }
        return Unit.f24250a;
    }
}
