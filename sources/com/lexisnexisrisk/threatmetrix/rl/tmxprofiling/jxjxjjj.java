package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jxjxjjj extends nllnnnl {
    public static final int q00710071q0071q0071 = 4;
    public static final int q0071q00710071q0071 = 21;
    public static final int qq007100710071q0071 = 42;
    public static final int qq0071q0071q0071 = 0;
    public static final int qqq00710071q0071 = 6;
    private final Map<String, String> q0071007100710071q0071;

    public jxjxjjj(long j, boolean z) {
        super(j, z);
        this.q0071007100710071q0071 = new HashMap();
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_TAMPER_CODE;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064d00640064dd() == null || nlnlnnlVar.d0064006400640064dd() == null) {
            return;
        }
        int iWwwww00770077w = wwwww00770077w(nlnlnnlVar.d0064006400640064dd().g00670067g006700670067);
        int i = (iWwwww00770077w < 0 || iWwwww00770077w >= 21) ? (iWwwww00770077w < 22 || iWwwww00770077w >= 42) ? 0 : 6 : 4;
        this.q0071007100710071q0071.put(lqqqqql.TAMPER_CODE_BASE_MODULE.jj006Ajj006A006A(), Long.toString(llqllqq.ggg00670067g0067g(lllqlql.h0068hhhh0068().hh00680068hh0068(iWwwww00770077w), i)));
        this.q0071007100710071q0071.put(lqqqqql.TAMPER_CODE_AUTH_MODULE.jj006Ajj006A006A(), Long.toString(llqllqq.ggg00670067g0067g(nlnlnnlVar.d0064d00640064dd().h0068h0068hhh(lllllql.pp0070p0070p0070, iWwwww00770077w).longValue(), i)));
        this.q0071007100710071q0071.put(lqqqqql.TAMPER_CODE_BB_MODULE.jj006Ajj006A006A(), Long.toString(llqllqq.ggg00670067g0067g(nlnlnnlVar.d0064d00640064dd().h0068h0068hhh(lllllql.p0070pp0070p0070, iWwwww00770077w).longValue(), i)));
        this.q0071007100710071q0071.put(lqqqqql.TAMPER_CODE_DSH_MODULE.jj006Ajj006A006A(), Long.toString(llqllqq.ggg00670067g0067g(nlnlnnlVar.d0064d00640064dd().h0068h0068hhh(lllllql.p00700070p0070p0070, iWwwww00770077w).longValue(), i)));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        lqqqqql lqqqqqlVar = lqqqqql.TAMPER_CODE_BASE_MODULE;
        map.put(lqqqqqlVar.jj006Ajj006A006A(), this.q0071007100710071q0071.get(lqqqqqlVar.jj006Ajj006A006A()));
        lqqqqql lqqqqqlVar2 = lqqqqql.TAMPER_CODE_AUTH_MODULE;
        map.put(lqqqqqlVar2.jj006Ajj006A006A(), this.q0071007100710071q0071.get(lqqqqqlVar2.jj006Ajj006A006A()));
        lqqqqql lqqqqqlVar3 = lqqqqql.TAMPER_CODE_BB_MODULE;
        map.put(lqqqqqlVar3.jj006Ajj006A006A(), this.q0071007100710071q0071.get(lqqqqqlVar3.jj006Ajj006A006A()));
        lqqqqql lqqqqqlVar4 = lqqqqql.TAMPER_CODE_DSH_MODULE;
        map.put(lqqqqqlVar4.jj006Ajj006A006A(), this.q0071007100710071q0071.get(lqqqqqlVar4.jj006Ajj006A006A()));
    }

    public int wwwww00770077w(String str) {
        int iGg00670067g00670067g = llqllqq.gg00670067g00670067g(str);
        return ((iGg00670067g00670067g % 3) * 21) + (iGg00670067g00670067g % 20);
    }
}
