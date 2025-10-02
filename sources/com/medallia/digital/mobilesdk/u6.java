package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class u6 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16738a = "SDK_CURRENT_VERSION";

    /* loaded from: classes6.dex */
    public enum a {
        SUPPORTED,
        DEPRECATED,
        TERMINATED
    }

    public static a a(String str, t6 t6Var) {
        String message;
        ArrayList<String> arrayList;
        int i;
        String[] strArrSplit;
        if (t6Var != null && t6Var.d() != null) {
            int iB = t6Var.b();
            int iA = t6Var.a();
            try {
                arrayList = new ArrayList<>(t6Var.d());
                i = 0;
                Collections.sort(arrayList, new o5(false));
                a4.e("SDK versions: " + ModelFactory.getInstance().getStringArrayAsJsonString(arrayList));
                strArrSplit = str.split("\\.");
            } catch (Exception e) {
                message = e.getMessage();
            }
            if (strArrSplit.length <= 1) {
                a4.c("Short SDK version error");
                return null;
            }
            String str2 = strArrSplit[0] + "." + strArrSplit[1];
            a4.e("SDK short version: " + str2);
            while (i < arrayList.size()) {
                if (arrayList.get(i).equals(str2)) {
                    return i < iB ? a.SUPPORTED : i < iA ? a.DEPRECATED : a.TERMINATED;
                }
                i++;
            }
            return null;
        }
        message = "SDK versions - null";
        a4.c(message);
        return null;
    }

    public static void a(t6 t6Var) {
        String str;
        a aVarA = a("4.8.1", t6Var);
        if (aVarA == null || aVarA == a.SUPPORTED || t6Var.c() == null || t6Var.c().isEmpty() || !t6Var.c().containsKey(aVarA.name().toLowerCase()) || (str = t6Var.c().get(aVarA.name().toLowerCase())) == null) {
            return;
        }
        a4.f(str.replace(f16738a, "4.8.1"));
    }
}
