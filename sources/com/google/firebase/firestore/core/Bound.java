package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.Value;
import java.util.List;

/* loaded from: classes6.dex */
public final class Bound {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15440a;
    public final List b;

    public Bound(List list, boolean z) {
        this.b = list;
        this.f15440a = z;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Value value : this.b) {
            if (!z) {
                sb.append(",");
            }
            Value value2 = Values.f15537a;
            StringBuilder sb2 = new StringBuilder();
            Values.a(sb2, value);
            sb.append(sb2.toString());
            z = false;
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Bound.class == obj.getClass()) {
            Bound bound = (Bound) obj;
            if (this.f15440a == bound.f15440a && this.b.equals(bound.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f15440a ? 1 : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.f15440a);
        sb.append(", position=");
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                sb.append(")");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(" and ");
            }
            Value value = (Value) list.get(i);
            Value value2 = Values.f15537a;
            StringBuilder sb2 = new StringBuilder();
            Values.a(sb2, value);
            sb.append(sb2.toString());
            i++;
        }
    }
}
