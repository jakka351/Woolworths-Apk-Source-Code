package au.com.woolworths.shop.cart.ui.quickadd;

import au.com.woolworths.shop.cart.domain.interactor.QuickAddOfferInteractor;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/cart/domain/model/PageResult;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel$loadOffers$2", f = "QuickAddOfferViewModel.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class QuickAddOfferViewModel$loadOffers$2 extends SuspendLambda implements Function1<Continuation<? super PageResult<? extends OfferProductList>>, Object> {
    public int p;
    public final /* synthetic */ QuickAddOfferViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAddOfferViewModel$loadOffers$2(QuickAddOfferViewModel quickAddOfferViewModel, Continuation continuation) {
        super(1, continuation);
        this.q = quickAddOfferViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QuickAddOfferViewModel$loadOffers$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QuickAddOfferViewModel$loadOffers$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
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
        QuickAddOfferViewModel quickAddOfferViewModel = this.q;
        QuickAddOfferInteractor quickAddOfferInteractor = quickAddOfferViewModel.f;
        String str = quickAddOfferViewModel.e;
        this.p = 1;
        Object objA = quickAddOfferInteractor.a(str, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
