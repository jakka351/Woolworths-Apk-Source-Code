package au.com.woolworths.feature.shop.marketplace.ui.facet;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetViewModel$fetchMarketplace$1", f = "MarketplaceFacetViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplaceFacetViewModel$fetchMarketplace$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplaceFacetViewModel q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceFacetViewModel$fetchMarketplace$1(MarketplaceFacetViewModel marketplaceFacetViewModel, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.q = marketplaceFacetViewModel;
        this.r = z;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplaceFacetViewModel$fetchMarketplace$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplaceFacetViewModel$fetchMarketplace$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MarketplaceFacetViewModel marketplaceFacetViewModel = this.q;
        MutableStateFlow mutableStateFlow = marketplaceFacetViewModel.h;
        AnalyticsManager analyticsManager = marketplaceFacetViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                boolean z = this.r;
                this.p = 1;
                obj = marketplaceFacetViewModel.p6(z, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            marketplaceFacetViewModel.u6((Marketplace) obj, this.s);
        } catch (NoConnectivityException unused) {
            analyticsManager.c(MarketplaceActions.NetworkError.f);
            marketplaceFacetViewModel.s6(mutableStateFlow, MarketplaceErrorState.d);
        } catch (ServerErrorException unused2) {
            analyticsManager.c(MarketplaceActions.ServerError.f);
            marketplaceFacetViewModel.s6(mutableStateFlow, MarketplaceErrorState.e);
        }
        return Unit.f24250a;
    }
}
