package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectInstance;

@Deprecated
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\t\n\u000b\f\rR\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "Lkotlinx/coroutines/ChildHandle;", "_parentHandle", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class JobSupport implements Job, ChildJob, ParentJob {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CancellableContinuationImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        public final JobSupport l;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(1, continuation);
            this.l = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final Throwable m(JobSupport jobSupport) {
            Throwable thC;
            JobSupport jobSupport2 = this.l;
            jobSupport2.getClass();
            Object obj = JobSupport.d.get(jobSupport2);
            return (!(obj instanceof Finishing) || (thC = ((Finishing) obj).c()) == null) ? obj instanceof CompletedExceptionally ? ((CompletedExceptionally) obj).f24689a : jobSupport.getCancellationException() : thC;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final String z() {
            return "AwaitContinuation";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChildCompletion extends JobNode {
        public final JobSupport h;
        public final Finishing i;
        public final ChildHandleNode j;
        public final Object k;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.h = jobSupport;
            this.i = finishing;
            this.j = childHandleNode;
            this.k = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            ChildHandleNode childHandleNode = this.j;
            ChildHandleNode childHandleNodeC0 = JobSupport.c0(childHandleNode);
            JobSupport jobSupport = this.h;
            Finishing finishing = this.i;
            Object obj = this.k;
            if (childHandleNodeC0 == null || !jobSupport.m0(finishing, childHandleNodeC0, obj)) {
                finishing.d.d(2);
                ChildHandleNode childHandleNodeC02 = JobSupport.c0(childHandleNode);
                if (childHandleNodeC02 == null || !jobSupport.m0(finishing, childHandleNodeC02, obj)) {
                    jobSupport.m(jobSupport.M(finishing, obj));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Finishing implements Incomplete {
        public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final NodeList d;

        public Finishing(NodeList nodeList, Throwable th) {
            this.d = nodeList;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable thC = c();
            if (thC == null) {
                f.set(this, th);
                return;
            }
            if (th == thC) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: b, reason: from getter */
        public final NodeList getD() {
            return this.d;
        }

        public final Throwable c() {
            return (Throwable) f.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th != null && !th.equals(thC)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, JobSupportKt.e);
            return arrayList;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: isActive */
        public final boolean getD() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(e.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(c());
            sb.append(", exceptions=");
            sb.append(g.get(this));
            sb.append(", list=");
            sb.append(this.d);
            sb.append(']');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public final class SelectOnAwaitCompletionHandler extends JobNode {
        public final SelectInstance h;

        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
            this.h = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            JobSupport jobSupport = JobSupport.this;
            jobSupport.getClass();
            Object objA = JobSupport.d.get(jobSupport);
            if (!(objA instanceof CompletedExceptionally)) {
                objA = JobSupportKt.a(objA);
            }
            this.h.e(jobSupport, objA);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public final class SelectOnJoinCompletionHandler extends JobNode {
        public final SelectInstance h;

        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
            this.h = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            this.h.e(JobSupport.this, Unit.f24250a);
        }
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? JobSupportKt.g : JobSupportKt.f;
    }

    public static ChildHandleNode c0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.e;
            LockFreeLinkedListNode lockFreeLinkedListNodeE = lockFreeLinkedListNode.e();
            if (lockFreeLinkedListNodeE == null) {
                Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNode.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                }
            } else {
                lockFreeLinkedListNode = lockFreeLinkedListNodeE;
            }
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.g();
            if (!lockFreeLinkedListNode.h()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    public static String j0(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).getD() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.d() ? "Cancelling" : Finishing.e.get(finishing) == 1 ? "Completing" : "Active";
    }

    public static CancellationException k0(JobSupport jobSupport, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(jobSupport.I(), th, jobSupport) : cancellationException;
    }

    public void A(Object obj) {
        m(obj);
    }

    public final Object B(Continuation continuation) throws Throwable {
        Object obj;
        do {
            obj = d.get(this);
            if (!(obj instanceof Incomplete)) {
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).f24689a;
                }
                return JobSupportKt.a(obj);
            }
        } while (i0(obj) < 0);
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.b(continuation), this);
        awaitContinuation.o();
        CancellableContinuationKt.a(awaitContinuation, JobKt.g(this, new ResumeAwaitOnCompletion(awaitContinuation)));
        Object objN = awaitContinuation.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.D(java.lang.Object):boolean");
    }

    public void E(Throwable th) {
        D(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.ParentJob
    public final CancellationException F() {
        CancellationException cancellationExceptionC;
        Object obj = d.get(this);
        if (obj instanceof Finishing) {
            cancellationExceptionC = ((Finishing) obj).c();
        } else if (obj instanceof CompletedExceptionally) {
            cancellationExceptionC = ((CompletedExceptionally) obj).f24689a;
        } else {
            if (obj instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(j0(obj)), cancellationExceptionC, this) : cancellationException;
    }

    public final boolean G(Throwable th) {
        if (!Y()) {
            boolean z = th instanceof CancellationException;
            ChildHandle childHandle = (ChildHandle) e.get(this);
            return (childHandle == null || childHandle == NonDisposableHandle.d) ? z : childHandle.a(th) || z;
        }
        return true;
    }

    public String I() {
        return "Job was cancelled";
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return D(th) && getF();
    }

    public final void K(Incomplete incomplete, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        if (childHandle != null) {
            childHandle.dispose();
            atomicReferenceFieldUpdater.set(this, NonDisposableHandle.d);
        }
        CompletionHandlerException completionHandlerException = null;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f24689a : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).l(th);
                return;
            } catch (Throwable th2) {
                V(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList d2 = incomplete.getD();
        if (d2 != null) {
            d2.d(1);
            Object obj2 = LockFreeLinkedListNode.d.get(d2);
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (LockFreeLinkedListNode lockFreeLinkedListNodeG = (LockFreeLinkedListNode) obj2; !lockFreeLinkedListNodeG.equals(d2); lockFreeLinkedListNodeG = lockFreeLinkedListNodeG.g()) {
                if (lockFreeLinkedListNodeG instanceof JobNode) {
                    try {
                        ((JobNode) lockFreeLinkedListNodeG).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            kotlin.ExceptionsKt.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeG + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                V(completionHandlerException);
            }
        }
    }

    public final Throwable L(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(I(), null, this) : th;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).F();
    }

    public final Object M(Finishing finishing, Object obj) {
        boolean zD;
        Throwable thP;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f24689a : null;
        synchronized (finishing) {
            zD = finishing.d();
            ArrayList<Throwable> arrayListE = finishing.e(th);
            thP = P(finishing, arrayListE);
            if (thP != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thP && th2 != thP && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        kotlin.ExceptionsKt.a(thP, th2);
                    }
                }
            }
        }
        if (thP != null && thP != th) {
            obj = new CompletedExceptionally(thP, false);
        }
        if (thP != null && (G(thP) || U(thP))) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            CompletedExceptionally.b.compareAndSet((CompletedExceptionally) obj, 0, 1);
        }
        if (!zD) {
            e0(thP);
        }
        f0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, incompleteStateBox) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        K(finishing, obj);
        return obj;
    }

    public final Throwable N() {
        Object obj = d.get(this);
        if (obj instanceof Finishing) {
            Throwable thC = ((Finishing) obj).c();
            if (thC != null) {
                return thC;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj instanceof CompletedExceptionally) {
            return ((CompletedExceptionally) obj).f24689a;
        }
        return null;
    }

    public final boolean O() {
        Object obj = d.get(this);
        if (obj instanceof CompletedExceptionally) {
            return CompletedExceptionally.b.get((CompletedExceptionally) obj) == 1;
        }
        return false;
    }

    public final Throwable P(Finishing finishing, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (finishing.d()) {
                return new JobCancellationException(I(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: Q */
    public boolean getF() {
        return true;
    }

    public boolean S() {
        return this instanceof CompletableDeferredImpl;
    }

    public final NodeList T(Incomplete incomplete) {
        NodeList d2 = incomplete.getD();
        if (d2 != null) {
            return d2;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            h0((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    public boolean U(Throwable th) {
        return false;
    }

    public void V(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void W(Job job) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        NonDisposableHandle nonDisposableHandle = NonDisposableHandle.d;
        if (job == null) {
            atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        atomicReferenceFieldUpdater.set(this, childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.InactiveNodeList] */
    public final DisposableHandle X(boolean z, JobNode jobNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        NonDisposableHandle nonDisposableHandle;
        boolean z2;
        boolean zC;
        jobNode.g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof Empty;
            nonDisposableHandle = NonDisposableHandle.d;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof Incomplete)) {
                    z2 = false;
                    break;
                }
                Incomplete incomplete = (Incomplete) obj;
                NodeList d2 = incomplete.getD();
                if (d2 == null) {
                    h0((JobNode) obj);
                } else {
                    if (jobNode.k()) {
                        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
                        Throwable thC = finishing != null ? finishing.c() : null;
                        if (thC == null) {
                            zC = d2.c(jobNode, 5);
                        } else if (z) {
                            jobNode.l(thC);
                            return nonDisposableHandle;
                        }
                    } else {
                        zC = d2.c(jobNode, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                Empty empty = (Empty) obj;
                boolean z4 = empty.d;
                if (z4) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jobNode)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                NodeList nodeList = new NodeList();
                if (!z4) {
                    nodeList = new InactiveNodeList(nodeList);
                }
                kotlin.reflect.jvm.internal.impl.types.checker.a.t(atomicReferenceFieldUpdater, this, empty, nodeList);
            }
        }
        if (z2) {
            return jobNode;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
            jobNode.l(completedExceptionally != null ? completedExceptionally.f24689a : null);
        }
        return nonDisposableHandle;
    }

    public boolean Y() {
        return this instanceof BlockingCoroutine;
    }

    public final boolean Z(Object obj) {
        Object objL0;
        do {
            objL0 = l0(d.get(this), obj);
            if (objL0 == JobSupportKt.f24694a) {
                return false;
            }
            if (objL0 == JobSupportKt.b) {
                return true;
            }
        } while (objL0 == JobSupportKt.c);
        m(objL0);
        return true;
    }

    public final Object a0(Object obj) {
        Object objL0;
        do {
            objL0 = l0(d.get(this), obj);
            if (objL0 == JobSupportKt.f24694a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
                throw new IllegalStateException(str, completedExceptionally != null ? completedExceptionally.f24689a : null);
            }
        } while (objL0 == JobSupportKt.c);
        return objL0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.InactiveNodeList] */
    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        ChildHandleNode childHandleNode = new ChildHandleNode(childJob);
        childHandleNode.g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Empty) {
                Empty empty = (Empty) obj;
                boolean z = empty.d;
                if (z) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, childHandleNode)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                NodeList nodeList = new NodeList();
                if (!z) {
                    nodeList = new InactiveNodeList(nodeList);
                }
                kotlin.reflect.jvm.internal.impl.types.checker.a.t(atomicReferenceFieldUpdater, this, empty, nodeList);
            } else {
                boolean z2 = obj instanceof Incomplete;
                NonDisposableHandle nonDisposableHandle = NonDisposableHandle.d;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
                    childHandleNode.l(completedExceptionally != null ? completedExceptionally.f24689a : null);
                    return nonDisposableHandle;
                }
                NodeList d2 = ((Incomplete) obj).getD();
                if (d2 == null) {
                    h0((JobNode) obj);
                } else if (!d2.c(childHandleNode, 7)) {
                    boolean zC = d2.c(childHandleNode, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof Finishing) {
                        thC = ((Finishing) obj3).c();
                    } else {
                        CompletedExceptionally completedExceptionally2 = obj3 instanceof CompletedExceptionally ? (CompletedExceptionally) obj3 : null;
                        if (completedExceptionally2 != null) {
                            thC = completedExceptionally2.f24689a;
                        }
                    }
                    childHandleNode.l(thC);
                    if (zC) {
                        break loop0;
                    }
                    return nonDisposableHandle;
                }
            }
        }
        return childHandleNode;
    }

    public String b0() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.Job
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final void d0(NodeList nodeList, Throwable th) {
        e0(th);
        nodeList.d(4);
        Object obj = LockFreeLinkedListNode.d.get(nodeList);
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeG = (LockFreeLinkedListNode) obj; !lockFreeLinkedListNodeG.equals(nodeList); lockFreeLinkedListNodeG = lockFreeLinkedListNodeG.g()) {
            if ((lockFreeLinkedListNodeG instanceof JobNode) && ((JobNode) lockFreeLinkedListNodeG).k()) {
                try {
                    ((JobNode) lockFreeLinkedListNodeG).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeG + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V(completionHandlerException);
        }
        G(th);
    }

    public void e0(Throwable th) {
    }

    public void f0(Object obj) {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.h(operation, "operation");
        return operation.invoke(obj, this);
    }

    public void g0() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.a(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        Object obj = d.get(this);
        if (!(obj instanceof Finishing)) {
            if (!(obj instanceof Incomplete)) {
                return obj instanceof CompletedExceptionally ? k0(this, ((CompletedExceptionally) obj).f24689a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((Finishing) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = I();
        }
        return new JobCancellationException(strConcat, thC, this);
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new JobSupport$children$1(null, this));
    }

    public Object getCompleted() throws Throwable {
        Object obj = d.get(this);
        if (obj instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj).f24689a;
        }
        return JobSupportKt.a(obj);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = d.get(this);
        if (obj instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f24689a;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* renamed from: getKey */
    public final CoroutineContext.Key getD() {
        return Job.Key.d;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.d;
        TypeIntrinsics.d(3, jobSupport$onJoin$1);
        return new SelectClause0Impl(this, jobSupport$onJoin$1);
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        ChildHandle childHandle = (ChildHandle) e.get(this);
        if (childHandle != null) {
            return childHandle.getParent();
        }
        return null;
    }

    public boolean h(Object obj) {
        return Z(obj);
    }

    public final void h0(JobNode jobNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        NodeList nodeList = new NodeList();
        jobNode.getClass();
        LockFreeLinkedListNode.e.set(nodeList, jobNode);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.d;
        atomicReferenceFieldUpdater2.set(nodeList, jobNode);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(jobNode) == jobNode) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(jobNode, jobNode, nodeList)) {
                    if (atomicReferenceFieldUpdater2.get(jobNode) != jobNode) {
                        break;
                    }
                }
                nodeList.f(jobNode);
                break loop0;
            }
            break;
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeG = jobNode.g();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jobNode, lockFreeLinkedListNodeG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == jobNode);
    }

    public final int i0(Object obj) {
        boolean z = obj instanceof Empty;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((Empty) obj).d) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, JobSupportKt.g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            g0();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        NodeList nodeList = ((InactiveNodeList) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nodeList)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        g0();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return X(true, new InvokeOnCompletion(function1));
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object obj = d.get(this);
        return (obj instanceof Incomplete) && ((Incomplete) obj).getD();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object obj = d.get(this);
        if (obj instanceof CompletedExceptionally) {
            return true;
        }
        return (obj instanceof Finishing) && ((Finishing) obj).d();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(d.get(this) instanceof Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        Object obj;
        Unit unit;
        do {
            obj = d.get(this);
            boolean z = obj instanceof Incomplete;
            unit = Unit.f24250a;
            if (!z) {
                JobKt.e(continuation.getE());
                return unit;
            }
        } while (i0(obj) < 0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        CancellableContinuationKt.a(cancellableContinuationImpl, JobKt.g(this, new ResumeOnCompletion(cancellableContinuationImpl)));
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (objN != coroutineSingletons) {
            objN = unit;
        }
        return objN == coroutineSingletons ? objN : unit;
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void l(JobSupport jobSupport) {
        D(jobSupport);
    }

    public final Object l0(Object obj, Object obj2) {
        if (!(obj instanceof Incomplete)) {
            return JobSupportKt.f24694a;
        }
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            Incomplete incomplete = (Incomplete) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object incompleteStateBox = obj2 instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, incomplete, incompleteStateBox)) {
                if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                    return JobSupportKt.c;
                }
            }
            e0(null);
            f0(obj2);
            K(incomplete, obj2);
            return obj2;
        }
        Incomplete incomplete2 = (Incomplete) obj;
        NodeList nodeListT = T(incomplete2);
        if (nodeListT == null) {
            return JobSupportKt.c;
        }
        Finishing finishing = incomplete2 instanceof Finishing ? (Finishing) incomplete2 : null;
        if (finishing == null) {
            finishing = new Finishing(nodeListT, null);
        }
        synchronized (finishing) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Finishing.e;
            if (atomicIntegerFieldUpdater.get(finishing) == 1) {
                return JobSupportKt.f24694a;
            }
            atomicIntegerFieldUpdater.set(finishing, 1);
            if (finishing != incomplete2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, incomplete2, finishing)) {
                    if (atomicReferenceFieldUpdater2.get(this) != incomplete2) {
                        return JobSupportKt.c;
                    }
                }
            }
            boolean zD = finishing.d();
            CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
            if (completedExceptionally != null) {
                finishing.a(completedExceptionally.f24689a);
            }
            Throwable thC = zD ? null : finishing.c();
            if (thC != null) {
                d0(nodeListT, thC);
            }
            ChildHandleNode childHandleNodeC0 = c0(nodeListT);
            if (childHandleNodeC0 != null && m0(finishing, childHandleNodeC0, obj2)) {
                return JobSupportKt.b;
            }
            nodeListT.d(2);
            ChildHandleNode childHandleNodeC02 = c0(nodeListT);
            return (childHandleNodeC02 == null || !m0(finishing, childHandleNodeC02, obj2)) ? M(finishing, obj2) : JobSupportKt.b;
        }
    }

    public void m(Object obj) {
    }

    public final boolean m0(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        do {
            ChildJob childJob = childHandleNode.h;
            ChildCompletion childCompletion = new ChildCompletion(this, finishing, childHandleNode, obj);
            if ((childJob instanceof JobSupport ? ((JobSupport) childJob).X(false, childCompletion) : childJob.invokeOnCompletion(false, false, new JobKt__JobKt$invokeOnCompletion$1(childCompletion))) != NonDisposableHandle.d) {
                return true;
            }
            childHandleNode = c0(childHandleNode);
        } while (childHandleNode != null);
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        return job;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iI0;
        do {
            iI0 = i0(d.get(this));
            if (iI0 == 0) {
                return false;
            }
        } while (iI0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0() + '{' + j0(d.get(this)) + '}');
        sb.append('@');
        sb.append(DebugStringsKt.a(this));
        return sb.toString();
    }

    public boolean y(Throwable th) {
        return D(th);
    }

    @Override // kotlinx.coroutines.Job
    public /* synthetic */ boolean cancel(Throwable th) {
        E(th != null ? k0(this, th) : new JobCancellationException(I(), null, this));
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.c(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        JobNode invokeOnCompletion;
        if (z) {
            invokeOnCompletion = new InvokeOnCancelling(function1);
        } else {
            invokeOnCompletion = new InvokeOnCompletion(function1);
        }
        return X(z2, invokeOnCompletion);
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(I(), null, this);
        }
        E(cancellationException);
    }
}
