package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.FieldPath;

/* loaded from: classes6.dex */
public class OrderBy {

    /* renamed from: a, reason: collision with root package name */
    public final Direction f15457a;
    public final FieldPath b;

    public enum Direction {
        ASCENDING(1),
        DESCENDING(-1);

        public final int d;

        Direction(int i) {
            this.d = i;
        }
    }

    public OrderBy(Direction direction, FieldPath fieldPath) {
        this.f15457a = direction;
        this.b = fieldPath;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof OrderBy)) {
            OrderBy orderBy = (OrderBy) obj;
            if (this.f15457a == orderBy.f15457a && this.b.equals(orderBy.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f15457a.hashCode() + 899) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15457a == Direction.ASCENDING ? "" : "-");
        sb.append(this.b.b());
        return sb.toString();
    }
}
