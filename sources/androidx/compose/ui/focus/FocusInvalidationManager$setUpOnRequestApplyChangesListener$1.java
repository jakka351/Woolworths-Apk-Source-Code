package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(FocusInvalidationManager focusInvalidationManager) {
        super(0, focusInvalidationManager, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FocusInvalidationManager.a((FocusInvalidationManager) this.receiver);
        return Unit.f24250a;
    }
}
