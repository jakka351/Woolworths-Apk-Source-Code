package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi
/* loaded from: classes2.dex */
public final class DynamicRangeConversions {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f309a;
    public static final HashMap b;

    static {
        DynamicRange dynamicRange;
        HashMap map = new HashMap();
        f309a = map;
        HashMap map2 = new HashMap();
        b = map2;
        DynamicRange dynamicRange2 = DynamicRange.d;
        map.put(1L, dynamicRange2);
        map2.put(dynamicRange2, Collections.singletonList(1L));
        map.put(2L, DynamicRange.e);
        map2.put((DynamicRange) map.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange3 = DynamicRange.f;
        map.put(4L, dynamicRange3);
        map2.put(dynamicRange3, Collections.singletonList(4L));
        DynamicRange dynamicRange4 = DynamicRange.g;
        map.put(8L, dynamicRange4);
        map2.put(dynamicRange4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dynamicRange = DynamicRange.h;
            if (!zHasNext) {
                break;
            }
            f309a.put((Long) it.next(), dynamicRange);
        }
        b.put(dynamicRange, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(llqqqql.c00630063c0063c0063), Long.valueOf(llqqqql.ccc00630063c0063), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            DynamicRange dynamicRange5 = DynamicRange.i;
            if (!zHasNext2) {
                b.put(dynamicRange5, listAsList2);
                return;
            } else {
                f309a.put((Long) it2.next(), dynamicRange5);
            }
        }
    }

    public static Long a(DynamicRange dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
