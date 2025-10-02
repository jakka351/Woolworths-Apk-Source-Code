package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import androidx.constraintlayout.core.state.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.storage.db.k;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes6.dex */
public class lllqqlq {
    public static final Map<String, String> m006D006D006D006Dmm;
    private static final String m006Dm006D006Dmm = "https://";
    private static final Map<String, String> mm006D006D006Dmm;

    @Nonnull
    public static final String mmmmm006Dm;
    public final String m006D006Dmm006Dm;
    private final String m006Dmmm006Dm;
    public final String mm006Dmm006Dm;
    private static final String m006D006Dm006Dmm = lqlqqll.u00750075u00750075u(lllqqlq.class);
    private static final Pattern mmm006D006Dmm = Pattern.compile("^[a-zA-Z0-9]{8}$");

    static {
        HashMap mapR = a.r("Cache-Control", "no-cache, no-store, must-revalidate, no-transform");
        m006D006D006D006Dmm = Collections.unmodifiableMap(mapR);
        HashMap map = new HashMap(mapR);
        String strY0079y0079yy0079 = lqlllll.y0079y0079yy0079();
        mmmmm006Dm = strY0079y0079yy0079;
        map.put("Accept-Language", strY0079y0079yy0079);
        mm006D006D006Dmm = Collections.unmodifiableMap(map);
    }

    public lllqqlq(String str, String str2, String str3) {
        this.m006Dmmm006Dm = str3;
        this.m006D006Dmm006Dm = str2;
        this.mm006Dmm006Dm = str;
    }

    public static boolean gg0067006700670067gg(@Nullable String str) {
        if (str != null && !str.isEmpty() && mmm006D006Dmm.matcher(str).find()) {
            return true;
        }
        lqlqqll.uuuu00750075u(m006D006Dm006Dmm, "Invalid org_id");
        return false;
    }

    public static boolean ggg0067gg0067g(@Nullable String str) {
        if (str == null) {
            str = "h-sdk.online-metrix.net";
        }
        try {
            new URL(m006Dm006D006Dmm.concat(str));
            return false;
        } catch (MalformedURLException e) {
            lqlqqll.u0075uu00750075u(m006D006Dm006Dmm, "Invalid hostname ".concat(str), e);
            return true;
        }
    }

    @Nonnull
    public static Map<String, String> gggggg0067g(@Nullable jjxjxjj jjxjxjjVar, String str, int i) {
        HashMap map = new HashMap(mm006D006D006Dmm);
        if (!llqllqq.g006700670067006700670067g(str)) {
            str = null;
        }
        if (jjxjxjjVar != null) {
            map.put("Referer", jjxjxjjVar.vv0076vvvv);
            if (str == null && llqllqq.g006700670067006700670067g(jjxjxjjVar.v00760076vvvv)) {
                str = jjxjxjjVar.v00760076vvvv;
            }
            map.put("Cookie", "thx_guid=" + jjxjxjjVar.qq00710071007100710071);
        }
        if (str != null) {
            map.put("User-Agent", str);
        }
        if (i > 0) {
            map.put(RequestBuilder.CONTENT_TYPE, "application/x-www-form-urlencoded");
            map.put(RequestBuilder.CONTENT_ENCODING, "gzip");
            map.put("Content-Length", Integer.toString(i));
        }
        return map;
    }

    @Nullable
    public String g00670067006700670067gg(@Nonnull String str, @Nullable String str2, @Nullable String str3) {
        StringBuilder sb = new StringBuilder(this.m006D006Dmm006Dm);
        if (llqllqq.ggggggg0067(str2) || llqllqq.ggggggg0067(str3)) {
            lqlqqll.llqqqll.yy00790079007900790079(m006D006Dm006Dmm, "Failed to generate DNS domain: invalid nonce or dnsDomain");
            return null;
        }
        String strGg0067g0067gg0067 = llqllqq.gg0067g0067gg0067(str.getBytes());
        int iIndexOf = str3.indexOf(".");
        int length = str2.length() + this.m006D006Dmm006Dm.length() + (strGg0067g0067gg0067 != null ? strGg0067g0067gg0067.length() : 0);
        if (iIndexOf < 0) {
            iIndexOf = str3.length();
        }
        if (length + iIndexOf >= 64) {
            lqlqqll.llqqqll.yy00790079007900790079(m006D006Dm006Dmm, "Combined org id, session id, nonce (optional) and postfix is too long for host name fragment");
            return null;
        }
        androidx.compose.ui.input.pointer.a.w(sb, strGg0067g0067gg0067, str2, str3);
        lqlqqll.llqqqll.yy00790079007900790079(m006D006Dm006Dmm, "FQDN is " + sb.toString());
        return sb.toString();
    }

    @Nonnull
    public String g00670067ggg0067g(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(m006Dm006D006Dmm);
        sb.append(str);
        sb.append("/fp/");
        sb.append(str3);
        if (llqllqq.g006700670067006700670067g(str2)) {
            sb.append(";CIS3SID=");
            sb.append(str2);
        }
        return sb.toString();
    }

    @Nonnull
    public nllnlll g0067gggg0067g(@Nonnull String str, @Nullable String str2) {
        nllnlll nllnlllVar = new nllnlll();
        nllnlllVar.dd006400640064d0064("org_id", this.m006D006Dmm006Dm);
        nllnlllVar.dd006400640064d0064("session_id", str);
        nllnlllVar.dd006400640064d0064("os", lqlllll.yy00790079y0079y());
        nllnlllVar.dd006400640064d0064("osVersion", nnlllnn.nnnnnln.nlnnnln.sss0073ss0073);
        nllnlllVar.dd006400640064d0064(k.a.r, "7.6-46 : RL");
        String str3 = this.m006Dmmm006Dm;
        if (str3 != null && !str3.isEmpty()) {
            nllnlllVar.dd006400640064d0064("api_key", this.m006Dmmm006Dm);
        }
        if (llqllqq.g006700670067006700670067g(str2)) {
            nllnlllVar.dd006400640064d0064("thx", str2);
        }
        return nllnlllVar;
    }

    @Nonnull
    public String gg0067ggg0067g() {
        return YU.a.o(new StringBuilder(m006Dm006D006Dmm), this.mm006Dmm006Dm, "/fp/mobile/conf");
    }
}
