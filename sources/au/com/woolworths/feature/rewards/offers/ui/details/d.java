package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function f;

    public /* synthetic */ d(OfferDetailsPageResponse offerDetailsPageResponse, Function function, int i) {
        this.d = i;
        this.e = offerDetailsPageResponse;
        this.f = function;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                final OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = (OfferDetailsPageResponse.OfferDetailsPage) this.e;
                final Function2 function2 = (Function2) this.f;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1$3$1$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        LazyItemScope item = (LazyItemScope) obj2;
                        Composer composer = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            Modifier.Companion companion = Modifier.Companion.d;
                            OfferDetailsScreenKt.f(offerDetailsPage.f6337a, SizeKt.e(companion, 1.0f), function2, composer, 48);
                            SpacerKt.a(composer, SizeKt.g(companion, 4));
                        }
                        return Unit.f24250a;
                    }
                }, true, 336701438), 3);
                for (OfferDetailsContentItem offerDetailsContentItem : offerDetailsPage.b) {
                    if (!(offerDetailsContentItem instanceof OfferDetailsContentItem.OfferDetailsCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final OfferDetailsContentItem.OfferDetailsCard offerDetailsCard = (OfferDetailsContentItem.OfferDetailsCard) offerDetailsContentItem;
                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1$3$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            LazyItemScope item = (LazyItemScope) obj2;
                            Composer composer = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                OfferDetailsScreenKt.a(offerDetailsCard, null, composer, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, true, -1453576475), 3);
                }
                return Unit.f24250a;
            case 1:
                OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState = (OfferDetailsPageResponse.RewardsErrorEmptyState) this.e;
                Function1 function1 = (Function1) this.f;
                Intrinsics.h((EmptyStateButtonData) obj, "it");
                ContentCta contentCta = rewardsErrorEmptyState.d;
                if (contentCta != null) {
                    function1.invoke(contentCta);
                }
                return Unit.f24250a;
            default:
                Function2 function22 = (Function2) this.f;
                BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) this.e;
                ActionData it = (ActionData) obj;
                Intrinsics.h(it, "it");
                function22.invoke(basicCoreBroadcastBannerModel.b, it);
                return Unit.f24250a;
        }
    }

    public /* synthetic */ d(Function2 function2, BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel) {
        this.d = 2;
        this.f = function2;
        this.e = basicCoreBroadcastBannerModel;
    }
}
