package au.com.woolworths.shop.checkout.ui.timeselector.compose.suggestedtimeslot;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeSelectorUiItem;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/suggestedtimeslot/SuggestedTimeSlotsParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$SuggestedTimeSlotUiItem;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedTimeSlotsParameterProvider implements PreviewParameterProvider<TimeSelectorUiItem.SuggestedTimeSlotUiItem> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/compose/suggestedtimeslot/SuggestedTimeSlotsParameterProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            EmptyList emptyList = EmptyList.d;
            CollectionsKt.Q(new FulfilmentSlot(1, "9am - 12pm", "3hrs", "$2", false, false, null, "", emptyList, emptyList));
            TestCase testCase = new TestCase("SuggestedTimeSlotsNoTitle", 0);
            CollectionsKt.Q(new FulfilmentSlot(1, "9am - 12pm", "3hrs", "$2", false, false, null, "", emptyList, emptyList));
            TestCase testCase2 = new TestCase("SuggestedTimeSlotsWithTitle", 1);
            CollectionsKt.Q(new FulfilmentSlot(1, "9am - 12pm", "3hrs", "$2", false, false, null, "", emptyList, emptyList));
            TestCase[] testCaseArr = {testCase, testCase2, new TestCase("SuggestedTimeSlotsWithTitleAndTooltip", 2)};
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
