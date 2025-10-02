package androidx.compose.ui.node;

import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Companion", "OnLayoutCompletedListener", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Owner extends PositionCalculator {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnLayoutCompletedListener {
        void l();
    }

    static /* synthetic */ OwnedLayer j(Owner owner, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z, int i) {
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return owner.e(function2, function0, graphicsLayer, z);
    }

    void B(Function0 function0);

    void C();

    void D(LayoutNode layoutNode);

    void a(boolean z);

    void b(LayoutNode layoutNode);

    void d(LayoutNode layoutNode);

    OwnedLayer e(Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z);

    void f(BackwardsCompatNode$initializeModifier$3 backwardsCompatNode$initializeModifier$3);

    void g(LayoutNode layoutNode, long j);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    CoroutineContext getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    LayoutNode getRoot();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    long h(long j);

    void i(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void k();

    default void l() {
    }

    void m();

    void o(LayoutNode layoutNode, boolean z, boolean z2);

    long p(long j);

    void q(LayoutNode layoutNode);

    void s(LayoutNode layoutNode, boolean z);

    void setShowLayoutBounds(boolean z);

    void t(LayoutNode layoutNode);

    void u(LayoutNode layoutNode);

    void v(Function2 function2, ContinuationImpl continuationImpl);

    default void w(int i, LayoutNode layoutNode) {
    }

    default void x(int i, LayoutNode layoutNode) {
    }

    void y(LayoutNode layoutNode);
}
