package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/DelegatingSoftwareKeyboardController;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputService f1966a;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        this.f1966a = textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void a() {
        TextInputService textInputService = this.f1966a;
        if (((TextInputSession) textInputService.b.get()) != null) {
            textInputService.f2128a.f();
        }
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void b() {
        this.f1966a.f2128a.e();
    }
}
