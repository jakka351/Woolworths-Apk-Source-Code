package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.Metrics;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ConstraintLayoutStatistics {

    /* renamed from: a, reason: collision with root package name */
    public final Metrics f2368a;

    static {
        new String(new char[25]).replace((char) 0, ' ');
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        new ArrayList();
        this.f2368a = metrics;
        Metrics metrics2 = constraintLayoutStatistics.f2368a;
        metrics2.getClass();
        metrics.f2263a = metrics2.f2263a;
        metrics.h = metrics2.h;
        metrics.b = metrics2.b;
        metrics.f = metrics2.f;
        metrics.g = metrics2.g;
        metrics.c = metrics2.c;
        metrics.d = metrics2.d;
    }

    public final Object clone() {
        return new ConstraintLayoutStatistics(this);
    }
}
