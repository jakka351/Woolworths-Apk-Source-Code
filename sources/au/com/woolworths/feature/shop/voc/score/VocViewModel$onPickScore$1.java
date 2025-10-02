package au.com.woolworths.feature.shop.voc.score;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.voc.analytics.VocActions;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestionType;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocViewModel$onPickScore$1", f = "VocViewModel.kt", l = {276}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VocViewModel$onPickScore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ VocViewModel q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocViewModel$onPickScore$1(VocViewModel vocViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.q = vocViewModel;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocViewModel$onPickScore$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VocViewModel$onPickScore$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        VocViewModel vocViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            SurveyQuestion surveyQuestionS6 = vocViewModel.s6();
            VocActions vocActions = null;
            SurveyQuestionType surveyQuestionType = surveyQuestionS6 != null ? surveyQuestionS6.c : null;
            int i2 = surveyQuestionType == null ? -1 : VocViewModel.WhenMappings.f8238a[surveyQuestionType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    vocActions = VocActions.i;
                } else if (i2 == 2) {
                    vocActions = VocActions.j;
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (vocActions != null) {
                vocViewModel.f.j(vocActions, TrackingMetadata.Companion.a(TrackableValue.q0, Integer.valueOf(this.r)));
            }
            VocContract.ViewState viewState = (VocContract.ViewState) vocViewModel.h.getValue();
            Intrinsics.h(viewState, "<this>");
            int i3 = viewState.f;
            boolean z = viewState.f8234a;
            if ((z && viewState.b && i3 == -1) || (z && viewState.c && i3 == -1)) {
                VocContract.ViewState viewStateA = VocContract.ViewState.a(viewState, false, false, false, false, false, this.r, null, null, null, null, null, 4063);
                this.p = 1;
                if (VocViewModel.p6(vocViewModel, viewStateA, 500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        vocViewModel.v6();
        return Unit.f24250a;
    }
}
