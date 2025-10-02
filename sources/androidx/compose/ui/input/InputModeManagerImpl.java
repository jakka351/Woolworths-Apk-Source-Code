package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1842a;
    public final MutableState b;

    public InputModeManagerImpl(int i, Function1 function1) {
        this.f1842a = function1;
        this.b = SnapshotStateKt.f(new InputMode(i));
    }

    @Override // androidx.compose.ui.input.InputModeManager
    public final int a() {
        return ((InputMode) ((SnapshotMutableStateImpl) this.b).getD()).f1841a;
    }
}
