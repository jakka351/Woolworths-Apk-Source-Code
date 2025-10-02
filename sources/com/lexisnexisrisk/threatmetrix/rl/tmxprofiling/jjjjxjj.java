package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class jjjjxjj extends nllnnnl {
    public long q00710071qq00710071;

    public jjjjxjj(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_TIMESTAMP;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        this.q00710071qq00710071 = 0L;
        this.q00710071qq00710071 = lqlllll.y00790079007900790079y("/storage/emulated");
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || this.q00710071qq00710071 == 0) {
            return;
        }
        map.put(lqqqqql.STORAGE_EMULATED_TIMESTAMP.jj006Ajj006A006A(), Long.toString(this.q00710071qq00710071));
    }
}
