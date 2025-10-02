package au.com.woolworths.feature.shop.catalogue.browse.contents.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/model/CategoryCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CategoryCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f6804a;
    public final String b;
    public final String c;

    public CategoryCard(String str, String str2, String str3) {
        this.f6804a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryCard)) {
            return false;
        }
        CategoryCard categoryCard = (CategoryCard) obj;
        return Intrinsics.c(this.f6804a, categoryCard.f6804a) && Intrinsics.c(this.b, categoryCard.b) && Intrinsics.c(this.c, categoryCard.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6804a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("CategoryCard(id=", this.f6804a, ", title=", this.b, ", image="), this.c, ")");
    }
}
