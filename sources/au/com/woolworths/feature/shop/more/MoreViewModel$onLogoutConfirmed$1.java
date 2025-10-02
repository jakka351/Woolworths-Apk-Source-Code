package au.com.woolworths.feature.shop.more;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.base.shopapp.events.LogoutStatusEvent;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableCache;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel$onLogoutConfirmed$1", f = "MoreViewModel.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MoreViewModel$onLogoutConfirmed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MoreViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$onLogoutConfirmed$1(MoreViewModel moreViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreViewModel$onLogoutConfirmed$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreViewModel$onLogoutConfirmed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MoreViewModel moreViewModel = this.q;
        MoreInteractor moreInteractor = moreViewModel.l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (moreInteractor.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        CollectionModeInteractor collectionModeInteractor = moreViewModel.n;
        collectionModeInteractor.M(-1);
        if (!collectionModeInteractor.w().equals(CollectionMode.InStore.d)) {
            collectionModeInteractor.l(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard), false);
            collectionModeInteractor.r(null);
        }
        CompositeDisposable compositeDisposable = moreViewModel.x;
        CompletableObserveOn completableObserveOn = new CompletableObserveOn(new CompletableCache(moreInteractor.f7604a.e()), moreViewModel.h.b());
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(new j(1, new c(moreViewModel, 1)), new i(moreViewModel, 1));
        completableObserveOn.a(callbackCompletableObserver);
        DisposableKt.a(compositeDisposable, callbackCompletableObserver);
        RxBus rxBusA = RxBus.a();
        rxBusA.f4592a.onNext(LogoutStatusEvent.f4618a);
        return Unit.f24250a;
    }
}
