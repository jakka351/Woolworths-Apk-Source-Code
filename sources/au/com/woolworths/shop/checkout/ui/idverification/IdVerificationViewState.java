package au.com.woolworths.shop.checkout.ui.idverification;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState;", "", "Content", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IdVerificationViewState {

    /* renamed from: a, reason: collision with root package name */
    public final Content f10802a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content;", "", "Loading", "Loaded", "Error", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Error;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Loaded;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Loading;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Content {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Error;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends Content {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f10803a;

            public Error(FullPageMessage.Error error) {
                this.f10803a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f10803a, ((Error) obj).f10803a);
            }

            public final int hashCode() {
                return this.f10803a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f10803a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Loaded;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loaded extends Content {

            /* renamed from: a, reason: collision with root package name */
            public final IdVerificationInitData f10804a;

            public Loaded(IdVerificationInitData initData) {
                Intrinsics.h(initData, "initData");
                this.f10804a = initData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && Intrinsics.c(this.f10804a, ((Loaded) obj).f10804a);
            }

            public final int hashCode() {
                return this.f10804a.hashCode();
            }

            public final String toString() {
                return "Loaded(initData=" + this.f10804a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content$Loading;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationViewState$Content;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Loading extends Content {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f10805a = new Loading();
        }
    }

    public IdVerificationViewState(Content content) {
        this.f10802a = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdVerificationViewState) && Intrinsics.c(this.f10802a, ((IdVerificationViewState) obj).f10802a);
    }

    public final int hashCode() {
        return this.f10802a.hashCode();
    }

    public final String toString() {
        return "IdVerificationViewState(content=" + this.f10802a + ")";
    }
}
