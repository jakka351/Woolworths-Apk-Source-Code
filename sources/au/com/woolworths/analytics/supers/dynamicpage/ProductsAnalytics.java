package au.com.woolworths.analytics.supers.dynamicpage;

import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ProductsAnalytics;", "", "Products", "ProductCategory", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsAnalytics {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ProductsAnalytics$ProductCategory;", "Lau/com/woolworths/analytics/Screen;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCategory implements Screen {
        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getD()) && Intrinsics.c(null, screen.getData());
        }

        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return null;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/supers/dynamicpage/ProductsAnalytics$Products;", "Lau/com/woolworths/analytics/Screen;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Products implements Screen {
        public static final Object d = MapsKt.j(new Pair("screen.Name", "Products screen"), new Pair("app.Section", "Products"));

        @Override // au.com.woolworths.analytics.Event
        /* renamed from: d */
        public final String getD() {
            return "products_screen";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return "Products screen".equals(screen.getD()) && "products_screen".equals(screen.getD()) && Intrinsics.c(d, screen.getData());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // au.com.woolworths.analytics.Event
        public final Map getData() {
            return d;
        }

        @Override // au.com.woolworths.analytics.Screen
        /* renamed from: getName */
        public final String getD() {
            return "Products screen";
        }

        public final int hashCode() {
            return d.hashCode() - 1427040831;
        }
    }
}
