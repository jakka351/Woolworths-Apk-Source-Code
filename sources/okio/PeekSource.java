package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PeekSource implements Source {
    public final BufferedSource d;
    public final Buffer e;
    public Segment f;
    public int g;
    public boolean h;
    public long i;

    public PeekSource(BufferedSource bufferedSource) {
        this.d = bufferedSource;
        Buffer e = bufferedSource.getE();
        this.e = e;
        Segment segment = e.d;
        this.f = segment;
        this.g = segment != null ? segment.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
    }

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.getE();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q2(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.h
            if (r3 != 0) goto L63
            okio.Segment r3 = r8.f
            okio.Buffer r4 = r8.e
            if (r3 == 0) goto L2b
            okio.Segment r5 = r4.d
            if (r3 != r5) goto L23
            int r3 = r8.g
            kotlin.jvm.internal.Intrinsics.e(r5)
            int r5 = r5.b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.i
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.d
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            okio.Segment r0 = r8.f
            if (r0 != 0) goto L4c
            okio.Segment r0 = r4.d
            if (r0 == 0) goto L4c
            r8.f = r0
            int r0 = r0.b
            r8.g = r0
        L4c:
            long r0 = r4.e
            long r2 = r8.i
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.e
            long r4 = r8.i
            r3 = r9
            r2.d(r3, r4, r6)
            long r9 = r8.i
            long r9 = r9 + r6
            r8.i = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.camera.core.impl.b.k(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.q2(okio.Buffer, long):long");
    }
}
