package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Coords;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Coords {

    /* renamed from: a, reason: collision with root package name */
    public final int f8030a;
    public final int b;
    public final int c;
    public final int d;

    public Coords(int i, int i2, int i3, int i4) {
        this.f8030a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coords)) {
            return false;
        }
        Coords coords = (Coords) obj;
        return this.f8030a == coords.f8030a && this.b == coords.b && this.c == coords.c && this.d == coords.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, b.a(this.b, Integer.hashCode(this.f8030a) * 31, 31), 31);
    }

    public final String toString() {
        return a.i(this.c, this.d, ", bottom=", ")", YU.a.q(this.f8030a, this.b, "Coords(left=", ", top=", ", right="));
    }
}
