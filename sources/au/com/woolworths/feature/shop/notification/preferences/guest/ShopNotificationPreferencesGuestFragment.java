package au.com.woolworths.feature.shop.notification.preferences.guest;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesGuestBlockedActions;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import au.com.woolworths.feature.shop.notification.preferences.interactor.ShopPreferencesActions;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/guest/ShopNotificationPreferencesGuestFragment;", "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginFragment;", "<init>", "()V", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesGuestFragment extends Hilt_ShopNotificationPreferencesGuestFragment {
    public static final /* synthetic */ int r = 0;
    public PreferencesCommInteractor p;
    public final ViewModelLazy q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/guest/ShopNotificationPreferencesGuestFragment$Companion;", "", "", "FRAGMENT_TAG", "Ljava/lang/String;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopNotificationPreferencesGuestFragment() {
        final ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$1 shopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$1 = new ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) shopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.q = new ViewModelLazy(Reflection.f24268a.b(ShopNotificationPreferencesGuestViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.notification.preferences.guest.ShopNotificationPreferencesGuestFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
    }

    @Override // au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment
    public final void E1() {
        PreferencesCommInteractor preferencesCommInteractor = this.p;
        if (preferencesCommInteractor == null) {
            Intrinsics.p("preferencesCommInteractor");
            throw null;
        }
        preferencesCommInteractor.f7941a.f(ShopPreferencesActions.ShowPreferencesDetails.f7943a);
    }

    @Override // au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment
    public final void I1() {
        ((ShopNotificationPreferencesGuestViewModel) this.q.getD()).e.c(NotificationPreferencesGuestBlockedActions.e);
    }

    @Override // au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment
    public final void Q1() {
        ((ShopNotificationPreferencesGuestViewModel) this.q.getD()).e.c(NotificationPreferencesGuestBlockedActions.f);
    }
}
