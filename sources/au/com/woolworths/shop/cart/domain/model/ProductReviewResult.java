package au.com.woolworths.shop.cart.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult;", "", "Response", "Empty", "Error", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Empty;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Error;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Response;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductReviewResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Empty;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Empty extends ProductReviewResult {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10447a;

        public Empty(boolean z) {
            this.f10447a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Empty) && this.f10447a == ((Empty) obj).f10447a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10447a);
        }

        public final String toString() {
            return a.n("Empty(requiresProductReview=", ")", this.f10447a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Error;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends ProductReviewResult {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10448a;

        public Error(List list) {
            this.f10448a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f10448a.equals(((Error) obj).f10448a);
        }

        public final int hashCode() {
            return this.f10448a.hashCode();
        }

        public final String toString() {
            return b.n(this.f10448a, "Error(errors=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult$Response;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewResult;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Response extends ProductReviewResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f10449a;
        public final List b;
        public final List c;

        public Response(String str, List list, List list2) {
            this.f10449a = str;
            this.b = list;
            this.c = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return Intrinsics.c(this.f10449a, response.f10449a) && Intrinsics.c(this.b, response.b) && Intrinsics.c(this.c, response.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.d(this.f10449a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.t(au.com.woolworths.android.onesite.a.s("Response(message=", this.f10449a, ", feed=", ", analytics=", this.b), this.c, ")");
        }
    }
}
