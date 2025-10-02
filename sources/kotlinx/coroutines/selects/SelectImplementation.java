package kotlinx.coroutines.selects;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\bR\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlinx/atomicfu/AtomicRef;", "", "state", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    public final CoroutineContext d;
    public Object f;
    private volatile /* synthetic */ Object state$volatile = SelectKt.b;
    public ArrayList e = new ArrayList(2);
    public int g = -1;
    public Object h = SelectKt.e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class ClauseData {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24745a;
        public final Function3 b;
        public final Function3 c;
        public final Object d;
        public final SuspendLambda e;
        public final Function3 f;
        public Object g;
        public int h = -1;

        public ClauseData(Object obj, Function3 function3, Function3 function32, Symbol symbol, SuspendLambda suspendLambda, Function3 function33) {
            this.f24745a = obj;
            this.b = function3;
            this.c = function32;
            this.d = symbol;
            this.e = suspendLambda;
            this.f = function33;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof Segment) {
                ((Segment) obj).h(this.h, SelectImplementation.this.d);
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void a(Segment segment, int i2) {
        this.f = segment;
        this.g = i2;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.c) {
                return;
            }
            Symbol symbol = SelectKt.d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.e;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ClauseData) it.next()).a();
            }
            this.h = SelectKt.e;
            this.e = null;
            return;
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void c(Object obj) {
        this.h = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void d(DisposableHandle disposableHandle) {
        this.f = disposableHandle;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final boolean e(Object obj, Object obj2) {
        return m(obj, obj2) == 0;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.h;
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ClauseData clauseData2 = (ClauseData) it.next();
                if (clauseData2 != clauseData) {
                    clauseData2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, SelectKt.c);
            this.h = SelectKt.e;
            this.e = null;
        }
        Object objInvoke = clauseData.c.invoke(clauseData.f24745a, clauseData.d, obj2);
        Continuation continuation = clauseData.e;
        return clauseData.d == SelectKt.f ? ((Function1) continuation).invoke(continuationImpl) : ((Function2) continuation).invoke(objInvoke, continuationImpl);
    }

    public Object g(Continuation continuation) {
        return i.get(this) instanceof ClauseData ? f((ContinuationImpl) continuation) : h((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ClauseData i(Object obj) {
        ArrayList arrayList = this.e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).f24745a == obj) {
                obj2 = next;
                break;
            }
        }
        ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(SelectClause1 selectClause1, Function2 function2) {
        k(new ClauseData(selectClause1.getF24742a(), selectClause1.getB(), selectClause1.getC(), null, (SuspendLambda) function2, selectClause1.getD()), false);
    }

    public final void k(ClauseData clauseData, boolean z) {
        Object obj = clauseData.f24745a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        if (atomicReferenceFieldUpdater.get(this) instanceof ClauseData) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.e;
            Intrinsics.e(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ClauseData) it.next()).f24745a == obj) {
                        throw new IllegalStateException(b.m(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        clauseData.b.invoke(obj, this, clauseData.d);
        if (this.h != SelectKt.e) {
            atomicReferenceFieldUpdater.set(this, clauseData);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.e;
            Intrinsics.e(arrayList2);
            arrayList2.add(clauseData);
        }
        clauseData.g = this.f;
        clauseData.h = this.g;
        this.f = null;
        this.g = -1;
    }

    public final TrySelectDetailedResult l(BufferedChannel bufferedChannel) {
        int iM = m(bufferedChannel, Unit.f24250a);
        Function3 function3 = SelectKt.f24746a;
        if (iM == 0) {
            return TrySelectDetailedResult.d;
        }
        if (iM == 1) {
            return TrySelectDetailedResult.e;
        }
        if (iM == 2) {
            return TrySelectDetailedResult.f;
        }
        if (iM == 3) {
            return TrySelectDetailedResult.g;
        }
        throw new IllegalStateException(("Unexpected internal result: " + iM).toString());
    }

    public final int m(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (Intrinsics.c(obj3, SelectKt.c) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (Intrinsics.c(obj3, SelectKt.d)) {
                    return 2;
                }
                if (Intrinsics.c(obj3, SelectKt.b)) {
                    List listQ = CollectionsKt.Q(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listQ)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListD0 = CollectionsKt.d0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListD0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            ClauseData clauseDataI = i(obj);
            if (clauseDataI != null) {
                Function3 function3 = clauseDataI.f;
                Function3 function32 = function3 != null ? (Function3) function3.invoke(this, clauseDataI.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, clauseDataI)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                CancellableContinuation cancellableContinuation = (CancellableContinuation) obj3;
                this.h = obj2;
                Function3 function33 = SelectKt.f24746a;
                Symbol symbolW = cancellableContinuation.w(Unit.f24250a, function32);
                if (symbolW == null) {
                    this.h = SelectKt.e;
                    return 2;
                }
                cancellableContinuation.u(symbolW);
                return 0;
            }
            continue;
        }
    }
}
