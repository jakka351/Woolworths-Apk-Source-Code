package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsDeliveryDriverInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/OrderDetailsDeliveryDriverInfoProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsDeliveryDriverInfo;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsDeliveryDriverInfoProvider implements PreviewParameterProvider<OrderDetailsDeliveryDriverInfo> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/OrderDetailsDeliveryDriverInfoProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OrderDetailsDeliveryDriverInfo d;

        static {
            TestCase testCase = new TestCase("DriverToBeAssignedWithoutBanner", 0, new OrderDetailsDeliveryDriverInfo("Driver to be assigned", "Uber Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", null, null, null));
            TestCase testCase2 = new TestCase("DriverToBeAssignedWithLongText", 1, new OrderDetailsDeliveryDriverInfo("Your driver will be assigned closer to the delivery time", "Driver details", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", null, null, null));
            TestCase testCase3 = new TestCase("FleetDriverWithoutBanner", 2, new OrderDetailsDeliveryDriverInfo("Woolworths truck", "", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", null, null, null));
            InsetBannerTypeApiData insetBannerTypeApiData = InsetBannerTypeApiData.INFO;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, new TestCase("DriversInHighDemandWithBanner", 3, new OrderDetailsDeliveryDriverInfo("Driver to be assigned", "Uber Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", new InsetBannerApiData(insetBannerTypeApiData, "We're working on finding the next available driver in your area.", "Drivers in high demand", null, null, null), null, null)), new TestCase("DriverWitLiveTrackingButton", 4, new OrderDetailsDeliveryDriverInfo("Bruce Wayne", "Uber Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", null, new ButtonApiData("Follow live tracking", null, null, true, null, null, null, null, null, 502, null), null)), new TestCase("DriverInHighDemandBannerWithTrackingButton", 5, new OrderDetailsDeliveryDriverInfo("Driver to be assigned", "Uber Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", new InsetBannerApiData(insetBannerTypeApiData, "We're working on finding the next available driver in your area.", "Drivers in high demand", null, null, null), new ButtonApiData("Follow live tracking", null, null, true, null, null, null, null, null, 502, null), null)), new TestCase("DriverWithDeliveryMethodsInfoIcon", 6, new OrderDetailsDeliveryDriverInfo("Driver will be assigned closer to the delivery time", "Driver details to be added, this is a very very long line", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/car_partner_driver.png", null, null, new DeliveryMethodsTooltip("", "", EmptyList.d)))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, OrderDetailsDeliveryDriverInfo orderDetailsDeliveryDriverInfo) {
            this.d = orderDetailsDeliveryDriverInfo;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
