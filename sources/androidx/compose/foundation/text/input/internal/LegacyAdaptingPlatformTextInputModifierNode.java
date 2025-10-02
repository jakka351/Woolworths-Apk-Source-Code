package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode extends Modifier.Node implements PlatformTextInputModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode {
    public LegacyPlatformTextInputServiceAdapter r;
    public LegacyTextFieldState s;
    public TextFieldSelectionManager t;
    public final MutableState u = SnapshotStateKt.f(null);

    public LegacyAdaptingPlatformTextInputModifierNode(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.r = legacyPlatformTextInputServiceAdapter;
        this.s = legacyTextFieldState;
        this.t = textFieldSelectionManager;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    /* renamed from: C0, reason: from getter */
    public final TextFieldSelectionManager getT() {
        return this.t;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final Job C1(Function2 function2) {
        if (this.q) {
            return BuildersKt.c(g2(), null, CoroutineStart.g, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this, function2, null), 1);
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    /* renamed from: O0, reason: from getter */
    public final LegacyTextFieldState getS() {
        return this.s;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        ((SnapshotMutableStateImpl) this.u).setValue(nodeCoordinator);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final LayoutCoordinates Z0() {
        return (LayoutCoordinates) ((SnapshotMutableStateImpl) this.u).getD();
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final SoftwareKeyboardController getSoftwareKeyboardController() {
        return (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.p);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.s);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = this.r;
        if (legacyPlatformTextInputServiceAdapter.f1163a != null) {
            InlineClassHelperKt.c("Expected textInputModifierNode to be null");
        }
        legacyPlatformTextInputServiceAdapter.f1163a = this;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.r.j(this);
    }
}
