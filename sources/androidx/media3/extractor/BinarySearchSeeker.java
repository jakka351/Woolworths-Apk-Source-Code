package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BinarySearchSeeker {

    /* renamed from: a, reason: collision with root package name */
    public final BinarySearchSeekMap f3223a;
    public final TimestampSeeker b;
    public SeekOperationParams c;
    public final int d;

    public static class BinarySearchSeekMap implements SeekMap {

        /* renamed from: a, reason: collision with root package name */
        public final SeekTimestampConverter f3224a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5) {
            this.f3224a = seekTimestampConverter;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints b(long j) {
            SeekPoint seekPoint = new SeekPoint(j, SeekOperationParams.a(this.f3224a.c(j), 0L, this.c, this.d, this.e, this.f));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean d() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long l() {
            return this.b;
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        public final long c(long j) {
            return j;
        }
    }

    public static class SeekOperationParams {

        /* renamed from: a, reason: collision with root package name */
        public final long f3225a;
        public final long b;
        public final long c;
        public long d = 0;
        public long e;
        public long f;
        public long g;
        public long h;

        public SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6) {
            this.f3225a = j;
            this.b = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.c = j6;
            this.h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return Util.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface SeekTimestampConverter {
        long c(long j);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult d = new TimestampSearchResult(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f3226a;
        public final long b;
        public final long c;

        public TimestampSearchResult(int i, long j, long j2) {
            this.f3226a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public interface TimestampSeeker {
        TimestampSearchResult a(ExtractorInput extractorInput, long j);

        default void b() {
        }
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = timestampSeeker;
        this.d = i;
        this.f3223a = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5);
    }

    public static int b(ExtractorInput extractorInput, long j, PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.f3248a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(androidx.media3.extractor.ExtractorInput r28, androidx.media3.extractor.PositionHolder r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            androidx.media3.extractor.BinarySearchSeeker$SeekOperationParams r3 = r0.c
            androidx.media3.common.util.Assertions.g(r3)
            long r4 = r3.f
            long r6 = r3.g
            long r8 = r3.h
            long r6 = r6 - r4
            int r10 = r0.d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker r10 = r0.b
            if (r6 > 0) goto L26
            r0.c = r7
            r10.b()
            int r1 = b(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.getPosition()
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc8
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc8
            int r4 = (int) r4
            r1.l(r4)
            r1.i()
            long r4 = r3.b
            androidx.media3.extractor.BinarySearchSeeker$TimestampSearchResult r4 = r10.a(r1, r4)
            int r5 = r4.f3226a
            r15 = r11
            long r11 = r4.b
            r17 = r13
            long r13 = r4.c
            r4 = -3
            if (r5 == r4) goto Lbe
            r4 = -2
            if (r5 == r4) goto L9d
            r4 = -1
            if (r5 == r4) goto L7e
            if (r5 != 0) goto L76
            long r3 = r1.getPosition()
            long r3 = r13 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6c
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L6c
            int r3 = (int) r3
            r1.l(r3)
        L6c:
            r0.c = r7
            r10.b()
            int r1 = b(r1, r13, r2)
            return r1
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7e:
            r3.e = r11
            r3.g = r13
            long r4 = r3.b
            long r6 = r3.d
            long r8 = r3.f
            r15 = r4
            long r4 = r3.c
            r25 = r4
            r17 = r6
            r21 = r8
            r19 = r11
            r23 = r13
            long r4 = androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        L9d:
            r4 = r11
            r6 = r13
            r3.d = r4
            r3.f = r6
            long r8 = r3.b
            long r10 = r3.e
            long r12 = r3.g
            long r14 = r3.c
            r17 = r4
            r21 = r6
            r19 = r10
            r23 = r12
            r25 = r14
            r15 = r8
            long r4 = androidx.media3.extractor.BinarySearchSeeker.SeekOperationParams.a(r15, r17, r19, r21, r23, r25)
            r3.h = r4
            goto L6
        Lbe:
            r0.c = r7
            r10.b()
            int r1 = b(r1, r8, r2)
            return r1
        Lc8:
            int r1 = b(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.BinarySearchSeeker.a(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    public final void c(long j) {
        SeekOperationParams seekOperationParams = this.c;
        if (seekOperationParams == null || seekOperationParams.f3225a != j) {
            BinarySearchSeekMap binarySearchSeekMap = this.f3223a;
            this.c = new SeekOperationParams(j, binarySearchSeekMap.f3224a.c(j), binarySearchSeekMap.c, binarySearchSeekMap.d, binarySearchSeekMap.e, binarySearchSeekMap.f);
        }
    }
}
