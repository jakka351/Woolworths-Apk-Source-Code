package com.google.firebase.firestore.model;

import androidx.browser.trusted.a;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.FieldIndex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public class TargetIndexMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final String f15536a;
    public final TreeSet b;
    public final ArrayList c;
    public final List d;

    public TargetIndexMatcher(Target target) {
        String str = target.e;
        this.f15536a = str == null ? target.d.e() : str;
        this.d = target.b;
        this.b = new TreeSet(new a(10));
        this.c = new ArrayList();
        Iterator it = target.c.iterator();
        while (it.hasNext()) {
            FieldFilter fieldFilter = (FieldFilter) ((Filter) it.next());
            fieldFilter.getClass();
            if (Arrays.asList(FieldFilter.Operator.LESS_THAN, FieldFilter.Operator.LESS_THAN_OR_EQUAL, FieldFilter.Operator.GREATER_THAN, FieldFilter.Operator.GREATER_THAN_OR_EQUAL, FieldFilter.Operator.NOT_EQUAL, FieldFilter.Operator.NOT_IN).contains(fieldFilter.f15451a)) {
                this.b.add(fieldFilter);
            } else {
                this.c.add(fieldFilter);
            }
        }
    }

    public static boolean a(FieldFilter fieldFilter, FieldIndex.Segment segment) {
        if (fieldFilter != null) {
            FieldFilter.Operator operator = fieldFilter.f15451a;
            if (fieldFilter.c.equals(segment.b())) {
                if (segment.c().equals(FieldIndex.Segment.Kind.f) == (operator.equals(FieldFilter.Operator.ARRAY_CONTAINS) || operator.equals(FieldFilter.Operator.ARRAY_CONTAINS_ANY))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(OrderBy orderBy, FieldIndex.Segment segment) {
        FieldPath fieldPath = orderBy.b;
        OrderBy.Direction direction = orderBy.f15457a;
        if (!fieldPath.equals(segment.b())) {
            return false;
        }
        if (segment.c().equals(FieldIndex.Segment.Kind.d) && direction.equals(OrderBy.Direction.ASCENDING)) {
            return true;
        }
        return segment.c().equals(FieldIndex.Segment.Kind.e) && direction.equals(OrderBy.Direction.DESCENDING);
    }
}
