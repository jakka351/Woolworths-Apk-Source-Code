package au.com.woolworths.feature.shop.catalogue.listing.category;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Extra", "Companion", "Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$ViewState;", "viewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryListingActivity extends Hilt_CategoryListingActivity implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int A = 0;
    public ShopAppNavigator y;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CategoryListingViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new f(this, 13));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingActivity$Companion;", "", "", "EXTRA_CATEGORY_LISTING", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extra(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(String categoryId) {
            Intrinsics.h(categoryId, "categoryId");
            this.d = categoryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extra) && Intrinsics.c(this.d, ((Extra) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("Extra(categoryId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return LifecycleOwnerKt.a(this);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        CategoryListingViewModel categoryListingViewModelO4 = O4();
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            MutableStateFlow mutableStateFlow = categoryListingViewModelO4.g;
            mutableStateFlow.f(CategoryListingContract.ViewState.a((CategoryListingContract.ViewState) mutableStateFlow.getValue(), null, null, null, new BottomSheetResult.AddToListSuccess((ListChangeEvent.AddToListSuccessEvent) listChangeEvent), 31));
        }
    }

    public final CategoryListingViewModel O4() {
        return (CategoryListingViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void j(ProductBottomSheetErrorCause productBottomSheetErrorCause) {
    }

    @Override // au.com.woolworths.feature.shop.catalogue.listing.category.Hilt_CategoryListingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.b(getWindow(), false);
        getWindow().setStatusBarColor(0);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = CategoryListingActivity.A;
                    final CategoryListingActivity categoryListingActivity = CategoryListingActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(categoryListingActivity.O4().g, composer);
                    new WindowInsetsControllerCompat(categoryListingActivity.getWindow(), (View) composer.x(AndroidCompositionLocals_androidKt.f)).e(false);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1943090460, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CategoryListingContract.ViewState viewState = (CategoryListingContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                CategoryListingActivity categoryListingActivity2 = categoryListingActivity;
                                boolean zI = composer2.I(categoryListingActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    CategoryListingActivity$onCreate$1$1$1$1 categoryListingActivity$onCreate$1$1$1$1 = new CategoryListingActivity$onCreate$1$1$1$1(0, categoryListingActivity2, CategoryListingActivity.class, "finish", "finish()V", 0);
                                    composer2.A(categoryListingActivity$onCreate$1$1$1$1);
                                    objG = categoryListingActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(categoryListingActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    CategoryListingActivity$onCreate$1$1$2$1 categoryListingActivity$onCreate$1$1$2$1 = new CategoryListingActivity$onCreate$1$1$2$1(0, categoryListingActivity2, CategoryListingActivity.class, "launchViewCart", "launchViewCart()V", 0);
                                    composer2.A(categoryListingActivity$onCreate$1$1$2$1);
                                    objG2 = categoryListingActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                int i2 = CategoryListingActivity.A;
                                CategoryListingViewModel categoryListingViewModelO4 = categoryListingActivity2.O4();
                                CategoryListingViewModel categoryListingViewModelO42 = categoryListingActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(categoryListingViewModelO42);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    CategoryListingActivity$onCreate$1$1$3$1 categoryListingActivity$onCreate$1$1$3$1 = new CategoryListingActivity$onCreate$1$1$3$1(0, categoryListingViewModelO42, CategoryListingViewModel.class, "onSnackbarDismissed", "onSnackbarDismissed()V", 0);
                                    composer2.A(categoryListingActivity$onCreate$1$1$3$1);
                                    objG3 = categoryListingActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                CategoryListingViewModel categoryListingViewModelO43 = categoryListingActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(categoryListingViewModelO43);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    CategoryListingActivity$onCreate$1$1$4$1 categoryListingActivity$onCreate$1$1$4$1 = new CategoryListingActivity$onCreate$1$1$4$1(1, categoryListingViewModelO43, CategoryListingViewModel.class, "onViewShoppingListAction", "onViewShoppingListAction(Ljava/lang/String;)V", 0);
                                    composer2.A(categoryListingActivity$onCreate$1$1$4$1);
                                    objG4 = categoryListingActivity$onCreate$1$1$4$1;
                                }
                                composer2.l();
                                CategoryListingScreenKt.a(viewState, function0, function02, categoryListingViewModelO4, function03, (Function1) ((KFunction) objG4), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2084260396));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CategoryListingActivity$collectActions$1(this, null), 3);
        CategoryListingViewModel categoryListingViewModelO4 = O4();
        final String categoryId = ((Extra) this.z.getD()).d;
        Intrinsics.h(categoryId, "categoryId");
        final CategoryListingInteractor categoryListingInteractor = categoryListingViewModelO4.e;
        categoryListingInteractor.getClass();
        categoryListingInteractor.f.f(null);
        Flow flowA = CachedPagingDataKt.a(new Pager(new PagingConfig(20, 0, 0, 58, false), new Function0() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CategoryListingInteractor categoryListingInteractor2 = categoryListingInteractor;
                CategoryListingInteractor.ListingPagingSource listingPagingSource = new CategoryListingInteractor.ListingPagingSource(categoryListingInteractor2, categoryId);
                categoryListingInteractor2.d = listingPagingSource;
                return listingPagingSource;
            }
        }).f3571a, ViewModelKt.a(categoryListingViewModelO4));
        MutableStateFlow mutableStateFlow = categoryListingViewModelO4.g;
        mutableStateFlow.f(CategoryListingContract.ViewState.a((CategoryListingContract.ViewState) mutableStateFlow.getValue(), null, null, flowA, null, 47));
    }
}
