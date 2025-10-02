package au.com.woolworths.foundation.rewards.common.ui.shop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.common.ui.shop.data.PaymentSummaryLineItem;
import au.com.woolworths.foundation.rewards.common.ui.shop.data.PaymentSummaryLineType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/shop/PaymentSummaryLineItemContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "Lau/com/woolworths/foundation/rewards/common/ui/shop/data/PaymentSummaryLineItem;", "Companion", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentSummaryLineItemContentProvider implements PreviewParameterProvider<List<? extends PaymentSummaryLineItem>> {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8598a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/shop/PaymentSummaryLineItemContentProvider$Companion;", "", "", "Lau/com/woolworths/foundation/rewards/common/ui/shop/data/PaymentSummaryLineItem;", "items", "Ljava/util/List;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        PaymentSummaryLineType paymentSummaryLineType = PaymentSummaryLineType.g;
        PaymentSummaryLineType paymentSummaryLineType2 = PaymentSummaryLineType.h;
        PaymentSummaryLineItem paymentSummaryLineItem = new PaymentSummaryLineItem("You'll collect", paymentSummaryLineType, "4596 points", paymentSummaryLineType2);
        PaymentSummaryLineItem paymentSummaryLineItem2 = new PaymentSummaryLineItem("You've saved", paymentSummaryLineType, "🎉 $20.00", PaymentSummaryLineType.i);
        PaymentSummaryLineItem paymentSummaryLineItem3 = new PaymentSummaryLineItem("<Product Name>", paymentSummaryLineType, "$199.90", paymentSummaryLineType);
        PaymentSummaryLineItem paymentSummaryLineItem4 = new PaymentSummaryLineItem("<Product Name>", paymentSummaryLineType, "$199.90", paymentSummaryLineType);
        PaymentSummaryLineItem paymentSummaryLineItem5 = new PaymentSummaryLineItem("Everyday WISH Gift Card", paymentSummaryLineType, "$250.00", paymentSummaryLineType);
        PaymentSummaryLineItem paymentSummaryLineItem6 = new PaymentSummaryLineItem("Shipping", paymentSummaryLineType, "FREE", paymentSummaryLineType);
        PaymentSummaryLineType paymentSummaryLineType3 = PaymentSummaryLineType.f;
        PaymentSummaryLineItem paymentSummaryLineItem7 = new PaymentSummaryLineItem("Shipping", paymentSummaryLineType, "FREE", paymentSummaryLineType3);
        PaymentSummaryLineType paymentSummaryLineType4 = PaymentSummaryLineType.d;
        PaymentSummaryLineItem paymentSummaryLineItem8 = new PaymentSummaryLineItem("Subtotal", paymentSummaryLineType4, "$449.90", paymentSummaryLineType4);
        PaymentSummaryLineItem paymentSummaryLineItem9 = new PaymentSummaryLineItem("Everyday Rewards Dollars", paymentSummaryLineType2, "$0.00", paymentSummaryLineType3);
        PaymentSummaryLineType paymentSummaryLineType5 = PaymentSummaryLineType.j;
        f8598a = CollectionsKt.R(paymentSummaryLineItem, paymentSummaryLineItem2, paymentSummaryLineItem3, paymentSummaryLineItem4, paymentSummaryLineItem5, paymentSummaryLineItem6, paymentSummaryLineItem7, paymentSummaryLineItem8, paymentSummaryLineItem9, new PaymentSummaryLineItem("Total (incl. GST)", paymentSummaryLineType5, "$449.90", paymentSummaryLineType5), new PaymentSummaryLineItem("Total Refund", paymentSummaryLineType4, "-$449.90", PaymentSummaryLineType.e));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
