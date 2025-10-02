package au.com.woolworths.feature.shared.feedback.ui;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaException;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.FeedbackFormContract;
import com.woolworths.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel$showFeedbackForm$1", f = "FeedbackFormViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FeedbackFormViewModel$showFeedbackForm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FeedbackFormViewModel p;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel$showFeedbackForm$1$1", f = "FeedbackFormViewModel.kt", l = {50, 51}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel$showFeedbackForm$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ FeedbackFormViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedbackFormViewModel feedbackFormViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = feedbackFormViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final FeedbackFormViewModel feedbackFormViewModel = this.q;
            MedalliaInteractor medalliaInteractor = feedbackFormViewModel.e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    String str = feedbackFormViewModel.i;
                    if (str == null) {
                        Intrinsics.p("formId");
                        throw null;
                    }
                    this.p = 1;
                    medalliaInteractor.getClass();
                    if (MedalliaInteractor.d(str, this) == coroutineSingletons) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
                String str2 = feedbackFormViewModel.i;
                if (str2 == null) {
                    Intrinsics.p("formId");
                    throw null;
                }
                this.p = 2;
                Object objCollect = medalliaInteractor.a(str2).collect(new FlowCollector() { // from class: au.com.woolworths.feature.shared.feedback.ui.FeedbackFormViewModel$handleMedalliaEvents$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        feedbackFormViewModel.f.f(new FeedbackFormContract.Actions.MedalliaEvent((MedalliaFormEvent) obj2));
                        return Unit.f24250a;
                    }
                }, this);
                if (objCollect != coroutineSingletons) {
                    objCollect = unit;
                }
                return objCollect == coroutineSingletons ? coroutineSingletons : unit;
            } catch (MedalliaException unused) {
                feedbackFormViewModel.f.f(new FeedbackFormContract.Actions.OnDisplayResult(new ResText(R.string.feedback_form_error)));
                return unit;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackFormViewModel$showFeedbackForm$1(FeedbackFormViewModel feedbackFormViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = feedbackFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackFormViewModel$showFeedbackForm$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FeedbackFormViewModel$showFeedbackForm$1 feedbackFormViewModel$showFeedbackForm$1 = (FeedbackFormViewModel$showFeedbackForm$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        feedbackFormViewModel$showFeedbackForm$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        FeedbackFormViewModel feedbackFormViewModel = this.p;
        MedalliaInteractor medalliaInteractor = feedbackFormViewModel.e;
        if (medalliaInteractor.b()) {
            if (!feedbackFormViewModel.j.isEmpty()) {
                HashMap map = feedbackFormViewModel.j;
                medalliaInteractor.getClass();
                MedalliaInteractor.c(map);
            }
            BuildersKt.c(ViewModelKt.a(feedbackFormViewModel), null, null, new AnonymousClass1(feedbackFormViewModel, null), 3);
        } else {
            feedbackFormViewModel.f.f(new FeedbackFormContract.Actions.OnDisplayResult(new ResText(R.string.feedback_form_error)));
        }
        return Unit.f24250a;
    }
}
