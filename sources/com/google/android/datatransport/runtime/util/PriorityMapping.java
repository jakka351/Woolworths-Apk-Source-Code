package com.google.android.datatransport.runtime.util;

import YU.a;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class PriorityMapping {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f14501a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(Priority.d, 0);
        map.put(Priority.e, 1);
        map.put(Priority.f, 2);
        for (Priority priority : map.keySet()) {
            f14501a.append(((Integer) b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i) {
        Priority priority = (Priority) f14501a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(a.d(i, "Unknown Priority for value "));
    }
}
