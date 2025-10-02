package au.com.woolworths.product.addtocart;

import YU.a;
import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.SingleChoiceSegmentedButtonsBarKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.cartpreauth.CartPreAuthBottomSheetFragment;
import au.com.woolworths.product.cartpreauth.CartPreAuthContract;
import au.com.woolworths.product.cartpreauth.CartPreAuthViewModel;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.databinding.LayoutProductInfoBinding;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetContract;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetFragment;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetViewModel;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import au.com.woolworths.shop.cart.databinding.FragmentAddToCartBinding;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "AddToCartSuccessEvent", "BottomSheetHost", "Extras", "ProductBottomSheetHostScreen", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToCartBottomSheetFragment extends Hilt_AddToCartBottomSheetFragment {
    public final ViewModelLazy i;
    public final ViewModelLazy j;
    public final ViewModelLazy k;
    public FragmentAddToCartBinding l;
    public ShopAppNavigator m;
    public final Lazy n;
    public final ActivityResultLauncher o;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$AddToCartSuccessEvent;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartSuccessEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ProductBottomSheetActionType f9242a;

        public AddToCartSuccessEvent(ProductBottomSheetActionType actionType) {
            Intrinsics.h(actionType, "actionType");
            this.f9242a = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddToCartSuccessEvent) && this.f9242a == ((AddToCartSuccessEvent) obj).f9242a;
        }

        public final int hashCode() {
            return this.f9242a.hashCode();
        }

        public final String toString() {
            return "AddToCartSuccessEvent(actionType=" + this.f9242a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void e(AddToCartSuccessEvent addToCartSuccessEvent);

        default void j(ProductBottomSheetErrorCause productBottomSheetErrorCause) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_PRODUCT_CARD_TILE_DATA", "REQUEST_KEY", "REQUEST_SUCCESS_BUNDLE_KEY", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, Extras extras) {
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                AddToCartBottomSheetFragment addToCartBottomSheetFragment = new AddToCartBottomSheetFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PRODUCT_CARD_TILE_DATA", extras);
                addToCartBottomSheetFragment.setArguments(bundle);
                DialogFragmentExtKt.a(addToCartBottomSheetFragment, fragmentManager, "AddToCartBottomSheetFragment");
                fragmentTransactionE.f();
            }
        }

        public static void b(FragmentManager fragmentManager, ProductCard data, Screen hostScreen) {
            Intrinsics.h(data, "data");
            Intrinsics.h(hostScreen, "hostScreen");
            a(fragmentManager, new Extras(data, false, new ProductBottomSheetHostScreen(hostScreen.getD(), hostScreen.getE(), hostScreen.getF()), (ProductCard) null, 16));
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$ProductBottomSheetHostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductBottomSheetHostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductBottomSheetHostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductBottomSheetHostScreen> {
            @Override // android.os.Parcelable.Creator
            public final ProductBottomSheetHostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new ProductBottomSheetHostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ProductBottomSheetHostScreen[] newArray(int i) {
                return new ProductBottomSheetHostScreen[i];
            }
        }

        public ProductBottomSheetHostScreen(String screenName, String sectionName, String screenTealiumKey) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(sectionName, "sectionName");
            Intrinsics.h(screenTealiumKey, "screenTealiumKey");
            this.d = screenName;
            this.e = sectionName;
            this.f = screenTealiumKey;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductBottomSheetHostScreen)) {
                return false;
            }
            ProductBottomSheetHostScreen productBottomSheetHostScreen = (ProductBottomSheetHostScreen) obj;
            return Intrinsics.c(this.d, productBottomSheetHostScreen.d) && Intrinsics.c(this.e, productBottomSheetHostScreen.e) && Intrinsics.c(this.f, productBottomSheetHostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return a.o(a.v("ProductBottomSheetHostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$1", f = "AddToCartBottomSheetFragment.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddToCartBottomSheetFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final AddToCartBottomSheetFragment addToCartBottomSheetFragment = AddToCartBottomSheetFragment.this;
                Flow flow = ((AddToCartViewModel) addToCartBottomSheetFragment.i.getD()).o;
                Lifecycle d = addToCartBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(flow, d, Lifecycle.State.h);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        AddToCartContract.Actions actions = (AddToCartContract.Actions) obj2;
                        AddToCartBottomSheetFragment addToCartBottomSheetFragment2 = addToCartBottomSheetFragment;
                        Lazy lazy = addToCartBottomSheetFragment2.n;
                        if (actions instanceof AddToCartContract.Actions.FinishWithSuccess) {
                            ProductBottomSheetActionType productBottomSheetActionType = ((AddToCartContract.Actions.FinishWithSuccess) actions).f9244a;
                            addToCartBottomSheetFragment2.dismissAllowingStateLoss();
                            BottomSheetHost bottomSheetHost = (BottomSheetHost) lazy.getD();
                            if (bottomSheetHost != null) {
                                bottomSheetHost.e(new AddToCartSuccessEvent(productBottomSheetActionType));
                            }
                            FragmentKt.a(BundleKt.a(new Pair("requestSuccessBundleKey", productBottomSheetActionType.name())), addToCartBottomSheetFragment2, "requestKey");
                        } else if (actions instanceof AddToCartContract.Actions.FinishWithError) {
                            ProductBottomSheetErrorCause productBottomSheetErrorCause = ((AddToCartContract.Actions.FinishWithError) actions).f9243a;
                            String string = addToCartBottomSheetFragment2.getString(productBottomSheetErrorCause.d);
                            Intrinsics.g(string, "getString(...)");
                            Snackbar.j(addToCartBottomSheetFragment2.requireActivity(), addToCartBottomSheetFragment2.requireActivity().findViewById(R.id.content), string, 0).l();
                            addToCartBottomSheetFragment2.dismissAllowingStateLoss();
                            BottomSheetHost bottomSheetHost2 = (BottomSheetHost) lazy.getD();
                            if (bottomSheetHost2 != null) {
                                bottomSheetHost2.j(productBottomSheetErrorCause);
                            }
                        } else if (actions instanceof AddToCartContract.Actions.FinishWithCancellation) {
                            addToCartBottomSheetFragment2.dismissAllowingStateLoss();
                        } else if (actions instanceof AddToCartContract.Actions.ShowBoostFailureSnackbar) {
                            AddToCartContract.Actions.ShowBoostFailureSnackbar showBoostFailureSnackbar = (AddToCartContract.Actions.ShowBoostFailureSnackbar) actions;
                            FragmentActivity fragmentActivityRequireActivity = addToCartBottomSheetFragment2.requireActivity();
                            FragmentAddToCartBinding fragmentAddToCartBinding = addToCartBottomSheetFragment2.l;
                            if (fragmentAddToCartBinding == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            Snackbar snackbarJ = Snackbar.j(fragmentActivityRequireActivity, fragmentAddToCartBinding.h, addToCartBottomSheetFragment2.getString(com.woolworths.R.string.product_boost_failed), 0);
                            snackbarJ.k(snackbarJ.h.getText(com.woolworths.R.string.product_boost_retry_action), new androidx.navigation.ui.a(16, addToCartBottomSheetFragment2, showBoostFailureSnackbar));
                            snackbarJ.l();
                        } else if (actions instanceof AddToCartContract.Actions.ShowSignInPrompt) {
                            FragmentManager parentFragmentManager = addToCartBottomSheetFragment2.getParentFragmentManager();
                            Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                            FragmentTransaction fragmentTransactionE = parentFragmentManager.e();
                            DialogFragmentExtKt.a(new CartPreAuthBottomSheetFragment(), parentFragmentManager, "CartPreAuthBottomSheetFragment");
                            fragmentTransactionE.f();
                        } else {
                            if (!(actions instanceof AddToCartContract.Actions.ShowAddDeliveryAddressBottomSheet)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FragmentManager parentFragmentManager2 = addToCartBottomSheetFragment2.getParentFragmentManager();
                            Intrinsics.g(parentFragmentManager2, "getParentFragmentManager(...)");
                            FragmentTransaction fragmentTransactionE2 = parentFragmentManager2.e();
                            DialogFragmentExtKt.a(new AddDeliveryAddressBottomSheetFragment(), parentFragmentManager2, "AddDeliveryAddressPromptBottomSheetFragment");
                            fragmentTransactionE2.f();
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$2", f = "AddToCartBottomSheetFragment.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddToCartBottomSheetFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final AddToCartBottomSheetFragment addToCartBottomSheetFragment = AddToCartBottomSheetFragment.this;
                Flow flow = ((CartPreAuthViewModel) addToCartBottomSheetFragment.j.getD()).f;
                Lifecycle d = addToCartBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(flow, d, Lifecycle.State.h);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        CartPreAuthContract.Actions actions = (CartPreAuthContract.Actions) obj2;
                        boolean z = actions instanceof CartPreAuthContract.Actions.LaunchLogInFlow;
                        AddToCartBottomSheetFragment addToCartBottomSheetFragment2 = addToCartBottomSheetFragment;
                        if (z) {
                            FragmentActivity fragmentActivityRequireActivity = addToCartBottomSheetFragment2.requireActivity();
                            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                            Activities.LogIn.c(fragmentActivityRequireActivity);
                        } else {
                            if (!(actions instanceof CartPreAuthContract.Actions.LaunchSignUpFlow)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ShopAppNavigator shopAppNavigator = addToCartBottomSheetFragment2.m;
                            if (shopAppNavigator == null) {
                                Intrinsics.p("navigator");
                                throw null;
                            }
                            shopAppNavigator.b.startActivityForResult(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), 7777);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$3", f = "AddToCartBottomSheetFragment.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddToCartBottomSheetFragment.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final AddToCartBottomSheetFragment addToCartBottomSheetFragment = AddToCartBottomSheetFragment.this;
                Flow flow = ((AddDeliveryAddressBottomSheetViewModel) addToCartBottomSheetFragment.k.getD()).f;
                Lifecycle d = addToCartBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(flow, d, Lifecycle.State.h);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        boolean z = ((AddDeliveryAddressBottomSheetContract.Actions) obj2) instanceof AddDeliveryAddressBottomSheetContract.Actions.OnAddDeliveryAddress;
                        AddToCartBottomSheetFragment addToCartBottomSheetFragment2 = addToCartBottomSheetFragment;
                        if (!z) {
                            addToCartBottomSheetFragment2.getClass();
                            throw new NoWhenBranchMatchedException();
                        }
                        addToCartBottomSheetFragment2.o.a(Activities.DeliveryAddressSearchActivity.f4466a.b(new Activities.DeliveryAddressSearchActivity.Extras(false, true, false, true)), null);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
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

    public AddToCartBottomSheetFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.i = new ViewModelLazy(reflectionFactory.b(AddToCartViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.j = new ViewModelLazy(reflectionFactory.b(CartPreAuthViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.k = new ViewModelLazy(reflectionFactory.b(AddDeliveryAddressBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$special$$inlined$activityViewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.n = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 24));
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 13));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.o = activityResultLauncherRegisterForActivityResult;
    }

    public final Extras Q1() {
        Bundle arguments = getArguments();
        Extras extras = arguments != null ? (Extras) arguments.getParcelable("EXTRA_PRODUCT_CARD_TILE_DATA") : null;
        if (extras != null) {
            return extras;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AddToCartViewModel addToCartViewModel = (AddToCartViewModel) this.i.getD();
        Extras extrasQ1 = Q1();
        addToCartViewModel.m.m(new AddToCartContract.ViewState(extrasQ1.d, extrasQ1.h, extrasQ1.g, extrasQ1.e, 0, 0, false));
        ProductBottomSheetHostScreen productBottomSheetHostScreen = extrasQ1.f;
        Intrinsics.h(productBottomSheetHostScreen, "<set-?>");
        addToCartViewModel.l = productBottomSheetHostScreen;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentAddToCartBinding.I;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final FragmentAddToCartBinding fragmentAddToCartBinding = (FragmentAddToCartBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_add_to_cart, viewGroup, false, null);
        Intrinsics.g(fragmentAddToCartBinding, "inflate(...)");
        ComposeView composeView = fragmentAddToCartBinding.C;
        LayoutProductInfoBinding layoutProductInfoBinding = fragmentAddToCartBinding.z;
        ComposeView memberPriceComposeView = layoutProductInfoBinding.z;
        Intrinsics.g(memberPriceComposeView, "memberPriceComposeView");
        ProductExtKt.a(memberPriceComposeView, Q1().d.getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
        TextView textView = layoutProductInfoBinding.G;
        AddToCartViewModel addToCartViewModel = fragmentAddToCartBinding.F;
        if (addToCartViewModel != null) {
            int i2 = addToCartViewModel.i.b() == Region.j ? 2 : 1;
            textView.setMaxLines(i2);
            textView.setSingleLine(i2 == 1);
        }
        final List<String> trolleySelectorTitleList = Q1().d.getTrolleySelectorTitleList();
        List<String> list = trolleySelectorTitleList;
        if (list == null || list.isEmpty()) {
            trolleySelectorTitleList = null;
        }
        if (trolleySelectorTitleList != null) {
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreateView$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final FragmentAddToCartBinding fragmentAddToCartBinding2 = fragmentAddToCartBinding;
                        final List list2 = trolleySelectorTitleList;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(516830390, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment$onCreateView$1$3$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                AddToCartContract.ViewState viewState;
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    FragmentAddToCartBinding fragmentAddToCartBinding3 = fragmentAddToCartBinding2;
                                    AddToCartViewModel addToCartViewModel2 = fragmentAddToCartBinding3.F;
                                    MutableLiveData mutableLiveData = addToCartViewModel2 != null ? addToCartViewModel2.m : null;
                                    composer2.o(-1542199578);
                                    MutableState mutableStateB = mutableLiveData != null ? LiveDataAdapterKt.b(mutableLiveData, mutableLiveData.e(), composer2) : null;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(fragmentAddToCartBinding3);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(fragmentAddToCartBinding3, 26);
                                        composer2.A(objG);
                                    }
                                    Function1 function1 = (Function1) objG;
                                    composer2.l();
                                    SingleChoiceSegmentedButtonsBarKt.a(list2, function1, (mutableStateB == null || (viewState = (AddToCartContract.ViewState) mutableStateB.getD()) == null) ? 0 : viewState.f, null, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -2098527654));
        } else {
            composeView.setVisibility(8);
        }
        this.l = fragmentAddToCartBinding;
        ViewCompat.C(fragmentAddToCartBinding.h, getString(com.woolworths.R.string.product_add_to_cart_bottom_sheet_title));
        FragmentAddToCartBinding fragmentAddToCartBinding2 = this.l;
        if (fragmentAddToCartBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentAddToCartBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        FragmentAddToCartBinding fragmentAddToCartBinding = this.l;
        if (fragmentAddToCartBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ViewModelLazy viewModelLazy = this.i;
        fragmentAddToCartBinding.N((AddToCartViewModel) viewModelLazy.getD());
        FragmentAddToCartBinding fragmentAddToCartBinding2 = this.l;
        if (fragmentAddToCartBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddToCartBinding2.D(getViewLifecycleOwner());
        FragmentAddToCartBinding fragmentAddToCartBinding3 = this.l;
        if (fragmentAddToCartBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddToCartBinding3.L(new ProductCardConfig(false, false, false, false, false, false, null, 124, null));
        ProductCard productCard = Q1().d;
        FragmentAddToCartBinding fragmentAddToCartBinding4 = this.l;
        if (fragmentAddToCartBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddToCartBinding4.M(productCard);
        ((AddToCartViewModel) viewModelLazy.getD()).m.f(this, new AddToCartBottomSheetFragment$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(this, 26, productCard, false)));
        super.onViewCreated(view, bundle);
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final ProductCard d;
        public final boolean e;
        public final ProductBottomSheetHostScreen f;
        public final TrackingMetadata g;
        public final ProductCard h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras((ProductCard) parcel.readParcelable(Extras.class.getClassLoader()), parcel.readInt() != 0, ProductBottomSheetHostScreen.CREATOR.createFromParcel(parcel), (TrackingMetadata) parcel.readParcelable(Extras.class.getClassLoader()), (ProductCard) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(ProductCard productCard, boolean z, ProductBottomSheetHostScreen hostScreen, TrackingMetadata trackingMetadata, ProductCard productCard2) {
            Intrinsics.h(productCard, "productCard");
            Intrinsics.h(hostScreen, "hostScreen");
            this.d = productCard;
            this.e = z;
            this.f = hostScreen;
            this.g = trackingMetadata;
            this.h = productCard2;
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
            return Intrinsics.c(this.d, extras.d) && this.e == extras.e && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && Intrinsics.c(this.h, extras.h);
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + b.e(this.d.hashCode() * 31, 31, this.e)) * 31;
            TrackingMetadata trackingMetadata = this.g;
            int iHashCode2 = (iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31;
            ProductCard productCard = this.h;
            return iHashCode2 + (productCard != null ? productCard.hashCode() : 0);
        }

        public final String toString() {
            return "Extras(productCard=" + this.d + ", saveEducationBottomSheetPrefs=" + this.e + ", hostScreen=" + this.f + ", trackingMetadata=" + this.g + ", productToReplace=" + this.h + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            this.f.writeToParcel(dest, i);
            dest.writeParcelable(this.g, i);
            dest.writeParcelable(this.h, i);
        }

        public /* synthetic */ Extras(ProductCard productCard, boolean z, ProductBottomSheetHostScreen productBottomSheetHostScreen, ProductCard productCard2, int i) {
            this(productCard, z, productBottomSheetHostScreen, (TrackingMetadata) null, (i & 16) != 0 ? null : productCard2);
        }

        public /* synthetic */ Extras(ProductCard productCard, boolean z, Screen screen) {
            this(productCard, z, screen, (TrackingMetadata) null, (ProductCard) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Extras(ProductCard productCard, boolean z, Screen hostScreen, TrackingMetadata trackingMetadata, ProductCard productCard2) {
            this(productCard, z, new ProductBottomSheetHostScreen(hostScreen.getD(), hostScreen.getE(), hostScreen.getF()), trackingMetadata, productCard2);
            Intrinsics.h(productCard, "productCard");
            Intrinsics.h(hostScreen, "hostScreen");
        }
    }
}
