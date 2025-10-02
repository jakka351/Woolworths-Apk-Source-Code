package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepTypeApiData;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentDeliveryOrderOverviewItemPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentDeliveryOrderOverview;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CurrentDeliveryOrderOverviewItemPreviewProvider implements PreviewParameterProvider<CurrentDeliveryOrderOverview> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7799a = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentDeliveryOrderOverviewItemPreviewProvider$Companion;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentDeliveryOrderOverviewItemPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            int i = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            int i2 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            int i3 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            int i4 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            TestCase testCase = new TestCase("OrderReceived", 0);
            int i5 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            TestCase testCase2 = new TestCase("PreparingOrder", 1);
            int i6 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            TestCase testCase3 = new TestCase("OnItsWay", 2);
            int i7 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            TestCase testCase4 = new TestCase("YouAreNextInLine", 3);
            CollectionsKt.Q(new InsetBannerApiData(InsetBannerTypeApiData.WARNING, "Unfortunately, your delivery is running late. We're sorry. Our driver will be with you as soon as possible.", "Drivers in high demand", null, null, null));
            OrderSubtitleIcon orderSubtitleIcon = OrderSubtitleIcon.e;
            TestCase testCase5 = new TestCase("OrderWithFullWidthWarningBanner", 4);
            CollectionsKt.Q(new InsetBannerApiData(InsetBannerTypeApiData.INFO, "The store is busier than usual, but our Personal Shopper will prepare your order as soon as possible", "Picking is a little behind", null, null, null));
            TestCase testCase6 = new TestCase("OrderWithFullWidthInfoBanner", 5);
            int i8 = CurrentDeliveryOrderOverviewItemPreviewProvider.f7799a;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, new TestCase("OrderWithWarningIconOnETA", 6), new TestCase("OrderCanNoLongerChange", 7), new TestCase("MarkDownStyleTest", 8)};
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

    static {
        new ButtonApiData("Change my order", ButtonActionApiData.EDIT_ORDER, ButtonStyleApiData.PRIMARY, true, null, null, null, null, null, 496, null);
        new ButtonApiData("Cancel order", ButtonActionApiData.CANCEL_ORDER, ButtonStyleApiData.SECONDARY, true, null, null, null, null, null, 496, null);
        ProgressStepTypeApiData progressStepTypeApiData = ProgressStepTypeApiData.e;
        TooltipType tooltipType = TooltipType.d;
        new ProgressStepper("Order received", 5, progressStepTypeApiData, 2, tooltipType);
        new ProgressStepper("Order received", 5, progressStepTypeApiData, 2, tooltipType);
        ProgressStepTypeApiData progressStepTypeApiData2 = ProgressStepTypeApiData.f;
        new ProgressStepper("On its way", 5, progressStepTypeApiData2, 3, tooltipType);
        new ProgressStepper("You're next in line", 5, progressStepTypeApiData2, 4, tooltipType);
        new ProgressStepper("Order received", 5, ProgressStepTypeApiData.g, 1, tooltipType);
        ToolTipStepInfo toolTipStepInfo = new ToolTipStepInfo(1, true, Boolean.TRUE, "Order received", "Thanks for your order. Our team will take care of it on the day of delivery.", null);
        Boolean bool = Boolean.FALSE;
        new StepsToolTip("These are the steps involved to get your Woolies delivery from our shelves to your door.", CollectionsKt.R(toolTipStepInfo, new ToolTipStepInfo(2, true, bool, "Preparing order", "Our Personal Shopper is picking and packing your order.", null), new ToolTipStepInfo(3, false, bool, "On its way", "Your order is now ready with our Woolworths driver for delivery.", null), new ToolTipStepInfo(4, false, null, "You're next in line", "Our Woolworths delivery driver is arriving with your order soon.", null), new ToolTipStepInfo(5, false, null, "Arriving", "Give the driver a few minutes to safely park, and unload your groceries from the vehicle.", null), new ToolTipStepInfo(6, false, null, "Delivered", "Enjoy your order!", null)));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
