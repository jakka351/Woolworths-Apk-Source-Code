package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ShapeData {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13416a;
    public PointF b;
    public boolean c;

    public ShapeData(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.f13416a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f13416a.size());
        sb.append("closed=");
        return b.s(sb, this.c, '}');
    }

    public ShapeData() {
        this.f13416a = new ArrayList();
    }
}
