package com.medallia.digital.mobilesdk;

import android.webkit.URLUtil;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class q2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16640a = "file://";
    private static final int b = 4;
    public static final String c = "/";

    public static String a(String str) {
        String host;
        try {
            return (!URLUtil.isValidUrl(str) || (host = new URL(str).getHost()) == null) ? str : host.startsWith("www.") ? host.substring(4) : host;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return str;
        }
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(c);
        return str.equals(sb.toString());
    }

    public static boolean a(String str, boolean z, ArrayList<String> arrayList, String str2, FormTriggerType formTriggerType) {
        if (str.startsWith(f16640a)) {
            return false;
        }
        if (z) {
            return true;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            String strA = a(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (a(str, next) || strA.endsWith(next)) {
                }
            }
            return true;
        }
        Broadcasts.d.a(Broadcasts.d.a.formLinkSelected, str2, formTriggerType, str);
        return false;
    }
}
