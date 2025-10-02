package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class llllqlq extends nllnnnl {
    private lqqlqlq aa00610061006100610061;

    public llllqlq(long j) {
        super(j);
        this.aa00610061006100610061 = lqqlqlq.NOT_CHECKED;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_SELINUX_MODE;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        this.aa00610061006100610061 = lqlllll.y0079y00790079y0079();
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strJj006Ajj006A006A = lqqqqql.SELINUX_MODE.jj006Ajj006A006A();
        lqqlqlq lqqlqlqVar = this.aa00610061006100610061;
        map.put(strJj006Ajj006A006A, lqqlqlqVar == null ? null : lqqlqlqVar.identifier());
    }
}
