package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/MagazinePage;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MagazinePage {

    /* renamed from: a, reason: collision with root package name */
    public final String f8035a;
    public final int b;
    public final int c;
    public final Object d;

    public MagazinePage(String imageUrl, int i, int i2, List list) {
        Intrinsics.h(imageUrl, "imageUrl");
        this.f8035a = imageUrl;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagazinePage)) {
            return false;
        }
        MagazinePage magazinePage = (MagazinePage) obj;
        return Intrinsics.c(this.f8035a, magazinePage.f8035a) && this.b == magazinePage.b && this.c == magazinePage.c && this.d.equals(magazinePage.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.a(this.c, b.a(this.b, this.f8035a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("MagazinePage(imageUrl=", this.b, this.f8035a, ", width=", ", height=");
        sbU.append(this.c);
        sbU.append(", clickables=");
        sbU.append(this.d);
        sbU.append(")");
        return sbU.toString();
    }
}
