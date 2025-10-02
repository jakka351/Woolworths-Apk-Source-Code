package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.Map;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByFacet$1", f = "ProductListInteractor.kt", l = {762}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListByFacet$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Object x;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByFacet$1$1", f = "ProductListInteractor.kt", l = {763}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByFacet$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public int p;
        public final /* synthetic */ ProductListInteractor q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;
        public final /* synthetic */ String v;
        public final /* synthetic */ Object w;
        public final /* synthetic */ Integer x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, String str, String str2, String str3, String str4, String str5, Map map, Integer num, Continuation continuation) {
            super(1, continuation);
            this.q = productListInteractor;
            this.r = str;
            this.s = str2;
            this.t = str3;
            this.u = str4;
            this.v = str5;
            this.w = map;
            this.x = num;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
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
            ProductsListRepository productsListRepository = this.q.f5328a;
            this.p = 1;
            Object objD = productsListRepository.d(this.r, this.s, this.t, this.u, this.v, null, this.w, this.x, this);
            return objD == coroutineSingletons ? coroutineSingletons : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListByFacet$1(ProductListInteractor productListInteractor, String str, String str2, String str3, String str4, String str5, Map map, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = map;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        String str = this.w;
        ?? r7 = this.x;
        ProductListInteractor$fetchProductListByFacet$1 productListInteractor$fetchProductListByFacet$1 = new ProductListInteractor$fetchProductListByFacet$1(this.r, this.s, this.t, this.u, this.v, str, r7, (Continuation) obj3);
        productListInteractor$fetchProductListByFacet$1.q = (Integer) obj;
        return productListInteractor$fetchProductListByFacet$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
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
        ?? r10 = this.x;
        ProductListInteractor productListInteractor = this.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.s, this.t, this.u, this.v, this.w, r10, num, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
