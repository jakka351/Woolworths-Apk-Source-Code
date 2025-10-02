package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalCoreDesignApi
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TagPreviewProvider implements PreviewParameterProvider<TagPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            TagSpec.Style style = TagSpec.Style.d;
            TagSpec.Size size = TagSpec.Size.h;
            new TagPreviewConfig(style, size);
            TestCase testCase = new TestCase("NewLarge", 0);
            TagSpec.Style style2 = TagSpec.Style.e;
            new TagPreviewConfig(style2, size);
            TestCase testCase2 = new TestCase("SpecialLarge", 1);
            TagSpec.Style style3 = TagSpec.Style.f;
            new TagPreviewConfig(style3, size);
            TestCase testCase3 = new TestCase("AlwaysLarge", 2);
            TagSpec.Style style4 = TagSpec.Style.h;
            new TagPreviewConfig(style4, size);
            TestCase testCase4 = new TestCase("RewardsLarge", 3);
            TagSpec.Style style5 = TagSpec.Style.i;
            new TagPreviewConfig(style5, size);
            TestCase testCase5 = new TestCase("PriceDroppedLarge", 4);
            TagSpec.Style style6 = TagSpec.Style.j;
            new TagPreviewConfig(style6, size);
            TestCase testCase6 = new TestCase("UnavailableLarge", 5);
            TagSpec.Size size2 = TagSpec.Size.g;
            new TagPreviewConfig(style, size2);
            TestCase testCase7 = new TestCase("NewSmall", 6);
            new TagPreviewConfig(style2, size2);
            TestCase testCase8 = new TestCase("SpecialSmall", 7);
            new TagPreviewConfig(style3, size2);
            TestCase testCase9 = new TestCase("AlwaysSmall", 8);
            new TagPreviewConfig(style4, size2);
            TestCase testCase10 = new TestCase("RewardsSmall", 9);
            new TagPreviewConfig(style5, size2);
            TestCase testCase11 = new TestCase("PriceDroppedSmall", 10);
            new TagPreviewConfig(style6, size2);
            TestCase testCase12 = new TestCase("UnavailableSmall", 11);
            TagSpec.Style style7 = TagSpec.Style.g;
            new TagPreviewConfig(style7, size2);
            TestCase testCase13 = new TestCase("AlwaysTintSmall", 12);
            new TagPreviewConfig(style7, size);
            TestCase testCase14 = new TestCase("AlwaysTintLarge", 13);
            TagSpec.Style style8 = TagSpec.Style.k;
            new TagPreviewConfig(style8, size2);
            TestCase testCase15 = new TestCase("InfoTintSmall", 14);
            new TagPreviewConfig(style8, size);
            TestCase testCase16 = new TestCase("InfoTintLarge", 15);
            TagSpec.Style style9 = TagSpec.Style.l;
            new TagPreviewConfig(style9, size2);
            TestCase testCase17 = new TestCase("PrimarySmall", 16);
            new TagPreviewConfig(style9, size);
            TestCase testCase18 = new TestCase("PrimaryLarge", 17);
            TagSpec.Style style10 = TagSpec.Style.m;
            new TagPreviewConfig(style10, size2);
            TestCase testCase19 = new TestCase("AccentSmall", 18);
            new TagPreviewConfig(style10, size);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10, testCase11, testCase12, testCase13, testCase14, testCase15, testCase16, testCase17, testCase18, testCase19, new TestCase("AccentLarge", 19)};
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
