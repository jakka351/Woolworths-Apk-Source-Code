package au.com.woolworths.feature.rewards.offers.listpage.ui;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.feature.rewards.offers.ActivityOfferExtKt;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.listpage.ui.OffersListPageScreenKt$OffersListPageScreen$19$1", f = "OffersListPageScreen.kt", l = {284}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OffersListPageScreenKt$OffersListPageScreen$19$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OffersListPageContract.ViewState q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersListPageScreenKt$OffersListPageScreen$19$1(OffersListPageContract.ViewState viewState, Context context, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = viewState;
        this.r = context;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OffersListPageScreenKt$OffersListPageScreen$19$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OffersListPageScreenKt$OffersListPageScreen$19$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfferActivationMessage offerActivationMessage;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Context context = this.r;
        OffersListPageContract.ViewState viewState = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            RewardsOfferData rewardsOfferData = viewState.i;
            Boolean boolValueOf = Boolean.valueOf((rewardsOfferData != null ? rewardsOfferData.s : null) == OfferActivationAnimationData.CONFETTI);
            MutableState mutableState = this.s;
            mutableState.setValue(boolValueOf);
            HapticExtKt.c(ContextExtKt.b(context));
            if (((Boolean) mutableState.getD()).booleanValue()) {
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
        RewardsOfferData rewardsOfferData2 = viewState.i;
        if (rewardsOfferData2 != null && (offerActivationMessage = rewardsOfferData2.t) != null) {
            ActivityOfferExtKt.a(context, offerActivationMessage);
        }
        return Unit.f24250a;
    }
}
