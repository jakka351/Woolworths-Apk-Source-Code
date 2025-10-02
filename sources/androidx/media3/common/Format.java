package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.android.gms.ads.AdError;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.core.source.CameraSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class Format {
    public static final /* synthetic */ int O = 0;
    public final int A;
    public final ColorInfo B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;

    /* renamed from: a, reason: collision with root package name */
    public final String f2854a;
    public final String b;
    public final ImmutableList c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Metadata l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final int x;
    public final float y;
    public final byte[] z;

    @UnstableApi
    public static final class Builder {
        public ColorInfo A;
        public int F;
        public int G;

        /* renamed from: a, reason: collision with root package name */
        public String f2855a;
        public String b;
        public String d;
        public int e;
        public int f;
        public String j;
        public Metadata k;
        public String l;
        public String m;
        public List p;
        public DrmInitData q;
        public boolean s;
        public int w;
        public byte[] y;
        public ImmutableList c = ImmutableList.t();
        public int h = -1;
        public int i = -1;
        public int n = -1;
        public int o = -1;
        public long r = Long.MAX_VALUE;
        public int t = -1;
        public int u = -1;
        public float v = -1.0f;
        public float x = 1.0f;
        public int z = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int H = -1;
        public int I = 1;
        public int J = -1;
        public int K = -1;
        public int L = 0;
        public int g = 0;

        public final Format a() {
            return new Format(this);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface CueReplacementBehavior {
    }

    static {
        new Builder().a();
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
        androidx.compose.ui.input.pointer.a.r(5, 6, 7, 8, 9);
        androidx.compose.ui.input.pointer.a.r(10, 11, 12, 13, 14);
        androidx.compose.ui.input.pointer.a.r(15, 16, 17, 18, 19);
        androidx.compose.ui.input.pointer.a.r(20, 21, 22, 23, 24);
        androidx.compose.ui.input.pointer.a.r(25, 26, 27, 28, 29);
        androidx.compose.ui.input.pointer.a.r(30, 31, 32, 33, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Format(Builder builder) throws MissingResourceException {
        boolean z;
        String str;
        this.f2854a = builder.f2855a;
        String strJ = Util.J(builder.d);
        this.d = strJ;
        if (builder.c.isEmpty() && builder.b != null) {
            this.c = ImmutableList.w(new Label(strJ, builder.b));
            this.b = builder.b;
        } else if (!builder.c.isEmpty() && builder.b == null) {
            ImmutableList immutableList = builder.c;
            this.c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((Label) immutableList.get(0)).b;
                    break;
                }
                Label label = (Label) it.next();
                if (TextUtils.equals(label.f2856a, strJ)) {
                    str = label.b;
                    break;
                }
            }
            this.b = str;
        } else if (builder.c.isEmpty() && builder.b == null) {
            z = true;
            Assertions.f(z);
            this.c = builder.c;
            this.b = builder.b;
        } else {
            for (int i = 0; i < builder.c.size(); i++) {
                if (((Label) builder.c.get(i)).b.equals(builder.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            Assertions.f(z);
            this.c = builder.c;
            this.b = builder.b;
        }
        this.e = builder.e;
        Assertions.e("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", builder.g == 0 || (builder.f & 32768) != 0);
        this.f = builder.f;
        this.g = builder.g;
        int i2 = builder.h;
        this.h = i2;
        int i3 = builder.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = builder.j;
        this.l = builder.k;
        this.m = builder.l;
        this.n = builder.m;
        this.o = builder.n;
        this.p = builder.o;
        List list = builder.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = builder.q;
        this.r = drmInitData;
        this.s = builder.r;
        this.t = builder.s;
        this.u = builder.t;
        this.v = builder.u;
        this.w = builder.v;
        int i4 = builder.w;
        this.x = i4 == -1 ? 0 : i4;
        float f = builder.x;
        this.y = f == -1.0f ? 1.0f : f;
        this.z = builder.y;
        this.A = builder.z;
        this.B = builder.A;
        this.C = builder.B;
        this.D = builder.C;
        this.E = builder.D;
        this.F = builder.E;
        int i5 = builder.F;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = builder.G;
        this.H = i6 != -1 ? i6 : 0;
        this.I = builder.H;
        this.J = builder.I;
        this.K = builder.J;
        this.L = builder.K;
        int i7 = builder.L;
        if (i7 != 0 || drmInitData == null) {
            this.M = i7;
        } else {
            this.M = 1;
        }
    }

    public static String c(Format format) {
        int i;
        String str;
        String strJ;
        String str2;
        DrmInitData drmInitData;
        if (format == null) {
            return "null";
        }
        int i2 = format.e;
        ImmutableList immutableList = format.c;
        String str3 = format.d;
        int i3 = format.E;
        int i4 = format.D;
        int i5 = format.C;
        float f = format.w;
        ColorInfo colorInfo = format.B;
        float f2 = format.y;
        int i6 = format.v;
        int i7 = format.u;
        DrmInitData drmInitData2 = format.r;
        String str4 = format.k;
        int i8 = format.j;
        String str5 = format.m;
        int i9 = format.f;
        Joiner joiner = new Joiner(String.valueOf(','));
        StringBuilder sbS = YU.a.s("id=");
        sbS.append(format.f2854a);
        sbS.append(", mimeType=");
        sbS.append(format.n);
        if (str5 != null) {
            sbS.append(", container=");
            sbS.append(str5);
        }
        int i10 = -1;
        if (i8 != -1) {
            sbS.append(", bitrate=");
            sbS.append(i8);
        }
        if (str4 != null) {
            sbS.append(", codecs=");
            sbS.append(str4);
        }
        if (drmInitData2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < drmInitData2.g) {
                UUID uuid = drmInitData2.d[i11].e;
                if (uuid.equals(C.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.f2848a)) {
                    linkedHashSet.add("universal");
                } else {
                    drmInitData = drmInitData2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i11++;
                    drmInitData2 = drmInitData;
                }
                drmInitData = drmInitData2;
                i11++;
                drmInitData2 = drmInitData;
            }
            sbS.append(", drm=[");
            joiner.b(sbS, linkedHashSet.iterator());
            sbS.append(']');
            i10 = -1;
        }
        if (i7 != i10 && i6 != i10) {
            androidx.constraintlayout.core.state.a.t(i7, i6, ", res=", "x", sbS);
        }
        double d = f2;
        int i12 = DoubleMath.f14931a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbS.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i13 = Util.f2928a;
            sbS.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (colorInfo != null) {
            int i14 = colorInfo.f;
            int i15 = colorInfo.e;
            if ((i15 != -1 && i14 != -1) || colorInfo.d()) {
                sbS.append(", color=");
                if (colorInfo.d()) {
                    String strB = ColorInfo.b(colorInfo.f2849a);
                    String strA = ColorInfo.a(colorInfo.b);
                    String strC = ColorInfo.c(colorInfo.c);
                    Locale locale = Locale.US;
                    strJ = androidx.constraintlayout.core.state.a.j(strB, q2.c, strA, q2.c, strC);
                } else {
                    strJ = "NA/NA/NA";
                }
                if (i15 == -1 || i14 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i15 + q2.c + i14;
                }
                sbS.append(strJ + q2.c + str2);
            }
        }
        if (f != -1.0f) {
            sbS.append(", fps=");
            sbS.append(f);
        }
        if (i5 != -1) {
            sbS.append(", maxSubLayers=");
            sbS.append(i5);
        }
        if (i4 != -1) {
            sbS.append(", channels=");
            sbS.append(i4);
        }
        if (i3 != -1) {
            sbS.append(", sample_rate=");
            sbS.append(i3);
        }
        if (str3 != null) {
            sbS.append(", language=");
            sbS.append(str3);
        }
        if (!immutableList.isEmpty()) {
            sbS.append(", labels=[");
            joiner.b(sbS, Lists.d(immutableList, new androidx.camera.core.internal.a(7)).iterator());
            sbS.append("]");
        }
        if (i2 != 0) {
            sbS.append(", selectionFlags=[");
            int i16 = Util.f2928a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add(CameraSettings.FOCUS_STRATEGY_AUTO);
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            joiner.b(sbS, arrayList.iterator());
            sbS.append("]");
        }
        if (i9 != 0) {
            sbS.append(", roleFlags=[");
            int i17 = Util.f2928a;
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i9;
            if ((i & 128) != 0) {
                arrayList2.add(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            joiner.b(sbS, arrayList2.iterator());
            sbS.append("]");
        } else {
            i = i9;
        }
        if ((i & 32768) != 0) {
            sbS.append(", auxiliaryTrackType=");
            int i18 = format.g;
            int i19 = Util.f2928a;
            if (i18 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i18 == 1) {
                str = "original";
            } else if (i18 == 2) {
                str = "depth-linear";
            } else if (i18 == 3) {
                str = "depth-inverse";
            } else {
                if (i18 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbS.append(str);
        }
        return sbS.toString();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f2855a = this.f2854a;
        builder.b = this.b;
        builder.c = this.c;
        builder.d = this.d;
        builder.e = this.e;
        builder.f = this.f;
        builder.h = this.h;
        builder.i = this.i;
        builder.j = this.k;
        builder.k = this.l;
        builder.l = this.m;
        builder.m = this.n;
        builder.n = this.o;
        builder.o = this.p;
        builder.p = this.q;
        builder.q = this.r;
        builder.r = this.s;
        builder.s = this.t;
        builder.t = this.u;
        builder.u = this.v;
        builder.v = this.w;
        builder.w = this.x;
        builder.x = this.y;
        builder.y = this.z;
        builder.z = this.A;
        builder.A = this.B;
        builder.B = this.C;
        builder.C = this.D;
        builder.D = this.E;
        builder.E = this.F;
        builder.F = this.G;
        builder.G = this.H;
        builder.H = this.I;
        builder.I = this.J;
        builder.J = this.K;
        builder.K = this.L;
        builder.L = this.M;
        return builder;
    }

    public final boolean b(Format format) {
        List list = this.q;
        if (list.size() != format.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) format.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.N;
        return (i2 == 0 || (i = format.N) == 0 || i2 == i) && this.e == format.e && this.f == format.f && this.g == format.g && this.h == format.h && this.i == format.i && this.o == format.o && this.s == format.s && this.u == format.u && this.v == format.v && this.x == format.x && this.A == format.A && this.C == format.C && this.D == format.D && this.E == format.E && this.F == format.F && this.G == format.G && this.H == format.H && this.I == format.I && this.K == format.K && this.L == format.L && this.M == format.M && Float.compare(this.w, format.w) == 0 && Float.compare(this.y, format.y) == 0 && Objects.equals(this.f2854a, format.f2854a) && Objects.equals(this.b, format.b) && this.c.equals(format.c) && Objects.equals(this.k, format.k) && Objects.equals(this.m, format.m) && Objects.equals(this.n, format.n) && Objects.equals(this.d, format.d) && Arrays.equals(this.z, format.z) && Objects.equals(this.l, format.l) && Objects.equals(this.B, format.B) && Objects.equals(this.r, format.r) && b(format);
    }

    public final int hashCode() {
        if (this.N == 0) {
            String str = this.f2854a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.l;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.N = ((((((((((((((((((((androidx.compose.ui.input.pointer.a.a(this.y, (androidx.compose.ui.input.pointer.a.a(this.w, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31, 31) + this.x) * 31, 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.K) * 31) + this.L) * 31) + this.M;
        }
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f2854a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.B);
        sb.append("], [");
        sb.append(this.D);
        sb.append(", ");
        return YU.a.m(sb, this.E, "])");
    }
}
