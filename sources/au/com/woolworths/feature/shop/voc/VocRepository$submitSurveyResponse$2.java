package au.com.woolworths.feature.shop.voc;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.shop.graphql.type.DeviceInfo;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.SubmitCheckoutSurveyMutation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.VocRepository$submitSurveyResponse$2", f = "VocRepository.kt", l = {86}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class VocRepository$submitSurveyResponse$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SurveySubmitData q;
    public final /* synthetic */ VocRepository r;
    public final /* synthetic */ int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ DeviceInfo u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocRepository$submitSurveyResponse$2(SurveySubmitData surveySubmitData, VocRepository vocRepository, int i, String str, DeviceInfo deviceInfo, Continuation continuation) {
        super(2, continuation);
        this.q = surveySubmitData;
        this.r = vocRepository;
        this.s = i;
        this.t = str;
        this.u = deviceInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocRepository$submitSurveyResponse$2(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VocRepository$submitSurveyResponse$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SurveySubmitData surveySubmitData = this.q;
                VocRepository vocRepository = this.r;
                int i2 = this.s;
                String str = this.t;
                DeviceInfo deviceInfo = this.u;
                ApolloClient apolloClient = vocRepository.f8220a;
                SubmitCheckoutSurveyMutation submitCheckoutSurveyMutation = new SubmitCheckoutSurveyMutation(surveySubmitData.d, surveySubmitData.f, String.valueOf(i2), str, String.valueOf(surveySubmitData.e), surveySubmitData.g, deviceInfo);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, submitCheckoutSurveyMutation);
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
            ExceptionExtKt.k((ApolloResponse) obj);
            return Unit.f24250a;
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
