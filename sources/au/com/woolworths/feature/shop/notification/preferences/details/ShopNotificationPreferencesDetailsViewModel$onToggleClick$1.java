package au.com.woolworths.feature.shop.notification.preferences.details;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsViewModel$onToggleClick$1", f = "ShopNotificationPreferencesDetailsViewModel.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ShopNotificationPreferencesDetailsViewModel$onToggleClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopNotificationPreferencesDetailsViewModel q;
    public final /* synthetic */ PreferenceToggleData r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNotificationPreferencesDetailsViewModel$onToggleClick$1(ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel, PreferenceToggleData preferenceToggleData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = shopNotificationPreferencesDetailsViewModel;
        this.r = preferenceToggleData;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopNotificationPreferencesDetailsViewModel$onToggleClick$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopNotificationPreferencesDetailsViewModel$onToggleClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        boolean z = this.s;
        ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ShopNotificationPreferencesDetailsViewModel.r6(shopNotificationPreferencesDetailsViewModel.h, true, null, 23);
                PreferencesDetailsInteractor preferencesDetailsInteractor = shopNotificationPreferencesDetailsViewModel.f;
                String id = this.r.getId();
                this.p = 1;
                obj = preferencesDetailsInteractor.d(z, id, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            PreferencesData preferencesData = (PreferencesData) obj;
            shopNotificationPreferencesDetailsViewModel.h.m(new ShopNotificationPreferencesDetailsContract.ViewState(preferencesData.getTitle(), preferencesData.getDetails(), false, false, null));
            shopNotificationPreferencesDetailsViewModel.i.f(new ShopNotificationPreferencesDetailsContract.Actions.ToggleUpdatedForAccessibilityAnnouncement(z));
        } catch (NoConnectivityException unused) {
            ShopNotificationPreferencesDetailsViewModel.p6(shopNotificationPreferencesDetailsViewModel);
        } catch (ServerErrorException unused2) {
            ShopNotificationPreferencesDetailsViewModel.p6(shopNotificationPreferencesDetailsViewModel);
        }
        return Unit.f24250a;
    }
}
