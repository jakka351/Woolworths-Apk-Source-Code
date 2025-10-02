package au.com.woolworths.design.core.ui.component.experimental.chip.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSelectionType;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/ToggleChipPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/ToggleChipPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalCoreDesignApi
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ToggleChipPreviewProvider implements PreviewParameterProvider<ToggleChipPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/ToggleChipPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            ChipSelectionType chipSelectionType = ChipSelectionType.d;
            ChipVariant chipVariant = ChipVariant.d;
            TestCase testCase = new TestCase("PrimaryMultipleUnchecked", 0);
            TestCase testCase2 = new TestCase("PrimaryMultipleChecked", 1);
            TestCase testCase3 = new TestCase("PrimaryMultipleUncheckedDisabled", 2);
            TestCase testCase4 = new TestCase("PrimaryMultipleCheckedDisabled", 3);
            ChipSelectionType chipSelectionType2 = ChipSelectionType.d;
            TestCase testCase5 = new TestCase("PrimarySingleUnchecked", 4);
            TestCase testCase6 = new TestCase("PrimarySingleChecked", 5);
            TestCase testCase7 = new TestCase("PrimarySingleUncheckedDisabled", 6);
            TestCase testCase8 = new TestCase("PrimarySingleCheckedDisabled", 7);
            ChipVariant chipVariant2 = ChipVariant.d;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, new TestCase("SecondaryMultipleUnchecked", 8), new TestCase("SecondaryMultipleChecked", 9), new TestCase("SecondaryMultipleUncheckedDisabled", 10), new TestCase("SecondaryMultipleCheckedDisabled", 11), new TestCase("SecondarySingleUnchecked", 12), new TestCase("SecondarySingleChecked", 13), new TestCase("SecondarySingleUncheckedDisabled", 14), new TestCase("SecondarySingleCheckedDisabled", 15), new TestCase("PrimaryMultipleUncheckedWithBadge", 16), new TestCase("PrimaryMultipleCheckedWithBadge", 17), new TestCase("PrimaryMultipleUncheckedDisabledWithBadge", 18), new TestCase("PrimaryMultipleCheckedDisabledWithBadge", 19), new TestCase("PrimarySingleUncheckedWithBadge", 20), new TestCase("PrimarySingleCheckedWithBadge", 21), new TestCase("PrimarySingleUncheckedDisabledWithBadge", 22), new TestCase("PrimarySingleCheckedDisabledWithBadge", 23), new TestCase("SecondaryMultipleUncheckedWithBadge", 24), new TestCase("SecondaryMultipleCheckedWithBadge", 25), new TestCase("SecondaryMultipleUncheckedDisabledWithBadge", 26), new TestCase("SecondaryMultipleCheckedDisabledWithBadge", 27), new TestCase("SecondarySingleUncheckedWithBadge", 28), new TestCase("SecondarySingleCheckedWithBadge", 29), new TestCase("SecondarySingleUncheckedDisabledWithBadge", 30), new TestCase("SecondarySingleCheckedDisabledWithBadge", 31)};
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
