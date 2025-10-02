package au.com.woolworths.product.cartpreauth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.product.cartpreauth.CartPreAuthContract;
import au.com.woolworths.shop.cart.databinding.FragmentSignInPromptBinding;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartPreAuthBottomSheetFragment extends Hilt_CartPreAuthBottomSheetFragment {
    public final ViewModelLazy i = new ViewModelLazy(Reflection.f24268a.b(CartPreAuthViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public FragmentSignInPromptBinding j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/cartpreauth/CartPreAuthBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentSignInPromptBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentSignInPromptBinding fragmentSignInPromptBinding = (FragmentSignInPromptBinding) ViewDataBinding.q(inflater, R.layout.fragment_sign_in_prompt, viewGroup, false, null);
        this.j = fragmentSignInPromptBinding;
        if (fragmentSignInPromptBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ComposeView composeView = fragmentSignInPromptBinding.y;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-2108552033, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                final CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment2 = cartPreAuthBottomSheetFragment;
                                boolean zI = composer2.I(cartPreAuthBottomSheetFragment2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    final int i2 = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.product.cartpreauth.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment3 = cartPreAuthBottomSheetFragment2;
                                                    ((CartPreAuthViewModel) cartPreAuthBottomSheetFragment3.i.getD()).e.f(CartPreAuthContract.Actions.LaunchLogInFlow.f9252a);
                                                    cartPreAuthBottomSheetFragment3.dismiss();
                                                    break;
                                                default:
                                                    CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment4 = cartPreAuthBottomSheetFragment2;
                                                    ((CartPreAuthViewModel) cartPreAuthBottomSheetFragment4.i.getD()).e.f(CartPreAuthContract.Actions.LaunchSignUpFlow.f9253a);
                                                    cartPreAuthBottomSheetFragment4.dismiss();
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(cartPreAuthBottomSheetFragment2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    final int i3 = 1;
                                    objG2 = new Function0() { // from class: au.com.woolworths.product.cartpreauth.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment3 = cartPreAuthBottomSheetFragment2;
                                                    ((CartPreAuthViewModel) cartPreAuthBottomSheetFragment3.i.getD()).e.f(CartPreAuthContract.Actions.LaunchLogInFlow.f9252a);
                                                    cartPreAuthBottomSheetFragment3.dismiss();
                                                    break;
                                                default:
                                                    CartPreAuthBottomSheetFragment cartPreAuthBottomSheetFragment4 = cartPreAuthBottomSheetFragment2;
                                                    ((CartPreAuthViewModel) cartPreAuthBottomSheetFragment4.i.getD()).e.f(CartPreAuthContract.Actions.LaunchSignUpFlow.f9253a);
                                                    cartPreAuthBottomSheetFragment4.dismiss();
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                CartPreAuthScreenKt.a(function0, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -716539581));
        FragmentSignInPromptBinding fragmentSignInPromptBinding2 = this.j;
        if (fragmentSignInPromptBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentSignInPromptBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
