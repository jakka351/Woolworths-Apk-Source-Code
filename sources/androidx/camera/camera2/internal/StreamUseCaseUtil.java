package androidx.camera.camera2.internal;

import android.os.Build;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class StreamUseCaseUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Config.Option f281a = Config.Option.a(Long.TYPE, "camera2.streamSpec.streamUseCase");
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.e;
            hashSet.add(captureType);
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.i;
            hashSet.add(captureType2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(captureType);
            hashSet2.add(captureType2);
            hashSet2.add(UseCaseConfigFactory.CaptureType.f);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.d;
            hashSet3.add(captureType3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType4 = UseCaseConfigFactory.CaptureType.g;
            hashSet4.add(captureType4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType3);
            hashSet5.add(captureType4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType4);
            map2.put(3L, hashSet6);
        }
    }

    public static Camera2ImplConfig a(Config config, long j) {
        Config.Option option = f281a;
        if (config.d(option) && ((Long) config.a(option)).longValue() == j) {
            return null;
        }
        MutableOptionsBundle mutableOptionsBundleW = MutableOptionsBundle.W(config);
        mutableOptionsBundleW.G(option, Long.valueOf(j));
        return new Camera2ImplConfig(mutableOptionsBundleW);
    }

    public static boolean b(UseCaseConfigFactory.CaptureType captureType, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.h) {
            Long lValueOf = Long.valueOf(j);
            HashMap map = b;
            return map.containsKey(lValueOf) && ((Set) map.get(Long.valueOf(j))).contains(captureType);
        }
        Long lValueOf2 = Long.valueOf(j);
        HashMap map2 = c;
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((UseCaseConfigFactory.CaptureType) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Config config, UseCaseConfigFactory.CaptureType captureType) {
        if (((Boolean) config.c(UseCaseConfig.x, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        Config.Option option = ImageCaptureConfig.H;
        if (config.d(option)) {
            return captureType.ordinal() == 0 && ((Integer) config.a(option)).intValue() == 2;
        }
        return false;
    }
}
