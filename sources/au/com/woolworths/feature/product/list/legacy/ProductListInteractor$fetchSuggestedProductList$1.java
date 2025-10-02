package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.pagingutils.NumericPageData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "", "nextPageKey", "", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchSuggestedProductList$1", f = "ProductListInteractor.kt", l = {703}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchSuggestedProductList$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ String s;
    public final /* synthetic */ int t;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchSuggestedProductList$1$1", f = "ProductListInteractor.kt", l = {704}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchSuggestedProductList$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public ProductListInteractor p;
        public int q;
        public final /* synthetic */ ProductListInteractor r;
        public final /* synthetic */ String s;
        public final /* synthetic */ int t;
        public final /* synthetic */ Integer u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, String str, int i, Integer num, Continuation continuation) {
            super(1, continuation);
            this.r = productListInteractor;
            this.s = str;
            this.t = i;
            this.u = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            ProductListInteractor productListInteractor;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                ProductListInteractor productListInteractor2 = this.r;
                ProductsListRepository productsListRepository = productListInteractor2.f5328a;
                Integer num = new Integer(50);
                this.p = productListInteractor2;
                this.q = 1;
                Object objJ = productsListRepository.j(this.s, this.t, this.u, num, this);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productListInteractor = productListInteractor2;
                obj = objJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productListInteractor = this.p;
                ResultKt.b(obj);
            }
            return ProductListInteractor.a(productListInteractor, (ProductListData) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchSuggestedProductList$1(ProductListInteractor productListInteractor, String str, int i, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = str;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        String str = this.s;
        int i = this.t;
        ProductListInteractor$fetchSuggestedProductList$1 productListInteractor$fetchSuggestedProductList$1 = new ProductListInteractor$fetchSuggestedProductList$1(this.r, str, i, (Continuation) obj3);
        productListInteractor$fetchSuggestedProductList$1.q = (Integer) obj;
        return productListInteractor$fetchSuggestedProductList$1.invokeSuspend(Unit.f24250a);
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
        Integer num = this.q;
        int i2 = this.t;
        ProductListInteractor productListInteractor = this.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.s, i2, num, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
