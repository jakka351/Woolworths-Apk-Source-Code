package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceTab;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel;
import au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$fetchMarketplaceData$1", f = "MarketplaceViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplaceViewModel$fetchMarketplaceData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplaceViewModel q;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$fetchMarketplaceData$1$1", f = "MarketplaceViewModel.kt", l = {37}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel$fetchMarketplaceData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ MarketplaceViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketplaceViewModel marketplaceViewModel, Continuation continuation) {
            super(1, continuation);
            this.q = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object category;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            MarketplaceViewModel marketplaceViewModel = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                MarketplaceInteractor marketplaceInteractor = marketplaceViewModel.f;
                this.p = 1;
                obj = marketplaceInteractor.f7495a.a(MarketplaceLandingPageName.g, true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Marketplace marketplace = (Marketplace) obj;
            MutableStateFlow mutableStateFlow = marketplaceViewModel.g;
            ArrayList arrayList = null;
            if (marketplace != null) {
                ArrayList<MarketplaceTab> arrayList2 = marketplace.f7468a.f7467a;
                ArrayList arrayList3 = new ArrayList();
                for (MarketplaceTab marketplaceTab : arrayList2) {
                    au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceLandingPageName marketplaceLandingPageName = marketplaceTab.f7476a;
                    String str = marketplaceTab.b;
                    switch (MarketplaceViewModel.WhenMappings.f7496a[marketplaceLandingPageName.ordinal()]) {
                        case 1:
                            category = new MarketplaceContract.Tab.Category(str);
                            break;
                        case 2:
                            category = new MarketplaceContract.Tab.Brand(str);
                            break;
                        case 3:
                            category = new MarketplaceContract.Tab.Seller(str);
                            break;
                        case 4:
                            category = new MarketplaceContract.Tab.Personalised(str);
                            break;
                        case 5:
                        case 6:
                            category = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (category != null) {
                        arrayList3.add(category);
                    }
                }
                arrayList = arrayList3;
            }
            mutableStateFlow.setValue(new MarketplaceContract.ViewState(marketplace, arrayList, false, ((MarketplaceContract.ViewState) mutableStateFlow.getValue()).d));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceViewModel$fetchMarketplaceData$1(MarketplaceViewModel marketplaceViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = marketplaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplaceViewModel$fetchMarketplaceData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplaceViewModel$fetchMarketplaceData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplaceViewModel marketplaceViewModel = this.q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(marketplaceViewModel, null);
            this.p = 1;
            if (MarketplaceViewModel.p6(marketplaceViewModel, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
