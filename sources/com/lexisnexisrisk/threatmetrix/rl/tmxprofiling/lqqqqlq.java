package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import java.util.Map;

/* loaded from: classes6.dex */
public class lqqqqlq extends nllnnnl {
    private jjxjxjj.jxxjxjj mm006D006D006D006Dm;

    public lqqqqlq(long j, boolean z) {
        super(j, z);
    }

    private String g0067g0067gg0067g() {
        boolean z;
        if (this.mm006D006D006D006Dm == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z2 = false;
        if (this.mm006D006D006D006Dm.vv007600760076vv >= 0) {
            sb.append("\"mlc\":");
            sb.append(this.mm006D006D006D006Dm.vv007600760076vv);
            z = false;
        } else {
            z = true;
        }
        if (this.mm006D006D006D006Dm.v0076007600760076vv >= 0) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append("\"mls\":");
            sb.append(this.mm006D006D006D006Dm.v0076007600760076vv);
        }
        if (this.mm006D006D006D006Dm.vvv00760076vv >= 0) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append("\"slc\":");
            sb.append(this.mm006D006D006D006Dm.vvv00760076vv);
        }
        if (this.mm006D006D006D006Dm.v0076v00760076vv >= 0) {
            if (!z) {
                sb.append(",");
                z2 = z;
            }
            sb.append("\"sls\":");
            sb.append(this.mm006D006D006D006Dm.v0076v00760076vv);
            z = z2;
        }
        jjxjxjj.jxxjxjj jxxjxjjVar = this.mm006D006D006D006Dm;
        if (jxxjxjjVar.vvvvv0076v || jxxjxjjVar.vv007600760076vv >= 0 || jxxjxjjVar.v0076007600760076vv >= 0) {
            if (!z) {
                sb.append(",");
            }
            sb.append("\"tda\":");
            sb.append(this.mm006D006D006D006Dm.vvvvv0076v);
        }
        sb.append("}");
        return sb.length() > 2 ? sb.toString() : "";
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_SHARED_LIB;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (this.mm006D006D006D006Dm == null) {
            this.mm006D006D006D006Dm = lqlllll.y0079yy0079y0079();
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(lqqqqql.SHARED_LIB_INFO.jj006Ajj006A006A(), g0067g0067gg0067g());
    }
}
