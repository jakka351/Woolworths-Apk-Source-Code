package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import androidx.constraintlayout.core.state.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.nio.charset.Charset;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqqqqll extends nllnnnl {
    private static final int p00700070ppp0070 = 4;
    private static final int p0070pppp0070 = 1;
    private static final int pp0070ppp0070 = 2;
    private static final String pppppp0070 = lqlqqll.u00750075u00750075u(lqqqqll.class);
    public int p0070p0070pp0070;

    @Nullable
    private final lllqqql ppp0070pp0070;

    public lqqqqll(long j, boolean z, lllqqql lllqqqlVar) {
        super(j, z);
        this.ppp0070pp0070 = lllqqqlVar;
    }

    private int u007500750075uu0075(@Nonnull nlllnnl nlllnnlVar, String str, String str2) {
        int i;
        String strY0079y0079yyy = lqlllll.y0079y0079yyy();
        if (strY0079y0079yyy != null) {
            lqlqqll.llqqqll.uuu0075uuu(pppppp0070, "Hooking application detected ".concat(strY0079y0079yyy));
            i = 1;
        } else {
            i = 0;
        }
        if (!lllqlql.h0068hhhh0068().h00680068h0068h0068() && lllqlql.h0068hhhh0068().hhh00680068h0068()) {
            i |= 2;
        }
        if (llqllqq.g00670067g006700670067g(str) && uuuu0075u0075(lllqqql.cc0063c0063cc, str, null, false)) {
            i |= 4;
        }
        return uuuu0075u0075(lllqqql.c006300630063ccc, str2, lqqlqqq.g00670067gg006700670067(nlllnnlVar), true) ? i | 4 : i;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_MALICIOUS_APPS;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064d00640064dd() == null || map == null || this.p0070p0070pp0070 != 0) {
            return;
        }
        this.p0070p0070pp0070 = u007500750075uu0075(nlnlnnlVar.d0064dd0064dd(), map.get(lqqqqql.ADVERTISING_ID.jj006Ajj006A006A()), nlnlnnlVar.d00640064d0064dd());
        if (nlnlnnlVar.d0064d00640064dd().h0068hh0068hh()) {
            this.p0070p0070pp0070 |= 2;
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null || this.p0070p0070pp0070 == 0) {
            return;
        }
        map.put(lqqqqql.MALICIOUS_APP_STATUS.jj006Ajj006A006A(), String.valueOf(this.p0070p0070pp0070));
    }

    public boolean uuuu0075u0075(@Nonnull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        if (this.ppp0070pp0070 == null) {
            return false;
        }
        String strG0067g00670067gg0067 = llqllqq.ggggggg0067(str2) ? "" : llqllqq.g0067g00670067gg0067(str2.getBytes(Charset.defaultCharset()));
        String strG0067g00670067gg00672 = llqllqq.ggggggg0067(str3) ? "" : llqllqq.g0067g00670067gg0067(str3.getBytes(Charset.defaultCharset()));
        String strJ006A006Aj006A006Aj = this.ppp0070pp0070.j006A006Aj006A006Aj(str);
        if ((llqllqq.ggggggg0067(strJ006A006Aj006A006Aj) && llqllqq.g006700670067006700670067g(strG0067g00670067gg0067)) || (str2 != null && str2.equalsIgnoreCase(strJ006A006Aj006A006Aj))) {
            lqlqqll.llqqqll.yy00790079007900790079(pppppp0070, a.l(new StringBuilder(), llqllqq.ggggggg0067(strJ006A006Aj006A006Aj) ? "Storing " : "Updating ", " value of ", str, " in preference "));
            this.ppp0070pp0070.j006A006Ajjj006A(str, strG0067g00670067gg0067);
            strJ006A006Aj006A006Aj = strG0067g00670067gg0067;
        }
        String str4 = pppppp0070;
        StringBuilder sbV = YU.a.v("saved id for key ", str, " is ", strJ006A006Aj006A006Aj, " firstVal is ");
        a.B(sbV, str2, " secondVal is ", str3, " is second valid ");
        sbV.append(z);
        lqlqqll.llqqqll.yy00790079007900790079(str4, sbV.toString());
        return llqllqq.ggggggg0067(strG0067g00670067gg0067) ? (z && llqllqq.g006700670067006700670067g(strG0067g00670067gg00672)) || llqllqq.g006700670067006700670067g(strJ006A006Aj006A006Aj) : (z && !strG0067g00670067gg0067.equalsIgnoreCase(strG0067g00670067gg00672)) || !strG0067g00670067gg0067.equalsIgnoreCase(strJ006A006Aj006A006Aj);
    }
}
