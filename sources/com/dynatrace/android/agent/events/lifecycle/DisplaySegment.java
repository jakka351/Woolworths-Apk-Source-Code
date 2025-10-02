package com.dynatrace.android.agent.events.lifecycle;

import YU.a;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class DisplaySegment extends CustomSegment {
    public final MeasurementPoint p;
    public final MeasurementPoint q;
    public final MeasurementPoint r;
    public final MeasurementPoint s;
    public final boolean t;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14122a;
        public Session b;
        public int c;
        public long d;
        public EventType e;
        public MeasurementPoint f;
        public MeasurementPoint g;
        public MeasurementPoint h;
        public MeasurementPoint i;
        public MeasurementPoint j;
        public boolean k;
    }

    public DisplaySegment(Builder builder) {
        super(builder.f14122a, 15, builder.b, builder.c, builder.k);
        this.j = builder.e;
        MeasurementPoint measurementPoint = builder.f;
        this.g = measurementPoint.b;
        this.b = measurementPoint.f14128a;
        this.d = builder.d;
        this.p = builder.g;
        this.q = builder.h;
        this.r = builder.i;
        this.s = builder.j;
        this.e = true;
        this.t = builder.k;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        long j = this.b;
        int i = this.g;
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&na=");
        sbS.append(Utility.f(this.k));
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&ca=");
        sbS.append(this.m);
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        sbS.append(i);
        sbS.append("&t0=");
        sbS.append(j);
        MeasurementPoint measurementPoint = this.p;
        if (measurementPoint != null) {
            sbS.append("&s1=");
            sbS.append(measurementPoint.b);
            sbS.append("&t1=");
            sbS.append(measurementPoint.f14128a);
        }
        MeasurementPoint measurementPoint2 = this.q;
        if (measurementPoint2 != null) {
            sbS.append("&s2=");
            sbS.append(measurementPoint2.b);
            sbS.append("&t2=");
            sbS.append(measurementPoint2.f14128a);
        }
        MeasurementPoint measurementPoint3 = this.r;
        if (measurementPoint3 != null) {
            sbS.append("&s3=");
            sbS.append(measurementPoint3.b);
            sbS.append("&t3=");
            sbS.append(measurementPoint3.f14128a);
        }
        MeasurementPoint measurementPoint4 = this.s;
        if (measurementPoint4 != null) {
            sbS.append("&s4=");
            sbS.append(measurementPoint4.b);
            sbS.append("&t4=");
            sbS.append(measurementPoint4.f14128a);
        }
        sbS.append("&fw=");
        sbS.append(this.t ? "1" : "0");
        return sbS;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final int i() {
        return this.l;
    }
}
