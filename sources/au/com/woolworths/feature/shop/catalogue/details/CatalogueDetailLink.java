package au.com.woolworths.feature.shop.catalogue.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.ui.a;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "", "Page", "Recipe", "Search", "Web", "DeepLink", "Companion", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$DeepLink;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Page;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Recipe;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Search;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Web;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class CatalogueDetailLink {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6819a = LazyKt.b(new a(1));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Companion;", "", "", "PAGE_URL_PREFIX", "Ljava/lang/String;", "PRODUCTS", "RECIPE", "SEARCH", "SHOP", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static DeepLink a(String str) {
            String str2 = (String) StringsKt.T(str, new String[]{"?"}, 6).get(0);
            Iterator it = ((Set) CatalogueDetailLink.f6819a.getD()).iterator();
            while (it.hasNext()) {
                String str3 = (String) StringsKt.T((String) it.next(), new String[]{"?"}, 6).get(0);
                int i = 0;
                for (int i2 = 0; i2 < str3.length(); i2++) {
                    if (str3.charAt(i2) == '{') {
                        i++;
                    }
                }
                Lazy lazy = CatalogueDetailLink.f6819a;
                if (Intrinsics.c(b(i, str3), b(i, str2))) {
                    return new DeepLink(str);
                }
            }
            return null;
        }

        public static String b(int i, String str) {
            List listT = StringsKt.T(str, new String[]{q2.c}, 6);
            return CollectionsKt.M(CollectionsKt.w0(listT, listT.size() - i), q2.c, null, null, null, 62);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$DeepLink;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeepLink extends CatalogueDetailLink {
        public final String b;

        public DeepLink(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLink) && Intrinsics.c(this.b, ((DeepLink) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return YU.a.h("DeepLink(deepLink=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Page;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Page extends CatalogueDetailLink {
        public final int b;

        public Page(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Page) && this.b == ((Page) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return YU.a.e(this.b, "Page(indexFromZero=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Recipe;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recipe extends CatalogueDetailLink {
        public final String b;

        public Recipe(String id) {
            Intrinsics.h(id, "id");
            this.b = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Recipe) && Intrinsics.c(this.b, ((Recipe) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return YU.a.h("Recipe(id=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Search;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Search extends CatalogueDetailLink {
        public final String b;
        public final Object c;

        public Search(String str, Map map) {
            this.b = str;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Search)) {
                return false;
            }
            Search search = (Search) obj;
            return this.b.equals(search.b) && this.c.equals(search.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Search(term=" + this.b + ", filterOptions=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink$Web;", "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Web extends CatalogueDetailLink {
        public final String b;

        public Web(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Web) && Intrinsics.c(this.b, ((Web) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return YU.a.h("Web(rawUrl=", this.b, ")");
        }
    }
}
