package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextLayoutState {
    public final long a(long j) {
        LayoutCoordinates layoutCoordinatesC = c();
        if (layoutCoordinatesC == null || !layoutCoordinatesC.q()) {
            return TextLayoutStateKt.a(j, Rect.e);
        }
        throw null;
    }

    public final TextLayoutResult b() {
        throw null;
    }

    public final LayoutCoordinates c() {
        throw null;
    }
}
