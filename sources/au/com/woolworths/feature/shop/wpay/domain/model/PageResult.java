package au.com.woolworths.feature.shop.wpay.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Uninitialized", "Success", "Fail", "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Success;", "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Uninitialized;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PageResult<T> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Fail;", "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail implements PageResult {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f8284a;

        public Fail(Exception error) {
            Intrinsics.h(error, "error");
            this.f8284a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fail) && Intrinsics.c(this.f8284a, ((Fail) obj).f8284a);
        }

        public final int hashCode() {
            return this.f8284a.hashCode();
        }

        public final String toString() {
            return "Fail(error=" + this.f8284a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Success;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success<T> implements PageResult<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f8285a;

        public Success(Object obj) {
            this.f8285a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f8285a, ((Success) obj).f8285a);
        }

        public final int hashCode() {
            Object obj = this.f8285a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return b.n(this.f8285a, "Success(data=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult$Uninitialized;", "Lau/com/woolworths/feature/shop/wpay/domain/model/PageResult;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Uninitialized implements PageResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Uninitialized f8286a = new Uninitialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninitialized);
        }

        public final int hashCode() {
            return 1640030750;
        }

        public final String toString() {
            return "Uninitialized";
        }
    }

    default boolean a() {
        return this instanceof Success;
    }

    default Throwable b() {
        if (this instanceof Fail) {
            return ((Fail) this).f8284a;
        }
        return null;
    }

    default Object c() {
        Success success = this instanceof Success ? (Success) this : null;
        if (success != null) {
            return success.f8285a;
        }
        return null;
    }
}
