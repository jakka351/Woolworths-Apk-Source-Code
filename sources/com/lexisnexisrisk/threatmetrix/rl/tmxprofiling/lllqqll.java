package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.location.Location;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lllqqll extends jjxjxjx {
    private static final String pp0070p00700070p = lqlqqll.u00750075u00750075u(lllqqll.class);

    @Nullable
    private static final Method pp00700070p0070p = jjxjxjx.ss00730073ssss(Location.class, "isFromMockProvider", new Class[0]);

    @Nullable
    private static final Method p007000700070p0070p = jjxjxjx.ss00730073ssss(Location.class, "isMock", new Class[0]);

    @Nullable
    private static final Method pppp00700070p = jjxjxjx.ss00730073ssss(Location.class, "hasVerticalAccuracy", new Class[0]);

    @Nullable
    private static final Method p0070pp00700070p = jjxjxjx.ss00730073ssss(Location.class, "getVerticalAccuracyMeters", new Class[0]);

    public static boolean y0079y0079007900790079(Location location) {
        if (location == null) {
            lqlqqll.u0075u0075uu0075(pp0070p00700070p, "Null context");
            return false;
        }
        Boolean bool = (Boolean) jjxjxjx.s0073ss0073sss(location, pp00700070p0070p, new Object[0]);
        Boolean bool2 = (Boolean) jjxjxjx.s0073ss0073sss(location, p007000700070p0070p, new Object[0]);
        return (bool2 != null ? bool2.booleanValue() : false) || (bool != null ? bool.booleanValue() : false);
    }

    public static Float yyy0079007900790079(Location location) {
        Boolean bool;
        if (location == null || (bool = (Boolean) jjxjxjx.s0073ss0073sss(location, pppp00700070p, new Object[0])) == null || !bool.booleanValue()) {
            return null;
        }
        return (Float) jjxjxjx.s0073ss0073sss(location, p0070pp00700070p, new Object[0]);
    }
}
