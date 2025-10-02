package io.grpc.okhttp.internal;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class Headers {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f24135a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24136a = new ArrayList(20);
    }

    public Headers(Builder builder) {
        ArrayList arrayList = builder.f24136a;
        this.f24135a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f24135a;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = null;
            sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
            sb.append(": ");
            int i3 = i2 + 1;
            if (i3 >= 0 && i3 < strArr.length) {
                str = strArr[i3];
            }
            sb.append(str);
            sb.append("\n");
        }
        return sb.toString();
    }
}
