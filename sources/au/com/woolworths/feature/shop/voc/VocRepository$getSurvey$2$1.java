package au.com.woolworths.feature.shop.voc;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.woolworths.CheckoutSurveyQuery;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/woolworths/CheckoutSurveyQuery$CheckoutSurvey;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.VocRepository$getSurvey$2$1", f = "VocRepository.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VocRepository$getSurvey$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CheckoutSurveyQuery.CheckoutSurvey>, Object> {
    public int p;
    public final /* synthetic */ VocRepository q;
    public final /* synthetic */ ShoppingModeType r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocRepository$getSurvey$2$1(VocRepository vocRepository, ShoppingModeType shoppingModeType, Continuation continuation) {
        super(2, continuation);
        this.q = vocRepository;
        this.r = shoppingModeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocRepository$getSurvey$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VocRepository$getSurvey$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f8220a;
            CheckoutSurveyQuery checkoutSurveyQuery = new CheckoutSurveyQuery(Optional.Companion.a(this.r));
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, checkoutSurveyQuery);
            this.p = 1;
            obj = apolloCall.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((CheckoutSurveyQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f19215a;
    }
}
