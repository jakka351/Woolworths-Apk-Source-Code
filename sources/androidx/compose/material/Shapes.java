package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Shapes;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Shapes {

    /* renamed from: a, reason: collision with root package name */
    public final RoundedCornerShape f1321a;
    public final RoundedCornerShape b;
    public final RoundedCornerShape c;

    public Shapes() {
        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(4);
        RoundedCornerShape roundedCornerShapeB2 = RoundedCornerShapeKt.b(4);
        RoundedCornerShape roundedCornerShapeB3 = RoundedCornerShapeKt.b(0);
        this.f1321a = roundedCornerShapeB;
        this.b = roundedCornerShapeB2;
        this.c = roundedCornerShapeB3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.c(this.f1321a, shapes.f1321a) && Intrinsics.c(this.b, shapes.b) && Intrinsics.c(this.c, shapes.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f1321a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f1321a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
