package androidx.compose.material3.internal;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition;", "", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MenuPosition {

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Horizontal {
        int a(IntRect intRect, long j, int i, LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Vertical;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Vertical {
        int a(IntRect intRect, long j, int i);
    }
}
