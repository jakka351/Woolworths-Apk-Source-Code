package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingContainerKt {
    public static final Modifier a(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, boolean z3, OverscrollEffect overscrollEffect, BringIntoViewSpec bringIntoViewSpec) {
        float f = ClipScrollableContainerKt.f830a;
        Orientation orientation2 = Orientation.d;
        Modifier.Companion companion = Modifier.Companion.d;
        return modifier.x0(orientation == orientation2 ? ClipKt.a(companion, VerticalScrollableClipShape.f849a) : ClipKt.a(companion, HorizontalScrollableClipShape.f836a)).x0(new ScrollingContainerElement(overscrollEffect, bringIntoViewSpec, flingBehavior, orientation, scrollableState, mutableInteractionSource, z, z2, z3));
    }
}
