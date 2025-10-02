package au.com.woolworths.feature.shop.contentpage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.contentpage.data.SnackBarActionEvent;
import au.com.woolworths.feature.shop.contentpage.data.SnackbarContent;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFragment;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Extras", "Companion", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageFragment extends Hilt_ContentPageFragment implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public FeatureToggleManager i;
    public ShopAppNavigator j;
    public final ViewModelLazy k;
    public final Lazy l;
    public final Lazy m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFragment$Companion;", "", "", "SHOULD_SHOW_TOP_BAR", "Ljava/lang/String;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ContentPageFragment a(Extras extras, boolean z) {
            ContentPageFragment contentPageFragment = new ContentPageFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_DATA", extras);
            bundle.putBoolean("should_show_top_bar", z);
            contentPageFragment.setArguments(bundle);
            return contentPageFragment;
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/ContentPageFragment$Extras;", "Landroid/os/Parcelable;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final Activities.ContentPage.ContentPageExtras d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras((Activities.ContentPage.ContentPageExtras) parcel.readParcelable(Extras.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(Activities.ContentPage.ContentPageExtras activityExtra) {
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

    public ContentPageFragment() {
        final ContentPageFragment$special$$inlined$viewModels$default$1 contentPageFragment$special$$inlined$viewModels$default$1 = new ContentPageFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) contentPageFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(Reflection.f24268a.b(ContentPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$special$$inlined$viewModels$default$4
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
        this.l = LazyKt.b(new a(this, 1));
        this.m = LazyKt.b(new a(this, 2));
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return LifecycleOwnerKt.a(this);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            String str = addToListSuccessEvent.f;
            if (str == null) {
                str = "";
            }
            String string = getString(com.woolworths.R.string.product_add_to_list_successfully, str, addToListSuccessEvent.e);
            Intrinsics.g(string, "getString(...)");
            String string2 = getString(com.woolworths.R.string.view_list);
            Intrinsics.g(string2, "getString(...)");
            String upperCase = string2.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            ContentPageViewModel contentPageViewModelI1 = I1();
            ContentPageViewModel.K6(contentPageViewModelI1, contentPageViewModelI1.p, null, null, false, false, null, null, new SnackbarContent(new PlainText(string), upperCase, new SnackBarActionEvent.OnShoppingListViewClick(addToListSuccessEvent.d)), null, null, null, false, false, 16127);
        }
    }

    public final ContentPageViewModel I1() {
        return (ContentPageViewModel) this.k.getD();
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void j(ProductBottomSheetErrorCause productBottomSheetErrorCause) {
        ContentPageViewModel contentPageViewModelI1 = I1();
        String string = getString(productBottomSheetErrorCause.d);
        Intrinsics.g(string, "getString(...)");
        contentPageViewModelI1.I6(string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ContentPageViewModel contentPageViewModelI1 = I1();
        Activities.ContentPage.ContentPageExtras extras = ((Extras) this.l.getD()).d;
        Intrinsics.h(extras, "extras");
        contentPageViewModelI1.t = extras;
        BuildersKt.c(ViewModelKt.a(contentPageViewModelI1), null, null, new ContentPageViewModel$fetchContentPage$1(contentPageViewModelI1, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ContentPageFragment contentPageFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-2071687033, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ContentPageFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ContentPageFragment contentPageFragment2 = contentPageFragment;
                                c cVar = contentPageFragment2.I1().u;
                                MutableState mutableStateA = SnapshotStateKt.a(contentPageFragment2.I1().s, composer2);
                                Flow flow = contentPageFragment2.I1().r;
                                ContentPageViewModel contentPageViewModelI1 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI = composer2.I(contentPageViewModelI1);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$1$1 contentPageFragment$onCreateView$1$1$1$1$1 = new ContentPageFragment$onCreateView$1$1$1$1$1(2, contentPageViewModelI1, ContentPageViewModel.class, "onVerticalListItemClick", "onVerticalListItemClick(Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListData;Lau/com/woolworths/shop/aem/components/model/verticallist/VerticalListItem;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$1$1);
                                    objG = contentPageFragment$onCreateView$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI12 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(contentPageViewModelI12);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$2$1 contentPageFragment$onCreateView$1$1$1$2$1 = new ContentPageFragment$onCreateView$1$1$1$2$1(1, contentPageViewModelI12, ContentPageViewModel.class, "onEditorialBannerClick", "onEditorialBannerClick(Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerData;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$2$1);
                                    objG2 = contentPageFragment$onCreateView$1$1$1$2$1;
                                }
                                KFunction kFunction2 = (KFunction) objG2;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI13 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(contentPageViewModelI13);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new ContentPageFragment$onCreateView$1$1$1$3$1(0, contentPageViewModelI13, ContentPageViewModel.class, "onSnackbarShown", "onSnackbarShown()V", 0);
                                    composer2.A(objG3);
                                }
                                KFunction kFunction3 = (KFunction) objG3;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI14 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(contentPageViewModelI14);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new ContentPageFragment$onCreateView$1$1$1$4$1(1, contentPageViewModelI14, ContentPageViewModel.class, "onSnackBarActionLabelClicked", "onSnackBarActionLabelClicked(Lau/com/woolworths/feature/shop/contentpage/data/SnackBarActionEvent;)V", 0);
                                    composer2.A(objG4);
                                }
                                KFunction kFunction4 = (KFunction) objG4;
                                composer2.l();
                                boolean zBooleanValue = ((Boolean) contentPageFragment2.m.getD()).booleanValue();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(contentPageFragment2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$5$1 contentPageFragment$onCreateView$1$1$1$5$1 = new ContentPageFragment$onCreateView$1$1$1$5$1(0, contentPageFragment2, ContentPageFragment.class, "onCartClicked", "onCartClicked()V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$5$1);
                                    objG5 = contentPageFragment$onCreateView$1$1$1$5$1;
                                }
                                KFunction kFunction5 = (KFunction) objG5;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(contentPageFragment2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$6$1 contentPageFragment$onCreateView$1$1$1$6$1 = new ContentPageFragment$onCreateView$1$1$1$6$1(0, contentPageFragment2, ContentPageFragment.class, "onSearchClicked", "onSearchClicked()V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$6$1);
                                    objG6 = contentPageFragment$onCreateView$1$1$1$6$1;
                                }
                                KFunction kFunction6 = (KFunction) objG6;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI15 = contentPageFragment2.I1();
                                ContentPageViewModel contentPageViewModelI16 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(contentPageViewModelI16);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new ContentPageFragment$onCreateView$1$1$1$7$1(1, contentPageViewModelI16, ContentPageViewModel.class, "onHorizontalListVisibilityUpdate", "onHorizontalListVisibilityUpdate(Ljava/util/Set;)V", 0);
                                    composer2.A(objG7);
                                }
                                KFunction kFunction7 = (KFunction) objG7;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI17 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(contentPageViewModelI17);
                                Object objG8 = composer2.G();
                                if (zI8 || objG8 == composer$Companion$Empty$1) {
                                    objG8 = new ContentPageFragment$onCreateView$1$1$1$8$1(2, contentPageViewModelI17, ContentPageViewModel.class, "onHorizontalListItemVisibilityImpression", "onHorizontalListItemVisibilityImpression(Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;I)V", 0);
                                    composer2.A(objG8);
                                }
                                KFunction kFunction8 = (KFunction) objG8;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI18 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(contentPageViewModelI18);
                                Object objG9 = composer2.G();
                                if (zI9 || objG9 == composer$Companion$Empty$1) {
                                    objG9 = new ContentPageFragment$onCreateView$1$1$1$9$1(1, contentPageViewModelI18, ContentPageViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(objG9);
                                }
                                KFunction kFunction9 = (KFunction) objG9;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(contentPageFragment2);
                                Object objG10 = composer2.G();
                                if (zI10 || objG10 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$10$1 contentPageFragment$onCreateView$1$1$1$10$1 = new ContentPageFragment$onCreateView$1$1$1$10$1(2, contentPageFragment2, ContentPageFragment.class, "launchAddToListBottomSheet", "launchAddToListBottomSheet(Lau/com/woolworths/android/onesite/analytics/Screen;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$10$1);
                                    objG10 = contentPageFragment$onCreateView$1$1$1$10$1;
                                }
                                KFunction kFunction10 = (KFunction) objG10;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI11 = composer2.I(contentPageFragment2);
                                Object objG11 = composer2.G();
                                if (zI11 || objG11 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$11$1 contentPageFragment$onCreateView$1$1$1$11$1 = new ContentPageFragment$onCreateView$1$1$1$11$1(2, contentPageFragment2, ContentPageFragment.class, "launchAddToCartBottomSheet", "launchAddToCartBottomSheet(Lau/com/woolworths/android/onesite/analytics/Screen;Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$11$1);
                                    objG11 = contentPageFragment$onCreateView$1$1$1$11$1;
                                }
                                KFunction kFunction11 = (KFunction) objG11;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI19 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI12 = composer2.I(contentPageViewModelI19);
                                Object objG12 = composer2.G();
                                if (zI12 || objG12 == composer$Companion$Empty$1) {
                                    objG12 = new ContentPageFragment$onCreateView$1$1$1$12$1(1, contentPageViewModelI19, ContentPageViewModel.class, "processActivityResult", "processActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
                                    composer2.A(objG12);
                                }
                                KFunction kFunction12 = (KFunction) objG12;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI110 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI13 = composer2.I(contentPageViewModelI110);
                                Object objG13 = composer2.G();
                                if (zI13 || objG13 == composer$Companion$Empty$1) {
                                    objG13 = new ContentPageFragment$onCreateView$1$1$1$13$1(1, contentPageViewModelI110, ContentPageViewModel.class, "onHeroBannerClick", "onHeroBannerClick(Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBanner;)V", 0);
                                    composer2.A(objG13);
                                }
                                KFunction kFunction13 = (KFunction) objG13;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI111 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI14 = composer2.I(contentPageViewModelI111);
                                Object objG14 = composer2.G();
                                if (zI14 || objG14 == composer$Companion$Empty$1) {
                                    objG14 = new ContentPageFragment$onCreateView$1$1$1$14$1(1, contentPageViewModelI111, ContentPageViewModel.class, "onHeroBannerTermsAndConditionClick", "onHeroBannerTermsAndConditionClick(Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBanner;)V", 0);
                                    composer2.A(objG14);
                                }
                                KFunction kFunction14 = (KFunction) objG14;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI112 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI15 = composer2.I(contentPageViewModelI112);
                                Object objG15 = composer2.G();
                                if (zI15 || objG15 == composer$Companion$Empty$1) {
                                    objG15 = new ContentPageFragment$onCreateView$1$1$1$15$1(1, contentPageViewModelI112, ContentPageViewModel.class, "onBroadcastBannerClicked", "onBroadcastBannerClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                                    composer2.A(objG15);
                                }
                                KFunction kFunction15 = (KFunction) objG15;
                                composer2.l();
                                ContentPageViewModel contentPageViewModelI113 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI16 = composer2.I(contentPageViewModelI113);
                                Object objG16 = composer2.G();
                                if (zI16 || objG16 == composer$Companion$Empty$1) {
                                    objG16 = new ContentPageFragment$onCreateView$1$1$1$16$1(1, contentPageViewModelI113, ContentPageViewModel.class, "onBroadcastDismissClicked", "onBroadcastDismissClicked(Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;)V", 0);
                                    composer2.A(objG16);
                                }
                                KFunction kFunction16 = (KFunction) objG16;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI17 = composer2.I(contentPageFragment2);
                                Object objG17 = composer2.G();
                                if (zI17 || objG17 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$17$1 contentPageFragment$onCreateView$1$1$1$17$1 = new ContentPageFragment$onCreateView$1$1$1$17$1(1, contentPageFragment2, ContentPageFragment.class, "launchProductDetails", "launchProductDetails(Ljava/lang/String;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$17$1);
                                    objG17 = contentPageFragment$onCreateView$1$1$1$17$1;
                                }
                                KFunction kFunction17 = (KFunction) objG17;
                                composer2.l();
                                FeatureToggleManager featureToggleManager = contentPageFragment2.i;
                                if (featureToggleManager == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                boolean zC = featureToggleManager.c(BaseShopAppFeature.w);
                                ContentPageViewModel contentPageViewModelI114 = contentPageFragment2.I1();
                                composer2.o(5004770);
                                boolean zI18 = composer2.I(contentPageFragment2);
                                Object objG18 = composer2.G();
                                if (zI18 || objG18 == composer$Companion$Empty$1) {
                                    ContentPageFragment$onCreateView$1$1$1$18$1 contentPageFragment$onCreateView$1$1$1$18$1 = new ContentPageFragment$onCreateView$1$1$1$18$1(1, contentPageFragment2, ContentPageFragment.class, "openInStoreMap", "openInStoreMap(Lau/com/woolworths/product/models/ProductCard;)V", 0);
                                    composer2.A(contentPageFragment$onCreateView$1$1$1$18$1);
                                    objG18 = contentPageFragment$onCreateView$1$1$1$18$1;
                                }
                                KFunction kFunction18 = (KFunction) objG18;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI19 = composer2.I(contentPageFragment2);
                                Object objG19 = composer2.G();
                                if (zI19 || objG19 == composer$Companion$Empty$1) {
                                    objG19 = new a(contentPageFragment2, 0);
                                    composer2.A(objG19);
                                }
                                Function0 function0 = (Function0) objG19;
                                composer2.l();
                                Function2 function2 = (Function2) kFunction;
                                Function1 function1 = (Function1) kFunction7;
                                Function2 function22 = (Function2) kFunction8;
                                composer2.o(5004770);
                                boolean zI20 = composer2.I(contentPageFragment2);
                                Object objG20 = composer2.G();
                                if (zI20 || objG20 == composer$Companion$Empty$1) {
                                    objG20 = new a(contentPageFragment2, 3);
                                    composer2.A(objG20);
                                }
                                composer2.l();
                                ContentPageScreenKt.b(mutableStateA, flow, function0, function2, function1, function22, (Function0) objG20, (Function1) kFunction2, (Function0) kFunction3, zBooleanValue, (Function0) kFunction5, (Function0) kFunction6, (Function1) kFunction18, contentPageViewModelI15, cVar, (Function1) kFunction4, (Function1) kFunction9, (Function1) kFunction12, (Function1) kFunction17, zC, (Function2) kFunction11, (Function2) kFunction10, (Function1) kFunction13, (Function1) kFunction14, (Function1) kFunction15, (Function1) kFunction16, contentPageViewModelI114, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -350260673));
        return composeView;
    }
}
