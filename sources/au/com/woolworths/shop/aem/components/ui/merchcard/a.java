package au.com.woolworths.shop.aem.components.ui.merchcard;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.morecard.MoreCardData;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import au.com.woolworths.shop.buyagain.ui.composable.ComposableSingletons$ProductTileSkeletonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AnalyticsData it = (AnalyticsData) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                ActionData it2 = (ActionData) obj;
                Intrinsics.h(it2, "it");
                break;
            case 2:
                AnalyticsData it3 = (AnalyticsData) obj;
                Intrinsics.h(it3, "it");
                break;
            case 3:
                ActionData it4 = (ActionData) obj;
                Intrinsics.h(it4, "it");
                break;
            case 4:
                MoreCardData it5 = (MoreCardData) obj;
                Intrinsics.h(it5, "it");
                break;
            case 5:
                MoreCardData it6 = (MoreCardData) obj;
                Intrinsics.h(it6, "it");
                break;
            case 6:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 7:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                break;
            case 8:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 9:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.g(semantics4);
                break;
            case 10:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.g(semantics5);
                break;
            case 11:
                SearchNavCardData it7 = (SearchNavCardData) obj;
                Intrinsics.h(it7, "it");
                break;
            case 12:
                SearchNavCardData it8 = (SearchNavCardData) obj;
                Intrinsics.h(it8, "it");
                break;
            case 13:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.g(semantics6);
                break;
            case 14:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                break;
            case 15:
                ProductCard it9 = (ProductCard) obj;
                Intrinsics.h(it9, "it");
                break;
            case 16:
                SemanticsPropertyReceiver semantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics7, "$this$semantics");
                SemanticsPropertiesKt.u(semantics7);
                break;
            case 17:
                SemanticsPropertyReceiver semantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics8, "$this$semantics");
                SemanticsPropertiesKt.v(semantics8, 4.0f);
                break;
            case 18:
                ProductCard it10 = (ProductCard) obj;
                Intrinsics.h(it10, "it");
                break;
            case 19:
                BuyAgainChip it11 = (BuyAgainChip) obj;
                Intrinsics.h(it11, "it");
                break;
            case 20:
                BuyAgainChip it12 = (BuyAgainChip) obj;
                Intrinsics.h(it12, "it");
                break;
            case 21:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.i(LazyColumn, null, null, ComposableSingletons$ProductTileSkeletonKt.f10280a, 3);
                for (int i = 0; i < 11; i++) {
                    LazyListScope.i(LazyColumn, null, null, ComposableSingletons$ProductTileSkeletonKt.b, 3);
                }
                break;
            case 22:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 23:
                AnimatedContentTransitionScope composable = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(composable, "$this$composable");
                break;
            case 24:
                AnimatedContentTransitionScope composable2 = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(composable2, "$this$composable");
                break;
            case 25:
                AnimatedContentTransitionScope composable3 = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(composable3, "$this$composable");
                break;
            case 26:
                AnimatedContentTransitionScope composable4 = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(composable4, "$this$composable");
                break;
            case 27:
                InsetBanner it13 = (InsetBanner) obj;
                Intrinsics.h(it13, "it");
                break;
            case 28:
                BuyMoreSaveMorePromotionInfo it14 = (BuyMoreSaveMorePromotionInfo) obj;
                Intrinsics.h(it14, "it");
                break;
            default:
                ((Double) obj).getClass();
                break;
        }
        return Unit.f24250a;
    }
}
