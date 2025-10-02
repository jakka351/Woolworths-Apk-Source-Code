package au.com.woolworths.feature.shop.more;

import au.com.woolworths.feature.shop.more.MoreContract;
import au.com.woolworths.feature.shop.more.data.MoreFeed;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel$onUnlinkRewardsSuccess$1", f = "MoreViewModel.kt", l = {471}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MoreViewModel$onUnlinkRewardsSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MoreViewModel p;
    public int q;
    public final /* synthetic */ MoreViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$onUnlinkRewardsSuccess$1(MoreViewModel moreViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreViewModel$onUnlinkRewardsSuccess$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreViewModel$onUnlinkRewardsSuccess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MoreViewModel moreViewModel;
        MoreViewModel moreViewModel2 = this.r;
        SharedFlowImpl sharedFlowImpl = moreViewModel2.v;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MoreInteractor moreInteractor = moreViewModel2.l;
                this.p = moreViewModel2;
                this.q = 1;
                obj = moreInteractor.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                moreViewModel = moreViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                moreViewModel = this.p;
                ResultKt.b(obj);
            }
            moreViewModel.C = (MoreFeed) obj;
            sharedFlowImpl.f(new MoreContract.Actions.RewardsUnlinkMessage(com.woolworths.R.string.rewards_removed_mesg));
            moreViewModel2.r6(Boolean.FALSE);
            return Unit.f24250a;
        } catch (Throwable th) {
            sharedFlowImpl.f(new MoreContract.Actions.RewardsUnlinkMessage(com.woolworths.R.string.rewards_removed_mesg));
            moreViewModel2.r6(Boolean.FALSE);
            throw th;
        }
    }
}
