package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class Cea708Decoder extends CeaDecoder {
    public final ParsableByteArray h = new ParsableByteArray();
    public final ParsableBitArray i = new ParsableBitArray();
    public int j = -1;
    public final int k;
    public final CueInfoBuilder[] l;
    public CueInfoBuilder m;
    public List n;
    public List o;
    public DtvCcPacket p;
    public int q;

    public static final class Cea708CueInfo {
        public static final a c = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Cue f3361a;
        public final int b;

        public Cea708CueInfo(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            Cue.Builder builder = new Cue.Builder();
            builder.f2897a = spannableStringBuilder;
            builder.c = alignment;
            builder.e = f;
            builder.f = 0;
            builder.g = i;
            builder.h = f2;
            builder.i = i2;
            builder.l = -3.4028235E38f;
            if (z) {
                builder.o = i3;
                builder.n = true;
            }
            this.f3361a = builder.a();
            this.b = i4;
        }
    }

    public static final class CueInfoBuilder {
        public static final boolean[] A;
        public static final int[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int v = c(2, 2, 2, 0);
        public static final int w;
        public static final int[] x;
        public static final int[] y;
        public static final int[] z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3362a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;

        static {
            int iC = c(0, 0, 0, 0);
            w = iC;
            int iC2 = c(0, 0, 0, 3);
            x = new int[]{0, 0, 0, 0, 0, 2, 0};
            y = new int[]{0, 0, 0, 0, 0, 0, 2};
            z = new int[]{3, 3, 3, 3, 3, 3, 1};
            A = new boolean[]{false, false, false, true, true, true, false};
            B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public CueInfoBuilder() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                androidx.media3.common.util.Assertions.c(r4, r0)
                androidx.media3.common.util.Assertions.c(r5, r0)
                androidx.media3.common.util.Assertions.c(r6, r0)
                androidx.media3.common.util.Assertions.c(r7, r0)
                r0 = 1
                r1 = 255(0xff, float:3.57E-43)
                r2 = 0
                if (r7 == 0) goto L1b
                if (r7 == r0) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r1
                goto L21
            L1d:
                r7 = r2
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r0) goto L25
                r4 = r1
                goto L26
            L25:
                r4 = r2
            L26:
                if (r5 <= r0) goto L2a
                r5 = r1
                goto L2b
            L2a:
                r5 = r2
            L2b:
                if (r6 <= r0) goto L2e
                goto L2f
            L2e:
                r1 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea708Decoder.CueInfoBuilder.c(int, int, int, int):int");
        }

        public final void a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            SpannableString spannableStringB = b();
            ArrayList arrayList = this.f3362a;
            arrayList.add(spannableStringB);
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f3362a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            int i = w;
            this.n = i;
            this.r = v;
            this.t = i;
        }

        public final void e(boolean z2, boolean z3) {
            int i = this.o;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = spannableStringBuilder.length();
            }
            if (this.p == -1) {
                if (z3) {
                    this.p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        }

        public final void f(int i, int i2) {
            int i3 = this.q;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i3 != -1 && this.r != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
            }
            if (i != v) {
                this.q = spannableStringBuilder.length();
                this.r = i;
            }
            if (this.s != -1 && this.t != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
            }
            if (i2 != w) {
                this.s = spannableStringBuilder.length();
                this.t = i2;
            }
        }
    }

    public static final class DtvCcPacket {

        /* renamed from: a, reason: collision with root package name */
        public final int f3363a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public DtvCcPacket(int i, int i2) {
            this.f3363a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public Cea708Decoder(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = CodecSpecificDataUtil.f2907a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new CueInfoBuilder[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new CueInfoBuilder();
        }
        this.m = this.l[0];
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public final void f(long j) {
        this.e = j;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final Subtitle g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final void h(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.g;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.h;
        parsableByteArray.E(iLimit, bArrArray);
        while (parsableByteArray.a() >= 3) {
            int iU = parsableByteArray.u();
            int i = iU & 3;
            boolean z = (iU & 4) == 4;
            byte bU = (byte) parsableByteArray.u();
            byte bU2 = (byte) parsableByteArray.u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bU & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            Log.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bU & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i2, i4);
                        this.p = dtvCcPacket;
                        dtvCcPacket.d = 1;
                        dtvCcPacket.c[0] = bU2;
                    } else {
                        Assertions.b(i == 2);
                        DtvCcPacket dtvCcPacket2 = this.p;
                        if (dtvCcPacket2 == null) {
                            Log.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = dtvCcPacket2.c;
                            int i5 = dtvCcPacket2.d;
                            int i6 = i5 + 1;
                            dtvCcPacket2.d = i6;
                            bArr[i5] = bU;
                            dtvCcPacket2.d = i5 + 2;
                            bArr[i6] = bU2;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.p;
                    if (dtvCcPacket3.d == (dtvCcPacket3.b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c;
        int i;
        boolean z;
        DtvCcPacket dtvCcPacket = this.p;
        if (dtvCcPacket == null) {
            return;
        }
        int i2 = 2;
        if (dtvCcPacket.d != (dtvCcPacket.b * 2) - 1) {
            Log.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.f3363a + ");");
        }
        DtvCcPacket dtvCcPacket2 = this.p;
        byte[] bArr = dtvCcPacket2.c;
        int i3 = dtvCcPacket2.d;
        ParsableBitArray parsableBitArray = this.i;
        parsableBitArray.k(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (parsableBitArray.b() > 0) {
                int i4 = 3;
                int iG = parsableBitArray.g(3);
                int iG2 = parsableBitArray.g(5);
                if (iG == 7) {
                    parsableBitArray.o(i2);
                    iG = parsableBitArray.g(6);
                    if (iG < 7) {
                        androidx.compose.ui.input.pointer.a.t(iG, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (iG2 == 0) {
                    if (iG != 0) {
                        Log.g("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                    }
                } else if (iG != this.k) {
                    parsableBitArray.p(iG2);
                } else {
                    int iE = (iG2 * 8) + parsableBitArray.e();
                    while (parsableBitArray.e() < iE) {
                        int iG3 = parsableBitArray.g(8);
                        if (iG3 != 16) {
                            if (iG3 <= 31) {
                                if (iG3 != 0) {
                                    if (iG3 == i4) {
                                        this.n = l();
                                    } else if (iG3 != 8) {
                                        switch (iG3) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iG3 < 17 || iG3 > 23) {
                                                    if (iG3 < 24 || iG3 > 31) {
                                                        androidx.compose.ui.input.pointer.a.t(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        Log.g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                        parsableBitArray.o(16);
                                                        break;
                                                    }
                                                } else {
                                                    Log.g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                    parsableBitArray.o(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (iG3 <= 127) {
                                if (iG3 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (iG3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (iG3 <= 159) {
                                    CueInfoBuilder[] cueInfoBuilderArr = this.l;
                                    switch (iG3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i5 = iG3 - 128;
                                            if (this.q != i5) {
                                                this.q = i5;
                                                this.m = cueInfoBuilderArr[i5];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (parsableBitArray.f()) {
                                                    CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[8 - i6];
                                                    cueInfoBuilder.f3362a.clear();
                                                    cueInfoBuilder.b.clear();
                                                    cueInfoBuilder.o = -1;
                                                    cueInfoBuilder.p = -1;
                                                    cueInfoBuilder.q = -1;
                                                    cueInfoBuilder.s = -1;
                                                    cueInfoBuilder.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (parsableBitArray.f()) {
                                                    cueInfoBuilderArr[8 - i7].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (parsableBitArray.f()) {
                                                    cueInfoBuilderArr[8 - i8].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (parsableBitArray.f()) {
                                                    cueInfoBuilderArr[8 - i9].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (parsableBitArray.f()) {
                                                    cueInfoBuilderArr[8 - i10].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            parsableBitArray.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            m();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (!this.m.c) {
                                                parsableBitArray.o(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                parsableBitArray.g(4);
                                                parsableBitArray.g(i11);
                                                parsableBitArray.g(i11);
                                                boolean zF = parsableBitArray.f();
                                                boolean zF2 = parsableBitArray.f();
                                                i4 = 3;
                                                parsableBitArray.g(3);
                                                parsableBitArray.g(3);
                                                this.m.e(zF, zF2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int iC = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                                int iC2 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                                parsableBitArray.o(2);
                                                CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                parsableBitArray.o(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                parsableBitArray.o(4);
                                                int iG4 = parsableBitArray.g(4);
                                                parsableBitArray.o(2);
                                                parsableBitArray.g(6);
                                                CueInfoBuilder cueInfoBuilder2 = this.m;
                                                if (cueInfoBuilder2.u != iG4) {
                                                    cueInfoBuilder2.a('\n');
                                                }
                                                cueInfoBuilder2.u = iG4;
                                            } else {
                                                parsableBitArray.o(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            androidx.compose.ui.input.pointer.a.t(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                                parsableBitArray.g(2);
                                                CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                                parsableBitArray.f();
                                                parsableBitArray.f();
                                                parsableBitArray.g(2);
                                                parsableBitArray.g(2);
                                                int iG5 = parsableBitArray.g(2);
                                                parsableBitArray.o(8);
                                                CueInfoBuilder cueInfoBuilder3 = this.m;
                                                cueInfoBuilder3.n = iC3;
                                                cueInfoBuilder3.k = iG5;
                                            } else {
                                                parsableBitArray.o(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = iG3 - 152;
                                            CueInfoBuilder cueInfoBuilder4 = cueInfoBuilderArr[i12];
                                            parsableBitArray.o(i2);
                                            boolean zF3 = parsableBitArray.f();
                                            parsableBitArray.o(i2);
                                            int iG6 = parsableBitArray.g(i4);
                                            boolean zF4 = parsableBitArray.f();
                                            int iG7 = parsableBitArray.g(7);
                                            int iG8 = parsableBitArray.g(8);
                                            int iG9 = parsableBitArray.g(4);
                                            int iG10 = parsableBitArray.g(4);
                                            parsableBitArray.o(i2);
                                            parsableBitArray.o(6);
                                            parsableBitArray.o(i2);
                                            int iG11 = parsableBitArray.g(3);
                                            int iG12 = parsableBitArray.g(3);
                                            ArrayList arrayList = cueInfoBuilder4.f3362a;
                                            cueInfoBuilder4.c = true;
                                            cueInfoBuilder4.d = zF3;
                                            cueInfoBuilder4.e = iG6;
                                            cueInfoBuilder4.f = zF4;
                                            cueInfoBuilder4.g = iG7;
                                            cueInfoBuilder4.h = iG8;
                                            cueInfoBuilder4.i = iG9;
                                            int i13 = iG10 + 1;
                                            if (cueInfoBuilder4.j != i13) {
                                                cueInfoBuilder4.j = i13;
                                                while (true) {
                                                    if (arrayList.size() >= cueInfoBuilder4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iG11 != 0 && cueInfoBuilder4.l != iG11) {
                                                cueInfoBuilder4.l = iG11;
                                                int i14 = iG11 - 1;
                                                int i15 = CueInfoBuilder.B[i14];
                                                boolean z3 = CueInfoBuilder.A[i14];
                                                int i16 = CueInfoBuilder.y[i14];
                                                int i17 = CueInfoBuilder.z[i14];
                                                int i18 = CueInfoBuilder.x[i14];
                                                cueInfoBuilder4.n = i15;
                                                cueInfoBuilder4.k = i18;
                                            }
                                            if (iG12 != 0 && cueInfoBuilder4.m != iG12) {
                                                cueInfoBuilder4.m = iG12;
                                                int i19 = iG12 - 1;
                                                int i20 = CueInfoBuilder.D[i19];
                                                int i21 = CueInfoBuilder.C[i19];
                                                cueInfoBuilder4.e(false, false);
                                                cueInfoBuilder4.f(CueInfoBuilder.v, CueInfoBuilder.E[i19]);
                                            }
                                            if (this.q != i12) {
                                                this.q = i12;
                                                this.m = cueInfoBuilderArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (iG3 <= 255) {
                                        this.m.a((char) (iG3 & 255));
                                    } else {
                                        androidx.compose.ui.input.pointer.a.t(iG3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int iG13 = parsableBitArray.g(8);
                            if (iG13 <= 31) {
                                c = 7;
                                if (iG13 > 7) {
                                    if (iG13 <= 15) {
                                        parsableBitArray.o(8);
                                    } else if (iG13 <= 23) {
                                        parsableBitArray.o(16);
                                    } else if (iG13 <= 31) {
                                        parsableBitArray.o(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (iG13 <= 127) {
                                    if (iG13 == 32) {
                                        this.m.a(' ');
                                    } else if (iG13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (iG13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (iG13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (iG13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (iG13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (iG13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (iG13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (iG13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (iG13 != 61) {
                                        switch (iG13) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (iG13) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        androidx.compose.ui.input.pointer.a.t(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (iG13 > 159) {
                                    i = 2;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            androidx.compose.ui.input.pointer.a.t(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        androidx.compose.ui.input.pointer.a.t(iG13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (iG13 <= 135) {
                                    parsableBitArray.o(32);
                                } else if (iG13 <= 143) {
                                    parsableBitArray.o(40);
                                } else if (iG13 <= 159) {
                                    i = 2;
                                    parsableBitArray.o(2);
                                    parsableBitArray.o(parsableBitArray.g(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea708Decoder.l():java.util.List");
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final /* bridge */ /* synthetic */ void release() {
    }
}
