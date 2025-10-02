package com.medallia.digital.mobilesdk;

import android.graphics.Point;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class o1 extends y5<String> {
    public o1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        Point pointE = this.g.e();
        if (pointE == null) {
            pointE = new Point();
        }
        Locale locale = Locale.US;
        return pointE.x + "*" + pointE.y;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.c;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(YU.a.A("Collectors > Resolution: ", strS));
        return strS;
    }
}
