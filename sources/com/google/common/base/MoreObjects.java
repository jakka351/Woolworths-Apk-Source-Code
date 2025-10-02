package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class MoreObjects {

    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        public final String f14864a;
        public final ValueHolder b;
        public ValueHolder c;
        public boolean d;

        public static final class UnconditionalValueHolder extends ValueHolder {
        }

        public static class ValueHolder {

            /* renamed from: a, reason: collision with root package name */
            public String f14865a;
            public Object b;
            public ValueHolder c;
        }

        public ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.b = valueHolder;
            this.c = valueHolder;
            this.d = false;
            this.f14864a = str;
        }

        public final void a(int i, String str) {
            e(str, String.valueOf(i));
        }

        public final void b(long j, String str) {
            e(str, String.valueOf(j));
        }

        public final void c(Object obj, String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.c.c = valueHolder;
            this.c = valueHolder;
            valueHolder.b = obj;
            valueHolder.f14865a = str;
        }

        public final void d(String str, boolean z) {
            e(str, String.valueOf(z));
        }

        public final void e(String str, String str2) {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.c.c = unconditionalValueHolder;
            this.c = unconditionalValueHolder;
            unconditionalValueHolder.b = str2;
            unconditionalValueHolder.f14865a = str;
        }

        public final void f(Object obj) {
            ValueHolder valueHolder = new ValueHolder();
            this.c.c = valueHolder;
            this.c = valueHolder;
            valueHolder.b = obj;
        }

        public final String toString() {
            boolean z = this.d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f14864a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.b.c; valueHolder != null; valueHolder = valueHolder.c) {
                Object obj = valueHolder.b;
                if ((valueHolder instanceof UnconditionalValueHolder) || obj != null || !z) {
                    sb.append(str);
                    String str2 = valueHolder.f14865a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper b(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}
