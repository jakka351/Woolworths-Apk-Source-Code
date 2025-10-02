package au.com.woolworths.shop.rewards;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.rewards.RewardsContractLegacy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1", f = "RewardsViewModelLegacy.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsViewModelLegacy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1(RewardsViewModelLegacy rewardsViewModelLegacy, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsViewModelLegacy$fetchVisitorIdAndShowBoostersIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RewardsContractLegacy.ViewState viewState;
        RewardsViewModelLegacy rewardsViewModelLegacy = this.q;
        RewardsAccountInteractor rewardsAccountInteractor = rewardsViewModelLegacy.e;
        SharedFlowImpl sharedFlowImpl = rewardsViewModelLegacy.g;
        MutableLiveData mutableLiveData = rewardsViewModelLegacy.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsContractLegacy.Actions.ShowBoosters showBoosters = RewardsContractLegacy.Actions.ShowBoosters.f12887a;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    obj = rewardsAccountInteractor.fetchVisitorId(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                rewardsAccountInteractor.setUncachedVisitorId((String) obj);
                viewState = new RewardsContractLegacy.ViewState(false);
            } catch (NoConnectivityException e) {
                Timber.f27013a.a("Visitor ID could not be fetched", e, new Object[0]);
                viewState = new RewardsContractLegacy.ViewState(false);
            } catch (ServerErrorException e2) {
                Timber.f27013a.a("Visitor ID could not be fetched", e2, new Object[0]);
                viewState = new RewardsContractLegacy.ViewState(false);
            }
            mutableLiveData.m(viewState);
            sharedFlowImpl.f(showBoosters);
            return Unit.f24250a;
        } catch (Throwable th) {
            mutableLiveData.m(new RewardsContractLegacy.ViewState(false));
            sharedFlowImpl.f(showBoosters);
            throw th;
        }
    }
}
