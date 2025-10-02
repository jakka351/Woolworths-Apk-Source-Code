package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {368, 371}, m = "showSnackbar")
/* loaded from: classes2.dex */
final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {
    public SnackbarHostState p;
    public String q;
    public String r;
    public SnackbarDuration s;
    public Mutex t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ SnackbarHostState w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, Continuation continuation) {
        super(continuation);
        this.w = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
