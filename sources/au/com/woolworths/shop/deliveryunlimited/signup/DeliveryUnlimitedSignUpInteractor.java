package au.com.woolworths.shop.deliveryunlimited.signup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeSubmissionInput;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeSubmissionInstrumentInput;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSignUpInteractor;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSignUpInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DeliveryUnlimitedSignUpRepository f10849a;

    public DeliveryUnlimitedSignUpInteractor(DeliveryUnlimitedSignUpRepository deliveryUnlimitedSignUpRepository) {
        this.f10849a = deliveryUnlimitedSignUpRepository;
    }

    public final Object a(String str, int i, String str2, String str3, Continuation continuation) {
        return this.f10849a.d(new DeliveryUnlimitedSubscribeSubmissionInput(str, CollectionsKt.Q(new DeliveryUnlimitedSubscribeSubmissionInstrumentInput(Optional.Companion.a(new Integer(i)), Optional.Companion.a(str3), str2))), (ContinuationImpl) continuation);
    }
}
