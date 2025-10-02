package au.com.woolworths.shop.checkout.ui.timeselector.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corecolortheme.Background;
import au.com.woolworths.sdui.common.corecolortheme.CompatibleColorData;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.corecolortheme.Foreground;
import au.com.woolworths.sdui.common.corecolortheme.Highlight;
import au.com.woolworths.sdui.common.corecolortheme.Primary;
import au.com.woolworths.sdui.common.corecolortheme.Secondary;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/FulfilmentTimeParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/domain/model/timeselector/FulfilmentSlot;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentTimeParameterProvider implements PreviewParameterProvider<FulfilmentSlot> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/FulfilmentTimeParameterProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            TestCase testCase = new TestCase("FulfilmentTimeWithNoSubtitle", 0);
            TestCase testCase2 = new TestCase("FulfilmentTimeWithSubtitle", 1);
            TestCase testCase3 = new TestCase("FulfilmentTimeSelected", 2);
            TestCase testCase4 = new TestCase("FulfilmentTimeDisabled", 3);
            CollectionsKt.Q(new CoreTagModel("Delivery Now", new CoreColorTheme(new Background(new CompatibleColorData("#CAEB6D")), new Foreground(new Primary(new CompatibleColorData("#000000")), new Secondary(new CompatibleColorData("#000000")), new Highlight(new CompatibleColorData("#000000")))), false, new IconAsset.CoreIcon("icon.services.delivery-now")));
            TestCase testCase5 = new TestCase("FulfilmentTimeDelivery", 4);
            CollectionsKt.Q(new CoreTagModel("Closing Soon", new CoreColorTheme(new Background(new CompatibleColorData("#3A474E")), new Foreground(new Primary(new CompatibleColorData("#FFFFFF")), new Secondary(new CompatibleColorData("#FFFFFF")), new Highlight(new CompatibleColorData("#FFFFFF")))), false, null));
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, new TestCase("FulfilmentTimeClosingSoon", 5)};
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
