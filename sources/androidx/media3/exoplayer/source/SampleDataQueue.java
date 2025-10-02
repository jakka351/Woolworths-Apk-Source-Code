package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
class SampleDataQueue {

    /* renamed from: a, reason: collision with root package name */
    public final Allocator f3138a;
    public final int b;
    public final ParsableByteArray c;
    public AllocationNode d;
    public AllocationNode e;
    public AllocationNode f;
    public long g;

    public static final class AllocationNode implements Allocator.AllocationNode {

        /* renamed from: a, reason: collision with root package name */
        public long f3139a;
        public long b;
        public Allocation c;
        public AllocationNode d;

        public AllocationNode(long j, int i) {
            Assertions.f(this.c == null);
            this.f3139a = j;
            this.b = j + i;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public final Allocation a() {
            Allocation allocation = this.c;
            allocation.getClass();
            return allocation;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public final Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.d;
            if (allocationNode == null || allocationNode.c == null) {
                return null;
            }
            return allocationNode;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.f3138a = allocator;
        int iE = allocator.e();
        this.b = iE;
        this.c = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, iE);
        this.d = allocationNode;
        this.e = allocationNode;
        this.f = allocationNode;
    }

    public static AllocationNode c(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i) {
        while (j >= allocationNode.b) {
            allocationNode = allocationNode.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (allocationNode.b - j));
            Allocation allocation = allocationNode.c;
            byteBuffer.put(allocation.f3175a, ((int) (j - allocationNode.f3139a)) + allocation.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == allocationNode.b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode d(AllocationNode allocationNode, long j, byte[] bArr, int i) {
        while (j >= allocationNode.b) {
            allocationNode = allocationNode.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (allocationNode.b - j));
            Allocation allocation = allocationNode.c;
            System.arraycopy(allocation.f3175a, ((int) (j - allocationNode.f3139a)) + allocation.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == allocationNode.b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode e(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        AllocationNode allocationNodeD;
        if (decoderInputBuffer.f(1073741824)) {
            long j = sampleExtrasHolder.b;
            int iA = 1;
            parsableByteArray.D(1);
            AllocationNode allocationNodeD2 = d(allocationNode, j, parsableByteArray.f2922a, 1);
            long j2 = j + 1;
            byte b = parsableByteArray.f2922a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            CryptoInfo cryptoInfo = decoderInputBuffer.f;
            byte[] bArr = cryptoInfo.f2987a;
            if (bArr == null) {
                cryptoInfo.f2987a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            allocationNodeD = d(allocationNodeD2, j2, cryptoInfo.f2987a, i);
            long j3 = j2 + i;
            if (z) {
                parsableByteArray.D(2);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f2922a, 2);
                j3 += 2;
                iA = parsableByteArray.A();
            }
            int i2 = iA;
            int[] iArr = cryptoInfo.d;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cryptoInfo.e;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i2 * 6;
                parsableByteArray.D(i3);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f2922a, i3);
                j3 += i3;
                parsableByteArray.G(0);
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr2[i4] = parsableByteArray.A();
                    iArr4[i4] = parsableByteArray.y();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = sampleExtrasHolder.f3141a - ((int) (j3 - sampleExtrasHolder.b));
            }
            TrackOutput.CryptoData cryptoData = sampleExtrasHolder.c;
            int i5 = Util.f2928a;
            cryptoInfo.a(i2, iArr2, iArr4, cryptoData.b, cryptoInfo.f2987a, cryptoData.f3253a, cryptoData.c, cryptoData.d);
            long j4 = sampleExtrasHolder.b;
            int i6 = (int) (j3 - j4);
            sampleExtrasHolder.b = j4 + i6;
            sampleExtrasHolder.f3141a -= i6;
        } else {
            allocationNodeD = allocationNode;
        }
        if (!decoderInputBuffer.f(268435456)) {
            decoderInputBuffer.n(sampleExtrasHolder.f3141a);
            return c(allocationNodeD, sampleExtrasHolder.b, decoderInputBuffer.g, sampleExtrasHolder.f3141a);
        }
        parsableByteArray.D(4);
        AllocationNode allocationNodeD3 = d(allocationNodeD, sampleExtrasHolder.b, parsableByteArray.f2922a, 4);
        int iY = parsableByteArray.y();
        sampleExtrasHolder.b += 4;
        sampleExtrasHolder.f3141a -= 4;
        decoderInputBuffer.n(iY);
        AllocationNode allocationNodeC = c(allocationNodeD3, sampleExtrasHolder.b, decoderInputBuffer.g, iY);
        sampleExtrasHolder.b += iY;
        int i7 = sampleExtrasHolder.f3141a - iY;
        sampleExtrasHolder.f3141a = i7;
        ByteBuffer byteBuffer = decoderInputBuffer.j;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            decoderInputBuffer.j = ByteBuffer.allocate(i7);
        } else {
            decoderInputBuffer.j.clear();
        }
        return c(allocationNodeC, sampleExtrasHolder.b, decoderInputBuffer.j, sampleExtrasHolder.f3141a);
    }

    public final void a(long j) {
        AllocationNode allocationNode;
        if (j == -1) {
            return;
        }
        while (true) {
            allocationNode = this.d;
            if (j < allocationNode.b) {
                break;
            }
            this.f3138a.d(allocationNode.c);
            AllocationNode allocationNode2 = this.d;
            allocationNode2.c = null;
            AllocationNode allocationNode3 = allocationNode2.d;
            allocationNode2.d = null;
            this.d = allocationNode3;
        }
        if (this.e.f3139a < allocationNode.f3139a) {
            this.e = allocationNode;
        }
    }

    public final int b(int i) {
        AllocationNode allocationNode = this.f;
        if (allocationNode.c == null) {
            Allocation allocationC = this.f3138a.c();
            AllocationNode allocationNode2 = new AllocationNode(this.f.b, this.b);
            allocationNode.c = allocationC;
            allocationNode.d = allocationNode2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
