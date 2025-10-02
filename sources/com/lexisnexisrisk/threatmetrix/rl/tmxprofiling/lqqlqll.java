package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class lqqlqll extends nllnnnl {
    public static final int p0070007000700070pp = 4;
    public static final int p0070p00700070pp = 1;
    public static final int pp007000700070pp = 2;
    private String p00700070pp0070p;
    private String p0070p0070p0070p;
    private String p0070ppp0070p;
    private String pp0070pp0070p;
    private String ppp0070p0070p;
    private String ppppp0070p;

    public lqqlqll(long j, boolean z) {
        super(j, z);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_LOCATION;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.ddd00640064dd() == null) {
            return;
        }
        this.ppppp0070p = String.valueOf(nlnlnnlVar.ddd00640064dd().v0076v0076vvv);
        this.p0070ppp0070p = String.valueOf(nlnlnnlVar.ddd00640064dd().vv00760076vvv);
        this.pp0070pp0070p = String.valueOf(nlnlnnlVar.ddd00640064dd().vvvv0076vv);
        this.p00700070pp0070p = nlnlnnlVar.ddd00640064dd().v007600760076vvv == null ? "" : String.valueOf(nlnlnnlVar.ddd00640064dd().v007600760076vvv);
        this.ppp0070p0070p = nlnlnnlVar.ddd00640064dd().v0076vv0076vv != null ? String.valueOf(nlnlnnlVar.ddd00640064dd().v0076vv0076vv) : "";
        int i = lqlllll.yy00790079y00790079(nlnlnnlVar.d0064dd0064dd()) ? 2 : 0;
        if (nlnlnnlVar.ddd00640064dd().vv0076v0076vv) {
            i |= 1;
        }
        if (nlnlnnlVar.ddd00640064dd().v00760076v0076vv) {
            i |= 4;
        }
        this.p0070p0070p0070p = String.valueOf(i);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.LOCATION_LATITUDE.jj006Ajj006A006A(), this.ppppp0070p);
        map.put(lqqqqql.LOCATION_LONGITUDE.jj006Ajj006A006A(), this.p0070ppp0070p);
        map.put(lqqqqql.LOCATION_ALTITUDE.jj006Ajj006A006A(), this.pp0070pp0070p);
        map.put(lqqqqql.LOCATION_ACCURACY.jj006Ajj006A006A(), this.p00700070pp0070p);
        map.put(lqqqqql.LOCATION_VERTICAL_ACCURACY.jj006Ajj006A006A(), this.ppp0070p0070p);
        map.put(lqqqqql.LOCATION_MOCK_STATUS.jj006Ajj006A006A(), this.p0070p0070p0070p);
    }
}
