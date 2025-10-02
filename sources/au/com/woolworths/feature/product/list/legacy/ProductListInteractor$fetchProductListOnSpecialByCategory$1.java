package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.navigation.Activities;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$1", f = "ProductListInteractor.kt", l = {298}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListOnSpecialByCategory$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Map t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Activities.ProductList.Extras w;
    public final /* synthetic */ boolean x;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$1$1", f = "ProductListInteractor.kt", l = {299, 323}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public ProductListData p;
        public int q;
        public final /* synthetic */ ProductListInteractor r;
        public final /* synthetic */ String s;
        public final /* synthetic */ Integer t;
        public final /* synthetic */ Map u;
        public final /* synthetic */ String v;
        public final /* synthetic */ String w;
        public final /* synthetic */ Activities.ProductList.Extras x;
        public final /* synthetic */ boolean y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, String str, Integer num, Map map, String str2, String str3, Activities.ProductList.Extras extras, boolean z, Continuation continuation) {
            super(1, continuation);
            this.r = productListInteractor;
            this.s = str;
            this.t = num;
            this.u = map;
            this.v = str2;
            this.w = str3;
            this.x = extras;
            this.y = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        
            if (r1 == r10) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r15.q
                java.lang.Integer r11 = r15.t
                java.util.Map r12 = r15.u
                r13 = 2
                r1 = 1
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r14 = r15.r
                if (r0 == 0) goto L29
                if (r0 == r1) goto L23
                if (r0 != r13) goto L1b
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = r15.p
                kotlin.ResultKt.b(r16)
                r1 = r16
                goto L98
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                kotlin.ResultKt.b(r16)
                r0 = r16
                goto L5b
            L29:
                kotlin.ResultKt.b(r16)
                au.com.woolworths.feature.product.list.legacy.ProductsListRepository r0 = r14.f5328a
                au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r2 = r14.c
                java.lang.String r2 = r2.f()
                java.lang.String r4 = r14.t()
                if (r12 != 0) goto L40
                java.util.LinkedHashMap r3 = r14.p()
                r5 = r3
                goto L41
            L40:
                r5 = r12
            L41:
                java.lang.Boolean r6 = r14.v()
                java.lang.String r3 = r15.w
                au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r8 = r14.q(r11, r3)
                r15.q = r1
                java.lang.String r1 = r15.s
                java.lang.Integer r3 = r15.t
                java.lang.String r7 = r15.v
                r9 = r15
                java.lang.Object r0 = r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r10) goto L5b
                goto L97
            L5b:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r0
                r14.getClass()
                boolean r1 = au.com.woolworths.feature.product.list.legacy.ProductListInteractor.u(r11)
                if (r1 == 0) goto L87
                au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch r1 = r0.i
                if (r1 == 0) goto L72
                boolean r1 = r1.g
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L70:
                r4 = r1
                goto L74
            L72:
                r1 = 0
                goto L70
            L74:
                java.util.List r5 = r0.g
                if (r12 != 0) goto L7c
                java.util.LinkedHashMap r12 = r14.p()
            L7c:
                r6 = r12
                java.util.List r7 = r0.n
                r8 = 0
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r2 = r15.r
                au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r3 = r15.x
                r2.G(r3, r4, r5, r6, r7, r8)
            L87:
                java.util.List r1 = r0.b
                if (r1 == 0) goto L9e
                r15.p = r0
                r15.q = r13
                boolean r1 = r15.y
                java.lang.Object r1 = r14.w(r0, r1, r15)
                if (r1 != r10) goto L98
            L97:
                return r10
            L98:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
                if (r1 != 0) goto L9d
                return r0
            L9d:
                return r1
            L9e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListOnSpecialByCategory$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListOnSpecialByCategory$1(ProductListInteractor productListInteractor, String str, Map map, String str2, String str3, Activities.ProductList.Extras extras, boolean z, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = str;
        this.t = map;
        this.u = str2;
        this.v = str3;
        this.w = extras;
        this.x = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        Activities.ProductList.Extras extras = this.w;
        boolean z = this.x;
        ProductListInteractor$fetchProductListOnSpecialByCategory$1 productListInteractor$fetchProductListOnSpecialByCategory$1 = new ProductListInteractor$fetchProductListOnSpecialByCategory$1(this.r, this.s, this.t, this.u, this.v, extras, z, (Continuation) obj3);
        productListInteractor$fetchProductListOnSpecialByCategory$1.q = (Integer) obj;
        return productListInteractor$fetchProductListOnSpecialByCategory$1.invokeSuspend(Unit.f24250a);
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
        boolean z = this.x;
        ProductListInteractor productListInteractor = this.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.s, num, this.t, this.u, this.v, this.w, z, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
