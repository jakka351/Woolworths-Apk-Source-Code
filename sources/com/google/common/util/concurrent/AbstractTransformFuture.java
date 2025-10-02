package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    public static final /* synthetic */ int m = 0;
    public ListenableFuture k;
    public com.google.common.cache.a l;

    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object p(com.google.common.cache.a aVar, Object obj) {
            ((AsyncFunction) aVar).apply(obj);
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void q(Object obj) {
            o((ListenableFuture) obj);
        }
    }

    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final Object p(com.google.common.cache.a aVar, Object obj) {
            aVar.apply(obj);
            return obj;
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void q(Object obj) {
            m(obj);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        j(this.k);
        this.k = null;
        this.l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        String str;
        ListenableFuture listenableFuture = this.k;
        com.google.common.cache.a aVar = this.l;
        String strK = super.k();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (aVar == null) {
            if (strK != null) {
                return YU.a.g(str, strK);
            }
            return null;
        }
        return str + "function=[" + aVar + "]";
    }

    public abstract Object p(com.google.common.cache.a aVar, Object obj);

    public abstract void q(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.k;
        com.google.common.cache.a aVar = this.l;
        if (((this.d instanceof AbstractFuture.Cancellation) | (listenableFuture == null)) || (aVar == null)) {
            return;
        }
        this.k = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objP = p(aVar, Futures.b(listenableFuture));
                this.l = null;
                q(objP);
            } catch (Throwable th) {
                try {
                    Platform.a(th);
                    n(th);
                } finally {
                    this.l = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            n(e2.getCause());
        } catch (Exception e3) {
            n(e3);
        }
    }
}
