package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class jxjjxjj extends nllnnnl {
    private int q0071q0071q00710071;
    private String qq00710071q00710071;
    private int qqq0071q00710071;

    public jxjjxjj(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_TIMEZONE_INFO;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) {
        this.q0071q0071q00710071 = 0;
        this.qqq0071q00710071 = 0;
        this.qq00710071q00710071 = null;
        lqlllll.llqqlll llqqlllVar = new lqlllll.llqqlll();
        if (lqlllll.y0079yyy00790079(llqqlllVar)) {
            this.q0071q0071q00710071 = llqqlllVar.p0070pp0070pp;
            this.qqq0071q00710071 = llqqlllVar.pppp0070pp;
        }
        this.qq00710071q00710071 = TimeZone.getDefault().getID();
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.TIMEZONE_GMT_OFFSET.jj006Ajj006A006A(), String.valueOf(this.qqq0071q00710071));
        map.put(lqqqqql.TIMEZONE_DST_DIFF.jj006Ajj006A006A(), String.valueOf(this.q0071q0071q00710071));
        map.put(lqqqqql.TIMEZONE_NAME.jj006Ajj006A006A(), this.qq00710071q00710071);
    }
}
