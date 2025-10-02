package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class llqqlqq extends nllnnnl {
    private static final String g0067g0067g0067g = lqlqqll.u00750075u00750075u(llqqlqq.class);
    private lqqllqq gg00670067g0067g;

    public llqqlqq(long j, boolean z) {
        super(j, z);
        this.gg00670067g0067g = null;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_STRONG_ID;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        String str;
        if (map == null || nlnlnnlVar.d0064d00640064dd() == null || nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064006400640064dd() == null) {
            return;
        }
        String str2 = map.get(lqqqqql.FIREBASE_PUSH_TOKEN.jj006Ajj006A006A());
        String strConcat = str2 != null ? "".concat(str2) : "";
        if (nlnlnnlVar.dd0064d0064dd() != null && (str = nlnlnnlVar.dd0064d0064dd().get(lqqqqql.STRONG_AUTH_STATUS.jj006Ajj006A006A())) != null) {
            strConcat = strConcat.concat(str);
        }
        nnnnlnn nnnnlnnVarUu00750075007500750075 = nlnlnnlVar.d0064d00640064dd().uu00750075007500750075();
        if (nnnnlnnVarUu00750075007500750075 != null && nnnnlnnVarUu00750075007500750075.ooo006F006F006Fo()) {
            this.gg00670067g0067g = nnnnlnnVarUu00750075007500750075.o006Foo006F006Fo(nlnlnnlVar.d0064006400640064dd().g00670067g006700670067, strConcat, nlnlnnlVar.d0064dd0064dd().ww0077w007700770077);
        } else if (lllqlqq.isAvailable(nlnlnnlVar.d0064dd0064dd().ww0077w007700770077)) {
            this.gg00670067g0067g = lllqlqq.gg00670067g0067g0067(nlnlnnlVar.d0064006400640064dd().g00670067g006700670067, nlnlnnlVar.d0064dd0064dd(), strConcat);
            lqlqqll.llqqqll.yy00790079007900790079(g0067g0067g0067g, "Hardware key is available");
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        lqqllqq lqqllqqVar;
        if (map == null || (lqqllqqVar = this.gg00670067g0067g) == null) {
            return;
        }
        map.putAll(lqqllqqVar.g0067g0067g0067g0067());
    }
}
