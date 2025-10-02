package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ExtraCroppingQuirk implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f328a;

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f329a;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            f329a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f329a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f329a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f328a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(SurfaceConfig.ConfigType configType) {
        if (!f()) {
            return null;
        }
        int iOrdinal = configType.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap map = f328a;
        if (!map.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
