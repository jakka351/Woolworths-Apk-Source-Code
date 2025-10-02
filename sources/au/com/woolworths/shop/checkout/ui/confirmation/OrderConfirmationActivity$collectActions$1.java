package au.com.woolworths.shop.checkout.ui.confirmation;

import android.app.TaskStackBuilder;
import android.content.Intent;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$collectActions$1", f = "OrderConfirmationActivity.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OrderConfirmationActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderConfirmationActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<OrderConfirmationContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            OrderConfirmationContract.Action action = (OrderConfirmationContract.Action) obj;
            OrderConfirmationActivity orderConfirmationActivity = (OrderConfirmationActivity) this.d;
            int i = OrderConfirmationActivity.D;
            orderConfirmationActivity.getClass();
            boolean z = action instanceof OrderConfirmationContract.Action.NavigateToHome;
            Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
            if (z) {
                mainActivity.d(orderConfirmationActivity, Activities.MainActivity.Tab.d);
                orderConfirmationActivity.finish();
            } else if (action instanceof OrderConfirmationContract.Action.HandleBannerClick) {
                Intent intentA = ShopAppDeepLink.a(Screens.u, ((OrderConfirmationContract.Action.HandleBannerClick) action).f10716a);
                TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(orderConfirmationActivity);
                taskStackBuilderCreate.addNextIntentWithParentStack(mainActivity.d(orderConfirmationActivity, Activities.MainActivity.Tab.d));
                taskStackBuilderCreate.addNextIntent(intentA);
                taskStackBuilderCreate.startActivities();
                orderConfirmationActivity.finish();
            } else if (action instanceof OrderConfirmationContract.Action.LaunchProductListProductGroup) {
                OrderConfirmationContract.Action.LaunchProductListProductGroup launchProductListProductGroup = (OrderConfirmationContract.Action.LaunchProductListProductGroup) action;
                String str = launchProductListProductGroup.f10717a;
                String str2 = launchProductListProductGroup.b;
                Intent intentA2 = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                if (str2 == null) {
                    str2 = "";
                }
                Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(str2, null);
                Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                intentA2.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(str, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4));
                TaskStackBuilder taskStackBuilderCreate2 = TaskStackBuilder.create(orderConfirmationActivity);
                taskStackBuilderCreate2.addNextIntentWithParentStack(mainActivity.d(orderConfirmationActivity, Activities.MainActivity.Tab.d));
                taskStackBuilderCreate2.addNextIntent(intentA2);
                taskStackBuilderCreate2.startActivities();
                orderConfirmationActivity.finish();
            } else {
                if (!(action instanceof OrderConfirmationContract.Action.ShowVocSurvey)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.c(LifecycleOwnerKt.a(orderConfirmationActivity), null, null, new OrderConfirmationActivity$handleAction$1(orderConfirmationActivity, null), 3);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationActivity$collectActions$1(OrderConfirmationActivity orderConfirmationActivity, Continuation continuation) {
        super(2, continuation);
        this.q = orderConfirmationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderConfirmationActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderConfirmationActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = OrderConfirmationActivity.D;
            OrderConfirmationActivity orderConfirmationActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, orderConfirmationActivity, OrderConfirmationActivity.class, "handleAction", "handleAction(Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$Action;)V", 4), FlowExtKt.a(orderConfirmationActivity.O4().m, orderConfirmationActivity.getD(), Lifecycle.State.h));
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
