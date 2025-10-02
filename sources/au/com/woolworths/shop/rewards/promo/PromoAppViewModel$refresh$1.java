package au.com.woolworths.shop.rewards.promo;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.shop.rewards.promo.PromoRewardsAppContract;
import au.com.woolworths.shop.rewards.promo.domain.PromoRewardsAppInteractor;
import au.com.woolworths.shop.rewards.promo.domain.data.RewardsAppModalType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.promo.PromoAppViewModel$refresh$1", f = "PromoAppViewModel.kt", l = {41}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class PromoAppViewModel$refresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PromoAppViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoAppViewModel$refresh$1(PromoAppViewModel promoAppViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = promoAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoAppViewModel$refresh$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoAppViewModel$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        PromoAppViewModel promoAppViewModel = this.q;
        MutableStateFlow mutableStateFlow = promoAppViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    do {
                        value6 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value6, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value6, true, null, null, 4)));
                    PromoRewardsAppInteractor promoRewardsAppInteractor = promoAppViewModel.e;
                    this.p = 1;
                    obj = promoRewardsAppInteractor.f12914a.a(RewardsAppModalType.d, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                RewardsAppModalData rewardsAppModalData = (RewardsAppModalData) obj;
                do {
                    value7 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value7, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value7, false, null, rewardsAppModalData, 3)));
                do {
                    value8 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value8, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value8, false, null, null, 6)));
            } catch (NoConnectivityException unused) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value3, false, FullPageMessage.Error.ConnectionError.f8915a, null, 5)));
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value4, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value4, false, null, null, 6)));
            } catch (ServerErrorException unused2) {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value, false, FullPageMessage.Error.ServerError.f8916a, null, 5)));
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value2, false, null, null, 6)));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            do {
                value5 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value5, PromoRewardsAppContract.ViewState.a((PromoRewardsAppContract.ViewState) value5, false, null, null, 6)));
            throw th;
        }
    }
}
