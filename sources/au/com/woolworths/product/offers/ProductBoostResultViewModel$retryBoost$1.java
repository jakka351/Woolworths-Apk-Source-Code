package au.com.woolworths.product.offers;

import java.util.ArrayList;
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
@DebugMetadata(c = "au.com.woolworths.product.offers.ProductBoostResultViewModel$retryBoost$1", f = "ProductBoostResultViewModel.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductBoostResultViewModel$retryBoost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductBoostResultViewModel q;
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ TrackableBoostMetadata s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBoostResultViewModel$retryBoost$1(ProductBoostResultViewModel productBoostResultViewModel, ArrayList arrayList, TrackableBoostMetadata trackableBoostMetadata, Object obj, Continuation continuation) {
        super(2, continuation);
        this.q = productBoostResultViewModel;
        this.r = arrayList;
        this.s = trackableBoostMetadata;
        this.t = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductBoostResultViewModel$retryBoost$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductBoostResultViewModel$retryBoost$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProductBoostInteractor productBoostInteractor = this.q.e;
            this.p = 1;
            if (ProductBoostInteractor.b(productBoostInteractor, this.r, this.s, this.t, null, this, 16) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
