package com.dynatrace.android.agent.events.lifecycle;

import YU.a;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class AppStartSegment extends CustomSegment {
    public final MeasurementPoint p;
    public final MeasurementPoint q;
    public final String r;
    public final boolean s;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14120a;
        public Session b;
        public int c;
        public long d;
        public EventType e;
        public MeasurementPoint f;
        public MeasurementPoint g;
        public boolean h;
    }

    public AppStartSegment(Builder builder) {
        super(builder.f14120a, 15, builder.b, builder.c, builder.h);
        this.r = Utility.e(250, builder.f14120a);
        this.j = builder.e;
        MeasurementPoint measurementPoint = builder.f;
        this.g = measurementPoint.b;
        this.b = measurementPoint.f14128a;
        this.d = builder.d;
        this.p = measurementPoint;
        this.q = builder.g;
        this.e = true;
        this.s = builder.h;
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        if (this.r != null) {
            sbS.append("&na=");
            sbS.append(Utility.f(this.k));
        }
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&ca=");
        sbS.append(this.m);
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        MeasurementPoint measurementPoint = this.p;
        sbS.append(measurementPoint.b);
        sbS.append("&t0=");
        sbS.append(measurementPoint.f14128a);
        sbS.append("&s1=");
        MeasurementPoint measurementPoint2 = this.q;
        sbS.append(measurementPoint2.b);
        sbS.append("&t1=");
        sbS.append(measurementPoint2.f14128a);
        sbS.append("&fw=");
        sbS.append(this.s ? "1" : "0");
        return sbS;
    }
}
