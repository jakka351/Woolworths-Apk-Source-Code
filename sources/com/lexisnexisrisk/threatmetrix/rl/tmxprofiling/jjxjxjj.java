package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingmodule.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class jjxjxjj {
    private static final String q007100710071q00710071 = lqlqqll.u00750075u00750075u(jjxjxjj.class);
    public static final boolean qqqq007100710071 = false;
    public static final String version = "7.6-46 : RL";
    public final long q00710071q007100710071;

    @Nullable
    public final String q0071q0071007100710071;
    private final AtomicLong q0071qq007100710071;

    @Nullable
    public final String qq00710071007100710071;
    private final long qq0071q007100710071;
    public final nlllnnl qqq0071007100710071;

    @Nullable
    public final String v00760076vvvv;

    @Nonnull
    public final String v0076vvvvv;

    @Nonnull
    public final String vv0076vvvv;
    public long vvv0076vvv;

    public static class GenericLocation {
        public final Float v007600760076vvv;
        public final boolean v00760076v0076vv;
        public final double v0076v0076vvv;
        public final Float v0076vv0076vv;
        public final double vv00760076vvv;
        public final boolean vv0076v0076vv;
        public final double vvvv0076vv;

        public GenericLocation(double d, double d2, double d3, Float f, Float f2, boolean z, boolean z2) {
            this.v0076v0076vvv = d;
            this.vv00760076vvv = d2;
            this.v007600760076vvv = f;
            this.vvvv0076vv = d3;
            this.v0076vv0076vv = f2;
            this.vv0076v0076vv = z;
            this.v00760076v0076vv = z2;
        }
    }

    public static class jxxjxjj {
        public final int v0076007600760076vv;
        public final int v0076v00760076vv;
        public final int vv007600760076vv;
        public final int vvv00760076vv;
        public final boolean vvvvv0076v;

        public jxxjxjj(int i, int i2, int i3, int i4, boolean z) {
            this.vvv00760076vv = i;
            this.v0076v00760076vv = i2;
            this.vv007600760076vv = i3;
            this.v0076007600760076vv = i4;
            this.vvvvv0076v = z;
        }
    }

    public jjxjxjj(nlllnnl nlllnnlVar, long j, AtomicLong atomicLong, long j2, lllqqql lllqqqlVar) {
        this.q00710071q007100710071 = j;
        this.q0071qq007100710071 = atomicLong;
        this.qqq0071007100710071 = nlllnnlVar;
        String strG00670067gg006700670067 = lqqlqqq.g00670067gg006700670067(nlllnnlVar);
        this.q0071q0071007100710071 = strG00670067gg006700670067;
        this.qq00710071007100710071 = lqqlqqq.gg0067gg006700670067(strG00670067gg006700670067);
        String strDdddd0064d = nlllnnlVar.ddddd0064d();
        strDdddd0064d = llqllqq.ggggggg0067(strDdddd0064d) ? "TrustDefenderSDK" : strDdddd0064d;
        this.vv0076vvvv = a.A("http://", strDdddd0064d);
        this.v0076vvvvv = a.h("http://", strDdddd0064d, "/mobile");
        this.v00760076vvvv = llqllqq.g0067gg0067gg0067(nnlnlnn.o006Foo006Fo006F(nlllnnlVar));
        this.qq0071q007100710071 = j2;
        this.vvv0076vvv = 0L;
        nnlllll.dd0064d006400640064().ddd0064006400640064(lllqqqlVar);
    }

    private List<String> wwww007700770077w(@Nonnull lqlllql lqlllqlVar) {
        String str = this.qqq0071007100710071.ww0077w007700770077.getApplicationInfo().nativeLibraryDir;
        String strConcat = str.concat("/lib".concat(BuildConfig.JNI_FILENAME).concat(".so"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(strConcat);
        String strHh00680068hhh = lqlllqlVar.hh00680068hhh(lllllql.pp0070p0070p0070);
        if (llqllqq.g006700670067006700670067g(strHh00680068hhh)) {
            String strConcat2 = str.concat("/lib".concat(strHh00680068hhh).concat(".so"));
            if (llqllqq.g006700670067006700670067g(strConcat2)) {
                arrayList.add(strConcat2);
            }
        }
        String strHh00680068hhh2 = lqlllqlVar.hh00680068hhh(lllllql.p00700070p0070p0070);
        if (llqllqq.g006700670067006700670067g(strHh00680068hhh2)) {
            String strConcat3 = str.concat("/lib".concat(strHh00680068hhh2).concat(".so"));
            if (llqllqq.g006700670067006700670067g(strConcat3)) {
                arrayList.add(strConcat3);
            }
        }
        return arrayList;
    }

    public String w007700770077w00770077w(Set<String> set, List<String> list, Map<String, String> map) {
        String str;
        String strH0068h00680068h0068;
        String strY0079yy0079yy = lqlllll.y0079yy0079yy(this.qqq0071007100710071);
        llqlllq llqlllqVarG0067gg0067ggg = llqlllq.g0067gg0067ggg();
        if (map == null || (str = map.get(lqlqqlq.mmmm006D006Dm)) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder("{\"cpo\":");
        sb.append(this.q00710071q007100710071);
        sb.append(",\"dyo\":");
        sb.append(this.q0071qq007100710071.longValue());
        sb.append(",\"psi\":");
        sb.append(llqlllqVarG0067gg0067ggg.g0067006700670067ggg());
        sb.append(",\"pri\":");
        sb.append(this.vvv0076vvv);
        sb.append(",\"cpi\":");
        sb.append(llqlllqVarG0067gg0067ggg.g0067g00670067ggg());
        String strP = a.p(sb, ",\"ori\":\"", str, "\"");
        if (llqlllqVarG0067gg0067ggg.g0067006700670067ggg() > 1) {
            StringBuilder sbT = a.t(strP, ",\"lsi\":\"");
            sbT.append(llqlllqVarG0067gg0067ggg.ggg00670067ggg());
            sbT.append("\",\"lps\":\"");
            sbT.append(llqlllqVarG0067gg0067ggg.g00670067g0067ggg());
            sbT.append("\",\"lpi\":");
            sbT.append(llqlllqVarG0067gg0067ggg.gg0067g0067ggg());
            strP = sbT.toString();
        }
        if ((this.q0071qq007100710071.get() & llqqqql.a0061aaaaa) != 0) {
            String strYyy0079y00790079 = lqlllll.yyy0079y00790079(this.qqq0071007100710071);
            String strYyyy007900790079 = lqlllll.yyyy007900790079();
            if (list != null) {
                strH0068h00680068h0068 = "";
                for (String str2 : list) {
                    if (!Boolean.parseBoolean(strH0068h00680068h0068)) {
                        strH0068h00680068h0068 = lllqlql.h0068hhhh0068().h0068h00680068h0068(str2);
                    }
                }
            } else {
                strH0068h00680068h0068 = "";
            }
            if (llqllqq.g006700670067006700670067g(strYyy0079y00790079)) {
                strP = b.o(strP, ",\"dbg\":", strYyy0079y00790079);
            }
            if (llqllqq.g006700670067006700670067g(strYyyy007900790079)) {
                strP = b.o(strP, ",\"jdwp\":", strYyyy007900790079);
            }
            if (llqllqq.g006700670067006700670067g(strH0068h00680068h0068)) {
                strP = b.o(strP, ",\"djni\":", strH0068h00680068h0068);
            }
        }
        if (llqllqq.g006700670067006700670067g(strY0079yy0079yy)) {
            strP = b.o(strP, ",\"adb\":", strY0079yy0079yy);
        }
        nlnnlnl.dd0064dd0064d(set);
        String strD006400640064d0064d = nlnnlnl.d006400640064d0064d();
        if (llqllqq.g006700670067006700670067g(strD006400640064d0064d)) {
            strP = b.o(strP, ",\"dper\":", strD006400640064d0064d);
        }
        StringBuilder sbT2 = a.t(strP, ",\"mif\":\"");
        long j = this.qq0071q007100710071;
        return a.g(a.o(a.t(a.o(sbT2, j > 0 ? Long.toString(j) : "", "\""), ",\"crs\":\""), llqllqq.g006700670067006700670067g(map != null ? map.get(lqqqqql.CRASH_LOG_STRING.jj006Ajj006A006A()) : "") ? "1" : "0", "\""), "}");
    }

    @Nonnull
    public nllnlll w0077ww007700770077w(@Nonnull llqlqqq llqlqqqVar, @Nonnull String str, @Nonnull String str2, @Nullable GenericLocation genericLocation, @Nullable Map<String, String> map, @Nonnull lqlllql lqlllqlVar, boolean z) throws Throwable {
        String strWww0077w00770077w;
        nnlllll.dd0064d006400640064().d0064d0064006400640064(this.q0071qq007100710071.get(), new nlnlnnl(this.qqq0071007100710071, this.q0071q0071007100710071, "", jjjxxjj.v0076v0076v0076v, llqlqqqVar, genericLocation, map, null), true);
        long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
        Map<String, String> mapD00640064d006400640064 = nnlllll.dd0064d006400640064().d00640064d006400640064(this.q0071qq007100710071.get());
        nllnlll nllnlllVar = new nllnlll();
        nllnlllVar.dd00640064d00640064(255);
        nllnlllVar.dd006400640064d0064("w", llqlqqqVar.gg0067g006700670067);
        nllnlllVar.ddddd00640064("lh", this.v0076vvvvv, true);
        nllnlllVar.ddddd00640064("dr", this.vv0076vvvv, true);
        nllnlllVar.dd006400640064d0064("hh", llqllqq.ggg0067ggg0067(str + str2));
        nllnlllVar.dd006400640064d0064("lq", this.v00760076vvvv);
        nllnlllVar.dd006400640064d0064("ani", this.q0071q0071007100710071);
        if (map != null && !map.isEmpty()) {
            nllnlllVar.d0064ddd00640064(map);
        }
        nllnlllVar.dd006400640064d0064("apd", String.valueOf(llqlllq.g0067gg0067ggg().g0067g00670067ggg()));
        nllnlllVar.d0064006400640064d0064("atr", w007700770077w00770077w(lqlllqlVar.hh0068hhhh(), wwww007700770077w(lqlllqlVar), mapD00640064d006400640064), 2048);
        if (llqlqqqVar.g00670067g0067g0067 > 0 && (strWww0077w00770077w = jjxxjjj.www0077w00770077w(llqlllq.g0067gg0067ggg().gg006700670067ggg())) != null) {
            nllnlllVar.dd006400640064d0064("mpt", strWww0077w00770077w);
        }
        if (z && (this.q0071qq007100710071.get() & llqqqql.a00610061aa0061a) != 0) {
            nllnlllVar.d0064006400640064d0064("rsp", new lqlqllq().gggg00670067gg(this.qqq0071007100710071.ww0077w007700770077, str, llqlqqqVar.t0074ttttt), -1);
        }
        nllnlll nllnlllVar2 = new nllnlll();
        nllnlllVar2.dd006400640064d0064("org_id", str);
        nllnlllVar2.dd006400640064d0064("session_id", str2);
        nllnlllVar2.dd006400640064d0064("nonce", llqlqqqVar.g00670067g006700670067);
        nllnlllVar2.dd006400640064d0064("h", "0");
        nllnlllVar2.dd006400640064d0064("m", "2");
        for (Map.Entry<String, String> entry : mapD00640064d006400640064.entrySet()) {
            if (!entry.getKey().startsWith(lqlqqlq.m006D006D006Dm006Dm)) {
                if (entry.getKey().startsWith("sid_")) {
                    nllnlllVar2.dd006400640064d0064(entry.getKey(), entry.getValue());
                } else {
                    nllnlllVar.d0064006400640064d0064(entry.getKey(), entry.getValue(), -1);
                }
            }
        }
        Map<String, String> mapUuu0075007500750075 = lqlllqlVar.uuu0075007500750075(this.q0071qq007100710071.get());
        if (mapUuu0075007500750075 != null) {
            lqqqqql lqqqqqlVar = lqqqqql.APP_HASHES;
            if (mapUuu0075007500750075.containsKey(lqqqqqlVar.jj006Ajj006A006A())) {
                nllnlllVar2.dd006400640064d0064(lqqqqqlVar.jj006Ajj006A006A(), mapUuu0075007500750075.get(lqqqqqlVar.jj006Ajj006A006A()));
            }
        }
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("pwx", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
        long jF0066fff006600662 = nnlllnn.nlnnnnl.f0066fff00660066();
        String strD0064d0064d00640064 = nllnlllVar.d0064d0064d00640064();
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("ue", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff006600662));
        long jF0066fff006600663 = nnlllnn.nlnnnnl.f0066fff00660066();
        lqlqqll.llqqqll.yy00790079007900790079(q007100710071q00710071, "encoded ja = " + nllnlllVar);
        nllnlllVar2.dd006400640064d0064("ja", llqllqq.ggg0067g0067g0067(strD0064d0064d00640064, str2));
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("pxd", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff006600663));
        return nllnlllVar2;
    }

    public void ww00770077w00770077w(String str, lqllllq lqllllqVar) throws InterruptedException {
        long jF00660066ff00660066 = nnlllnn.nlnnnnl.f00660066ff00660066();
        nnlllll.dd0064d006400640064().d0064d0064006400640064(this.q0071qq007100710071.get(), new nlnlnnl(this.qqq0071007100710071, this.q0071q0071007100710071, str, jjjxxjj.v0076v0076v0076v, null, null, null, lqllllqVar), false);
        this.vvv0076vvv = nnlllnn.nlnnnnl.f00660066ff00660066() - jF00660066ff00660066;
    }
}
