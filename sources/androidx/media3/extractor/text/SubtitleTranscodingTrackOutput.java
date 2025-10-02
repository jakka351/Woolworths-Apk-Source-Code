package androidx.media3.extractor.text;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;

/* loaded from: classes2.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {

    /* renamed from: a, reason: collision with root package name */
    public final TrackOutput f3358a;
    public final SubtitleParser.Factory b;
    public SubtitleParser g;
    public Format h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = Util.c;
    public final ParsableByteArray c = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.f3358a = trackOutput;
        this.b = factory;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.g == null) {
            this.f3358a.a(parsableByteArray, i, i2);
            return;
        }
        h(i);
        parsableByteArray.e(this.e, i, this.f);
        this.e += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void e(Format format) {
        format.n.getClass();
        String str = format.n;
        Assertions.b(MimeTypes.h(str) == 3);
        boolean zEquals = format.equals(this.h);
        SubtitleParser.Factory factory = this.b;
        if (!zEquals) {
            this.h = format;
            this.g = factory.a(format) ? factory.c(format) : null;
        }
        SubtitleParser subtitleParser = this.g;
        TrackOutput trackOutput = this.f3358a;
        if (subtitleParser == null) {
            trackOutput.e(format);
            return;
        }
        Format.Builder builderA = format.a();
        builderA.m = MimeTypes.m("application/x-media3-cues");
        builderA.j = str;
        builderA.r = Long.MAX_VALUE;
        builderA.I = factory.b(format);
        trackOutput.e(new Format(builderA));
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int f(DataReader dataReader, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.f3358a.f(dataReader, i, z);
        }
        h(i);
        int i2 = dataReader.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void g(final long j, final int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        if (this.g == null) {
            this.f3358a.g(j, i, i2, i3, cryptoData);
            return;
        }
        Assertions.a("DRM on subtitles is not supported", cryptoData == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.a(this.f, i4, i2, SubtitleParser.OutputOptions.c, new Consumer() { // from class: androidx.media3.extractor.text.b
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                    SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.d;
                    Assertions.g(subtitleTranscodingTrackOutput.h);
                    byte[] bArrA = CueEncoder.a(cuesWithTiming.f3353a, cuesWithTiming.c);
                    ParsableByteArray parsableByteArray = subtitleTranscodingTrackOutput.c;
                    parsableByteArray.getClass();
                    parsableByteArray.E(bArrA.length, bArrA);
                    subtitleTranscodingTrackOutput.f3358a.c(bArrA.length, parsableByteArray);
                    long j2 = cuesWithTiming.b;
                    long j3 = j;
                    if (j2 == -9223372036854775807L) {
                        Assertions.f(subtitleTranscodingTrackOutput.h.s == Long.MAX_VALUE);
                    } else {
                        long j4 = subtitleTranscodingTrackOutput.h.s;
                        j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                    }
                    subtitleTranscodingTrackOutput.f3358a.g(j3, i | 1, bArrA.length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            Log.h("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
