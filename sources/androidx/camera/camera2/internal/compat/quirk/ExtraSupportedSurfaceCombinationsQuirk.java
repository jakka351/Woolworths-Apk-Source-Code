package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public static final SurfaceCombination f330a;
    public static final SurfaceCombination b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.e;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.a(SurfaceConfig.a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.d;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.a(SurfaceConfig.a(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.a(SurfaceConfig.a(configType, configSize3));
        f330a = surfaceCombination;
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        android.support.v4.media.session.a.B(configType2, configSize2, surfaceCombination2, configType2, configSize);
        surfaceCombination2.a(SurfaceConfig.a(configType, configSize3));
        b = surfaceCombination2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
