package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.events.g;

@SuppressLint
/* loaded from: classes6.dex */
public class d extends h<Integer> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16892a;

        static {
            int[] iArr = new int[g.a.values().length];
            f16892a = iArr;
            try {
                iArr[g.a.f16887a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16892a[g.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16892a[g.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16892a[g.a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16892a[g.a.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16892a[g.a.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public d(@Nullable Object obj, @NonNull g.a aVar, @Nullable Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    @Override // com.salesforce.marketingcloud.events.predicates.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(@androidx.annotation.Nullable java.lang.Integer r4, @androidx.annotation.NonNull com.salesforce.marketingcloud.events.g.a r5, @androidx.annotation.Nullable java.lang.Integer r6) throws java.lang.UnsupportedOperationException {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L64
            if (r6 == 0) goto L64
            int[] r1 = com.salesforce.marketingcloud.events.predicates.d.a.f16892a
            int r2 = r5.ordinal()
            r1 = r1[r2]
            r2 = 1
            switch(r1) {
                case 1: goto L5f;
                case 2: goto L59;
                case 3: goto L4d;
                case 4: goto L42;
                case 5: goto L37;
                case 6: goto L2c;
                default: goto L11;
            }
        L11:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Operator "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = " not supported for Integer data types."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            int r4 = r4.intValue()
            int r5 = r6.intValue()
            if (r4 < r5) goto L58
            goto L57
        L37:
            int r4 = r4.intValue()
            int r5 = r6.intValue()
            if (r4 > r5) goto L58
            goto L57
        L42:
            int r4 = r4.intValue()
            int r5 = r6.intValue()
            if (r4 <= r5) goto L58
            goto L57
        L4d:
            int r4 = r4.intValue()
            int r5 = r6.intValue()
            if (r4 >= r5) goto L58
        L57:
            return r2
        L58:
            return r0
        L59:
            boolean r4 = r4.equals(r6)
            r4 = r4 ^ r2
            return r4
        L5f:
            boolean r4 = r4.equals(r6)
            return r4
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.predicates.d.a(java.lang.Integer, com.salesforce.marketingcloud.events.g$a, java.lang.Integer):boolean");
    }
}
