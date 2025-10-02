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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$1", f = "ProductListInteractor.kt", l = {394}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListBySearch$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<Object>>, Object> {
    public final /* synthetic */ Activities.ProductList.Extras A;
    public final /* synthetic */ boolean B;
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ ProductListInteractor r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ List t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ boolean z;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/legacy/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$1$1", f = "ProductListInteractor.kt", l = {395, 423}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ Activities.ProductList.Extras B;
        public final /* synthetic */ boolean C;
        public ProductListData p;
        public int q;
        public final /* synthetic */ ProductListInteractor r;
        public final /* synthetic */ Map s;
        public final /* synthetic */ List t;
        public final /* synthetic */ Integer u;
        public final /* synthetic */ String v;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ String y;
        public final /* synthetic */ List z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListInteractor productListInteractor, Map map, List list, Integer num, String str, String str2, String str3, String str4, List list2, boolean z, Activities.ProductList.Extras extras, boolean z2, Continuation continuation) {
            super(1, continuation);
            this.r = productListInteractor;
            this.s = map;
            this.t = list;
            this.u = num;
            this.v = str;
            this.w = str2;
            this.x = str3;
            this.y = str4;
            this.z = list2;
            this.A = z;
            this.B = extras;
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

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        
            if (r1 == r14) goto L40;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListBySearch$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListBySearch$1(ProductListInteractor productListInteractor, Map map, List list, String str, String str2, String str3, String str4, List list2, boolean z, Activities.ProductList.Extras extras, boolean z2, Continuation continuation) {
        super(3, continuation);
        this.r = productListInteractor;
        this.s = map;
        this.t = list;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
        this.y = list2;
        this.z = z;
        this.A = extras;
        this.B = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        Activities.ProductList.Extras extras = this.A;
        boolean z = this.B;
        ProductListInteractor$fetchProductListBySearch$1 productListInteractor$fetchProductListBySearch$1 = new ProductListInteractor$fetchProductListBySearch$1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, extras, z, (Continuation) obj3);
        productListInteractor$fetchProductListBySearch$1.q = (Integer) obj;
        return productListInteractor$fetchProductListBySearch$1.invokeSuspend(Unit.f24250a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListInteractor, this.s, this.t, num, this.u, this.v, this.w, this.x, this.y, this.z, this.A, z, null);
        this.p = 1;
        Object objB = productListInteractor.b(false, anonymousClass1, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
