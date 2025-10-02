package au.com.woolworths.feature.product.list;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.SearchView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.databinding.DataBindingUtil;
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
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.compose.CoachMarkKt;
import au.com.woolworths.feature.product.list.compose.CoachMarkPopupDirection;
import au.com.woolworths.feature.product.list.compose.FilterChipCoachMarkKt;
import au.com.woolworths.feature.product.list.compose.errorscreen.ProductListZeroResultsViewKt;
import au.com.woolworths.feature.product.list.compose.productfinder.ProductCardGridTileUiKt;
import au.com.woolworths.feature.product.list.compose.productfinder.ProductCardListTileUiKt;
import au.com.woolworths.feature.product.list.compose.recipe.IngredientCardUiKt;
import au.com.woolworths.feature.product.list.compose.recipe.ListSectionHeaderKt;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListBinding;
import au.com.woolworths.feature.product.list.ui.ProductListTopBarKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerUiKt;
import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.ui.HorizontalListKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.DietaryDisclaimer;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "Landroid/view/View$OnFocusChangeListener;", "<init>", "()V", "ProductListFragmentCaller", "Extras", "Companion", "Lau/com/woolworths/feature/product/list/ProductListContract$ViewState;", "viewState", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListFragment extends Hilt_ProductListFragment implements AddToListBottomSheetFragment.BottomSheetHost, View.OnFocusChangeListener {
    public static final float u = 100;
    public FragmentProductListBinding i;
    public AnalyticsManager j;
    public FeatureToggleManager k;
    public CollectionModeInteractor l;
    public ShopAppNavigator m;
    public CartUpdateInteractor n;
    public final ViewModelLazy o;
    public final ViewModelLazy p;
    public final Lazy q;
    public final Lazy r;
    public final LinkedHashSet s;
    public final ProductListFragment$bottomsheetLifecycleCallbacks$1 t;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListFragment$Companion;", "", "", "SEARCH_CATEGORY_PRODUCTS", "Ljava/lang/String;", "", "PAGE_START", "I", "SKELETON_ITEMS_COUNT", "Landroidx/compose/ui/unit/Dp;", "IMAGE_TEXT_BANNER_IMAGE_HEIGHT", "F", "PARAM_CURRENT_PAGE", "PAGE_SEARCH_ZERO_RESULTS", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListFragment$Extras;", "Landroid/os/Parcelable;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListFragment$ProductListFragmentCaller;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            int[] iArr2 = new int[ProductsDisplayMode.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListFragment$onViewCreated$2", f = "ProductListFragment.kt", l = {275}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.ProductListFragment$onViewCreated$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.product.list.ProductListFragment$onViewCreated$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) obj;
                ProductListFragment productListFragment = (ProductListFragment) this.d;
                float f = ProductListFragment.u;
                productListFragment.getClass();
                if (actions instanceof ProductListOptionsContract.Actions.ShowMessage) {
                    ResText resText = ((ProductListOptionsContract.Actions.ShowMessage) actions).f5256a;
                    Context contextRequireContext = productListFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    resText.getText(contextRequireContext).toString();
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
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productListFragment, ProductListFragment.class, "handleProductListOptionsActions", "handleProductListOptionsActions(Lau/com/woolworths/feature/product/list/ProductListOptionsContract$Actions;)V", 4), FlowExtKt.a(((ProductListOptionsViewModel) productListFragment.p.getD()).n, productListFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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

    /* JADX WARN: Type inference failed for: r0v7, types: [au.com.woolworths.feature.product.list.ProductListFragment$bottomsheetLifecycleCallbacks$1] */
    public ProductListFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.o = new ViewModelLazy(reflectionFactory.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.p = new ViewModelLazy(reflectionFactory.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$special$$inlined$activityViewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.requireActivity().getDefaultViewModelCreationExtras();
            }
        });
        this.q = LazyKt.b(new m(this, 0));
        this.r = LazyKt.b(new m(this, 1));
        this.s = new LinkedHashSet();
        this.t = new FragmentManager.FragmentLifecycleCallbacks() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$bottomsheetLifecycleCallbacks$1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void a(FragmentManager fragmentManager, Fragment f, FragmentActivity context) {
                Intrinsics.h(f, "f");
                Intrinsics.h(context, "context");
                ProductListFragment productListFragment = this.f5250a;
                productListFragment.s.clear();
                productListFragment.m3().x6(true);
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void b(FragmentManager fragmentManager, Fragment f) {
                Intrinsics.h(f, "f");
                float f2 = ProductListFragment.u;
                this.f5250a.m3().x6(false);
            }
        };
    }

    public static boolean A3(Object obj) {
        return (obj instanceof DynamicSizeCardData) || (obj instanceof EdrOfferBannerData) || (obj instanceof HorizontalListData) || (obj instanceof ImageTextBanner) || (obj instanceof VideoAdUnitData);
    }

    public static TrackingMetadata x3(ProductCard productCard) {
        Double inTrolley;
        ProductTrolleyData trolley = productCard.getTrolley();
        return ProductAnalyticsExtKt.h(productCard, (trolley == null || (inTrolley = trolley.getInTrolley()) == null) ? null : Float.valueOf((float) inTrolley.doubleValue()), null, 6);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(m3());
    }

    public final void C3() {
        FragmentProductListBinding fragmentProductListBinding = this.i;
        if (fragmentProductListBinding != null) {
            fragmentProductListBinding.D.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$setUpProductList$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductListFragment productListFragment = this.d;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-209990790, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$setUpProductList$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    float f = ProductListFragment.u;
                                    ProductListFragment productListFragment2 = productListFragment;
                                    LazyPagingItems lazyPagingItemsA = LazyPagingItemsKt.a(productListFragment2.m3().I, composer2);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer2.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierD = ComposedModifierKt.d(composer2, companion);
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
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer2, measurePolicyD, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer2, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer2, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer2, modifierD, function24);
                                    LoadState loadState = lazyPagingItemsA.d().f3529a;
                                    composer2.o(11689381);
                                    if (!(loadState instanceof LoadState.Error)) {
                                        if (loadState instanceof LoadState.Loading) {
                                            if (lazyPagingItemsA.c().isEmpty()) {
                                                productListFragment2.m2(composer2, 0);
                                            }
                                        } else if (!(loadState instanceof LoadState.NotLoading)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    composer2.l();
                                    composer2.o(11708569);
                                    if (!lazyPagingItemsA.c().isEmpty()) {
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                                        int p2 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer2, companion);
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
                                        Updater.b(composer2, columnMeasurePolicyA, function2);
                                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                                        }
                                        Updater.b(composer2, modifierD2, function24);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                                        productListFragment2.I2(lazyPagingItemsA, columnScopeInstance.a(companion, 0.8f, false), composer2, 8);
                                        composer2.o(152330050);
                                        if (Intrinsics.c(lazyPagingItemsA.d().c, LoadState.Loading.b)) {
                                            Modifier modifierE = SizeKt.e(columnScopeInstance.a(PaddingKt.f(companion, 16), 0.1f, true), 1.0f);
                                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.j, composer2, 6);
                                            int p3 = composer2.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                                            Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierE);
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
                                            Updater.b(composer2, rowMeasurePolicyA, function2);
                                            Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                                                androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                                            }
                                            Updater.b(composer2, modifierD3, function24);
                                            CircularProgressIndicatorKt.b(SizeKt.q(companion, 24), 0L, BitmapDescriptorFactory.HUE_RED, 0, composer2, 6, 14);
                                            composer2.f();
                                        }
                                        composer2.l();
                                        composer2.f();
                                    }
                                    composer2.l();
                                    composer2.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 599953750));
        } else {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            FragmentProductListBinding fragmentProductListBinding = this.i;
            if (fragmentProductListBinding == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            View view = fragmentProductListBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            ListChangeEventKt.a(addToListSuccessEvent, contextRequireContext, view, false, 28);
            ProductListViewModel productListViewModelM3 = m3();
            List productsAdded = addToListSuccessEvent.h;
            Intrinsics.h(productsAdded, "productsAdded");
            TrackingMetadata trackingMetadataF = ProductAnalyticsExtKt.f(productsAdded);
            trackingMetadataF.b(TrackableValue.o0, "saved 1 in my shopping list");
            productListViewModelM3.h.j(ProductListActions.AddToListSnackbarImpression.e, trackingMetadataF);
        }
    }

    public final void I1(String str, final DietaryDisclaimer dietaryDisclaimer, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(134143427);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? composerImplV.n(dietaryDisclaimer) : composerImplV.I(dietaryDisclaimer) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(this) ? 256 : 128;
        }
        if ((i2 & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1327796859, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$DietaryDisclaimer$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 8);
                        DietaryDisclaimer dietaryDisclaimer2 = dietaryDisclaimer;
                        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(dietaryDisclaimer2.getInsetBanner());
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(dietaryDisclaimer2);
                        ProductListFragment productListFragment = this;
                        boolean zI2 = zI | composer2.I(productListFragment);
                        Object objG = composer2.G();
                        if (zI2 || objG == Composer.Companion.f1624a) {
                            objG = new g(2, dietaryDisclaimer2, productListFragment);
                            composer2.A(objG);
                        }
                        composer2.l();
                        InsetBannerUiKt.b(uiModel, modifierF, false, (Function1) objG, composer2, 48, 12);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(this, str, dietaryDisclaimer, i, 15);
        }
    }

    public final void I2(LazyPagingItems lazyPagingItems, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1706197408);
        int i2 = i | (composerImplV.I(lazyPagingItems) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(this) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            int i3 = i2 & 14;
            boolean z = true;
            boolean zI = composerImplV.I(this) | (i3 == 4 || composerImplV.I(lazyPagingItems));
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new a(this, lazyPagingItems);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            GridCells.Adaptive adaptive = new GridCells.Adaptive(160);
            composerImplV.o(-1633490746);
            if (i3 != 4 && !composerImplV.I(lazyPagingItems)) {
                z = false;
            }
            boolean zI2 = composerImplV.I(this) | z;
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new g(1, lazyPagingItems, this);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LazyGridDslKt.b(adaptive, modifier, null, null, false, null, null, null, false, null, (Function1) objG2, composerImplV, i2 & 112, 0, 1020);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(this, lazyPagingItems, modifier, i, 0);
        }
    }

    public final void P2(final ImageTextBanner imageTextBanner, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1420145877);
        if ((((composerImplV.n(imageTextBanner) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1415621661, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$TextBannerCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ImageTextBannerUiKt.a(imageTextBanner, null, ProductListFragment.u, composer2, KyberEngine.KyberPolyBytes, 2);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new l(this, imageTextBanner, i, 2);
        }
    }

    public final void Q1(String str, final DynamicSizeCardData dynamicSizeCardData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-433490706);
        if ((((composerImplV.I(dynamicSizeCardData) ? 32 : 16) | i | (composerImplV.I(this) ? 256 : 128)) & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-2045360730, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$DynamicCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    PaddingValuesImpl paddingValuesImpl;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierX = SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false);
                        ProductListFragment productListFragment = this;
                        if (ProductListFragment.A3(productListFragment)) {
                            float f = 16;
                            paddingValuesImpl = new PaddingValuesImpl(f, 0, f, f);
                        } else {
                            float f2 = 16;
                            paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                        }
                        Modifier modifierE = PaddingKt.e(modifierX, paddingValuesImpl);
                        ProductListViewModel productListViewModelM3 = productListFragment.m3();
                        composer2.o(5004770);
                        boolean zN = composer2.n(productListViewModelM3);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN || objG == composer$Companion$Empty$1) {
                            ProductListFragment$DynamicCard$1$1$1 productListFragment$DynamicCard$1$1$1 = new ProductListFragment$DynamicCard$1$1$1(1, productListViewModelM3, ProductListViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                            composer2.A(productListFragment$DynamicCard$1$1$1);
                            objG = productListFragment$DynamicCard$1$1$1;
                        }
                        composer2.l();
                        Function1 function1 = (Function1) ((KFunction) objG);
                        ProductListViewModel productListViewModelM32 = productListFragment.m3();
                        composer2.o(5004770);
                        boolean zN2 = composer2.n(productListViewModelM32);
                        Object objG2 = composer2.G();
                        if (zN2 || objG2 == composer$Companion$Empty$1) {
                            ProductListFragment$DynamicCard$1$2$1 productListFragment$DynamicCard$1$2$1 = new ProductListFragment$DynamicCard$1$2$1(1, productListViewModelM32, ProductListViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                            composer2.A(productListFragment$DynamicCard$1$2$1);
                            objG2 = productListFragment$DynamicCard$1$2$1;
                        }
                        composer2.l();
                        DynamicSizeCardKt.b(dynamicSizeCardData, modifierE, function1, (Function1) ((KFunction) objG2), null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(this, str, dynamicSizeCardData, i, 3);
        }
    }

    public final void Q2(int i, final VideoAdUnitData videoAdUnitData, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(2099006435);
        if ((i2 & 48) == 0) {
            i3 = ((i2 & 64) == 0 ? composerImplV.n(videoAdUnitData) : composerImplV.I(videoAdUnitData) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(this) ? 256 : 128;
        }
        if ((i3 & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) m3().C.e();
            final ProductCardConfig productCardConfig = new ProductCardConfig(true, true, true, viewState != null && viewState.q, false, false, null, 112, null);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1889344775, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$VideoAdUnit$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = ProductListFragment.u;
                        VideoAdUnitComposeViewKt.b(videoAdUnitData, productCardConfig, this.m3(), composer2, VideoAdUnitData.$stable | 3072 | (ProductCardConfig.$stable << 3));
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(this, i, videoAdUnitData, i2, 2);
        }
    }

    public final void R1(EdrOfferBannerData edrOfferBannerData, Composer composer, int i) {
        EdrOfferBoostState edrOfferBoostState;
        ComposerImpl composerImplV = composer.v(445085880);
        int i2 = (composerImplV.I(edrOfferBannerData) ? 4 : 2) | i | (composerImplV.I(this) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) LiveDataAdapterKt.a(m3().C, composerImplV).getD();
            if (viewState == null || (edrOfferBoostState = viewState.v) == null) {
                edrOfferBoostState = EdrOfferBoostState.Idle.f8782a;
            }
            ProductListViewModel productListViewModelM3 = m3();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(productListViewModelM3);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                ProductListFragment$EdrOfferBannerUi$1$1 productListFragment$EdrOfferBannerUi$1$1 = new ProductListFragment$EdrOfferBannerUi$1$1(1, productListViewModelM3, ProductListViewModel.class, "onEdrOfferBannerClick", "onEdrOfferBannerClick(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)V", 0);
                composerImplV.A(productListFragment$EdrOfferBannerUi$1$1);
                objG = productListFragment$EdrOfferBannerUi$1$1;
            }
            composerImplV.V(false);
            Function1 function1 = (Function1) ((KFunction) objG);
            ProductListViewModel productListViewModelM32 = m3();
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(productListViewModelM32);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                ProductListFragment$EdrOfferBannerUi$2$1 productListFragment$EdrOfferBannerUi$2$1 = new ProductListFragment$EdrOfferBannerUi$2$1(1, productListViewModelM32, ProductListViewModel.class, "onEdrBoostButtonClick", "onEdrBoostButtonClick(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)Lkotlinx/coroutines/Job;", 8);
                composerImplV.A(productListFragment$EdrOfferBannerUi$2$1);
                objG2 = productListFragment$EdrOfferBannerUi$2$1;
            }
            Function1 function12 = (Function1) objG2;
            composerImplV.V(false);
            ProductListViewModel productListViewModelM33 = m3();
            composerImplV.o(5004770);
            boolean zN3 = composerImplV.n(productListViewModelM33);
            Object objG3 = composerImplV.G();
            if (zN3 || objG3 == composer$Companion$Empty$1) {
                ProductListFragment$EdrOfferBannerUi$3$1 productListFragment$EdrOfferBannerUi$3$1 = new ProductListFragment$EdrOfferBannerUi$3$1(1, productListViewModelM33, ProductListViewModel.class, "onEdrOfferBannerImpression", "onEdrOfferBannerImpression(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)V", 0);
                composerImplV.A(productListFragment$EdrOfferBannerUi$3$1);
                objG3 = productListFragment$EdrOfferBannerUi$3$1;
            }
            composerImplV.V(false);
            float f = 20;
            EdrOfferBannerKt.a(edrOfferBannerData, edrOfferBoostState, function1, function12, (Function1) ((KFunction) objG3), SizeKt.g(SizeKt.e(PaddingKt.e(Modifier.Companion.d, new PaddingValuesImpl(f, f, f, f)), 1.0f), 100), composerImplV, 196608 | (i2 & 14));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new l(this, edrOfferBannerData, i, 1);
        }
    }

    public final AnalyticsManager X2() {
        AnalyticsManager analyticsManager = this.j;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final void b2(int i, HorizontalListData horizontalListData, Composer composer, int i2) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(129062857);
        int i3 = i2 | (composerImplV.r(i) ? 4 : 2) | (composerImplV.I(horizontalListData) ? 32 : 16) | (composerImplV.I(this) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ProductListViewModel productListViewModelM3 = m3();
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            ProductListViewModel productListViewModelM32 = m3();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(productListViewModelM32);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                ProductListFragment$HorizontalList$1$1 productListFragment$HorizontalList$1$1 = new ProductListFragment$HorizontalList$1$1(1, productListViewModelM32, ProductListViewModel.class, "onMerchCardFullImageClickEvent", "onMerchCardFullImageClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                composerImplV.A(productListFragment$HorizontalList$1$1);
                objG = productListFragment$HorizontalList$1$1;
            }
            KFunction kFunction = (KFunction) objG;
            composerImplV.V(false);
            FeatureToggleManager featureToggleManager = this.k;
            if (featureToggleManager == null) {
                Intrinsics.p("featureToggleManager");
                throw null;
            }
            composerImpl = composerImplV;
            HorizontalListKt.a(i, horizontalListData, true, EmptyList.d, null, null, null, null, (Function1) kFunction, productListViewModelM3, lazyListStateA, null, false, null, featureToggleManager.c(BaseShopAppFeature.w), null, null, composerImpl, (i3 & 112) | (i3 & 14) | 14380480 | (ProductId.$stable << 9), 112640);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(this, i, horizontalListData, i2, 4);
        }
    }

    public final void h2(String str, final IngredientCardApiData ingredientCardApiData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1254417289);
        if ((((composerImplV.I(ingredientCardApiData) ? 32 : 16) | i | (composerImplV.I(this) ? 256 : 128)) & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-397031983, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$IngredientCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final IngredientCardApiData ingredientCardApiData2 = ingredientCardApiData;
                        final ProductListFragment productListFragment = this;
                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-1977517011, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$IngredientCard$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    float f = ProductListFragment.u;
                                    IngredientCardUiKt.a(ingredientCardApiData2, productListFragment.m3(), composer3, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(this, str, ingredientCardApiData, i, 1);
        }
    }

    public final Extras h3() {
        return (Extras) this.q.getD();
    }

    public final void i2(String str, final ListSectionHeaderApiData listSectionHeaderApiData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(171703332);
        if ((((composerImplV.I(listSectionHeaderApiData) ? 32 : 16) | i) & 17) == 16 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(1365356764, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ListHeader$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final ListSectionHeaderApiData listSectionHeaderApiData2 = listSectionHeaderApiData;
                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(1314373376, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ListHeader$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ListSectionHeaderKt.a(listSectionHeaderApiData2, SizeKt.e(Modifier.Companion.d, 1.0f), composer3, 48, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(this, str, listSectionHeaderApiData, i, 2);
        }
    }

    public final void m2(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1219844270);
        if ((i & 1) == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CircularProgressIndicatorKt.b(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), 0L, BitmapDescriptorFactory.HUE_RED, 0, composerImplV, 0, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new t(this, i);
        }
    }

    public final ProductListViewModel m3() {
        return (ProductListViewModel) this.o.getD();
    }

    public final void n2(int i, MerchCardData merchCardData, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(-1092294019);
        int i3 = i2 | (composerImplV.I(merchCardData) ? 32 : 16) | (composerImplV.I(this) ? 256 : 128);
        if ((i3 & 145) == 144 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = m3().L.ordinal();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (iOrdinal == 0) {
                composerImplV.o(-1858679722);
                ProductListViewModel productListViewModelM3 = m3();
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(productListViewModelM3);
                Object objG = composerImplV.G();
                if (zN || objG == composer$Companion$Empty$1) {
                    ProductListFragment$MerchCard$1$1 productListFragment$MerchCard$1$1 = new ProductListFragment$MerchCard$1$1(1, productListViewModelM3, ProductListViewModel.class, "onMerchCardClickEvent", "onMerchCardClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                    composerImplV.A(productListFragment$MerchCard$1$1);
                    objG = productListFragment$MerchCard$1$1;
                }
                composerImplV.V(false);
                Function1 function1 = (Function1) ((KFunction) objG);
                ProductListViewModel productListViewModelM32 = m3();
                composerImplV.o(5004770);
                boolean zN2 = composerImplV.n(productListViewModelM32);
                Object objG2 = composerImplV.G();
                if (zN2 || objG2 == composer$Companion$Empty$1) {
                    ProductListFragment$MerchCard$2$1 productListFragment$MerchCard$2$1 = new ProductListFragment$MerchCard$2$1(1, productListViewModelM32, ProductListViewModel.class, "onMerchCardImpressionEvent", "onMerchCardImpressionEvent(Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                    composerImplV.A(productListFragment$MerchCard$2$1);
                    objG2 = productListFragment$MerchCard$2$1;
                }
                composerImplV.V(false);
                MerchCardKt.b(merchCardData, function1, (Function1) ((KFunction) objG2), null, composerImplV, ((i3 >> 3) & 14) | 8, 8);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(-1722527583, composerImplV, false);
                }
                composerImplV.o(-1858337482);
                ProductListViewModel productListViewModelM33 = m3();
                composerImplV.o(5004770);
                boolean zN3 = composerImplV.n(productListViewModelM33);
                Object objG3 = composerImplV.G();
                if (zN3 || objG3 == composer$Companion$Empty$1) {
                    ProductListFragment$MerchCard$3$1 productListFragment$MerchCard$3$1 = new ProductListFragment$MerchCard$3$1(1, productListViewModelM33, ProductListViewModel.class, "onMerchCardClickEvent", "onMerchCardClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                    composerImplV.A(productListFragment$MerchCard$3$1);
                    objG3 = productListFragment$MerchCard$3$1;
                }
                composerImplV.V(false);
                Function1 function12 = (Function1) ((KFunction) objG3);
                ProductListViewModel productListViewModelM34 = m3();
                composerImplV.o(5004770);
                boolean zN4 = composerImplV.n(productListViewModelM34);
                Object objG4 = composerImplV.G();
                if (zN4 || objG4 == composer$Companion$Empty$1) {
                    ProductListFragment$MerchCard$4$1 productListFragment$MerchCard$4$1 = new ProductListFragment$MerchCard$4$1(1, productListViewModelM34, ProductListViewModel.class, "onMerchCardImpressionEvent", "onMerchCardImpressionEvent(Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                    composerImplV.A(productListFragment$MerchCard$4$1);
                    objG4 = productListFragment$MerchCard$4$1;
                }
                composerImplV.V(false);
                MerchCardKt.a(merchCardData, function12, (Function1) ((KFunction) objG4), null, null, composerImplV, ((i3 >> 3) & 14) | 8, 24);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(this, i, merchCardData, i2, 3);
        }
    }

    public final void o2(PersonalisedProductsBannerData personalisedProductsBannerData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(495726264);
        int i2 = (composerImplV.I(personalisedProductsBannerData) ? 4 : 2) | i | (composerImplV.I(this) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ProductListViewModel productListViewModelM3 = m3();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(productListViewModelM3);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new ProductListFragment$PersonalisedProductsBannerUi$1$1(1, productListViewModelM3, ProductListViewModel.class, "onPersonalisedProductsBannerClick", "onPersonalisedProductsBannerClick(Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;)V", 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Function1 function1 = (Function1) ((KFunction) objG);
            ProductListViewModel productListViewModelM32 = m3();
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(productListViewModelM32);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new ProductListFragment$PersonalisedProductsBannerUi$2$1(1, productListViewModelM32, ProductListViewModel.class, "onPersonalisedProductsBannerImpression", "onPersonalisedProductsBannerImpression(Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;)V", 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            PersonalisedProductsBannerKt.a(personalisedProductsBannerData, function1, (Function1) ((KFunction) objG2), PaddingKt.f(Modifier.Companion.d, 16), composerImplV, (i2 & 14) | 3072);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new l(this, personalisedProductsBannerData, i, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (h3().d.e instanceof Activities.ProductList.ExtrasBySearchAlternative) {
            getParentFragmentManager().o0(this, new androidx.fragment.app.h(new t(this)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentProductListBinding fragmentProductListBinding = (FragmentProductListBinding) DataBindingUtil.c(inflater, com.woolworths.R.layout.fragment_product_list, viewGroup, false, null);
        this.i = fragmentProductListBinding;
        if (fragmentProductListBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        View view = fragmentProductListBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getParentFragmentManager().u0(this.t);
        super.onDestroyView();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View searchView, boolean z) {
        Intrinsics.h(searchView, "searchView");
        if (z) {
            m3().B6(((SearchView) searchView).getQuery().toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.s.clear();
        m3().x6(true);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        TrackingMetadata trackingMetadataR6 = m3().r6();
        Activities.ProductList.ExtraProductListSource extraProductListSource = m3().K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (extraProductListSource.getE() == Activities.ProductList.ProductListType.D) {
            trackingMetadataR6.b(TrackableValue.J2, m3().q6().d.d);
            trackingMetadataR6.b(TrackableValue.G2, "products");
        }
        X2().e(ProductListScreens.e, trackingMetadataR6);
        ProductListViewModel productListViewModelM3 = m3();
        Activities.ProductList.Extras extras = h3().d;
        Intrinsics.h(extras, "extras");
        MediatorLiveData mediatorLiveData = productListViewModelM3.C;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if ((viewState != null ? viewState.h : null) != null && productListViewModelM3.P) {
            ProductListViewModel.H6(productListViewModelM3, mediatorLiveData, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108735);
            productListViewModelM3.P = false;
        }
        ProductListViewModel productListViewModelM32 = m3();
        MediatorLiveData mediatorLiveData2 = productListViewModelM32.C;
        String str2 = productListViewModelM32.q6().d.d;
        if (str2.length() == 0) {
            ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mediatorLiveData2.e();
            str = viewState2 != null ? viewState2.p : null;
        } else {
            str = str2;
        }
        ProductListViewModel.H6(productListViewModelM32, mediatorLiveData2, 0, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, 67043327);
        m3().x6(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        ProductListViewModel productListViewModelM3 = m3();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new ProductListFragment$onViewCreated$1$1(productListViewModelM3, this, null), 3);
        productListViewModelM3.G6(h3().d);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new AnonymousClass2(null), 3);
        FragmentProductListBinding fragmentProductListBinding = this.i;
        if (fragmentProductListBinding == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        fragmentProductListBinding.D(getViewLifecycleOwner());
        fragmentProductListBinding.L(m3());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(m3().q6().d.d);
        }
        FragmentProductListBinding fragmentProductListBinding2 = this.i;
        if (fragmentProductListBinding2 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        fragmentProductListBinding2.F.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$configureToolbar$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    float f = ProductListFragment.u;
                    final ProductListFragment productListFragment = this.d;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.m3().C, composer);
                    ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                    final String str = viewState != null ? viewState.p : null;
                    if (str == null) {
                        str = "";
                    }
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-231642763, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$configureToolbar$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            boolean z;
                            boolean z2;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductListFragment productListFragment2 = productListFragment;
                                boolean zBooleanValue = ((Boolean) productListFragment2.r.getD()).booleanValue();
                                ProductListViewModel productListViewModelM32 = productListFragment2.m3();
                                Activities.ProductList.ExtraProductListSource extraProductListSource = productListViewModelM32.K;
                                if (extraProductListSource == null) {
                                    Intrinsics.p("productListSource");
                                    throw null;
                                }
                                boolean z3 = false;
                                if (extraProductListSource.getE().k && ((Boolean) productListViewModelM32.M.getD()).booleanValue() && productListViewModelM32.r.b() != Region.j) {
                                    z = zBooleanValue;
                                    z2 = true;
                                } else {
                                    z = zBooleanValue;
                                    z2 = false;
                                }
                                CartUpdateInteractor cartUpdateInteractor = productListFragment2.n;
                                if (cartUpdateInteractor == null) {
                                    Intrinsics.p("cartUpdateInteractor");
                                    throw null;
                                }
                                if (cartUpdateInteractor.b.z() && productListFragment2.h3().d.e.getE().i) {
                                    z3 = true;
                                }
                                ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mutableStateA.getD();
                                Integer num = viewState2 != null ? viewState2.A : null;
                                composer2.o(5004770);
                                boolean zI = composer2.I(productListFragment2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new m(productListFragment2, 2);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(productListFragment2);
                                String str2 = str;
                                boolean zN = zI2 | composer2.n(str2);
                                Object objG2 = composer2.G();
                                if (zN || objG2 == obj5) {
                                    objG2 = new u(productListFragment2, str2, 1);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(productListFragment2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == obj5) {
                                    objG3 = new m(productListFragment2, 3);
                                    composer2.A(objG3);
                                }
                                Function0 function03 = (Function0) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(productListFragment2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == obj5) {
                                    objG4 = new m(productListFragment2, 4);
                                    composer2.A(objG4);
                                }
                                Function0 function04 = (Function0) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(productListFragment2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == obj5) {
                                    objG5 = new m(productListFragment2, 5);
                                    composer2.A(objG5);
                                }
                                Function0 function05 = (Function0) objG5;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(productListFragment2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == obj5) {
                                    objG6 = new m(productListFragment2, 6);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                ProductListTopBarKt.a(str2, z, z2, z3, function0, function02, function03, function04, function05, (Function0) objG6, null, num, false, 0L, 0L, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 578301777));
        FragmentProductListBinding fragmentProductListBinding3 = this.i;
        if (fragmentProductListBinding3 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        ComposeView composeView = fragmentProductListBinding3.E.y;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    float f = ProductListFragment.u;
                    final ProductListFragment productListFragment = this.d;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.m3().C, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1145266653, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProvidedValue providedValueB = InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE);
                                final ProductListFragment productListFragment2 = productListFragment;
                                final State state = mutableStateA;
                                CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(1018769763, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment.loadComposeUi.1.1.1.1.1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
                                    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
                                    @Override // kotlin.jvm.functions.Function2
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23) {
                                        /*
                                            Method dump skipped, instructions count: 509
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$1$1.AnonymousClass1.C01011.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                    }
                                }, composer2), composer2, 56);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1235394523));
        ComposeView composeView2 = fragmentProductListBinding3.A;
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        composeView2.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$2$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    float f = ProductListFragment.u;
                    final ProductListFragment productListFragment = this.d;
                    final MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.m3().C, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1201509324, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$2$1.1
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
                                    float f2 = 20;
                                    composer2.o(-1633490746);
                                    final ProductListFragment productListFragment2 = productListFragment;
                                    boolean zI = composer2.I(productListFragment2) | composer2.I(coachMark);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new w(productListFragment2, coachMark, 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    CoachMarkKt.a(rect, (Function0) objG, f2, BitmapDescriptorFactory.HUE_RED, true, ComposableLambdaKt.c(1071774740, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadComposeUi$1$2$1$1$1$2
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
                                                    objG2 = new w(productListFragment3, coachMark2, 1);
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
        }, true, -200669308));
        FragmentProductListBinding fragmentProductListBinding4 = this.i;
        if (fragmentProductListBinding4 == null) {
            Intrinsics.p("fragmentProductListBinding");
            throw null;
        }
        fragmentProductListBinding4.G.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadZeroResultComposeUi$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    float f = ProductListFragment.u;
                    final ProductListFragment productListFragment = this.d;
                    MutableState mutableStateA = LiveDataAdapterKt.a(productListFragment.m3().C, composer);
                    ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                    final ZeroResultPageData zeroResultPageData = viewState != null ? viewState.s : null;
                    ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mutableStateA.getD();
                    final ProductListZeroResults productListZeroResults = viewState2 != null ? viewState2.t : null;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1808066447, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$loadZeroResultComposeUi$1$1.1
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
                                ProductListViewModel productListViewModelM32 = productListFragment2.m3();
                                ProductListViewModel productListViewModelM33 = productListFragment2.m3();
                                composer2.o(5004770);
                                boolean zN = composer2.n(productListViewModelM33);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zN || objG == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$1$1 productListFragment$loadZeroResultComposeUi$1$1$1$1$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$1$1(1, productListViewModelM33, ProductListViewModel.class, "onProductCategoryTileClick", "onProductCategoryTileClick(Lau/com/woolworths/shop/aem/components/model/productcategorytile/ProductCategoryTileData;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$1$1);
                                    objG = productListFragment$loadZeroResultComposeUi$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                ProductListViewModel productListViewModelM34 = productListFragment2.m3();
                                composer2.o(5004770);
                                boolean zN2 = composer2.n(productListViewModelM34);
                                Object objG2 = composer2.G();
                                if (zN2 || objG2 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$2$1 productListFragment$loadZeroResultComposeUi$1$1$1$2$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$2$1(1, productListViewModelM34, ProductListViewModel.class, "onBrowseAllAislesClick", "onBrowseAllAislesClick(Ljava/lang/String;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$2$1);
                                    objG2 = productListFragment$loadZeroResultComposeUi$1$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                ProductListViewModel productListViewModelM35 = productListFragment2.m3();
                                composer2.o(5004770);
                                boolean zN3 = composer2.n(productListViewModelM35);
                                Object objG3 = composer2.G();
                                if (zN3 || objG3 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$3$1 productListFragment$loadZeroResultComposeUi$1$1$1$3$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$3$1(0, productListViewModelM35, ProductListViewModel.class, "onZeroResultVisibleImpression", "onZeroResultVisibleImpression()V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$3$1);
                                    objG3 = productListFragment$loadZeroResultComposeUi$1$1$1$3$1;
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                ProductListViewModel productListViewModelM36 = productListFragment2.m3();
                                composer2.o(5004770);
                                boolean zN4 = composer2.n(productListViewModelM36);
                                Object objG4 = composer2.G();
                                if (zN4 || objG4 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$4$1 productListFragment$loadZeroResultComposeUi$1$1$1$4$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$4$1(1, productListViewModelM36, ProductListViewModel.class, "onZeroResultHorizontalListVisibleImpression", "onZeroResultHorizontalListVisibleImpression(Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$4$1);
                                    objG4 = productListFragment$loadZeroResultComposeUi$1$1$1$4$1;
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                ProductListViewModel productListViewModelM37 = productListFragment2.m3();
                                composer2.o(5004770);
                                boolean zN5 = composer2.n(productListViewModelM37);
                                Object objG5 = composer2.G();
                                if (zN5 || objG5 == composer$Companion$Empty$1) {
                                    ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1 productListFragment$loadZeroResultComposeUi$1$1$1$5$1 = new ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1(1, productListViewModelM37, ProductListViewModel.class, "onChatEntryBannerClicked", "onChatEntryBannerClicked(Ljava/lang/String;)V", 0);
                                    composer2.A(productListFragment$loadZeroResultComposeUi$1$1$1$5$1);
                                    objG5 = productListFragment$loadZeroResultComposeUi$1$1$1$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                FeatureToggleManager featureToggleManager = productListFragment2.k;
                                if (featureToggleManager == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                boolean zC = featureToggleManager.c(ProductFeature.d);
                                ProductListZeroResultsViewKt.a(productListZeroResults, zeroResultPageData, zB, productListViewModelM32, (Function1) kFunction2, (Function1) kFunction, (Function0) kFunction3, (Function1) kFunction4, (Function1) kFunction5, zC, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 63804237));
        FeatureToggleManager featureToggleManager = this.k;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.M)) {
            final FragmentProductListBinding fragmentProductListBinding5 = this.i;
            if (fragmentProductListBinding5 == null) {
                Intrinsics.p("fragmentProductListBinding");
                throw null;
            }
            fragmentProductListBinding5.E.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.feature.product.list.p
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    float f = ProductListFragment.u;
                    this.d.m3().R = fragmentProductListBinding5.E.h.getHeight();
                }
            });
        }
        m3().C.f(getViewLifecycleOwner(), new ProductListFragmentKt$sam$androidx_lifecycle_Observer$0(new o(this, 0)));
        C3();
        getParentFragmentManager().e0(this.t, false);
    }

    public final void p2(ProductCard productCard, ProductCardConfig productCardConfig, boolean z, Composer composer, int i) {
        int i2;
        final ProductCard productCard2;
        final ProductCardConfig productCardConfig2;
        final boolean z2;
        ComposerImpl composerImplV = composer.v(-2006391691);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            productCard2 = productCard;
            productCardConfig2 = productCardConfig;
            z2 = z;
        } else {
            final MutableState mutableStateA = LiveDataAdapterKt.a(m3().C, composerImplV);
            productCard2 = productCard;
            productCardConfig2 = productCardConfig;
            z2 = z;
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(595339453, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductCardGridTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductCardConfig productCardConfig3 = productCardConfig2;
                        boolean zIsWatchlistEnabled = productCardConfig3.isWatchlistEnabled();
                        float f = ProductListFragment.u;
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                        List list = viewState != null ? viewState.r : null;
                        ProductCard productCard3 = productCard2;
                        boolean zT = ProductCardExtKt.t(productCard3, list);
                        ProductListFragment productListFragment = this;
                        ProductListViewModel productListViewModelM3 = productListFragment.m3();
                        int i3 = 2;
                        boolean zIsCheckOtherStoresButtonAllowed = productCardConfig3.isCheckOtherStoresButtonAllowed();
                        boolean zIsInstoreMode = productCardConfig3.isInstoreMode();
                        int i4 = 1;
                        if (productListFragment.m3().r.b() != Region.j) {
                            i3 = 1;
                        }
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(productListFragment) | composer2.I(productCard3);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG == obj3) {
                            objG = new v(productListFragment, productCard3, 0);
                            composer2.A(objG);
                        }
                        Function0 function0 = (Function0) objG;
                        composer2.l();
                        composer2.o(-1633490746);
                        boolean zI2 = composer2.I(productListFragment) | composer2.I(productCard3);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == obj3) {
                            objG2 = new v(productListFragment, productCard3, i4);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        ProductCardGridTileUiKt.a(productCard3, productListViewModelM3, zIsInstoreMode, zIsWatchlistEnabled, zT, z2, zIsCheckOtherStoresButtonAllowed, function0, (Function0) objG2, Integer.valueOf(i3), null, composer2, ProductCard.$stable, 1024);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(this, productCard2, productCardConfig2, z2, i, 0);
        }
    }

    public final void q2(ProductCard productCard, ProductCardConfig productCardConfig, boolean z, Composer composer, int i) {
        int i2;
        final ProductCard productCard2;
        final ProductCardConfig productCardConfig2;
        final boolean z2;
        ComposerImpl composerImplV = composer.v(1496832461);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            productCard2 = productCard;
            productCardConfig2 = productCardConfig;
            z2 = z;
        } else {
            final MutableState mutableStateA = LiveDataAdapterKt.a(m3().C, composerImplV);
            productCard2 = productCard;
            productCardConfig2 = productCardConfig;
            z2 = z;
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-196403691, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductCardListTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    int i3 = 2;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductCardConfig productCardConfig3 = productCardConfig2;
                        boolean zIsWatchlistEnabled = productCardConfig3.isWatchlistEnabled();
                        float f = ProductListFragment.u;
                        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mutableStateA.getD();
                        List list = viewState != null ? viewState.r : null;
                        if (list == null) {
                            list = EmptyList.d;
                        }
                        List list2 = list;
                        ProductListFragment productListFragment = this;
                        ProductListViewModel productListViewModelM3 = productListFragment.m3();
                        boolean zIsInstoreMode = productCardConfig3.isInstoreMode();
                        boolean zIsCheckOtherStoresButtonAllowed = productCardConfig3.isCheckOtherStoresButtonAllowed();
                        Integer numValueOf = Integer.valueOf(productListFragment.m3().r.b() == Region.j ? 2 : 1);
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(productListFragment);
                        ProductCard productCard3 = productCard2;
                        boolean zI2 = zI | composer2.I(productCard3);
                        Object objG = composer2.G();
                        if (zI2 || objG == Composer.Companion.f1624a) {
                            objG = new v(productListFragment, productCard3, i3);
                            composer2.A(objG);
                        }
                        composer2.l();
                        ProductCardListTileUiKt.a(productCard3, productListViewModelM3, zIsInstoreMode, list2, zIsWatchlistEnabled, z2, zIsCheckOtherStoresButtonAllowed, numValueOf, (Function0) objG, composer2, ProductCard.$stable, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(this, productCard2, productCardConfig2, z2, i, 1);
        }
    }

    public final void u2(String str, final InsetBannerApiData insetBannerApiData, final int i, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(-1258844989);
        if ((((composerImplV.I(insetBannerApiData) ? 32 : 16) | i2 | (composerImplV.r(i) ? 256 : 128) | (composerImplV.I(this) ? 2048 : 1024)) & 1169) == 1168 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-471024773, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.ProductListFragment$ProductListInsetBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, PrimitiveResources_androidKt.a(composer2, i), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData);
                        composer2.o(5004770);
                        ProductListFragment productListFragment = this;
                        boolean zI = composer2.I(productListFragment);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new o(productListFragment, 2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        InsetBannerUiKt.b(uiModel, modifierJ, false, (Function1) objG, composer2, 0, 12);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(this, str, insetBannerApiData, i, i2);
        }
    }
}
