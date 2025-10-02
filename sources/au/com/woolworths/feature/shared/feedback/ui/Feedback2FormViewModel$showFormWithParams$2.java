package au.com.woolworths.feature.shared.feedback.ui;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaException;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormContract;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFormWithParams$2", f = "Feedback2FormViewModel.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Feedback2FormViewModel$showFormWithParams$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Feedback2FormViewModel q;
    public final /* synthetic */ HashMap r;
    public final /* synthetic */ String s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFormWithParams$2$1", f = "Feedback2FormViewModel.kt", l = {126}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$showFormWithParams$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Feedback2FormViewModel q;
        public final /* synthetic */ String r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Feedback2FormViewModel feedback2FormViewModel, String str, Continuation continuation) {
            super(2, continuation);
            this.q = feedback2FormViewModel;
            this.r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Feedback2FormViewModel feedback2FormViewModel = this.q;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    MedalliaInteractor medalliaInteractor = feedback2FormViewModel.e;
                    String str = this.r;
                    this.p = 1;
                    medalliaInteractor.getClass();
                    if (MedalliaInteractor.d(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                MutableStateFlow mutableStateFlow = feedback2FormViewModel.g;
                mutableStateFlow.setValue(Feedback2FormContract.ViewState.a((Feedback2FormContract.ViewState) mutableStateFlow.getValue(), Feedback2FormContract.Status.f, 2));
            } catch (MedalliaException e) {
                Feedback2FormViewModel.t6(e);
                feedback2FormViewModel.q6();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback2FormViewModel$showFormWithParams$2(Feedback2FormViewModel feedback2FormViewModel, String str, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.q = feedback2FormViewModel;
        this.r = map;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HashMap map = this.r;
        return new Feedback2FormViewModel$showFormWithParams$2(this.q, this.s, map, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Feedback2FormViewModel$showFormWithParams$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.s;
        Feedback2FormViewModel feedback2FormViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            feedback2FormViewModel.e.getClass();
            MedalliaInteractor.c(this.r);
            this.p = 1;
            if (BuildersKt.c(ViewModelKt.a(feedback2FormViewModel), null, null, new Feedback2FormViewModel$handleMedalliaEvents$2(feedback2FormViewModel, str, null), 3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        BuildersKt.c(ViewModelKt.a(feedback2FormViewModel), null, null, new AnonymousClass1(feedback2FormViewModel, str, null), 3);
        return Unit.f24250a;
    }
}
