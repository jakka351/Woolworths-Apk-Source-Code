package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtraFinalGlanceContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState;
import au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceInteractorImpl;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1", f = "EverydayExtraFinalGlanceBottomSheetViewModel.kt", l = {61}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraFinalGlanceBottomSheetViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1(EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraFinalGlanceBottomSheetViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraFinalGlanceBottomSheetViewModel$fetchFinalGlanceFeed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel = this.q;
        MutableStateFlow mutableStateFlow = everydayExtraFinalGlanceBottomSheetViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                String str = this.r;
                everydayExtraFinalGlanceBottomSheetViewModel.k = str;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, EverydayExtraFinalGlanceContract.ViewState.Loading.f6088a));
                EverydayExtrasFinalGlanceInteractorImpl everydayExtrasFinalGlanceInteractorImpl = everydayExtraFinalGlanceBottomSheetViewModel.e;
                this.p = 1;
                obj = everydayExtrasFinalGlanceInteractorImpl.f6174a.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            EverydayExtraFinalGlanceContent everydayExtraFinalGlanceContent = (EverydayExtraFinalGlanceContent) obj;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value4, new EverydayExtraFinalGlanceContract.ViewState.Content(everydayExtraFinalGlanceContent, OfferActivationState.d)));
            EverydayExtraFinalGlanceBottomSheetViewModel.p6(everydayExtraFinalGlanceBottomSheetViewModel, everydayExtraFinalGlanceContent);
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new EverydayExtraFinalGlanceContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new EverydayExtraFinalGlanceContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)));
        }
        return Unit.f24250a;
    }
}
