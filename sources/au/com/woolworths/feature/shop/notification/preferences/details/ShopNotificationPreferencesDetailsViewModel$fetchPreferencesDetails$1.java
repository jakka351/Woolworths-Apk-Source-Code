package au.com.woolworths.feature.shop.notification.preferences.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1", f = "ShopNotificationPreferencesDetailsViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ShopNotificationPreferencesDetailsViewModel p;
    public int q;
    public final /* synthetic */ ShopNotificationPreferencesDetailsViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1(ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = shopNotificationPreferencesDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel2 = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                shopNotificationPreferencesDetailsViewModel2.h.m(new ShopNotificationPreferencesDetailsContract.ViewState(27));
                PreferencesDetailsInteractor preferencesDetailsInteractor = shopNotificationPreferencesDetailsViewModel2.f;
                String str = shopNotificationPreferencesDetailsViewModel2.l;
                this.p = shopNotificationPreferencesDetailsViewModel2;
                this.q = 1;
                obj = preferencesDetailsInteractor.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                shopNotificationPreferencesDetailsViewModel = shopNotificationPreferencesDetailsViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                shopNotificationPreferencesDetailsViewModel = this.p;
                ResultKt.b(obj);
            }
            PreferencesData preferencesData = (PreferencesData) obj;
            shopNotificationPreferencesDetailsViewModel.h.m(new ShopNotificationPreferencesDetailsContract.ViewState(preferencesData.getTitle(), preferencesData.getDetails(), false, false, null));
        } catch (NoConnectivityException unused) {
            shopNotificationPreferencesDetailsViewModel2.q6(ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.d);
        } catch (ServerErrorException unused2) {
            shopNotificationPreferencesDetailsViewModel2.q6(ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.e);
        }
        return Unit.f24250a;
    }
}
