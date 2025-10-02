package au.com.woolworths.product.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostContract;", "", "Action", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductBoostContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostContract$Action;", "", "ShowSnackbar", "ShowRetrySnackbar", "Lau/com/woolworths/product/offers/ProductBoostContract$Action$ShowRetrySnackbar;", "Lau/com/woolworths/product/offers/ProductBoostContract$Action$ShowSnackbar;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        /* renamed from: a, reason: collision with root package name */
        public final Object f9322a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostContract$Action$ShowRetrySnackbar;", "Lau/com/woolworths/product/offers/ProductBoostContract$Action;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowRetrySnackbar extends Action {
            public final String b;
            public final ArrayList c;
            public final TrackableBoostMetadata d;
            public final Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowRetrySnackbar(TrackableBoostMetadata trackableBoostMetadata, Object obj, String str, ArrayList arrayList) {
                super(obj);
                Intrinsics.h(trackableBoostMetadata, "trackableBoostMetadata");
                this.b = str;
                this.c = arrayList;
                this.d = trackableBoostMetadata;
                this.e = obj;
            }

            @Override // au.com.woolworths.product.offers.ProductBoostContract.Action
            /* renamed from: a, reason: from getter */
            public final Object getF9322a() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowRetrySnackbar)) {
                    return false;
                }
                ShowRetrySnackbar showRetrySnackbar = (ShowRetrySnackbar) obj;
                return this.b.equals(showRetrySnackbar.b) && this.c.equals(showRetrySnackbar.c) && Intrinsics.c(this.d, showRetrySnackbar.d) && Intrinsics.c(this.e, showRetrySnackbar.e);
            }

            public final int hashCode() {
                int iHashCode = (this.d.hashCode() + a.b(((this.b.hashCode() * 31) + 78852744) * 31, 31, this.c)) * 31;
                Object obj = this.e;
                return iHashCode + (obj == null ? 0 : obj.hashCode());
            }

            public final String toString() {
                StringBuilder sbX = d.x("ShowRetrySnackbar(text=", this.b, ", actionText=Retry, originalProducts=", ", trackableBoostMetadata=", this.c);
                sbX.append(this.d);
                sbX.append(", requestTag=");
                sbX.append(this.e);
                sbX.append(")");
                return sbX.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/offers/ProductBoostContract$Action$ShowSnackbar;", "Lau/com/woolworths/product/offers/ProductBoostContract$Action;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Action {
            public final String b;
            public final Object c;

            public ShowSnackbar(String str, Object obj) {
                super(obj);
                this.b = str;
                this.c = obj;
            }

            @Override // au.com.woolworths.product.offers.ProductBoostContract.Action
            /* renamed from: a, reason: from getter */
            public final Object getF9322a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSnackbar)) {
                    return false;
                }
                ShowSnackbar showSnackbar = (ShowSnackbar) obj;
                return Intrinsics.c(this.b, showSnackbar.b) && Intrinsics.c(this.c, showSnackbar.c);
            }

            public final int hashCode() {
                int iHashCode = this.b.hashCode() * 31;
                Object obj = this.c;
                return iHashCode + (obj == null ? 0 : obj.hashCode());
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.b + ", requestTag=" + this.c + ")";
            }
        }

        public Action(Object obj) {
            this.f9322a = obj;
        }

        /* renamed from: a, reason: from getter */
        public Object getF9322a() {
            return this.f9322a;
        }
    }
}
