package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class nlnnnll extends nllnnnl {
    public String e0065eeee0065;
    public String ee0065eee0065;

    public nlnnnll(long j, boolean z) {
        super(j, z);
    }

    public String d00640064ddd0064() {
        String[] strArr;
        String str = nnlllnn.nnnnnln.ss0073007300730073s;
        if (ddd0064dd0064(str)) {
            return str;
        }
        String str2 = nnlllnn.nnnnnln.s00730073007300730073s;
        if (ddd0064dd0064(str2)) {
            return str2;
        }
        if (nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ss00730073s00730073 && (strArr = nnlllnn.nnnnnln.ssssss0073) != null && strArr.length != 0) {
            for (String str3 : strArr) {
                if (ddd0064dd0064(str3)) {
                    return str3;
                }
            }
        }
        return null;
    }

    public boolean ddd0064dd0064(String str) {
        return "x86_64".equals(str) || "x86".equals(str) || "i386".equals(str);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_EMULATOR;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        ArrayList arrayList = new ArrayList(2);
        String strD00640064ddd0064 = d00640064ddd0064();
        if (strD00640064ddd0064 != null) {
            arrayList.add("cpu_abi:".concat(strD00640064ddd0064));
        }
        String strH0068h006800680068h = lllqlql.h0068hhhh0068().h0068h006800680068h();
        if (strH0068h006800680068h != null && ddd0064dd0064(strH0068h006800680068h)) {
            arrayList.add("arch:".concat(strH0068h006800680068h));
        }
        if (nlnlnnlVar.d0064dd0064dd() != null && nlnlnnlVar.d0064006400640064dd() != null && !nlnlnnlVar.d0064006400640064dd().tt0074tttt.isEmpty()) {
            arrayList.addAll(lqlllll.yy00790079yyy(nlnlnnlVar.d0064dd0064dd(), nlnlnnlVar.d0064006400640064dd().tt0074tttt));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.e0065eeee0065 = String.valueOf(arrayList.size());
        this.ee0065eee0065 = llqllqq.gg0067gggg0067(arrayList, ";", true);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.EM_PATH_COUNT.jj006Ajj006A006A(), this.e0065eeee0065);
        map.put(lqqqqql.EM_PATH_STR.jj006Ajj006A006A(), llqllqq.ggggg0067g0067(this.ee0065eee0065, 1024));
    }
}
