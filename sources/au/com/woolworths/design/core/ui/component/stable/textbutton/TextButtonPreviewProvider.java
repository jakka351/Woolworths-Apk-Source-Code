package au.com.woolworths.design.core.ui.component.stable.textbutton;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.textbutton.TextButtonSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TextButtonPreviewProvider implements PreviewParameterProvider<TextButtonPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            TextButtonSpec.Variant variant = TextButtonSpec.Variant.d;
            TextButtonSpec.Size size = TextButtonSpec.Size.d;
            TestCase testCase = new TestCase("NoIconMediumPrimaryDefault", 0);
            TestCase testCase2 = new TestCase("NoIconMediumPrimaryDisabled", 1);
            TextButtonSpec.Variant variant2 = TextButtonSpec.Variant.d;
            TestCase testCase3 = new TestCase("NoIconMediumDestructiveDefault", 2);
            TextButtonSpec.Size size2 = TextButtonSpec.Size.d;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, new TestCase("NoIconSmallPrimaryDefault", 3), new TestCase("NoIconSmallPrimaryDisabled", 4), new TestCase("NoIconSmallDestructiveDefault", 5), new TestCase("LeadingIconMediumPrimaryDefault", 6), new TestCase("LeadingIconMediumPrimaryDisabled", 7), new TestCase("LeadingIconMediumDestructiveDefault", 8), new TestCase("LeadingIconSmallPrimaryDefault", 9), new TestCase("LeadingIconSmallPrimaryDisabled", 10), new TestCase("LeadingIconSmallDestructiveDefault", 11), new TestCase("TrailingIconMediumPrimaryDefault", 12), new TestCase("TrailingIconMediumPrimaryDisabled", 13), new TestCase("TrailingIconMediumDestructiveDefault", 14), new TestCase("TrailingIconSmallPrimaryDefault", 15), new TestCase("TrailingIconSmallPrimaryDisabled", 16), new TestCase("TrailingIconSmallDestructiveDefault", 17)};
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
