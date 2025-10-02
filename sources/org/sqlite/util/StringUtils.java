package org.sqlite.util;

import java.util.AbstractList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class StringUtils {
    public static String a(AbstractList abstractList, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = abstractList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
