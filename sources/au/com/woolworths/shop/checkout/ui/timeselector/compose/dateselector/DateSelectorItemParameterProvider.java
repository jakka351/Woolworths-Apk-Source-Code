package au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.DateItem;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/dateselector/DateSelectorItemParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/DateItem;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DateSelectorItemParameterProvider implements PreviewParameterProvider<DateItem> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/dateselector/DateSelectorItemParameterProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final DateItem d;

        static {
            EmptyList emptyList = EmptyList.d;
            TestCase[] testCaseArr = {new TestCase("DateSelectorItemUnselected", 0, new DateItem("Today", "24", "From", "$12", false, false, false, emptyList, new FulfilmentSlot(828346, "Direct to boot Now", "Ready within 60mins", "$5.00", false, false, null, "2025-07-04T08:00:00.0000000", emptyList, emptyList))), new TestCase("DateSelectorItemSelected", 1, new DateItem("Today", "24", "From", "$12", true, false, false, emptyList, new FulfilmentSlot(828346, "Direct to boot Now", "Ready within 60mins", "$5.00", false, false, null, "2025-07-04T08:00:00.0000000", emptyList, emptyList))), new TestCase("DateSelectorItemUnselectedHighlighted", 2, new DateItem("Today", "24", "From", "$12", false, true, false, emptyList, new FulfilmentSlot(828346, "Direct to boot Now", "Ready within 60mins", "$5.00", false, false, null, "2025-07-04T08:00:00.0000000", emptyList, emptyList))), new TestCase("DateSelectorItemSelectedHighlighted", 3, new DateItem("Today", "24", "From", "$12", true, true, false, emptyList, new FulfilmentSlot(828346, "Direct to boot Now", "Ready within 60mins", "$5.00", false, false, null, "2025-07-04T08:00:00.0000000", emptyList, emptyList))), new TestCase("DateSelectorItemClosed", 4, new DateItem("Today", "24", "Sold", "Out", false, false, true, emptyList, new FulfilmentSlot(828346, "Direct to boot Now", "Ready within 60mins", "$5.00", false, false, null, "2025-07-04T08:00:00.0000000", emptyList, emptyList)))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, DateItem dateItem) {
            this.d = dateItem;
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
        return null;
    }
}
