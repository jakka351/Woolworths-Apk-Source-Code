package au.com.woolworths.design.core.ui.component.stable.snackbar;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState", f = "SnackbarHost.kt", l = {341, 344}, m = "showSnackbar")
/* loaded from: classes3.dex */
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {
    public SnackbarVisuals p;
    public Mutex q;
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SnackbarHostState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, Continuation continuation) {
        super(continuation);
        this.t = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, this);
    }
}
