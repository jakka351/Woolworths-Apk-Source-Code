package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001R\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002X\u0082\u0004R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "Lkotlinx/coroutines/internal/Removed;", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LockFreeLinkedListNode {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(LockFreeLinkedListNode lockFreeLinkedListNode, int i) {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (lockFreeLinkedListNodeE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lockFreeLinkedListNodeE = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNodeE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeE);
                }
            }
            if (lockFreeLinkedListNodeE instanceof ListClosed) {
                return (((ListClosed) lockFreeLinkedListNodeE).g & i) == 0 && lockFreeLinkedListNodeE.c(lockFreeLinkedListNode, i);
            }
            atomicReferenceFieldUpdater.set(lockFreeLinkedListNode, lockFreeLinkedListNodeE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeE, this, lockFreeLinkedListNode)) {
                if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeE) != this) {
                    break;
                }
            }
            lockFreeLinkedListNode.f(this);
            return true;
        }
    }

    public final void d(int i) {
        c(new ListClosed(i), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((kotlinx.coroutines.internal.Removed) r6).f24728a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.e
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeLinkedListNode.d
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof kotlinx.coroutines.internal.Removed
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            kotlinx.coroutines.internal.Removed r6 = (kotlinx.coroutines.internal.Removed) r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = r6.f24728a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.f(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.e():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final void f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (d.get(this) != lockFreeLinkedListNode) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    break;
                }
            }
            if (h()) {
                lockFreeLinkedListNode.e();
                return;
            }
            return;
        }
    }

    public final LockFreeLinkedListNode g() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object obj = d.get(this);
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        if (removed != null && (lockFreeLinkedListNode = removed.f24728a) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) obj;
    }

    public boolean h() {
        return d.get(this) instanceof Removed;
    }

    public final void i() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Removed) {
                return;
            }
            if (obj == this) {
                return;
            }
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
            Removed removed = (Removed) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode);
            if (removed == null) {
                removed = new Removed(lockFreeLinkedListNode);
                atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode, removed);
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            lockFreeLinkedListNode.e();
            return;
        }
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + DebugStringsKt.a(this);
    }
}
