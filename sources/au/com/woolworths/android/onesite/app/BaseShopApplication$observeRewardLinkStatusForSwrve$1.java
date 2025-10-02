package au.com.woolworths.android.onesite.app;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged;
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
@DebugMetadata(c = "au.com.woolworths.android.onesite.app.BaseShopApplication$observeRewardLinkStatusForSwrve$1", f = "BaseShopApplication.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BaseShopApplication$observeRewardLinkStatusForSwrve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BaseShopApplication p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShopApplication$observeRewardLinkStatusForSwrve$1(BaseShopApplication baseShopApplication, Continuation continuation) {
        super(2, continuation);
        this.p = baseShopApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseShopApplication$observeRewardLinkStatusForSwrve$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BaseShopApplication$observeRewardLinkStatusForSwrve$1 baseShopApplication$observeRewardLinkStatusForSwrve$1 = (BaseShopApplication$observeRewardLinkStatusForSwrve$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        baseShopApplication$observeRewardLinkStatusForSwrve$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BaseShopApplication baseShopApplication = this.p;
        Observable rewardCardSourceObservable = baseShopApplication.i().t().getRewardCardSourceObservable();
        rewardCardSourceObservable.getClass();
        new ObservableDistinctUntilChanged(rewardCardSourceObservable).g(new a(8, new d(baseShopApplication, 7)));
        return Unit.f24250a;
    }
}
