package au.com.woolworths.shop.deliveryunlimited.signup;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmation;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmationAnalytics;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmationLineItem;
import au.com.woolworths.shop.deliveryunlimited.signup.data.InsetBannerDisplayTypeExtKt;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSubscribeConfirmationQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribeConfirmation$2$1", f = "DeliveryUnlimitedSignUpRepository.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribeConfirmation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DeliveryUnlimitedSubscribeConfirmation>, Object> {
    public int p;
    public final /* synthetic */ DeliveryUnlimitedSignUpRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribeConfirmation$2$1(DeliveryUnlimitedSignUpRepository deliveryUnlimitedSignUpRepository, Continuation continuation) {
        super(2, continuation);
        this.q = deliveryUnlimitedSignUpRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribeConfirmation$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryUnlimitedSignUpRepository$fetchDeliveryUnlimitedSubscribeConfirmation$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        DeliveryUnlimitedSubscribeConfirmationLineItem insetBannerApiData;
        InsetBannerActionApiData insetBannerActionApiData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f10850a;
            DeliveryUnlimitedSubscribeConfirmationQuery deliveryUnlimitedSubscribeConfirmationQuery = new DeliveryUnlimitedSubscribeConfirmationQuery();
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, deliveryUnlimitedSubscribeConfirmationQuery);
            this.p = 1;
            objB = apolloCall.b(this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objB = obj;
        }
        DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation = ((DeliveryUnlimitedSubscribeConfirmationQuery.Data) ExceptionExtKt.k((ApolloResponse) objB)).f22611a;
        ArrayList<DeliveryUnlimitedSubscribeConfirmationQuery.Feed> arrayList = deliveryUnlimitedSubscribeConfirmation.f22612a;
        ArrayList arrayList2 = new ArrayList();
        for (DeliveryUnlimitedSubscribeConfirmationQuery.Feed feed : arrayList) {
            DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItem = feed.b;
            if (onDeliveryUnlimitedSubscribeConfirmationLineItem != null) {
                insetBannerApiData = new DeliveryUnlimitedSubscribeConfirmationLineItem(onDeliveryUnlimitedSubscribeConfirmationLineItem.f22614a, onDeliveryUnlimitedSubscribeConfirmationLineItem.b, onDeliveryUnlimitedSubscribeConfirmationLineItem.c);
            } else {
                DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner onInsetBanner = feed.c;
                if (onInsetBanner != null) {
                    InsetBannerTypeApiData insetBannerTypeApiDataA = InsetBannerDisplayTypeExtKt.a(onInsetBanner.f22615a);
                    String str = onInsetBanner.b;
                    String str2 = onInsetBanner.c;
                    DeliveryUnlimitedSubscribeConfirmationQuery.Action action = onInsetBanner.d;
                    if (action != null) {
                        String str3 = action.c;
                        String str4 = action.d;
                        int iOrdinal = action.b.ordinal();
                        InsetBannerActionTypeApiData insetBannerActionTypeApiData = iOrdinal != 0 ? iOrdinal != 1 ? InsetBannerActionTypeApiData.UNKNOWN : InsetBannerActionTypeApiData.APPLOCAL : InsetBannerActionTypeApiData.LINK;
                        int iOrdinal2 = action.f22609a.ordinal();
                        InsetBannerActionPlacementTypeApiData insetBannerActionPlacementTypeApiData = (iOrdinal2 == 0 || iOrdinal2 != 1) ? InsetBannerActionPlacementTypeApiData.BOTTOM : InsetBannerActionPlacementTypeApiData.RIGHT;
                        insetBannerActionApiData = new InsetBannerActionApiData(str3, str4, insetBannerActionTypeApiData, insetBannerActionPlacementTypeApiData, null);
                    } else {
                        insetBannerActionApiData = null;
                    }
                    insetBannerApiData = new InsetBannerApiData(insetBannerTypeApiDataA, str, str2, insetBannerActionApiData, null, null, 32, null);
                } else {
                    insetBannerApiData = null;
                }
            }
            if (insetBannerApiData != null) {
                arrayList2.add(insetBannerApiData);
            }
        }
        return new DeliveryUnlimitedSubscribeConfirmation(arrayList2, new DeliveryUnlimitedSubscribeConfirmationAnalytics(deliveryUnlimitedSubscribeConfirmation.b.f22610a));
    }
}
