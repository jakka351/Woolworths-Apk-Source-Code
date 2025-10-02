package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nllnnll extends nllnnnl {
    private static final String e00650065e0065e0065 = lqlqqll.u00750075u00750075u(nllnnll.class);
    private String e0065e00650065e0065;
    private String eee00650065e0065;

    public nllnnll(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_FONT;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (this.e0065e00650065e0065 == null || this.eee00650065e0065 == null) {
            StringBuilder sb = new StringBuilder();
            String strY0079yyyy0079 = lqlllll.y0079yyyy0079(sb);
            this.eee00650065e0065 = strY0079yyyy0079;
            if (strY0079yyyy0079 != null) {
                this.e0065e00650065e0065 = sb.toString();
            }
            lqlqqll.llqqqll.yy00790079007900790079(e00650065e0065e0065, "Got " + this.e0065e00650065e0065 + " fonts gives: " + this.eee00650065e0065);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.DEVICE_FONT_COUNT.jj006Ajj006A006A(), this.e0065e00650065e0065);
        map.put(lqqqqql.DEVICE_FONT_HASH.jj006Ajj006A006A(), llqllqq.g0067006700670067gg0067(this.eee00650065e0065));
    }
}
