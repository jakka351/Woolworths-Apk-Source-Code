package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    public final double f1795a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.f1795a, transferParameters.f1795a) == 0 && Double.compare(this.b, transferParameters.b) == 0 && Double.compare(this.c, transferParameters.c) == 0 && Double.compare(this.d, transferParameters.d) == 0 && Double.compare(this.e, transferParameters.e) == 0 && Double.compare(this.f, transferParameters.f) == 0 && Double.compare(this.g, transferParameters.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + android.support.v4.media.session.a.a(this.f, android.support.v4.media.session.a.a(this.e, android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f1795a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferParameters(gamma=");
        sb.append(this.f1795a);
        sb.append(", a=");
        sb.append(this.b);
        sb.append(", b=");
        sb.append(this.c);
        sb.append(", c=");
        sb.append(this.d);
        sb.append(", d=");
        sb.append(this.e);
        sb.append(", e=");
        sb.append(this.f);
        sb.append(", f=");
        return androidx.camera.core.impl.b.p(sb, this.g, ')');
    }

    public TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f1795a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
