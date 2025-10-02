package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class jxjjjjx extends nllnnnl {
    public String i0069i0069006900690069;

    public jxjjjjx(long j, boolean z) {
        super(j, z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_USER_PERM;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064006400640064dd() == null || nlnlnnlVar.d0064006400640064dd().tt00740074ttt.isEmpty()) {
            return;
        }
        this.i0069i0069006900690069 = lqlllll.y00790079yy00790079(nlnlnnlVar.d0064dd0064dd().ww0077w007700770077, nlnlnnlVar.d0064006400640064dd().tt00740074ttt);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || llqllqq.ggggggg0067(this.i0069i0069006900690069)) {
            return;
        }
        map.put(lqqqqql.USER_PERMISSIONS.jj006Ajj006A006A(), this.i0069i0069006900690069);
    }
}
