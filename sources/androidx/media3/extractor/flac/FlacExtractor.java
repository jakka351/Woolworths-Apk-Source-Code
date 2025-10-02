package androidx.media3.extractor.flac;

import androidx.camera.core.impl.e;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.flac.FlacBinarySearchSeeker;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlacExtractor implements Extractor {
    public ExtractorOutput e;
    public TrackOutput f;
    public Metadata h;
    public FlacStreamMetadata i;
    public int j;
    public int k;
    public FlacBinarySearchSeeker l;
    public int m;
    public long n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3272a = new byte[42];
    public final ParsableByteArray b = new ParsableByteArray(new byte[32768], 0);
    public final boolean c = false;
    public final FlacFrameReader.SampleNumberHolder d = new FlacFrameReader.SampleNumberHolder();
    public int g = 0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.l;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.D(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        int i;
        SeekMap unseekable;
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        boolean zA;
        int i2 = this.g;
        Metadata metadata = null;
        if (i2 == 0) {
            extractorInput.i();
            long j5 = extractorInput.j();
            Metadata metadataA = new Id3Peeker().a(extractorInput, !this.c ? null : Id3Decoder.b);
            if (metadataA != null && metadataA.f2868a.length != 0) {
                metadata = metadataA;
            }
            extractorInput.l((int) (extractorInput.j() - j5));
            this.h = metadata;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.f3272a;
        if (i2 == 1) {
            extractorInput.b(0, bArr.length, bArr);
            extractorInput.i();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            extractorInput.readFully(parsableByteArray.f2922a, 0, 4);
            if (parsableByteArray.w() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        if (i2 == 3) {
            int i5 = 0;
            FlacStreamMetadata flacStreamMetadata = this.i;
            FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder();
            flacStreamMetadataHolder.f3236a = flacStreamMetadata;
            boolean z2 = false;
            while (!z2) {
                extractorInput.i();
                byte[] bArr2 = new byte[i3];
                ParsableBitArray parsableBitArray = new ParsableBitArray(bArr2, i3);
                int i6 = i5;
                extractorInput.b(i6, i3, bArr2);
                boolean zF = parsableBitArray.f();
                int iG = parsableBitArray.g(i);
                int iG2 = parsableBitArray.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    extractorInput.readFully(bArr3, i6, 38);
                    flacStreamMetadataHolder.f3236a = new FlacStreamMetadata(bArr3, i3);
                } else {
                    FlacStreamMetadata flacStreamMetadata2 = flacStreamMetadataHolder.f3236a;
                    if (flacStreamMetadata2 == null) {
                        throw new IllegalArgumentException();
                    }
                    Metadata metadata2 = flacStreamMetadata2.l;
                    if (iG == i4) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(iG2);
                        extractorInput.readFully(parsableByteArray2.f2922a, 0, iG2);
                        flacStreamMetadataHolder.f3236a = new FlacStreamMetadata(flacStreamMetadata2.f3238a, flacStreamMetadata2.b, flacStreamMetadata2.c, flacStreamMetadata2.d, flacStreamMetadata2.e, flacStreamMetadata2.g, flacStreamMetadata2.h, flacStreamMetadata2.j, FlacMetadataReader.a(parsableByteArray2), flacStreamMetadata2.l);
                    } else if (iG == i3) {
                        ParsableByteArray parsableByteArray3 = new ParsableByteArray(iG2);
                        extractorInput.readFully(parsableByteArray3.f2922a, 0, iG2);
                        parsableByteArray3.H(i3);
                        Metadata metadataA2 = VorbisUtil.a(Arrays.asList(VorbisUtil.b(parsableByteArray3, false, false).f3256a));
                        if (metadata2 != null) {
                            metadataA2 = metadata2.b(metadataA2);
                        }
                        flacStreamMetadataHolder.f3236a = new FlacStreamMetadata(flacStreamMetadata2.f3238a, flacStreamMetadata2.b, flacStreamMetadata2.c, flacStreamMetadata2.d, flacStreamMetadata2.e, flacStreamMetadata2.g, flacStreamMetadata2.h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadataA2);
                    } else if (iG == 6) {
                        ParsableByteArray parsableByteArray4 = new ParsableByteArray(iG2);
                        extractorInput.readFully(parsableByteArray4.f2922a, 0, iG2);
                        parsableByteArray4.H(i3);
                        Metadata metadata3 = new Metadata(ImmutableList.w(PictureFrame.d(parsableByteArray4)));
                        if (metadata2 != null) {
                            metadata3 = metadata2.b(metadata3);
                        }
                        flacStreamMetadataHolder.f3236a = new FlacStreamMetadata(flacStreamMetadata2.f3238a, flacStreamMetadata2.b, flacStreamMetadata2.c, flacStreamMetadata2.d, flacStreamMetadata2.e, flacStreamMetadata2.g, flacStreamMetadata2.h, flacStreamMetadata2.j, flacStreamMetadata2.k, metadata3);
                    } else {
                        extractorInput.l(iG2);
                    }
                }
                FlacStreamMetadata flacStreamMetadata3 = flacStreamMetadataHolder.f3236a;
                int i7 = Util.f2928a;
                this.i = flacStreamMetadata3;
                z2 = zF;
                i3 = 4;
                i4 = 3;
                i = 7;
                i5 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            Format formatC = this.i.c(bArr, this.h);
            TrackOutput trackOutput = this.f;
            Format.Builder builderA = formatC.a();
            builderA.l = MimeTypes.m("audio/flac");
            trackOutput.e(new Format(builderA));
            TrackOutput trackOutput2 = this.f;
            this.i.b();
            trackOutput2.d();
            this.g = 4;
            return 0;
        }
        if (i2 == 4) {
            extractorInput.i();
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            extractorInput.b(0, 2, parsableByteArray5.f2922a);
            int iA = parsableByteArray5.A();
            if ((iA >> 2) != 16382) {
                extractorInput.i();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            extractorInput.i();
            this.k = iA;
            ExtractorOutput extractorOutput = this.e;
            int i8 = Util.f2928a;
            long position = extractorInput.getPosition();
            long length = extractorInput.getLength();
            this.i.getClass();
            FlacStreamMetadata flacStreamMetadata4 = this.i;
            if (flacStreamMetadata4.k != null) {
                unseekable = new FlacSeekTableSeekMap(flacStreamMetadata4, position);
                i = 0;
            } else if (length == -1 || flacStreamMetadata4.j <= 0) {
                i = 0;
                unseekable = new SeekMap.Unseekable(flacStreamMetadata4.b());
            } else {
                int i9 = this.k;
                int i10 = flacStreamMetadata4.c;
                e eVar = new e(flacStreamMetadata4, i3);
                FlacBinarySearchSeeker.FlacTimestampSeeker flacTimestampSeeker = new FlacBinarySearchSeeker.FlacTimestampSeeker(flacStreamMetadata4, i9);
                long jB = flacStreamMetadata4.b();
                long j6 = flacStreamMetadata4.j;
                int i11 = flacStreamMetadata4.d;
                if (i11 > 0) {
                    i = 0;
                    j = j6;
                    j2 = (i11 + i10) / 2;
                    j3 = 1;
                } else {
                    i = 0;
                    j = j6;
                    int i12 = flacStreamMetadata4.f3238a;
                    j2 = ((((i12 != flacStreamMetadata4.b || i12 <= 0) ? 4096L : i12) * flacStreamMetadata4.g) * flacStreamMetadata4.h) / 8;
                    j3 = 64;
                }
                FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(eVar, flacTimestampSeeker, jB, j, position, length, j2 + j3, Math.max(6, i10));
                this.l = flacBinarySearchSeeker;
                unseekable = flacBinarySearchSeeker.f3223a;
            }
            extractorOutput.q(unseekable);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        FlacBinarySearchSeeker flacBinarySearchSeeker2 = this.l;
        if (flacBinarySearchSeeker2 != null && flacBinarySearchSeeker2.c != null) {
            return flacBinarySearchSeeker2.a(extractorInput, positionHolder);
        }
        if (this.n == -1) {
            FlacStreamMetadata flacStreamMetadata5 = this.i;
            extractorInput.i();
            extractorInput.k(1);
            byte[] bArr4 = new byte[1];
            extractorInput.b(0, 1, bArr4);
            z = (bArr4[0] & 1) == 1;
            extractorInput.k(2);
            i = z ? 7 : 6;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(i);
            byte[] bArr5 = parsableByteArray6.f2922a;
            int i13 = 0;
            while (i13 < i) {
                int iC = extractorInput.c(i13, i - i13, bArr5);
                if (iC == -1) {
                    break;
                }
                i13 += iC;
            }
            parsableByteArray6.F(i13);
            extractorInput.i();
            try {
                long jB2 = parsableByteArray6.B();
                if (!z) {
                    jB2 *= flacStreamMetadata5.b;
                }
                this.n = jB2;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        ParsableByteArray parsableByteArray7 = this.b;
        int i14 = parsableByteArray7.c;
        if (i14 < 32768) {
            int i15 = extractorInput.read(parsableByteArray7.f2922a, i14, 32768 - i14);
            z = i15 == -1;
            if (!z) {
                parsableByteArray7.F(i14 + i15);
            } else if (parsableByteArray7.a() == 0) {
                long j7 = this.n * 1000000;
                FlacStreamMetadata flacStreamMetadata6 = this.i;
                int i16 = Util.f2928a;
                this.f.g(j7 / flacStreamMetadata6.e, 1, this.m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i17 = parsableByteArray7.b;
        int i18 = this.m;
        int i19 = this.j;
        if (i18 < i19) {
            parsableByteArray7.H(Math.min(i19 - i18, parsableByteArray7.a()));
        }
        this.i.getClass();
        int i20 = parsableByteArray7.b;
        while (true) {
            int i21 = parsableByteArray7.c - 16;
            FlacFrameReader.SampleNumberHolder sampleNumberHolder = this.d;
            if (i20 <= i21) {
                parsableByteArray7.G(i20);
                if (FlacFrameReader.a(parsableByteArray7, this.i, this.k, sampleNumberHolder)) {
                    parsableByteArray7.G(i20);
                    j4 = sampleNumberHolder.f3235a;
                    break;
                }
                i20++;
            } else {
                if (z) {
                    while (true) {
                        int i22 = parsableByteArray7.c;
                        if (i20 > i22 - this.j) {
                            parsableByteArray7.G(i22);
                            break;
                        }
                        parsableByteArray7.G(i20);
                        try {
                            zA = FlacFrameReader.a(parsableByteArray7, this.i, this.k, sampleNumberHolder);
                        } catch (IndexOutOfBoundsException unused2) {
                            zA = false;
                        }
                        if (parsableByteArray7.b > parsableByteArray7.c) {
                            zA = false;
                        }
                        if (zA) {
                            parsableByteArray7.G(i20);
                            j4 = sampleNumberHolder.f3235a;
                            break;
                        }
                        i20++;
                    }
                } else {
                    parsableByteArray7.G(i20);
                }
                j4 = -1;
            }
        }
        int i23 = parsableByteArray7.b - i17;
        parsableByteArray7.G(i17);
        this.f.c(i23, parsableByteArray7);
        int i24 = this.m + i23;
        this.m = i24;
        if (j4 != -1) {
            long j8 = this.n * 1000000;
            FlacStreamMetadata flacStreamMetadata7 = this.i;
            int i25 = Util.f2928a;
            this.f.g(j8 / flacStreamMetadata7.e, 1, i24, 0, null);
            this.m = 0;
            this.n = j4;
        }
        int length2 = parsableByteArray7.f2922a.length - parsableByteArray7.c;
        if (parsableByteArray7.a() < 16 && length2 < 16) {
            int iA2 = parsableByteArray7.a();
            byte[] bArr6 = parsableByteArray7.f2922a;
            System.arraycopy(bArr6, parsableByteArray7.b, bArr6, 0, iA2);
            parsableByteArray7.G(0);
            parsableByteArray7.F(iA2);
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws Throwable {
        Metadata metadataA = new Id3Peeker().a(extractorInput, Id3Decoder.b);
        if (metadataA != null) {
            int length = metadataA.f2868a.length;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        ((DefaultExtractorInput) extractorInput).h(parsableByteArray.f2922a, 0, 4, false);
        return parsableByteArray.w() == 1716281667;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.e = extractorOutput;
        this.f = extractorOutput.j(0, 1);
        extractorOutput.h();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
