package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {

    /* renamed from: a, reason: collision with root package name */
    public final int f1743a;
    public boolean b;

    public CancelIndicatingFocusBoundaryScope(int i) {
        this.f1743a = i;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public final void a() {
        this.b = true;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* renamed from: b, reason: from getter */
    public final int getF1743a() {
        return this.f1743a;
    }
}
