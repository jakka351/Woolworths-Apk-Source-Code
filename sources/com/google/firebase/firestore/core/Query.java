package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public final class Query {
    public static final OrderBy f;
    public static final OrderBy g;

    /* renamed from: a, reason: collision with root package name */
    public final List f15458a;
    public List b;
    public Target c;
    public final List d;
    public final ResourcePath e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LimitType {
        public static final LimitType d;
        public static final LimitType e;
        public static final /* synthetic */ LimitType[] f;

        static {
            LimitType limitType = new LimitType("LIMIT_TO_FIRST", 0);
            d = limitType;
            LimitType limitType2 = new LimitType("LIMIT_TO_LAST", 1);
            e = limitType2;
            f = new LimitType[]{limitType, limitType2};
        }

        public static LimitType valueOf(String str) {
            return (LimitType) Enum.valueOf(LimitType.class, str);
        }

        public static LimitType[] values() {
            return (LimitType[]) f.clone();
        }
    }

    public static class QueryComparator implements Comparator<Document> {
        public final List d;

        public QueryComparator(List list) {
            boolean z;
            Iterator it = list.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    z = (z || ((OrderBy) it.next()).b.equals(FieldPath.e)) ? true : z;
                }
            }
            if (!z) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.d = list;
        }

        @Override // java.util.Comparator
        public final int compare(Document document, Document document2) {
            int iB;
            Document document3 = document;
            Document document4 = document2;
            Iterator it = this.d.iterator();
            do {
                iB = 0;
                if (!it.hasNext()) {
                    break;
                }
                OrderBy orderBy = (OrderBy) it.next();
                OrderBy.Direction direction = orderBy.f15457a;
                FieldPath fieldPath = orderBy.b;
                if (fieldPath.equals(FieldPath.e)) {
                    iB = document3.getKey().compareTo(document4.getKey()) * direction.d;
                } else {
                    Value valueD = document3.d(fieldPath);
                    Value valueD2 = document4.d(fieldPath);
                    Assert.b((valueD == null || valueD2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
                    iB = direction.d * Values.b(valueD, valueD2);
                }
            } while (iB == 0);
            return iB;
        }
    }

    static {
        FieldPath fieldPath = FieldPath.e;
        f = new OrderBy(OrderBy.Direction.ASCENDING, fieldPath);
        g = new OrderBy(OrderBy.Direction.DESCENDING, fieldPath);
    }

    public Query(ResourcePath resourcePath) {
        List list = Collections.EMPTY_LIST;
        this.e = resourcePath;
        this.f15458a = list;
        this.d = list;
    }

    public final Comparator a() {
        return new QueryComparator(c());
    }

    public final TreeSet b() {
        TreeSet treeSet = new TreeSet();
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            for (FieldFilter fieldFilter : ((Filter) it.next()).c()) {
                fieldFilter.getClass();
                if (Arrays.asList(FieldFilter.Operator.LESS_THAN, FieldFilter.Operator.LESS_THAN_OR_EQUAL, FieldFilter.Operator.GREATER_THAN, FieldFilter.Operator.GREATER_THAN_OR_EQUAL, FieldFilter.Operator.NOT_EQUAL, FieldFilter.Operator.NOT_IN).contains(fieldFilter.f15451a)) {
                    treeSet.add(fieldFilter.c);
                }
            }
        }
        return treeSet;
    }

    public final synchronized List c() {
        try {
            if (this.b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (OrderBy orderBy : Collections.EMPTY_LIST) {
                    arrayList.add(orderBy);
                    hashSet.add(orderBy.b.b());
                }
                List list = Collections.EMPTY_LIST;
                OrderBy.Direction direction = list.size() > 0 ? ((OrderBy) list.get(list.size() - 1)).f15457a : OrderBy.Direction.ASCENDING;
                Iterator it = b().iterator();
                while (it.hasNext()) {
                    FieldPath fieldPath = (FieldPath) it.next();
                    if (!hashSet.contains(fieldPath.b()) && !fieldPath.equals(FieldPath.e)) {
                        arrayList.add(new OrderBy(direction, fieldPath));
                    }
                }
                if (!hashSet.contains(FieldPath.e.b())) {
                    arrayList.add(direction.equals(OrderBy.Direction.ASCENDING) ? f : g);
                }
                this.b = Collections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final boolean d(Document document) {
        boolean z;
        boolean z2;
        if (document.b()) {
            ResourcePath resourcePath = document.getKey().d;
            ResourcePath resourcePath2 = this.e;
            if (DocumentKey.d(resourcePath2) ? resourcePath2.equals(resourcePath) : resourcePath2.m(resourcePath) && resourcePath2.d.size() == resourcePath.d.size() - 1) {
                Iterator it = c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    OrderBy orderBy = (OrderBy) it.next();
                    if (!orderBy.b.equals(FieldPath.e) && document.d(orderBy.b) == null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    Iterator it2 = Collections.EMPTY_LIST.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = true;
                            break;
                        }
                        if (!((Filter) it2.next()).d(document)) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean e() {
        List list = Collections.EMPTY_LIST;
        return list.isEmpty() && (list.isEmpty() || (list.size() == 1 && ((OrderBy) list.get(0)).b.equals(FieldPath.e)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        return f().equals(((Query) obj).f());
    }

    public final synchronized Target f() {
        if (this.c == null) {
            List listC = c();
            synchronized (this) {
                this.c = new Target(this.e, null, Collections.EMPTY_LIST, listC, -1L, null, null);
            }
        }
        return this.c;
    }

    public final int hashCode() {
        return LimitType.d.hashCode() + (f().hashCode() * 31);
    }

    public final String toString() {
        return "Query(target=" + f().toString() + ";limitType=LIMIT_TO_FIRST)";
    }
}
