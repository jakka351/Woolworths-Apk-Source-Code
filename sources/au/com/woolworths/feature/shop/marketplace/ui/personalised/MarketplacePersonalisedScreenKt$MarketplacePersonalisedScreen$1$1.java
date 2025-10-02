package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.runtime.State;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1", f = "MarketplacePersonalisedScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MarketplacePersonalisedViewModel p;
    public final /* synthetic */ State q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1(MarketplacePersonalisedViewModel marketplacePersonalisedViewModel, State state, Continuation continuation) {
        super(2, continuation);
        this.p = marketplacePersonalisedViewModel;
        this.q = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1 marketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1 = (MarketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        marketplacePersonalisedScreenKt$MarketplacePersonalisedScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MarketplacePersonalised marketplacePersonalisedQ6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Marketplace marketplace = ((MarketplaceContract.ViewState) this.q.getD()).f7493a;
        MarketplacePersonalisedViewModel marketplacePersonalisedViewModel = this.p;
        if (marketplace != null) {
            marketplacePersonalisedViewModel.getClass();
            marketplacePersonalisedQ6 = MarketplacePersonalisedViewModel.q6(marketplace);
        } else {
            marketplacePersonalisedQ6 = null;
        }
        if (marketplacePersonalisedQ6 == null) {
            marketplacePersonalisedViewModel.p6();
        } else {
            marketplacePersonalisedViewModel.s6(marketplacePersonalisedViewModel.j, marketplace.f7468a, marketplacePersonalisedQ6);
        }
        return Unit.f24250a;
    }
}
