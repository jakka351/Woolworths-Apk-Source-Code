package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/Rect;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Rect {

    /* renamed from: a, reason: collision with root package name */
    public final int f8045a;
    public final int b;
    public final int c;
    public final int d;

    public Rect(int i, int i2, int i3, int i4) {
        this.f8045a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.f8045a == rect.f8045a && this.b == rect.b && this.c == rect.c && this.d == rect.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, b.a(this.b, Integer.hashCode(this.f8045a) * 31, 31), 31);
    }

    public final String toString() {
        return a.i(this.c, this.d, ", bottom=", ")", YU.a.q(this.f8045a, this.b, "Rect(left=", ", top=", ", right="));
    }
}
