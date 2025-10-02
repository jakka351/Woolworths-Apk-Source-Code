package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnlnnll {

    @Nullable
    private static final Method e006500650065ee0065;
    private static final String e00650065eee0065 = lqlqqll.u00750075u00750075u(nnlnnll.class);

    @Nullable
    private static final Method e0065e0065ee0065;
    private static final boolean e0065ee0065e0065;

    @Nullable
    private static final Method ee00650065ee0065;
    private static Object ee0065e0065e0065;

    @Nullable
    private static final Method eee0065ee0065;

    @Nullable
    private static final Method eeee0065e0065;

    static {
        Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.FIREBASE_INSTANCE_ID);
        Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.FIREBASE_MESSAGING);
        Class clsWww007700770077007700773 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.TASK);
        Method methodSs00730073ssss = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getInstance", new Class[0]);
        Method methodSs00730073ssss2 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getToken", new Class[0]);
        if (methodSs00730073ssss == null || methodSs00730073ssss2 == null) {
            methodSs00730073ssss = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getInstance", new Class[0]);
            methodSs00730073ssss2 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getToken", new Class[0]);
            ee00650065ee0065 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "isComplete", new Class[0]);
            e006500650065ee0065 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "isSuccessful", new Class[0]);
            eeee0065e0065 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "getResult", new Class[0]);
            e0065ee0065e0065 = false;
        } else {
            e0065ee0065e0065 = true;
            ee00650065ee0065 = null;
            e006500650065ee0065 = null;
            eeee0065e0065 = null;
        }
        eee0065ee0065 = methodSs00730073ssss;
        e0065e0065ee0065 = methodSs00730073ssss2;
    }

    private nnlnnll() {
    }

    public static void d006400640064dd0064() {
        Object objS0073ss0073sss;
        if (dd00640064dd0064() && (objS0073ss0073sss = jjxjxjx.s0073ss0073sss(null, eee0065ee0065, new Object[0])) != null) {
            ee0065e0065e0065 = jjxjxjx.s0073ss0073sss(objS0073ss0073sss, e0065e0065ee0065, new Object[0]);
        }
    }

    public static String d0064d0064dd0064() {
        String str;
        String str2;
        Object obj = ee0065e0065e0065;
        if (obj == null) {
            return null;
        }
        if (e0065ee0065e0065) {
            lqlqqll.llqqqll.yy00790079007900790079(e00650065eee0065, "Host app has FirebaseInstanceId, token is " + ee0065e0065e0065);
            Object obj2 = ee0065e0065e0065;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
            return null;
        }
        Object objS0073ss0073sss = jjxjxjx.s0073ss0073sss(obj, ee00650065ee0065, new Object[0]);
        Object objS0073ss0073sss2 = jjxjxjx.s0073ss0073sss(ee0065e0065e0065, e006500650065ee0065, new Object[0]);
        if ((objS0073ss0073sss instanceof Boolean) && (objS0073ss0073sss2 instanceof Boolean)) {
            Boolean bool = Boolean.FALSE;
            if (bool.equals(objS0073ss0073sss) || bool.equals(objS0073ss0073sss2)) {
                str = e00650065eee0065;
                str2 = "Host app has FirebaseMessaging, task is not completed or wasn't successful";
            } else {
                Object objS0073ss0073sss3 = jjxjxjx.s0073ss0073sss(ee0065e0065e0065, eeee0065e0065, new Object[0]);
                if (objS0073ss0073sss3 instanceof String) {
                    lqlqqll.llqqqll.yy00790079007900790079(e00650065eee0065, "Host app has FirebaseMessaging, token is " + objS0073ss0073sss3);
                    return (String) objS0073ss0073sss3;
                }
                str = e00650065eee0065;
                str2 = "Host app has FirebaseMessaging, but getResult is not from a correct type";
            }
        } else {
            str = e00650065eee0065;
            str2 = "Host app has FirebaseMessaging, but isComplete is not from a correct type";
        }
        lqlqqll.llqqqll.yy00790079007900790079(str, str2);
        return null;
    }

    public static boolean dd00640064dd0064() {
        boolean z = (eee0065ee0065 == null || e0065e0065ee0065 == null) ? false : true;
        return e0065ee0065e0065 ? z : (!z || eeee0065e0065 == null || ee00650065ee0065 == null) ? false : true;
    }
}
