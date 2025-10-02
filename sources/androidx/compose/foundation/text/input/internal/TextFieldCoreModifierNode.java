package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public ScrollState A;
    public Orientation B;
    public CursorAnimationState C;
    public Job D;
    public final TextFieldMagnifierNode E;
    public boolean t;
    public boolean u;
    public TextLayoutState v;
    public TransformedTextFieldState w;
    public TextFieldSelectionState x;
    public Brush y;
    public boolean z;

    public TextFieldCoreModifierNode(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation) {
        this.t = z;
        this.u = z2;
        this.v = textLayoutState;
        this.w = transformedTextFieldState;
        this.x = textFieldSelectionState;
        this.y = brush;
        this.z = z3;
        this.A = scrollState;
        this.B = orientation;
        new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
        boolean z4 = z || z2;
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f839a;
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z4);
        s2(textFieldMagnifierNodeImpl28);
        this.E = textFieldMagnifierNodeImpl28;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
        this.w.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        this.v.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.E.b2(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        if (this.t && v2()) {
            w2();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult n(final MeasureScope measureScope, Measurable measurable, long j) {
        if (this.B == Orientation.d) {
            final Placeable placeableC0 = measurable.c0(Constraints.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int iMin = Math.min(placeableC0.e, Constraints.g(j));
            return measureScope.L0(placeableC0.d, iMin, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(measureScope, iMin, placeableC0) { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
                public final /* synthetic */ MeasureScope i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    this.h.w.getClass();
                    throw null;
                }
            });
        }
        final Placeable placeableC02 = measurable.c0(Constraints.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int iMin2 = Math.min(placeableC02.d, Constraints.h(j));
        return measureScope.L0(iMin2, placeableC02.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>(measureScope, iMin2, placeableC02) { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            public final /* synthetic */ MeasureScope i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.h.w.getClass();
                throw null;
            }
        });
    }

    public final boolean v2() {
        if (!this.z) {
            return false;
        }
        if (!this.t && !this.u) {
            return false;
        }
        Brush brush = this.y;
        int i = TextFieldCoreModifierKt.f1169a;
        return ((brush instanceof SolidColor) && ((SolidColor) brush).f1783a == 16) ? false : true;
    }

    public final void w2() {
        if (this.C == null) {
            this.C = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.w)).booleanValue());
            DrawModifierNodeKt.a(this);
        }
        this.D = BuildersKt.c(g2(), null, null, new TextFieldCoreModifierNode$startCursorJob$1(this, null), 3);
    }
}
