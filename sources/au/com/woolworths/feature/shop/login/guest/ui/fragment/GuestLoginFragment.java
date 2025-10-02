package au.com.woolworths.feature.shop.login.guest.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.feature.shared.instore.wifi.ui.b;
import au.com.woolworths.feature.shop.login.databinding.FragmentGuestLoginBinding;
import au.com.woolworths.feature.shop.login.guest.ui.GuestLoginExtra;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class GuestLoginFragment extends Fragment {
    public static final /* synthetic */ KProperty[] j = {Reflection.f24268a.e(new MutablePropertyReference1Impl(GuestLoginFragment.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/feature/shop/login/databinding/FragmentGuestLoginBinding;", 0))};
    public FeatureToggleManager d;
    public GuestLoginExtra e;
    public final AutoClearedValue f = new AutoClearedValue(this);
    public final ViewModelLazy g;
    public final ActivityResultLauncher h;
    public final ActivityResultLauncher i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginFragment$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public GuestLoginFragment() {
        final GuestLoginFragment$special$$inlined$viewModels$default$1 guestLoginFragment$special$$inlined$viewModels$default$1 = new GuestLoginFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) guestLoginFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.g = new ViewModelLazy(Reflection.f24268a.b(GuestLoginViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$special$$inlined$viewModels$default$4
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
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.a
            public final /* synthetic */ GuestLoginFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i2 = i;
                GuestLoginFragment guestLoginFragment = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GuestLoginFragment.j;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            guestLoginFragment.E1();
                            break;
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = GuestLoginFragment.j;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            guestLoginFragment.E1();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.h = activityResultLauncherRegisterForActivityResult;
        final int i2 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.login.guest.ui.fragment.a
            public final /* synthetic */ GuestLoginFragment e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                int i22 = i2;
                GuestLoginFragment guestLoginFragment = this.e;
                ActivityResult result = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GuestLoginFragment.j;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            guestLoginFragment.E1();
                            break;
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = GuestLoginFragment.j;
                        Intrinsics.h(result, "result");
                        if (result.d == -1) {
                            guestLoginFragment.E1();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.i = activityResultLauncherRegisterForActivityResult2;
    }

    public abstract void E1();

    public void I1() {
    }

    public void Q1() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("guestlogin.extras")) {
            Bundle arguments2 = getArguments();
            if ((arguments2 != null ? arguments2.get("guestlogin.extras") : null) instanceof GuestLoginExtra) {
                Bundle arguments3 = getArguments();
                GuestLoginExtra guestLoginExtra = arguments3 != null ? (GuestLoginExtra) arguments3.getParcelable("guestlogin.extras") : null;
                Intrinsics.e(guestLoginExtra);
                this.e = guestLoginExtra;
                BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new GuestLoginFragment$initActionListening$1(this, null), 3);
                return;
            }
        }
        throw new IllegalArgumentException("Argument guestlogin.extras of " + Reflection.f24268a.b(GuestLoginExtra.class) + " is missing");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentGuestLoginBinding.G;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentGuestLoginBinding fragmentGuestLoginBinding = (FragmentGuestLoginBinding) ViewDataBinding.q(inflater, R.layout.fragment_guest_login, viewGroup, false, null);
        Intrinsics.g(fragmentGuestLoginBinding, "inflate(...)");
        fragmentGuestLoginBinding.D(getViewLifecycleOwner());
        fragmentGuestLoginBinding.L((GuestLoginViewModel) this.g.getD());
        GuestLoginExtra guestLoginExtra = this.e;
        if (guestLoginExtra == null) {
            Intrinsics.p("extras");
            throw null;
        }
        fragmentGuestLoginBinding.C.setImageResource(guestLoginExtra.h);
        fragmentGuestLoginBinding.z.setText(guestLoginExtra.d);
        fragmentGuestLoginBinding.D.setText(guestLoginExtra.e);
        fragmentGuestLoginBinding.B.setText(guestLoginExtra.f);
        fragmentGuestLoginBinding.E.setText(guestLoginExtra.g);
        View view = fragmentGuestLoginBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        ViewExtKt.b(view, new b(24));
        KProperty[] kPropertyArr = j;
        KProperty kProperty = kPropertyArr[0];
        AutoClearedValue autoClearedValue = this.f;
        autoClearedValue.b(this, kProperty, fragmentGuestLoginBinding);
        return ((FragmentGuestLoginBinding) autoClearedValue.getValue(this, kPropertyArr[0])).h;
    }
}
