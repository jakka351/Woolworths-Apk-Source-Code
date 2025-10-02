package au.com.woolworths.compose.utils.modifier;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/BorderModifierPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/compose/utils/modifier/BorderConfig;", "TestCases", "Companion", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class BorderModifierPreviewProvider implements PreviewParameterProvider<BorderConfig> {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4712a = 0;
    public static final float b = 20;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/BorderModifierPreviewProvider$Companion;", "", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/BorderModifierPreviewProvider$TestCases;", "", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCases {
        public static final /* synthetic */ TestCases[] e;
        public static final /* synthetic */ EnumEntries f;
        public final BorderConfig d;

        static {
            float f2 = BorderModifierPreviewProvider.f4712a;
            TestCases testCases = new TestCases("AllSide", 0, new BorderConfig(f2, true, true, true, true));
            float f3 = BorderModifierPreviewProvider.b;
            TestCases[] testCasesArr = {testCases, new TestCases("AllSideRounded", 1, new BorderConfig(f3, true, true, true, true)), new TestCases("HorizontalSides", 2, new BorderConfig(f2, true, false, true, false)), new TestCases("VerticalSides", 3, new BorderConfig(f2, false, true, false, true)), new TestCases("ThreeSidesMissingTop", 4, new BorderConfig(f2, true, false, true, true)), new TestCases("ThreeSidesMissingTopRounded", 5, new BorderConfig(f3, true, false, true, true)), new TestCases("ThreeSidesMissingBottom", 6, new BorderConfig(f2, true, true, true, false)), new TestCases("ThreeSidesMissingBottomRounded", 7, new BorderConfig(f3, true, true, true, false))};
            e = testCasesArr;
            f = EnumEntriesKt.a(testCasesArr);
        }

        public TestCases(String str, int i, BorderConfig borderConfig) {
            this.d = borderConfig;
        }

        public static TestCases valueOf(String str) {
            return (TestCases) Enum.valueOf(TestCases.class, str);
        }

        public static TestCases[] values() {
            return (TestCases[]) e.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCases.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCases) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
