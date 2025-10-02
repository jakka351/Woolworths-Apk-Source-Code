package androidx.media3.extractor.ts;

import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class PesReader implements TsPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    public final ElementaryStreamReader f3429a;
    public final ParsableBitArray b = new ParsableBitArray(new byte[10], 10);
    public int c = 0;
    public int d;
    public TimestampAdjuster e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f3429a = elementaryStreamReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void a(int i, ParsableByteArray parsableByteArray) {
        Assertions.g(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        ElementaryStreamReader elementaryStreamReader = this.f3429a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    Log.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        Log.g("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    elementaryStreamReader.e(parsableByteArray.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (parsableByteArray.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                ParsableBitArray parsableBitArray = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(parsableByteArray, parsableBitArray.f2921a, Math.min(10, this.i)) && d(parsableByteArray, null, this.i)) {
                            parsableBitArray.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                parsableBitArray.o(4);
                                parsableBitArray.o(1);
                                parsableBitArray.o(1);
                                long jG = (parsableBitArray.g(15) << 15) | (parsableBitArray.g(3) << 30) | parsableBitArray.g(15);
                                parsableBitArray.o(1);
                                if (!this.h && this.g) {
                                    parsableBitArray.o(4);
                                    parsableBitArray.o(1);
                                    parsableBitArray.o(1);
                                    parsableBitArray.o(1);
                                    this.e.b((parsableBitArray.g(3) << 30) | (parsableBitArray.g(15) << 15) | parsableBitArray.g(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(jG);
                            }
                            i6 |= this.k ? 4 : 0;
                            elementaryStreamReader.d(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = parsableByteArray.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            parsableByteArray.F(parsableByteArray.b + iA);
                        }
                        elementaryStreamReader.a(parsableByteArray);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                elementaryStreamReader.e(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(parsableByteArray, parsableBitArray.f2921a, 9)) {
                    ParsableBitArray parsableBitArray2 = this.b;
                    boolean z = false;
                    parsableBitArray2.m(0);
                    int iG = parsableBitArray2.g(24);
                    if (iG != 1) {
                        a.t(iG, "Unexpected start code prefix: ", "PesReader");
                        this.j = -1;
                    } else {
                        parsableBitArray2.o(8);
                        int iG2 = parsableBitArray2.g(16);
                        parsableBitArray2.o(5);
                        this.k = parsableBitArray2.f();
                        parsableBitArray2.o(2);
                        this.f = parsableBitArray2.f();
                        this.g = parsableBitArray2.f();
                        parsableBitArray2.o(6);
                        int iG3 = parsableBitArray2.g(8);
                        this.i = iG3;
                        if (iG2 == 0) {
                            this.j = -1;
                        } else {
                            int i12 = (iG2 - 3) - iG3;
                            this.j = i12;
                            if (i12 < 0) {
                                Log.g("PesReader", "Found negative packet payload size: " + this.j);
                                this.j = -1;
                            }
                        }
                        z = true;
                    }
                    this.c = z ? 2 : 0;
                    this.d = 0;
                }
            } else {
                parsableByteArray.H(parsableByteArray.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f3429a.b();
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.e = timestampAdjuster;
        this.f3429a.c(extractorOutput, trackIdGenerator);
    }

    public final boolean d(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.H(iMin);
        } else {
            parsableByteArray.e(this.d, iMin, bArr);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }
}
