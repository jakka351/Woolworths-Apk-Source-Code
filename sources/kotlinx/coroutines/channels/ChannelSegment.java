package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Segment;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", "E", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    public final BufferedChannel h;
    public final /* synthetic */ AtomicReferenceArray i;

    public ChannelSegment(long j, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i) {
        super(j, channelSegment, i);
        this.h = bufferedChannel;
        this.i = new AtomicReferenceArray(BufferedChannelKt.b * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int g() {
        return BufferedChannelKt.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.i
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof kotlinx.coroutines.Waiter
            kotlinx.coroutines.channels.BufferedChannel r2 = r4.h
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r1 == 0) goto L21
            goto L62
        L21:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.j
            if (r6 == r1) goto L59
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.g
            if (r6 == r1) goto L11
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.i
            if (r6 == r5) goto L7c
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.Intrinsics.e(r2)
            return
        L62:
            if (r0 == 0) goto L67
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.j
            goto L69
        L67:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.Intrinsics.e(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelSegment.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.i;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            BufferedChannel bufferedChannel = this.h;
            Intrinsics.e(bufferedChannel);
            bufferedChannel.X((this.f * BufferedChannelKt.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.i.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }
}
