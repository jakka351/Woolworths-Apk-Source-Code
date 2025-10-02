package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class lllllql {
    private static final String p007000700070pp0070 = "NATIVE_BLOCKED";
    public static final String p00700070p0070p0070 = "MODULE_TYPE_DEVICE_SECURITY";
    public static final String p0070pp0070p0070 = "MODULE_TYPE_BIOMETRICS";
    private static final String pp00700070pp0070 = "TRUE";
    public static final String pp0070p0070p0070 = "MODULE_TYPE_AUTHENTICATION";
    private static final String pppp0070p0070 = lqlqqll.u00750075u00750075u(lllllql.class);
    public Object p0070007000700070p0070;
    private boolean p00700070pp00700070;
    public Object p0070p00700070p0070;
    private String p0070p0070p00700070;
    public Object p0070ppp00700070;
    public Object pp007000700070p0070;
    private String pp00700070p00700070;
    private Object pp0070pp00700070;
    public Object ppp00700070p0070;
    private boolean ppp0070p00700070;
    public Object ppppp00700070;

    public lllllql(Object obj, String str) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            this.ppp00700070p0070 = map.get("moduleInstance");
            this.p0070p00700070p0070 = map.get("getTypeHandler");
            this.pp007000700070p0070 = map.get("configureHandler");
            this.pp0070pp00700070 = map.get("startDataCollectionHandler");
            this.p0070ppp00700070 = map.get("cancelHandler");
            this.ppppp00700070 = map.get("moduleMetadataHandler");
            this.p0070007000700070p0070 = map.get("getDeniedPermissionsHandler");
        }
        this.p00700070pp00700070 = false;
        this.ppp0070p00700070 = false;
        this.pp00700070p00700070 = str;
    }

    public boolean o006F006Fo006F006Fo() {
        return this.ppp00700070p0070 != null && uu0075uu00750075(this.p0070p00700070p0070) && uu0075uu00750075(this.pp007000700070p0070) && uu0075uu00750075(this.pp0070pp00700070) && uu0075uu00750075(this.p0070ppp00700070) && uu0075uu00750075(this.ppppp00700070) && uu0075uu00750075(this.p0070007000700070p0070);
    }

    public void u0075007500750075u0075(Method method, boolean z, Object... objArr) {
        Object obj;
        if (method == null || (obj = this.ppp00700070p0070) == null) {
            return;
        }
        try {
            jjxjxjx.ss0073s0073sss(obj, method, objArr);
        } catch (Throwable unused) {
            if (z) {
                lqlqqll.uu0075007500750075u(pppp0070p0070, "Can't invoke the method {}", method.getName());
            } else {
                lqlqqll.uuu007500750075u(pppp0070p0070, "Can't invoke the method");
            }
        }
    }

    public Set<String> u00750075u0075u0075() {
        HashSet hashSet = new HashSet();
        u0075007500750075u0075((Method) this.p0070007000700070p0070, true, hashSet);
        return hashSet;
    }

    public boolean u00750075uu00750075() {
        return this.p0070p0070p00700070.equals(p007000700070pp0070);
    }

    public Long u0075u00750075u0075(int i) {
        ArrayList arrayList = new ArrayList(1);
        u0075007500750075u0075((Method) this.ppppp00700070, true, Integer.valueOf(i), arrayList);
        return Long.valueOf(!arrayList.isEmpty() ? ((Long) arrayList.get(0)).longValue() : 0L);
    }

    public void u0075u0075u00750075(boolean z) {
        this.ppp0070p00700070 = z;
    }

    public void u0075uu0075u0075() {
        u0075007500750075u0075((Method) this.p0070ppp00700070, true, new Object[0]);
    }

    public boolean u0075uuu00750075() {
        return this.ppp0070p00700070;
    }

    public String uu007500750075u0075() {
        ArrayList arrayList = new ArrayList(1);
        u0075007500750075u0075((Method) this.p0070p00700070p0070, true, arrayList);
        return !arrayList.isEmpty() ? (String) arrayList.get(0) : "";
    }

    public Map<String, String> uu00750075u00750075(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        u0075007500750075u0075((Method) this.pp0070pp00700070, true, map, map2);
        if (map2.isEmpty()) {
            return null;
        }
        return map2;
    }

    public boolean uu0075u0075u0075(Context context, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList(1);
        u0075007500750075u0075((Method) this.pp007000700070p0070, true, context, map, arrayList);
        if (!arrayList.isEmpty()) {
            String str = (String) arrayList.get(0);
            this.p0070p0070p00700070 = str;
            if (str.equals(pp00700070pp0070) || this.p0070p0070p00700070.equals(p007000700070pp0070)) {
                return true;
            }
        }
        return false;
    }

    public boolean uu0075uu00750075(Object obj) {
        return obj instanceof Method;
    }

    public String uuu00750075u0075() {
        return this.pp00700070p00700070;
    }

    public void uuu0075u00750075(boolean z) {
        this.p00700070pp00700070 = z;
    }

    public boolean uuuuu00750075() {
        return this.p00700070pp00700070;
    }
}
