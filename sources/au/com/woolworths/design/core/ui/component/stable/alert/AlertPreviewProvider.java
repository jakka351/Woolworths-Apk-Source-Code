package au.com.woolworths.design.core.ui.component.stable.alert;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/AlertPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/alert/AlertPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlertPreviewProvider implements PreviewParameterProvider<AlertPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/AlertPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            AlertStyle alertStyle = AlertStyle.d;
            AlertType alertType = AlertType.f;
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase = new TestCase("InsetInformation", 0);
            new AlertPreviewConfig(null, "This is a short description.", alertType, alertStyle, null);
            TestCase testCase2 = new TestCase("InsetInformationShort", 1);
            AlertStyle alertStyle2 = AlertStyle.e;
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle2, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase3 = new TestCase("InsetSuccess", 2);
            AlertStyle alertStyle3 = AlertStyle.f;
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle3, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase4 = new TestCase("InsetWarning", 3);
            AlertStyle alertStyle4 = AlertStyle.g;
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle4, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase5 = new TestCase("InsetError", 4);
            AlertType alertType2 = AlertType.g;
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType2, alertStyle, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase6 = new TestCase("PageInformation", 5);
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType2, alertStyle2, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase7 = new TestCase("PageSuccess", 6);
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType2, alertStyle3, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase8 = new TestCase("PageWarning", 7);
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType2, alertStyle4, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase9 = new TestCase("PageError", 8);
            new AlertPreviewConfig("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle, new AlertSpec.Action(false, "Link", new h(24)));
            TestCase testCase10 = new TestCase("NoLinkIconInsetInformation", 9);
            new AlertPreviewConfig(alertType, alertStyle);
            TestCase testCase11 = new TestCase("NoLinkInsetInformation", 10);
            new AlertPreviewConfig(null, "This is an alert description. Max character count is 140 characters.", alertType, alertStyle, new AlertSpec.Action(true, "Link", new h(24)));
            TestCase testCase12 = new TestCase("NoTitleInsetInformation", 11);
            AlertType alertType3 = AlertType.h;
            new AlertPreviewConfig(alertType3, alertStyle);
            TestCase testCase13 = new TestCase("CompactInformation", 12);
            new AlertPreviewConfig(alertType3, alertStyle2);
            TestCase testCase14 = new TestCase("CompactSuccess", 13);
            new AlertPreviewConfig(alertType3, alertStyle3);
            TestCase testCase15 = new TestCase("CompactWarning", 14);
            new AlertPreviewConfig(alertType3, alertStyle4);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10, testCase11, testCase12, testCase13, testCase14, testCase15, new TestCase("CompactError", 15)};
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
