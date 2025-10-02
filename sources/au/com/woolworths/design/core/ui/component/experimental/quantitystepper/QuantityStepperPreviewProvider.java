package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalCoreDesignApi
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class QuantityStepperPreviewProvider implements PreviewParameterProvider<QuantityStepperPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/quantitystepper/QuantityStepperPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
            QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
            TestCase testCase = new TestCase("PrimaryMedium", 0);
            TestCase testCase2 = new TestCase("PrimaryMediumMaxLimit", 1);
            TestCase testCase3 = new TestCase("PrimaryMediumMinLimit", 2);
            TestCase testCase4 = new TestCase("PrimaryMediumUnitLabel", 3);
            TestCase testCase5 = new TestCase("PrimaryMediumLoading", 4);
            QuantityStepperSpec.Variant[] variantArr2 = QuantityStepperSpec.Variant.d;
            TestCase testCase6 = new TestCase("SecondaryMedium", 5);
            TestCase testCase7 = new TestCase("SecondaryMediumMaxLimit", 6);
            TestCase testCase8 = new TestCase("SecondaryMediumMinLimit", 7);
            TestCase testCase9 = new TestCase("SecondaryMediumUnitLabel", 8);
            TestCase testCase10 = new TestCase("SecondaryMediumLoading", 9);
            QuantityStepperSpec.Size size2 = QuantityStepperSpec.Size.e;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10, new TestCase("PrimarySmall", 10), new TestCase("PrimarySmallMaxLimit", 11), new TestCase("PrimarySmallMinLimit", 12), new TestCase("PrimarySmallUnitLabel", 13), new TestCase("PrimarySmallLoading", 14), new TestCase("SecondarySmall", 15), new TestCase("SecondarySmallMaxLimit", 16), new TestCase("SecondarySmallMinLimit", 17), new TestCase("SecondarySmallUnitLabel", 18), new TestCase("SecondarySmallLoading", 19)};
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
