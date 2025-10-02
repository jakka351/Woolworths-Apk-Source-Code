package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.events.g;

@SuppressLint
/* loaded from: classes6.dex */
public class b extends h<Boolean> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16890a;

        static {
            int[] iArr = new int[g.a.values().length];
            f16890a = iArr;
            try {
                iArr[g.a.f16887a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16890a[g.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(Object obj, g.a aVar, Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    @Override // com.salesforce.marketingcloud.events.predicates.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(@androidx.annotation.Nullable java.lang.Boolean r5, @androidx.annotation.NonNull com.salesforce.marketingcloud.events.g.a r6, @androidx.annotation.Nullable java.lang.Boolean r7) throws java.lang.UnsupportedOperationException {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L34
            if (r7 == 0) goto L34
            int[] r1 = com.salesforce.marketingcloud.events.predicates.b.a.f16890a
            int r2 = r6.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L31
            r3 = 2
            if (r1 != r3) goto L16
            if (r5 == r7) goto L34
            goto L33
        L16:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Operator "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = " not supported for Boolean data types."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L31:
            if (r5 != r7) goto L34
        L33:
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.predicates.b.a(java.lang.Boolean, com.salesforce.marketingcloud.events.g$a, java.lang.Boolean):boolean");
    }
}
