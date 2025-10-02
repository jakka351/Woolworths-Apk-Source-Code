package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class ConfirmSubscriptionTermsAndConditionEpoxyControllerOld$buildModels$3$1$1$1$1 extends FunctionReferenceImpl implements Function1<DeliveryUnlimitedSubscribeLink, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeliveryUnlimitedSubscribeLink p0 = (DeliveryUnlimitedSubscribeLink) obj;
        Intrinsics.h(p0, "p0");
        ConfirmSubscriptionViewModel confirmSubscriptionViewModel = (ConfirmSubscriptionViewModel) this.receiver;
        confirmSubscriptionViewModel.getClass();
        confirmSubscriptionViewModel.l.f(new ConfirmSubscriptionContract.Actions.OpenUrl(p0.getUrl()));
        return Unit.f24250a;
    }
}
