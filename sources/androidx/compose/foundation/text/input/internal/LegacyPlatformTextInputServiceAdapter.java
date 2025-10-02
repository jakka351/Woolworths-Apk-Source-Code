package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "LegacyPlatformTextInputNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {

    /* renamed from: a, reason: collision with root package name */
    public LegacyPlatformTextInputNode f1163a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LegacyPlatformTextInputNode {
        /* renamed from: C0 */
        TextFieldSelectionManager getT();

        Job C1(Function2 function2);

        /* renamed from: O0 */
        LegacyTextFieldState getS();

        LayoutCoordinates Z0();

        SoftwareKeyboardController getSoftwareKeyboardController();

        ViewConfiguration getViewConfiguration();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void e() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f1163a;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void f() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f1163a;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    public abstract void i();

    public final void j(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        if (this.f1163a != legacyAdaptingPlatformTextInputModifierNode) {
            InlineClassHelperKt.c("Expected textInputModifierNode to be " + legacyAdaptingPlatformTextInputModifierNode + " but was " + this.f1163a);
        }
        this.f1163a = null;
    }
}
