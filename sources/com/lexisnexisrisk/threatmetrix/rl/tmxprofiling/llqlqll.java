package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class llqlqll extends nllnnnl {
    private String ppp00700070pp;

    public llqlqll(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_LOCALE_INFO;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) {
        if (this.ppp00700070pp == null) {
            this.ppp00700070pp = lqlllll.yy00790079yy0079();
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || this.ppp00700070pp == null) {
            return;
        }
        map.put(lqqqqql.AGENT_LOCALE.jj006Ajj006A006A(), this.ppp00700070pp);
    }
}
