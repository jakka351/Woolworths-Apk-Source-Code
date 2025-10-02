package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import com.lexisnexisrisk.threatmetrix.rl.DrmIdCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public class nnlllll {
    public String kkk006B006Bk006B;
    private static final nnlllll k006Bkk006Bk006B = new nnlllll();
    public static final Lock kk006Bk006Bk006B = new ReentrantLock();
    public static final List<nllnnnl> k006B006Bk006Bk006B = new ArrayList();

    private nnlllll() {
    }

    private void d0064dd006400640064(nllnnnl nllnnnlVar) {
        String strDd00640064ddd = nllnnnlVar.dd00640064ddd();
        if (llqllqq.g006700670067006700670067g(strDd00640064ddd)) {
            this.kkk006B006Bk006B = a.o(new StringBuilder(), this.kkk006B006Bk006B, strDd00640064ddd);
        }
    }

    public static nnlllll dd0064d006400640064() {
        return k006Bkk006Bk006B;
    }

    private void dddd006400640064(Map<String, String> map) {
        if (llqllqq.g006700670067006700670067g(this.kkk006B006Bk006B)) {
            map.put(lqqqqql.CRASH_LOG_STRING.jj006Ajj006A006A(), llqllqq.ggggg0067g0067(this.kkk006B006Bk006B, 1024));
        }
    }

    public Map<String, String> d00640064d006400640064(long j) {
        try {
            kk006Bk006Bk006B.lock();
            HashMap map = new HashMap();
            for (nllnnnl nllnnnlVar : k006B006Bk006Bk006B) {
                if (nllnnnlVar != null) {
                    nllnnnlVar.d006400640064ddd(j, map);
                }
            }
            dddd006400640064(map);
            kk006Bk006Bk006B.unlock();
            return map;
        } catch (Throwable th) {
            kk006Bk006Bk006B.unlock();
            throw th;
        }
    }

    public void d0064d0064006400640064(long j, nlnlnnl nlnlnnlVar, boolean z) throws InterruptedException {
        try {
            kk006Bk006Bk006B.lock();
            this.kkk006B006Bk006B = "";
            for (nllnnnl nllnnnlVar : k006B006Bk006Bk006B) {
                if (nllnnnlVar != null) {
                    nllnnnlVar.d0064d0064ddd(j, nlnlnnlVar, z);
                    d0064dd006400640064(nllnnnlVar);
                }
            }
        } finally {
            kk006Bk006Bk006B.unlock();
        }
    }

    public void ddd0064006400640064(lllqqql lllqqqlVar) {
        try {
            Lock lock = kk006Bk006Bk006B;
            lock.lock();
            List<nllnnnl> list = k006B006Bk006Bk006B;
            list.clear();
            list.add(new llqlqll(0L));
            list.add(new jxjjxjj(8L));
            list.add(new nnnllnl(0L));
            list.add(new nllllnl(16L));
            list.add(new nllnlnl(llqqqql.a006100610061a0061a));
            list.add(new lqllqlq(llqqqql.ccc00630063c0063));
            list.add(new nllnnll(0L));
            list.add(new nnlllnl(0L));
            list.add(new lqqqlql(llqqqql.ccccc00630063));
            list.add(new lqqqlqq(llqqqql.aa0061aa0061a));
            list.add(new llllqlq(llqqqql.c00630063cc00630063));
            list.add(new lqqqqlq(llqqqql.cccc006300630063, false));
            list.add(new nnllnnl(llqqqql.cc00630063006300630063));
            list.add(new nlnlnnn(llqqqql.a00610061aaaa));
            list.add(new llllqqq(llqqqql.a0061aaa0061a));
            list.add(new nlnnlll(llqqqql.aaaa00610061a));
            list.add(new nllnlnn(llqqqql.a0061a0061a0061a));
            list.add(new nnlnlnl(0L, false));
            lqqqqll lqqqqllVar = new lqqqqll(llqqqql.c00630063c006300630063, false, lllqqqlVar);
            lqqqqllVar.d00640064dddd(new nnnlnnn(llqqqql.cc0063cc00630063));
            lqqqqllVar.d00640064dddd(new nnnnlnl(0L, lllqqqlVar));
            list.add(lqqqqllVar);
            list.add(new llllllq(llqqqql.cc0063c006300630063, false));
            list.add(new jxjxjjj(0L, true));
            list.add(new nlnnnll(llqqqql.c006300630063c00630063, true));
            list.add(new lqqlqll(0L, true));
            list.add(new lqqqllq(llqqqql.c0063006300630063c0063, true));
            llqqlqq llqqlqqVar = new llqqlqq(llqqqql.ccc0063006300630063, true);
            llqqlqqVar.d00640064dddd(new lqqlllq(0L));
            list.add(llqqlqqVar);
            list.add(new jxjjjjx(llqqqql.a0061aa00610061a, true));
            list.add(new lllqllq(llqqqql.aa0061a00610061a, true));
            list.add(new jjjjxjj(llqqqql.a00610061a00610061a));
            list.add(new DrmIdCollector(llqqqql.aaa006100610061a, true));
            lock.unlock();
        } catch (Throwable th) {
            kk006Bk006Bk006B.unlock();
            throw th;
        }
    }
}
