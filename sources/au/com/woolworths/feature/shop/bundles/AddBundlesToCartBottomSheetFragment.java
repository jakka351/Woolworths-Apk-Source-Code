package au.com.woolworths.feature.shop.bundles;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesBottomSheetContract;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.bottomsheet.BundlesBottomSheetActionType;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundlesProductCardConfig;
import au.com.woolworths.feature.shop.bundles.databinding.FragmentAddBundlesToCartBinding;
import au.com.woolworths.feature.shop.bundles.ui.BundlesHeaderUiKt;
import au.com.woolworths.feature.shop.bundles.ui.BundlesItemsUiKt;
import au.com.woolworths.product.extensions.MiscExtKt;
import au.com.woolworths.product.models.ProductCardConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/AddBundlesToCartBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "AddToCartSuccessEvent", "BottomSheetHost", "Extras", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddBundlesToCartBottomSheetFragment extends Hilt_AddBundlesToCartBottomSheetFragment {
    public final ViewModelLazy i;
    public FragmentAddBundlesToCartBinding j;
    public final Lazy k;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/AddBundlesToCartBottomSheetFragment$AddToCartSuccessEvent;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartSuccessEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddToCartSuccessEvent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AddToCartSuccessEvent(actionType=" + ((Object) null) + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/AddBundlesToCartBottomSheetFragment$BottomSheetHost;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/AddBundlesToCartBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_BUNDLE_DATA", "REQUEST_KEY", "REQUEST_SUCCESS_BUNDLE_KEY", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/AddBundlesToCartBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final Bundle d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras((Bundle) parcel.readValue(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(Bundle bundle) {
            Intrinsics.h(bundle, "bundle");
            this.d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "Extras(bundle=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeValue(this.d);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BundlesBottomSheetActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BundlesBottomSheetActionType bundlesBottomSheetActionType = BundlesBottomSheetActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BundlesBottomSheetActionType bundlesBottomSheetActionType2 = BundlesBottomSheetActionType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$onCreate$1", f = "AddBundlesToCartBottomSheetFragment.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AddBundlesToCartBottomSheetFragment.this.new AnonymousClass1(continuation);
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
                final AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment = AddBundlesToCartBottomSheetFragment.this;
                Flow flow = ((AddBundlesToCartViewModel) addBundlesToCartBottomSheetFragment.i.getD()).m;
                Lifecycle d = addBundlesToCartBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(flow, d, Lifecycle.State.h);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        AddBundlesBottomSheetContract.Actions actions = (AddBundlesBottomSheetContract.Actions) obj2;
                        AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment2 = addBundlesToCartBottomSheetFragment;
                        Lazy lazy = addBundlesToCartBottomSheetFragment2.k;
                        if (actions instanceof AddBundlesBottomSheetContract.Actions.DismissBottomSheet) {
                            BundlesBottomSheetActionType bundlesBottomSheetActionType = ((AddBundlesBottomSheetContract.Actions.DismissBottomSheet) actions).f6747a;
                            addBundlesToCartBottomSheetFragment2.dismissAllowingStateLoss();
                            BottomSheetHost bottomSheetHost = (BottomSheetHost) lazy.getD();
                            if (bottomSheetHost != null) {
                                bottomSheetHost.a();
                            }
                            FragmentKt.a(BundleKt.a(new Pair("requestSuccessBundleKey", bundlesBottomSheetActionType.name())), addBundlesToCartBottomSheetFragment2, "requestKey");
                        } else if (actions instanceof AddBundlesBottomSheetContract.Actions.ShowBoostFailureSnackbar) {
                            FragmentActivity fragmentActivityRequireActivity = addBundlesToCartBottomSheetFragment2.requireActivity();
                            FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding = addBundlesToCartBottomSheetFragment2.j;
                            if (fragmentAddBundlesToCartBinding == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            Snackbar.j(fragmentActivityRequireActivity, fragmentAddBundlesToCartBinding.h, addBundlesToCartBottomSheetFragment2.getString(com.woolworths.R.string.product_boost_failed), 0).l();
                        } else if (actions instanceof AddBundlesBottomSheetContract.Actions.ShowLoading) {
                            AddBundlesBottomSheetContract.Actions.ShowLoading showLoading = (AddBundlesBottomSheetContract.Actions.ShowLoading) actions;
                            FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding2 = addBundlesToCartBottomSheetFragment2.j;
                            if (fragmentAddBundlesToCartBinding2 == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            int iOrdinal = showLoading.f6749a.ordinal();
                            if (iOrdinal == 0) {
                                fragmentAddBundlesToCartBinding2.y.setStatefulButtonState(StatefulButtonState.e);
                                FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding3 = addBundlesToCartBottomSheetFragment2.j;
                                if (fragmentAddBundlesToCartBinding3 == null) {
                                    Intrinsics.p("fragmentBinding");
                                    throw null;
                                }
                                FrameLayout overlayView = fragmentAddBundlesToCartBinding3.B;
                                Intrinsics.g(overlayView, "overlayView");
                                MiscExtKt.a(overlayView);
                            } else if (iOrdinal == 1) {
                                fragmentAddBundlesToCartBinding2.D.setStatefulButtonState(StatefulButtonState.e);
                                FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding4 = addBundlesToCartBottomSheetFragment2.j;
                                if (fragmentAddBundlesToCartBinding4 == null) {
                                    Intrinsics.p("fragmentBinding");
                                    throw null;
                                }
                                FrameLayout overlayView2 = fragmentAddBundlesToCartBinding4.B;
                                Intrinsics.g(overlayView2, "overlayView");
                                MiscExtKt.a(overlayView2);
                            } else {
                                if (iOrdinal != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fragmentAddBundlesToCartBinding2.C.setStatefulButtonState(StatefulButtonState.e);
                                FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding5 = addBundlesToCartBottomSheetFragment2.j;
                                if (fragmentAddBundlesToCartBinding5 == null) {
                                    Intrinsics.p("fragmentBinding");
                                    throw null;
                                }
                                FrameLayout overlayView3 = fragmentAddBundlesToCartBinding5.B;
                                Intrinsics.g(overlayView3, "overlayView");
                                MiscExtKt.a(overlayView3);
                            }
                        } else {
                            if (!(actions instanceof AddBundlesBottomSheetContract.Actions.ShowAddToCartError)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Snackbar.j(addBundlesToCartBottomSheetFragment2.requireActivity(), addBundlesToCartBottomSheetFragment2.requireActivity().findViewById(android.R.id.content), addBundlesToCartBottomSheetFragment2.getString(((AddBundlesBottomSheetContract.Actions.ShowAddToCartError) actions).f6748a.d), 0).l();
                            addBundlesToCartBottomSheetFragment2.dismissAllowingStateLoss();
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

    public AddBundlesToCartBottomSheetFragment() {
        final a aVar = new a(this, 0);
        final AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$1 addBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$1 = new AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) addBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(AddBundlesToCartViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (CreationExtras) aVar.invoke();
            }
        });
        this.k = LazyKt.b(new a(this, 1));
    }

    public final Extras Q1() {
        android.os.Bundle arguments = getArguments();
        Extras extras = arguments != null ? (Extras) arguments.getParcelable("EXTRAS_BUNDLE_DATA") : null;
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
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentAddBundlesToCartBinding.G;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding = (FragmentAddBundlesToCartBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_add_bundles_to_cart, viewGroup, false, null);
        Intrinsics.g(fragmentAddBundlesToCartBinding, "inflate(...)");
        fragmentAddBundlesToCartBinding.z.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-372587515, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.AddBundlesToCartBottomSheetFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer2.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer2.i();
                                if (composer2.getO()) {
                                    composer2.K(function0);
                                } else {
                                    composer2.e();
                                }
                                Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment2 = addBundlesToCartBottomSheetFragment;
                                BundlesHeaderUiKt.a(addBundlesToCartBottomSheetFragment2.Q1().d.f6753a, composer2, 0);
                                List list = addBundlesToCartBottomSheetFragment2.Q1().d.b;
                                composer2.o(1849434622);
                                Object objG = composer2.G();
                                if (objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(17);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                BundlesItemsUiKt.a(list, (Function1) objG, BundlesProductCardConfig.e, false, composer2, 3504, 0);
                                composer2.f();
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 302780585));
        this.j = fragmentAddBundlesToCartBinding;
        ViewCompat.C(fragmentAddBundlesToCartBinding.h, getString(com.woolworths.R.string.product_add_to_cart_bottom_sheet_title));
        FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding2 = this.j;
        if (fragmentAddBundlesToCartBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentAddBundlesToCartBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, android.os.Bundle bundle) throws Resources.NotFoundException {
        Intrinsics.h(view, "view");
        FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding = this.j;
        if (fragmentAddBundlesToCartBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddBundlesToCartBinding.M((AddBundlesToCartViewModel) this.i.getD());
        FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding2 = this.j;
        if (fragmentAddBundlesToCartBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddBundlesToCartBinding2.D(getViewLifecycleOwner());
        if (this.j == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        new ProductCardConfig(false, false, false, false, false, false, null, 124, null);
        FragmentAddBundlesToCartBinding fragmentAddBundlesToCartBinding3 = this.j;
        if (fragmentAddBundlesToCartBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentAddBundlesToCartBinding3.L(Q1().d);
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) getDialog();
        Intrinsics.e(bottomSheetDialog);
        View viewFindViewById = bottomSheetDialog.findViewById(com.woolworths.R.id.design_bottom_sheet);
        Intrinsics.e(viewFindViewById);
        BottomSheetBehavior.F(viewFindViewById).f(3);
        super.onViewCreated(view, bundle);
    }
}
