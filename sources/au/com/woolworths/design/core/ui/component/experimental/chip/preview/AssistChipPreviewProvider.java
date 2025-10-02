package au.com.woolworths.design.core.ui.component.experimental.chip.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/AssistChipPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/AssistChipPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalCoreDesignApi
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AssistChipPreviewProvider implements PreviewParameterProvider<AssistChipPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/preview/AssistChipPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            ChipVariant chipVariant = ChipVariant.d;
            TestCase testCase = new TestCase("AssistPrimary", 0);
            ChipVariant chipVariant2 = ChipVariant.d;
            TestCase[] testCaseArr = {testCase, new TestCase("AssistSecondary", 1)};
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
