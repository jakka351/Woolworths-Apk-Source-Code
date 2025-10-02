package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.lang.reflect.Method;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnnnnll extends jjxjxjx {

    @Nullable
    private static final Class<?> e00650065e00650065e;
    private static final String ee0065e00650065e = lqlqqll.u00750075u00750075u(nnnnnll.class);

    @Nullable
    private static final Method eee006500650065e;

    @Nonnull
    private DisplayMetrics e00650065006500650065e = new DisplayMetrics();
    private Display e0065e006500650065e;

    @Nullable
    private Point ee0065006500650065e;

    static {
        Class<?> clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.WINDOW_MANAGER);
        e00650065e00650065e = clsWww00770077007700770077;
        eee006500650065e = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getDefaultDisplay", new Class[0]);
    }

    public nnnnnll(@Nonnull nlllnnl nlllnnlVar) {
        if (eee006500650065e == null) {
            return;
        }
        try {
            Object systemService = nlllnnlVar.ww0077w007700770077.getSystemService("window");
            if (systemService instanceof WindowManager) {
                this.e0065e006500650065e = ((WindowManager) systemService).getDefaultDisplay();
                this.ee0065006500650065e = dd0064006400640064d();
                this.e0065e006500650065e.getMetrics(this.e00650065006500650065e);
            }
        } catch (SecurityException e) {
            lqlqqll.llqqqll.u0075uuuuu(ee0065e00650065e, "User refuse granting permission {}", e.toString());
            nlnnlnl.d00640064dd0064d(e);
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(ee0065e00650065e, e2.toString());
        }
    }

    private Point dd0064006400640064d() {
        Point point = new Point();
        this.e0065e006500650065e.getRealSize(point);
        if (point.x == 0 || point.y == 0) {
            return null;
        }
        return point;
    }

    public int d00640064006400640064d() {
        if (this.e0065e006500650065e == null) {
            return 0;
        }
        Point point = this.ee0065006500650065e;
        if (point != null) {
            return point.x;
        }
        Point point2 = new Point();
        this.e0065e006500650065e.getSize(point2);
        return point2.x;
    }

    public int d00640064d00640064d() {
        return this.e00650065006500650065e.heightPixels;
    }

    public float d0064d006400640064d() {
        return (this.ee0065006500650065e == null || this.e0065e006500650065e == null) ? BitmapDescriptorFactory.HUE_RED : Math.max(r0.y, r0.x) / this.e00650065006500650065e.ydpi;
    }

    public float d0064dddd0064() {
        return this.e00650065006500650065e.xdpi;
    }

    public int dd0064d00640064d() {
        if (this.e0065e006500650065e == null) {
            return 0;
        }
        Point point = this.ee0065006500650065e;
        if (point != null) {
            return point.y;
        }
        Point point2 = new Point();
        this.e0065e006500650065e.getSize(point2);
        return point2.y;
    }

    public float dd0064ddd0064() {
        return this.e00650065006500650065e.ydpi;
    }

    public float ddd006400640064d() {
        return (this.ee0065006500650065e == null || this.e0065e006500650065e == null) ? BitmapDescriptorFactory.HUE_RED : Math.min(r0.y, r0.x) / this.e00650065006500650065e.xdpi;
    }

    public int dddddd0064() {
        return this.e00650065006500650065e.widthPixels;
    }
}
