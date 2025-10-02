package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.legacy.data.ProductListData;
import au.com.woolworths.pagingutils.NumericPageData;
import java.util.List;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$1", f = "ProductListInteractor.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListBySearchAlternative$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ List x;
    public final /* synthetic */ Activities.ProductList.Extras y;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$1$1", f = "ProductListInteractor.kt", l = {560, 587}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public ProductListData p;
        public int q;
        public final /* synthetic */ ProductListInteractor r;
        public final /* synthetic */ Map s;
        public final /* synthetic */ Integer t;
        public final /* synthetic */ String u;
        public final /* synthetic */ String v;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ List y;
        public final /* synthetic */ Activities.ProductList.Extras z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, Map map, Integer num, String str, String str2, String str3, String str4, List list, Activities.ProductList.Extras extras, Continuation continuation) {
            super(1, continuation);
            this.r = productListInteractor;
            this.s = map;
            this.t = num;
            this.u = str;
            this.v = str2;
            this.w = str3;
            this.x = str4;
            this.y = list;
            this.z = extras;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        
            if (r1 == r14) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r13 = r20
                kotlin.coroutines.intrinsics.CoroutineSingletons r14 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r13.q
                java.lang.Integer r15 = r13.t
                java.util.Map r1 = r13.s
                r2 = 2
                r3 = 1
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r4 = r13.r
                if (r0 == 0) goto L32
                if (r0 == r3) goto L25
                if (r0 != r2) goto L1d
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = r13.p
                kotlin.ResultKt.b(r21)
                r1 = r21
                goto Lc1
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                kotlin.ResultKt.b(r21)
                r0 = r21
                r18 = r1
                r17 = r4
                r16 = r15
                r15 = r2
                goto L7f
            L32:
                kotlin.ResultKt.b(r21)
                au.com.woolworths.feature.product.list.legacy.ProductsListRepository r0 = r4.f5328a
                au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r5 = r4.c
                java.lang.String r8 = r5.f()
                java.lang.Boolean r5 = r4.v()
                java.lang.String r7 = r4.t()
                if (r1 != 0) goto L4d
                java.util.LinkedHashMap r6 = r4.p()
                r9 = r6
                goto L4e
            L4d:
                r9 = r1
            L4e:
                java.lang.String r6 = r13.u
                au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r10 = r4.q(r15, r6)
                java.lang.String r6 = r13.v
                if (r6 != 0) goto L5c
                java.lang.String r6 = r4.r()
            L5c:
                r11 = r6
                r13.q = r3
                r3 = r4
                r4 = r5
                r5 = 0
                r12 = 0
                r6 = r1
                java.lang.String r1 = r13.w
                r16 = r2
                java.lang.String r2 = r13.x
                r17 = r3
                java.lang.Integer r3 = r13.t
                r18 = r6
                java.util.List r6 = r13.y
                r19 = r16
                r16 = r15
                r15 = r19
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r0 != r14) goto L7f
                goto Lc0
            L7f:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r0
                r17.getClass()
                boolean r1 = au.com.woolworths.feature.product.list.legacy.ProductListInteractor.u(r16)
                if (r1 == 0) goto Laf
                au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch r1 = r0.i
                if (r1 == 0) goto L96
                boolean r1 = r1.g
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L94:
                r4 = r1
                goto L98
            L96:
                r1 = 0
                goto L94
            L98:
                java.util.List r5 = r0.g
                if (r18 != 0) goto La2
                java.util.LinkedHashMap r1 = r17.p()
                r6 = r1
                goto La4
            La2:
                r6 = r18
            La4:
                java.util.List r7 = r0.n
                java.util.List r8 = r0.o
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r2 = r13.r
                au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r3 = r13.z
                r2.G(r3, r4, r5, r6, r7, r8)
            Laf:
                java.util.List r1 = r0.b
                if (r1 == 0) goto Lc7
                r13.p = r0
                r13.q = r15
                r1 = 0
                r3 = r17
                java.lang.Object r1 = r3.w(r0, r1, r13)
                if (r1 != r14) goto Lc1
            Lc0:
                return r14
            Lc1:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
                if (r1 != 0) goto Lc6
                return r0
            Lc6:
                return r1
            Lc7:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearchAlternative$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListBySearchAlternative$1(ProductListInteractor productListInteractor, Map map, String str, String str2, String str3, String str4, List list, Activities.ProductList.Extras extras, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = map;
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = list;
        this.y = extras;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        List list = this.x;
        Activities.ProductList.Extras extras = this.y;
        ProductListInteractor$fetchProductListBySearchAlternative$1 productListInteractor$fetchProductListBySearchAlternative$1 = new ProductListInteractor$fetchProductListBySearchAlternative$1(this.r, this.s, this.t, this.u, this.v, this.w, list, extras, (Continuation) obj3);
        productListInteractor$fetchProductListBySearchAlternative$1.q = (Integer) obj;
        return productListInteractor$fetchProductListBySearchAlternative$1.invokeSuspend(Unit.f24250a);
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
        Activities.ProductList.Extras extras = this.y;
        ProductListInteractor productListInteractor = this.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.s, num, this.t, this.u, this.v, this.w, this.x, extras, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
