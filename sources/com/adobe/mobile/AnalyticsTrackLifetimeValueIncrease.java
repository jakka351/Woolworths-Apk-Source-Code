package com.adobe.mobile;

import com.adobe.mobile.StaticMethods;
import java.math.BigDecimal;
import java.util.HashMap;

/* loaded from: classes4.dex */
final class AnalyticsTrackLifetimeValueIncrease {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13261a = new Object();

    /* renamed from: com.adobe.mobile.AnalyticsTrackLifetimeValueIncrease$1, reason: invalid class name */
    final class AnonymousClass1 extends HashMap<String, Object> {
    }

    public static BigDecimal a() {
        BigDecimal bigDecimal;
        synchronized (f13261a) {
            try {
                bigDecimal = new BigDecimal(StaticMethods.B().getString("ADB_LIFETIME_VALUE", "0"));
            } catch (StaticMethods.NullContextException e) {
                StaticMethods.J("Analytics - Error getting current lifetime value:(%s).", e.getMessage());
                bigDecimal = null;
            } catch (NumberFormatException unused) {
                bigDecimal = new BigDecimal("0");
            }
        }
        return bigDecimal;
    }
}
