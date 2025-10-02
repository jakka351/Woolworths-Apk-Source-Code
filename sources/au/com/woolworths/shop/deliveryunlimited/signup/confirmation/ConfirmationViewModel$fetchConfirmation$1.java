package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.analytics.ConfirmationActions;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationContract;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmation;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationViewModel$fetchConfirmation$1", f = "ConfirmationViewModel.kt", l = {59}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ConfirmationViewModel$fetchConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ConfirmationViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationViewModel$fetchConfirmation$1(ConfirmationViewModel confirmationViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = confirmationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmationViewModel$fetchConfirmation$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmationViewModel$fetchConfirmation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation;
        InsetBannerApiData insetBannerApiData;
        ConfirmationViewModel confirmationViewModel = this.q;
        MutableLiveData mutableLiveData = confirmationViewModel.g;
        AnalyticsManager analyticsManager = confirmationViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                DeliveryUnlimitedSignUpInteractor deliveryUnlimitedSignUpInteractor = confirmationViewModel.e;
                this.p = 1;
                obj = deliveryUnlimitedSignUpInteractor.f10849a.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            deliveryUnlimitedSubscribeConfirmation = (DeliveryUnlimitedSubscribeConfirmation) obj;
            Iterator it = deliveryUnlimitedSubscribeConfirmation.getFeed().iterator();
            do {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                insetBannerApiData = next instanceof InsetBannerApiData ? (InsetBannerApiData) next : null;
            } while (insetBannerApiData == null);
        } catch (Exception unused) {
            mutableLiveData.m(new ConfirmationContract.ViewState(false, EmptyList.d));
            analyticsManager.j(ConfirmationActions.f, TrackingMetadata.Companion.a(TrackableValue.o0, "Subscription Fallback"));
            analyticsManager.j(ConfirmationActions.g, TrackingMetadata.Companion.a(TrackableValue.n, "Subscription information"));
        }
        if (insetBannerApiData == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        mutableLiveData.m(new ConfirmationContract.ViewState(false, deliveryUnlimitedSubscribeConfirmation.getFeed()));
        analyticsManager.j(ConfirmationActions.f, TrackingMetadata.Companion.a(TrackableValue.v1, deliveryUnlimitedSubscribeConfirmation.getAnalytics().getSubscriptionType()));
        ConfirmationActions confirmationActions = ConfirmationActions.g;
        TrackableValue trackableValue = TrackableValue.n;
        String titleString = insetBannerApiData.getTitleString();
        if (titleString == null) {
            titleString = "Subscription information";
        }
        analyticsManager.j(confirmationActions, TrackingMetadata.Companion.a(trackableValue, titleString));
        return Unit.f24250a;
    }
}
