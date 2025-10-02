package au.com.woolworths.shop.lists.data;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/WatchlistInteractor;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WatchlistInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListItemInteractor f12263a;
    public final ShopAccountInteractor b;
    public final ContextScope c;
    public final MutableStateFlow d;
    public final FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 e;
    public final FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 f;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.WatchlistInteractor$1", f = "WatchlistInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.WatchlistInteractor$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = WatchlistInteractor.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            WatchlistInteractor.this.d.f((String) this.p);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/WatchlistInteractor$Companion;", "", "", "WATCHLIST_UPDATE_DELAY", "J", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public WatchlistInteractor(ShoppingListItemInteractor shoppingListItemInteractor, ShopAccountInteractor shopAccountInteractor, ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListItemsLocalRepository shoppingListItemsLocalRepository, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        Intrinsics.h(shoppingListItemsLocalRepository, "shoppingListItemsLocalRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f12263a = shoppingListItemInteractor;
        this.b = shopAccountInteractor;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.c = contextScopeA;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.d = mutableStateFlowA;
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), shoppingListLocalRepository.g), contextScopeA);
        this.e = FlowKt.A(new WatchlistInteractor$watchlistedProductIds$1(shoppingListItemsLocalRepository, null), FlowKt.r(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA)));
        this.f = FlowKt.A(new WatchlistInteractor$watchlistWithItems$1(shoppingListLocalRepository, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA));
    }

    public final void a(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        String strB = b();
        if (strB != null) {
            BuildersKt.c(this.c, null, null, new WatchlistInteractor$addToWatchlist$1$1(this, strB, productCard, null), 3);
        }
    }

    public final String b() {
        return (String) this.d.getValue();
    }

    public final boolean c() {
        return !this.b.d();
    }

    public final void d(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        String strB = b();
        if (strB != null) {
            this.f12263a.d(strB, ProductId.INSTANCE.create(productCard.getProductId()));
        }
    }
}
