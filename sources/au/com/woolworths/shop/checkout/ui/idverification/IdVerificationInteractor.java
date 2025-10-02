package au.com.woolworths.shop.checkout.ui.idverification;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationInteractor;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdVerificationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final IdVerificationRepository f10798a;
    public final DispatcherProvider b;

    public IdVerificationInteractor(IdVerificationRepository idVerificationRepository, DispatcherProvider dispatchers) {
        Intrinsics.h(dispatchers, "dispatchers");
        this.f10798a = idVerificationRepository;
        this.b = dispatchers;
    }
}
