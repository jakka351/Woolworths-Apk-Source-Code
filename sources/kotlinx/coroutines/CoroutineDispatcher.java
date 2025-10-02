package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final Key e = new Key(ContinuationInterceptor.Key.d, new au.com.woolworths.android.onesite.analytics.a11y.a(19));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ExperimentalStdlibApi
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key.d);
    }

    public CoroutineDispatcher A(int i) {
        LimitedDispatcherKt.a(i);
        return new LimitedDispatcher(this, i);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final DispatchedContinuation C(ContinuationImpl continuationImpl) {
        return new DispatchedContinuation(this, continuationImpl);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void a(Continuation continuation) {
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.k;
        while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == DispatchedContinuationKt.b) {
        }
        Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
        CancellableContinuationImpl cancellableContinuationImpl = obj instanceof CancellableContinuationImpl ? (CancellableContinuationImpl) obj : null;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.k();
        }
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        CoroutineContext.Element element;
        Intrinsics.h(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext.Key key2 = this.d;
            Intrinsics.h(key2, "key");
            if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.e == key2) && (element = (CoroutineContext.Element) abstractCoroutineContextKey.d.invoke(this)) != null) {
                return element;
            }
        } else if (ContinuationInterceptor.Key.d == key) {
            return this;
        }
        return null;
    }

    public abstract void k(CoroutineContext coroutineContext, Runnable runnable);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (((kotlin.coroutines.CoroutineContext.Element) r3.d.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (kotlin.coroutines.ContinuationInterceptor.Key.d == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        return kotlin.coroutines.EmptyCoroutineContext.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            boolean r1 = r3 instanceof kotlin.coroutines.AbstractCoroutineContextKey
            if (r1 == 0) goto L23
            kotlin.coroutines.AbstractCoroutineContextKey r3 = (kotlin.coroutines.AbstractCoroutineContextKey) r3
            kotlin.coroutines.CoroutineContext$Key r1 = r2.d
            kotlin.jvm.internal.Intrinsics.h(r1, r0)
            if (r1 == r3) goto L18
            kotlin.coroutines.CoroutineContext$Key r0 = r3.e
            if (r0 != r1) goto L17
            goto L18
        L17:
            return r2
        L18:
            kotlin.jvm.functions.Function1 r3 = r3.d
            java.lang.Object r3 = r3.invoke(r2)
            kotlin.coroutines.CoroutineContext$Element r3 = (kotlin.coroutines.CoroutineContext.Element) r3
            if (r3 == 0) goto L2a
            goto L27
        L23:
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key.d
            if (r0 != r3) goto L2a
        L27:
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.d
            return r3
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.minusKey(kotlin.coroutines.CoroutineContext$Key):kotlin.coroutines.CoroutineContext");
    }

    public void r(CoroutineContext coroutineContext, Runnable runnable) {
        DispatchedContinuationKt.b(this, coroutineContext, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.a(this);
    }

    public boolean v(CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined);
    }
}
