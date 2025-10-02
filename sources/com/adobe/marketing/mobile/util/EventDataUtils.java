package com.adobe.marketing.mobile.util;

import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.CloneFailedException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class EventDataUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f13255a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CloneMode {
        public static final /* synthetic */ CloneMode[] d = {new CloneMode("ImmutableContainer", 0), new CloneMode("MutableContainer", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        CloneMode EF5;

        public static CloneMode valueOf(String str) {
            return (CloneMode) Enum.valueOf(CloneMode.class, str);
        }

        public static CloneMode[] values() {
            return (CloneMode[]) d.clone();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f13255a = hashSet;
        hashSet.add(Boolean.class);
        hashSet.add(Byte.class);
        hashSet.add(Short.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        hashSet.add(BigDecimal.class);
        hashSet.add(BigInteger.class);
        hashSet.add(Character.class);
        hashSet.add(String.class);
        hashSet.add(UUID.class);
    }

    public static Map a(Map map) {
        if (map == null) {
            return null;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!(((Map.Entry) it.next()).getKey() instanceof String)) {
                return null;
            }
        }
        return map;
    }

    public static Map b(int i, Map map) throws CloneFailedException {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                try {
                    map2.put(key.toString(), c(i + 1, entry.getValue()));
                } catch (CloneFailedException e) {
                    if (e.d != CloneFailedException.Reason.e) {
                        throw e;
                    }
                    e.getMessage();
                    Log.c();
                }
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    public static Object c(int i, Object obj) throws CloneFailedException {
        if (obj == null) {
            return null;
        }
        if (i > 256) {
            throw new CloneFailedException(CloneFailedException.Reason.d);
        }
        if (f13255a.contains(obj.getClass())) {
            return obj;
        }
        if (obj instanceof Map) {
            return b(i, (Map) obj);
        }
        boolean z = obj instanceof Collection;
        CloneFailedException.Reason reason = CloneFailedException.Reason.e;
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(c(i + 1, it.next()));
                } catch (CloneFailedException e) {
                    if (e.d != reason) {
                        throw e;
                    }
                    e.getMessage();
                    Log.c();
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        if (!obj.getClass().isArray()) {
            Log.c();
            throw new CloneFailedException(reason);
        }
        ArrayList arrayList2 = new ArrayList();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            try {
                arrayList2.add(c(i + 1, Array.get(obj, i2)));
            } catch (CloneFailedException e2) {
                if (e2.d != reason) {
                    throw e2;
                }
                e2.getMessage();
                Log.c();
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }
}
