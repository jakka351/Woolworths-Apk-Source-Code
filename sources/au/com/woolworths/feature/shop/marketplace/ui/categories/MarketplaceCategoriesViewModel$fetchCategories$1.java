package au.com.woolworths.feature.shop.marketplace.ui.categories;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import au.com.woolworths.shop.graphql.type.MarketplaceLandingPageName;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesViewModel$fetchCategories$1", f = "MarketplaceCategoriesViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplaceCategoriesViewModel$fetchCategories$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplaceCategoriesViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceCategoriesViewModel$fetchCategories$1(MarketplaceCategoriesViewModel marketplaceCategoriesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = marketplaceCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplaceCategoriesViewModel$fetchCategories$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplaceCategoriesViewModel$fetchCategories$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MarketplaceCategoriesViewModel marketplaceCategoriesViewModel = this.q;
        AnalyticsManager analyticsManager = marketplaceCategoriesViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MarketplaceCategoriesViewModel.s6(marketplaceCategoriesViewModel.h, true, null);
                MarketplaceInteractor marketplaceInteractor = marketplaceCategoriesViewModel.f;
                this.p = 1;
                obj = marketplaceInteractor.f7495a.a(MarketplaceLandingPageName.i, false, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            MarketplaceCategoriesViewModel.q6(marketplaceCategoriesViewModel, marketplaceCategoriesViewModel.h, MarketplaceCategoriesViewModel.p6(marketplaceCategoriesViewModel, (Marketplace) obj));
        } catch (NoConnectivityException unused) {
            analyticsManager.c(MarketplaceActions.NetworkError.f);
            MarketplaceCategoriesViewModel.s6(marketplaceCategoriesViewModel.h, false, MarketplaceErrorState.d);
        } catch (ServerErrorException unused2) {
            analyticsManager.c(MarketplaceActions.ServerError.f);
            MarketplaceCategoriesViewModel.s6(marketplaceCategoriesViewModel.h, false, MarketplaceErrorState.e);
        }
        return Unit.f24250a;
    }
}
