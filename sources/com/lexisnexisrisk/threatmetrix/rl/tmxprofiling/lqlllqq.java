package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqlllqq extends jjxjxjx {
    private static final Method m006D006D006Dmm006D;
    private static final Method m006D006Dm006Dm006D;
    private static final Class<?> m006Dm006Dmm006D;
    private static final Method m006Dmm006Dm006D;
    private static final Method mm006D006Dmm006D;
    private static final Method mm006Dm006Dm006D;
    private static final Method mmmm006Dm006D;

    @Nullable
    private final Object mmm006D006Dm006D;

    static {
        Class<?> clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.STAT_FS);
        m006Dm006Dmm006D = clsWww00770077007700770077;
        mm006D006Dmm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getBlockSize", new Class[0]);
        m006D006D006Dmm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getBlockSizeLong", new Class[0]);
        mmmm006Dm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getAvailableBlocks", new Class[0]);
        m006Dmm006Dm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getAvailableBlocksLong", new Class[0]);
        mm006Dm006Dm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getBlockCount", new Class[0]);
        m006D006Dm006Dm006D = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getBlockCountLong", new Class[0]);
    }

    public lqlllqq(String str) {
        Class<?> cls = m006Dm006Dmm006D;
        this.mmm006D006Dm006D = cls == null ? null : jjxjxjx.s0073s0073ssss(cls, new Class[]{String.class}, new Object[]{str});
    }

    public long g00670067g0067g0067g() {
        Integer num;
        Long l;
        Method method = m006D006D006Dmm006D;
        if (method != null && (l = (Long) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = mm006D006Dmm006D;
        if (method2 == null || (num = (Integer) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method2, new Object[0])) == null) {
            return 0L;
        }
        return num.intValue();
    }

    public long g0067gg0067g0067g() {
        Integer num;
        Long l;
        Method method = m006Dmm006Dm006D;
        if (method != null && (l = (Long) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = mmmm006Dm006D;
        if (method2 == null || (num = (Integer) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method2, new Object[0])) == null) {
            return 0L;
        }
        return num.intValue();
    }

    public long gg0067g0067g0067g() {
        Integer num;
        Long l;
        Method method = m006D006Dm006Dm006D;
        if (method != null && (l = (Long) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = mm006Dm006Dm006D;
        if (method2 == null || (num = (Integer) jjxjxjx.s0073ss0073sss(this.mmm006D006Dm006D, method2, new Object[0])) == null) {
            return 0L;
        }
        return num.intValue();
    }
}
