package au.com.woolworths.feature.shop.notification.preferences.details;

import YU.a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.feature.shop.notification.preferences.controller.ShopPreferenceDetailsController;
import au.com.woolworths.feature.shop.notification.preferences.controller.ToggleGroupDecoration;
import au.com.woolworths.feature.shop.notification.preferences.databinding.FragmentShopNotificationPreferencesDetailsBinding;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsContract;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Extras", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesDetailsFragment extends Hilt_ShopNotificationPreferencesDetailsFragment {
    public static final /* synthetic */ KProperty[] l = {Reflection.f24268a.e(new MutablePropertyReference1Impl(ShopNotificationPreferencesDetailsFragment.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/feature/shop/notification/preferences/databinding/FragmentShopNotificationPreferencesDetailsBinding;", 0))};
    public final ViewModelLazy i;
    public final AutoClearedValue j;
    public ShopPreferenceDetailsController k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsFragment$Companion;", "", "", "FRAGMENT_TAG", "Ljava/lang/String;", "EXTRA_ARGUMENT", "", "MAX_SNACKBAR_LINES", "I", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/details/ShopNotificationPreferencesDetailsFragment$Extras;", "Landroid/os/Parcelable;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(String title, String key) {
            Intrinsics.h(title, "title");
            Intrinsics.h(key, "key");
            this.d = title;
            this.e = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Extras(title=", this.d, ", key=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    public ShopNotificationPreferencesDetailsFragment() {
        final ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$1 shopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$1 = new ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) shopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(ShopNotificationPreferencesDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment$special$$inlined$viewModels$default$4
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
        this.j = new AutoClearedValue(this);
    }

    public final ShopNotificationPreferencesDetailsViewModel I1() {
        return (ShopNotificationPreferencesDetailsViewModel) this.i.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ShopNotificationPreferencesDetailsFragment$initActionListening$1(this, null), 3);
        this.k = new ShopPreferenceDetailsController(I1());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Intrinsics.h(inflater, "inflater");
        int i = FragmentShopNotificationPreferencesDetailsBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentShopNotificationPreferencesDetailsBinding fragmentShopNotificationPreferencesDetailsBinding = (FragmentShopNotificationPreferencesDetailsBinding) ViewDataBinding.q(inflater, R.layout.fragment_shop_notification_preferences_details, viewGroup, false, null);
        Intrinsics.g(fragmentShopNotificationPreferencesDetailsBinding, "inflate(...)");
        fragmentShopNotificationPreferencesDetailsBinding.D(getViewLifecycleOwner());
        EpoxyRecyclerView epoxyRecyclerView = fragmentShopNotificationPreferencesDetailsBinding.B;
        ShopPreferenceDetailsController shopPreferenceDetailsController = this.k;
        if (shopPreferenceDetailsController == null) {
            Intrinsics.p("controller");
            throw null;
        }
        epoxyRecyclerView.setController(shopPreferenceDetailsController);
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.g(context, "getContext(...)");
        epoxyRecyclerView.i(new ToggleGroupDecoration(context));
        ViewExtKt.a(epoxyRecyclerView);
        fragmentShopNotificationPreferencesDetailsBinding.L(I1());
        KProperty[] kPropertyArr = l;
        KProperty kProperty = kPropertyArr[0];
        AutoClearedValue autoClearedValue = this.j;
        autoClearedValue.b(this, kProperty, fragmentShopNotificationPreferencesDetailsBinding);
        Bundle arguments = getArguments();
        Extras extras = arguments != null ? (Extras) arguments.getParcelable("extra_argument") : null;
        if (extras == null || (str = extras.e) == null) {
            throw new IllegalArgumentException("Preference key cannot be null");
        }
        I1().l = str;
        I1().j.f(getViewLifecycleOwner(), new ShopNotificationPreferencesDetailsFragment$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 6)));
        View view = ((FragmentShopNotificationPreferencesDetailsBinding) autoClearedValue.getValue(this, kPropertyArr[0])).h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ShopNotificationPreferencesDetailsViewModel shopNotificationPreferencesDetailsViewModelI1 = I1();
        if (shopNotificationPreferencesDetailsViewModelI1.g.b(CollectionsKt.Q("swrve_notification_channel"))) {
            BuildersKt.c(ViewModelKt.a(shopNotificationPreferencesDetailsViewModelI1), null, null, new ShopNotificationPreferencesDetailsViewModel$fetchPreferencesDetails$1(shopNotificationPreferencesDetailsViewModelI1, null), 3);
        } else {
            shopNotificationPreferencesDetailsViewModelI1.q6(ShopNotificationPreferencesDetailsContract.NotificationsDetailsFullPageErrorState.f);
        }
    }
}
