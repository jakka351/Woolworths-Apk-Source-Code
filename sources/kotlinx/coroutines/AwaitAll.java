package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class AwaitAll<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final Deferred[] f24686a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001R\u001d\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class AwaitAllNode extends JobNode {
        public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        public final CancellableContinuationImpl h;
        public DisposableHandle i;

        public AwaitAllNode(CancellableContinuationImpl cancellableContinuationImpl) {
            this.h = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) throws DispatchException {
            CancellableContinuationImpl cancellableContinuationImpl = this.h;
            if (th != null) {
                cancellableContinuationImpl.getClass();
                Symbol symbolF = cancellableContinuationImpl.F(new CompletedExceptionally(th, false), null);
                if (symbolF != null) {
                    cancellableContinuationImpl.u(symbolF);
                    DisposeHandlersOnCancel disposeHandlersOnCancel = (DisposeHandlersOnCancel) k.get(this);
                    if (disposeHandlersOnCancel != null) {
                        disposeHandlersOnCancel.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AwaitAll.b;
            AwaitAll awaitAll = AwaitAll.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(awaitAll) == 0) {
                Deferred[] deferredArr = awaitAll.f24686a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuationImpl.resumeWith(arrayList);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class DisposeHandlersOnCancel implements CancelHandler {
        public final AwaitAllNode[] d;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.d = awaitAllNodeArr;
        }

        public final void a() {
            for (AwaitAllNode awaitAllNode : this.d) {
                DisposableHandle disposableHandle = awaitAllNode.i;
                if (disposableHandle == null) {
                    Intrinsics.p("handle");
                    throw null;
                }
                disposableHandle.dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void b(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.d + ']';
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.f24686a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    public final Object a(SuspendLambda suspendLambda) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(suspendLambda));
        cancellableContinuationImpl.o();
        Deferred[] deferredArr = this.f24686a;
        int length = deferredArr.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = deferredArr[i];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.i = JobKt.g(deferred, awaitAllNode);
            awaitAllNodeArr[i] = awaitAllNode;
        }
        DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            AwaitAllNode awaitAllNode2 = awaitAllNodeArr[i2];
            awaitAllNode2.getClass();
            AwaitAllNode.k.set(awaitAllNode2, disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.v()) {
            disposeHandlersOnCancel.a();
        } else {
            cancellableContinuationImpl.s(disposeHandlersOnCancel);
        }
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
