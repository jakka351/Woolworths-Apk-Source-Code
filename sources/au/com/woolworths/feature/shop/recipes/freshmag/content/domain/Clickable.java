package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Clickable;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Clickable {

    /* renamed from: a, reason: collision with root package name */
    public final String f8029a;
    public final Coords b;
    public final String c;

    public Clickable(String str, Coords coords, String str2) {
        this.f8029a = str;
        this.b = coords;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clickable)) {
            return false;
        }
        Clickable clickable = (Clickable) obj;
        return Intrinsics.c(this.f8029a, clickable.f8029a) && Intrinsics.c(this.b, clickable.b) && Intrinsics.c(this.c, clickable.c);
    }

    public final int hashCode() {
        String str = this.f8029a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Clickable(name=");
        sb.append(this.f8029a);
        sb.append(", coordinates=");
        sb.append(this.b);
        sb.append(", url=");
        return a.o(sb, this.c, ")");
    }
}
