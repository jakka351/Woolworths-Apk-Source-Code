package au.com.woolworths.feature.rewards.card.unlock;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.card.analytics.UnlockChristmasFundsActionData;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContract;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel$unlockFunds$1", f = "UnlockChristmasFundsViewModel.kt", l = {71, 73}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UnlockChristmasFundsViewModel$unlockFunds$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ UnlockChristmasFundsViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockChristmasFundsViewModel$unlockFunds$1(UnlockChristmasFundsViewModel unlockChristmasFundsViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = unlockChristmasFundsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnlockChristmasFundsViewModel$unlockFunds$1 unlockChristmasFundsViewModel$unlockFunds$1 = new UnlockChristmasFundsViewModel$unlockFunds$1(this.r, continuation);
        unlockChristmasFundsViewModel$unlockFunds$1.q = obj;
        return unlockChristmasFundsViewModel$unlockFunds$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UnlockChristmasFundsViewModel$unlockFunds$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredA;
        RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation;
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel = this.r;
        SharedFlowImpl sharedFlowImpl = unlockChristmasFundsViewModel.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        UnlockChristmasFundsContract.Actions.ShowError showError = UnlockChristmasFundsContract.Actions.ShowError.f5839a;
        try {
        } catch (NoConnectivityException unused) {
            UnlockChristmasFundsViewModel.q6(unlockChristmasFundsViewModel, unlockChristmasFundsViewModel.g, UnlockChristmasFundsContract.UnlockState.d, null, 6);
            sharedFlowImpl.f(showError);
        } catch (ServerErrorException unused2) {
            UnlockChristmasFundsViewModel.q6(unlockChristmasFundsViewModel, unlockChristmasFundsViewModel.g, UnlockChristmasFundsContract.UnlockState.d, null, 6);
            sharedFlowImpl.f(showError);
        }
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            UnlockChristmasFundsViewModel.q6(unlockChristmasFundsViewModel, unlockChristmasFundsViewModel.g, UnlockChristmasFundsContract.UnlockState.e, null, 6);
            deferredA = BuildersKt.a(coroutineScope, null, new UnlockChristmasFundsViewModel$unlockFunds$1$minimumDuration$1(2, null), 3);
            UnlockChristmasFundsInteractor unlockChristmasFundsInteractor = unlockChristmasFundsViewModel.e;
            this.q = deferredA;
            this.p = 1;
            UnlockChristmasFundsRepository unlockChristmasFundsRepository = unlockChristmasFundsInteractor.f5842a;
            unlockChristmasFundsRepository.b.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            obj = BuildersKt.f(DefaultIoScheduler.f, new UnlockChristmasFundsRepository$unlockFunds$2(unlockChristmasFundsRepository, null), this);
            if (obj == coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rewardsRedemptionUnlockConfirmation = (RewardsRedemptionUnlockConfirmation) this.q;
            ResultKt.b(obj);
            UnlockChristmasFundsViewModel.q6(unlockChristmasFundsViewModel, unlockChristmasFundsViewModel.g, UnlockChristmasFundsContract.UnlockState.f, rewardsRedemptionUnlockConfirmation, 2);
            sharedFlowImpl.f(UnlockChristmasFundsContract.Actions.ShowConfetti.f5838a);
            unlockChristmasFundsViewModel.f.c(new UnlockChristmasFundsActionData.FundsReleased(rewardsRedemptionUnlockConfirmation.getAnalyticsLabel()));
            return Unit.f24250a;
        }
        deferredA = (Deferred) this.q;
        ResultKt.b(obj);
        RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation2 = (RewardsRedemptionUnlockConfirmation) obj;
        this.q = rewardsRedemptionUnlockConfirmation2;
        this.p = 2;
        if (deferredA.await(this) != coroutineSingletons) {
            rewardsRedemptionUnlockConfirmation = rewardsRedemptionUnlockConfirmation2;
            UnlockChristmasFundsViewModel.q6(unlockChristmasFundsViewModel, unlockChristmasFundsViewModel.g, UnlockChristmasFundsContract.UnlockState.f, rewardsRedemptionUnlockConfirmation, 2);
            sharedFlowImpl.f(UnlockChristmasFundsContract.Actions.ShowConfetti.f5838a);
            unlockChristmasFundsViewModel.f.c(new UnlockChristmasFundsActionData.FundsReleased(rewardsRedemptionUnlockConfirmation.getAnalyticsLabel()));
            return Unit.f24250a;
        }
        return coroutineSingletons;
    }
}
