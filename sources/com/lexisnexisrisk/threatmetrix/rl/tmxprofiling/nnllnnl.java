package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class nnllnnl extends nllnnnl {
    private static final String wwww007700770077 = lqlqqll.u00750075u00750075u(nnllnnl.class);
    public String w0077ww007700770077;

    public nnllnnl(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_CONNECTIONS;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        String str;
        if (nlnlnnlVar.d0064dd0064dd() == null) {
            return;
        }
        String strHh0068006800680068h = lllqlql.h0068hhhh0068().hh0068006800680068h(nlnlnnlVar.d0064dd0064dd());
        this.w0077ww007700770077 = strHh0068006800680068h;
        String str2 = wwww007700770077;
        if (strHh0068006800680068h == null) {
            str = "No connections info";
        } else {
            str = "Get connections info" + this.w0077ww007700770077;
        }
        lqlqqll.llqqqll.yy00790079007900790079(str2, str);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.CONNECTIONS_INFO.jj006Ajj006A006A(), llqllqq.ggggg0067g0067(this.w0077ww007700770077, 1024));
    }
}
