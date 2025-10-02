package au.com.woolworths.shop.buyagain.ui.legacy.quantityselector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
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
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import au.com.woolworths.product.extensions.ProductExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.databinding.FragmentBuyAgainQuantitySelectorBinding;
import au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Extras", "BottomSheetHost", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainQuantitySelectorFragment extends Hilt_BuyAgainQuantitySelectorFragment {
    public final ViewModelLazy i;
    public FragmentBuyAgainQuantitySelectorBinding j;
    public ProductCard k;
    public float l;
    public final Lazy m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorFragment$BottomSheetHost;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void B0(ProductCard productCard, float f);

        void h(ProductCard productCard);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_PRODUCT_CARD_DATA", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, ProductCard data, float f) {
            Intrinsics.h(data, "data");
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                BuyAgainQuantitySelectorFragment buyAgainQuantitySelectorFragment = new BuyAgainQuantitySelectorFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PRODUCT_CARD_DATA", new Extras(data, f));
                buyAgainQuantitySelectorFragment.setArguments(bundle);
                DialogFragmentExtKt.a(buyAgainQuantitySelectorFragment, fragmentManager, "BuyAgainQuantitySelectorFragment");
                fragmentTransactionE.f();
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorFragment$Extras;", "Landroid/os/Parcelable;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final ProductCard d;
        public final float e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras((ProductCard) parcel.readParcelable(Extras.class.getClassLoader()), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(ProductCard productCard, float f) {
            Intrinsics.h(productCard, "productCard");
            this.d = productCard;
            this.e = f;
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
            return Intrinsics.c(this.d, extras.d) && Float.compare(this.e, extras.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Extras(productCard=" + this.d + ", initialQuantity=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
            dest.writeFloat(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$onCreate$2", f = "BuyAgainQuantitySelectorFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$onCreate$2$1", f = "BuyAgainQuantitySelectorFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<BuyAgainQuantitySelectorContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ BuyAgainQuantitySelectorFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BuyAgainQuantitySelectorFragment buyAgainQuantitySelectorFragment, Continuation continuation) {
                super(2, continuation);
                this.q = buyAgainQuantitySelectorFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((BuyAgainQuantitySelectorContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                BuyAgainQuantitySelectorContract.Actions actions = (BuyAgainQuantitySelectorContract.Actions) this.p;
                BuyAgainQuantitySelectorFragment buyAgainQuantitySelectorFragment = this.q;
                Lazy lazy = buyAgainQuantitySelectorFragment.m;
                if (actions instanceof BuyAgainQuantitySelectorContract.Actions.Remove) {
                    ((BottomSheetHost) lazy.getD()).h(((BuyAgainQuantitySelectorContract.Actions.Remove) actions).f10294a);
                } else {
                    if (!(actions instanceof BuyAgainQuantitySelectorContract.Actions.Update)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BuyAgainQuantitySelectorContract.Actions.Update update = (BuyAgainQuantitySelectorContract.Actions.Update) actions;
                    ((BottomSheetHost) lazy.getD()).B0(update.f10295a, update.b);
                }
                buyAgainQuantitySelectorFragment.dismissAllowingStateLoss();
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = BuyAgainQuantitySelectorFragment.this.new AnonymousClass2(continuation);
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
            BuyAgainQuantitySelectorFragment buyAgainQuantitySelectorFragment = BuyAgainQuantitySelectorFragment.this;
            Flow flow = ((BuyAgainQuantitySelectorViewModel) buyAgainQuantitySelectorFragment.i.getD()).g;
            Lifecycle d = buyAgainQuantitySelectorFragment.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(buyAgainQuantitySelectorFragment, null), FlowExtKt.a(flow, d, Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public BuyAgainQuantitySelectorFragment() {
        final BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$1 buyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$1 = new BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) buyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(BuyAgainQuantitySelectorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.buyagain.ui.legacy.quantityselector.BuyAgainQuantitySelectorFragment$special$$inlined$viewModels$default$4
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
        this.m = LazyKt.b(new a(this, 28));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("EXTRA_PRODUCT_CARD_DATA")) == null) {
            throw new IllegalArgumentException("Product card tile data parcelable argument must be provided");
        }
        this.k = extras.d;
        this.l = extras.e;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuyAgainQuantitySelectorViewModel buyAgainQuantitySelectorViewModel = (BuyAgainQuantitySelectorViewModel) this.i.getD();
        ProductCard productCard = this.k;
        if (productCard == null) {
            Intrinsics.p("productCard");
            throw null;
        }
        float f = this.l;
        buyAgainQuantitySelectorViewModel.j = productCard;
        buyAgainQuantitySelectorViewModel.k = f;
        float default_ = f == BitmapDescriptorFactory.HUE_RED ? (float) buyAgainQuantitySelectorViewModel.q6().getDefault_() : f;
        buyAgainQuantitySelectorViewModel.l = default_;
        MutableStateFlow mutableStateFlow = buyAgainQuantitySelectorViewModel.h;
        boolean z = !(f == default_);
        boolean z2 = f == BitmapDescriptorFactory.HUE_RED;
        ((BuyAgainQuantitySelectorContract.ViewState) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.f(new BuyAgainQuantitySelectorContract.ViewState(z, !z2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentBuyAgainQuantitySelectorBinding.F;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentBuyAgainQuantitySelectorBinding fragmentBuyAgainQuantitySelectorBinding = (FragmentBuyAgainQuantitySelectorBinding) ViewDataBinding.q(inflater, R.layout.fragment_buy_again_quantity_selector, viewGroup, false, null);
        Intrinsics.g(fragmentBuyAgainQuantitySelectorBinding, "inflate(...)");
        fragmentBuyAgainQuantitySelectorBinding.D(this);
        ViewModelLazy viewModelLazy = this.i;
        fragmentBuyAgainQuantitySelectorBinding.N((BuyAgainQuantitySelectorViewModel) viewModelLazy.getD());
        fragmentBuyAgainQuantitySelectorBinding.M((BuyAgainQuantitySelectorViewModel) viewModelLazy.getD());
        ProductCard productCard = this.k;
        if (productCard == null) {
            Intrinsics.p("productCard");
            throw null;
        }
        fragmentBuyAgainQuantitySelectorBinding.L(productCard);
        ComposeView memberPriceComposeView = fragmentBuyAgainQuantitySelectorBinding.y.z;
        Intrinsics.g(memberPriceComposeView, "memberPriceComposeView");
        ProductCard productCard2 = this.k;
        if (productCard2 == null) {
            Intrinsics.p("productCard");
            throw null;
        }
        ProductExtKt.a(memberPriceComposeView, productCard2.getMemberPriceInfo(), ProductMemberPriceLabelStyling.d);
        this.j = fragmentBuyAgainQuantitySelectorBinding;
        ViewCompat.C(fragmentBuyAgainQuantitySelectorBinding.h, getString(R.string.buy_again_quantity_selector_accessibility_title));
        FragmentBuyAgainQuantitySelectorBinding fragmentBuyAgainQuantitySelectorBinding2 = this.j;
        if (fragmentBuyAgainQuantitySelectorBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentBuyAgainQuantitySelectorBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
