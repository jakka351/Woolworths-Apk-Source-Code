package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
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
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final /* synthetic */ int G = 0;
    public Mp4Track[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public MotionPhotoMetadata F;

    /* renamed from: a, reason: collision with root package name */
    public final SubtitleParser.Factory f3332a;
    public final int b;
    public final ParsableByteArray c;
    public final ParsableByteArray d;
    public final ParsableByteArray e;
    public final ParsableByteArray f;
    public final ArrayDeque g;
    public final SefReader h;
    public final ArrayList i;
    public ImmutableList j = ImmutableList.t();
    public int k;
    public int l;
    public long m;
    public int n;
    public ParsableByteArray o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public ExtractorOutput z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {

        /* renamed from: a, reason: collision with root package name */
        public final Track f3333a;
        public final TrackSampleTable b;
        public final TrackOutput c;
        public final TrueHdSampleRechunker d;
        public int e;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.f3333a = track;
            this.b = trackSampleTable;
            this.c = trackOutput;
            this.d = "audio/true-hd".equals(track.g.n) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i) {
        this.f3332a = factory;
        this.b = i;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new SefReader();
        this.i = new ArrayList();
        this.f = new ParsableByteArray(16);
        this.g = new ArrayDeque();
        this.c = new ParsableByteArray(NalUnitUtil.f2934a);
        this.d = new ParsableByteArray(6);
        this.e = new ParsableByteArray();
        this.p = -1;
        this.z = ExtractorOutput.j3;
        this.A = new Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                SefReader sefReader = this.h;
                sefReader.f3336a.clear();
                sefReader.b = 0;
                this.i.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.A) {
            TrackSampleTable trackSampleTable = mp4Track.b;
            int iD = Util.d(trackSampleTable.f, j2, false);
            while (true) {
                if (iD < 0) {
                    iD = -1;
                    break;
                } else if ((trackSampleTable.g[iD] & 1) != 0) {
                    break;
                } else {
                    iD--;
                }
            }
            if (iD == -1) {
                iD = trackSampleTable.a(j2);
            }
            mp4Track.e = iD;
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.d;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.b = false;
                trueHdSampleRechunker.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    @Override // androidx.media3.extractor.SeekMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.extractor.SeekMap.SeekPoints b(long r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.b(long):androidx.media3.extractor.SeekMap$SeekPoints");
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final List e() {
        return this.j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x050c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r44, androidx.media3.extractor.PositionHolder r45) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        SniffFailure sniffFailureB = Sniffer.b(extractorInput, false, (this.b & 2) != 0);
        this.j = sniffFailureB != null ? ImmutableList.w(sniffFailureB) : ImmutableList.t();
        return sniffFailureB == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        if ((this.b & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f3332a);
        }
        this.z = extractorOutput;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021f, code lost:
    
        if (r9 >= r8) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0221, code lost:
    
        r9 = r7.g() + r9;
        r13 = r7.g();
        r32 = r0;
        r0 = (r13 >> 24) & 255;
        r33 = r8;
        r34 = r11;
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023f, code lost:
    
        if (r0 == 169) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0243, code lost:
    
        if (r0 != 253) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0245, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024f, code lost:
    
        if (r13 != 1735291493) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0251, code lost:
    
        r0 = androidx.media3.extractor.metadata.id3.Id3Util.a(androidx.media3.extractor.mp4.MetadataUtil.e(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x025b, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025d, code lost:
    
        r13 = null;
        r8 = new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", null, com.google.common.collect.ImmutableList.w(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0268, code lost:
    
        r13 = null;
        androidx.media3.common.util.Log.g("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026f, code lost:
    
        r7.G(r9);
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027f, code lost:
    
        if (r13 != 1684632427) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0281, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.d(r13, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0287, code lost:
    
        r7.G(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0295, code lost:
    
        if (r13 != 1953655662) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.d(r13, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a1, code lost:
    
        if (r13 != 1953329263) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a3, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.f(r13, "TBPM", r7, r31, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b0, code lost:
    
        if (r13 != 1668311404) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.f(r13, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bd, code lost:
    
        if (r13 != 1668249202) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bf, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c7, code lost:
    
        if (r13 != 1631670868) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c9, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d3, code lost:
    
        if (r13 != 1936682605) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d5, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02df, code lost:
    
        if (r13 != 1936679276) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e1, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02eb, code lost:
    
        if (r13 != 1936679282) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ed, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f7, code lost:
    
        if (r13 != 1936679265) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f9, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0303, code lost:
    
        if (r13 != 1936679791) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0305, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0310, code lost:
    
        if (r13 != 1920233063) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0312, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.f(r13, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031e, code lost:
    
        if (r13 != 1885823344) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0320, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.f(r13, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032d, code lost:
    
        if (r13 != 1936683886) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032f, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033a, code lost:
    
        if (r13 != 1953919848) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033c, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0347, code lost:
    
        if (r13 != 757935405) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0349, code lost:
    
        r0 = null;
        r13 = null;
        r8 = -1;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x034e, code lost:
    
        r14 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0350, code lost:
    
        if (r14 >= r9) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0352, code lost:
    
        r15 = r7.g();
        r36 = r11;
        r11 = r7.g();
        r7.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0365, code lost:
    
        if (r11 != 1835360622) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0367, code lost:
    
        r13 = r7.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x036e, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0377, code lost:
    
        if (r11 != 1851878757) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0379, code lost:
    
        r0 = r7.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0383, code lost:
    
        if (r11 != 1684108385) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0385, code lost:
    
        r11 = r15;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0389, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038b, code lost:
    
        r7.H(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0391, code lost:
    
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0396, code lost:
    
        if (r13 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0398, code lost:
    
        if (r0 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039b, code lost:
    
        if (r8 != (-1)) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039e, code lost:
    
        r7.G(r8);
        r7.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b1, code lost:
    
        r13 = new androidx.media3.extractor.metadata.id3.InternalFrame(r13, r0, r7.q(r36 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03b5, code lost:
    
        r7.G(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c1, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03c8, code lost:
    
        if (r0 != 6516084) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03ca, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.b(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ce, code lost:
    
        r7.G(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03d6, code lost:
    
        if (r0 == 7233901) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03db, code lost:
    
        if (r0 != 7631467) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03e2, code lost:
    
        if (r0 == 6516589) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03e7, code lost:
    
        if (r0 != 7828084) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03ee, code lost:
    
        if (r0 != 6578553) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03f0, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03fa, code lost:
    
        if (r0 != 4280916) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03fc, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0406, code lost:
    
        if (r0 != 7630703) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0408, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0412, code lost:
    
        if (r0 != 6384738) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0414, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x041e, code lost:
    
        if (r0 != 7108978) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0420, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x042a, code lost:
    
        if (r0 != 6776174) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x042c, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0434, code lost:
    
        if (r0 != 6779504) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0436, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x043d, code lost:
    
        androidx.media3.common.util.Log.b("MetadataUtil", "Skipped unknown metadata entry: " + androidx.media3.container.Mp4Box.a(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0450, code lost:
    
        r7.G(r9);
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0456, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x045e, code lost:
    
        r13 = androidx.media3.extractor.mp4.MetadataUtil.g(r13, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0466, code lost:
    
        if (r13 == null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0468, code lost:
    
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x046b, code lost:
    
        r0 = r32;
        r8 = r33;
        r11 = r34;
        r14 = r35;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x047a, code lost:
    
        r7.G(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x047d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x047e, code lost:
    
        r32 = r0;
        r34 = r11;
        r35 = r14;
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x048d, code lost:
    
        if (r3.isEmpty() == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0492, code lost:
    
        r13 = new androidx.media3.common.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020f, code lost:
    
        r7.G(r8);
        r8 = r8 + r15;
        r7.H(8);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021d, code lost:
    
        r9 = r7.b;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0857 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r39) {
        /*
            Method dump skipped, instructions count: 2172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.m(long):void");
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
