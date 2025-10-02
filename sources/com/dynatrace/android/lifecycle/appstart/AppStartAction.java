package com.dynatrace.android.lifecycle.appstart;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;

/* loaded from: classes.dex */
public class AppStartAction {

    /* renamed from: a, reason: collision with root package name */
    public final String f14165a;
    public final MeasurementPoint b;
    public final DTXAutoActionWrapper c;
    public final MeasurementPoint d;
    public final AppStartPlaceholderSegment e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f14166a;
        public MeasurementPoint b;
        public MeasurementPoint c;
        public DTXAutoActionWrapper d;
        public AppStartPlaceholderSegment e;
    }

    public AppStartAction(Builder builder) {
        this.f14165a = builder.f14166a;
        this.b = builder.b;
        this.c = builder.d;
        this.e = builder.e;
        this.d = builder.c;
    }

    public final String toString() {
        return "AppStartAction{name='" + this.f14165a + "', startPoint=" + this.b + ", parentAction=" + this.c + ", endPoint=" + this.d + '}';
    }
}
