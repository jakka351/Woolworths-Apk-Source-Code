package androidx.compose.animation.graphics.vector;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0080\b\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolder2D;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "Lkotlin/Pair;", "", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PropertyValuesHolder2D extends PropertyValuesHolder<Pair<? extends Float, ? extends Float>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f816a;
    public final String b;
    public final Object c;
    public final Easing d;

    public PropertyValuesHolder2D(String str, String str2, List list, Easing easing) {
        this.f816a = str;
        this.b = str2;
        this.c = list;
        this.d = easing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyValuesHolder2D)) {
            return false;
        }
        PropertyValuesHolder2D propertyValuesHolder2D = (PropertyValuesHolder2D) obj;
        return this.f816a.equals(propertyValuesHolder2D.f816a) && this.b.equals(propertyValuesHolder2D.b) && this.c.equals(propertyValuesHolder2D.c) && Intrinsics.c(this.d, propertyValuesHolder2D.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.e(b.c(this.f816a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PropertyValuesHolder2D(xPropertyName=" + this.f816a + ", yPropertyName=" + this.b + ", pathData=" + this.c + ", interpolator=" + this.d + ')';
    }
}
