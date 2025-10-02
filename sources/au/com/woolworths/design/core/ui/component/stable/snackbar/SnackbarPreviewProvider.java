package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SnackbarPreviewProvider implements PreviewParameterProvider<SnackbarPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/snackbar/SnackbarPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            new SnackbarPreviewConfig("Message", null, false);
            TestCase testCase = new TestCase("MessageOnly", 0);
            new SnackbarPreviewConfig(SequencesKt.p(new LoremIpsum(10).getValues(), null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(3), 31), null, false);
            TestCase testCase2 = new TestCase("MessageOnlyWithMultipleLine", 1);
            new SnackbarPreviewConfig("Message", "Action", false);
            TestCase testCase3 = new TestCase("MessageWithAction", 2);
            new SnackbarPreviewConfig(SequencesKt.p(new LoremIpsum(10).getValues(), null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(4), 31), "Action", false);
            TestCase testCase4 = new TestCase("MessageWithMultipleLineWithAction", 3);
            new SnackbarPreviewConfig("Message", null, true);
            TestCase testCase5 = new TestCase("MessageWithActionOnNewLine", 4);
            new SnackbarPreviewConfig(SequencesKt.p(new LoremIpsum(10).getValues(), null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(5), 31), null, true);
            TestCase testCase6 = new TestCase("MessageWithMultipleLineWithActionOnNewLine", 5);
            new SnackbarPreviewConfig("Message", "Action", true);
            TestCase testCase7 = new TestCase("MessageWithActionLabelAndActionOnNewLine", 6);
            new SnackbarPreviewConfig(SequencesKt.p(new LoremIpsum(10).getValues(), null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(6), 31), "Action", true);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, new TestCase("MessageWithMultipleLineWithActionLabelAndActionOnNewLine", 7)};
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
