package com.google.firebase.firestore.core;

import android.text.TextUtils;
import com.google.firebase.firestore.model.Document;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class CompositeFilter extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15443a;
    public final Operator b;
    public ArrayList c;

    public enum Operator {
        AND("and"),
        OR("or");

        public final String d;

        Operator(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public CompositeFilter(List list, Operator operator) {
        this.f15443a = new ArrayList(list);
        this.b = operator;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final String a() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f15443a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Filter) it.next()) instanceof CompositeFilter) {
                    break;
                }
            } else if (e()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sb.append(((Filter) it2.next()).a());
                }
                return sb.toString();
            }
        }
        sb.append(this.b.d.concat("("));
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final List b() {
        return Collections.unmodifiableList(this.f15443a);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.c = new ArrayList();
        Iterator it = this.f15443a.iterator();
        while (it.hasNext()) {
            this.c.addAll(((Filter) it.next()).c());
        }
        return Collections.unmodifiableList(this.c);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final boolean d(Document document) {
        boolean zE = e();
        ArrayList arrayList = this.f15443a;
        if (zE) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Filter) it.next()).d(document)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((Filter) it2.next()).d(document)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.b == Operator.AND;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CompositeFilter)) {
            return false;
        }
        CompositeFilter compositeFilter = (CompositeFilter) obj;
        return this.b == compositeFilter.b && this.f15443a.equals(compositeFilter.f15443a);
    }

    public final int hashCode() {
        return this.f15443a.hashCode() + ((this.b.hashCode() + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
