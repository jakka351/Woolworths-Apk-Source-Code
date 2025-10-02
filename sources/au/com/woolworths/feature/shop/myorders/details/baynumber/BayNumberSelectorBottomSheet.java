package au.com.woolworths.feature.shop.myorders.details.baynumber;

import YU.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.myorders.databinding.FragmentBayNumberSelectorBinding;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorContract;
import au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Extras", "BayNumberSelectorHostScreen", "BottomSheetHost", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BayNumberSelectorBottomSheet extends Hilt_BayNumberSelectorBottomSheet {
    public final ViewModelLazy i;
    public FragmentBayNumberSelectorBinding j;
    public Screen k;
    public BayNumberPreferences l;
    public final Lazy m;

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet$BayNumberSelectorHostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BayNumberSelectorHostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<BayNumberSelectorHostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BayNumberSelectorHostScreen> {
            @Override // android.os.Parcelable.Creator
            public final BayNumberSelectorHostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new BayNumberSelectorHostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BayNumberSelectorHostScreen[] newArray(int i) {
                return new BayNumberSelectorHostScreen[i];
            }
        }

        public BayNumberSelectorHostScreen(String screenName, String sectionName, String screenTealiumKey) {
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
            if (!(obj instanceof BayNumberSelectorHostScreen)) {
                return false;
            }
            BayNumberSelectorHostScreen bayNumberSelectorHostScreen = (BayNumberSelectorHostScreen) obj;
            return Intrinsics.c(this.d, bayNumberSelectorHostScreen.d) && Intrinsics.c(this.e, bayNumberSelectorHostScreen.e) && Intrinsics.c(this.f, bayNumberSelectorHostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return a.o(a.v("BayNumberSelectorHostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet$BottomSheetHost;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void I();

        void K3(String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_BAY_NUMBER_PREFERENCE", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, BayNumberPreferences data) {
            MyOrdersScreens myOrdersScreens = MyOrdersScreens.h;
            Intrinsics.h(data, "data");
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                BayNumberSelectorBottomSheet bayNumberSelectorBottomSheet = new BayNumberSelectorBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRAS_BAY_NUMBER_PREFERENCE", new Extras(data, new BayNumberSelectorHostScreen(myOrdersScreens.getD(), myOrdersScreens.getE(), myOrdersScreens.getF())));
                bayNumberSelectorBottomSheet.setArguments(bundle);
                DialogFragmentExtKt.a(bayNumberSelectorBottomSheet, fragmentManager, "BuyAgainQuantitySelectorFragment");
                fragmentTransactionE.f();
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final BayNumberPreferences d;
        public final BayNumberSelectorHostScreen e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(BayNumberPreferences.CREATOR.createFromParcel(parcel), BayNumberSelectorHostScreen.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(BayNumberPreferences bayNumberPreferences, BayNumberSelectorHostScreen hostScreen) {
            Intrinsics.h(bayNumberPreferences, "bayNumberPreferences");
            Intrinsics.h(hostScreen, "hostScreen");
            this.d = bayNumberPreferences;
            this.e = hostScreen;
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
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public final String toString() {
            return "Extras(bayNumberPreferences=" + this.d + ", hostScreen=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$onCreate$2", f = "BayNumberSelectorBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$onCreate$2$1", f = "BayNumberSelectorBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<BayNumberSelectorContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ BayNumberSelectorBottomSheet q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BayNumberSelectorBottomSheet bayNumberSelectorBottomSheet, Continuation continuation) {
                super(2, continuation);
                this.q = bayNumberSelectorBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((BayNumberSelectorContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                BayNumberSelectorContract.Actions actions = (BayNumberSelectorContract.Actions) this.p;
                BayNumberSelectorBottomSheet bayNumberSelectorBottomSheet = this.q;
                Lazy lazy = bayNumberSelectorBottomSheet.m;
                if (actions instanceof BayNumberSelectorContract.Actions.ConfirmBayNumber) {
                    ((BottomSheetHost) lazy.getD()).K3(((BayNumberSelectorContract.Actions.ConfirmBayNumber) actions).f7686a);
                } else {
                    if (!(actions instanceof BayNumberSelectorContract.Actions.DontKnowBayNumber)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((BottomSheetHost) lazy.getD()).I();
                }
                bayNumberSelectorBottomSheet.dismissAllowingStateLoss();
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = BayNumberSelectorBottomSheet.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            BayNumberSelectorBottomSheet bayNumberSelectorBottomSheet = BayNumberSelectorBottomSheet.this;
            Flow flow = bayNumberSelectorBottomSheet.Q1().g;
            Lifecycle d = bayNumberSelectorBottomSheet.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(bayNumberSelectorBottomSheet, null), FlowExtKt.a(flow, d, Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public BayNumberSelectorBottomSheet() {
        final BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$1 bayNumberSelectorBottomSheet$special$$inlined$viewModels$default$1 = new BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) bayNumberSelectorBottomSheet$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(BayNumberSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet$special$$inlined$viewModels$default$4
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
        this.m = LazyKt.b(new f(this, 26));
    }

    public final BayNumberSelectorViewModel Q1() {
        return (BayNumberSelectorViewModel) this.i.getD();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("EXTRAS_BAY_NUMBER_PREFERENCE")) == null) {
            throw new IllegalArgumentException("BayNumberSelectorBottomSheet extras argument must be provided");
        }
        this.k = extras.e;
        this.l = extras.d;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        BayNumberSelectorViewModel bayNumberSelectorViewModelQ1 = Q1();
        BayNumberPreferences bayNumberPreferences = this.l;
        if (bayNumberPreferences == null) {
            Intrinsics.p("bayNumberPreferences");
            throw null;
        }
        bayNumberSelectorViewModelQ1.h = StateFlowKt.a(new BayNumberSelectorContract.ViewState(bayNumberPreferences));
        BayNumberSelectorViewModel bayNumberSelectorViewModelQ12 = Q1();
        Screen screen = this.k;
        if (screen != null) {
            bayNumberSelectorViewModelQ12.k = screen;
        } else {
            Intrinsics.p("hostScreen");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentBayNumberSelectorBinding.G;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentBayNumberSelectorBinding fragmentBayNumberSelectorBinding = (FragmentBayNumberSelectorBinding) ViewDataBinding.q(inflater, R.layout.fragment_bay_number_selector, viewGroup, false, null);
        Intrinsics.g(fragmentBayNumberSelectorBinding, "inflate(...)");
        fragmentBayNumberSelectorBinding.D(this);
        fragmentBayNumberSelectorBinding.N(Q1());
        fragmentBayNumberSelectorBinding.M(Q1());
        BayNumberPreferences bayNumberPreferences = this.l;
        if (bayNumberPreferences == null) {
            Intrinsics.p("bayNumberPreferences");
            throw null;
        }
        fragmentBayNumberSelectorBinding.L(bayNumberPreferences);
        this.j = fragmentBayNumberSelectorBinding;
        ViewCompat.C(fragmentBayNumberSelectorBinding.h, getString(R.string.accessibility_bay_number_selector_bottom_sheet_title));
        BayNumberSelectorViewModel bayNumberSelectorViewModelQ1 = Q1();
        AnalyticsManager analyticsManager = bayNumberSelectorViewModelQ1.e;
        Screen screen = bayNumberSelectorViewModelQ1.k;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        analyticsManager.c(new BayNumberSelectorActions.BottomSheetLaunch(screen));
        FragmentBayNumberSelectorBinding fragmentBayNumberSelectorBinding2 = this.j;
        if (fragmentBayNumberSelectorBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentBayNumberSelectorBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
