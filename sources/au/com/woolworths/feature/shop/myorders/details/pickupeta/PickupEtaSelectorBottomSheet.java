package au.com.woolworths.feature.shop.myorders.details.pickupeta;

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
import au.com.woolworths.feature.shop.myorders.databinding.FragmentPickupEtaSelectorBinding;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorContract;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.analytics.PickupEtaSelectorActions;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Extras", "HostScreen", "BottomSheetHost", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickupEtaSelectorBottomSheet extends Hilt_PickupEtaSelectorBottomSheet {
    public final ViewModelLazy i;
    public FragmentPickupEtaSelectorBinding j;
    public Screen k;
    public OnMyWayPreferences l;
    public final Lazy m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet$BottomSheetHost;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void S3(String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, OnMyWayPreferences data) {
            MyOrdersScreens myOrdersScreens = MyOrdersScreens.h;
            Intrinsics.h(data, "data");
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                PickupEtaSelectorBottomSheet pickupEtaSelectorBottomSheet = new PickupEtaSelectorBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRAS", new Extras(data, new HostScreen(myOrdersScreens.getD(), myOrdersScreens.getE(), myOrdersScreens.getF())));
                pickupEtaSelectorBottomSheet.setArguments(bundle);
                DialogFragmentExtKt.a(pickupEtaSelectorBottomSheet, fragmentManager, "PickupEtaSelectorBottomSheet");
                fragmentTransactionE.f();
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final OnMyWayPreferences d;
        public final HostScreen e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(OnMyWayPreferences.CREATOR.createFromParcel(parcel), HostScreen.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(OnMyWayPreferences onMyWayPreferences, HostScreen hostScreen) {
            Intrinsics.h(onMyWayPreferences, "onMyWayPreferences");
            Intrinsics.h(hostScreen, "hostScreen");
            this.d = onMyWayPreferences;
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
            return "Extras(onMyWayPreferences=" + this.d + ", hostScreen=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet$HostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<HostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HostScreen> {
            @Override // android.os.Parcelable.Creator
            public final HostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HostScreen[] newArray(int i) {
                return new HostScreen[i];
            }
        }

        public HostScreen(String screenName, String sectionName, String screenTealiumKey) {
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
            if (!(obj instanceof HostScreen)) {
                return false;
            }
            HostScreen hostScreen = (HostScreen) obj;
            return Intrinsics.c(this.d, hostScreen.d) && Intrinsics.c(this.e, hostScreen.e) && Intrinsics.c(this.f, hostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return a.o(a.v("HostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$onCreate$2", f = "PickupEtaSelectorBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<PickupEtaSelectorContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = PickupEtaSelectorBottomSheet.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((PickupEtaSelectorContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            PickupEtaSelectorContract.Actions actions = (PickupEtaSelectorContract.Actions) this.p;
            if (!(actions instanceof PickupEtaSelectorContract.Actions.ConfirmPickupEta)) {
                throw new NoWhenBranchMatchedException();
            }
            PickupEtaSelectorBottomSheet pickupEtaSelectorBottomSheet = PickupEtaSelectorBottomSheet.this;
            ((BottomSheetHost) pickupEtaSelectorBottomSheet.m.getD()).S3(((PickupEtaSelectorContract.Actions.ConfirmPickupEta) actions).f7782a);
            pickupEtaSelectorBottomSheet.dismissAllowingStateLoss();
            return Unit.f24250a;
        }
    }

    public PickupEtaSelectorBottomSheet() {
        final PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$1 pickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$1 = new PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) pickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(PickupEtaSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet$special$$inlined$viewModels$default$4
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
        this.m = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 3));
    }

    public final PickupEtaSelectorViewModel Q1() {
        return (PickupEtaSelectorViewModel) this.i.getD();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("EXTRAS")) == null) {
            throw new IllegalArgumentException("PickupEtaSelectorBottomSheet extras argument must be provided");
        }
        this.k = extras.e;
        this.l = extras.d;
        Flow flow = Q1().g;
        Lifecycle d = getD();
        Intrinsics.g(d, "<get-lifecycle>(...)");
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowExtKt.a(flow, d, Lifecycle.State.h)), LifecycleOwnerKt.a(this));
        PickupEtaSelectorViewModel pickupEtaSelectorViewModelQ1 = Q1();
        OnMyWayPreferences onMyWayPreferences = this.l;
        if (onMyWayPreferences == null) {
            Intrinsics.p("onMyWayPreferences");
            throw null;
        }
        pickupEtaSelectorViewModelQ1.h = StateFlowKt.a(new PickupEtaSelectorContract.ViewState(onMyWayPreferences));
        PickupEtaSelectorViewModel pickupEtaSelectorViewModelQ12 = Q1();
        Screen screen = this.k;
        if (screen != null) {
            pickupEtaSelectorViewModelQ12.k = screen;
        } else {
            Intrinsics.p("hostScreen");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentPickupEtaSelectorBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentPickupEtaSelectorBinding fragmentPickupEtaSelectorBinding = (FragmentPickupEtaSelectorBinding) ViewDataBinding.q(inflater, R.layout.fragment_pickup_eta_selector, viewGroup, false, null);
        Intrinsics.g(fragmentPickupEtaSelectorBinding, "inflate(...)");
        fragmentPickupEtaSelectorBinding.D(this);
        fragmentPickupEtaSelectorBinding.M(Q1());
        fragmentPickupEtaSelectorBinding.L(Q1());
        this.j = fragmentPickupEtaSelectorBinding;
        ViewCompat.C(fragmentPickupEtaSelectorBinding.h, getString(R.string.accessibility_pickup_eta_selector_bottom_sheet_title));
        PickupEtaSelectorViewModel pickupEtaSelectorViewModelQ1 = Q1();
        AnalyticsManager analyticsManager = pickupEtaSelectorViewModelQ1.e;
        Screen screen = pickupEtaSelectorViewModelQ1.k;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        analyticsManager.c(new PickupEtaSelectorActions.BottomSheetLaunch(screen));
        FragmentPickupEtaSelectorBinding fragmentPickupEtaSelectorBinding2 = this.j;
        if (fragmentPickupEtaSelectorBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentPickupEtaSelectorBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
