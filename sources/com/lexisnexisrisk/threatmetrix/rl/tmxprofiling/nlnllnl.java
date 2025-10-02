package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public final class nlnllnl extends lllllql {
    private Object eee00650065ee;

    public nlnllnl(Object obj, String str) {
        super(obj, str);
        if (obj instanceof Map) {
            this.eee00650065ee = ((Map) obj).get("scanHandler");
        }
    }

    public boolean d0064dd00640064d(Context context, boolean z, long j, int i) {
        ArrayList arrayList = new ArrayList(1);
        u0075007500750075u0075((Method) this.eee00650065ee, false, context, Boolean.valueOf(z), Long.valueOf(j), Integer.valueOf(i), arrayList);
        return !arrayList.isEmpty() && ((String) arrayList.get(0)).equalsIgnoreCase("TRUE");
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllllql
    public boolean o006F006Fo006F006Fo() {
        return super.o006F006Fo006F006Fo() && uu0075uu00750075(this.eee00650065ee);
    }
}
