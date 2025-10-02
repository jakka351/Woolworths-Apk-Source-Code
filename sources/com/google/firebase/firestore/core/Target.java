package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Target {

    /* renamed from: a, reason: collision with root package name */
    public String f15464a;
    public final List b;
    public final List c;
    public final ResourcePath d;
    public final String e;
    public final long f;
    public final Bound g;
    public final Bound h;

    /* renamed from: com.google.firebase.firestore.core.Target$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15465a;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f15465a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15465a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15465a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15465a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15465a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15465a[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15465a[0] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15465a[1] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15465a[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15465a[4] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Target(ResourcePath resourcePath, String str, List list, List list2, long j, Bound bound, Bound bound2) {
        this.d = resourcePath;
        this.e = str;
        this.b = list2;
        this.c = list;
        this.f = j;
        this.g = bound;
        this.h = bound2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(com.google.firebase.firestore.model.FieldIndex.Segment r11, com.google.firebase.firestore.core.Bound r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.Target.a(com.google.firebase.firestore.model.FieldIndex$Segment, com.google.firebase.firestore.core.Bound):android.util.Pair");
    }

    public final String b() {
        String str = this.f15464a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b());
        String str2 = this.e;
        if (str2 != null) {
            sb.append("|cg:");
            sb.append(str2);
        }
        sb.append("|f:");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sb.append(((Filter) it.next()).a());
        }
        sb.append("|ob:");
        for (OrderBy orderBy : this.b) {
            sb.append(orderBy.b.b());
            sb.append(orderBy.f15457a.equals(OrderBy.Direction.ASCENDING) ? "asc" : "desc");
        }
        long j = this.f;
        if (j != -1) {
            sb.append("|l:");
            sb.append(j);
        }
        Bound bound = this.g;
        if (bound != null) {
            sb.append("|lb:");
            sb.append(bound.f15440a ? "b:" : "a:");
            sb.append(bound.a());
        }
        Bound bound2 = this.h;
        if (bound2 != null) {
            sb.append("|ub:");
            sb.append(bound2.f15440a ? "a:" : "b:");
            sb.append(bound2.a());
        }
        String string = sb.toString();
        this.f15464a = string;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(com.google.firebase.firestore.model.FieldIndex.Segment r11, com.google.firebase.firestore.core.Bound r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.Target.c(com.google.firebase.firestore.model.FieldIndex$Segment, com.google.firebase.firestore.core.Bound):android.util.Pair");
    }

    public final ArrayList d(FieldPath fieldPath) {
        ArrayList arrayList = new ArrayList();
        for (Filter filter : this.c) {
            if (filter instanceof FieldFilter) {
                FieldFilter fieldFilter = (FieldFilter) filter;
                if (fieldFilter.c.equals(fieldPath)) {
                    arrayList.add(fieldFilter);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return DocumentKey.d(this.d) && this.e == null && this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Target.class == obj.getClass()) {
            Target target = (Target) obj;
            Bound bound = target.h;
            Bound bound2 = target.g;
            String str = target.e;
            String str2 = this.e;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            if (this.f != target.f || !this.b.equals(target.b) || !this.c.equals(target.c) || !this.d.equals(target.d)) {
                return false;
            }
            Bound bound3 = this.g;
            if (bound3 == null ? bound2 != null : !bound3.equals(bound2)) {
                return false;
            }
            Bound bound4 = this.h;
            if (bound4 != null) {
                return bound4.equals(bound);
            }
            if (bound == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Bound bound = this.g;
        int iHashCode3 = (i + (bound != null ? bound.hashCode() : 0)) * 31;
        Bound bound2 = this.h;
        return iHashCode3 + (bound2 != null ? bound2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.d.b());
        String str = this.e;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.c;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i));
            }
        }
        List list2 = this.b;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i2));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
