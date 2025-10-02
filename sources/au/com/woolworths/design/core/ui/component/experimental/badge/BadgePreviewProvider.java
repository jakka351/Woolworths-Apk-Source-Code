package au.com.woolworths.design.core.ui.component.experimental.badge;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/badge/BadgePreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/badge/BadgePreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BadgePreviewProvider implements PreviewParameterProvider<BadgePreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/badge/BadgePreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final BadgePreviewConfig d;

        static {
            BadgeVariant[] badgeVariantArr = BadgeVariant.d;
            TestCase testCase = new TestCase("Primary", 0, new BadgePreviewConfig());
            BadgeVariant[] badgeVariantArr2 = BadgeVariant.d;
            TestCase testCase2 = new TestCase("Secondary", 1, new BadgePreviewConfig());
            BadgeVariant[] badgeVariantArr3 = BadgeVariant.d;
            TestCase testCase3 = new TestCase("Tertiary", 2, new BadgePreviewConfig());
            BadgeVariant[] badgeVariantArr4 = BadgeVariant.d;
            TestCase testCase4 = new TestCase("OnContrast", 3, new BadgePreviewConfig());
            BadgeVariant[] badgeVariantArr5 = BadgeVariant.d;
            TestCase testCase5 = new TestCase("Accent", 4, new BadgePreviewConfig());
            BadgeVariant[] badgeVariantArr6 = BadgeVariant.d;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, new TestCase("New", 5, new BadgePreviewConfig()), new TestCase("PrimaryNoText", 6, new BadgePreviewConfig()), new TestCase("SecondaryNoText", 7, new BadgePreviewConfig()), new TestCase("TertiaryNoText", 8, new BadgePreviewConfig()), new TestCase("OnContrastNoText", 9, new BadgePreviewConfig()), new TestCase("AccentNoText", 10, new BadgePreviewConfig()), new TestCase("NewNoText", 11, new BadgePreviewConfig())};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, BadgePreviewConfig badgePreviewConfig) {
            this.d = badgePreviewConfig;
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
        List list = TestCase.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
