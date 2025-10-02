package androidx.media3.extractor.mp4;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public class FragmentedMp4Extractor implements Extractor {
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public ExtractorOutput F;
    public TrackOutput[] G;
    public TrackOutput[] H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public final SubtitleParser.Factory f3328a;
    public final int b;
    public final List c;
    public final SparseArray d;
    public final ParsableByteArray e;
    public final ParsableByteArray f;
    public final ParsableByteArray g;
    public final byte[] h;
    public final ParsableByteArray i;
    public final EventMessageEncoder j;
    public final ParsableByteArray k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final ReorderingSeiMessageQueue n;
    public ImmutableList o;
    public int p;
    public int q;
    public long r;
    public int s;
    public ParsableByteArray t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public TrackBundle z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class MetadataSampleInfo {

        /* renamed from: a, reason: collision with root package name */
        public final long f3329a;
        public final boolean b;
        public final int c;

        public MetadataSampleInfo(long j, boolean z, int i) {
            this.f3329a = j;
            this.b = z;
            this.c = i;
        }
    }

    public static final class TrackBundle {

        /* renamed from: a, reason: collision with root package name */
        public final TrackOutput f3330a;
        public TrackSampleTable d;
        public DefaultSampleValues e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final String j;
        public boolean m;
        public final TrackFragment b = new TrackFragment();
        public final ParsableByteArray c = new ParsableByteArray();
        public final ParsableByteArray k = new ParsableByteArray(1);
        public final ParsableByteArray l = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues, String str) {
            this.f3330a = trackOutput;
            this.d = trackSampleTable;
            this.e = defaultSampleValues;
            this.j = str;
            e(trackSampleTable, defaultSampleValues);
        }

        public final int a() {
            int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
            return b() != null ? i | 1073741824 : i;
        }

        public final TrackEncryptionBox b() {
            if (!this.m) {
                return null;
            }
            TrackFragment trackFragment = this.b;
            DefaultSampleValues defaultSampleValues = trackFragment.f3341a;
            int i = Util.f2928a;
            int i2 = defaultSampleValues.f3327a;
            TrackEncryptionBox trackEncryptionBox = trackFragment.m;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.d.f3342a.l[i2];
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.f3340a) {
                return null;
            }
            return trackEncryptionBox;
        }

        public final boolean c() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int d(int i, int i2) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox trackEncryptionBoxB = b();
            if (trackEncryptionBoxB == null) {
                return 0;
            }
            int length = trackEncryptionBoxB.d;
            TrackFragment trackFragment = this.b;
            if (length != 0) {
                parsableByteArray = trackFragment.n;
            } else {
                byte[] bArr = trackEncryptionBoxB.e;
                int i3 = Util.f2928a;
                int length2 = bArr.length;
                ParsableByteArray parsableByteArray2 = this.l;
                parsableByteArray2.E(length2, bArr);
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z = trackFragment.k && trackFragment.l[this.f];
            boolean z2 = z || i2 != 0;
            ParsableByteArray parsableByteArray3 = this.k;
            parsableByteArray3.f2922a[0] = (byte) ((z2 ? 128 : 0) | length);
            parsableByteArray3.G(0);
            TrackOutput trackOutput = this.f3330a;
            trackOutput.a(parsableByteArray3, 1, 1);
            trackOutput.a(parsableByteArray, length, 1);
            if (!z2) {
                return length + 1;
            }
            ParsableByteArray parsableByteArray4 = this.c;
            if (!z) {
                parsableByteArray4.D(8);
                byte[] bArr2 = parsableByteArray4.f2922a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                trackOutput.a(parsableByteArray4, 8, 1);
                return length + 9;
            }
            ParsableByteArray parsableByteArray5 = trackFragment.n;
            int iA = parsableByteArray5.A();
            parsableByteArray5.H(-2);
            int i4 = (iA * 6) + 2;
            if (i2 != 0) {
                parsableByteArray4.D(i4);
                byte[] bArr3 = parsableByteArray4.f2922a;
                parsableByteArray5.e(0, i4, bArr3);
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            } else {
                parsableByteArray4 = parsableByteArray5;
            }
            trackOutput.a(parsableByteArray4, i4, 1);
            return length + 1 + i4;
        }

        public final void e(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.d = trackSampleTable;
            this.e = defaultSampleValues;
            Format.Builder builderA = trackSampleTable.f3342a.g.a();
            builderA.l = MimeTypes.m(this.j);
            this.f3330a.e(new Format(builderA));
            f();
        }

        public final void f() {
            TrackFragment trackFragment = this.b;
            trackFragment.d = 0;
            trackFragment.p = 0L;
            trackFragment.q = false;
            trackFragment.k = false;
            trackFragment.o = false;
            trackFragment.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.m = MimeTypes.m("application/x-emsg");
        K = new Format(builder);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i) {
        ImmutableList immutableListT = ImmutableList.t();
        this.f3328a = factory;
        this.b = i;
        this.c = Collections.unmodifiableList(immutableListT);
        this.j = new EventMessageEncoder();
        this.k = new ParsableByteArray(16);
        this.e = new ParsableByteArray(NalUnitUtil.f2934a);
        this.f = new ParsableByteArray(6);
        this.g = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new ParsableByteArray(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.o = ImmutableList.t();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.F = ExtractorOutput.j3;
        this.G = new TrackOutput[0];
        this.H = new TrackOutput[0];
        this.n = new ReorderingSeiMessageQueue(new a(this));
    }

    public static DrmInitData b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Mp4Box.LeafBox leafBox = (Mp4Box.LeafBox) list.get(i);
            if (leafBox.f2931a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafBox.b.f2922a;
                PsshAtomUtil.PsshAtom psshAtomB = PsshAtomUtil.b(bArr);
                UUID uuid = psshAtomB == null ? null : psshAtomB.f3335a;
                if (uuid == null) {
                    Log.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void d(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.G(i + 8);
        int iG = parsableByteArray.g();
        byte[] bArr = BoxParser.f3315a;
        if ((iG & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iG & 2) != 0;
        int iY = parsableByteArray.y();
        if (iY == 0) {
            Arrays.fill(trackFragment.l, 0, trackFragment.e, false);
            return;
        }
        int i2 = trackFragment.e;
        ParsableByteArray parsableByteArray2 = trackFragment.n;
        if (iY != i2) {
            StringBuilder sbR = YU.a.r(iY, "Senc sample count ", " is different from fragment sample count");
            sbR.append(trackFragment.e);
            throw ParserException.a(null, sbR.toString());
        }
        Arrays.fill(trackFragment.l, 0, iY, z);
        parsableByteArray2.D(parsableByteArray.a());
        trackFragment.k = true;
        trackFragment.o = true;
        parsableByteArray.e(0, parsableByteArray2.c, parsableByteArray2.f2922a);
        parsableByteArray2.G(0);
        trackFragment.o = false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((TrackBundle) sparseArray.valueAt(i)).f();
        }
        this.m.clear();
        this.v = 0;
        this.n.d.clear();
        this.w = j2;
        this.l.clear();
        this.p = 0;
        this.s = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final List e() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d8, code lost:
    
        if (r33.D != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01da, code lost:
    
        r2 = androidx.media3.container.NalUnitUtil.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
    
        if ((r12 + r2) > (r33.A - r33.B)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ec, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ef, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f0, code lost:
    
        r0.readFully(r10, r5, r12 + r2);
        r15.G(0);
        r18 = r15.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fd, code lost:
    
        if (r18 < 0) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ff, code lost:
    
        r33.C = r18 - r2;
        r13 = r33.e;
        r18 = r5;
        r13.G(0);
        r11.c(4, r13);
        r33.B += 4;
        r33.A += r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021d, code lost:
    
        if (r33.H.length <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021f, code lost:
    
        if (r2 <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0221, code lost:
    
        r13 = r10[4];
        r5 = r9.n;
        r21 = r12;
        r12 = r9.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022d, code lost:
    
        if (java.util.Objects.equals(r5, r8) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0233, code lost:
    
        if (androidx.media3.common.MimeTypes.b(r12, r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023a, code lost:
    
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023f, code lost:
    
        if ((r13 & 31) == 6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0247, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/hevc") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        if (androidx.media3.common.MimeTypes.b(r12, "video/hevc") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0257, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0259, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        r23 = r8;
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0260, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0261, code lost:
    
        r33.E = r5;
        r11.c(r2, r15);
        r33.B += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026b, code lost:
    
        if (r2 <= 0) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026f, code lost:
    
        if (r33.D != false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0275, code lost:
    
        if (androidx.media3.container.NalUnitUtil.c(r10, r2, r9) == false) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0277, code lost:
    
        r33.D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027a, code lost:
    
        r2 = r17;
        r5 = r18;
        r12 = r21;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028b, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028c, code lost:
    
        r18 = r5;
        r23 = r8;
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0295, code lost:
    
        if (r33.E == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0297, code lost:
    
        r5 = r33.g;
        r5.D(r2);
        r0.readFully(r5.f2922a, 0, r33.C);
        r11.c(r33.C, r5);
        r2 = r33.C;
        r8 = androidx.media3.container.NalUnitUtil.l(r5.c, r5.f2922a);
        r5.G(0);
        r5.F(r8);
        r8 = r9.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02bc, code lost:
    
        if (r8 != (-1)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c0, code lost:
    
        if (r7.e == 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c2, code lost:
    
        r7.e = 0;
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ca, code lost:
    
        if (r7.e == r8) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cc, code lost:
    
        if (r8 < 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ce, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d0, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d1, code lost:
    
        androidx.media3.common.util.Assertions.f(r12);
        r7.e = r8;
        r7.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d9, code lost:
    
        r7.a(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e5, code lost:
    
        if ((r17.a() & 4) == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e7, code lost:
    
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02eb, code lost:
    
        r2 = r11.b(r0, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f0, code lost:
    
        r33.B += r2;
        r33.C -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fc, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fe, code lost:
    
        r2 = r33.B;
        r5 = r33.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0302, code lost:
    
        if (r2 >= r5) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0304, code lost:
    
        r33.B += r11.b(r0, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0310, code lost:
    
        r0 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0316, code lost:
    
        if (r33.D != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0318, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x031b, code lost:
    
        r26 = r0;
        r0 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0321, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0323, code lost:
    
        r29 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0328, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032a, code lost:
    
        r24 = r3;
        r11.g(r24, r26, r33.A, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033b, code lost:
    
        if (r14.isEmpty() != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033d, code lost:
    
        r0 = (androidx.media3.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo) r14.removeFirst();
        r33.v -= r0.c;
        r2 = r0.f3329a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034e, code lost:
    
        if (r0.b == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0350, code lost:
    
        r2 = r2 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0352, code lost:
    
        r5 = r2;
        r2 = r33.G;
        r3 = r2.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0357, code lost:
    
        if (r11 >= r3) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0359, code lost:
    
        r2[r11].g(r5, 1, r0.c, r33.v, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036b, code lost:
    
        if (r17.c() != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036d, code lost:
    
        r33.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0370, code lost:
    
        r33.p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0375, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r3 = r2.b;
        r8 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (r33.p != 3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r2.m != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r4 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        r4 = r3.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r33.A = r4;
        r4 = r2.d.f3342a.g;
        r9 = java.util.Objects.equals(r4.n, "video/avc");
        r11 = r33.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        if ((r11 & 64) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        if (java.util.Objects.equals(r4.n, "video/hevc") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if ((r11 & 128) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0107, code lost:
    
        r33.D = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        if (r2.f >= r2.i) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r0.l(r33.A);
        r0 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
    
        if (r0 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        r4 = r3.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
    
        if (r0 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        r4.H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        if (r3.k == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0130, code lost:
    
        if (r3.l[r0] == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        r4.H(r4.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013e, code lost:
    
        if (r2.c() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0140, code lost:
    
        r33.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0142, code lost:
    
        r33.p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0145, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        if (r2.d.f3342a.h != r22) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        r33.A -= 8;
        r0.l(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0169, code lost:
    
        if ("audio/ac4".equals(r2.d.f3342a.g.n) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
    
        r33.B = r2.d(r33.A, 7);
        r4 = r33.A;
        r11 = r33.i;
        androidx.media3.extractor.Ac4Util.a(r4, r11);
        r2.f3330a.c(7, r11);
        r33.B += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
    
        r33.B = r2.d(r33.A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        r33.A += r33.B;
        r33.p = 4;
        r33.C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019a, code lost:
    
        r4 = r2.d;
        r9 = r4.f3342a;
        r11 = r2.f3330a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        if (r2.m != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        r3 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        r3 = r3.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b1, code lost:
    
        r12 = r9.k;
        r9 = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (r12 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
    
        r15 = r33.f;
        r10 = r15.f2922a;
        r10[0] = 0;
        r10[1] = 0;
        r10[r18] = 0;
        r5 = 4 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c5, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cb, code lost:
    
        if (r33.B >= r33.A) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        r2 = r33.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
    
        if (r2 != 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        if (r33.H.length > 0) goto L101;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r34, androidx.media3.extractor.PositionHolder r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:0x074d, code lost:
    
        r51.p = 0;
        r51.s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0752, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x065e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r52) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.g(long):void");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        SniffFailure sniffFailureB = Sniffer.b(extractorInput, true, false);
        this.o = sniffFailureB != null ? ImmutableList.w(sniffFailureB) : ImmutableList.t();
        return sniffFailureB == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f3328a);
        }
        this.F = extractorOutput;
        int i3 = 0;
        this.p = 0;
        this.s = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.G = trackOutputArr;
        int i4 = 100;
        if ((i2 & 4) != 0) {
            trackOutputArr[0] = extractorOutput.j(100, 5);
            i = 1;
            i4 = 101;
        } else {
            i = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.K(i, this.G);
        this.G = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.e(K);
        }
        List list = this.c;
        this.H = new TrackOutput[list.size()];
        while (i3 < this.H.length) {
            TrackOutput trackOutputJ = this.F.j(i4, 3);
            trackOutputJ.e((Format) list.get(i3));
            this.H[i3] = trackOutputJ;
            i3++;
            i4++;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
