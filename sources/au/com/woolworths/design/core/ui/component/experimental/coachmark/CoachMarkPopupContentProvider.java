package au.com.woolworths.design.core.ui.component.experimental.coachmark;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoachMarkPopupContentProvider implements PreviewParameterProvider<CoachMarkPopupContentConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentConfig;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase implements CoachMarkPopupContentConfig {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.Bottom", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Bottom extends TestCase {
            public Bottom() {
                super("Bottom", 4);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.MaxLeftBottom", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MaxLeftBottom extends TestCase {
            public MaxLeftBottom() {
                super("MaxLeftBottom", 0);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.MaxLeftTop", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MaxLeftTop extends TestCase {
            public MaxLeftTop() {
                super("MaxLeftTop", 1);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.MaxRightBottom", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MaxRightBottom extends TestCase {
            public MaxRightBottom() {
                super("MaxRightBottom", 2);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.MaxRightTop", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MaxRightTop extends TestCase {
            public MaxRightTop() {
                super("MaxRightTop", 3);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider.TestCase.Top", "Lau/com/woolworths/design/core/ui/component/experimental/coachmark/CoachMarkPopupContentProvider$TestCase;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Top extends TestCase {
            public Top() {
                super("Top", 5);
                CoachMarkPopupDirection coachMarkPopupDirection = CoachMarkPopupDirection.d;
            }
        }

        static {
            TestCase[] testCaseArr = {new MaxLeftBottom(), new MaxLeftTop(), new MaxRightBottom(), new MaxRightTop(), new Bottom(), new Top()};
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
