package com.woolworths.scanlibrary.ui.cart;

import au.com.woolworths.feature.shared.feedback.medallia.MedalliaException;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.cart.ShoppingCartActivityPresenter$submitUserFeedback$1$1", f = "ShoppingCartActivityPresenter.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ShoppingCartActivityPresenter$submitUserFeedback$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public int q;
    public final /* synthetic */ ShoppingCartActivityPresenter r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartActivityPresenter$submitUserFeedback$1$1(ShoppingCartActivityPresenter shoppingCartActivityPresenter, String str, Continuation continuation) {
        super(2, continuation);
        this.r = shoppingCartActivityPresenter;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingCartActivityPresenter$submitUserFeedback$1$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingCartActivityPresenter$submitUserFeedback$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        MedalliaException e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        ShoppingCartActivityPresenter shoppingCartActivityPresenter = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            ContextScope contextScope = shoppingCartActivityPresenter.i;
            String str = this.s;
            Job jobC = BuildersKt.c(contextScope, null, null, new ShoppingCartActivityPresenter$logFormEventsToAnalytics$1(shoppingCartActivityPresenter, str, null), 3);
            try {
                MedalliaInteractor medalliaInteractor = shoppingCartActivityPresenter.g;
                this.p = jobC;
                this.q = 1;
                medalliaInteractor.getClass();
                if (MedalliaInteractor.d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (MedalliaException e2) {
                job = jobC;
                e = e2;
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), e, "Medallia showForm error", 8);
                shoppingCartActivityPresenter.f.c(MenuActionData.e);
                job.cancel((CancellationException) null);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) this.p;
            try {
                ResultKt.b(obj);
            } catch (MedalliaException e3) {
                e = e3;
                Bark.Companion companion2 = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), e, "Medallia showForm error", 8);
                shoppingCartActivityPresenter.f.c(MenuActionData.e);
                job.cancel((CancellationException) null);
                return Unit.f24250a;
            }
        }
        return Unit.f24250a;
    }
}
