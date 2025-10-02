package androidx.media3.extractor.mkv;

import android.util.SparseArray;
import androidx.constraintlayout.core.state.a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public class MatroskaExtractor implements Extractor {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public LongArray F;
    public LongArray G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final DefaultEbmlReader f3305a;
    public boolean a0;
    public final VarintReader b;
    public int b0;
    public final SparseArray c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public ExtractorOutput e0;
    public final SubtitleParser.Factory f;
    public final ParsableByteArray g;
    public final ParsableByteArray h;
    public final ParsableByteArray i;
    public final ParsableByteArray j;
    public final ParsableByteArray k;
    public final ParsableByteArray l;
    public final ParsableByteArray m;
    public final ParsableByteArray n;
    public final ParsableByteArray o;
    public final ParsableByteArray p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public Track x;
    public boolean y;
    public int z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        public InnerEbmlProcessor() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(int i, int i2, ExtractorInput extractorInput) throws ParserException {
            int i3;
            int i4;
            int i5;
            long j;
            int i6;
            int i7;
            int i8;
            int i9;
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            VarintReader varintReader = matroskaExtractor.b;
            SparseArray sparseArray = matroskaExtractor.c;
            ParsableByteArray parsableByteArray = matroskaExtractor.k;
            ParsableByteArray parsableByteArray2 = matroskaExtractor.i;
            int i10 = 1;
            int i11 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (matroskaExtractor.J != 2) {
                        return;
                    }
                    Track track = (Track) sparseArray.get(matroskaExtractor.P);
                    int i12 = matroskaExtractor.S;
                    ParsableByteArray parsableByteArray3 = matroskaExtractor.p;
                    if (i12 != 4 || !"V_VP9".equals(track.c)) {
                        extractorInput.l(i2);
                        return;
                    } else {
                        parsableByteArray3.D(i2);
                        extractorInput.readFully(parsableByteArray3.f2922a, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    matroskaExtractor.d(i);
                    Track track2 = matroskaExtractor.x;
                    int i13 = track2.h;
                    if (i13 != 1685485123 && i13 != 1685480259) {
                        extractorInput.l(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    track2.P = bArr;
                    extractorInput.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    matroskaExtractor.d(i);
                    Track track3 = matroskaExtractor.x;
                    byte[] bArr2 = new byte[i2];
                    track3.j = bArr2;
                    extractorInput.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    extractorInput.readFully(bArr3, 0, i2);
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.k = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(parsableByteArray.f2922a, (byte) 0);
                    extractorInput.readFully(parsableByteArray.f2922a, 4 - i2, i2);
                    parsableByteArray.G(0);
                    matroskaExtractor.z = (int) parsableByteArray.w();
                    return;
                }
                if (i == 25506) {
                    matroskaExtractor.d(i);
                    Track track4 = matroskaExtractor.x;
                    byte[] bArr4 = new byte[i2];
                    track4.l = bArr4;
                    extractorInput.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i);
                }
                matroskaExtractor.d(i);
                Track track5 = matroskaExtractor.x;
                byte[] bArr5 = new byte[i2];
                track5.x = bArr5;
                extractorInput.readFully(bArr5, 0, i2);
                return;
            }
            if (matroskaExtractor.J == 0) {
                matroskaExtractor.P = (int) varintReader.b(extractorInput, false, true, 8);
                matroskaExtractor.Q = varintReader.c;
                matroskaExtractor.L = -9223372036854775807L;
                matroskaExtractor.J = 1;
                parsableByteArray2.D(0);
            }
            Track track6 = (Track) sparseArray.get(matroskaExtractor.P);
            if (track6 == null) {
                extractorInput.l(i2 - matroskaExtractor.Q);
                matroskaExtractor.J = 0;
                return;
            }
            track6.Z.getClass();
            if (matroskaExtractor.J == 1) {
                matroskaExtractor.k(extractorInput, 3);
                int i14 = (parsableByteArray2.f2922a[2] & 6) >> 1;
                int i15 = 255;
                if (i14 == 0) {
                    matroskaExtractor.N = 1;
                    int[] iArr = matroskaExtractor.O;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    matroskaExtractor.O = iArr;
                    iArr[0] = (i2 - matroskaExtractor.Q) - 3;
                } else {
                    matroskaExtractor.k(extractorInput, 4);
                    int i16 = (parsableByteArray2.f2922a[3] & 255) + 1;
                    matroskaExtractor.N = i16;
                    int[] iArr2 = matroskaExtractor.O;
                    if (iArr2 == null) {
                        iArr2 = new int[i16];
                    } else if (iArr2.length < i16) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i16)];
                    }
                    matroskaExtractor.O = iArr2;
                    if (i14 == 2) {
                        int i17 = (i2 - matroskaExtractor.Q) - 4;
                        int i18 = matroskaExtractor.N;
                        Arrays.fill(iArr2, 0, i18, i17 / i18);
                    } else {
                        if (i14 != 1) {
                            if (i14 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i14);
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 4;
                            while (true) {
                                int i22 = matroskaExtractor.N - i10;
                                if (i19 >= i22) {
                                    i3 = i10;
                                    i4 = i11;
                                    matroskaExtractor.O[i22] = ((i2 - matroskaExtractor.Q) - i21) - i20;
                                    break;
                                }
                                matroskaExtractor.O[i19] = i11;
                                int i23 = i21 + 1;
                                matroskaExtractor.k(extractorInput, i23);
                                if (parsableByteArray2.f2922a[i21] == 0) {
                                    throw ParserException.a(null, "No valid varint length mask found");
                                }
                                int i24 = i10;
                                int i25 = i11;
                                while (true) {
                                    if (i25 >= 8) {
                                        i5 = i11;
                                        j = 0;
                                        i6 = i23;
                                        break;
                                    }
                                    int i26 = i24 << (7 - i25);
                                    i5 = i11;
                                    if ((parsableByteArray2.f2922a[i21] & i26) != 0) {
                                        i6 = i23 + i25;
                                        matroskaExtractor.k(extractorInput, i6);
                                        j = parsableByteArray2.f2922a[i21] & i15 & (~i26);
                                        while (i23 < i6) {
                                            j = (j << 8) | (parsableByteArray2.f2922a[i23] & i15);
                                            i23++;
                                            i15 = 255;
                                        }
                                        if (i19 > 0) {
                                            j -= (1 << ((i25 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i25++;
                                        i11 = i5;
                                        i15 = 255;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i27 = (int) j;
                                int[] iArr3 = matroskaExtractor.O;
                                if (i19 != 0) {
                                    i27 += iArr3[i19 - 1];
                                }
                                iArr3[i19] = i27;
                                i20 += i27;
                                i19++;
                                i21 = i6;
                                i10 = i24;
                                i11 = i5;
                                i15 = 255;
                            }
                            throw ParserException.a(null, "EBML lacing sample size out of range.");
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i7 = matroskaExtractor.N - 1;
                            if (i28 >= i7) {
                                break;
                            }
                            matroskaExtractor.O[i28] = 0;
                            while (true) {
                                i8 = i30 + 1;
                                matroskaExtractor.k(extractorInput, i8);
                                int i31 = parsableByteArray2.f2922a[i30] & 255;
                                int[] iArr4 = matroskaExtractor.O;
                                i9 = iArr4[i28] + i31;
                                iArr4[i28] = i9;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i8;
                                }
                            }
                            i29 += i9;
                            i28++;
                            i30 = i8;
                        }
                        matroskaExtractor.O[i7] = ((i2 - matroskaExtractor.Q) - i30) - i29;
                    }
                }
                i3 = 1;
                i4 = 0;
                byte[] bArr6 = parsableByteArray2.f2922a;
                matroskaExtractor.K = matroskaExtractor.m((bArr6[i3] & 255) | (bArr6[i4] << 8)) + matroskaExtractor.E;
                matroskaExtractor.R = (track6.e == 2 || (i == 163 && (parsableByteArray2.f2922a[2] & 128) == 128)) ? i3 : i4;
                matroskaExtractor.J = 2;
                matroskaExtractor.M = i4;
            } else {
                i3 = 1;
            }
            if (i == 163) {
                while (true) {
                    int i32 = matroskaExtractor.M;
                    if (i32 >= matroskaExtractor.N) {
                        matroskaExtractor.J = 0;
                        return;
                    } else {
                        matroskaExtractor.g(track6, ((matroskaExtractor.M * track6.f) / 1000) + matroskaExtractor.K, matroskaExtractor.R, matroskaExtractor.n(extractorInput, track6, matroskaExtractor.O[i32], false), 0);
                        matroskaExtractor.M++;
                    }
                }
            } else {
                while (true) {
                    int i33 = matroskaExtractor.M;
                    if (i33 >= matroskaExtractor.N) {
                        return;
                    }
                    int[] iArr5 = matroskaExtractor.O;
                    boolean z = i3;
                    iArr5[i33] = matroskaExtractor.n(extractorInput, track6, iArr5[i33], z);
                    matroskaExtractor.M += z ? 1 : 0;
                }
            }
        }

        public final void b(int i, long j) throws ParserException {
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
            }
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            switch (i) {
                case 131:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.e = (int) j;
                    return;
                case 136:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.X = j == 1;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    matroskaExtractor.L = matroskaExtractor.m(j);
                    return;
                case 159:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.Q = (int) j;
                    return;
                case 176:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.n = (int) j;
                    return;
                case 179:
                    matroskaExtractor.b(i);
                    matroskaExtractor.F.a(matroskaExtractor.m(j));
                    return;
                case 186:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.o = (int) j;
                    return;
                case 215:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.d = (int) j;
                    return;
                case 231:
                    matroskaExtractor.E = matroskaExtractor.m(j);
                    return;
                case 238:
                    matroskaExtractor.S = (int) j;
                    return;
                case 241:
                    if (matroskaExtractor.H) {
                        return;
                    }
                    matroskaExtractor.b(i);
                    matroskaExtractor.G.a(j);
                    matroskaExtractor.H = true;
                    return;
                case 251:
                    matroskaExtractor.T = true;
                    return;
                case 16871:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    matroskaExtractor.A = j + matroskaExtractor.s;
                    return;
                case 21432:
                    int i2 = (int) j;
                    matroskaExtractor.d(i);
                    if (i2 == 0) {
                        matroskaExtractor.x.y = 0;
                        return;
                    }
                    if (i2 == 1) {
                        matroskaExtractor.x.y = 2;
                        return;
                    } else if (i2 == 3) {
                        matroskaExtractor.x.y = 1;
                        return;
                    } else {
                        if (i2 != 15) {
                            return;
                        }
                        matroskaExtractor.x.y = 3;
                        return;
                    }
                case 21680:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.q = (int) j;
                    return;
                case 21682:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.s = (int) j;
                    return;
                case 21690:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.r = (int) j;
                    return;
                case 21930:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.W = j == 1;
                    return;
                case 21938:
                    matroskaExtractor.d(i);
                    Track track = matroskaExtractor.x;
                    track.z = true;
                    track.p = (int) j;
                    return;
                case 21998:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.g = (int) j;
                    return;
                case 22186:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.T = j;
                    return;
                case 22203:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.U = j;
                    return;
                case 25188:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.R = (int) j;
                    return;
                case 30114:
                    matroskaExtractor.U = j;
                    return;
                case 30321:
                    matroskaExtractor.d(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        matroskaExtractor.x.t = 0;
                        return;
                    }
                    if (i3 == 1) {
                        matroskaExtractor.x.t = 1;
                        return;
                    } else if (i3 == 2) {
                        matroskaExtractor.x.t = 2;
                        return;
                    } else {
                        if (i3 != 3) {
                            return;
                        }
                        matroskaExtractor.x.t = 3;
                        return;
                    }
                case 2352003:
                    matroskaExtractor.d(i);
                    matroskaExtractor.x.f = (int) j;
                    return;
                case 2807729:
                    matroskaExtractor.t = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            matroskaExtractor.d(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                matroskaExtractor.x.C = 2;
                                return;
                            } else {
                                if (i4 != 2) {
                                    return;
                                }
                                matroskaExtractor.x.C = 1;
                                return;
                            }
                        case 21946:
                            matroskaExtractor.d(i);
                            int iG = ColorInfo.g((int) j);
                            if (iG != -1) {
                                matroskaExtractor.x.B = iG;
                                return;
                            }
                            return;
                        case 21947:
                            matroskaExtractor.d(i);
                            matroskaExtractor.x.z = true;
                            int iF = ColorInfo.f((int) j);
                            if (iF != -1) {
                                matroskaExtractor.x.A = iF;
                                return;
                            }
                            return;
                        case 21948:
                            matroskaExtractor.d(i);
                            matroskaExtractor.x.D = (int) j;
                            return;
                        case 21949:
                            matroskaExtractor.d(i);
                            matroskaExtractor.x.E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static final class Track {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public float N;
        public float O;
        public byte[] P;
        public int Q;
        public int R;
        public int S;
        public long T;
        public long U;
        public TrueHdSampleRechunker V;
        public boolean W;
        public boolean X;
        public String Y;
        public TrackOutput Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3307a;
        public int a0;
        public String b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public byte[] j;
        public TrackOutput.CryptoData k;
        public byte[] l;
        public DrmInitData m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public float w;
        public byte[] x;
        public int y;
        public boolean z;

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        int i = Util.f2928a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        a.u(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a.u(SubsamplingScaleImageView.ORIENTATION_180, map, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        k0 = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f3305a = defaultEbmlReader;
        defaultEbmlReader.d = new InnerEbmlProcessor();
        this.f = factory;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new VarintReader();
        this.c = new SparseArray();
        this.i = new ParsableByteArray(4);
        this.j = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new ParsableByteArray(4);
        this.g = new ParsableByteArray(NalUnitUtil.f2934a);
        this.h = new ParsableByteArray(4);
        this.l = new ParsableByteArray();
        this.m = new ParsableByteArray();
        this.n = new ParsableByteArray(8);
        this.o = new ParsableByteArray();
        this.p = new ParsableByteArray();
        this.O = new int[1];
    }

    public static byte[] h(long j, long j2, String str) {
        Assertions.b(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = Util.f2928a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        DefaultEbmlReader defaultEbmlReader = this.f3305a;
        defaultEbmlReader.e = 0;
        defaultEbmlReader.b.clear();
        VarintReader varintReader = defaultEbmlReader.c;
        varintReader.b = 0;
        varintReader.c = 0;
        VarintReader varintReader2 = this.b;
        varintReader2.b = 0;
        varintReader2.c = 0;
        l();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            TrueHdSampleRechunker trueHdSampleRechunker = ((Track) sparseArray.valueAt(i)).V;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.b = false;
                trueHdSampleRechunker.c = 0;
            }
            i++;
        }
    }

    public final void b(int i) throws ParserException {
        if (this.F == null || this.G == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    public final void d(int i) throws ParserException {
        if (this.x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f89, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0f8a, code lost:
    
        if (r5 != false) goto L867;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0f8c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0f8d, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0f93, code lost:
    
        if (r3 >= r0.size()) goto L933;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0f95, code lost:
    
        r0 = (androidx.media3.extractor.mkv.MatroskaExtractor.Track) r0.valueAt(r3);
        r0.Z.getClass();
        r1 = r0.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0fa2, code lost:
    
        if (r1 == null) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0fa4, code lost:
    
        r1.a(r0.Z, r0.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0fab, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0fae, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0fb1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x0f3e  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x0f6a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /* JADX WARN: Type inference failed for: r3v42, types: [androidx.media3.extractor.mkv.MatroskaExtractor$Track, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.RuntimeException] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r40, androidx.media3.extractor.PositionHolder r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 4836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(androidx.media3.extractor.mkv.MatroskaExtractor.Track r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.g(androidx.media3.extractor.mkv.MatroskaExtractor$Track, long, int, int, int):void");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        Sniffer sniffer = new Sniffer();
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        long j = defaultExtractorInput.c;
        long j2 = llqqqql.c00630063c0063c0063;
        if (j != -1 && j <= llqqqql.c00630063c0063c0063) {
            j2 = j;
        }
        int i = (int) j2;
        ParsableByteArray parsableByteArray = sniffer.f3308a;
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
        long jW = parsableByteArray.w();
        sniffer.b = 4;
        while (true) {
            if (jW != 440786851) {
                int i2 = sniffer.b + 1;
                sniffer.b = i2;
                if (i2 == i) {
                    break;
                }
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 1, false);
                jW = ((jW << 8) & (-256)) | (parsableByteArray.f2922a[0] & 255);
            } else {
                long jA = sniffer.a(defaultExtractorInput);
                long j3 = sniffer.b;
                if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
                    while (true) {
                        long j4 = sniffer.b;
                        long j5 = j3 + jA;
                        if (j4 < j5) {
                            if (sniffer.a(defaultExtractorInput) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = sniffer.a(defaultExtractorInput);
                            if (jA2 < 0 || jA2 > 2147483647L) {
                                break;
                            }
                            if (jA2 != 0) {
                                int i3 = (int) jA2;
                                defaultExtractorInput.m(i3, false);
                                sniffer.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        if (this.e) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f);
        }
        this.e0 = extractorOutput;
    }

    public final void k(ExtractorInput extractorInput, int i) {
        ParsableByteArray parsableByteArray = this.i;
        if (parsableByteArray.c >= i) {
            return;
        }
        byte[] bArr = parsableByteArray.f2922a;
        if (bArr.length < i) {
            parsableByteArray.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = parsableByteArray.f2922a;
        int i2 = parsableByteArray.c;
        extractorInput.readFully(bArr2, i2, i - i2);
        parsableByteArray.F(i);
    }

    public final void l() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.D(0);
    }

    public final long m(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = Util.f2928a;
        return Util.O(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int n(ExtractorInput extractorInput, Track track, int i, boolean z) throws ParserException {
        int iB;
        int iB2;
        int i2;
        if ("S_TEXT/UTF8".equals(track.c)) {
            o(extractorInput, f0, i);
            int i3 = this.W;
            l();
            return i3;
        }
        if ("S_TEXT/ASS".equals(track.c)) {
            o(extractorInput, h0, i);
            int i4 = this.W;
            l();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(track.c)) {
            o(extractorInput, i0, i);
            int i5 = this.W;
            l();
            return i5;
        }
        TrackOutput trackOutput = track.Z;
        boolean z2 = this.Y;
        ParsableByteArray parsableByteArray = this.l;
        if (!z2) {
            boolean z3 = track.i;
            ParsableByteArray parsableByteArray2 = this.i;
            if (z3) {
                this.R &= -1073741825;
                if (!this.Z) {
                    extractorInput.readFully(parsableByteArray2.f2922a, 0, 1);
                    this.V++;
                    byte b = parsableByteArray2.f2922a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b;
                    this.Z = true;
                }
                byte b2 = this.c0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        ParsableByteArray parsableByteArray3 = this.n;
                        extractorInput.readFully(parsableByteArray3.f2922a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        parsableByteArray2.f2922a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        parsableByteArray2.G(0);
                        trackOutput.a(parsableByteArray2, 1, 1);
                        this.W++;
                        parsableByteArray3.G(0);
                        trackOutput.a(parsableByteArray3, 8, 1);
                        this.W += 8;
                    }
                    if (z4) {
                        if (!this.a0) {
                            extractorInput.readFully(parsableByteArray2.f2922a, 0, 1);
                            this.V++;
                            parsableByteArray2.G(0);
                            this.b0 = parsableByteArray2.u();
                            this.a0 = true;
                        }
                        int i6 = this.b0 * 4;
                        parsableByteArray2.D(i6);
                        extractorInput.readFully(parsableByteArray2.f2922a, 0, i6);
                        this.V += i6;
                        short s = (short) ((this.b0 / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.q = ByteBuffer.allocate(i7);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.b0;
                            if (i8 >= i2) {
                                break;
                            }
                            int iY = parsableByteArray2.y();
                            if (i8 % 2 == 0) {
                                this.q.putShort((short) (iY - i9));
                            } else {
                                this.q.putInt(iY - i9);
                            }
                            i8++;
                            i9 = iY;
                        }
                        int i10 = (i - this.V) - i9;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i10);
                        } else {
                            this.q.putShort((short) i10);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        ParsableByteArray parsableByteArray4 = this.o;
                        parsableByteArray4.E(i7, bArrArray);
                        trackOutput.a(parsableByteArray4, i7, 1);
                        this.W += i7;
                    }
                }
            } else {
                byte[] bArr = track.j;
                if (bArr != null) {
                    parsableByteArray.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(track.c) ? z : track.g > 0) {
                this.R |= 268435456;
                this.p.D(0);
                int i11 = (parsableByteArray.c + i) - this.V;
                parsableByteArray2.D(4);
                byte[] bArr2 = parsableByteArray2.f2922a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                trackOutput.a(parsableByteArray2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i12 = i + parsableByteArray.c;
        if (!"V_MPEG4/ISO/AVC".equals(track.c) && !"V_MPEGH/ISO/HEVC".equals(track.c)) {
            if (track.V != null) {
                Assertions.f(parsableByteArray.c == 0);
                track.V.c(extractorInput);
            }
            while (true) {
                int i13 = this.V;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = parsableByteArray.a();
                if (iA > 0) {
                    iB2 = Math.min(i14, iA);
                    trackOutput.c(iB2, parsableByteArray);
                } else {
                    iB2 = trackOutput.b(extractorInput, i14, false);
                }
                this.V += iB2;
                this.W += iB2;
            }
        } else {
            ParsableByteArray parsableByteArray5 = this.h;
            byte[] bArr3 = parsableByteArray5.f2922a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = track.a0;
            int i16 = 4 - i15;
            while (this.V < i12) {
                int i17 = this.X;
                if (i17 == 0) {
                    int iMin = Math.min(i15, parsableByteArray.a());
                    extractorInput.readFully(bArr3, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        parsableByteArray.e(i16, iMin, bArr3);
                    }
                    this.V += i15;
                    parsableByteArray5.G(0);
                    this.X = parsableByteArray5.y();
                    ParsableByteArray parsableByteArray6 = this.g;
                    parsableByteArray6.G(0);
                    trackOutput.c(4, parsableByteArray6);
                    this.W += 4;
                } else {
                    int iA2 = parsableByteArray.a();
                    if (iA2 > 0) {
                        iB = Math.min(i17, iA2);
                        trackOutput.c(iB, parsableByteArray);
                    } else {
                        iB = trackOutput.b(extractorInput, i17, false);
                    }
                    this.V += iB;
                    this.W += iB;
                    this.X -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(track.c)) {
            ParsableByteArray parsableByteArray7 = this.j;
            parsableByteArray7.G(0);
            trackOutput.c(4, parsableByteArray7);
            this.W += 4;
        }
        int i18 = this.W;
        l();
        return i18;
    }

    public final void o(ExtractorInput extractorInput, byte[] bArr, int i) {
        int length = bArr.length + i;
        ParsableByteArray parsableByteArray = this.m;
        byte[] bArr2 = parsableByteArray.f2922a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            parsableByteArray.getClass();
            parsableByteArray.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        extractorInput.readFully(parsableByteArray.f2922a, bArr.length, i);
        parsableByteArray.G(0);
        parsableByteArray.F(length);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
