package androidx.media3.container;

import androidx.annotation.RestrictTo;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

@RestrictTo
@UnstableApi
/* loaded from: classes2.dex */
public final class ReorderingSeiMessageQueue {

    /* renamed from: a, reason: collision with root package name */
    public final SeiConsumer f2952a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final PriorityQueue d = new PriorityQueue();
    public int e = -1;
    public SampleSeiMessages f;

    public static final class SampleSeiMessages implements Comparable<SampleSeiMessages> {
        public long e = -9223372036854775807L;
        public final ArrayList d = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(SampleSeiMessages sampleSeiMessages) {
            return Long.compare(this.e, sampleSeiMessages.e);
        }
    }

    public interface SeiConsumer {
        void f(long j, ParsableByteArray parsableByteArray);
    }

    public ReorderingSeiMessageQueue(SeiConsumer seiConsumer) {
        this.f2952a = seiConsumer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.e) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, androidx.media3.common.util.ParsableByteArray r10) {
        /*
            r7 = this;
            int r0 = r7.e
            if (r0 == 0) goto L96
            r1 = -1
            java.util.PriorityQueue r2 = r7.d
            if (r0 == r1) goto L21
            int r0 = r2.size()
            int r3 = r7.e
            if (r0 < r3) goto L21
            java.lang.Object r0 = r2.peek()
            androidx.media3.container.ReorderingSeiMessageQueue$SampleSeiMessages r0 = (androidx.media3.container.ReorderingSeiMessageQueue.SampleSeiMessages) r0
            int r3 = androidx.media3.common.util.Util.f2928a
            long r3 = r0.e
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L96
        L21:
            java.util.ArrayDeque r0 = r7.b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            androidx.media3.common.util.ParsableByteArray r0 = (androidx.media3.common.util.ParsableByteArray) r0
        L35:
            int r3 = r10.a()
            r0.D(r3)
            byte[] r3 = r10.f2922a
            int r10 = r10.b
            byte[] r4 = r0.f2922a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            androidx.media3.container.ReorderingSeiMessageQueue$SampleSeiMessages r10 = r7.f
            if (r10 == 0) goto L5a
            long r3 = r10.e
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L5a
            java.util.ArrayList r8 = r10.d
            r8.add(r0)
            return
        L5a:
            java.util.ArrayDeque r10 = r7.c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L68
            androidx.media3.container.ReorderingSeiMessageQueue$SampleSeiMessages r10 = new androidx.media3.container.ReorderingSeiMessageQueue$SampleSeiMessages
            r10.<init>()
            goto L6e
        L68:
            java.lang.Object r10 = r10.pop()
            androidx.media3.container.ReorderingSeiMessageQueue$SampleSeiMessages r10 = (androidx.media3.container.ReorderingSeiMessageQueue.SampleSeiMessages) r10
        L6e:
            java.util.ArrayList r3 = r10.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 == 0) goto L7a
            r6 = 1
        L7a:
            androidx.media3.common.util.Assertions.b(r6)
            boolean r4 = r3.isEmpty()
            androidx.media3.common.util.Assertions.f(r4)
            r10.e = r8
            r3.add(r0)
            r2.add(r10)
            r7.f = r10
            int r8 = r7.e
            if (r8 == r1) goto L95
            r7.b(r8)
        L95:
            return
        L96:
            androidx.media3.container.ReorderingSeiMessageQueue$SeiConsumer r0 = r7.f2952a
            r0.f(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.ReorderingSeiMessageQueue.a(long, androidx.media3.common.util.ParsableByteArray):void");
    }

    public final void b(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.d;
            if (priorityQueue.size() <= i) {
                return;
            }
            SampleSeiMessages sampleSeiMessages = (SampleSeiMessages) priorityQueue.poll();
            int i2 = Util.f2928a;
            int i3 = 0;
            while (true) {
                arrayList = sampleSeiMessages.d;
                if (i3 >= arrayList.size()) {
                    break;
                }
                this.f2952a.f(sampleSeiMessages.e, (ParsableByteArray) arrayList.get(i3));
                this.b.push((ParsableByteArray) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            SampleSeiMessages sampleSeiMessages2 = this.f;
            if (sampleSeiMessages2 != null && sampleSeiMessages2.e == sampleSeiMessages.e) {
                this.f = null;
            }
            this.c.push(sampleSeiMessages);
        }
    }
}
