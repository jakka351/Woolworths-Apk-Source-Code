package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.media.MediaDrm;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Base64;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class lqlllll {
    private static final String kk006B006B006Bk006B = jxxjjxx.ss0073sss0073s("\u0003|~", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354529), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701660)));
    public static final String k006B006B006B006Bk006B = jxxjjxx.sss0073ss0073s("CJISZFUXLTXR", (char) (jxjxxjx.s0073sss0073ss() ^ 513829334), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354669), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950882));
    private static final String kkkkk006B006B = jxxjjxx.ss0073sss0073s("+@G;4H\u001e7SRFV(K;C3-\u0018\n\u000e#\u0015", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354524), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277));
    private static final String k006Bkkk006B006B = jxxjjxx.ss0073sss0073s("\"?0<pB44:7(a0:(4QEIA\u0001PDPB=FEBGEu", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354625), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277));
    private static final String k006Bk006B006Bk006B = lqlqqll.u00750075u00750075u(lqlllll.class);

    @Nullable
    private static final Method kk006Bkk006B006B = jjxjxjx.w0077w00770077007700770077(jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SYSTEM_PROPERTIES), jxxjjxx.sss0073ss0073s("MJX", (char) (jxjxxjx.s0073sss0073ss() ^ 513829256), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354547), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568)), String.class);

    public enum lllqlll {
        CDMA("CDMA", 3),
        GSM("GSM", 1),
        LTE("LTE", 0),
        UNKOWN("OTHER", 99),
        WCDMA("UMTS", 2);

        private final String p0070p0070ppp;
        private final int pp00700070ppp;

        lllqlll(String str, int i) {
            this.p0070p0070ppp = str;
            this.pp00700070ppp = i;
        }

        public static lllqlll valueOf(String str) {
            return (lllqlll) nlnnnnn.ooo006F006Foo(lllqlll.class, str);
        }

        public String getLabel() {
            return this.p0070p0070ppp;
        }

        public int getPriority() {
            return this.pp00700070ppp;
        }
    }

    public static class llqqlll {
        public int pppp0070pp = 0;
        public int p0070pp0070pp = 0;
    }

    public static class lqlqlll {
        private lqlqlll() {
        }

        public static lqlqqlq.llqqqlq dd00640064006400640064(String str) {
            if (llqllqq.ggggggg0067(str)) {
                return lqlqqlq.llqqqlq.COULD_NOT_CHECK;
            }
            try {
                return lqlqqlq.llqqqlq.valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return lqlqqlq.llqqqlq.COULD_NOT_CHECK;
            }
        }

        public static String y0079yyyyy(lqlqqlq.llqqqlq llqqqlqVar) throws JSONException {
            if (llqqqlqVar == null) {
                return lqlqqlq.m006Dmm006D006Dm;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(lqlqqlq.mmm006Dm006Dm, llqqqlqVar.m006D006Dm006D006Dm);
                if (llqqqlqVar.mmm006D006D006Dm) {
                    jSONObject.put(lqlqqlq.m006Dm006Dm006Dm, lqlqqlq.mm006D006Dm006Dm);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                lqlqqll.llqqqll.uuu0075uuu(lqlllll.k006Bk006B006Bk006B, "JSON creation failure " + e.toString());
                return lqlqqlq.mm006Dm006D006Dm;
            }
        }

        public static String yy0079yyyy(String str) {
            return y0079yyyyy(dd00640064006400640064(str));
        }
    }

    public static class lqqllll {
        public static final String k006B006B006Bk006B006B = "nc_iso";
        public static final String k006B006Bk006B006B006B = "cid";
        public static final int k006B006Bkk006B006B = 3;
        public static final String k006Bk006B006B006B006B = "psc";
        public static final String k006Bk006Bk006B006B = "no";
        public static final String k006Bkk006B006B006B = "sl_ASU";
        public static final String kk006B006B006B006B006B = "cii";
        public static final String kk006B006Bk006B006B = "non";
        public static final String kk006Bk006B006B006B = "sl_int";
        public static final String kkk006B006B006B006B = "lac";
        public static final int kkk006Bk006B006B = 99;
        public static final String kkkk006B006B006B = "ss_dBm";
        public static final String p00700070pppp = "sid";
        public static final String p0070ppppp = "bs_lat";
        public static final String pp0070pppp = "bs_lng";
        public static final String ppp0070ppp = "bsid";

        private lqqllll() {
        }
    }

    public static long y00790079007900790079y(String str) {
        if (llqllqq.ggggggg0067(str)) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("yYQ\u001b{;`\u001aw=\u0016e7a\u001e}cl|\u0014h\u0006a/ay\u00108a)\u001dD\u001f\u0004S\u0012?^\u001e", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701667)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701656))));
            return 0L;
        }
        long jHhh006800680068h = lllqlql.h0068hhhh0068().h00680068h0068h0068() ? lllqlql.h0068hhhh0068().hhh006800680068h(str, true) : yy0079007900790079y(str);
        lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("p\u0006\u0004?\u0015\u000b\u0010\t\u0018\u001a\b\u0015\u0019I\u001a\u0012L\"\u0017\u0015P\u0018\u001c \u001aU", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354504), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950978), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950882)) + str + jxxjjxx.sss0073ss0073s("\u001a8}\u0002\u001a^\u001d\u0002}A", (char) (jxjxxjx.s0073sss0073ss() ^ 513829145), (char) (jxjxxjx.s0073sss0073ss() ^ 513829160), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701651))) + jHhh006800680068h);
        return jHhh006800680068h;
    }

    @Nonnull
    public static Map<String, String> y0079007900790079y0079(@Nullable String str, @Nullable Set<String> set, @Nonnull String str2) throws IOException {
        HashMap map = new HashMap();
        if (str != null && set != null) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                return map;
                            }
                            List<String> listGg006700670067gg0067 = llqllqq.gg006700670067gg0067(line, str2);
                            if (!listGg006700670067gg0067.isEmpty()) {
                                String strTrim = listGg006700670067gg0067.get(0).trim();
                                if (strTrim.length() != 0 && set.contains(strTrim)) {
                                    map.put(strTrim, listGg006700670067gg0067.size() > 1 ? listGg006700670067gg0067.get(1).trim() : "");
                                }
                            }
                        } finally {
                        }
                    }
                } catch (IOException e) {
                    lqlqqll.llqqqll.u0075u0075uuu(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("\n\u0007\u0015?\b\f\u0003\u000b:V8]W^`XV1\f\r", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950921), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354562)), e.toString());
                }
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.Object> y0079007900790079yy(com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll.y0079007900790079yy(com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl):java.util.Map");
    }

    public static boolean y007900790079y00790079(@Nonnull nlllnnl nlllnnlVar) {
        Context context = nlllnnlVar.ww0077w007700770077;
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.s0073s0073s00730073) {
            return lqqqlll.y0079yy007900790079(context);
        }
        if (!nnlllnn.nlnllln.f00660066006600660066f()) {
            return true;
        }
        try {
            Object systemService = context.getSystemService(jxxjjxx.sss0073ss0073s("318%1", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950924), (char) (jjxxxjx.s00730073ss0073ss() ^ 783951095), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701650))));
            if (systemService instanceof PowerManager) {
                return ((PowerManager) systemService).isScreenOn();
            }
            return true;
        } catch (SecurityException e) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("#B5CqE9;KJ=xAM=KRHNH\u0002SIWSP[\\SZZ\r", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701719)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829278)) + e.toString());
            nlnnlnl.d00640064dd0064d(e);
            return true;
        } catch (Exception e2) {
            lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, e2.toString());
            return true;
        }
    }

    public static int y007900790079y0079y() {
        int iH00680068006800680068h = lllqlql.h0068hhhh0068().h00680068006800680068h();
        return iH00680068006800680068h <= 0 ? Runtime.getRuntime().availableProcessors() : iH00680068006800680068h;
    }

    @Nonnull
    public static Map<String, String> y007900790079yy0079() throws IOException {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, jxxjjxx.ss0073sss0073s("}\u0017 \b$*\u0018$", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950903), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)));
        Map<String, String> mapY0079007900790079y0079 = y0079007900790079y0079(jxxjjxx.sss0073ss0073s("\u0017Y\\ZO\u001c[T]Z`Yc", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701721)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950906), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354574)), hashSet, jxxjjxx.ss0073sss0073s("f", (char) (jxjxxjx.s0073sss0073ss() ^ 513829296), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652))));
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.sss0073ss0073s("SXS", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701734)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354582), (char) (jxjxxjx.s0073sss0073ss() ^ 513829279)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s("qp|Vs|U{hr sk{yw\t\u0001|S>", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701736)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)) + mapY0079007900790079y0079);
        return mapY0079007900790079y0079;
    }

    public static jjxjxjj.GenericLocation y007900790079yyy(@Nullable Location location, boolean z) {
        if (location == null) {
            return null;
        }
        return new jjxjxjj.GenericLocation(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null, lllqqll.yyy0079007900790079(location), lllqqll.y0079y0079007900790079(location), z);
    }

    @Nullable
    public static String y00790079y00790079y(@Nonnull nlllnnl nlllnnlVar, Map<String, String> map, Map<String, String> map2) throws InterruptedException {
        lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("hesBbrd]^>`d\\YebcY]b\u0015\u0015", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951001), (char) (jxjxxjx.s0073sss0073ss() ^ 513829268)));
        StringBuilder sb = new StringBuilder();
        if (Thread.currentThread().isInterrupted()) {
            return "";
        }
        try {
            Object systemService = nlllnnlVar.ww0077w007700770077.getApplicationContext().getSystemService(jxxjjxx.ss0073sss0073s("=4:86", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354625), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652))));
            if (!(systemService instanceof TelephonyManager)) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            String strSss0073ss0073s = jxxjjxx.sss0073ss0073s("!;9=?H@", (char) (jxjxxjx.s0073sss0073ss() ^ 513829330), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701656)));
            if (telephonyManager.getPhoneType() == 1) {
                strSss0073ss0073s = telephonyManager.getNetworkOperatorName();
            }
            sb.append(strSss0073ss0073s);
            sb.append(telephonyManager.getSimCountryIso());
            sb.append(((yy0079yy00790079() / 1024.0f) / 1024.0f) / 1024.0f);
            nnnnnll nnnnnllVar = new nnnnnll(nlllnnlVar);
            int iD00640064006400640064d = nnnnnllVar.d00640064006400640064d();
            int iDd0064d00640064d = nnnnnllVar.dd0064d00640064d();
            if (iD00640064006400640064d >= iDd0064d00640064d) {
                sb.append(iD00640064006400640064d);
                sb.append(jxxjjxx.ss0073sss0073s("\u0007", (char) (jxjxxjx.s0073sss0073ss() ^ 513829170), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)));
                sb.append(iDd0064d00640064d);
            } else {
                sb.append(iDd0064d00640064d);
                sb.append(jxxjjxx.ss0073sss0073s("t", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951069), (char) (jxjxxjx.s0073sss0073ss() ^ 513829273)));
                sb.append(iD00640064006400640064d);
            }
            if (!map.isEmpty()) {
                Iterator<String> it = map.values().iterator();
                while (it.hasNext()) {
                    StringBuilder sbS = a.s(it.next());
                    sbS.append(jxxjjxx.ss0073sss0073s("+", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354548), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354571)));
                    sb.append(sbS.toString());
                }
                sb.deleteCharAt(sb.lastIndexOf(jxxjjxx.ss0073sss0073s("5", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354563), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575))));
            }
            String str = k006Bk006B006Bk006B;
            lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.sss0073ss0073s("Tv\n\u000er{|Y)+\"~\u001fK/X8E", (char) (jxjxxjx.s0073sss0073ss() ^ 513829261), (char) (jxjxxjx.s0073sss0073ss() ^ 513829145), (char) (jxjxxjx.s0073sss0073ss() ^ 513829275)));
            if (!map2.isEmpty()) {
                String str2 = map2.get(jxxjjxx.ss0073sss0073s("!m&*[4rS", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354521), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701656))));
                sb.append(str2 != null ? str2 : "");
            }
            sb.append(nnlllnn.nnnnnln.ssss00730073s);
            sb.append(jxxjjxx.ss0073sss0073s("C", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701571)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884)));
            sb.append(nnlllnn.nnnnnln.s0073ss00730073s);
            sb.append(jxxjjxx.sss0073ss0073s("3", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950865), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354566), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652))));
            sb.append(nnlllnn.nnnnnln.s00730073s00730073s);
            sb.append(jxxjjxx.ss0073sss0073s("c", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701520)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354562)));
            sb.append(nnlllnn.nnnnnln.sss007300730073s);
            sb.append(jxxjjxx.ss0073sss0073s("*", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701612)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
            sb.append(nnlllnn.nnnnnln.nlnnnln.sss0073ss0073);
            lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s("GFV'I[OJM2XQ[\r`TdfdaYY0\u0017`Zmc$", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951049), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701650))) + ((Object) sb) + jxxjjxx.ss0073sss0073s("\u007f", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950961), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701656))));
            return llqllqq.ggg0067ggg0067(sb.toString());
        } catch (SecurityException e) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("OS,+\u0011s\u001a\u00173\u0019C\u000f~9K\u0012w_U>2p 6_5jB\n,\u001eJ", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951071), (char) (jjxxxjx.s00730073ss0073ss() ^ 783951026), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950881)) + e);
            nlnnlnl.d00640064dd0064d(e);
            return "";
        } catch (Exception e2) {
            lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, e2.toString());
            return "";
        }
    }

    @Nonnull
    public static llllqql y00790079y0079y0079(@Nonnull nlllnnl nlllnnlVar) throws InterruptedException {
        return lqqlqql.jj006Ajj006Aj(nlllnnlVar.ww0077w007700770077);
    }

    public static long y00790079y0079yy(@Nonnull nlllnnl nlllnnlVar) throws InterruptedException {
        long jYy007900790079yy = yy007900790079yy(nlllnnlVar.ww0077w007700770077.getApplicationInfo().dataDir);
        return jYy007900790079yy != 0 ? jYy007900790079yy : yyyyyy0079(nlllnnlVar);
    }

    public static String y00790079yy00790079(@Nonnull Context context, Set<String> set) throws Throwable {
        if (set != null && !set.isEmpty()) {
            try {
                try {
                    PackageInfo packageInfo = ((PackageManager) Class.forName(jxxjjxx.ss0073sss0073s("Zf[hd]W T_]bRZ_\u0018,WUZJ\\W", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951009), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354563))).getMethod(jxxjjxx.sss0073ss0073s("A]xK8\u0006W\u0014i=\u0006\u001e~\u001e\u0015O\u000f", (char) (jxjxxjx.s0073sss0073ss() ^ 513829188), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950917), (char) (jxjxxjx.s0073sss0073ss() ^ 513829274)), null).invoke(context, null)).getPackageInfo(context.getPackageName(), 4096);
                    List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : set) {
                        int iIndexOf = listAsList.indexOf(str);
                        if (iIndexOf != -1) {
                            String strSubstring = str.substring(str.lastIndexOf(jxxjjxx.ss0073sss0073s("'", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950943), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354571))) + 1);
                            if ((packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0) {
                                if (sb.length() > 0) {
                                    sb.append(jxxjjxx.sss0073ss0073s("#", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701710)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354669), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950882)));
                                }
                                sb.append(strSubstring);
                            } else {
                                if (sb2.length() > 0) {
                                    sb2.append(jxxjjxx.sss0073ss0073s("\t", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701711)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950905), (char) (jxjxxjx.s0073sss0073ss() ^ 513829275)));
                                }
                                sb2.append(strSubstring);
                            }
                        }
                    }
                    if (sb.length() == 0 && sb2.length() == 0) {
                        return null;
                    }
                    StringBuilder sb3 = new StringBuilder(jxxjjxx.ss0073sss0073s("\r", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701686)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354573)));
                    if (sb.length() > 0) {
                        sb3.append(jxxjjxx.ss0073sss0073s("*n|jz\u007fsq:", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701605)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)));
                        sb3.append((CharSequence) sb);
                        sb3.append(jxxjjxx.sss0073ss0073s("\u0004", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951090), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701542)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)));
                    }
                    if (sb2.length() > 0) {
                        if (sb.length() > 0) {
                            sb3.append(jxxjjxx.ss0073sss0073s("h", (char) (jxjxxjx.s0073sss0073ss() ^ 513829244), (char) (jxjxxjx.s0073sss0073ss() ^ 513829268)));
                        }
                        sb3.append(jxxjjxx.sss0073ss0073s("w\u001es\u0002R3G`", (char) (jxjxxjx.s0073sss0073ss() ^ 513829321), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354534), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
                        sb3.append((CharSequence) sb2);
                        sb3.append(jxxjjxx.sss0073ss0073s("w", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354718), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354603), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277)));
                    }
                    sb3.append(jxxjjxx.sss0073ss0073s("\u0016", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951045), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354583), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950886)));
                    return sb3.toString();
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    public static String y00790079yy0079y(int i) throws IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            File file = new File(jxxjjxx.sss0073ss0073s("G>\rS,G[(^b1l\u0006a|`\u001c{@\fi*\u0001+\u0018_Z", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950932), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354713), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950886)) + i2 + jxxjjxx.ss0073sss0073s("/drxjwkx7|mlxv|vot\b\u0006s{\t|\n", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701742)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829279)));
            boolean zExists = file.exists();
            if (i == 1 && !zExists) {
                file = new File(jxxjjxx.sss0073ss0073s("\nMRK\u0006::J<56C}AF??/6v*6:r&26n\".2\"-\u001f*f*\u0019\u0016 \u001c \u0018\u000f\u0012#\u001f\u000b\u0011\u001c\u000e\u0019", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354687), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701700)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)));
                zExists = file.exists();
            }
            if (zExists) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    String strSs0073sss0073s = jxxjjxx.ss0073sss0073s("[", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951045), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701649)));
                    lqlqqll.llqqqll.u007500750075uuu(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("\u007f\u000e\u000f\r\u0011L\u000f", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354636), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701567)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575)) + i2, e);
                    line = strSs0073sss0073s;
                }
                if (sb.length() > 0) {
                    sb.append(jxxjjxx.ss0073sss0073s("k", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701683)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950895)));
                }
                if (line != null) {
                    sb.append(line);
                }
            }
        }
        return sb.toString();
    }

    public static long y00790079yyy0079() {
        lqlllqq lqlllqqVar = new lqlllqq(Environment.getDataDirectory().getPath());
        long jG0067gg0067g0067g = lqlllqqVar.g0067gg0067g0067g();
        long jG00670067g0067g0067g = lqlllqqVar.g00670067g0067g0067g();
        long j = 0;
        if (jG0067gg0067g0067g != 0 && jG00670067g0067g0067g != 0) {
            j = ((((jG0067gg0067g0067g * jG00670067g0067g0067g) >> 20) << 20) / 10) * 10;
        }
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.sss0073ss0073s("Duo", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354518), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354648), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.sss0073ss0073s("\u0014+\bq6s[6B.R\r\u00161oMTy4\u0016'\u0010q\u0016", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950869), (char) (jxjxxjx.s0073sss0073ss() ^ 513829224), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950887)) + j);
        return j;
    }

    public static String y0079y007900790079y() {
        String str;
        Callable<String> callable = new Callable<String>() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll.1
            @Override // java.util.concurrent.Callable
            public String call() {
                try {
                    MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                    try {
                        String strEncodeToString = Base64.encodeToString(mediaDrm.getPropertyByteArray("deviceUniqueId"), 2);
                        mediaDrm.close();
                        return strEncodeToString;
                    } finally {
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
        };
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(callable);
        try {
            str = (String) futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            futureSubmit.cancel(true);
            str = null;
        }
        executorServiceNewSingleThreadExecutor.shutdownNow();
        return str;
    }

    public static lqqlqlq y0079y00790079y0079() throws InterruptedException {
        lqqlqlq lqqlqlqVarH0068h0068hh0068 = lllqlql.h0068hhhh0068().h0068h0068hh0068();
        return lqqlqlqVarH0068h0068hh0068 != null ? lqqlqlqVarH0068h0068hh0068 : llqlqlq.g00670067g00670067gg();
    }

    public static String y0079y00790079yy(nlllnnl nlllnnlVar) {
        jxxjjxx.sss0073ss0073s("Y", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950859), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354659), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354573));
        String strOoo006Fo006F006F = new nnlllnn.nllllnn(nlllnnlVar).ooo006Fo006F006F();
        nnlllnn.nllnlln nllnllnVar = new nnlllnn.nllnlln(nlllnnlVar.ww0077w007700770077, strOoo006Fo006F006F, nnlllnn.nnllnln.bbbb00620062b);
        int iF0066ff00660066f = nllnllnVar.f0066ff00660066f();
        String strFf0066f00660066f = nllnllnVar.ff0066f00660066f();
        StringBuilder sbS = a.s(strOoo006Fo006F006F);
        sbS.append(jxxjjxx.ss0073sss0073s("~", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354633), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277)));
        if (strFf0066f00660066f == null) {
            strFf0066f00660066f = jxxjjxx.sss0073ss0073s("h", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951066), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354511), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701650)));
        }
        sbS.append(strFf0066f00660066f);
        sbS.append(jxxjjxx.sss0073ss0073s("\r", (char) (jxjxxjx.s0073sss0073ss() ^ 513829326), (char) (jxjxxjx.s0073sss0073ss() ^ 513829280), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572)));
        sbS.append(iF0066ff00660066f == -1 ? jxxjjxx.sss0073ss0073s("u", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354741), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701531)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701649))) : Integer.valueOf(iF0066ff00660066f));
        String strH0068h006800680068h = lllqlql.h0068hhhh0068().h0068h006800680068h();
        sbS.append(jxxjjxx.sss0073ss0073s("p", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950896), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701665)), (char) ((-1787701650) ^ jjjxxjx.s0073s00730073sss())));
        if (strH0068h006800680068h == null) {
            strH0068h006800680068h = jxxjjxx.sss0073ss0073s("\r", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701710)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829262), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654)));
        }
        sbS.append(strH0068h006800680068h);
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.ss0073sss0073s("h0M{", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951001), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.sss0073ss0073s("Cqpkg`]ochf\u0017?cZb\u0012", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950967), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701567)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354569)) + sbS.toString());
        return sbS.toString();
    }

    public static boolean y0079y0079y00790079(String str) throws UnknownHostException {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (!byName.isAnyLocalAddress()) {
                if (!byName.isLoopbackAddress()) {
                    return false;
                }
            }
        } catch (UnknownHostException unused) {
        }
        return true;
    }

    public static String y0079y0079y0079y(@Nonnull nlllnnl nlllnnlVar) {
        if (!nnlllnn.nnlnnnl.f0066f0066006600660066()) {
            return null;
        }
        nnlllnn.nnnllln nnnlllnVar = new nnlllnn.nnnllln(nlllnnlVar.ww0077w007700770077);
        boolean zFff006600660066f = nnnlllnVar.fff006600660066f(jxxjjxx.sss0073ss0073s("#/$1-& h*\u001e*$\u001f('\u001c!\u001f]opop}|\bmosi\u0003npc`rfki", (char) (jxjxxjx.s0073sss0073ss() ^ 513829197), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354713), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701649))), nlllnnlVar.ww0077w007700770077.getPackageName());
        boolean zFff006600660066f2 = nnnlllnVar.fff006600660066f(jxxjjxx.sss0073ss0073s("x\u0007}\r\u000b\u0006\u0002L\u0010\u0006\u0014\u0010\r\u0018\u0019\u0010\u0017\u0017Wknor\u0002\u0003\u0010t\u0002t\u0007\t{\u0017\u0005\t}|\u0011\u0007\u000e\u000e", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701673)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701578)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829272)), nlllnnlVar.ww0077w007700770077.getPackageName());
        if (!zFff006600660066f && !zFff006600660066f2) {
            return null;
        }
        try {
            Object systemService = nlllnnlVar.ww0077w007700770077.getApplicationContext().getSystemService(jxxjjxx.ss0073sss0073s("SLTTL", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701620)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950881)));
            if (!(systemService instanceof TelephonyManager)) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            HashMap map = new HashMap();
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperator != null && !"".equals(networkOperator.trim())) {
                    map.put(jxxjjxx.sss0073ss0073s("@B", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354694), (char) (jxjxxjx.s0073sss0073ss() ^ 513829215), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950883)), networkOperator);
                }
                if (networkOperatorName != null && !"".equals(networkOperatorName.trim())) {
                    map.put(jxxjjxx.ss0073sss0073s("{{}", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950933), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950887)), networkOperatorName);
                }
                if (networkCountryIso != null && !"".equals(networkCountryIso.trim())) {
                    map.put(jxxjjxx.ss0073sss0073s("VLIT_\\", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701734)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)), networkCountryIso);
                }
            } catch (SecurityException e) {
                lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("j\r\u0012 N\u0010s\u000efpA;R\u0016\u001a&?3@W+\u0006.XL\u001d*Y\nb\u001f\u0010", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701672)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829181), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277)) + e.toString());
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, e2.toString());
            }
            if (zFff006600660066f) {
                yyyy00790079y(nlllnnlVar.ww0077w007700770077, telephonyManager, map);
            }
            yy0079y0079y0079(telephonyManager, map);
            return yyy0079yyy(map);
        } catch (SecurityException e3) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("\u00130!-Y+\u001d\u001d+(\u0019R\u0019#\u0011\u001d\"\u0016\u001a\u0012I\u0019\r\u0019\u0013\u000e\u0017\u0016\u000b\u0010\u000e>", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354730), (char) (jxjxxjx.s0073sss0073ss() ^ 513829268)) + e3.toString());
            nlnnlnl.d00640064dd0064d(e3);
            return null;
        } catch (Exception e4) {
            lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, e4.toString());
            return null;
        }
    }

    public static String y0079y0079yy0079() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(jxxjjxx.sss0073ss0073s("\u001d", (char) (jxjxxjx.s0073sss0073ss() ^ 513829363), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701574)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654))));
                sb.append(country);
            }
        }
        return sb.toString();
    }

    @Nullable
    public static String y0079y0079yyy() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        if (stackTrace.length > 0) {
            String className = stackTrace[stackTrace.length - 1].getClassName();
            if (!className.equals(jxxjjxx.ss0073sss0073s("\u000e\u001b\u0016W\u0010\u001e\u0011 \u0012\r\u0005O\u0010\u0016\u0019\u000b-*\u001a&l/0k\r-\u0018!+\u001d}$s\u007f", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950861), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950886))) && !className.equals(jxxjjxx.sss0073ss0073s("v# aFu\fG~h\u001ba]K](\ro0\u00156E\u0004L@", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701760)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950964), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)))) {
                int iLastIndexOf = className.lastIndexOf(jxxjjxx.sss0073ss0073s("\u0017", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701506)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950963), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701655))));
                return iLastIndexOf != -1 ? className.substring(iLastIndexOf + 1) : className;
            }
        }
        return null;
    }

    public static String y0079yy00790079y(@Nonnull nlllnnl nlllnnlVar) {
        return nnlllnn.nnlllln.f0066ffff0066(nlllnnlVar.ww0077w007700770077.getContentResolver(), jxxjjxx.ss0073sss0073s("\b\n\u001c\f\f\u0010\u0012\u0010\u0011\u001b\"\u000e\u001b\u000e\u001e\u001f\u001d#\u001d*\u000f\u0016 \u0014\u001e)##", (char) (jxjxxjx.s0073sss0073ss() ^ 513829191), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354570)));
    }

    @Nonnull
    public static jjxjxjj.jxxjxjj y0079yy0079y0079() {
        return lllllqq.g006700670067gg0067g();
    }

    public static String y0079yy0079yy(@Nonnull nlllnnl nlllnnlVar) {
        return nnlllnn.nnlllln.f0066ffff0066(nlllnnlVar.ww0077w007700770077.getContentResolver(), jxxjjxx.ss0073sss0073s("4f\u00133Y\u0018jc\u0015MN", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701701)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880)));
    }

    public static boolean y0079yyy00790079(@Nullable llqqlll llqqlllVar) {
        if (llqqlllVar == null) {
            throw new IllegalArgumentException(jxxjjxx.sss0073ss0073s("M\u000b\u0011m]\u001e\u0006\u0001e*aZ\u0017ysmOUT\u0003:", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950848), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354627), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354570)));
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (timeZone == null) {
            lqlqqll.llqqqll.u0075uuu0075u(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("NM]>TYRH^^V;aZd0\u0017>:CGAA", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354714), (char) (jxjxxjx.s0073sss0073ss() ^ 513829321), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701655))));
            return false;
        }
        llqqlllVar.pppp0070pp = timeZone.getRawOffset() / 60000;
        llqqlllVar.p0070pp0070pp = timeZone.getDSTSavings() / 60000;
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.ss0073sss0073s("X \u0016b", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950935), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.sss0073ss0073s("h\u001c\\m8m\u0017A\b8`yPy84KE\u000689\u0014Bs\u007f", (char) (jxjxxjx.s0073sss0073ss() ^ 513829217), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354750), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950887)) + llqqlllVar.p0070pp0070pp + jxxjjxx.sss0073ss0073s("U\u001e%\u001f\t!\"0#3|", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701720)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783951049), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950883)) + llqqlllVar.pppp0070pp);
        return true;
    }

    @Nonnull
    public static Map<String, String> y0079yyy0079y() throws IOException {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, jxxjjxx.ss0073sss0073s("Qrnabonik", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354723), (char) (jxjxxjx.s0073sss0073ss() ^ 513829272)), jxxjjxx.ss0073sss0073s("\fr\u0014'|;jw", (char) (jxjxxjx.s0073sss0073ss() ^ 513829250), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654))), jxxjjxx.ss0073sss0073s("\u000fFG%fN", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701556)), (char) ((-1787701654) ^ jjjxxjx.s0073s00730073sss())));
        Map<String, String> mapY0079007900790079y0079 = y0079007900790079y0079(jxxjjxx.sss0073ss0073s("[M>jMGj'\u001b?3ZR", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354521), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701731)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354570)), new HashSet(arrayList), jxxjjxx.sss0073ss0073s("\f", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701713)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701506)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950885)));
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.ss0073sss0073s("ury", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701536)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s("! 0\u007f\u000e\u0014\t/(2c7+;=;800\u0007m", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951100), (char) (jxjxxjx.s0073sss0073ss() ^ 513829279)) + mapY0079007900790079y0079);
        return mapY0079007900790079y0079;
    }

    @Nullable
    public static String y0079yyyy0079(@Nonnull StringBuilder sb) throws InterruptedException {
        if (lllqlql.h0068hhhh0068().h00680068h0068h0068()) {
            List<String> listHhhhhh0068 = lllqlql.h0068hhhh0068().hhhhhh0068(jxxjjxx.sss0073ss0073s("\u001b75\u0007?\b\b%\u0014tkI\u007f", (char) (jxjxxjx.s0073sss0073ss() ^ 513829238), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354594), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654))));
            if (listHhhhhh0068 == null || listHhhhhh0068.size() != 2) {
                return null;
            }
            String str = listHhhhhh0068.get(0);
            sb.append(listHhhhhh0068.get(1));
            return str;
        }
        List<String> listYy0079yyy0079 = yy0079yyy0079();
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = listYy0079yyy0079.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb.append(listYy0079yyy0079.size());
        return llqllqq.ggg0067ggg0067(sb2.toString());
    }

    public static long yy0079007900790079y(String str) {
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073) {
            try {
                return nnlllnn.nnlnlln.ffff00660066f(str);
            } catch (Exception unused) {
                lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("^BM,0U2.\u0010ar\nH\n\u0016\u001e:/\u000e/(\u0017ao:!\u0002]2<uT[\tMDj?H[N'$", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950941), (char) (jxjxxjx.s0073sss0073ss() ^ 513829275)));
            }
        }
        try {
            return new File(str).lastModified();
        } catch (SecurityException unused2) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("\"?KJJNxJ<79sG:6o5791", (char) (jxjxxjx.s0073sss0073ss() ^ 513829365), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354498), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568)) + str);
            return 0L;
        }
    }

    public static String yy007900790079y0079(nlllnnl nlllnnlVar) {
        return new nnlllnn.nllllnn(nlllnnlVar).o006Fo006Fo006F006F();
    }

    public static long yy007900790079yy(String str) {
        if (str == null) {
            lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("}nM2M\u0012kT\u0002@yK?_!v.*R\u000f_\u0019%/uR\u007f", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354626), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701670)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829276)));
            return 0L;
        }
        long jHhh006800680068h = lllqlql.h0068hhhh0068().hhh006800680068h(str, false);
        lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("<cg\u0012R`_\u000eaUXO\tNYUR\u00041CUIUC$=OB>J<Ht:BDp@0B5\u0006", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354735), (char) (jxjxxjx.s0073sss0073ss() ^ 513829255), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568)) + str + jxxjjxx.ss0073sss0073s("\u000b}", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951098), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277)) + jHhh006800680068h);
        return jHhh006800680068h;
    }

    public static boolean yy00790079y00790079(@Nonnull nlllnnl nlllnnlVar) {
        String strFf0066fff0066 = nnlllnn.nnlllln.ff0066fff0066(nlllnnlVar.ww0077w007700770077.getContentResolver(), jxxjjxx.sss0073ss0073s("\\_T]R`dYXlbii", (char) (jxjxxjx.s0073sss0073ss() ^ 513829304), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354627), (char) (jxjxxjx.s0073sss0073ss() ^ 513829272)));
        return strFf0066fff0066 != null && strFf0066fff0066.equals(jxxjjxx.ss0073sss0073s("\b", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701570)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654))));
    }

    public static String yy00790079y0079y() {
        return jxxjjxx.sss0073ss0073s("\u0010\u001e\u0015$\"\u001d\u0019", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354635), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950899), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701656)));
    }

    public static String yy00790079yy0079() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(jxxjjxx.sss0073ss0073s("7", (char) (jxjxxjx.s0073sss0073ss() ^ 513829239), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354591), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950882)));
                sb.append(country);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f2  */
    @javax.annotation.Nonnull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> yy00790079yyy(@javax.annotation.Nonnull com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl r20, @javax.annotation.Nullable java.util.List<java.lang.String> r21) throws java.lang.InterruptedException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll.yy00790079yyy(com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl, java.util.List):java.util.List");
    }

    public static int yy0079y00790079y(nlllnnl nlllnnlVar) {
        return nnlllnn.nllnnln.oooo006F006F006F(nlllnnlVar.ww0077w007700770077);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void yy0079y0079y0079(android.telephony.TelephonyManager r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll.yy0079y0079y0079(android.telephony.TelephonyManager, java.util.Map):void");
    }

    public static String yy0079y0079yy(nlllnnl nlllnnlVar) {
        return nnllnll.d00640064d0064d0064(nlllnnlVar.ww0077w007700770077);
    }

    public static long yy0079yy00790079() {
        lqlllqq lqlllqqVar = new lqlllqq(Environment.getDataDirectory().getPath());
        return lqlllqqVar.g00670067g0067g0067g() * lqlllqqVar.gg0067g0067g0067g();
    }

    public static String yy0079yy0079y(Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        String str = map.get(jxxjjxx.ss0073sss0073s("\u000e(:-A,>2", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354536), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354569)));
        String str2 = map.get(jxxjjxx.sss0073ss0073s("[u\u001aJ%haB\u007f", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950892), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354711), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701653))));
        return (str == null || str2 == null) ? str != null ? str : str2 : a.o(a.s(str2), jxxjjxx.sss0073ss0073s("m{o", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701547)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829367), (char) (jxjxxjx.s0073sss0073ss() ^ 513829273)), str);
    }

    @Nonnull
    public static List<String> yy0079yyy0079() {
        ArrayList arrayList = new ArrayList();
        File file = new File(jxxjjxx.sss0073ss0073s("T3\u000b_B\u000e(C]@\u00122\u0013)", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701688)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829254), (char) (jxjxxjx.s0073sss0073ss() ^ 513829275)));
        String strSs0073sss0073s = jxxjjxx.ss0073sss0073s("/vwj", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701523)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572));
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                if (str != null && str.endsWith(strSs0073sss0073s)) {
                    arrayList.add(new StringBuilder(str).substring(0, r7.length() - 4));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static String yyy007900790079y(long j, long j2) {
        String strGgg0067ggg0067 = llqllqq.ggg0067ggg0067(j + jxxjjxx.ss0073sss0073s("S", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950974), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950894)) + j2);
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.ss0073sss0073s("\u0001~\u000f", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951084), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354569)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s(",+;\f.@4/2!C1E7\rs", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701681)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884)) + strGgg0067ggg0067);
        return strGgg0067ggg0067;
    }

    public static String yyy00790079y0079() {
        return jxxjjxx.sss0073ss0073s("iuI-Jgo", (char) (jxjxxjx.s0073sss0073ss() ^ 513829367), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950952), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652)));
    }

    public static long yyy00790079yy(@Nonnull nlllnnl nlllnnlVar) throws InterruptedException {
        long jYy007900790079yy = yy007900790079yy(nlllnnlVar.ww0077w007700770077.getApplicationInfo().sourceDir);
        return jYy007900790079yy != 0 ? jYy007900790079yy : yyyyyy0079(nlllnnlVar);
    }

    public static String yyy0079y00790079(@Nonnull nlllnnl nlllnnlVar) {
        return String.valueOf((new nnlllnn.nllllnn(nlllnnlVar).oo006Foo006F006F() & 2) != 0);
    }

    public static String yyy0079y0079y(@Nonnull nlllnnl nlllnnlVar) {
        if (!nnlllnn.nnlnnnl.f0066f0066006600660066() || !new nnlllnn.nnnllln(nlllnnlVar.ww0077w007700770077).fff006600660066f(jxxjjxx.ss0073sss0073s("\u000f\u001b\u0010\u001d\u0019\u0012\fT\u0016\n\u0016\u0010\u000b\u0014\u0013\b\r\u000bI[\\[\\ihsY[_UnZ\\OL^RWU", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701731)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354574)), nlllnnlVar.ww0077w007700770077.getPackageName())) {
            return null;
        }
        String strO006Fo006F006Fo006F = nnnllnn.o006Fo006F006Fo006F(nlllnnlVar.ww0077w007700770077);
        if (llqllqq.ggggggg0067(strO006Fo006F006Fo006F) && (nnlllnn.nnlnnnl.f0066ff006600660066() || nnlllnn.nnlnnnl.ff0066f006600660066())) {
            try {
                Object systemService = nlllnnlVar.ww0077w007700770077.getApplicationContext().getSystemService(jxxjjxx.sss0073ss0073s("J\u0010\u0016\u0014\n", (char) (jxjxxjx.s0073sss0073ss() ^ 513829317), (char) (jxjxxjx.s0073sss0073ss() ^ 513829346), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701654))));
                if (!(systemService instanceof TelephonyManager)) {
                    return null;
                }
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                CellLocation cellLocation = telephonyManager.getCellLocation();
                StringBuilder sb = new StringBuilder();
                Object objValueOf = "";
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    int cid = gsmCellLocation.getCid();
                    int lac = gsmCellLocation.getLac();
                    if (cid == -1 && lac == -1) {
                        return null;
                    }
                    sb.append(jxxjjxx.ss0073sss0073s("K*4?", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950883), (char) (1457354575 ^ jxxxxjx.sss0073s0073ss())));
                    sb.append(cid == -1 ? "" : Integer.valueOf(cid));
                    sb.append(jxxjjxx.ss0073sss0073s("+ZH", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951073), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354573)));
                    if (lac != -1) {
                        objValueOf = Integer.valueOf(lac);
                    }
                } else if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    int systemId = cdmaCellLocation.getSystemId();
                    int networkId = cdmaCellLocation.getNetworkId();
                    if (baseStationId == -1 && systemId == -1 && networkId == -1) {
                        return null;
                    }
                    sb.append(jxxjjxx.ss0073sss0073s("\u001f\u001f'\u001a\u0012", (char) (jxjxxjx.s0073sss0073ss() ^ 513829133), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354562)));
                    sb.append(baseStationId == -1 ? "" : Integer.valueOf(baseStationId));
                    sb.append(jxxjjxx.ss0073sss0073s("\u0016", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951030), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354562)));
                    sb.append(systemId == -1 ? "" : Integer.valueOf(systemId));
                    sb.append(jxxjjxx.ss0073sss0073s("b", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354594), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354575)));
                    if (networkId != -1) {
                        objValueOf = Integer.valueOf(networkId);
                    }
                }
                sb.append(objValueOf);
                return sb.toString();
            } catch (SecurityException e) {
                lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("@_R`\u000fbVXhgZ\u0016^jZhoeke\u001fpftpmxypww*", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701672)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884)) + e.getMessage());
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, e2.toString());
            }
        }
        return strO006Fo006F006Fo006F;
    }

    public static String yyy0079yy0079(String str) {
        String str2 = (String) jjxjxjx.s0073ss0073sss(null, kk006Bkk006B006B, str);
        if (llqllqq.g006700670067006700670067g(str2)) {
            return str2;
        }
        return null;
    }

    private static String yyy0079yyy(Map<String, String> map) {
        if (map.size() >= 3) {
            return map.toString();
        }
        return null;
    }

    public static String yyyy007900790079() {
        try {
            return String.valueOf(((Boolean) Class.forName(jxxjjxx.ss0073sss0073s(",81>>75}25r\b,(>/", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701596)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277))).getMethod(jxxjjxx.sss0073ss0073s("\u000f\u0004\u0010\u001bS\u0010|(_Xby4]PwD X", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701705)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950995), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354570)), null).invoke(null, null)).booleanValue());
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static void yyyy00790079y(Context context, TelephonyManager telephonyManager, Map<String, String> map) {
        CdmaCellLocation cdmaCellLocation;
        Map<String, String> mapO006F006F006F006Fo006F = nnnllnn.o006F006F006F006Fo006F(context);
        if (mapO006F006F006F006Fo006F != null) {
            map.putAll(mapO006F006F006F006Fo006F);
        }
        if (nnlllnn.nnlnnnl.f0066ff006600660066() || nnlllnn.nnlnnnl.ff0066f006600660066()) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                if (cellLocation == null) {
                    return;
                }
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    if (gsmCellLocation == null) {
                        return;
                    }
                    int lac = gsmCellLocation.getLac();
                    if (lac != -1) {
                        map.put(jxxjjxx.sss0073ss0073s("\b\n\n", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354704), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950999), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572)), String.valueOf(lac));
                    }
                    int cid = gsmCellLocation.getCid();
                    if (cid != -1) {
                        map.put(jxxjjxx.ss0073sss0073s("[b^", (char) (jxjxxjx.s0073sss0073ss() ^ 513829222), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884)), String.valueOf(cid));
                    }
                    int psc = gsmCellLocation.getPsc();
                    if (psc != -1) {
                        map.put(jxxjjxx.sss0073ss0073s("VbS", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950909), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701529)), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701651))), String.valueOf(psc));
                        return;
                    }
                    return;
                }
                if ((cellLocation instanceof CdmaCellLocation) && (cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation()) != null) {
                    int systemId = cdmaCellLocation.getSystemId();
                    if (systemId != -1) {
                        map.put(jxxjjxx.sss0073ss0073s("<@p", (char) (jxjxxjx.s0073sss0073ss() ^ 513829211), (char) (jjxxxjx.s00730073ss0073ss() ^ 783951092), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701653))), String.valueOf(systemId));
                    }
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    if (baseStationId != -1) {
                        map.put(jxxjjxx.ss0073sss0073s("Xja]", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701737)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354569)), String.valueOf(baseStationId));
                    }
                    int baseStationLatitude = cdmaCellLocation.getBaseStationLatitude();
                    if (baseStationLatitude != Integer.MAX_VALUE) {
                        map.put(jxxjjxx.ss0073sss0073s("\u0018(\u0013\u001f\u0013%", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354632), (char) (jxjxxjx.s0073sss0073ss() ^ 513829272)), String.valueOf(baseStationLatitude));
                    }
                    int baseStationLongitude = cdmaCellLocation.getBaseStationLongitude();
                    if (baseStationLongitude != Integer.MAX_VALUE) {
                        map.put(jxxjjxx.ss0073sss0073s("\u001f/\u001a&'\u001f", (char) (jxjxxjx.s0073sss0073ss() ^ 513829238), (char) (513829272 ^ jxjxxjx.s0073sss0073ss())), String.valueOf(baseStationLongitude));
                    }
                }
            } catch (SecurityException e) {
                lqlqqll.llqqqll.yy00790079007900790079(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("4SFT\u0003VJL\\[N\nR^N\\cY_Y\u0013dZhdalmdkk\u001e", (char) (jxjxxjx.s0073sss0073ss() ^ 513829185), (char) ((-1787701653) ^ jjjxxjx.s0073s00730073sss())) + e.toString());
                nlnnlnl.d00640064dd0064d(e);
            } catch (Exception e2) {
                lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, e2.toString());
            }
        }
    }

    @Nullable
    public static String yyyy0079y0079(@Nonnull nlllnnl nlllnnlVar) {
        String strFfffff0066 = nnlllnn.nnlllln.ffffff0066(nlllnnlVar.ww0077w007700770077.getContentResolver());
        if (llqllqq.g006700670067006700670067g(strFfffff0066)) {
            return strFfffff0066;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            return null;
        } catch (Exception e) {
            lqlqqll.llqqqll.u0075uuuuu(k006Bk006B006Bk006B, jxxjjxx.sss0073ss0073s("h\u001d\t\f\u0018\u001d\u0013\u001a\u001aL\u0017\u001dO\u0012\u0015\u0016\u0019() & Y\u001d(2#3/06+c)+=1,/jGJ", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354527), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950954), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701655))), e.toString());
            return null;
        }
    }

    @Nullable
    public static String yyyy0079yy(@Nonnull nlllnnl nlllnnlVar) throws Throwable {
        lqlqqlq.llqqqlq llqqqlqVar;
        nnlllnn.nllllnn nllllnnVar = new nnlllnn.nllllnn(nlllnnlVar);
        String strO006Fooo006F006F = nllllnnVar.o006Fooo006F006F();
        String strHhh0068h00680068 = lllqlql.h0068hhhh0068().hhh0068h00680068(strO006Fooo006F006F);
        if (strHhh0068h00680068 != null) {
            return lqlqlll.yy0079yyyy(strHhh0068h00680068);
        }
        String[] strArrSplit = strO006Fooo006F006F.split(jxxjjxx.ss0073sss0073s("u", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701592)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354572)));
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArrSplit[i];
                if (str.contains(jxxjjxx.sss0073ss0073s(" ", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950880), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354717), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652)))) && !str.equalsIgnoreCase(nlllnnlVar.ww0077w007700770077.getPackageName())) {
                    llqqqlqVar = lqlqqlq.llqqqlq.INCONSISTENT_PATH;
                    break;
                }
                i++;
            } else {
                try {
                    String[] packagesForUid = ((PackageManager) Class.forName(jxxjjxx.sss0073ss0073s("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (char) (jxjxxjx.s0073sss0073ss() ^ 513829230), (char) (jxjxxjx.s0073sss0073ss() ^ 513829315), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568))).getMethod(jxxjjxx.ss0073sss0073s(";:J'9<E<CB+@NBIHV", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354639), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568)), null).invoke(nlllnnlVar.ww0077w007700770077, null)).getPackagesForUid(nllllnnVar.oo006F006Fo006F006F());
                    llqqqlqVar = (packagesForUid == null || packagesForUid.length <= 1) ? lqlqqlq.llqqqlq.NOT_CLONED : lqlqqlq.llqqqlq.MULTIPLE_PID;
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            }
        }
        return lqlqlll.y0079yyyyy(llqqqlqVar);
    }

    public static String yyyyy00790079(@Nonnull nlllnnl nlllnnlVar) {
        String strY00790079y007900790079;
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ssss007300730073 && (strY00790079y007900790079 = lqllqll.y00790079y007900790079(nlllnnlVar)) != null) {
            return strY00790079y007900790079;
        }
        try {
            String property = System.getProperty(jxxjjxx.ss0073sss0073s(")674r697AC\u0013;@B", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701678)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950887)), null);
            String property2 = System.getProperty(jxxjjxx.ss0073sss0073s("dqro.qtr|~Vvz}", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354551), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354569)), null);
            if (llqllqq.g006700670067006700670067g(property) && llqllqq.g006700670067006700670067g(property2)) {
                String str = k006Bk006B006Bk006B;
                lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.sss0073ss0073s("IS_}VG[0jT3\u0019y6=\r5A", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354648), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354580), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354571)) + property + jxxjjxx.sss0073ss0073s("o", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354734), (char) (jxjxxjx.s0073sss0073ss() ^ 513829357), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354571)) + property2);
                if (!jxxjjxx.sss0073ss0073s("Nx", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354597), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950881), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277)).equals(property2) && !jxxjjxx.sss0073ss0073s("\u001a\\\"| T5(\u0017", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701692)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354700), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701652))).equalsIgnoreCase(property) && !y0079y0079y00790079(property)) {
                    return property + jxxjjxx.sss0073ss0073s("]", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950911), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701545)), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354568)) + property2;
                }
                lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s("w\u0017\u001b\u001d\u001d\u0015\u0017\u0011F\u0011\u0013\u001c\u0004\u0010\n\u0006^0/-35", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950857), (char) (jxxxxjx.sss0073s0073ss() ^ 1457354571)));
            }
            return null;
        } catch (SecurityException unused) {
            lqlqqll.llqqqll.uuu0075uuu(k006Bk006B006Bk006B, jxxjjxx.ss0073sss0073s("w\t\u0006\u0017\u0013\t\u0013\u0017i|\t\u0001}\n6w\u0001\u0003u|\u0004/opop}|({u%tuqqeqrfan", (char) (jxjxxjx.s0073sss0073ss() ^ 513829361), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950895)));
            return null;
        }
    }

    public static long yyyyy0079y() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - nnlllnn.nlnnnnl.f0066fff00660066()) / 1000;
        String str = k006Bk006B006Bk006B;
        lqlqqll.uuu007500750075u(str, jxxjjxx.ss0073sss0073s("VPa", (char) (jxjxxjx.s0073sss0073ss() ^ 513829171), (char) (jxjxxjx.s0073sss0073ss() ^ 513829272)));
        lqlqqll.llqqqll.yy00790079007900790079(str, jxxjjxx.ss0073sss0073s("`)(8\u000756<\u001d381\u0007m", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354741), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701653))) + jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long yyyyyy0079(@javax.annotation.Nonnull com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl r9) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll.yyyyyy0079(com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlllnnl):long");
    }
}
