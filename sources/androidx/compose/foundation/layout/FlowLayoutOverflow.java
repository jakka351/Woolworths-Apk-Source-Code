package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@ExperimentalLayoutApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "OverflowType", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class FlowLayoutOverflow {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OverflowType {
        public static final OverflowType d;
        public static final /* synthetic */ OverflowType[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            OverflowType overflowType = new OverflowType("Visible", 0);
            OverflowType overflowType2 = new OverflowType("Clip", 1);
            d = overflowType2;
            OverflowType[] overflowTypeArr = {overflowType, overflowType2, new OverflowType("ExpandIndicator", 2), new OverflowType("ExpandOrCollapseIndicator", 3)};
            e = overflowTypeArr;
            f = EnumEntriesKt.a(overflowTypeArr);
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) e.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OverflowType overflowType = OverflowType.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlowLayoutOverflow() {
        OverflowType overflowType = OverflowType.d;
    }
}
