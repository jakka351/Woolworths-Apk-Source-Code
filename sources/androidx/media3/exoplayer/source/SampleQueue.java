package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.SampleDataQueue;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public class SampleQueue implements TrackOutput {
    public Format A;
    public Format B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final SampleDataQueue f3140a;
    public final DrmSessionManager d;
    public final DrmSessionEventListener.EventDispatcher e;
    public UpstreamFormatChangedListener f;
    public Format g;
    public DrmSession h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final SampleExtrasHolder b = new SampleExtrasHolder();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public TrackOutput.CryptoData[] o = new TrackOutput.CryptoData[1000];
    public final SpannedData c = new SpannedData(new l(0));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean C = true;

    public static final class SampleExtrasHolder {

        /* renamed from: a, reason: collision with root package name */
        public int f3141a;
        public long b;
        public TrackOutput.CryptoData c;
    }

    public static final class SharedSampleMetadata {

        /* renamed from: a, reason: collision with root package name */
        public final Format f3142a;
        public final DrmSessionManager.DrmSessionReference b;

        public SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.f3142a = format;
            this.b = drmSessionReference;
        }
    }

    public interface UpstreamFormatChangedListener {
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.d = drmSessionManager;
        this.e = eventDispatcher;
        this.f3140a = new SampleDataQueue(allocator);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i, int i2) {
        while (true) {
            SampleDataQueue sampleDataQueue = this.f3140a;
            if (i <= 0) {
                sampleDataQueue.getClass();
                return;
            }
            int iB = sampleDataQueue.b(i);
            SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
            Allocation allocation = allocationNode.c;
            parsableByteArray.e(((int) (sampleDataQueue.g - allocationNode.f3139a)) + allocation.b, iB, allocation.f3175a);
            i -= iB;
            long j = sampleDataQueue.g + iB;
            sampleDataQueue.g = j;
            SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
            if (j == allocationNode2.b) {
                sampleDataQueue.f = allocationNode2.d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:18:0x0053), top: B:29:0x000a }] */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.media3.common.Format r5) {
        /*
            r4 = this;
            androidx.media3.common.Format r0 = r4.k(r5)
            r1 = 0
            r4.z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.y = r1     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.Format r5 = r4.B     // Catch: java.lang.Throwable -> L51
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L68
        L16:
            androidx.media3.exoplayer.source.SpannedData r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r5 != 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            if (r5 != 0) goto L53
            androidx.media3.exoplayer.source.SpannedData r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L51
            androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata r5 = (androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) r5     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.Format r5 = r5.f3142a     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            androidx.media3.exoplayer.source.SpannedData r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L51
            androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata r5 = (androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) r5     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.Format r5 = r5.f3142a     // Catch: java.lang.Throwable -> L51
            r4.B = r5     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r5 = move-exception
            goto L78
        L53:
            r4.B = r0     // Catch: java.lang.Throwable -> L51
        L55:
            boolean r5 = r4.C     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.Format r0 = r4.B     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r0.n     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L51
            boolean r0 = androidx.media3.common.MimeTypes.a(r3, r0)     // Catch: java.lang.Throwable -> L51
            r5 = r5 & r0
            r4.C = r5     // Catch: java.lang.Throwable -> L51
            r4.D = r1     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            r1 = r2
        L68:
            androidx.media3.exoplayer.source.SampleQueue$UpstreamFormatChangedListener r5 = r4.f
            if (r5 == 0) goto L77
            if (r1 == 0) goto L77
            androidx.media3.exoplayer.source.ProgressiveMediaPeriod r5 = (androidx.media3.exoplayer.source.ProgressiveMediaPeriod) r5
            android.os.Handler r0 = r5.u
            androidx.media3.exoplayer.source.i r5 = r5.s
            r0.post(r5)
        L77:
            return
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.e(androidx.media3.common.Format):void");
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int f(DataReader dataReader, int i, boolean z) throws EOFException {
        SampleDataQueue sampleDataQueue = this.f3140a;
        int iB = sampleDataQueue.b(i);
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.f;
        Allocation allocation = allocationNode.c;
        int i2 = dataReader.read(allocation.f3175a, ((int) (sampleDataQueue.g - allocationNode.f3139a)) + allocation.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = sampleDataQueue.g + i2;
        sampleDataQueue.g = j;
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.f;
        if (j == allocationNode2.b) {
            sampleDataQueue.f = allocationNode2.d;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:26:0x0051, B:28:0x0055, B:32:0x006b, B:35:0x0072, B:39:0x007a, B:44:0x00b3, B:67:0x0129, B:69:0x0132, B:46:0x00cc, B:48:0x00d5, B:50:0x00de, B:52:0x00f1, B:56:0x00fa, B:57:0x00ff, B:59:0x0105, B:63:0x0113, B:65:0x0118, B:66:0x0126, B:49:0x00dc), top: B:74:0x0051 }] */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(long r10, int r12, int r13, int r14, androidx.media3.extractor.TrackOutput.CryptoData r15) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.g(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public final long h(int i) {
        long j = this.u;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iL = l(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.n[iL]);
                if ((this.m[iL] & 1) != 0) {
                    break;
                }
                iL--;
                if (iL == -1) {
                    iL = this.i - 1;
                }
            }
        }
        this.u = Math.max(j, jMax);
        this.p -= i;
        int i3 = this.q + i;
        this.q = i3;
        int i4 = this.r + i;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        SpannedData spannedData = this.c;
        SparseArray sparseArray = spannedData.b;
        while (i7 < sparseArray.size() - 1) {
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            spannedData.c.accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = spannedData.f3147a;
            if (i9 > 0) {
                spannedData.f3147a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        return this.k[i10 - 1] + this.l[r9];
    }

    public final void i() {
        long jH;
        SampleDataQueue sampleDataQueue = this.f3140a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        sampleDataQueue.a(jH);
    }

    public final int j(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public Format k(Format format) {
        return format;
    }

    public final int l(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized Format m() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean n(boolean z) {
        Format format;
        int i = this.s;
        boolean z2 = false;
        if (i != this.p) {
            if (((SharedSampleMetadata) this.c.a(this.q + i)).f3142a != this.g) {
                return true;
            }
            return o(l(this.s));
        }
        if (z || this.w || ((format = this.B) != null && format != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean o(int i) {
        DrmSession drmSession = this.h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.a();
    }

    public final void p(Format format, FormatHolder formatHolder) {
        Format format2;
        Format format3 = this.g;
        boolean z = format3 == null;
        DrmInitData drmInitData = format3 == null ? null : format3.r;
        this.g = format;
        DrmInitData drmInitData2 = format.r;
        DrmSessionManager drmSessionManager = this.d;
        if (drmSessionManager != null) {
            int iA = drmSessionManager.a(format);
            Format.Builder builderA = format.a();
            builderA.L = iA;
            format2 = new Format(builderA);
        } else {
            format2 = format;
        }
        formatHolder.b = format2;
        formatHolder.f3009a = this.h;
        if (drmSessionManager == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.h;
            DrmSessionEventListener.EventDispatcher eventDispatcher = this.e;
            DrmSession drmSessionC = drmSessionManager.c(eventDispatcher, format);
            this.h = drmSessionC;
            formatHolder.f3009a = drmSessionC;
            if (drmSession != null) {
                drmSession.e(eventDispatcher);
            }
        }
    }

    public final void q(boolean z) {
        SampleDataQueue sampleDataQueue = this.f3140a;
        SampleDataQueue.AllocationNode allocationNode = sampleDataQueue.d;
        Allocator allocator = sampleDataQueue.f3138a;
        if (allocationNode.c != null) {
            allocator.a(allocationNode);
            allocationNode.c = null;
            allocationNode.d = null;
        }
        SampleDataQueue.AllocationNode allocationNode2 = sampleDataQueue.d;
        int i = sampleDataQueue.b;
        Assertions.f(allocationNode2.c == null);
        allocationNode2.f3139a = 0L;
        allocationNode2.b = i;
        SampleDataQueue.AllocationNode allocationNode3 = sampleDataQueue.d;
        sampleDataQueue.e = allocationNode3;
        sampleDataQueue.f = allocationNode3;
        sampleDataQueue.g = 0L;
        allocator.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        SpannedData spannedData = this.c;
        SparseArray sparseArray = spannedData.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            spannedData.c.accept(sparseArray.valueAt(i2));
        }
        spannedData.f3147a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.C = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean r(long j, boolean z) {
        Throwable th;
        SampleQueue sampleQueue;
        long j2;
        int iJ;
        try {
            synchronized (this) {
                try {
                    try {
                        this.s = 0;
                        SampleDataQueue sampleDataQueue = this.f3140a;
                        sampleDataQueue.e = sampleDataQueue.d;
                        int iL = l(0);
                        int i = this.s;
                        int i2 = this.p;
                        if (!(i != i2) || j < this.n[iL] || (j > this.v && !z)) {
                            return false;
                        }
                        if (this.C) {
                            iJ = i2 - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 < iJ) {
                                    try {
                                        if (this.n[iL] >= j) {
                                            iJ = i3;
                                            break;
                                        }
                                        iL++;
                                        if (iL == this.i) {
                                            iL = 0;
                                        }
                                        i3++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z) {
                                    iJ = -1;
                                }
                            }
                            sampleQueue = this;
                            j2 = j;
                        } else {
                            sampleQueue = this;
                            j2 = j;
                            iJ = sampleQueue.j(iL, i2 - i, j2, true);
                        }
                        if (iJ == -1) {
                            return false;
                        }
                        sampleQueue.t = j2;
                        sampleQueue.s += iJ;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
