package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FocusOwnerImpl$focusInvalidationManager$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.receiver;
        if (focusOwnerImpl.l == null || focusOwnerImpl.f.a1() == FocusStateImpl.g) {
            focusOwnerImpl.c.invoke();
        }
        return Unit.f24250a;
    }
}
