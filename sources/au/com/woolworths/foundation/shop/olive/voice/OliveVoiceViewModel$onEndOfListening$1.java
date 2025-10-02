package au.com.woolworths.foundation.shop.olive.voice;

import android.content.Context;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchResultData;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel$onEndOfListening$1", f = "OliveVoiceViewModel.kt", l = {250}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceViewModel$onEndOfListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ OliveVoiceViewModel r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceViewModel$onEndOfListening$1(OliveVoiceViewModel oliveVoiceViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.r = oliveVoiceViewModel;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OliveVoiceViewModel$onEndOfListening$1 oliveVoiceViewModel$onEndOfListening$1 = new OliveVoiceViewModel$onEndOfListening$1(this.r, this.s, continuation);
        oliveVoiceViewModel$onEndOfListening$1.q = obj;
        return oliveVoiceViewModel$onEndOfListening$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OliveVoiceViewModel$onEndOfListening$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        OliveVoiceViewModel oliveVoiceViewModel = this.r;
        SharedFlowImpl sharedFlowImpl = oliveVoiceViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        VoiceSearchError.ApiError apiError = VoiceSearchError.ApiError.f8822a;
        OliveVoiceContract.Action.PerformHapticFailure performHapticFailure = OliveVoiceContract.Action.PerformHapticFailure.f8796a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                OliveVoiceInteractorImpl oliveVoiceInteractorImpl = oliveVoiceViewModel.e;
                String str = this.s;
                this.q = coroutineScope;
                this.p = 1;
                obj = oliveVoiceInteractorImpl.f8803a.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            VoiceSearchResultData voiceSearchResultData = (VoiceSearchResultData) obj;
            VoiceSearchResult voiceSearchResult = null;
            if ((voiceSearchResultData != null ? voiceSearchResultData.f8830a : null) != null) {
                voiceSearchResult = new VoiceSearchResult(voiceSearchResultData.f8830a, voiceSearchResultData.b);
            }
            if (voiceSearchResult != null) {
                sharedFlowImpl.f(new OliveVoiceContract.Action.ShowSearchResults(voiceSearchResult));
            } else {
                sharedFlowImpl.f(performHapticFailure);
                oliveVoiceViewModel.s6(new VoiceSearchState.Failure(apiError));
            }
        } catch (NoConnectivityException unused) {
            sharedFlowImpl.f(performHapticFailure);
            oliveVoiceViewModel.p6().b();
            oliveVoiceViewModel.s6(new VoiceSearchState.Failure(VoiceSearchError.ConnectionError.f8823a));
        } catch (ServerErrorException e) {
            sharedFlowImpl.f(performHapticFailure);
            List list = e.d;
            if (list.isEmpty()) {
                oliveVoiceViewModel.p6().h();
                oliveVoiceViewModel.s6(new VoiceSearchState.Failure(apiError));
            } else {
                if (OliveVoiceViewModel.WhenMappings.f8807a[((ServerError) list.get(0)).f4576a.ordinal()] == 1) {
                    VoiceAnalytics voiceAnalyticsP6 = oliveVoiceViewModel.p6();
                    String str2 = voiceAnalyticsP6.c;
                    VoiceProductAssistantAnalytics.Assistant assistant = new VoiceProductAssistantAnalytics.Assistant(str2);
                    Context context = voiceAnalyticsP6.f8821a;
                    VoiceSearchError.NoProductMatch noProductMatch = VoiceSearchError.NoProductMatch.f8826a;
                    voiceAnalyticsP6.a(assistant.h.a(str2, noProductMatch.a(context), "no match for query"));
                    oliveVoiceViewModel.s6(new VoiceSearchState.Failure(noProductMatch));
                } else {
                    oliveVoiceViewModel.p6().h();
                    oliveVoiceViewModel.s6(new VoiceSearchState.Failure(apiError));
                }
            }
        }
        return Unit.f24250a;
    }
}
