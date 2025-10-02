package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "intercepted", "()Lkotlin/coroutines/Continuation;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient Continuation<Object> intercepted;

    public ContinuationImpl(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: getContext */
    public CoroutineContext getF() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.e(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final Continuation<Object> intercepted() {
        Continuation<Object> continuationC = this.intercepted;
        if (continuationC == null) {
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) getF().get(ContinuationInterceptor.Key.d);
            continuationC = continuationInterceptor != null ? continuationInterceptor.C(this) : this;
            this.intercepted = continuationC;
        }
        return continuationC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getF().get(ContinuationInterceptor.Key.d);
            Intrinsics.e(element);
            ((ContinuationInterceptor) element).a(continuation);
        }
        this.intercepted = CompletedContinuation.d;
    }

    public ContinuationImpl(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getF() : null);
    }
}
