package au.com.woolworths.product.deliveryaddressprompt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
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
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.shop.cart.databinding.FragmentAddDeliveryAddPromptBinding;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/deliveryaddressprompt/AddDeliveryAddressBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddDeliveryAddressBottomSheetFragment extends Hilt_AddDeliveryAddressBottomSheetFragment {
    public final ViewModelLazy i = new ViewModelLazy(Reflection.f24268a.b(AddDeliveryAddressBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public FragmentAddDeliveryAddPromptBinding j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/deliveryaddressprompt/AddDeliveryAddressBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentAddDeliveryAddPromptBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentAddDeliveryAddPromptBinding fragmentAddDeliveryAddPromptBinding = (FragmentAddDeliveryAddPromptBinding) ViewDataBinding.q(inflater, R.layout.fragment_add_delivery_add_prompt, viewGroup, false, null);
        this.j = fragmentAddDeliveryAddPromptBinding;
        if (fragmentAddDeliveryAddPromptBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ComposeView composeView = fragmentAddDeliveryAddPromptBinding.y;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final AddDeliveryAddressBottomSheetFragment addDeliveryAddressBottomSheetFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1942985300, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                AddDeliveryAddressBottomSheetFragment addDeliveryAddressBottomSheetFragment2 = addDeliveryAddressBottomSheetFragment;
                                boolean zI = composer2.I(addDeliveryAddressBottomSheetFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(addDeliveryAddressBottomSheetFragment2, 25);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                AddDeliveryAddressBottomSheetScreenKt.a((Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2036980144));
        FragmentAddDeliveryAddPromptBinding fragmentAddDeliveryAddPromptBinding2 = this.j;
        if (fragmentAddDeliveryAddPromptBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentAddDeliveryAddPromptBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
