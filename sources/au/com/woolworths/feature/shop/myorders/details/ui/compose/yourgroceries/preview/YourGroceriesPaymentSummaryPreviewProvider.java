package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemIcon;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesPaymentSummaryPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderPaymentDetailsData;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesPaymentSummaryPreviewProvider implements PreviewParameterProvider<OrderPaymentDetailsData> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesPaymentSummaryPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            TestCase testCase = new TestCase("Null", 0);
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = OrderPaymentDetailsItemAmountStyle.e;
            CollectionsKt.R(new OrderPaymentDetailsItemData("Subtotal", null, "$999.00", null, orderPaymentDetailsItemAmountStyle), new OrderPaymentDetailsItemData("Reusable Bags", null, "$2.00", null, orderPaymentDetailsItemAmountStyle));
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Discount", null, "$99.00", null, null));
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Marketplace", null, "$999.00", null, OrderPaymentDetailsItemAmountStyle.g));
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Total (Incl. GST)", null, "$999.00", null, orderPaymentDetailsItemAmountStyle));
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Pay by card", OrderPaymentDetailsItemIcon.d, "$999.00", null, orderPaymentDetailsItemAmountStyle));
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle2 = OrderPaymentDetailsItemAmountStyle.f;
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Woolworths Items", null, "-$999.00", null, orderPaymentDetailsItemAmountStyle2));
            CollectionsKt.Q(new OrderPaymentDetailsItemData("Total Refund", null, "-$999.00", null, orderPaymentDetailsItemAmountStyle2));
            TestCase[] testCaseArr = {testCase, new TestCase("Content", 1)};
            d = testCaseArr;
            e = EnumEntriesKt.a(testCaseArr);
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
