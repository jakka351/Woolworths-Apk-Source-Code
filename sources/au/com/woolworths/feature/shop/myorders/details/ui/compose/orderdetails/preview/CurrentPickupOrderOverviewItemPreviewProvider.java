package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.LocationImage;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPageRationale;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSubtitleIcon;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepTypeApiData;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipType;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentPickupOrderOverviewItemPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/CurrentPickupOrderOverview;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CurrentPickupOrderOverviewItemPreviewProvider implements PreviewParameterProvider<CurrentPickupOrderOverview> {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7800a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentPickupOrderOverviewItemPreviewProvider$Companion;", "", "", "Lau/com/woolworths/feature/shop/myorders/details/models/LocationTrackingPrimingPageRationale;", "locationRationales", "Ljava/util/List;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/orderdetails/preview/CurrentPickupOrderOverviewItemPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            List list = CurrentPickupOrderOverviewItemPreviewProvider.f7800a;
            OrderSubtitleIcon orderSubtitleIcon = OrderSubtitleIcon.e;
            TestCase[] testCaseArr = {new TestCase("OrderReceived", 0), new TestCase("OrderDelayed", 1), new TestCase("OrderReady", 2), new TestCase("OnOurWay", 3), new TestCase("OnOurWayWithHandover", 4)};
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
        ButtonStyleApiData buttonStyleApiData = ButtonStyleApiData.PRIMARY;
        new ButtonApiData("Change my order", ButtonActionApiData.EDIT_ORDER, buttonStyleApiData, true, null, null, null, null, null, 496, null);
        ButtonStyleApiData buttonStyleApiData2 = ButtonStyleApiData.SECONDARY;
        new ButtonApiData("Cancel order", ButtonActionApiData.CANCEL_ORDER, buttonStyleApiData2, true, null, null, null, null, null, 496, null);
        new ButtonApiData("I'm here", ButtonActionApiData.CHECK_IN_IM_HERE, buttonStyleApiData2, true, null, null, null, null, null, 496, null);
        new ButtonApiData("I'm on my way", ButtonActionApiData.CHECK_IN_ON_MY_WAY, buttonStyleApiData, true, null, null, null, null, null, 496, null);
        ProgressStepTypeApiData progressStepTypeApiData = ProgressStepTypeApiData.d;
        TooltipType tooltipType = TooltipType.d;
        ProgressStepTypeApiData progressStepTypeApiData2 = ProgressStepTypeApiData.d;
        ProgressStepTypeApiData progressStepTypeApiData3 = ProgressStepTypeApiData.d;
        ToolTipStepInfo toolTipStepInfo = new ToolTipStepInfo(1, true, Boolean.TRUE, "Order received", "Our team will be preparing your order. We'll let you know if there are any changes and when it's ready to collect.", null);
        Boolean bool = Boolean.FALSE;
        new StepsToolTip("These are the steps involved to get your Woolies order from our shelves and into your boot.", CollectionsKt.R(toolTipStepInfo, new ToolTipStepInfo(2, true, bool, "Ready", "Let us know when you're on your way, and when you arrive at the store.\n\nMost stores have numbered parking bays, you can let us know which bay you're parked in.", null), new ToolTipStepInfo(3, false, bool, "On our way", "A store member will bring your order to you. Open your boot and turn off your engine to speed up handover.", null), new ToolTipStepInfo(4, false, null, "Collected", "Easy as that! You can view your past orders at any time.", null)));
        BroadcastBannerType broadcastBannerType = BroadcastBannerType.PRIMARY;
        new BroadcastBannerData("Save time waiting", "To get your order as fast as possible, let us know when you're on your way.", null, null, null, broadcastBannerType, "", bool, "SaveTimeBanner");
        new BroadcastBannerData("Toby is bringing out your order", null, null, null, null, broadcastBannerType, "", bool, "SaveTimeBanner");
        List listR = CollectionsKt.R("1", "2");
        ButtonActionApiData buttonActionApiData = ButtonActionApiData.d;
        new BayNumberPreferences("Select your bay number", "No bays available? Just wait until one is free and let us know once you've parked.", listR, new ButtonApiData("Confirm", buttonActionApiData, buttonStyleApiData, true, null, null, null, null, null, 448, null), new ButtonApiData("I don't know my bay number", buttonActionApiData, ButtonStyleApiData.TERTIARY, true, null, null, null, null, null, 448, null));
        f7800a = CollectionsKt.R(new LocationTrackingPrimingPageRationale(false, LocationImage.e, "Sharing your location lets us calculate your estimated arrival time"), new LocationTrackingPrimingPageRationale(false, LocationImage.d, "By sharing your location you will also have access to in-store app features"), new LocationTrackingPrimingPageRationale(true, LocationImage.g, "Select the **\"While using the app\"** option for the best experience"));
        CollectionsKt.R(new ButtonApiData("Update location permissions", ButtonActionApiData.UPDATE_LOCATION_TRACKING_PERMISSIONS, buttonStyleApiData, true, null, null, null, null, null, 496, null), new ButtonApiData("Maybe later", ButtonActionApiData.SKIP_LOCATION_TRACKING_PERMISSIONS, buttonStyleApiData2, true, null, null, null, null, null, 496, null));
        CollectionsKt.Q(new ButtonApiData("Set location permissions", ButtonActionApiData.SET_LOCATION_TRACKING_PERMISSIONS, buttonStyleApiData, true, null, null, null, null, null, 496, null));
        new OnMyWayPreferences("How long until you arrive?", "This will help us to reduce your wait time.", CollectionsKt.R("5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60"), "min", 2, new ButtonApiData("Confirm", buttonActionApiData, buttonStyleApiData, true, null, null, null, null, null, 496, null));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
