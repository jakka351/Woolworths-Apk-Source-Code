package com.salesforce.marketingcloud.util;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.LocationServices;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f17072a;
    private static Boolean b;

    private d() {
    }

    public static boolean a() throws ClassNotFoundException {
        if (b == null) {
            try {
                Class.forName("org.altbeacon.beacon.BeaconManager");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        return b.booleanValue();
    }

    public static boolean b() {
        if (f17072a == null) {
            try {
                Api<Api.ApiOptions.NoOptions> api = LocationServices.API;
                f17072a = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f17072a = Boolean.FALSE;
            }
        }
        return f17072a.booleanValue();
    }
}
