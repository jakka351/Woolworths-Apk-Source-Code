package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/zoomablepage/ZoomablePage;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ZoomablePage {

    /* renamed from: a, reason: collision with root package name */
    public final String f8046a;
    public final int b;
    public final int c;
    public final Object d;

    public ZoomablePage(String imageUrl, int i, int i2, List list) {
        Intrinsics.h(imageUrl, "imageUrl");
        this.f8046a = imageUrl;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomablePage)) {
            return false;
        }
        ZoomablePage zoomablePage = (ZoomablePage) obj;
        return Intrinsics.c(this.f8046a, zoomablePage.f8046a) && this.b == zoomablePage.b && this.c == zoomablePage.c && this.d.equals(zoomablePage.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.a(this.c, b.a(this.b, this.f8046a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("ZoomablePage(imageUrl=", this.b, this.f8046a, ", width=", ", height=");
        sbU.append(this.c);
        sbU.append(", clickableRects=");
        sbU.append(this.d);
        sbU.append(")");
        return sbU.toString();
    }
}
