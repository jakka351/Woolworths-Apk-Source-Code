package com.dynatrace.android.agent.conf;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class BuilderUtil {
    public static String[] a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.length() > 0) {
                    arrayList.add(strTrim);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }
}
