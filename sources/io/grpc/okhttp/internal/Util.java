package io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f24142a = new String[0];
    public static final Charset b = Charset.forName("UTF-8");

    public static Object[] a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr2[i];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
