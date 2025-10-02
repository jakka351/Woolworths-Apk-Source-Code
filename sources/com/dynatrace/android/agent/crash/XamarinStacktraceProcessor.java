package com.dynatrace.android.agent.crash;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
public class XamarinStacktraceProcessor implements StacktraceProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final String f14112a;

    public XamarinStacktraceProcessor(String str) {
        this.f14112a = str;
    }

    public static String b(Throwable th) {
        while (th != null) {
            String message = th.getMessage();
            if (message != null) {
                for (String str : message.split("\n")) {
                    if (str.startsWith("  at ")) {
                        return message;
                    }
                }
            }
            th = th.getCause();
        }
        return null;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public final StacktraceData a() {
        String string = this.f14112a;
        String[] strArrSplit = string.split("\n");
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("no lines");
        }
        if (strArrSplit[0].startsWith("  at ")) {
            throw new IllegalArgumentException("no reason message available");
        }
        int iIndexOf = strArrSplit[0].indexOf(":");
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("no exception name available");
        }
        String strE = Utility.e(250, strArrSplit[0].substring(0, iIndexOf));
        StringBuilder sb = new StringBuilder();
        int iIndexOf2 = strArrSplit[0].indexOf(" ---> ");
        if (iIndexOf2 < 0) {
            sb.append(strArrSplit[0]);
            int i = 1;
            while (true) {
                if (i < strArrSplit.length && !strArrSplit[i].startsWith("  at ") && sb.length() < 1000) {
                    sb.append("\n");
                    int iIndexOf3 = strArrSplit[i].indexOf(" ---> ");
                    if (iIndexOf3 >= 0) {
                        sb.append(strArrSplit[i].substring(0, iIndexOf3));
                        break;
                    }
                    sb.append(strArrSplit[i]);
                    i++;
                } else {
                    break;
                }
            }
        } else {
            sb.append(strArrSplit[0].substring(0, iIndexOf2));
        }
        String strSubstring = sb.length() > 1000 ? sb.substring(0, 1000) : sb.toString();
        if (strArrSplit.length > Integer.MAX_VALUE || string.length() > 128000) {
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            int iE = 0;
            while (i2 < Math.min(strArrSplit.length, Integer.MAX_VALUE)) {
                int i3 = i2 == 0 ? 0 : 1;
                if (c.e(iE, i3, strArrSplit[i2]) > 128000) {
                    break;
                }
                if (i3 > 0) {
                    sb2.append("\n");
                }
                sb2.append(strArrSplit[i2]);
                iE = c.e(i3, iE, strArrSplit[i2]);
                i2++;
            }
            string = sb2.toString();
        }
        return new StacktraceData(strE, strSubstring, string, PlatformType.XAMARIN);
    }
}
