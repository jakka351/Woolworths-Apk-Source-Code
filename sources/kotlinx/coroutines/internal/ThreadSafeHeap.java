package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public ThreadSafeHeapNode[] f24733a;

    public final void a(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.b((EventLoopImplBase.DelayedTaskQueue) this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f24733a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (threadSafeHeapNodeArr == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.f24733a = threadSafeHeapNodeArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= threadSafeHeapNodeArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(threadSafeHeapNodeArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) objArrCopyOf;
            this.f24733a = threadSafeHeapNodeArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        threadSafeHeapNodeArr[i] = delayedTask;
        delayedTask.setIndex(i);
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.ThreadSafeHeapNode b(int r9) {
        /*
            r8 = this;
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = r8.f24733a
            kotlin.jvm.internal.Intrinsics.e(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.ThreadSafeHeap.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L80
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3c
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.e(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.e(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3c
            r8.d(r9, r2)
            r8.c(r2)
            goto L80
        L3c:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L47
            goto L80
        L47:
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r5 = r8.f24733a
            kotlin.jvm.internal.Intrinsics.e(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L67
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.e(r6)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.e(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L67
            goto L68
        L67:
            r2 = r4
        L68:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.e(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.e(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L7b
            goto L80
        L7b:
            r8.d(r9, r2)
            r9 = r2
            goto L3c
        L80:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.e(r9)
            r2 = 0
            r9.b(r2)
            r9.setIndex(r3)
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.b(int):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final void c(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f24733a;
            Intrinsics.e(threadSafeHeapNodeArr);
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            Intrinsics.e(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            Intrinsics.e(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f24733a;
        Intrinsics.e(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        Intrinsics.e(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        Intrinsics.e(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i);
        threadSafeHeapNode2.setIndex(i2);
    }
}
