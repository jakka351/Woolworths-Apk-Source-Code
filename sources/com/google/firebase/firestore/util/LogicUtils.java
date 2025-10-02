package com.google.firebase.firestore.util;

import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.InFilter;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class LogicUtils {
    public static Filter a(Filter filter) {
        d(filter);
        if (filter instanceof FieldFilter) {
            return filter;
        }
        CompositeFilter compositeFilter = (CompositeFilter) filter;
        ArrayList arrayList = compositeFilter.f15443a;
        CompositeFilter.Operator operator = compositeFilter.b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        if (listUnmodifiableList.size() == 1) {
            return a((Filter) listUnmodifiableList.get(0));
        }
        Iterator it = compositeFilter.f15443a.iterator();
        while (it.hasNext()) {
            if (((Filter) it.next()) instanceof CompositeFilter) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listUnmodifiableList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(a((Filter) it2.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Filter filter2 = (Filter) it3.next();
                    if (filter2 instanceof FieldFilter) {
                        arrayList3.add(filter2);
                    } else if (filter2 instanceof CompositeFilter) {
                        CompositeFilter compositeFilter2 = (CompositeFilter) filter2;
                        if (compositeFilter2.b.equals(operator)) {
                            arrayList3.addAll(Collections.unmodifiableList(compositeFilter2.f15443a));
                        } else {
                            arrayList3.add(compositeFilter2);
                        }
                    }
                }
                return arrayList3.size() == 1 ? (Filter) arrayList3.get(0) : new CompositeFilter(arrayList3, operator);
            }
        }
        return compositeFilter;
    }

    public static CompositeFilter b(FieldFilter fieldFilter, CompositeFilter compositeFilter) {
        boolean zE = compositeFilter.e();
        ArrayList arrayList = compositeFilter.f15443a;
        if (zE) {
            List listSingletonList = Collections.singletonList(fieldFilter);
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(listSingletonList);
            return new CompositeFilter(arrayList2, compositeFilter.b);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            arrayList3.add(c(fieldFilter, (Filter) it.next()));
        }
        return new CompositeFilter(arrayList3, CompositeFilter.Operator.OR);
    }

    public static Filter c(Filter filter, Filter filter2) {
        CompositeFilter compositeFilter;
        CompositeFilter compositeFilterB;
        d(filter);
        d(filter2);
        boolean z = filter instanceof FieldFilter;
        if (z && (filter2 instanceof FieldFilter)) {
            compositeFilterB = new CompositeFilter(Arrays.asList((FieldFilter) filter, (FieldFilter) filter2), CompositeFilter.Operator.AND);
        } else if (z && (filter2 instanceof CompositeFilter)) {
            compositeFilterB = b((FieldFilter) filter, (CompositeFilter) filter2);
        } else if ((filter instanceof CompositeFilter) && (filter2 instanceof FieldFilter)) {
            compositeFilterB = b((FieldFilter) filter2, (CompositeFilter) filter);
        } else {
            CompositeFilter compositeFilter2 = (CompositeFilter) filter;
            CompositeFilter compositeFilter3 = (CompositeFilter) filter2;
            ArrayList arrayList = compositeFilter2.f15443a;
            CompositeFilter.Operator operator = compositeFilter2.b;
            Assert.b((Collections.unmodifiableList(arrayList).isEmpty() || Collections.unmodifiableList(compositeFilter3.f15443a).isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
            if (compositeFilter2.e() && compositeFilter3.e()) {
                List listUnmodifiableList = Collections.unmodifiableList(compositeFilter3.f15443a);
                ArrayList arrayList2 = new ArrayList(compositeFilter2.f15443a);
                arrayList2.addAll(listUnmodifiableList);
                compositeFilter = new CompositeFilter(arrayList2, operator);
            } else {
                CompositeFilter.Operator operator2 = CompositeFilter.Operator.OR;
                CompositeFilter compositeFilter4 = operator == operator2 ? compositeFilter2 : compositeFilter3;
                if (operator == operator2) {
                    compositeFilter2 = compositeFilter3;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = Collections.unmodifiableList(compositeFilter4.f15443a).iterator();
                while (it.hasNext()) {
                    arrayList3.add(c((Filter) it.next(), compositeFilter2));
                }
                compositeFilter = new CompositeFilter(arrayList3, operator2);
            }
            compositeFilterB = compositeFilter;
        }
        return a(compositeFilterB);
    }

    public static void d(Filter filter) {
        Assert.b((filter instanceof FieldFilter) || (filter instanceof CompositeFilter), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    public static Filter e(Filter filter) {
        d(filter);
        if (filter instanceof FieldFilter) {
            return filter;
        }
        CompositeFilter compositeFilter = (CompositeFilter) filter;
        if (Collections.unmodifiableList(compositeFilter.f15443a).size() == 1) {
            return e((Filter) filter.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(compositeFilter.f15443a).iterator();
        while (it.hasNext()) {
            arrayList.add(e((Filter) it.next()));
        }
        Filter filterA = a(new CompositeFilter(arrayList, compositeFilter.b));
        if (g(filterA)) {
            return filterA;
        }
        Assert.b(filterA instanceof CompositeFilter, "field filters are already in DNF form.", new Object[0]);
        CompositeFilter compositeFilter2 = (CompositeFilter) filterA;
        boolean zE = compositeFilter2.e();
        ArrayList arrayList2 = compositeFilter2.f15443a;
        Assert.b(zE, "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        Assert.b(Collections.unmodifiableList(arrayList2).size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        Filter filterC = (Filter) Collections.unmodifiableList(arrayList2).get(0);
        for (int i = 1; i < Collections.unmodifiableList(arrayList2).size(); i++) {
            filterC = c(filterC, (Filter) Collections.unmodifiableList(arrayList2).get(i));
        }
        return filterC;
    }

    public static Filter f(Filter filter) {
        d(filter);
        ArrayList arrayList = new ArrayList();
        if (!(filter instanceof FieldFilter)) {
            CompositeFilter compositeFilter = (CompositeFilter) filter;
            Iterator it = Collections.unmodifiableList(compositeFilter.f15443a).iterator();
            while (it.hasNext()) {
                arrayList.add(f((Filter) it.next()));
            }
            return new CompositeFilter(arrayList, compositeFilter.b);
        }
        if (!(filter instanceof InFilter)) {
            return filter;
        }
        InFilter inFilter = (InFilter) filter;
        Iterator it2 = inFilter.b.W().i().iterator();
        while (it2.hasNext()) {
            arrayList.add(FieldFilter.e(inFilter.c, FieldFilter.Operator.EQUAL, (Value) it2.next()));
        }
        return new CompositeFilter(arrayList, CompositeFilter.Operator.OR);
    }

    public static boolean g(Filter filter) {
        if (filter instanceof FieldFilter) {
            return true;
        }
        boolean z = filter instanceof CompositeFilter;
        if (z) {
            CompositeFilter compositeFilter = (CompositeFilter) filter;
            Iterator it = compositeFilter.f15443a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Filter) it.next()) instanceof CompositeFilter) {
                        break;
                    }
                } else if (compositeFilter.e()) {
                    return true;
                }
            }
        }
        if (!z) {
            return false;
        }
        CompositeFilter compositeFilter2 = (CompositeFilter) filter;
        if (compositeFilter2.b != CompositeFilter.Operator.OR) {
            return false;
        }
        for (Filter filter2 : Collections.unmodifiableList(compositeFilter2.f15443a)) {
            if (!(filter2 instanceof FieldFilter)) {
                if (!(filter2 instanceof CompositeFilter)) {
                    return false;
                }
                CompositeFilter compositeFilter3 = (CompositeFilter) filter2;
                Iterator it2 = compositeFilter3.f15443a.iterator();
                while (it2.hasNext()) {
                    if (((Filter) it2.next()) instanceof CompositeFilter) {
                        return false;
                    }
                }
                if (!compositeFilter3.e()) {
                    return false;
                }
            }
        }
        return true;
    }
}
