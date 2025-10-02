package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.PsBinarySearchSeeker;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.bouncycastle.asn1.BERTags;

@UnstableApi
/* loaded from: classes2.dex */
public final class PsExtractor implements Extractor {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public PsBinarySearchSeeker i;
    public ExtractorOutput j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f3432a = new TimestampAdjuster(0);
    public final ParsableByteArray c = new ParsableByteArray(4096);
    public final SparseArray b = new SparseArray();
    public final PsDurationReader d = new PsDurationReader();

    public static final class PesReader {

        /* renamed from: a, reason: collision with root package name */
        public final ElementaryStreamReader f3433a;
        public final TimestampAdjuster b;
        public final ParsableBitArray c = new ParsableBitArray(new byte[64], 64);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f3433a = elementaryStreamReader;
            this.b = timestampAdjuster;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        TimestampAdjuster timestampAdjuster = this.f3432a;
        synchronized (timestampAdjuster) {
            j3 = timestampAdjuster.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = timestampAdjuster.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            timestampAdjuster.e(j2);
        }
        PsBinarySearchSeeker psBinarySearchSeeker = this.i;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            PesReader pesReader = (PesReader) sparseArray.valueAt(i);
            pesReader.f = false;
            pesReader.f3433a.b();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i;
        int i2;
        long j;
        ElementaryStreamReader h262Reader;
        long j2;
        Assertions.g(this.j);
        long length = extractorInput.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        PsDurationReader psDurationReader = this.d;
        if (i3 != 0 && !psDurationReader.c) {
            TimestampAdjuster timestampAdjuster = psDurationReader.f3431a;
            ParsableByteArray parsableByteArray = psDurationReader.b;
            if (!psDurationReader.e) {
                long length2 = extractorInput.getLength();
                int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, length2);
                long j4 = length2 - iMin;
                if (extractorInput.getPosition() != j4) {
                    positionHolder.f3248a = j4;
                    return 1;
                }
                parsableByteArray.D(iMin);
                extractorInput.i();
                extractorInput.b(0, iMin, parsableByteArray.f2922a);
                int i4 = parsableByteArray.b;
                int i5 = parsableByteArray.c - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (PsDurationReader.b(i5, parsableByteArray.f2922a) == 442) {
                        parsableByteArray.G(i5 + 4);
                        long jC = PsDurationReader.c(parsableByteArray);
                        if (jC != -9223372036854775807L) {
                            j3 = jC;
                            break;
                        }
                    }
                    i5--;
                }
                psDurationReader.g = j3;
                psDurationReader.e = true;
                return 0;
            }
            if (psDurationReader.g == -9223372036854775807L) {
                psDurationReader.a(extractorInput);
                return 0;
            }
            if (psDurationReader.d) {
                long j5 = psDurationReader.f;
                if (j5 == -9223372036854775807L) {
                    psDurationReader.a(extractorInput);
                    return 0;
                }
                psDurationReader.h = timestampAdjuster.c(psDurationReader.g) - timestampAdjuster.b(j5);
                psDurationReader.a(extractorInput);
                return 0;
            }
            int iMin2 = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, extractorInput.getLength());
            long j6 = 0;
            if (extractorInput.getPosition() != j6) {
                positionHolder.f3248a = j6;
                return 1;
            }
            parsableByteArray.D(iMin2);
            extractorInput.i();
            extractorInput.b(0, iMin2, parsableByteArray.f2922a);
            int i6 = parsableByteArray.b;
            int i7 = parsableByteArray.c;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (PsDurationReader.b(i6, parsableByteArray.f2922a) == 442) {
                    parsableByteArray.G(i6 + 4);
                    long jC2 = PsDurationReader.c(parsableByteArray);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        break;
                    }
                }
                i6++;
            }
            psDurationReader.f = j2;
            psDurationReader.d = true;
            return 0;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j7 = psDurationReader.h;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsBinarySearchSeeker.PsScrSeeker(psDurationReader.f3431a), j7, j7 + 1, 0L, length, 188L, 1000);
                this.i = psBinarySearchSeeker;
                this.j.q(psBinarySearchSeeker.f3223a);
            } else {
                i = i3;
                i2 = 4;
                this.j.q(new SeekMap.Unseekable(j7));
            }
        }
        PsBinarySearchSeeker psBinarySearchSeeker2 = this.i;
        if (psBinarySearchSeeker2 != null && psBinarySearchSeeker2.c != null) {
            return psBinarySearchSeeker2.a(extractorInput, positionHolder);
        }
        extractorInput.i();
        long j8 = i != 0 ? length - extractorInput.j() : -1L;
        if (j8 != -1 && j8 < 4) {
            return -1;
        }
        ParsableByteArray parsableByteArray2 = this.c;
        if (!extractorInput.h(parsableByteArray2.f2922a, 0, i2, true)) {
            return -1;
        }
        parsableByteArray2.G(0);
        int iG = parsableByteArray2.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            extractorInput.b(0, 10, parsableByteArray2.f2922a);
            parsableByteArray2.G(9);
            extractorInput.l((parsableByteArray2.u() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            extractorInput.b(0, 2, parsableByteArray2.f2922a);
            parsableByteArray2.G(0);
            extractorInput.l(parsableByteArray2.A() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            extractorInput.l(1);
            return 0;
        }
        int i8 = iG & 255;
        SparseArray sparseArray = this.b;
        PesReader pesReader = (PesReader) sparseArray.get(i8);
        if (!this.e) {
            if (pesReader == null) {
                if (i8 == 189) {
                    h262Reader = new Ac3Reader("video/mp2p");
                    this.f = true;
                    this.h = extractorInput.getPosition();
                } else if ((iG & BERTags.FLAGS) == 192) {
                    h262Reader = new MpegAudioReader(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = extractorInput.getPosition();
                } else if ((iG & 240) == 224) {
                    h262Reader = new H262Reader(null, "video/mp2p");
                    this.g = true;
                    this.h = extractorInput.getPosition();
                } else {
                    h262Reader = null;
                }
                if (h262Reader != null) {
                    h262Reader.c(this.j, new TsPayloadReader.TrackIdGenerator(i8, 256));
                    pesReader = new PesReader(h262Reader, this.f3432a);
                    sparseArray.put(i8, pesReader);
                }
            }
            if (extractorInput.getPosition() > ((this.f && this.g) ? this.h + 8192 : llqqqql.c0063c0063c00630063)) {
                this.e = true;
                this.j.h();
            }
        }
        extractorInput.b(0, 2, parsableByteArray2.f2922a);
        parsableByteArray2.G(0);
        int iA = parsableByteArray2.A() + 6;
        if (pesReader == null) {
            extractorInput.l(iA);
            return 0;
        }
        parsableByteArray2.D(iA);
        extractorInput.readFully(parsableByteArray2.f2922a, 0, iA);
        parsableByteArray2.G(6);
        ElementaryStreamReader elementaryStreamReader = pesReader.f3433a;
        ParsableBitArray parsableBitArray = pesReader.c;
        parsableByteArray2.e(0, 3, parsableBitArray.f2921a);
        parsableBitArray.m(0);
        parsableBitArray.o(8);
        pesReader.d = parsableBitArray.f();
        pesReader.e = parsableBitArray.f();
        parsableBitArray.o(6);
        parsableByteArray2.e(0, parsableBitArray.g(8), parsableBitArray.f2921a);
        parsableBitArray.m(0);
        TimestampAdjuster timestampAdjuster2 = pesReader.b;
        pesReader.g = 0L;
        if (pesReader.d) {
            parsableBitArray.o(4);
            parsableBitArray.o(1);
            parsableBitArray.o(1);
            long jG = (parsableBitArray.g(3) << 30) | (parsableBitArray.g(15) << 15) | parsableBitArray.g(15);
            parsableBitArray.o(1);
            if (pesReader.f || !pesReader.e) {
                j = jG;
            } else {
                parsableBitArray.o(4);
                parsableBitArray.o(1);
                parsableBitArray.o(1);
                parsableBitArray.o(1);
                timestampAdjuster2.b((parsableBitArray.g(15) << 15) | (parsableBitArray.g(3) << 30) | parsableBitArray.g(15));
                pesReader.f = true;
                j = jG;
            }
            pesReader.g = timestampAdjuster2.b(j);
        }
        elementaryStreamReader.d(4, pesReader.g);
        elementaryStreamReader.a(parsableByteArray2);
        elementaryStreamReader.e(false);
        parsableByteArray2.F(parsableByteArray2.f2922a.length);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            defaultExtractorInput.m(bArr[13] & 7, false);
            defaultExtractorInput.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
