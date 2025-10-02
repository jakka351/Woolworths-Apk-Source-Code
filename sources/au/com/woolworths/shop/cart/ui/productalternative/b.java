package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductReviewCard e;

    public /* synthetic */ b(ProductReviewCard productReviewCard, int i) {
        this.d = i;
        this.e = productReviewCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String label;
        String label2;
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(semantics, "$this$semantics");
                ProductReviewCard productReviewCard = this.e;
                BadgeApiData badgeApiData = productReviewCard.e;
                if (badgeApiData != null && (label = badgeApiData.getLabel()) != null) {
                    SemanticsPropertiesKt.k(semantics, label + " " + productReviewCard.f10444a);
                }
                break;
            default:
                Intrinsics.h(semantics, "$this$semantics");
                ProductReviewCard productReviewCard2 = this.e;
                BadgeApiData badgeApiData2 = productReviewCard2.e;
                if (badgeApiData2 != null && (label2 = badgeApiData2.getLabel()) != null) {
                    SemanticsPropertiesKt.k(semantics, label2 + " " + productReviewCard2.f10444a);
                }
                break;
        }
        return Unit.f24250a;
    }
}
