package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt;
import au.com.woolworths.feature.product.list.legacy.compose.CoachMarkPopupDirection;
import au.com.woolworths.feature.product.list.legacy.compose.FilterChipCoachMarkKt;
import au.com.woolworths.feature.product.list.legacy.compose.FilterChipGroupKt;
import au.com.woolworths.feature.product.list.legacy.compose.errorscreen.ProductListZeroResultsViewKt;
import au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.VoiceProductSearchEntryIconKt;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListInsetBannerLegacyBinding;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBinding;
import au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState;
import au.com.woolworths.feature.product.list.legacy.ui.ProductSlideInItemAnimator;
import au.com.woolworths.feature.product.list.legacy.ui.ProductsWithFullWidthItemsDecoration;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pagingutils.KeyedPageData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageData;
import au.com.woolworths.pagingutils.Status;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "Landroid/view/View$OnFocusChangeListener;", "<init>", "()V", "ProductListFragmentCaller", "Extras", "Companion", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ViewState;", "viewState", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListFragment extends Hilt_ProductListFragment implements AddToListBottomSheetFragment.BottomSheetHost, View.OnFocusChangeListener {
    public FragmentProductListLegacyBinding i;
    public AnalyticsManager j;
    public FeatureToggleManager k;
    public CollectionModeInteractor l;
    public ShopAppNavigator m;
    public ProductListInteractor n;
    public CartUpdateInteractor o;
    public ProductListController p;
    public final ViewModelLazy q;
    public final ViewModelLazy r;
    public final Lazy s;
    public final Lazy t;
    public final LinkedHashSet u;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final ProductListFragment$bottomsheetLifecycleCallbacks$1 y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListFragment$Companion;", "", "", "SEARCH_CATEGORY_PRODUCTS", "Ljava/lang/String;", "", "PAGE_START", "I", "PARAM_CURRENT_PAGE", "PAGE_SEARCH_ZERO_RESULTS", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ProductListFragment a(Extras extras) {
            ProductListFragment productListFragment = new ProductListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PRODUCT_LIST_INFO", extras);
            productListFragment.setArguments(bundle);
            return productListFragment;
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListFragment$Extras;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final Activities.ProductList.Extras d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras((Activities.ProductList.Extras) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(Activities.ProductList.Extras activityExtra) {
            Intrinsics.h(activityExtra, "activityExtra");
            this.d = activityExtra;
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
            return "Extras(activityExtra=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListFragment$ProductListFragmentCaller;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ProductListFragmentCaller {
        void r();
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductList.ProductListType.values().length];
            try {
                iArr[Activities.ProductList.ProductListType.p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.C.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.D.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.E.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.F.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.G.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.x.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Activities.ProductList.ProductListType.I.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListFragment$onViewCreated$2", f = "ProductListFragment.kt", l = {276}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListFragment$onViewCreated$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListFragment$onViewCreated$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) obj;
                ProductListFragment productListFragment = (ProductListFragment) this.d;
                productListFragment.getClass();
                if (actions instanceof ProductListOptionsContract.Actions.ShowMessage) {
                    ResText resText = ((ProductListOptionsContract.Actions.ShowMessage) actions).f5333a;
                    Context contextRequireContext = productListFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    productListFragment.I2(resText.getText(contextRequireContext).toString(), null, null);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListFragment.this.new AnonymousClass2(continuation);
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
                ProductListFragment productListFragment = ProductListFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productListFragment, ProductListFragment.class, "handleProductListOptionsActions", "handleProductListOptionsActions(Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$Actions;)V", 4), FlowExtKt.a(productListFragment.b2().n, productListFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    /* JADX WARN: Type inference failed for: r0v13, types: [au.com.woolworths.feature.product.list.legacy.ProductListFragment$bottomsheetLifecycleCallbacks$1] */
    public ProductListFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.q = new ViewModelLazy(reflectionFactory.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.r = new ViewModelLazy(reflectionFactory.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        final int i = 0;
        this.s = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.s
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Bundle arguments = this.e.getArguments();
                        ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                        ProductListFragment.Extras extras2 = extras != null ? extras : null;
                        if (extras2 != null) {
                            return extras2;
                        }
                        throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
                    case 1:
                        return Boolean.valueOf(this.e.R1().d.e.getE().g == Activities.ProductList.ToolbarType.d);
                    case 2:
                        Drawable drawable = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable);
                        return new ProductsWithFullWidthItemsDecoration(drawable, 1, 2);
                    case 3:
                        Drawable drawable2 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable2);
                        return new ProductsWithFullWidthItemsDecoration(drawable2, 1);
                    default:
                        Drawable drawable3 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_vertical_divider_deprecated);
                        Intrinsics.e(drawable3);
                        return new ProductsWithFullWidthItemsDecoration(drawable3, 0);
                }
            }
        });
        final int i2 = 1;
        this.t = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.s
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Bundle arguments = this.e.getArguments();
                        ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                        ProductListFragment.Extras extras2 = extras != null ? extras : null;
                        if (extras2 != null) {
                            return extras2;
                        }
                        throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
                    case 1:
                        return Boolean.valueOf(this.e.R1().d.e.getE().g == Activities.ProductList.ToolbarType.d);
                    case 2:
                        Drawable drawable = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable);
                        return new ProductsWithFullWidthItemsDecoration(drawable, 1, 2);
                    case 3:
                        Drawable drawable2 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable2);
                        return new ProductsWithFullWidthItemsDecoration(drawable2, 1);
                    default:
                        Drawable drawable3 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_vertical_divider_deprecated);
                        Intrinsics.e(drawable3);
                        return new ProductsWithFullWidthItemsDecoration(drawable3, 0);
                }
            }
        });
        this.u = new LinkedHashSet();
        final int i3 = 2;
        this.v = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.s
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        Bundle arguments = this.e.getArguments();
                        ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                        ProductListFragment.Extras extras2 = extras != null ? extras : null;
                        if (extras2 != null) {
                            return extras2;
                        }
                        throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
                    case 1:
                        return Boolean.valueOf(this.e.R1().d.e.getE().g == Activities.ProductList.ToolbarType.d);
                    case 2:
                        Drawable drawable = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable);
                        return new ProductsWithFullWidthItemsDecoration(drawable, 1, 2);
                    case 3:
                        Drawable drawable2 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable2);
                        return new ProductsWithFullWidthItemsDecoration(drawable2, 1);
                    default:
                        Drawable drawable3 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_vertical_divider_deprecated);
                        Intrinsics.e(drawable3);
                        return new ProductsWithFullWidthItemsDecoration(drawable3, 0);
                }
            }
        });
        final int i4 = 3;
        this.w = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.s
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        Bundle arguments = this.e.getArguments();
                        ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                        ProductListFragment.Extras extras2 = extras != null ? extras : null;
                        if (extras2 != null) {
                            return extras2;
                        }
                        throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
                    case 1:
                        return Boolean.valueOf(this.e.R1().d.e.getE().g == Activities.ProductList.ToolbarType.d);
                    case 2:
                        Drawable drawable = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable);
                        return new ProductsWithFullWidthItemsDecoration(drawable, 1, 2);
                    case 3:
                        Drawable drawable2 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable2);
                        return new ProductsWithFullWidthItemsDecoration(drawable2, 1);
                    default:
                        Drawable drawable3 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_vertical_divider_deprecated);
                        Intrinsics.e(drawable3);
                        return new ProductsWithFullWidthItemsDecoration(drawable3, 0);
                }
            }
        });
        final int i5 = 4;
        this.x = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.product.list.legacy.s
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        Bundle arguments = this.e.getArguments();
                        ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                        ProductListFragment.Extras extras2 = extras != null ? extras : null;
                        if (extras2 != null) {
                            return extras2;
                        }
                        throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
                    case 1:
                        return Boolean.valueOf(this.e.R1().d.e.getE().g == Activities.ProductList.ToolbarType.d);
                    case 2:
                        Drawable drawable = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable);
                        return new ProductsWithFullWidthItemsDecoration(drawable, 1, 2);
                    case 3:
                        Drawable drawable2 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_horizontal_divider_deprecated);
                        Intrinsics.e(drawable2);
                        return new ProductsWithFullWidthItemsDecoration(drawable2, 1);
                    default:
                        Drawable drawable3 = this.e.requireContext().getDrawable(com.woolworths.R.drawable.default_vertical_divider_deprecated);
                        Intrinsics.e(drawable3);
                        return new ProductsWithFullWidthItemsDecoration(drawable3, 0);
                }
            }
        });
        this.y = new FragmentManager.FragmentLifecycleCallbacks() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$bottomsheetLifecycleCallbacks$1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void a(FragmentManager fragmentManager, Fragment f, FragmentActivity context) {
                Intrinsics.h(f, "f");
                Intrinsics.h(context, "context");
                ProductListFragment productListFragment = this.f5326a;
                productListFragment.u.clear();
                productListFragment.h2().G6(true);
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void b(FragmentManager fragmentManager, Fragment f) {
                KeyedPageData keyedPageData;
                Intrinsics.h(f, "f");
                ProductListFragment productListFragment = this.f5326a;
                productListFragment.h2().G6(false);
                if (!(f instanceof BottomSheetDialogFragment) || (f instanceof AddToCartBottomSheetFragment) || (keyedPageData = (KeyedPageData) productListFragment.h2().E.getValue()) == null) {
                    return;
                }
                productListFragment.q2(keyedPageData);
            }
        };
    }

    public static boolean I1(ProductListFragment productListFragment, MenuItem menuItem) {
        if (menuItem.getItemId() != com.woolworths.R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        }
        ProductListViewModel productListViewModelH2 = productListFragment.h2();
        productListViewModelH2.g.j(ProductListActions.SearchIconClick.e, productListViewModelH2.x6());
        productListViewModelH2.v.f(new ProductListContract.Actions.LaunchProductSearch(productListViewModelH2.B6(), productListViewModelH2.D6()));
        return true;
    }

    public static TrackingMetadata p2(ProductCard productCard) {
        Double inTrolley;
        ProductTrolleyData trolley = productCard.getTrolley();
        return ProductAnalyticsExtKt.h(productCard, (trolley == null || (inTrolley = trolley.getInTrolley()) == null) ? null : Float.valueOf((float) inTrolley.doubleValue()), null, 6);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(h2());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
            if (fragmentProductListLegacyBinding == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            View view = fragmentProductListLegacyBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            ListChangeEventKt.a(addToListSuccessEvent, contextRequireContext, view, false, 28);
            h2().H6(addToListSuccessEvent.h);
        }
    }

    public final void I2(CharSequence charSequence, String str, au.com.woolworths.android.onesite.deeplink.h hVar) {
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
        if (fragmentProductListLegacyBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        Snackbar snackbarJ = Snackbar.j(null, fragmentProductListLegacyBinding.D, charSequence, 0);
        if (hVar != null && str != null) {
            snackbarJ.k(str, new m(hVar, 0));
        }
        snackbarJ.l();
    }

    public final AnalyticsManager Q1() {
        AnalyticsManager analyticsManager = this.j;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final Extras R1() {
        return (Extras) this.s.getD();
    }

    public final ProductListOptionsViewModel b2() {
        return (ProductListOptionsViewModel) this.r.getD();
    }

    public final ProductListViewModel h2() {
        return (ProductListViewModel) this.q.getD();
    }

    public final SearchView i2() {
        if (h2().s6()) {
            FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
            if (fragmentProductListLegacyBinding == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            SearchView searchView = fragmentProductListLegacyBinding.E.z;
            Intrinsics.e(searchView);
            return searchView;
        }
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding2 = this.i;
        if (fragmentProductListLegacyBinding2 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        SearchView searchView2 = fragmentProductListLegacyBinding2.F.z;
        Intrinsics.e(searchView2);
        return searchView2;
    }

    public final boolean m2() {
        CartUpdateInteractor cartUpdateInteractor = this.o;
        if (cartUpdateInteractor != null) {
            return cartUpdateInteractor.b.z() && R1().d.e.getE().i;
        }
        Intrinsics.p("cartUpdateInteractor");
        throw null;
    }

    public final Toolbar n2() {
        if (h2().s6()) {
            FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
            if (fragmentProductListLegacyBinding == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            Toolbar toolbar = fragmentProductListLegacyBinding.E.A;
            Intrinsics.e(toolbar);
            return toolbar;
        }
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding2 = this.i;
        if (fragmentProductListLegacyBinding2 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        Toolbar toolbar2 = fragmentProductListLegacyBinding2.F.A;
        Intrinsics.e(toolbar2);
        return toolbar2;
    }

    public final String o2() {
        return h2().w6().d.d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (R1().d.e instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            getParentFragmentManager().o0(this, new androidx.fragment.app.h(new d(this)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding = (FragmentProductListLegacyBinding) DataBindingUtil.c(inflater, com.woolworths.R.layout.fragment_product_list_legacy, viewGroup, false, null);
        this.i = fragmentProductListLegacyBinding;
        if (fragmentProductListLegacyBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        View view = fragmentProductListLegacyBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getParentFragmentManager().u0(this.y);
        super.onDestroyView();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View searchView, boolean z) {
        Intrinsics.h(searchView, "searchView");
        if (z) {
            ProductListViewModel productListViewModelH2 = h2();
            String searchTerm = ((SearchView) searchView).getQuery().toString();
            AnalyticsManager analyticsManager = productListViewModelH2.g;
            Intrinsics.h(searchTerm, "searchTerm");
            if (searchTerm.length() == 0) {
                analyticsManager.j(ProductListActions.DeleteSearchQuery.e, productListViewModelH2.x6());
            } else {
                analyticsManager.j(ProductListActions.UpdateSearchQuery.e, productListViewModelH2.x6());
            }
            productListViewModelH2.v.f(new ProductListContract.Actions.LaunchProductSearch(productListViewModelH2.B6(), searchTerm));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.u.clear();
        h2().G6(true);
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        String str;
        super.onResume();
        TrackingMetadata trackingMetadataX6 = h2().x6();
        KeyedPageData keyedPageData = (KeyedPageData) h2().E.getValue();
        if (keyedPageData != null) {
            q2(keyedPageData);
            List items = keyedPageData.b.getC();
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof ProductCard) {
                    arrayList.add(obj);
                }
            }
            trackingMetadataX6.a(ProductAnalyticsExtKt.f(arrayList));
        }
        if (h2().A6() == Activities.ProductList.ProductListType.D) {
            trackingMetadataX6.b(TrackableValue.J2, o2());
            trackingMetadataX6.b(TrackableValue.G2, "products");
        }
        Q1().e(ProductListScreens.e, trackingMetadataX6);
        ProductListViewModel productListViewModelH2 = h2();
        MediatorLiveData mediatorLiveData = productListViewModelH2.F;
        Activities.ProductList.Extras extras = R1().d;
        Intrinsics.h(extras, "extras");
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if ((viewState != null ? viewState.h : null) == null || !productListViewModelH2.M) {
            z = false;
        } else {
            z = false;
            ProductListViewModel.V6(productListViewModelH2, mediatorLiveData, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 2097023);
            ProductListViewModel.t6(productListViewModelH2, extras, null, null, extras.f.d, null, false, null, 118);
            productListViewModelH2.M = false;
        }
        i2().clearFocus();
        ProductListViewModel productListViewModelH22 = h2();
        MediatorLiveData mediatorLiveData2 = productListViewModelH22.F;
        String str2 = productListViewModelH22.w6().d.d;
        if (str2.length() == 0) {
            ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mediatorLiveData2.e();
            str = viewState2 != null ? viewState2.p : null;
        } else {
            str = str2;
        }
        ProductListViewModel.V6(productListViewModelH22, mediatorLiveData2, 0, null, 0, false, null, null, null, null, null, str, null, null, null, null, null, 2080767);
        h2().G6(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        ProductListViewModel productListViewModelH2 = h2();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new ProductListFragment$onViewCreated$1$1(productListViewModelH2, this, null), 3);
        productListViewModelH2.Q6(R1().d);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new AnonymousClass2(null), 3);
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
        if (fragmentProductListLegacyBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = fragmentProductListLegacyBinding.D;
        fragmentProductListLegacyBinding.D(getViewLifecycleOwner());
        fragmentProductListLegacyBinding.M(h2());
        fragmentProductListLegacyBinding.L(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(o2());
        }
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        epoxyRecyclerView.setLayoutManager(new ProductListLayoutManager(contextRequireContext));
        ViewExtKt.a(epoxyRecyclerView);
        ProductListViewModel productListViewModelH22 = h2();
        if ((!productListViewModelH22.S6() && productListViewModelH22.A6().g != Activities.ProductList.ToolbarType.e) || h2().s6()) {
            if (((Boolean) this.t.getD()).booleanValue()) {
                n2().n(com.woolworths.R.menu.menu_cart_only);
                i2().s(o2(), false);
            } else {
                n2().n(com.woolworths.R.menu.menu_cart_and_search);
                n2().setTitle(o2());
                if (h2().s6()) {
                    FragmentProductListLegacyBinding fragmentProductListLegacyBinding2 = this.i;
                    if (fragmentProductListLegacyBinding2 == null) {
                        Intrinsics.p("fragmentProductListBinding");
                        throw null;
                    }
                    view2 = fragmentProductListLegacyBinding2.E.y;
                    Intrinsics.e(view2);
                } else {
                    FragmentProductListLegacyBinding fragmentProductListLegacyBinding3 = this.i;
                    if (fragmentProductListLegacyBinding3 == null) {
                        Intrinsics.p("fragmentProductListBinding");
                        throw null;
                    }
                    view2 = fragmentProductListLegacyBinding3.F.y;
                    Intrinsics.e(view2);
                }
                view2.setVisibility(8);
            }
            MenuItem menuItemFindItem = n2().getMenu().findItem(com.woolworths.R.id.cart_item);
            menuItemFindItem.setVisible(m2());
            View actionView = menuItemFindItem.getActionView();
            CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
            if (cartBadgeActionView != null) {
                cartBadgeActionView.setAnalyticsScreen(ProductListScreens.e);
            }
        }
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding4 = this.i;
        if (fragmentProductListLegacyBinding4 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        ComposeView composeView = fragmentProductListLegacyBinding4.C.y;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadComposeUi$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListFragment productListFragment = this.d;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.h2().F, composer);
                    final MutableState mutableStateA2 = LiveDataAdapterKt.a(productListFragment.h2().C, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(588762773, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadComposeUi$1$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProvidedValue providedValueB = InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE);
                                final ProductListFragment productListFragment2 = productListFragment;
                                final State state = mutableStateA;
                                final State state2 = mutableStateA2;
                                CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(-304839851, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment.loadComposeUi.1.1.1.1.1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List] */
                                    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        ProductListContract.CoachMark coachMark;
                                        ?? r3;
                                        ?? r1;
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                            int p = composer3.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                            Modifier modifierD = ComposedModifierKt.d(composer3, Modifier.Companion.d);
                                            ComposeUiNode.e3.getClass();
                                            Function0 function0 = ComposeUiNode.Companion.b;
                                            String str = null;
                                            if (composer3.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer3.i();
                                            if (composer3.getO()) {
                                                composer3.K(function0);
                                            } else {
                                                composer3.e();
                                            }
                                            Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                            Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                            Function2 function2 = ComposeUiNode.Companion.j;
                                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                            }
                                            Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                            composer3.o(1107239721);
                                            State state3 = state;
                                            ProductListContract.ViewState viewState = (ProductListContract.ViewState) state3.getD();
                                            List list = viewState != null ? viewState.n : null;
                                            EmptyList emptyList = EmptyList.d;
                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                            State state4 = state2;
                                            ProductListFragment productListFragment3 = productListFragment2;
                                            if (list != null && !list.isEmpty()) {
                                                NetworkState networkState = (NetworkState) state4.getD();
                                                boolean z = (networkState != null ? networkState.f9174a : null) != Status.d;
                                                ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) state3.getD();
                                                EmptyList emptyList2 = (viewState2 == null || (r1 = viewState2.n) == 0) ? emptyList : r1;
                                                ProductListViewModel productListViewModelH23 = productListFragment3.h2();
                                                composer3.o(5004770);
                                                boolean zI = composer3.I(productListViewModelH23);
                                                Object objG = composer3.G();
                                                if (zI || objG == composer$Companion$Empty$1) {
                                                    objG = new ProductListFragment$loadComposeUi$1$1$1$1$1$1$1$1(1, productListViewModelH23, ProductListViewModel.class, "onFacetsChipClicked", "onFacetsChipClicked(Lau/com/woolworths/feature/product/list/legacy/data/ProductListChip;)V", 0);
                                                    composer3.A(objG);
                                                }
                                                composer3.l();
                                                Function1 function1 = (Function1) ((KFunction) objG);
                                                ProductListViewModel productListViewModelH24 = productListFragment3.h2();
                                                composer3.o(5004770);
                                                boolean zI2 = composer3.I(productListViewModelH24);
                                                Object objG2 = composer3.G();
                                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                                    objG2 = new ProductListFragment$loadComposeUi$1$1$1$1$1$1$2$1(0, productListViewModelH24, ProductListViewModel.class, "onFacetScroll", "onFacetScroll()V", 0);
                                                    composer3.A(objG2);
                                                }
                                                composer3.l();
                                                FacetsChipGroupKt.a(0, composer3, emptyList2, (Function0) ((KFunction) objG2), function1, z);
                                                SpacerKt.c(ColumnScopeInstance.f948a, 8, composer3, 54);
                                            }
                                            composer3.l();
                                            NetworkState networkState2 = (NetworkState) state4.getD();
                                            boolean z2 = (networkState2 != null ? networkState2.f9174a : null) != Status.d;
                                            ProductListContract.ViewState viewState3 = (ProductListContract.ViewState) state3.getD();
                                            if (viewState3 != null && (r3 = viewState3.m) != 0) {
                                                emptyList = r3;
                                            }
                                            ProductListContract.ViewState viewState4 = (ProductListContract.ViewState) state3.getD();
                                            int i = viewState4 != null ? viewState4.d : 0;
                                            ProductListContract.ViewState viewState5 = (ProductListContract.ViewState) state3.getD();
                                            boolean z3 = viewState5 != null && viewState5.e;
                                            ProductListViewModel productListViewModelH25 = productListFragment3.h2();
                                            composer3.o(5004770);
                                            boolean zI3 = composer3.I(productListViewModelH25);
                                            Object objG3 = composer3.G();
                                            if (zI3 || objG3 == composer$Companion$Empty$1) {
                                                objG3 = new ProductListFragment$loadComposeUi$1$1$1$1$1$1$3$1(0, productListViewModelH25, ProductListViewModel.class, "onFilterClicked", "onFilterClicked()V", 0);
                                                composer3.A(objG3);
                                            }
                                            KFunction kFunction = (KFunction) objG3;
                                            composer3.l();
                                            ProductListViewModel productListViewModelH26 = productListFragment3.h2();
                                            composer3.o(5004770);
                                            boolean zI4 = composer3.I(productListViewModelH26);
                                            Object objG4 = composer3.G();
                                            if (zI4 || objG4 == composer$Companion$Empty$1) {
                                                objG4 = new ProductListFragment$loadComposeUi$1$1$1$1$1$1$4$1(3, productListViewModelH26, ProductListViewModel.class, "onApiFilterClicked", "onApiFilterClicked(Ljava/lang/String;Ljava/lang/String;Z)V", 0);
                                                composer3.A(objG4);
                                            }
                                            KFunction kFunction2 = (KFunction) objG4;
                                            composer3.l();
                                            ProductListContract.ViewState viewState6 = (ProductListContract.ViewState) state3.getD();
                                            if (viewState6 != null && (coachMark = viewState6.l) != null) {
                                                str = coachMark.f5315a;
                                            }
                                            ProductListViewModel productListViewModelH27 = productListFragment3.h2();
                                            composer3.o(5004770);
                                            boolean zI5 = composer3.I(productListViewModelH27);
                                            Object objG5 = composer3.G();
                                            if (zI5 || objG5 == composer$Companion$Empty$1) {
                                                objG5 = new ProductListFragment$loadComposeUi$1$1$1$1$1$1$5$1(1, productListViewModelH27, ProductListViewModel.class, "onUpdateCoachMarkSpotLight", "onUpdateCoachMarkSpotLight(Landroidx/compose/ui/geometry/Rect;)V", 0);
                                                composer3.A(objG5);
                                            }
                                            composer3.l();
                                            FilterChipGroupKt.a(z2, emptyList, (Function0) kFunction, (Function3) kFunction2, i, z3, str, (Function1) ((KFunction) objG5), composer3, 0);
                                            composer3.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 56);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 270817245));
        ComposeView composeView2 = fragmentProductListLegacyBinding4.z;
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView2.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadComposeUi$1$2$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListFragment productListFragment = this.d;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.h2().F, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1083642764, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadComposeUi$1$2$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                                final ProductListContract.CoachMark coachMark = viewState != null ? viewState.l : null;
                                if (coachMark != null) {
                                    Rect rect = coachMark.e;
                                    CoachMarkPopupDirection[] coachMarkPopupDirectionArr = CoachMarkPopupDirection.d;
                                    float f = 20;
                                    composer2.o(-1633490746);
                                    final ProductListFragment productListFragment2 = productListFragment;
                                    boolean zI = composer2.I(productListFragment2) | composer2.I(coachMark);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new t(productListFragment2, coachMark, 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    CoachMarkKt.a(rect, (Function0) objG, f, BitmapDescriptorFactory.HUE_RED, true, ComposableLambdaKt.c(1998348356, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadComposeUi$1$2$1$1$1$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer3 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                ProductListContract.CoachMark coachMark2 = coachMark;
                                                ResText resText = coachMark2.b;
                                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.b;
                                                String string = resText.getText((Context) composer3.x(staticProvidableCompositionLocal)).toString();
                                                String string2 = coachMark2.c.getText((Context) composer3.x(staticProvidableCompositionLocal)).toString();
                                                composer3.o(-1633490746);
                                                ProductListFragment productListFragment3 = productListFragment2;
                                                boolean zI2 = composer3.I(productListFragment3) | composer3.I(coachMark2);
                                                Object objG2 = composer3.G();
                                                if (zI2 || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new t(productListFragment3, coachMark2, 1);
                                                    composer3.A(objG2);
                                                }
                                                composer3.l();
                                                FilterChipCoachMarkKt.a(string, string2, (Function0) objG2, composer3, 0);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 1772592);
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 480668372));
        if (h2().s6()) {
            FragmentProductListLegacyBinding fragmentProductListLegacyBinding5 = this.i;
            if (fragmentProductListLegacyBinding5 == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            ComposeView composeView3 = fragmentProductListLegacyBinding5.E.B;
            int i = m2() ? com.woolworths.R.dimen.no_padding : com.woolworths.R.dimen.default_padding;
            Intrinsics.e(composeView3);
            composeView3.setPadding(composeView3.getPaddingLeft(), composeView3.getPaddingTop(), composeView3.getContext().getResources().getDimensionPixelSize(i), composeView3.getPaddingBottom());
            composeView3.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadVpsComposeUi$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductListFragment productListFragment = this.d;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-530315176, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadVpsComposeUi$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductListFragment productListFragment2 = productListFragment;
                                    FragmentProductListLegacyBinding fragmentProductListLegacyBinding6 = productListFragment2.i;
                                    if (fragmentProductListLegacyBinding6 == null) {
                                        Intrinsics.p("fragmentProductListBinding");
                                        throw null;
                                    }
                                    fragmentProductListLegacyBinding6.E.y.postInvalidate();
                                    Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 28);
                                    ProductListViewModel productListViewModelH23 = productListFragment2.h2();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(productListViewModelH23);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new ProductListFragment$loadVpsComposeUi$1$1$1$1$1(0, productListViewModelH23, ProductListViewModel.class, "onVoiceProductSearchClicked", "onVoiceProductSearchClicked$product_list_legacy_release()V", 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    VoiceProductSearchEntryIconKt.a(48, 0, composer2, modifierQ, (Function0) ((KFunction) objG));
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 2096370484));
            if (h2().S6()) {
                composeView3.setVisibility(0);
            }
        }
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding6 = this.i;
        if (fragmentProductListLegacyBinding6 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        fragmentProductListLegacyBinding6.G.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadZeroResultComposeUi$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListFragment productListFragment = this.d;
                    MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.h2().F, composer);
                    ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                    final ZeroResultPageData zeroResultPageData = viewState != null ? viewState.s : null;
                    ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mutableStateA.getD();
                    final ProductListZeroResults productListZeroResults = viewState2 != null ? viewState2.t : null;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2080738718, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$loadZeroResultComposeUi$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductListFragment productListFragment2 = productListFragment;
                                CollectionModeInteractor collectionModeInteractor = productListFragment2.l;
                                if (collectionModeInteractor == null) {
                                    Intrinsics.p("collectionModeInteractor");
                                    throw null;
                                }
                                boolean zB = collectionModeInteractor.b();
                                ProductListViewModel productListViewModelH23 = productListFragment2.h2();
                                ProductListViewModel productListViewModelH24 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI = composer2.I(productListViewModelH24);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$1$1 productListFragment$loadZeroResultComposeUi$1$1$1$1$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$1$1(1, productListViewModelH24, ProductListViewModel.class, "onProductCategoryTileClick", "onProductCategoryTileClick(Lau/com/woolworths/shop/aem/components/model/productcategorytile/ProductCategoryTileData;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$1$1);
                                    objG = productListFragment$loadZeroResultComposeUi$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                ProductListViewModel productListViewModelH25 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(productListViewModelH25);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$2$1 productListFragment$loadZeroResultComposeUi$1$1$1$2$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$2$1(1, productListViewModelH25, ProductListViewModel.class, "onBrowseAllAislesClick", "onBrowseAllAislesClick(Ljava/lang/String;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$2$1);
                                    objG2 = productListFragment$loadZeroResultComposeUi$1$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                ProductListViewModel productListViewModelH26 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(productListViewModelH26);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$3$1 productListFragment$loadZeroResultComposeUi$1$1$1$3$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$3$1(0, productListViewModelH26, ProductListViewModel.class, "onZeroResultVisibleImpression", "onZeroResultVisibleImpression()V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$3$1);
                                    objG3 = productListFragment$loadZeroResultComposeUi$1$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                ProductListViewModel productListViewModelH27 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(productListViewModelH27);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$4$1 productListFragment$loadZeroResultComposeUi$1$1$1$4$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$4$1(1, productListViewModelH27, ProductListViewModel.class, "onZeroResultHorizontalListVisibleImpression", "onZeroResultHorizontalListVisibleImpression(Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$4$1);
                                    objG4 = productListFragment$loadZeroResultComposeUi$1$1$1$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                ProductListViewModel productListViewModelH28 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(productListViewModelH28);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1 productListFragment$loadZeroResultComposeUi$1$1$1$5$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1(2, productListViewModelH28, ProductListViewModel.class, "onClearFiltersClick", "onClearFiltersClick(Lau/com/woolworths/sdui/model/action/ActionData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$5$1);
                                    objG5 = productListFragment$loadZeroResultComposeUi$1$1$1$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                ProductListViewModel productListViewModelH29 = productListFragment2.h2();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(productListViewModelH29);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$6$1 productListFragment$loadZeroResultComposeUi$1$1$1$6$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$6$1(1, productListViewModelH29, ProductListViewModel.class, "onChatEntryBannerClicked", "onChatEntryBannerClicked(Ljava/lang/String;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$6$1);
                                    objG6 = productListFragment$loadZeroResultComposeUi$1$1$1$6$1;
                                }
                                KFunction kFunction6 = (KFunction) objG6;
                                composer2.l();
                                FeatureToggleManager featureToggleManager = productListFragment2.k;
                                if (featureToggleManager == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                boolean zC = featureToggleManager.c(ProductFeature.d);
                                ProductListZeroResultsViewKt.a(productListZeroResults, zeroResultPageData, zB, productListViewModelH23, (Function1) kFunction2, (Function1) kFunction, (Function0) kFunction3, (Function1) kFunction4, (Function2) kFunction5, (Function1) kFunction6, zC, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1494770498));
        FeatureToggleManager featureToggleManager = this.k;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.M)) {
            final FragmentProductListLegacyBinding fragmentProductListLegacyBinding7 = this.i;
            if (fragmentProductListLegacyBinding7 == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            fragmentProductListLegacyBinding7.C.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.product.list.legacy.o
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.d.h2().P = fragmentProductListLegacyBinding7.C.h.getHeight();
                }
            });
        }
        boolean z = !(R1().d.e instanceof Activities.ProductList.ExtrasBySearchAlternative);
        ProductListViewModel productListViewModelH23 = h2();
        ProductListOptionsViewModel productListOptionsViewModelB2 = b2();
        FeatureToggleManager featureToggleManager2 = this.k;
        if (featureToggleManager2 == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        CollectionModeInteractor collectionModeInteractor = this.l;
        if (collectionModeInteractor == null) {
            Intrinsics.p("collectionModeInteractor");
            throw null;
        }
        ProductListController productListController = new ProductListController(productListViewModelH23, productListOptionsViewModelB2, featureToggleManager2, collectionModeInteractor.b(), z);
        this.p = productListController;
        productListController.getAdapter().D(new RecyclerView.AdapterDataObserver() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$setupEpoxyController$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void d(int i2, int i3) {
                if (i2 == 0) {
                    ProductListFragment productListFragment = this.f5327a;
                    FragmentProductListLegacyBinding fragmentProductListLegacyBinding8 = productListFragment.i;
                    if (fragmentProductListLegacyBinding8 == null) {
                        Intrinsics.p("fragmentProductListBinding");
                        throw null;
                    }
                    if (fragmentProductListLegacyBinding8.D.computeVerticalScrollOffset() == 0 && productListFragment.R1().d.e.getE().f) {
                        FragmentProductListLegacyBinding fragmentProductListLegacyBinding9 = productListFragment.i;
                        if (fragmentProductListLegacyBinding9 != null) {
                            fragmentProductListLegacyBinding9.D.o0(0);
                        } else {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                    }
                }
            }
        });
        ProductListViewModel productListViewModelH24 = h2();
        final int i2 = 0;
        productListViewModelH24.A.f(getViewLifecycleOwner(), new ProductListFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.product.list.legacy.n
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NumericPageListing numericPageListing;
                int i3 = i2;
                Unit unit = Unit.f24250a;
                ProductListFragment productListFragment = this.e;
                switch (i3) {
                    case 0:
                        ProductListViewModel.ProductListingEvent productListingEvent = (ProductListViewModel.ProductListingEvent) obj;
                        if (productListingEvent.b) {
                            numericPageListing = null;
                        } else {
                            productListingEvent.b = true;
                            numericPageListing = productListingEvent.f5338a;
                        }
                        if (numericPageListing != null) {
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding8 = productListFragment.i;
                            if (fragmentProductListLegacyBinding8 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            fragmentProductListLegacyBinding8.D.o0(0);
                            productListFragment.u.clear();
                        }
                        return unit;
                    case 1:
                        NetworkState networkState = (NetworkState) obj;
                        FragmentProductListLegacyBinding fragmentProductListLegacyBinding9 = productListFragment.i;
                        if (fragmentProductListLegacyBinding9 == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        RecyclerView.LayoutManager layoutManager = fragmentProductListLegacyBinding9.D.getLayoutManager();
                        Intrinsics.f(layoutManager, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                        ((ProductListLayoutManager) layoutManager).Q = !Intrinsics.c(networkState, NetworkState.e);
                        return unit;
                    case 2:
                        NetworkState networkState2 = (NetworkState) obj;
                        ProductListController productListController2 = productListFragment.p;
                        if (productListController2 != null) {
                            productListController2.setNetworkState(networkState2);
                            return unit;
                        }
                        Intrinsics.p("productListController");
                        throw null;
                    default:
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) obj;
                        String strO2 = productListFragment.o2();
                        if (strO2.length() == 0) {
                            strO2 = viewState.p;
                        }
                        if (((Boolean) productListFragment.t.getD()).booleanValue()) {
                            productListFragment.i2().s(strO2, false);
                        } else {
                            productListFragment.n2().setTitle(strO2);
                        }
                        ProductListErrorState productListErrorState = viewState.c;
                        if ((productListErrorState instanceof ProductListErrorState.ProductListNoResultsState) || (productListErrorState instanceof ProductListErrorState.ProductListEmptyState)) {
                            List<InsetBannerData> list = viewState.f;
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding10 = productListFragment.i;
                            if (fragmentProductListLegacyBinding10 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            LinearLayout linearLayout = fragmentProductListLegacyBinding10.B;
                            linearLayout.removeAllViews();
                            for (InsetBannerData insetBannerData : list) {
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
                                int i4 = EpoxyItemProductListInsetBannerLegacyBinding.C;
                                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                                EpoxyItemProductListInsetBannerLegacyBinding epoxyItemProductListInsetBannerLegacyBinding = (EpoxyItemProductListInsetBannerLegacyBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, linearLayout, true, null);
                                epoxyItemProductListInsetBannerLegacyBinding.L(insetBannerData);
                                epoxyItemProductListInsetBannerLegacyBinding.M(Integer.valueOf(com.woolworths.R.dimen.no_margin));
                                epoxyItemProductListInsetBannerLegacyBinding.l();
                            }
                        }
                        return unit;
                }
            }
        }));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner3), null, null, new ProductListFragment$initializeViewStateObservable$1$2(productListViewModelH24, this, null), 3);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner4), null, null, new ProductListFragment$initializeViewStateObservable$1$3(productListViewModelH24, this, null), 3);
        final int i3 = 1;
        productListViewModelH24.C.f(getViewLifecycleOwner(), new ProductListFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.product.list.legacy.n
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NumericPageListing numericPageListing;
                int i32 = i3;
                Unit unit = Unit.f24250a;
                ProductListFragment productListFragment = this.e;
                switch (i32) {
                    case 0:
                        ProductListViewModel.ProductListingEvent productListingEvent = (ProductListViewModel.ProductListingEvent) obj;
                        if (productListingEvent.b) {
                            numericPageListing = null;
                        } else {
                            productListingEvent.b = true;
                            numericPageListing = productListingEvent.f5338a;
                        }
                        if (numericPageListing != null) {
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding8 = productListFragment.i;
                            if (fragmentProductListLegacyBinding8 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            fragmentProductListLegacyBinding8.D.o0(0);
                            productListFragment.u.clear();
                        }
                        return unit;
                    case 1:
                        NetworkState networkState = (NetworkState) obj;
                        FragmentProductListLegacyBinding fragmentProductListLegacyBinding9 = productListFragment.i;
                        if (fragmentProductListLegacyBinding9 == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        RecyclerView.LayoutManager layoutManager = fragmentProductListLegacyBinding9.D.getLayoutManager();
                        Intrinsics.f(layoutManager, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                        ((ProductListLayoutManager) layoutManager).Q = !Intrinsics.c(networkState, NetworkState.e);
                        return unit;
                    case 2:
                        NetworkState networkState2 = (NetworkState) obj;
                        ProductListController productListController2 = productListFragment.p;
                        if (productListController2 != null) {
                            productListController2.setNetworkState(networkState2);
                            return unit;
                        }
                        Intrinsics.p("productListController");
                        throw null;
                    default:
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) obj;
                        String strO2 = productListFragment.o2();
                        if (strO2.length() == 0) {
                            strO2 = viewState.p;
                        }
                        if (((Boolean) productListFragment.t.getD()).booleanValue()) {
                            productListFragment.i2().s(strO2, false);
                        } else {
                            productListFragment.n2().setTitle(strO2);
                        }
                        ProductListErrorState productListErrorState = viewState.c;
                        if ((productListErrorState instanceof ProductListErrorState.ProductListNoResultsState) || (productListErrorState instanceof ProductListErrorState.ProductListEmptyState)) {
                            List<InsetBannerData> list = viewState.f;
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding10 = productListFragment.i;
                            if (fragmentProductListLegacyBinding10 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            LinearLayout linearLayout = fragmentProductListLegacyBinding10.B;
                            linearLayout.removeAllViews();
                            for (InsetBannerData insetBannerData : list) {
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
                                int i4 = EpoxyItemProductListInsetBannerLegacyBinding.C;
                                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                                EpoxyItemProductListInsetBannerLegacyBinding epoxyItemProductListInsetBannerLegacyBinding = (EpoxyItemProductListInsetBannerLegacyBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, linearLayout, true, null);
                                epoxyItemProductListInsetBannerLegacyBinding.L(insetBannerData);
                                epoxyItemProductListInsetBannerLegacyBinding.M(Integer.valueOf(com.woolworths.R.dimen.no_margin));
                                epoxyItemProductListInsetBannerLegacyBinding.l();
                            }
                        }
                        return unit;
                }
            }
        }));
        final int i4 = 2;
        productListViewModelH24.D.f(getViewLifecycleOwner(), new ProductListFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.product.list.legacy.n
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NumericPageListing numericPageListing;
                int i32 = i4;
                Unit unit = Unit.f24250a;
                ProductListFragment productListFragment = this.e;
                switch (i32) {
                    case 0:
                        ProductListViewModel.ProductListingEvent productListingEvent = (ProductListViewModel.ProductListingEvent) obj;
                        if (productListingEvent.b) {
                            numericPageListing = null;
                        } else {
                            productListingEvent.b = true;
                            numericPageListing = productListingEvent.f5338a;
                        }
                        if (numericPageListing != null) {
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding8 = productListFragment.i;
                            if (fragmentProductListLegacyBinding8 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            fragmentProductListLegacyBinding8.D.o0(0);
                            productListFragment.u.clear();
                        }
                        return unit;
                    case 1:
                        NetworkState networkState = (NetworkState) obj;
                        FragmentProductListLegacyBinding fragmentProductListLegacyBinding9 = productListFragment.i;
                        if (fragmentProductListLegacyBinding9 == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        RecyclerView.LayoutManager layoutManager = fragmentProductListLegacyBinding9.D.getLayoutManager();
                        Intrinsics.f(layoutManager, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                        ((ProductListLayoutManager) layoutManager).Q = !Intrinsics.c(networkState, NetworkState.e);
                        return unit;
                    case 2:
                        NetworkState networkState2 = (NetworkState) obj;
                        ProductListController productListController2 = productListFragment.p;
                        if (productListController2 != null) {
                            productListController2.setNetworkState(networkState2);
                            return unit;
                        }
                        Intrinsics.p("productListController");
                        throw null;
                    default:
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) obj;
                        String strO2 = productListFragment.o2();
                        if (strO2.length() == 0) {
                            strO2 = viewState.p;
                        }
                        if (((Boolean) productListFragment.t.getD()).booleanValue()) {
                            productListFragment.i2().s(strO2, false);
                        } else {
                            productListFragment.n2().setTitle(strO2);
                        }
                        ProductListErrorState productListErrorState = viewState.c;
                        if ((productListErrorState instanceof ProductListErrorState.ProductListNoResultsState) || (productListErrorState instanceof ProductListErrorState.ProductListEmptyState)) {
                            List<InsetBannerData> list = viewState.f;
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding10 = productListFragment.i;
                            if (fragmentProductListLegacyBinding10 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            LinearLayout linearLayout = fragmentProductListLegacyBinding10.B;
                            linearLayout.removeAllViews();
                            for (InsetBannerData insetBannerData : list) {
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
                                int i42 = EpoxyItemProductListInsetBannerLegacyBinding.C;
                                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                                EpoxyItemProductListInsetBannerLegacyBinding epoxyItemProductListInsetBannerLegacyBinding = (EpoxyItemProductListInsetBannerLegacyBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, linearLayout, true, null);
                                epoxyItemProductListInsetBannerLegacyBinding.L(insetBannerData);
                                epoxyItemProductListInsetBannerLegacyBinding.M(Integer.valueOf(com.woolworths.R.dimen.no_margin));
                                epoxyItemProductListInsetBannerLegacyBinding.l();
                            }
                        }
                        return unit;
                }
            }
        }));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductListFragment$initializeViewStateObservable$2(this, null), 3);
        final int i5 = 3;
        h2().F.f(getViewLifecycleOwner(), new ProductListFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.feature.product.list.legacy.n
            public final /* synthetic */ ProductListFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NumericPageListing numericPageListing;
                int i32 = i5;
                Unit unit = Unit.f24250a;
                ProductListFragment productListFragment = this.e;
                switch (i32) {
                    case 0:
                        ProductListViewModel.ProductListingEvent productListingEvent = (ProductListViewModel.ProductListingEvent) obj;
                        if (productListingEvent.b) {
                            numericPageListing = null;
                        } else {
                            productListingEvent.b = true;
                            numericPageListing = productListingEvent.f5338a;
                        }
                        if (numericPageListing != null) {
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding8 = productListFragment.i;
                            if (fragmentProductListLegacyBinding8 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            fragmentProductListLegacyBinding8.D.o0(0);
                            productListFragment.u.clear();
                        }
                        return unit;
                    case 1:
                        NetworkState networkState = (NetworkState) obj;
                        FragmentProductListLegacyBinding fragmentProductListLegacyBinding9 = productListFragment.i;
                        if (fragmentProductListLegacyBinding9 == null) {
                            Intrinsics.p("fragmentProductListBinding");
                            throw null;
                        }
                        RecyclerView.LayoutManager layoutManager = fragmentProductListLegacyBinding9.D.getLayoutManager();
                        Intrinsics.f(layoutManager, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                        ((ProductListLayoutManager) layoutManager).Q = !Intrinsics.c(networkState, NetworkState.e);
                        return unit;
                    case 2:
                        NetworkState networkState2 = (NetworkState) obj;
                        ProductListController productListController2 = productListFragment.p;
                        if (productListController2 != null) {
                            productListController2.setNetworkState(networkState2);
                            return unit;
                        }
                        Intrinsics.p("productListController");
                        throw null;
                    default:
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) obj;
                        String strO2 = productListFragment.o2();
                        if (strO2.length() == 0) {
                            strO2 = viewState.p;
                        }
                        if (((Boolean) productListFragment.t.getD()).booleanValue()) {
                            productListFragment.i2().s(strO2, false);
                        } else {
                            productListFragment.n2().setTitle(strO2);
                        }
                        ProductListErrorState productListErrorState = viewState.c;
                        if ((productListErrorState instanceof ProductListErrorState.ProductListNoResultsState) || (productListErrorState instanceof ProductListErrorState.ProductListEmptyState)) {
                            List<InsetBannerData> list = viewState.f;
                            FragmentProductListLegacyBinding fragmentProductListLegacyBinding10 = productListFragment.i;
                            if (fragmentProductListLegacyBinding10 == null) {
                                Intrinsics.p("fragmentProductListBinding");
                                throw null;
                            }
                            LinearLayout linearLayout = fragmentProductListLegacyBinding10.B;
                            linearLayout.removeAllViews();
                            for (InsetBannerData insetBannerData : list) {
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
                                int i42 = EpoxyItemProductListInsetBannerLegacyBinding.C;
                                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                                EpoxyItemProductListInsetBannerLegacyBinding epoxyItemProductListInsetBannerLegacyBinding = (EpoxyItemProductListInsetBannerLegacyBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy, linearLayout, true, null);
                                epoxyItemProductListInsetBannerLegacyBinding.L(insetBannerData);
                                epoxyItemProductListInsetBannerLegacyBinding.M(Integer.valueOf(com.woolworths.R.dimen.no_margin));
                                epoxyItemProductListInsetBannerLegacyBinding.l();
                            }
                        }
                        return unit;
                }
            }
        }));
        u2();
        getParentFragmentManager().e0(this.y, false);
        Toolbar toolbarN2 = n2();
        toolbarN2.setNavigationOnClickListener(new m(this, 1));
        toolbarN2.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: au.com.woolworths.feature.product.list.legacy.q
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ProductListFragment.I1(this.d, menuItem);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q2(au.com.woolworths.pagingutils.KeyedPageData r11) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListFragment.q2(au.com.woolworths.pagingutils.KeyedPageData):void");
    }

    public final void u2() {
        PageData pageData;
        List items;
        FragmentProductListLegacyBinding fragmentProductListLegacyBinding = this.i;
        if (fragmentProductListLegacyBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = fragmentProductListLegacyBinding.D;
        Lazy lazy = this.w;
        epoxyRecyclerView.k0((ProductsWithFullWidthItemsDecoration) lazy.getD());
        Lazy lazy2 = this.v;
        epoxyRecyclerView.k0((ProductsWithFullWidthItemsDecoration) lazy2.getD());
        Lazy lazy3 = this.x;
        epoxyRecyclerView.k0((ProductsWithFullWidthItemsDecoration) lazy3.getD());
        ProductListController productListController = this.p;
        if (productListController == null) {
            Intrinsics.p("productListController");
            throw null;
        }
        epoxyRecyclerView.setController(productListController);
        KeyedPageData keyedPageData = (KeyedPageData) h2().E.getValue();
        if (keyedPageData != null && (pageData = keyedPageData.b) != null && (items = pageData.getC()) != null && (!items.isEmpty()) && R1().d.e.getE() == Activities.ProductList.ProductListType.C) {
            FragmentProductListLegacyBinding fragmentProductListLegacyBinding2 = this.i;
            if (fragmentProductListLegacyBinding2 == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            fragmentProductListLegacyBinding2.D.setItemAnimator(new ProductSlideInItemAnimator());
        }
        if (h2().w6().e.getE().h) {
            if (h2().I == ProductsDisplayMode.d) {
                RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
                Intrinsics.f(layoutManager, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                ((ProductListLayoutManager) layoutManager).J1(1);
                epoxyRecyclerView.i((ProductsWithFullWidthItemsDecoration) lazy.getD());
                epoxyRecyclerView.setContentDescription("RECYCLER_LIST_LAYOUT");
            } else {
                epoxyRecyclerView.i((ProductsWithFullWidthItemsDecoration) lazy3.getD());
                epoxyRecyclerView.i((ProductsWithFullWidthItemsDecoration) lazy2.getD());
                RecyclerView.LayoutManager layoutManager2 = epoxyRecyclerView.getLayoutManager();
                Intrinsics.f(layoutManager2, "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.ProductListLayoutManager");
                ((ProductListLayoutManager) layoutManager2).J1(2);
                epoxyRecyclerView.setContentDescription("RECYCLER_GRID_LAYOUT");
            }
            epoxyRecyclerView.setImportantForAccessibility(2);
        }
    }
}
