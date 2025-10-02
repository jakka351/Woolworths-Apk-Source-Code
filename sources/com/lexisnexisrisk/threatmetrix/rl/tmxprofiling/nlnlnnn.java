package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class nlnlnnn extends nllnnnl {
    private static final String x00780078x0078x0078 = lqlqqll.u00750075u00750075u(nlnlnnn.class);
    public static final int xxx00780078x0078 = 300;
    public long x0078x00780078x0078;
    public long xx007800780078x0078;

    public nlnlnnn(long j) {
        super(j);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_APP_INSTALLATION;
    }

    public void o006Fo006Fo006Fo() {
        long j = this.x0078x00780078x0078;
        long j2 = this.xx007800780078x0078;
        if (j <= j2) {
            return;
        }
        if (j - j2 >= 300) {
            String str = x00780078x0078x0078;
            Locale locale = Locale.ENGLISH;
            long j3 = this.xx007800780078x0078;
            StringBuilder sbT = b.t(j, "installTime[", "], modifyTime[");
            sbT.append(j3);
            sbT.append("]");
            lqlqqll.uuu007500750075u(str, "App install time is later than modify time: ".concat(sbT.toString()));
            this.x0078x00780078x0078 = 0L;
        }
        this.xx007800780078x0078 = 0L;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() != null && this.x0078x00780078x0078 == 0 && this.xx007800780078x0078 == 0) {
            this.x0078x00780078x0078 = lqlllll.y00790079y0079yy(nlnlnnlVar.d0064dd0064dd());
            this.xx007800780078x0078 = lqlllll.yyy00790079yy(nlnlnnlVar.d0064dd0064dd());
            o006Fo006Fo006Fo();
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strJj006Ajj006A006A = lqqqqql.APP_INSTALLATION_TIME.jj006Ajj006A006A();
        long j = this.x0078x00780078x0078;
        map.put(strJj006Ajj006A006A, j == 0 ? null : Long.toString(j));
        String strJj006Ajj006A006A2 = lqqqqql.APP_MODIFICATION_TIME.jj006Ajj006A006A();
        long j2 = this.xx007800780078x0078;
        map.put(strJj006Ajj006A006A2, j2 != 0 ? Long.toString(j2) : null);
    }
}
