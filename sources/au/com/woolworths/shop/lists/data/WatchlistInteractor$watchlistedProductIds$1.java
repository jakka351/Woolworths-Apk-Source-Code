package au.com.woolworths.shop.lists.data;

import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lau/com/woolworths/product/models/ProductId;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1", f = "WatchlistInteractor.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class WatchlistInteractor$watchlistedProductIds$1 extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends List<? extends ProductId>>>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListItemsLocalRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistInteractor$watchlistedProductIds$1(ShoppingListItemsLocalRepository shoppingListItemsLocalRepository, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WatchlistInteractor$watchlistedProductIds$1 watchlistInteractor$watchlistedProductIds$1 = new WatchlistInteractor$watchlistedProductIds$1(this.q, continuation);
        watchlistInteractor$watchlistedProductIds$1.p = obj;
        return watchlistInteractor$watchlistedProductIds$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WatchlistInteractor$watchlistedProductIds$1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        final Flow flowO = FlowKt.o(this.q.o((String) this.p), 100L);
        return new Flow<List<? extends ProductId>>() { // from class: au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2", f = "WatchlistInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2$1 r0 = (au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2$1 r0 = new au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L64
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r6 = new java.util.ArrayList
                        r2 = 10
                        int r2 = kotlin.collections.CollectionsKt.s(r5, r2)
                        r6.<init>(r2)
                        java.util.Iterator r5 = r5.iterator()
                    L45:
                        boolean r2 = r5.hasNext()
                        if (r2 == 0) goto L59
                        java.lang.Object r2 = r5.next()
                        au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r2 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r2
                        au.com.woolworths.product.models.ProductId r2 = r2.getProductId()
                        r6.add(r2)
                        goto L45
                    L59:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L64
                        return r1
                    L64:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.WatchlistInteractor$watchlistedProductIds$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowO.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
    }
}
