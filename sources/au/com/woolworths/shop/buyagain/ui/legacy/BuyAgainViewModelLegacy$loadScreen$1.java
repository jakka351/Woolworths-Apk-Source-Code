package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.paging.PagedList;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.pagingutils.KeyedPageData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageData;
import au.com.woolworths.pagingutils.Status;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.domain.BuyAgainFooter;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductListPageData;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1", f = "BuyAgainViewModelLegacy.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BuyAgainViewModelLegacy$loadScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BuyAgainViewModelLegacy r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagedList;", "Lau/com/woolworths/product/models/ProductCard;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$1", f = "BuyAgainViewModelLegacy.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<PagedList<ProductCard>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ BuyAgainViewModelLegacy q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BuyAgainViewModelLegacy buyAgainViewModelLegacy, Continuation continuation) {
            super(2, continuation);
            this.q = buyAgainViewModelLegacy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((PagedList) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            PagedList pagedList = (PagedList) this.p;
            BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.q;
            BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, buyAgainViewModelLegacy.l, false, pagedList, null, null, null, null, false, null, 253);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/pagingutils/KeyedPageData;", "", "Lau/com/woolworths/product/models/ProductCard;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$2", f = "BuyAgainViewModelLegacy.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<KeyedPageData<Integer, ProductCard>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ BuyAgainViewModelLegacy q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BuyAgainViewModelLegacy buyAgainViewModelLegacy, Continuation continuation) {
            super(2, continuation);
            this.q = buyAgainViewModelLegacy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((KeyedPageData) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            PageData pageData = ((KeyedPageData) this.p).b;
            Intrinsics.f(pageData, "null cannot be cast to non-null type au.com.woolworths.shop.buyagain.domain.BuyAgainProductListPageData");
            BuyAgainProductListPageData buyAgainProductListPageData = (BuyAgainProductListPageData) pageData;
            BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.q;
            MutableStateFlow mutableStateFlow = buyAgainViewModelLegacy.l;
            String str = buyAgainProductListPageData.f10258a.f10255a;
            BuyAgainFooter buyAgainFooter = buyAgainProductListPageData.b;
            BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, mutableStateFlow, false, null, str, buyAgainFooter.f10254a, buyAgainFooter.b, null, false, null, 227);
            if (buyAgainProductListPageData.d == 0) {
                buyAgainViewModelLegacy.h.g(BuyAgainAnalytics.BuyAgain.Action.k);
                BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, buyAgainViewModelLegacy.l, false, null, null, null, null, null, false, BuyAgainListEmptyStateOld.d, 127);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/pagingutils/NetworkState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$3", f = "BuyAgainViewModelLegacy.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainViewModelLegacy$loadScreen$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<NetworkState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ BuyAgainViewModelLegacy q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BuyAgainViewModelLegacy buyAgainViewModelLegacy, Continuation continuation) {
            super(2, continuation);
            this.q = buyAgainViewModelLegacy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.q, continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((NetworkState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FullPageErrorCause fullPageErrorCause;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            NetworkState networkState = (NetworkState) this.p;
            BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.q;
            BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, buyAgainViewModelLegacy.l, Intrinsics.c(networkState, NetworkState.e), null, null, null, null, null, false, null, 254);
            Status status = networkState.f9174a;
            Throwable th = networkState.c;
            if (status == Status.f) {
                MutableStateFlow mutableStateFlow = buyAgainViewModelLegacy.l;
                AnalyticsManager analyticsManager = buyAgainViewModelLegacy.h;
                if (th instanceof NoConnectivityException) {
                    analyticsManager.g(BuyAgainAnalytics.BuyAgain.Action.m);
                    fullPageErrorCause = BuyAgainListConnectionErrorOld.d;
                } else if (th instanceof ServerErrorException) {
                    analyticsManager.g(BuyAgainAnalytics.BuyAgain.Action.q);
                    fullPageErrorCause = BuyAgainListServerErrorOld.d;
                } else {
                    if (th != null) {
                        throw new IllegalStateException("Unexpected exception caught: " + th);
                    }
                    fullPageErrorCause = null;
                }
                BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, mutableStateFlow, false, null, null, null, null, null, false, fullPageErrorCause, 127);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModelLegacy$loadScreen$1(BuyAgainViewModelLegacy buyAgainViewModelLegacy, Continuation continuation) {
        super(2, continuation);
        this.r = buyAgainViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BuyAgainViewModelLegacy$loadScreen$1 buyAgainViewModelLegacy$loadScreen$1 = new BuyAgainViewModelLegacy$loadScreen$1(this.r, continuation);
        buyAgainViewModelLegacy$loadScreen$1.q = obj;
        return buyAgainViewModelLegacy$loadScreen$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainViewModelLegacy$loadScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BuyAgainViewModelLegacy buyAgainViewModelLegacy = this.r;
        Lazy lazy = buyAgainViewModelLegacy.n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            if (buyAgainViewModelLegacy.i.d()) {
                FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(buyAgainViewModelLegacy, null), FlowLiveDataConversions.a(((NumericPageListing) lazy.getD()).f9175a)), coroutineScope);
                FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(buyAgainViewModelLegacy, null), FlowLiveDataConversions.a(((NumericPageListing) lazy.getD()).f)), coroutineScope);
                FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(buyAgainViewModelLegacy, null), FlowLiveDataConversions.a(((NumericPageListing) lazy.getD()).b)), coroutineScope);
                BuyAgainViewModelLegacy.r6(buyAgainViewModelLegacy, buyAgainViewModelLegacy.l, false, null, null, null, null, null, buyAgainViewModelLegacy.f.z(), null, 191);
            } else {
                BufferedChannel bufferedChannel = buyAgainViewModelLegacy.j;
                this.p = 1;
                if (bufferedChannel.z(BuyAgainContractLegacy.Actions.OpenLogin.f10284a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
