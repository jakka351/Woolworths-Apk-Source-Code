package au.com.woolworths.feature.shop.notification.preferences;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import au.com.woolworths.feature.shop.notification.preferences.interactor.ShopPreferencesActions;
import com.salesforce.marketingcloud.UrlHandler;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$initActionListening$2", f = "ShopNotificationPreferencesActivity.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShopNotificationPreferencesActivity$initActionListening$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopNotificationPreferencesActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/notification/preferences/interactor/ShopPreferencesActions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$initActionListening$2$1", f = "ShopNotificationPreferencesActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$initActionListening$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ShopPreferencesActions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ ShopNotificationPreferencesActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopNotificationPreferencesActivity shopNotificationPreferencesActivity, Continuation continuation) {
            super(2, continuation);
            this.q = shopNotificationPreferencesActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ShopPreferencesActions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ShopPreferencesActions shopPreferencesActions = (ShopPreferencesActions) this.p;
            int i = ShopNotificationPreferencesActivity.A;
            boolean z = shopPreferencesActions instanceof ShopPreferencesActions.ShowPreferencesDetails;
            ShopNotificationPreferencesActivity shopNotificationPreferencesActivity = this.q;
            if (!z) {
                shopNotificationPreferencesActivity.getClass();
                throw new NoWhenBranchMatchedException();
            }
            String string = shopNotificationPreferencesActivity.getString(com.woolworths.R.string.notifications_title);
            Intrinsics.g(string, "getString(...)");
            Activities.PreferencesDetails.ExtrasData extrasData = shopNotificationPreferencesActivity.z;
            if (extrasData != null) {
                shopNotificationPreferencesActivity.O4(extrasData.d, string);
                return Unit.f24250a;
            }
            Intrinsics.p("extra");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNotificationPreferencesActivity$initActionListening$2(ShopNotificationPreferencesActivity shopNotificationPreferencesActivity, Continuation continuation) {
        super(2, continuation);
        this.q = shopNotificationPreferencesActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopNotificationPreferencesActivity$initActionListening$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopNotificationPreferencesActivity$initActionListening$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ShopNotificationPreferencesActivity shopNotificationPreferencesActivity = this.q;
            PreferencesCommInteractor preferencesCommInteractor = shopNotificationPreferencesActivity.x;
            if (preferencesCommInteractor == null) {
                Intrinsics.p("preferencesCommInteractor");
                throw null;
            }
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shopNotificationPreferencesActivity, null), preferencesCommInteractor.b);
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
