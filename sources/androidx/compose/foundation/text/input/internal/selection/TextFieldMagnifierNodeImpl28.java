package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public Job A;
    public TransformedTextFieldState t;
    public TextFieldSelectionState u;
    public TextLayoutState v;
    public boolean w;
    public final MutableState x;
    public final Animatable y;
    public final MagnifierNode z;

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        this.t = transformedTextFieldState;
        this.u = textFieldSelectionState;
        this.v = textLayoutState;
        this.w = z;
        MutableState mutableStateF = SnapshotStateKt.f(new IntSize(0L));
        this.x = mutableStateF;
        TextFieldMagnifierKt.a(this.t, this.u, this.v, ((IntSize) ((SnapshotMutableStateImpl) mutableStateF).getD()).f2202a);
        this.y = new Animatable(new Offset(9205357640488583168L), SelectionMagnifierKt.b, new Offset(SelectionMagnifierKt.c), 8);
        MagnifierNode magnifierNode = new MagnifierNode(new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new Offset(((Offset) this.h.y.f()).f1751a);
            }
        }, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((DpSize) obj).f2199a;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.h;
                Density density = (Density) CompositionLocalConsumerModifierNodeKt.a(textFieldMagnifierNodeImpl28, staticProvidableCompositionLocal);
                ((SnapshotMutableStateImpl) textFieldMagnifierNodeImpl28.x).setValue(new IntSize((density.r1(DpSize.b(j)) << 32) | (density.r1(DpSize.a(j)) & 4294967295L)));
                return Unit.f24250a;
            }
        }, PlatformMagnifierFactory.Companion.a());
        s2(magnifierNode);
        this.z = magnifierNode;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
        this.z.I(layoutNodeDrawScope);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void Q(NodeCoordinator nodeCoordinator) {
        this.z.Q(nodeCoordinator);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.z.b2(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        w2();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public final void v2(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        TransformedTextFieldState transformedTextFieldState2 = this.t;
        TextFieldSelectionState textFieldSelectionState2 = this.u;
        TextLayoutState textLayoutState2 = this.v;
        boolean z2 = this.w;
        this.t = transformedTextFieldState;
        this.u = textFieldSelectionState;
        this.v = textLayoutState;
        this.w = z;
        if (Intrinsics.c(transformedTextFieldState, transformedTextFieldState2) && Intrinsics.c(textFieldSelectionState, textFieldSelectionState2) && Intrinsics.c(textLayoutState, textLayoutState2) && z == z2) {
            return;
        }
        w2();
    }

    public final void w2() {
        Job job = this.A;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        this.A = null;
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f839a;
        this.A = BuildersKt.c(g2(), null, null, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3);
    }
}
