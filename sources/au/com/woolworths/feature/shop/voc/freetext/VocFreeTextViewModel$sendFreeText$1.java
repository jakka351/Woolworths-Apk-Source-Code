package au.com.woolworths.feature.shop.voc.freetext;

import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.freetext.VocFreeTextViewModel$sendFreeText$1", f = "VocFreeTextViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VocFreeTextViewModel$sendFreeText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ VocFreeTextViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocFreeTextViewModel$sendFreeText$1(VocFreeTextViewModel vocFreeTextViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = vocFreeTextViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocFreeTextViewModel$sendFreeText$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VocFreeTextViewModel$sendFreeText$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VocFreeTextViewModel vocFreeTextViewModel = this.q;
        MutableStateFlow mutableStateFlow = vocFreeTextViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SurveySubmitData surveySubmitData = vocFreeTextViewModel.j;
            Integer num = vocFreeTextViewModel.k;
            String str = ((VocFreeTextContract.ViewState) mutableStateFlow.getValue()).f8227a;
            if (surveySubmitData != null && num != null && str != null && (!StringsKt.D(str))) {
                VocFreeTextContract.ViewState viewState = (VocFreeTextContract.ViewState) mutableStateFlow.getValue();
                mutableStateFlow.f(new VocFreeTextContract.ViewState(viewState.f8227a, viewState.b, StatefulButtonState.e));
                VocFreeTextInteractor vocFreeTextInteractor = vocFreeTextViewModel.e;
                int iIntValue = num.intValue();
                if (str == null) {
                    str = "";
                }
                this.p = 1;
                if (vocFreeTextInteractor.b(surveySubmitData, iIntValue, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        vocFreeTextViewModel.g.f(VocFreeTextContract.Actions.DismissUi.f8226a);
        return Unit.f24250a;
    }
}
