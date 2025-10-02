package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.TouchBoundsExpansion;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    void D0();

    default void P() {
        D0();
    }

    default boolean Z1() {
        return false;
    }

    default void c2() {
        D0();
    }

    default void d0() {
    }

    void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    default long w0() {
        int i = TouchBoundsExpansion.b;
        return TouchBoundsExpansion.Companion.b();
    }
}
