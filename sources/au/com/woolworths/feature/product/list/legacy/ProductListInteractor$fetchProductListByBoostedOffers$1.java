package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.data.CustomMessage;
import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "<unused var>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByBoostedOffers$1", f = "ProductListInteractor.kt", l = {468}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListByBoostedOffers$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public final /* synthetic */ ProductListInteractor q;
    public final /* synthetic */ String r;
    public final /* synthetic */ List s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByBoostedOffers$1$1", f = "ProductListInteractor.kt", l = {469}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByBoostedOffers$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public int p;
        public final /* synthetic */ ProductListInteractor q;
        public final /* synthetic */ String r;
        public final /* synthetic */ List s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, String str, List list, Continuation continuation) {
            super(1, continuation);
            this.q = productListInteractor;
            this.r = str;
            this.s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            ProductListInteractor productListInteractor = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                ProductsListRepository productsListRepository = productListInteractor.f5328a;
                String strF = productListInteractor.c.f();
                this.p = 1;
                obj = productsListRepository.b(strF, this.r, this.s, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ProductListData productListData = (ProductListData) obj;
            List list = productListData.j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    productListInteractor.p.f((CustomMessage) it.next());
                }
            }
            return ProductListInteractor.a(productListInteractor, productListData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListByBoostedOffers$1(ProductListInteractor productListInteractor, String str, List list, Continuation continuation) {
        super(3, continuation);
        this.q = productListInteractor;
        this.r = str;
        this.s = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        String str = this.r;
        List list = this.s;
        return new ProductListInteractor$fetchProductListByBoostedOffers$1(this.q, str, list, (Continuation) obj3).invokeSuspend(Unit.f24250a);
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
        ProductListInteractor productListInteractor = this.q;
        List list = productListInteractor.q;
        boolean z = list == null || list.isEmpty();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.r, this.s, null);
        this.p = 1;
        Object objB = productListInteractor.b(z, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
