package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition;", "", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindowAlignmentMarginPosition {

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Horizontal;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Horizontal implements MenuPosition.Horizontal {
        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        public final int a(IntRect intRect, long j, int i, LayoutDirection layoutDirection) {
            int i2 = (int) (j >> 32);
            if (i >= i2) {
                return Alignment.Companion.n.a(i, i2, layoutDirection);
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Horizontal) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Horizontal(alignment=" + ((Object) null) + ", margin=0)";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/WindowAlignmentMarginPosition$Vertical;", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Vertical implements MenuPosition.Vertical {
        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        public final int a(IntRect intRect, long j, int i) {
            int i2 = (int) (j & 4294967295L);
            if (i >= i2 - (0 * 2)) {
                return Alignment.Companion.k.a(i, i2);
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Vertical) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vertical(alignment=");
            sb.append((Object) null);
            sb.append(", margin=");
            return YU.a.l(sb, 0, ')');
        }
    }
}
