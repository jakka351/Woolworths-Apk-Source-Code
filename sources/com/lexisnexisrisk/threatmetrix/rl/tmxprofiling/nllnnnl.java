package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public abstract class nllnnnl {
    private static final String w0077ww0077w0077 = lqlqqll.u00750075u00750075u(nllnnnl.class);
    private final boolean w00770077w0077w0077;
    private String w0077w00770077w0077;
    private final long ww0077w0077w0077;
    private List<nllnnnl> www00770077w0077;

    public enum nnnlnnl {
        COLLECTOR_TYPE_LOCALE_INFO("li"),
        COLLECTOR_TYPE_TIMEZONE_INFO("ti"),
        COLLECTOR_TYPE_DEVICE_NAME("dn"),
        COLLECTOR_TYPE_COOKIE("ci"),
        COLLECTOR_TYPE_SIM("si"),
        COLLECTOR_TYPE_DISPLAY("di"),
        COLLECTOR_TYPE_DEVICEINFO("dfi"),
        COLLECTOR_TYPE_SELF_HASH("shi"),
        COLLECTOR_TYPE_FONT("fi"),
        COLLECTOR_TYPE_DEVICE_STATE("dsi"),
        COLLECTOR_TYPE_NETWORK("ni"),
        COLLECTOR_TYPE_SUBSCRIBER("sin"),
        COLLECTOR_TYPE_ADVERTISING_ID("ai"),
        COLLECTOR_TYPE_SELINUX_MODE("sm"),
        COLLECTOR_TYPE_SHARED_LIB("sli"),
        COLLECTOR_TYPE_CONNECTIONS("cin"),
        COLLECTOR_TYPE_APP_INSTALLATION("ini"),
        COLLECTOR_TYPE_SYSTEM_PROXY("pi"),
        COLLECTOR_TYPE_MALICIOUS_APPS("mai"),
        COLLECTOR_TYPE_DEVICE("dei"),
        COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS("den"),
        COLLECTOR_TYPE_PLUGIN_DETECTION("pdi"),
        COLLECTOR_TYPE_TAMPER_CODE("tc"),
        COLLECTOR_TYPE_EMULATOR("epi"),
        COLLECTOR_TYPE_LOCATION("loi"),
        COLLECTOR_TYPE_ROOT_DETECTION("rdi"),
        COLLECTOR_TYPE_PUSH_TOKEN("pti"),
        COLLECTOR_TYPE_FINGERPRINT_CAPS("fci"),
        COLLECTOR_TYPE_STRONG_ID("sii"),
        COLLECTOR_TYPE_PHONE_CALL("pci"),
        COLLECTOR_TYPE_USER_PERM("upi"),
        COLLECTOR_TYPE_RAT("rtdi"),
        COLLECTOR_TYPE_TIMESTAMP("tsi"),
        COLLECTOR_TYPE_DRM("drm");

        private final String ww007700770077w0077;

        nnnlnnl(String str) {
            this.ww007700770077w0077 = str;
        }

        public static nnnlnnl valueOf(String str) {
            return (nnnlnnl) nlnnnnn.ooo006F006Foo(nnnlnnl.class, str);
        }

        public String dd0064dddd() {
            return this.ww007700770077w0077;
        }
    }

    public nllnnnl(long j) {
        this(j, false);
    }

    private void ddd0064ddd(@Nullable lqllllq lqllllqVar) throws InterruptedException {
        if (lqllllqVar != null && lqllllqVar.j006Ajj006A006A006A()) {
            throw new InterruptedException();
        }
    }

    public void d006400640064ddd(long j, Map<String, String> map) {
        if (map == null) {
            return;
        }
        List<nllnnnl> list = this.www00770077w0077;
        if (list != null && !list.isEmpty()) {
            Iterator<nllnnnl> it = this.www00770077w0077.iterator();
            while (it.hasNext()) {
                it.next().d006400640064ddd(j, map);
            }
        }
        long j2 = this.ww0077w0077w0077;
        if (j2 == 0 || (j & j2) != 0) {
            ooo006Fo006Fo(map);
        }
    }

    public void d00640064dddd(nllnnnl nllnnnlVar) {
        if (nllnnnlVar == null) {
            return;
        }
        if (this.www00770077w0077 == null) {
            this.www00770077w0077 = new ArrayList();
        }
        this.www00770077w0077.add(nllnnnlVar);
    }

    public void d0064d0064ddd(long j, nlnlnnl nlnlnnlVar, boolean z) throws InterruptedException {
        HashMap map;
        if (nlnlnnlVar == null) {
            return;
        }
        this.w0077w00770077w0077 = "";
        try {
            List<nllnnnl> list = this.www00770077w0077;
            if (list == null || list.isEmpty()) {
                map = null;
            } else {
                map = new HashMap();
                for (nllnnnl nllnnnlVar : this.www00770077w0077) {
                    if (nllnnnlVar != null) {
                        nllnnnlVar.d0064d0064ddd(j, nlnlnnlVar, z);
                        nllnnnlVar.d006400640064ddd(j, map);
                        if (llqllqq.g006700670067006700670067g(nllnnnlVar.dd00640064ddd())) {
                            this.w0077w00770077w0077 += nllnnnlVar.dd00640064ddd();
                        }
                    }
                }
            }
            if (this.w00770077w0077w0077 == z) {
                ddd0064ddd(nlnlnnlVar.dd006400640064dd());
                long j2 = this.ww0077w0077w0077;
                if (j2 == 0 || (j & j2) != 0) {
                    long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
                    oo006Foo006Fo(nlnlnnlVar, map);
                    if (o006F006Foo006Fo() != null) {
                        jjxxjjj.ww0077ww00770077w().w0077www00770077w(o006F006Foo006Fo().dd0064dddd(), Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
                    }
                }
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th) {
            this.w0077w00770077w0077 += th;
            if (o006F006Foo006Fo() != null) {
                this.w0077w00770077w0077 += "(" + o006F006Foo006Fo().dd0064dddd() + ");";
            }
            lqlqqll.uuuu00750075u(w0077ww0077w0077, "exception occurred: " + th);
        }
    }

    public String dd00640064ddd() {
        return this.w0077w00770077w0077;
    }

    @Nullable
    public abstract nnnlnnl o006F006Foo006Fo();

    public abstract void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException;

    public abstract void ooo006Fo006Fo(Map<String, String> map);

    public nllnnnl(long j, boolean z) {
        this.ww0077w0077w0077 = j;
        this.w00770077w0077w0077 = z;
    }
}
