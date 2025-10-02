package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ConcurrentLinkedListNode(Segment segment) {
        this._prev$volatile = segment;
    }

    public final void a() {
        e.set(this, null);
    }

    public final ConcurrentLinkedListNode c() {
        Object obj = d.get(this);
        if (obj == ConcurrentLinkedListKt.f24718a) {
            return null;
        }
        return (ConcurrentLinkedListNode) obj;
    }

    public abstract boolean d();

    public final void e() {
        Object obj;
        ConcurrentLinkedListNode concurrentLinkedListNodeC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(this);
            while (concurrentLinkedListNode != null && concurrentLinkedListNode.d()) {
                concurrentLinkedListNode = (ConcurrentLinkedListNode) atomicReferenceFieldUpdater.get(concurrentLinkedListNode);
            }
            ConcurrentLinkedListNode concurrentLinkedListNodeC2 = c();
            Intrinsics.e(concurrentLinkedListNodeC2);
            while (concurrentLinkedListNodeC2.d() && (concurrentLinkedListNodeC = concurrentLinkedListNodeC2.c()) != null) {
                concurrentLinkedListNodeC2 = concurrentLinkedListNodeC;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(concurrentLinkedListNodeC2);
            } while (!kotlin.reflect.jvm.internal.impl.types.checker.a.B(atomicReferenceFieldUpdater, concurrentLinkedListNodeC2, obj, ((ConcurrentLinkedListNode) obj) == null ? null : concurrentLinkedListNode));
            if (concurrentLinkedListNode != null) {
                d.set(concurrentLinkedListNode, concurrentLinkedListNodeC2);
            }
            if (!concurrentLinkedListNodeC2.d() || concurrentLinkedListNodeC2.c() == null) {
                if (concurrentLinkedListNode == null || !concurrentLinkedListNode.d()) {
                    return;
                }
            }
        }
    }
}
