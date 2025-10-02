package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes4.dex */
public class JavaStacktraceProcessor implements StacktraceProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f14109a;
    public final int b;

    public JavaStacktraceProcessor(Throwable th, int i) {
        this.f14109a = th;
        this.b = i;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public final StacktraceData a() {
        int i;
        Throwable cause = this.f14109a;
        String strE = Utility.e(250, cause.getClass().getName());
        int i2 = 1000;
        String strE2 = Utility.e(1000, cause.toString());
        StringBuilder sb = new StringBuilder();
        int length = 0;
        int length2 = 0;
        int i3 = 0;
        while (true) {
            if (cause == null || length >= (i = this.b) || length2 > 128000) {
                break;
            }
            if (length > 0) {
                sb.append("\nCaused by: ");
                length2 += 12;
            }
            String string = cause.toString();
            boolean z = length > 0;
            if (string == null) {
                string = "";
            } else {
                int iMin = Math.min(Math.max(0, (128000 - i3) - (z ? 12 : 0)), i2);
                if (string.length() > iMin) {
                    string = string.substring(0, iMin);
                }
            }
            String[] strArrSplit = string.split("\n");
            if (strArrSplit.length > i - length) {
                int i4 = 0;
                while (length < i) {
                    if (i4 > 0) {
                        sb.append("\n");
                    }
                    sb.append(strArrSplit[i4]);
                    length2 = sb.length();
                    length++;
                    i4++;
                }
            } else {
                sb.append(string);
                int length3 = sb.length();
                length += strArrSplit.length;
                length2 = sb.length();
                StackTraceElement[] stackTrace = cause.getStackTrace();
                if (stackTrace != null) {
                    int iMin2 = Math.min(stackTrace.length, i - length);
                    int i5 = length3;
                    int length4 = length2;
                    int i6 = length;
                    int i7 = 0;
                    while (i7 < iMin2 && length4 < 128000) {
                        sb.append("\n");
                        sb.append("\tat ");
                        sb.append(stackTrace[i7]);
                        i6++;
                        i7++;
                        i5 = length4;
                        length4 = sb.length();
                    }
                    i3 = i5;
                    length = i6;
                    length2 = length4;
                } else {
                    i3 = length3;
                }
                cause = cause.getCause();
                i2 = 1000;
            }
        }
        return new StacktraceData(strE, strE2, length2 > 128000 ? sb.substring(0, i3).trim() : sb.toString().trim(), PlatformType.JAVA);
    }
}
