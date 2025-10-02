package com.scandit.datacapture.core;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
abstract class T4 {
    public static Object a(Object obj) {
        return obj;
    }

    public static void a(boolean z, String str, Object obj) {
        String string;
        if (z) {
            return;
        }
        int i = 0;
        Object[] objArr = {obj};
        try {
            string = String.valueOf(obj);
        } catch (Exception e) {
            String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
            StringBuilder sbU = YU.a.u("<", str2, " threw ");
            sbU.append(e.getClass().getName());
            sbU.append(">");
            string = sbU.toString();
        }
        objArr[0] = string;
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i2 = 0;
        while (i < 1) {
            int iIndexOf = str.indexOf("%s", i2);
            if (iIndexOf == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < 1) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 1; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        throw new IllegalStateException(sb.toString());
    }
}
