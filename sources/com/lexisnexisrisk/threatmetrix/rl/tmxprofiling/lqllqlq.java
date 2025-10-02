package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingmodule.BuildConfig;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class lqllqlq extends nllnnnl {
    private String m006D006Dmmmm;
    private String m006Dm006Dmmm;
    private String m006Dmmmmm;
    private String mm006Dmmmm;
    private String mmm006Dmmm;

    public lqllqlq(long j) {
        super(j);
    }

    private String g0067gg00670067gg(@Nonnull lqlllql lqlllqlVar, String str, nlllnnl nlllnnlVar) {
        String str2 = nlllnnlVar.ww0077w007700770077.getApplicationInfo().nativeLibraryDir;
        String strHh00680068hhh = lqlllqlVar.hh00680068hhh(str);
        return (llqllqq.g006700670067006700670067g(str2) && llqllqq.g006700670067006700670067g(strHh00680068hhh)) ? str2.concat("/lib".concat(strHh00680068hhh).concat(".so")) : "";
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public nllnnnl.nnnlnnl o006F006Foo006Fo() {
        return nllnnnl.nnnlnnl.COLLECTOR_TYPE_SELF_HASH;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void oo006Foo006Fo(nlnlnnl nlnlnnlVar, Map<String, String> map) throws InterruptedException {
        if (nlnlnnlVar.d0064dd0064dd() == null || nlnlnnlVar.d0064d00640064dd() == null) {
            return;
        }
        if (this.m006Dmmmmm == null) {
            this.m006Dmmmmm = nnllnnn.oo006F006Fo006Fo(nlnlnnlVar.d0064dd0064dd(), nnlnlll.MD5);
            this.mm006Dmmmm = nnllnnn.oo006F006Fo006Fo(nlnlnnlVar.d0064dd0064dd(), nnlnlll.SHA256);
        }
        String str = nlnlnnlVar.d0064dd0064dd().ww0077w007700770077.getApplicationInfo().nativeLibraryDir;
        if (llqllqq.g006700670067006700670067g(str)) {
            this.m006D006Dmmmm = lllqlql.h0068hhhh0068().h006800680068hh0068(str.concat("/lib".concat(BuildConfig.JNI_FILENAME).concat(".so")));
        }
        String strG0067gg00670067gg = g0067gg00670067gg(nlnlnnlVar.d0064d00640064dd(), lllllql.pp0070p0070p0070, nlnlnnlVar.d0064dd0064dd());
        if (llqllqq.g006700670067006700670067g(strG0067gg00670067gg)) {
            this.m006Dm006Dmmm = lllqlql.h0068hhhh0068().h006800680068hh0068(strG0067gg00670067gg);
        }
        String strG0067gg00670067gg2 = g0067gg00670067gg(nlnlnnlVar.d0064d00640064dd(), lllllql.p00700070p0070p0070, nlnlnnlVar.d0064dd0064dd());
        if (llqllqq.g006700670067006700670067g(strG0067gg00670067gg2)) {
            this.mmm006Dmmm = lllqlql.h0068hhhh0068().h006800680068hh0068(strG0067gg00670067gg2);
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nllnnnl
    public void ooo006Fo006Fo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (llqllqq.g006700670067006700670067g(this.m006Dmmmmm)) {
            map.put(lqqqqql.APP_SELF_HASH_MD5.jj006Ajj006A006A(), this.m006Dmmmmm);
        }
        if (llqllqq.g006700670067006700670067g(this.mm006Dmmmm)) {
            map.put(lqqqqql.APP_SELF_HASH_SHA256.jj006Ajj006A006A(), this.mm006Dmmmm);
        }
        if (llqllqq.g006700670067006700670067g(this.m006D006Dmmmm)) {
            map.put(lqqqqql.SELF_HASH_BASE_MODULE.jj006Ajj006A006A(), this.m006D006Dmmmm);
        }
        if (llqllqq.g006700670067006700670067g(this.m006Dm006Dmmm)) {
            map.put(lqqqqql.SELF_HASH_AUTH_MODULE.jj006Ajj006A006A(), this.m006Dm006Dmmm);
        }
        if (llqllqq.g006700670067006700670067g(this.mmm006Dmmm)) {
            map.put(lqqqqql.SELF_HASH_DSH_MODULE.jj006Ajj006A006A(), this.mmm006Dmmm);
        }
    }
}
