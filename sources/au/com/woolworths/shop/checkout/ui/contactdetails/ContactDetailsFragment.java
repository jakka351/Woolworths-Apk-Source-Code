package au.com.woolworths.shop.checkout.ui.contactdetails;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContract$ViewState;", "viewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContactDetailsFragment extends Fragment {
    public final ViewModelLazy d;
    public final NavArgsLazy e;

    public ContactDetailsFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.d = new ViewModelLazy(reflectionFactory.b(CheckoutBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.e = new NavArgsLazy(reflectionFactory.b(ContactDetailsFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ContactDetailsFragment contactDetailsFragment = this.d;
                Bundle arguments = contactDetailsFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + contactDetailsFragment + " has null arguments");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((CheckoutBridgeViewModel) this.d.getD()).p6(EmptyList.d);
        FragmentActivity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                final ContactDetailsFragment contactDetailsFragment = this.d;
                NavArgsLazy navArgsLazy = contactDetailsFragment.e;
                if ((iIntValue & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composer);
                    if (viewModelStoreOwnerA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    final ContactDetailsContentViewModel contactDetailsContentViewModel = (ContactDetailsContentViewModel) ViewModelKt.a(viewModelStoreOwnerA, Reflection.f24268a.b(ContactDetailsContentViewModel.class), null, viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b);
                    String str = ((ContactDetailsFragmentArgs) navArgsLazy.getD()).f10728a.e;
                    if (str == null) {
                        str = "";
                    }
                    String placeholder = ((ContactDetailsFragmentArgs) navArgsLazy.getD()).f10728a.d;
                    Intrinsics.h(placeholder, "placeholder");
                    contactDetailsContentViewModel.e.setValue(new ContactDetailsContract.ViewState(str, placeholder, 4));
                    Flow flow = contactDetailsContentViewModel.h;
                    composer.o(-1633490746);
                    boolean zI = composer.I(contactDetailsContentViewModel) | composer.I(contactDetailsFragment);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new ContactDetailsFragment$onCreateView$1$1$1$1(contactDetailsContentViewModel, contactDetailsFragment, null);
                        composer.A(objG);
                    }
                    composer.l();
                    EffectsKt.e(composer, flow, (Function2) objG);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1467708723, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsFragment$onCreateView$1$1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ContactDetailsContentViewModel contactDetailsContentViewModel2 = contactDetailsContentViewModel;
                                ContactDetailsContract.ViewState viewState = (ContactDetailsContract.ViewState) FlowExtKt.a(contactDetailsContentViewModel2.f, composer2).getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(contactDetailsContentViewModel2);
                                Object objG2 = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ContactDetailsFragment$onCreateView$1$1$2$1$1 contactDetailsFragment$onCreateView$1$1$2$1$1 = new ContactDetailsFragment$onCreateView$1$1$2$1$1(1, contactDetailsContentViewModel2, ContactDetailsContentViewModel.class, "onInputChange", "onInputChange(Ljava/lang/String;)V", 0);
                                    composer2.A(contactDetailsFragment$onCreateView$1$1$2$1$1);
                                    objG2 = contactDetailsFragment$onCreateView$1$1$2$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(contactDetailsContentViewModel2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    ContactDetailsFragment$onCreateView$1$1$2$2$1 contactDetailsFragment$onCreateView$1$1$2$2$1 = new ContactDetailsFragment$onCreateView$1$1$2$2$1(0, contactDetailsContentViewModel2, ContactDetailsContentViewModel.class, "onSavePhoneNumber", "onSavePhoneNumber()V", 0);
                                    composer2.A(contactDetailsFragment$onCreateView$1$1$2$2$1);
                                    objG3 = contactDetailsFragment$onCreateView$1$1$2$2$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG3);
                                composer2.o(5004770);
                                ContactDetailsFragment contactDetailsFragment2 = contactDetailsFragment;
                                boolean zI4 = composer2.I(contactDetailsFragment2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new c(contactDetailsFragment2, 2);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                ContactDetailsScreenKt.a(viewState, function1, function0, (Function0) objG4, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -304813711));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.C();
        }
    }
}
