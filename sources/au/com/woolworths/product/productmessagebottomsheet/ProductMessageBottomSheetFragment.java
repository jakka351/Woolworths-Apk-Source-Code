package au.com.woolworths.product.productmessagebottomsheet;

import YU.a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.databinding.FragmentProductMessageBottomSheetBinding;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetActions;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetContract;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetListener;", "<init>", "()V", "Extras", "ProductMessageBottomSheetHostScreen", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductMessageBottomSheetFragment extends Hilt_ProductMessageBottomSheetFragment implements ProductMessageBottomSheetListener {
    public FeatureToggleManager i;
    public final ViewModelLazy j;
    public FragmentProductMessageBottomSheetBinding k;
    public ProductCardConfig l;
    public ProductCard m;
    public String n;
    public String o;
    public Screen p;
    public boolean q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRAS_PRODUCT_CARD_TILE_DATA", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, ProductCard data, String str, String str2, Screen hostScreen, TrackingMetadata trackingMetadata) {
            Intrinsics.h(data, "data");
            Intrinsics.h(hostScreen, "hostScreen");
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                ProductMessageBottomSheetFragment productMessageBottomSheetFragment = new ProductMessageBottomSheetFragment();
                ProductMessageBottomSheetHostScreen productMessageBottomSheetHostScreen = new ProductMessageBottomSheetHostScreen(hostScreen.getD(), hostScreen.getE(), hostScreen.getF());
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PRODUCT_CARD_TILE_DATA", new Extras(data, str, str2, productMessageBottomSheetHostScreen, trackingMetadata));
                productMessageBottomSheetFragment.setArguments(bundle);
                DialogFragmentExtKt.a(productMessageBottomSheetFragment, fragmentManager, "ProductMessageBottomSheetFragment");
                fragmentTransactionE.f();
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final ProductCard d;
        public final String e;
        public final String f;
        public final ProductMessageBottomSheetHostScreen g;
        public final TrackingMetadata h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(ProductCard.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), ProductMessageBottomSheetHostScreen.CREATOR.createFromParcel(parcel), (TrackingMetadata) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(ProductCard productCard, String title, String message, ProductMessageBottomSheetHostScreen hostScreen, TrackingMetadata trackingMetadata) {
            Intrinsics.h(productCard, "productCard");
            Intrinsics.h(title, "title");
            Intrinsics.h(message, "message");
            Intrinsics.h(hostScreen, "hostScreen");
            this.d = productCard;
            this.e = title;
            this.f = message;
            this.g = hostScreen;
            this.h = trackingMetadata;
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
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && Intrinsics.c(this.h, extras.h);
        }

        public final int hashCode() {
            int iC = (b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f) + this.g.hashCode()) * 31;
            TrackingMetadata trackingMetadata = this.h;
            return iC + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode());
        }

        public final String toString() {
            return "Extras(productCard=" + this.d + ", title=" + this.e + ", message=" + this.f + ", hostScreen=" + this.g + ", trackingMetadata=" + this.h + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
            dest.writeString(this.e);
            dest.writeString(this.f);
            this.g.writeToParcel(dest, i);
            dest.writeParcelable(this.h, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetFragment$ProductMessageBottomSheetHostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductMessageBottomSheetHostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductMessageBottomSheetHostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductMessageBottomSheetHostScreen> {
            @Override // android.os.Parcelable.Creator
            public final ProductMessageBottomSheetHostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new ProductMessageBottomSheetHostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ProductMessageBottomSheetHostScreen[] newArray(int i) {
                return new ProductMessageBottomSheetHostScreen[i];
            }
        }

        public ProductMessageBottomSheetHostScreen(String screenName, String sectionName, String screenTealiumKey) {
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
            if (!(obj instanceof ProductMessageBottomSheetHostScreen)) {
                return false;
            }
            ProductMessageBottomSheetHostScreen productMessageBottomSheetHostScreen = (ProductMessageBottomSheetHostScreen) obj;
            return Intrinsics.c(this.d, productMessageBottomSheetHostScreen.d) && Intrinsics.c(this.e, productMessageBottomSheetHostScreen.e) && Intrinsics.c(this.f, productMessageBottomSheetHostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return a.o(a.v("ProductMessageBottomSheetHostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    public ProductMessageBottomSheetFragment() {
        final ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$1 productMessageBottomSheetFragment$special$$inlined$viewModels$default$1 = new ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) productMessageBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j = new ViewModelLazy(Reflection.f24268a.b(ProductMessageBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetListener
    public final void k() {
        InfoSheet infoSheet;
        ButtonApiData button;
        ProductMessageBottomSheetViewModel productMessageBottomSheetViewModel = (ProductMessageBottomSheetViewModel) this.j.getD();
        ProductCard productCard = this.m;
        if (productCard == null) {
            Intrinsics.p("productCard");
            throw null;
        }
        InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
        String label = (inStoreAvailabilityInfo == null || (infoSheet = inStoreAvailabilityInfo.getInfoSheet()) == null || (button = infoSheet.getButton()) == null) ? null : button.getLabel();
        if (label == null) {
            label = "";
        }
        AnalyticsManager analyticsManager = productMessageBottomSheetViewModel.e;
        Screen screen = productMessageBottomSheetViewModel.g;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        analyticsManager.c(new ProductMessageBottomSheetActions.DismissButtonClick(screen, label));
        this.q = true;
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("EXTRA_PRODUCT_CARD_TILE_DATA")) == null) {
            throw new IllegalArgumentException("Product card tile data parcelable argument must be provided");
        }
        this.l = new ProductCardConfig(false, false, false, false, false, false, null, 124, null);
        this.m = extras.d;
        this.n = extras.e;
        this.o = extras.f;
        this.p = extras.g;
        ProductMessageBottomSheetViewModel productMessageBottomSheetViewModel = (ProductMessageBottomSheetViewModel) this.j.getD();
        Screen screen = this.p;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        productMessageBottomSheetViewModel.g = screen;
        ProductCard productCard = this.m;
        if (productCard != null) {
            productMessageBottomSheetViewModel.f.m(new ProductMessageBottomSheetContract.ViewState(productCard));
        } else {
            Intrinsics.p("productCard");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentProductMessageBottomSheetBinding.K;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentProductMessageBottomSheetBinding fragmentProductMessageBottomSheetBinding = (FragmentProductMessageBottomSheetBinding) ViewDataBinding.q(inflater, R.layout.fragment_product_message_bottom_sheet, viewGroup, false, null);
        Intrinsics.g(fragmentProductMessageBottomSheetBinding, "inflate(...)");
        fragmentProductMessageBottomSheetBinding.D(this);
        ProductCardConfig productCardConfig = this.l;
        if (productCardConfig == null) {
            Intrinsics.p("productCardConfig");
            throw null;
        }
        fragmentProductMessageBottomSheetBinding.O(productCardConfig);
        ProductCard productCard = this.m;
        if (productCard == null) {
            Intrinsics.p("productCard");
            throw null;
        }
        fragmentProductMessageBottomSheetBinding.P(productCard);
        String str = this.o;
        if (str == null) {
            Intrinsics.p("message");
            throw null;
        }
        fragmentProductMessageBottomSheetBinding.N(str);
        Screen screen = this.p;
        if (screen == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        fragmentProductMessageBottomSheetBinding.L(screen);
        fragmentProductMessageBottomSheetBinding.Q(this);
        FeatureToggleManager featureToggleManager = this.i;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        fragmentProductMessageBottomSheetBinding.M(featureToggleManager.c(BaseShopAppFeature.w));
        this.k = fragmentProductMessageBottomSheetBinding;
        this.q = false;
        ProductMessageBottomSheetViewModel productMessageBottomSheetViewModel = (ProductMessageBottomSheetViewModel) this.j.getD();
        AnalyticsManager analyticsManager = productMessageBottomSheetViewModel.e;
        Screen screen2 = productMessageBottomSheetViewModel.g;
        if (screen2 == null) {
            Intrinsics.p("hostScreen");
            throw null;
        }
        analyticsManager.c(new ProductMessageBottomSheetActions.BottomSheetLaunch(screen2));
        FragmentProductMessageBottomSheetBinding fragmentProductMessageBottomSheetBinding2 = this.k;
        if (fragmentProductMessageBottomSheetBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ViewCompat.C(fragmentProductMessageBottomSheetBinding2.h, getString(R.string.product_message_bottom_sheet_title));
        FragmentProductMessageBottomSheetBinding fragmentProductMessageBottomSheetBinding3 = this.k;
        if (fragmentProductMessageBottomSheetBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ComposeView composeView = fragmentProductMessageBottomSheetBinding3.D;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$prefixInfoIconToTitle$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductMessageBottomSheetFragment productMessageBottomSheetFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1280209630, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment$prefixInfoIconToTitle$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                String str2 = productMessageBottomSheetFragment.n;
                                if (str2 == null) {
                                    Intrinsics.p("title");
                                    throw null;
                                }
                                ProductMessageTitleRowKt.a(str2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -213063130));
        FragmentProductMessageBottomSheetBinding fragmentProductMessageBottomSheetBinding4 = this.k;
        if (fragmentProductMessageBottomSheetBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentProductMessageBottomSheetBinding4.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.q) {
            return;
        }
        ProductMessageBottomSheetViewModel productMessageBottomSheetViewModel = (ProductMessageBottomSheetViewModel) this.j.getD();
        AnalyticsManager analyticsManager = productMessageBottomSheetViewModel.e;
        Screen screen = productMessageBottomSheetViewModel.g;
        if (screen != null) {
            analyticsManager.c(new ProductMessageBottomSheetActions.BottomSheetDismiss(screen));
        } else {
            Intrinsics.p("hostScreen");
            throw null;
        }
    }
}
