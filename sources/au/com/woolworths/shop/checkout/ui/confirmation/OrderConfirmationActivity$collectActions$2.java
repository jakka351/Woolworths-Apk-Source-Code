package au.com.woolworths.shop.checkout.ui.confirmation;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$collectActions$2", f = "OrderConfirmationActivity.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OrderConfirmationActivity$collectActions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderConfirmationActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$collectActions$2$1", f = "OrderConfirmationActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$collectActions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<VocContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ OrderConfirmationActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderConfirmationActivity orderConfirmationActivity, Continuation continuation) {
            super(2, continuation);
            this.q = orderConfirmationActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((VocContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            VocContract.Actions action = (VocContract.Actions) this.p;
            OrderConfirmationActivity orderConfirmationActivity = this.q;
            ActivityResultLauncher activityResultLauncher = orderConfirmationActivity.A;
            if (activityResultLauncher == null) {
                Intrinsics.p("vocFreeTextLauncher");
                throw null;
            }
            Intrinsics.h(action, "action");
            if (action instanceof VocContract.Actions.ShowVocSurvey) {
                BuildersKt.c(LifecycleOwnerKt.a(orderConfirmationActivity), null, null, new OrderConfirmationActivity$collectActions$2$1$1$1(orderConfirmationActivity, null), 3);
            } else if (action instanceof VocContract.Actions.ShowVocFreeText) {
                int i = VocFreeTextActivity.y;
                VocContract.Actions.ShowVocFreeText showVocFreeText = (VocContract.Actions.ShowVocFreeText) action;
                SurveySubmitData surveySubmitData = showVocFreeText.f8232a;
                String str = surveySubmitData.d;
                Activities.VocFreeText.Extras extras = new Activities.VocFreeText.Extras(showVocFreeText.b, surveySubmitData.e, str, surveySubmitData.f, surveySubmitData.g);
                Intent intentA = ActivityNavigatorKt.a(Activities.VocFreeText.f4552a, ApplicationType.e);
                intentA.putExtra("EXTRA_DATA", extras);
                activityResultLauncher.a(intentA, null);
            } else {
                if (!(action instanceof VocContract.Actions.LaunchSurveyUrl)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = VocSurveyWebViewActivity.B;
                VocContract.Actions.LaunchSurveyUrl launchSurveyUrl = (VocContract.Actions.LaunchSurveyUrl) action;
                String url = launchSurveyUrl.f8231a;
                String screenTitle = launchSurveyUrl.b;
                Intrinsics.h(url, "url");
                Intrinsics.h(screenTitle, "screenTitle");
                Intent intent = new Intent(orderConfirmationActivity, (Class<?>) VocSurveyWebViewActivity.class);
                intent.addFlags(603979776);
                intent.putExtra("extra", new VocSurveyWebViewActivity.Companion.Extras(url, screenTitle));
                activityResultLauncher.a(intent, null);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationActivity$collectActions$2(OrderConfirmationActivity orderConfirmationActivity, Continuation continuation) {
        super(2, continuation);
        this.q = orderConfirmationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderConfirmationActivity$collectActions$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderConfirmationActivity$collectActions$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = OrderConfirmationActivity.D;
            OrderConfirmationActivity orderConfirmationActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(orderConfirmationActivity, null), FlowExtKt.a(orderConfirmationActivity.P4().l, orderConfirmationActivity.getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
