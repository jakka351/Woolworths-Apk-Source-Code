package au.com.woolworths.feature.shop.myorders.details.ui.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/ProgressStepperInfoUpliftScreenPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/models/StepsToolTip;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepperInfoUpliftScreenPreviewProvider implements PreviewParameterProvider<StepsToolTip> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/ProgressStepperInfoUpliftScreenPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            Boolean bool = Boolean.FALSE;
            new StepsToolTip("These are the steps involved to get your Woolies delivery from our shelves to your door.", CollectionsKt.R(new ToolTipStepInfo(1, true, bool, "Order received", "Thanks for your order. Our team will take care of it on the day of delivery.", null), new ToolTipStepInfo(2, false, bool, "Preparing order", "Our Personal Shopper is picking and packing your order.", null), new ToolTipStepInfo(3, false, bool, "On its way", "Your order is now ready with our Woolworths driver for delivery.", null), new ToolTipStepInfo(4, false, bool, "You're next in line", "Our Woolworths delivery driver is arriving with your order soon.", null), new ToolTipStepInfo(5, false, bool, "Arriving", "Give the driver a few minutes to safely park, and unload your groceries from the vehicle.", null), new ToolTipStepInfo(6, false, null, "Delivered", "Enjoy your order!", null)));
            TestCase[] testCaseArr = {new TestCase("Content", 0)};
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
