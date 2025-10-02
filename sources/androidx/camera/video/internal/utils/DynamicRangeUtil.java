package androidx.camera.video.internal.utils;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class DynamicRangeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f637a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;

    static {
        HashMap map = new HashMap();
        f637a = map;
        HashMap map2 = new HashMap();
        b = map2;
        HashMap map3 = new HashMap();
        c = map3;
        HashMap map4 = new HashMap();
        d = map4;
        HashMap map5 = new HashMap();
        e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        DynamicRange dynamicRange = DynamicRange.d;
        map6.put(dynamicRange, 1);
        DynamicRange dynamicRange2 = DynamicRange.e;
        map6.put(dynamicRange2, 2);
        DynamicRange dynamicRange3 = DynamicRange.f;
        map6.put(dynamicRange3, 4096);
        DynamicRange dynamicRange4 = DynamicRange.g;
        map6.put(dynamicRange4, 8192);
        HashMap map7 = new HashMap();
        map7.put(dynamicRange, 1);
        map7.put(dynamicRange2, 2);
        map7.put(dynamicRange3, 4096);
        map7.put(dynamicRange4, 8192);
        HashMap map8 = new HashMap();
        map8.put(dynamicRange, 1);
        map8.put(dynamicRange2, 4);
        map8.put(dynamicRange3, 4096);
        map8.put(dynamicRange4, 16384);
        HashMap map9 = new HashMap();
        map9.put(DynamicRange.h, 256);
        map9.put(DynamicRange.i, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange) {
        int iB = videoProfileProxy.b();
        Set set = (Set) f637a.get(Integer.valueOf(dynamicRange.b));
        if (set == null || !set.contains(Integer.valueOf(iB))) {
            return false;
        }
        int iG = videoProfileProxy.g();
        Set set2 = (Set) b.get(Integer.valueOf(dynamicRange.f400a));
        return set2 != null && set2.contains(Integer.valueOf(iG));
    }
}
