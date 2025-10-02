package au.com.woolworths.design.core.ui.component.stable.broadcastbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerPreviewConfig;", "TestCase", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BroadcastBannerPreviewProvider implements PreviewParameterProvider<BroadcastBannerPreviewConfig> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4746a = 0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerPreviewProvider$Companion;", "", "", "SampleTitle", "Ljava/lang/String;", "SampleDescription", "Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerSpec$Action;", "SampleAction", "Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerSpec$Action;", "SampleActionWithExternalLink", "SampleTagLabel", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/broadcastbanner/BroadcastBannerPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            BroadcastBannerType broadcastBannerType = BroadcastBannerType.d;
            TestCase testCase = new TestCase("Standard", 0);
            BroadcastBannerType broadcastBannerType2 = BroadcastBannerType.d;
            TestCase testCase2 = new TestCase("OnContrast", 1);
            BroadcastBannerType broadcastBannerType3 = BroadcastBannerType.d;
            TestCase testCase3 = new TestCase("WWBranded", 2);
            BroadcastBannerType broadcastBannerType4 = BroadcastBannerType.d;
            TestCase testCase4 = new TestCase("ERBranded", 3);
            BroadcastBannerType broadcastBannerType5 = BroadcastBannerType.d;
            TestCase testCase5 = new TestCase("BWBranded", 4);
            TestCase testCase6 = new TestCase("StandardDescription", 5);
            TestCase testCase7 = new TestCase("OnContrastDescription", 6);
            TestCase testCase8 = new TestCase("WWBrandedDescription", 7);
            TestCase testCase9 = new TestCase("ERBrandedDescription", 8);
            TestCase testCase10 = new TestCase("BWBrandedDescription", 9);
            TestCase testCase11 = new TestCase("StandardDescriptionDismiss", 10);
            TestCase testCase12 = new TestCase("OnContrastDescriptionDismiss", 11);
            TestCase testCase13 = new TestCase("WWBrandedDescriptionDismiss", 12);
            TestCase testCase14 = new TestCase("ERBrandedDescriptionDismiss", 13);
            TestCase testCase15 = new TestCase("BWBrandedDescriptionDismiss", 14);
            TestCase testCase16 = new TestCase("StandardDismiss", 15);
            TestCase testCase17 = new TestCase("OnContrastDismiss", 16);
            TestCase testCase18 = new TestCase("WWBrandedDismiss", 17);
            TestCase testCase19 = new TestCase("ERBrandedDismiss", 18);
            TestCase testCase20 = new TestCase("BWBrandedDismiss", 19);
            int i = BroadcastBannerPreviewProvider.f4746a;
            TestCase testCase21 = new TestCase("StandardFull", 20);
            TestCase testCase22 = new TestCase("OnContrastFull", 21);
            TestCase testCase23 = new TestCase("WWBrandedFull", 22);
            TestCase testCase24 = new TestCase("ERBrandedFull", 23);
            int i2 = BroadcastBannerPreviewProvider.f4746a;
            TestCase testCase25 = new TestCase("BWBrandedFull", 24);
            TestCase testCase26 = new TestCase("StandardLink", 25);
            TestCase testCase27 = new TestCase("OnContrastLink", 26);
            TestCase testCase28 = new TestCase("WWBrandedLink", 27);
            TestCase testCase29 = new TestCase("ERBrandedLink", 28);
            TestCase testCase30 = new TestCase("BWBrandedLink", 29);
            TagSpec.Style style = TagSpec.Style.d;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10, testCase11, testCase12, testCase13, testCase14, testCase15, testCase16, testCase17, testCase18, testCase19, testCase20, testCase21, testCase22, testCase23, testCase24, testCase25, testCase26, testCase27, testCase28, testCase29, testCase30, new TestCase("WithTag", 30)};
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

    static {
        new BroadcastBannerSpec.Action(false, "Link", new h(25));
        new BroadcastBannerSpec.Action(true, "Link", new h(25));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
