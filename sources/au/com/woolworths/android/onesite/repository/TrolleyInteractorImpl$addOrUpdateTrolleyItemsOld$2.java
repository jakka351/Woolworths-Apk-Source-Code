package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyUpdateData;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.android.onesite.network.TrolleyUrlUtil;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleResumeNext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2", f = "TrolleyInteractorImpl.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TrolleyResult>, Object> {
    public int p;
    public final /* synthetic */ TrolleyInteractorImpl q;
    public final /* synthetic */ TrolleyUpdateData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2(TrolleyInteractorImpl trolleyInteractorImpl, TrolleyUpdateData trolleyUpdateData, Continuation continuation) {
        super(2, continuation);
        this.q = trolleyInteractorImpl;
        this.r = trolleyUpdateData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TrolleyInteractorImpl$addOrUpdateTrolleyItemsOld$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            return obj;
        }
        ResultKt.b(obj);
        TrolleyInteractorImpl trolleyInteractorImpl = this.q;
        ApiInterface apiInterface = trolleyInteractorImpl.e;
        String str = TrolleyUrlUtil.a(trolleyInteractorImpl.g, trolleyInteractorImpl.j) + "/items";
        Intrinsics.g(str, "getAddOrUpdateTrolleyUrl(...)");
        SingleFlatMap singleFlatMap = new SingleFlatMap(new SingleResumeNext(new SingleMap(apiInterface.g(str, this.r).h(trolleyInteractorImpl.h.d()), new e(new a(trolleyInteractorImpl, 0), 13)), new e(new a(trolleyInteractorImpl, 1), 14)), new e(new b(0), 15));
        this.p = 1;
        Object objB = RxAwaitKt.b(singleFlatMap, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
