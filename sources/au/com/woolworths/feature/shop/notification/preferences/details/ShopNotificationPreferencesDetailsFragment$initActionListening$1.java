package au.com.woolworths.feature.shop.notification.preferences.details;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.notification.preferences.databinding.FragmentShopNotificationPreferencesDetailsBinding;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import com.google.android.material.snackbar.Snackbar;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$initActionListening$1", f = "ShopNotificationPreferencesDetailsFragment.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShopNotificationPreferencesDetailsFragment$initActionListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopNotificationPreferencesDetailsFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$initActionListening$1$1", f = "ShopNotificationPreferencesDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$initActionListening$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ShopNotificationPreferencesDetailsContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ ShopNotificationPreferencesDetailsFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShopNotificationPreferencesDetailsFragment shopNotificationPreferencesDetailsFragment, Continuation continuation) {
            super(2, continuation);
            this.q = shopNotificationPreferencesDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ShopNotificationPreferencesDetailsContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ShopNotificationPreferencesDetailsContract.Actions actions = (ShopNotificationPreferencesDetailsContract.Actions) this.p;
            KProperty[] kPropertyArr = ShopNotificationPreferencesDetailsFragment.l;
            ShopNotificationPreferencesDetailsFragment shopNotificationPreferencesDetailsFragment = this.q;
            if (shopNotificationPreferencesDetailsFragment.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
                if (actions instanceof ShopNotificationPreferencesDetailsContract.Actions.ShowSnackBarMessage) {
                    ResText resText = ((ShopNotificationPreferencesDetailsContract.Actions.ShowSnackBarMessage) actions).f7934a;
                    Context contextRequireContext = shopNotificationPreferencesDetailsFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    Snackbar snackbarJ = Snackbar.j(null, ((FragmentShopNotificationPreferencesDetailsBinding) shopNotificationPreferencesDetailsFragment.j.getValue(shopNotificationPreferencesDetailsFragment, ShopNotificationPreferencesDetailsFragment.l[0])).y, resText.getText(contextRequireContext).toString(), 0);
                    TextView textView = (TextView) snackbarJ.i.findViewById(R.id.snackbar_text);
                    if (textView != null) {
                        textView.setMaxLines(4);
                    }
                    snackbarJ.l();
                } else if (actions instanceof ShopNotificationPreferencesDetailsContract.Actions.OpenNotificationSettings) {
                    Context contextRequireContext2 = shopNotificationPreferencesDetailsFragment.requireContext();
                    Intrinsics.g(contextRequireContext2, "requireContext(...)");
                    ContextExtKt.f(contextRequireContext2);
                } else {
                    if (!(actions instanceof ShopNotificationPreferencesDetailsContract.Actions.ToggleUpdatedForAccessibilityAnnouncement)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    shopNotificationPreferencesDetailsFragment.requireView().announceForAccessibility(shopNotificationPreferencesDetailsFragment.getString(((ShopNotificationPreferencesDetailsContract.Actions.ToggleUpdatedForAccessibilityAnnouncement) actions).f7935a ? R.string.notifications_toggle_on_a11y_announcement : R.string.notifications_toggle_off_a11y_announcement));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNotificationPreferencesDetailsFragment$initActionListening$1(ShopNotificationPreferencesDetailsFragment shopNotificationPreferencesDetailsFragment, Continuation continuation) {
        super(2, continuation);
        this.q = shopNotificationPreferencesDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopNotificationPreferencesDetailsFragment$initActionListening$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopNotificationPreferencesDetailsFragment$initActionListening$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            KProperty[] kPropertyArr = ShopNotificationPreferencesDetailsFragment.l;
            ShopNotificationPreferencesDetailsFragment shopNotificationPreferencesDetailsFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shopNotificationPreferencesDetailsFragment, null), shopNotificationPreferencesDetailsFragment.I1().k);
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
