package com.auth0.android.authentication;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class PasswordStrengthErrorParser {

    /* renamed from: a, reason: collision with root package name */
    public final String f13654a;

    public PasswordStrengthErrorParser(Map map) {
        List<Map> list = (List) map.get("rules");
        ArrayList arrayList = new ArrayList();
        for (Map map2 : list) {
            if (!((Boolean) map2.get("verified")).booleanValue()) {
                String str = (String) map2.get("code");
                str.getClass();
                switch (str) {
                    case "lengthAtLeast":
                        arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) ((List) map2.get("format")).get(0)).intValue())));
                        break;
                    case "containsAtLeast":
                    case "shouldContain":
                        List list2 = (List) map2.get("items");
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) ((Map) it.next()).get("message"));
                        }
                        String strJoin = TextUtils.join(", ", arrayList2);
                        String str2 = (String) map2.get("message");
                        if (map2.containsKey("format")) {
                            List list3 = (List) map2.get("format");
                            str2 = String.format(str2, Integer.valueOf(((Double) list3.get(0)).intValue()), Integer.valueOf(((Double) list3.get(1)).intValue()));
                        }
                        arrayList.add(str2 + " " + strJoin);
                        break;
                    case "identicalChars":
                        List list4 = (List) map2.get("format");
                        arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) list4.get(0)).intValue()), list4.get(1)));
                        break;
                }
            }
        }
        this.f13654a = TextUtils.join("; ", arrayList);
    }

    public final String a() {
        return this.f13654a;
    }
}
