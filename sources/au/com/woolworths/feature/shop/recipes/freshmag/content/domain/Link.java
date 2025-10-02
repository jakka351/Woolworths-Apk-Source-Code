package au.com.woolworths.feature.shop.recipes.freshmag.content.domain;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Link;", "", "Internal", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Link$Internal;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Link {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Link$Internal;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/domain/Link;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Internal extends Link {

        /* renamed from: a, reason: collision with root package name */
        public final int f8033a;

        public Internal(int i) {
            this.f8033a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Internal) && this.f8033a == ((Internal) obj).f8033a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8033a);
        }

        public final String toString() {
            return a.e(this.f8033a, "Internal(pageNumber=", ")");
        }
    }
}
