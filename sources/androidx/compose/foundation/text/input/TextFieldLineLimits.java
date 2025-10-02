package androidx.compose.foundation.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "Companion", "MultiLine", "SingleLine", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TextFieldLineLimits {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class MultiLine implements TextFieldLineLimits {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return -2147483618;
        }

        public final String toString() {
            return "MultiLine(minHeightInLines=1, maxHeightInLines=2147483647)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SingleLine implements TextFieldLineLimits {
        public final String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
