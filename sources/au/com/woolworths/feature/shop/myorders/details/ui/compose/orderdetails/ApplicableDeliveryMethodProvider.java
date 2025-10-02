package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodBulletInfo;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingAssetIcon;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingBanner;
import au.com.woolworths.feature.shop.myorders.details.models.DriverRatingBroadcastBannerUI;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipDeliveryMethodInfo;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/ApplicableDeliveryMethodProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/DeliveryMethodsTooltip;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ApplicableDeliveryMethodProvider implements PreviewParameterProvider<DeliveryMethodsTooltip> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/ApplicableDeliveryMethodProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final DeliveryMethodsTooltip d;

        static {
            List listR = CollectionsKt.R(new DeliveryMethodBulletInfo("Friendly drivers"), new DeliveryMethodBulletInfo("Safe storage in refrigerated trucks"), new DeliveryMethodBulletInfo("Packed by Woolworths fulfilment centre and bala bala bala"));
            CoreBroadcastBannerStyle coreBroadcastBannerStyle = CoreBroadcastBannerStyle.f;
            TestCase[] testCaseArr = {new TestCase("DeliveryMethodMultipleMethods", 0, new DeliveryMethodsTooltip("Our delivery methods", "We’ll choose the most efficient way to deliver your order on time.", CollectionsKt.R(new TooltipDeliveryMethodInfo("Woolworths Truck", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/da/carrier_type_fleet.png", "Our friendly drivers will keep your items safely stored and cooled in our refrigerated trucks. You’ll recognise our drivers by their safety vests.", listR, new DriverRatingBanner(new DriverRatingBroadcastBannerUI("Driver rating", "When you receive your order, don't forget to leave a rating and review. Your feedback helps us improve your delivery experience.", coreBroadcastBannerStyle, new DriverRatingAssetIcon.DriverRatingHostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/driverRating/bannerStar.png")), false)), new TooltipDeliveryMethodInfo("Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/da/carrier_type_p2p.png", "Our Partner Drivers help us get your groceries to you faster, and often with shorter notice, coming  from a local Woolworths store near you.", CollectionsKt.R(new DeliveryMethodBulletInfo("Priority service from Uber, DoorDash, GoPeople, Sherpa and Yello"), new DeliveryMethodBulletInfo("From our store to you in 30 minutes or less"), new DeliveryMethodBulletInfo("Maximum 75 items per order")), new DriverRatingBanner(new DriverRatingBroadcastBannerUI("Driver rating", "When you receive your order, don't forget to leave a rating and review. Your feedback helps us improve your delivery experience.", coreBroadcastBannerStyle, new DriverRatingAssetIcon.DriverRatingHostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/driverRating/bannerStar.png")), false))))), new TestCase("DeliveryMethodSingleMethod", 1, new DeliveryMethodsTooltip("Our delivery methods", "We’ll choose the most efficient way to deliver your order on time.", CollectionsKt.Q(new TooltipDeliveryMethodInfo("Partner Driver", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/da/carrier_type_p2p.png", "Our Partner Drivers help us get your groceries to you faster, and often with shorter notice, coming  from a local Woolworths store near you.", CollectionsKt.R(new DeliveryMethodBulletInfo("Priority service from Uber, DoorDash, GoPeople, Sherpa and Yello"), new DeliveryMethodBulletInfo("From our store to you in 30 minutes or less"), new DeliveryMethodBulletInfo("Maximum 75 items per order")), new DriverRatingBanner(new DriverRatingBroadcastBannerUI("Driver rating", "When you receive your order, don't forget to leave a rating and review. Your feedback helps us improve your delivery experience.", coreBroadcastBannerStyle, new DriverRatingAssetIcon.DriverRatingHostedIcon("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/driverRating/bannerStar.png")), false)))))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, DeliveryMethodsTooltip deliveryMethodsTooltip) {
            this.d = deliveryMethodsTooltip;
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
