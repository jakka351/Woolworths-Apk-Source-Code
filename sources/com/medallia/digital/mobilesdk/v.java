package com.medallia.digital.mobilesdk;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class v extends y5<String> {
    public v(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        try {
            PackageManager packageManagerI = this.g.i();
            PackageInfo packageInfo = packageManagerI != null ? packageManagerI.getPackageInfo(i4.c().b().getPackageName(), 0) : null;
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            a4.c(e.getMessage());
        }
        a4.c("Context is null");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.q;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        Locale locale = Locale.US;
        a4.b(YU.a.A("Collectors > App version : ", strS));
        return strS;
    }
}
