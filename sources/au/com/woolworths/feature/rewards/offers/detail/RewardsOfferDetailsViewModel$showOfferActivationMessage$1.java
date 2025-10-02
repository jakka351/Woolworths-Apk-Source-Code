package au.com.woolworths.feature.rewards.offers.detail;

import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel$showOfferActivationMessage$1", f = "RewardsOfferDetailsViewModelLegacy.kt", l = {444}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsOfferDetailsViewModel$showOfferActivationMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsOfferData q;
    public final /* synthetic */ RewardsOfferDetailsViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferDetailsViewModel$showOfferActivationMessage$1(RewardsOfferData rewardsOfferData, RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOfferData;
        this.r = rewardsOfferDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferDetailsViewModel$showOfferActivationMessage$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferDetailsViewModel$showOfferActivationMessage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsOfferData rewardsOfferData = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (rewardsOfferData.s == OfferActivationAnimationData.CONFETTI) {
                this.p = 1;
                if (DelayKt.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        OfferActivationMessage offerActivationMessage = rewardsOfferData.t;
        if (offerActivationMessage != null) {
            this.r.p.f(new RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationMessage(offerActivationMessage));
        }
        return Unit.f24250a;
    }
}
