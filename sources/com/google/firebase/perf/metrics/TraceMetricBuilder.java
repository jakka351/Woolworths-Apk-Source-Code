package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class TraceMetricBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Trace f15705a;

    public TraceMetricBuilder(Trace trace) {
        this.f15705a = trace;
    }

    public final TraceMetric a() {
        List listUnmodifiableList;
        TraceMetric.Builder builderE0 = TraceMetric.e0();
        builderE0.y(this.f15705a.g);
        builderE0.v(this.f15705a.n.d);
        Trace trace = this.f15705a;
        builderE0.w(trace.n.b(trace.o));
        for (Counter counter : this.f15705a.h.values()) {
            builderE0.u(counter.e.get(), counter.d);
        }
        ArrayList arrayList = this.f15705a.k;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                builderE0.t(new TraceMetricBuilder((Trace) it.next()).a());
            }
        }
        Map<String, String> attributes = this.f15705a.getAttributes();
        builderE0.p();
        TraceMetric.P((TraceMetric) builderE0.e).putAll(attributes);
        Trace trace2 = this.f15705a;
        synchronized (trace2.j) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.j) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrB = PerfSession.b(listUnmodifiableList);
        if (perfSessionArrB != null) {
            List listAsList = Arrays.asList(perfSessionArrB);
            builderE0.p();
            TraceMetric.R((TraceMetric) builderE0.e, listAsList);
        }
        return (TraceMetric) builderE0.m();
    }
}
