package com.bumptech.glide.load.engine.bitmap_recycle;

import YU.a;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sbS = a.s("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbS.append('{');
            sbS.append(entry.getKey());
            sbS.append(':');
            sbS.append(entry.getValue());
            sbS.append("}, ");
        }
        if (!isEmpty()) {
            sbS.replace(sbS.length() - 2, sbS.length(), "");
        }
        sbS.append(" )");
        return sbS.toString();
    }
}
