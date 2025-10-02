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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$1", f = "ProductListInteractor.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListByProductGroup$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public final /* synthetic */ Map A;
    public final /* synthetic */ boolean B;
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ List x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Activities.ProductList.Extras z;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$1$1", f = "ProductListInteractor.kt", l = {655, 683}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public final /* synthetic */ Activities.ProductList.Extras A;
        public final /* synthetic */ Map B;
        public final /* synthetic */ boolean C;
        public ProductListData p;
        public int q;
        public final /* synthetic */ ProductListInteractor r;
        public final /* synthetic */ Integer s;
        public final /* synthetic */ String t;
        public final /* synthetic */ String u;
        public final /* synthetic */ String v;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ List y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, Integer num, String str, String str2, String str3, String str4, String str5, List list, boolean z, Activities.ProductList.Extras extras, Map map, boolean z2, Continuation continuation) {
            super(1, continuation);
            this.r = productListInteractor;
            this.s = num;
            this.t = str;
            this.u = str2;
            this.v = str3;
            this.w = str4;
            this.x = str5;
            this.y = list;
            this.z = z;
            this.A = extras;
            this.B = map;
            this.C = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
        
            if (r1 == r14) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r13 = r19
                kotlin.coroutines.intrinsics.CoroutineSingletons r14 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r13.q
                java.lang.Integer r15 = r13.s
                r1 = 2
                r2 = 1
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r3 = r13.r
                if (r0 == 0) goto L2e
                if (r0 == r2) goto L23
                if (r0 != r1) goto L1b
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = r13.p
                kotlin.ResultKt.b(r20)
                r1 = r20
                goto Lb7
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                kotlin.ResultKt.b(r20)
                r0 = r20
                r16 = r3
                r18 = r15
                r15 = r1
                goto L75
            L2e:
                kotlin.ResultKt.b(r20)
                au.com.woolworths.feature.product.list.legacy.ProductsListRepository r0 = r3.f5328a
                java.lang.Boolean r4 = r3.v()
                java.util.LinkedHashMap r9 = r3.p()
                java.lang.String r7 = r3.t()
                java.lang.String r5 = r13.t
                au.com.woolworths.shop.graphql.type.ChipsProductListInputArgs r10 = r3.q(r15, r5)
                java.lang.String r5 = r13.u
                if (r5 != 0) goto L4d
                java.lang.String r5 = r3.r()
            L4d:
                r11 = r5
                au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r5 = r3.c
                java.lang.String r8 = r5.f()
                r13.q = r2
                r2 = r1
                java.lang.String r1 = r13.v
                r5 = r2
                java.lang.String r2 = r13.w
                r6 = r3
                java.lang.Integer r3 = r13.s
                r12 = r5
                java.lang.String r5 = r13.x
                r16 = r6
                java.util.List r6 = r13.y
                r17 = r12
                boolean r12 = r13.z
                r18 = r15
                r15 = r17
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r0 != r14) goto L75
                goto Lb6
            L75:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r0 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r0
                r16.getClass()
                boolean r1 = au.com.woolworths.feature.product.list.legacy.ProductListInteractor.u(r18)
                if (r1 == 0) goto La4
                au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch r1 = r0.i
                if (r1 == 0) goto L8c
                boolean r1 = r1.g
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L8a:
                r4 = r1
                goto L8e
            L8c:
                r1 = 0
                goto L8a
            L8e:
                java.util.List r5 = r0.g
                java.util.Map r1 = r13.B
                if (r1 != 0) goto L98
                java.util.LinkedHashMap r1 = r16.p()
            L98:
                r6 = r1
                java.util.List r7 = r0.n
                java.util.List r8 = r0.o
                au.com.woolworths.feature.product.list.legacy.ProductListInteractor r2 = r13.r
                au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras r3 = r13.A
                r2.G(r3, r4, r5, r6, r7, r8)
            La4:
                java.util.List r1 = r0.b
                if (r1 == 0) goto Lbd
                r13.p = r0
                r13.q = r15
                boolean r1 = r13.C
                r6 = r16
                java.lang.Object r1 = r6.w(r0, r1, r13)
                if (r1 != r14) goto Lb7
            Lb6:
                return r14
            Lb7:
                au.com.woolworths.feature.product.list.legacy.data.ProductListData r1 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r1
                if (r1 != 0) goto Lbc
                return r0
            Lbc:
                return r1
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductGroup$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListByProductGroup$1(ProductListInteractor productListInteractor, String str, String str2, String str3, String str4, String str5, List list, boolean z, Activities.ProductList.Extras extras, Map map, boolean z2, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = list;
        this.y = z;
        this.z = extras;
        this.A = map;
        this.B = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        Map map = this.A;
        boolean z = this.B;
        ProductListInteractor$fetchProductListByProductGroup$1 productListInteractor$fetchProductListByProductGroup$1 = new ProductListInteractor$fetchProductListByProductGroup$1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, map, z, (Continuation) obj3);
        productListInteractor$fetchProductListByProductGroup$1.q = (Integer) obj;
        return productListInteractor$fetchProductListByProductGroup$1.invokeSuspend(Unit.f24250a);
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
        boolean z = this.B;
        ProductListInteractor productListInteractor = this.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, num, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, z, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
