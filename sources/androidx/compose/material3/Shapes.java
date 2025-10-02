package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Shapes;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Shapes {

    /* renamed from: a, reason: collision with root package name */
    public final CornerBasedShape f1492a;
    public final CornerBasedShape b;
    public final CornerBasedShape c;
    public final CornerBasedShape d;
    public final CornerBasedShape e;

    public Shapes() {
        RoundedCornerShape roundedCornerShape = ShapeDefaults.f1491a;
        RoundedCornerShape roundedCornerShape2 = ShapeDefaults.b;
        RoundedCornerShape roundedCornerShape3 = ShapeDefaults.c;
        RoundedCornerShape roundedCornerShape4 = ShapeDefaults.d;
        RoundedCornerShape roundedCornerShape5 = ShapeDefaults.e;
        this.f1492a = roundedCornerShape;
        this.b = roundedCornerShape2;
        this.c = roundedCornerShape3;
        this.d = roundedCornerShape4;
        this.e = roundedCornerShape5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.c(this.f1492a, shapes.f1492a) && Intrinsics.c(this.b, shapes.b) && Intrinsics.c(this.c, shapes.c) && Intrinsics.c(this.d, shapes.d) && Intrinsics.c(this.e, shapes.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1492a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f1492a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
