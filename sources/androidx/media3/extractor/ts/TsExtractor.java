package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.ts.TsBinarySearchSeeker;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class TsExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final int f3438a;
    public final List b;
    public final ParsableByteArray c = new ParsableByteArray(new byte[9400], 0);
    public final SparseIntArray d;
    public final DefaultTsPayloadReaderFactory e;
    public final SubtitleParser.Factory f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final TsDurationReader j;
    public TsBinarySearchSeeker k;
    public ExtractorOutput l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final TsPayloadReader q;
    public int r;
    public int s;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {

        /* renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f3439a = new ParsableBitArray(new byte[4], 4);

        public PatReader() {
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void a(ParsableByteArray parsableByteArray) {
            TsExtractor tsExtractor = TsExtractor.this;
            SparseArray sparseArray = tsExtractor.g;
            if (parsableByteArray.u() == 0 && (parsableByteArray.u() & 128) != 0) {
                parsableByteArray.H(6);
                int iA = parsableByteArray.a() / 4;
                for (int i = 0; i < iA; i++) {
                    ParsableBitArray parsableBitArray = this.f3439a;
                    parsableByteArray.e(0, 4, parsableBitArray.f2921a);
                    parsableBitArray.m(0);
                    int iG = parsableBitArray.g(16);
                    parsableBitArray.o(3);
                    if (iG == 0) {
                        parsableBitArray.o(13);
                    } else {
                        int iG2 = parsableBitArray.g(13);
                        if (sparseArray.get(iG2) == null) {
                            sparseArray.put(iG2, new SectionReader(tsExtractor.new PmtReader(iG2)));
                            tsExtractor.m++;
                        }
                    }
                }
                sparseArray.remove(0);
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public class PmtReader implements SectionPayloadReader {

        /* renamed from: a, reason: collision with root package name */
        public final ParsableBitArray f3440a = new ParsableBitArray(new byte[5], 5);
        public final SparseArray b = new SparseArray();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public PmtReader(int i) {
            this.d = i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x02f2  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x030b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(androidx.media3.common.util.ParsableByteArray r31) {
            /*
                Method dump skipped, instructions count: 910
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.PmtReader.a(androidx.media3.common.util.ParsableByteArray):void");
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public final void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public TsExtractor(int i, SubtitleParser.Factory factory, TimestampAdjuster timestampAdjuster, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.e = defaultTsPayloadReaderFactory;
        this.f3438a = i;
        this.f = factory;
        this.b = Collections.singletonList(timestampAdjuster);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new TsDurationReader();
        this.l = ExtractorOutput.j3;
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (TsPayloadReader) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new SectionReader(new PatReader()));
        this.q = null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        long j3;
        SparseArray sparseArray = this.g;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = (TimestampAdjuster) list.get(i);
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
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.k) != null) {
            tsBinarySearchSeeker.c(j2);
        }
        this.c.D(0);
        this.d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((TsPayloadReader) sparseArray.valueAt(i2)).b();
        }
        this.r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ExtractorInput extractorInput2;
        int i;
        ?? r1;
        boolean z;
        long length = extractorInput.getLength();
        if (this.n) {
            long j = -9223372036854775807L;
            TsDurationReader tsDurationReader = this.j;
            if (length != -1 && !tsDurationReader.c) {
                int i2 = this.s;
                TimestampAdjuster timestampAdjuster = tsDurationReader.f3437a;
                ParsableByteArray parsableByteArray = tsDurationReader.b;
                if (i2 <= 0) {
                    tsDurationReader.a(extractorInput);
                    return 0;
                }
                if (tsDurationReader.e) {
                    if (tsDurationReader.g == -9223372036854775807L) {
                        tsDurationReader.a(extractorInput);
                        return 0;
                    }
                    if (tsDurationReader.d) {
                        long j2 = tsDurationReader.f;
                        if (j2 == -9223372036854775807L) {
                            tsDurationReader.a(extractorInput);
                            return 0;
                        }
                        tsDurationReader.h = timestampAdjuster.c(tsDurationReader.g) - timestampAdjuster.b(j2);
                        tsDurationReader.a(extractorInput);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, extractorInput.getLength());
                    long j3 = 0;
                    if (extractorInput.getPosition() != j3) {
                        positionHolder.f3248a = j3;
                        return 1;
                    }
                    parsableByteArray.D(iMin);
                    extractorInput.i();
                    extractorInput.b(0, iMin, parsableByteArray.f2922a);
                    int i3 = parsableByteArray.b;
                    int i4 = parsableByteArray.c;
                    while (true) {
                        if (i3 >= i4) {
                            break;
                        }
                        if (parsableByteArray.f2922a[i3] == 71) {
                            long jA = TsUtil.a(parsableByteArray, i3, i2);
                            if (jA != -9223372036854775807L) {
                                j = jA;
                                break;
                            }
                        }
                        i3++;
                    }
                    tsDurationReader.f = j;
                    tsDurationReader.d = true;
                    return 0;
                }
                long length2 = extractorInput.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j4 = length2 - iMin2;
                if (extractorInput.getPosition() != j4) {
                    positionHolder.f3248a = j4;
                    return 1;
                }
                parsableByteArray.D(iMin2);
                extractorInput.i();
                extractorInput.b(0, iMin2, parsableByteArray.f2922a);
                int i5 = parsableByteArray.b;
                int i6 = parsableByteArray.c;
                int i7 = i6 - 188;
                while (true) {
                    if (i7 < i5) {
                        break;
                    }
                    byte[] bArr = parsableByteArray.f2922a;
                    int i8 = -4;
                    int i9 = 0;
                    while (true) {
                        if (i8 > 4) {
                            break;
                        }
                        int i10 = (i8 * 188) + i7;
                        if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                            i9 = 0;
                        } else {
                            i9++;
                            if (i9 == 5) {
                                long jA2 = TsUtil.a(parsableByteArray, i7, i2);
                                if (jA2 != -9223372036854775807L) {
                                    j = jA2;
                                    break;
                                }
                            }
                        }
                        i8++;
                    }
                    i7--;
                }
                tsDurationReader.g = j;
                tsDurationReader.e = true;
                return 0;
            }
            if (this.o) {
                i = 1;
                z = false;
            } else {
                this.o = true;
                long j5 = tsDurationReader.h;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsBinarySearchSeeker.TsPcrSeeker(this.s, tsDurationReader.f3437a), j5, 1 + j5, 0L, length, 188L, 940);
                    this.k = tsBinarySearchSeeker;
                    this.l.q(tsBinarySearchSeeker.f3223a);
                } else {
                    z = false;
                    i = 1;
                    this.l.q(new SeekMap.Unseekable(j5));
                }
            }
            if (this.p) {
                this.p = z;
                a(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.f3248a = 0L;
                    return i;
                }
            }
            TsBinarySearchSeeker tsBinarySearchSeeker2 = this.k;
            if (tsBinarySearchSeeker2 != null && tsBinarySearchSeeker2.c != null) {
                return tsBinarySearchSeeker2.a(extractorInput, positionHolder);
            }
            extractorInput2 = extractorInput;
            r1 = z;
        } else {
            extractorInput2 = extractorInput;
            i = 1;
            r1 = 0;
        }
        ParsableByteArray parsableByteArray2 = this.c;
        byte[] bArr2 = parsableByteArray2.f2922a;
        if (9400 - parsableByteArray2.b < 188) {
            int iA = parsableByteArray2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, parsableByteArray2.b, bArr2, r1, iA);
            }
            parsableByteArray2.E(iA, bArr2);
        }
        while (true) {
            int iA2 = parsableByteArray2.a();
            SparseArray sparseArray = this.g;
            if (iA2 >= 188) {
                int i11 = parsableByteArray2.b;
                int i12 = parsableByteArray2.c;
                byte[] bArr3 = parsableByteArray2.f2922a;
                int i13 = i11;
                while (i13 < i12 && bArr3[i13] != 71) {
                    i13++;
                }
                parsableByteArray2.G(i13);
                int i14 = i13 + 188;
                if (i14 > i12) {
                    this.r = (i13 - i11) + this.r;
                } else {
                    this.r = r1;
                }
                int i15 = parsableByteArray2.c;
                if (i14 > i15) {
                    return r1;
                }
                int iG = parsableByteArray2.g();
                if ((8388608 & iG) != 0) {
                    parsableByteArray2.G(i14);
                    return r1;
                }
                int i16 = (4194304 & iG) != 0 ? 1 : r1;
                int i17 = (2096896 & iG) >> 8;
                boolean z2 = (iG & 32) != 0 ? true : r1;
                TsPayloadReader tsPayloadReader = (iG & 16) != 0 ? (TsPayloadReader) sparseArray.get(i17) : null;
                if (tsPayloadReader == null) {
                    parsableByteArray2.G(i14);
                    return r1;
                }
                int i18 = iG & 15;
                SparseIntArray sparseIntArray = this.d;
                int i19 = sparseIntArray.get(i17, i18 - 1);
                sparseIntArray.put(i17, i18);
                if (i19 == i18) {
                    parsableByteArray2.G(i14);
                    return r1;
                }
                if (i18 != ((i19 + 1) & 15)) {
                    tsPayloadReader.b();
                }
                if (z2) {
                    int iU = parsableByteArray2.u();
                    i16 |= (parsableByteArray2.u() & 64) != 0 ? 2 : r1;
                    parsableByteArray2.H(iU - 1);
                }
                boolean z3 = this.n;
                if (z3 || !this.i.get(i17, r1)) {
                    parsableByteArray2.F(i14);
                    tsPayloadReader.a(i16, parsableByteArray2);
                    parsableByteArray2.F(i15);
                }
                if (!z3 && this.n && length != -1) {
                    this.p = true;
                }
                parsableByteArray2.G(i14);
                return r1;
            }
            int i20 = parsableByteArray2.c;
            int i21 = extractorInput2.read(bArr2, i20, 9400 - i20);
            if (i21 == -1) {
                int i22 = r1;
                while (i22 < sparseArray.size()) {
                    TsPayloadReader tsPayloadReader2 = (TsPayloadReader) sparseArray.valueAt(i22);
                    if (tsPayloadReader2 instanceof PesReader) {
                        PesReader pesReader = (PesReader) tsPayloadReader2;
                        if (pesReader.c == 3 && pesReader.j == -1) {
                            pesReader.a(i, new ParsableByteArray());
                        }
                    }
                    i22++;
                    i = 1;
                }
                return -1;
            }
            parsableByteArray2.F(i20 + i21);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.media3.extractor.ExtractorInput r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            androidx.media3.common.util.ParsableByteArray r0 = r6.c
            byte[] r0 = r0.f2922a
            androidx.media3.extractor.DefaultExtractorInput r7 = (androidx.media3.extractor.DefaultExtractorInput) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.h(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.l(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.i(androidx.media3.extractor.ExtractorInput):boolean");
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        if ((this.f3438a & 1) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f);
        }
        this.l = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
