package au.com.woolworths.dynamic.page.ui;

import android.content.Intent;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.dynamic.page.ui.DynamicPageActivity$observeActions$1", f = "DynamicPageActivity.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DynamicPageActivity$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DynamicPageActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/dynamic/page/ui/DynamicPageContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.dynamic.page.ui.DynamicPageActivity$observeActions$1$1", f = "DynamicPageActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.dynamic.page.ui.DynamicPageActivity$observeActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<DynamicPageContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ DynamicPageActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DynamicPageActivity dynamicPageActivity, Continuation continuation) {
            super(2, continuation);
            this.q = dynamicPageActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((DynamicPageContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            DynamicPageContract.Actions actions = (DynamicPageContract.Actions) this.p;
            int i = DynamicPageActivity.A;
            boolean z = actions instanceof DynamicPageContract.Actions.ShowShareSheet;
            DynamicPageActivity dynamicPageActivity = this.q;
            if (z) {
                String str = ((DynamicPageContract.Actions.ShowShareSheet) actions).f5194a;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                dynamicPageActivity.startActivity(Intent.createChooser(intent, null));
            } else if (actions instanceof DynamicPageContract.Actions.ShowCartScreen) {
                dynamicPageActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
            } else if (actions instanceof DynamicPageContract.Actions.LaunchDeepLink) {
                Intent intentA = ShopAppDeepLink.a(Screens.l, ((DynamicPageContract.Actions.LaunchDeepLink) actions).f5191a);
                Activities.MainActivity.Tab tab = Activities.MainActivity.Tab.d;
                intentA.putExtra("EXTRA_RETURN_TAB", new Activities.MainActivity.ExtraTargetTabWithMessage());
                dynamicPageActivity.startActivity(intentA);
            } else {
                if (!(actions instanceof DynamicPageContract.Actions.LaunchLogin)) {
                    throw new NoWhenBranchMatchedException();
                }
                dynamicPageActivity.z.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPageActivity$observeActions$1(DynamicPageActivity dynamicPageActivity, Continuation continuation) {
        super(2, continuation);
        this.q = dynamicPageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicPageActivity$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicPageActivity$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = DynamicPageActivity.A;
            DynamicPageActivity dynamicPageActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(dynamicPageActivity, null), FlowExtKt.a(dynamicPageActivity.O4().l, dynamicPageActivity.getD(), Lifecycle.State.h));
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
