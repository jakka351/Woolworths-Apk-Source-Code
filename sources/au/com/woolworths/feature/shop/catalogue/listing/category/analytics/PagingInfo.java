package au.com.woolworths.feature.shop.catalogue.listing.category.analytics;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo;", "", "Loaded", "Error", "Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo$Error;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo$Loaded;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PagingInfo {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo$Error;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements PagingInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Exception f6875a;

        public Error(Exception exc) {
            this.f6875a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f6875a.equals(((Error) obj).f6875a);
        }

        public final int hashCode() {
            return this.f6875a.hashCode();
        }

        public final String toString() {
            return "Error(cause=" + this.f6875a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo$Loaded;", "Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loaded implements PagingInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f6876a;
        public final int b;

        public Loaded(int i, int i2) {
            this.f6876a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.f6876a == loaded.f6876a && this.b == loaded.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f6876a) * 31);
        }

        public final String toString() {
            return b.j(this.f6876a, this.b, "Loaded(page=", ", items=", ")");
        }
    }
}
