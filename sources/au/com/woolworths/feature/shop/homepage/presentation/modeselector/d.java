package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.ui.MessageRowKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        int i2 = 0;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                float f = ModeSelectorSubHeaderKt.f7251a;
                Intrinsics.h(semantics, "$this$semantics");
                return unit;
            case 1:
                QuickLinkCard it = (QuickLinkCard) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 2:
                QuickLinkCard it2 = (QuickLinkCard) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 3:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                return unit;
            case 4:
                RewardsBalanceCardData it4 = (RewardsBalanceCardData) obj;
                Intrinsics.h(it4, "it");
                return unit;
            case 5:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 6:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                return unit;
            case 7:
                NotificationItem it5 = (NotificationItem) obj;
                Intrinsics.h(it5, "it");
                return it5.f7288a.f8440a;
            case 8:
                NotificationItem it6 = (NotificationItem) obj;
                Intrinsics.h(it6, "it");
                return "NotificationItem";
            case 9:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                return unit;
            case 10:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.d(EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3));
            case 11:
                InboxUiState state = (InboxUiState) obj;
                Intrinsics.h(state, "state");
                if (!(state instanceof InboxUiState.Loading)) {
                    if (state instanceof InboxUiState.Content) {
                        i2 = 1;
                    } else {
                        if (!(state instanceof InboxUiState.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 2;
                    }
                }
                return Integer.valueOf(i2);
            case 12:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                float f2 = MessageRowKt.f7297a;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.k(semantics3, "Unread indicator - New notification");
                return unit;
            case 13:
                SemanticsPropertyReceiver clearAndSetSemantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics3, "$this$clearAndSetSemantics");
                return unit;
            case 14:
                SemanticsPropertyReceiver clearAndSetSemantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics4, "$this$clearAndSetSemantics");
                return unit;
            case 15:
                SemanticsPropertyReceiver clearAndSetSemantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics5, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.r(clearAndSetSemantics5, 0);
                SemanticsPropertiesKt.k(clearAndSetSemantics5, "Clear all notifications");
                return unit;
            case 16:
                DismissDirection it7 = (DismissDirection) obj;
                Intrinsics.h(it7, "it");
                return new FractionalThreshold();
            case 17:
                ProductCard it8 = (ProductCard) obj;
                Intrinsics.h(it8, "it");
                return unit;
            case 18:
                InstoreMapContract.ViewState state2 = (InstoreMapContract.ViewState) obj;
                Intrinsics.h(state2, "state");
                return state2.a();
            case 19:
                SemanticsPropertyReceiver clearAndSetSemantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics6, "$this$clearAndSetSemantics");
                return unit;
            case 20:
                SemanticsPropertyReceiver clearAndSetSemantics7 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics7, "$this$clearAndSetSemantics");
                return unit;
            case 21:
                SemanticsPropertyReceiver clearAndSetSemantics8 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics8, "$this$clearAndSetSemantics");
                return unit;
            case 22:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                return unit;
            case 23:
                Throwable throwable = (Throwable) obj;
                Intrinsics.h(throwable, "throwable");
                Timber.f27013a.p(throwable);
                return Boolean.TRUE;
            case 24:
                Boolean isLoggedIn = (Boolean) obj;
                Intrinsics.h(isLoggedIn, "isLoggedIn");
                return Boolean.valueOf(!isLoggedIn.booleanValue());
            case 25:
                ((Integer) obj).getClass();
                return MarketplaceCategory.class;
            case 26:
                String it9 = (String) obj;
                Intrinsics.h(it9, "it");
                return it9.concat(" ");
            case 27:
                String it10 = (String) obj;
                Intrinsics.h(it10, "it");
                return it10.concat(" ");
            case 28:
                String it11 = (String) obj;
                Intrinsics.h(it11, "it");
                return it11.concat(" ");
            default:
                String it12 = (String) obj;
                Intrinsics.h(it12, "it");
                return it12.concat(" ");
        }
    }
}
