package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.HashMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Escapers {

    /* renamed from: com.google.common.escape.Escapers$1, reason: invalid class name */
    public class AnonymousClass1 extends CharEscaper {
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f14912a = new HashMap();
        public char b = 65535;
        public String c = null;

        /* renamed from: com.google.common.escape.Escapers$Builder$1, reason: invalid class name */
        class AnonymousClass1 extends ArrayBasedCharEscaper {
        }

        public final void a() {
            char[][] cArr;
            HashMap map = this.f14912a;
            map.getClass();
            if (map.isEmpty()) {
                cArr = ArrayBasedEscaperMap.f14911a;
            } else {
                char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
                for (Character ch : map.keySet()) {
                    cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
                }
                cArr = cArr2;
            }
            int length = cArr.length;
            String str = this.c;
            if (str != null) {
                str.toCharArray();
            }
        }
    }
}
