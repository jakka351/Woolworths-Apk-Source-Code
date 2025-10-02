package com.otaliastudios.zoom.internal.matrix;

import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixUpdate;", "", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MatrixUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final float f16820a;
    public final boolean b;
    public final AbsolutePoint c;
    public final ScaledPoint d;
    public final boolean e;
    public final boolean f;
    public final Float g;
    public final Float h;
    public final boolean i;
    public final boolean j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixUpdate$Builder;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public float f16821a;
        public boolean b;
        public AbsolutePoint c;
        public ScaledPoint d;
        public boolean e;
        public boolean f;
        public Float g;
        public Float h;
        public boolean i;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixUpdate$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public static MatrixUpdate a(Function1 function1) {
            Builder builder = new Builder();
            builder.f16821a = Float.NaN;
            builder.i = true;
            function1.invoke(builder);
            return new MatrixUpdate(builder.f16821a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i);
        }
    }

    public MatrixUpdate(float f, boolean z, AbsolutePoint absolutePoint, ScaledPoint scaledPoint, boolean z2, boolean z3, Float f2, Float f3, boolean z4) {
        this.f16820a = f;
        this.b = z;
        this.c = absolutePoint;
        this.d = scaledPoint;
        this.e = z2;
        this.f = z3;
        this.g = f2;
        this.h = f3;
        this.i = z4;
        if (absolutePoint != null && scaledPoint != null) {
            throw new IllegalStateException("Can only use either pan or scaledPan");
        }
        this.j = (absolutePoint == null && scaledPoint == null) ? false : true;
    }
}
