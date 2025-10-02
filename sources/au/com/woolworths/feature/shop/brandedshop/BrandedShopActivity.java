package au.com.woolworths.feature.shop.brandedshop;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.brandedshop.Effect;
import au.com.woolworths.feature.shop.brandedshop.UiEvent;
import au.com.woolworths.feature.shop.brandedshop.data.SnackbarContent;
import au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopHomeKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/BrandedShopActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopActivity extends Hilt_BrandedShopActivity implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int z = 0;
    public ShopAppNavigator x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(BrandedShopViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$onCreate$2", f = "BrandedShopActivity.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Effect, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
                Effect effect = (Effect) obj;
                BrandedShopActivity brandedShopActivity = (BrandedShopActivity) this.d;
                int i = BrandedShopActivity.z;
                brandedShopActivity.getClass();
                if (effect instanceof Effect.LaunchProductDetails) {
                    ProductCard productCard = ((Effect.LaunchProductDetails) effect).f6662a;
                    ShopAppNavigator shopAppNavigator = brandedShopActivity.x;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator.d(productCard.getProductId());
                } else if (effect instanceof Effect.LaunchAddToCartBottomSheet) {
                    ProductCard productCard2 = ((Effect.LaunchAddToCartBottomSheet) effect).f6659a;
                    FragmentManager supportFragmentManager = brandedShopActivity.getSupportFragmentManager();
                    final BrandedShopAnalytics.BrandedShop brandedShop = new BrandedShopAnalytics.BrandedShop(brandedShopActivity.O4().r6());
                    AddToCartBottomSheetFragment.Companion.b(supportFragmentManager, productCard2, new Screen(brandedShop) { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$toHostScreen$1
                        public final String d;
                        public final String e;

                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
                        {
                            this.d = brandedShop.d;
                            this.e = String.valueOf(brandedShop.f.get("app.Section"));
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: a, reason: from getter */
                        public final String getE() {
                            return this.e;
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: d, reason: from getter */
                        public final String getD() {
                            return this.d;
                        }
                    });
                } else if (effect instanceof Effect.LaunchListsBottomSheet) {
                    ProductCard productCard3 = ((Effect.LaunchListsBottomSheet) effect).f6661a;
                    FragmentManager supportFragmentManager2 = brandedShopActivity.getSupportFragmentManager();
                    final BrandedShopAnalytics.BrandedShop brandedShop2 = new BrandedShopAnalytics.BrandedShop(brandedShopActivity.O4().r6());
                    AddToListBottomSheetFragment.Companion.a(supportFragmentManager2, null, new Screen(brandedShop2) { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$toHostScreen$1
                        public final String d;
                        public final String e;

                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
                        {
                            this.d = brandedShop2.d;
                            this.e = String.valueOf(brandedShop2.f.get("app.Section"));
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: a, reason: from getter */
                        public final String getE() {
                            return this.e;
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: d, reason: from getter */
                        public final String getD() {
                            return this.d;
                        }
                    }, CollectionsKt.Q(new AddToListProductParameters(productCard3, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard3), true, null, null, 914);
                } else if (effect instanceof Effect.ViewShoppingList) {
                    brandedShopActivity.startActivity(Activities.ShoppingListDetails.f4535a.b(((Effect.ViewShoppingList) effect).f6664a, false));
                } else if (effect instanceof Effect.OpenLink) {
                    String str = ((Effect.OpenLink) effect).f6663a;
                    final BrandedShopAnalytics.BrandedShop brandedShop3 = new BrandedShopAnalytics.BrandedShop(brandedShopActivity.O4().r6());
                    brandedShopActivity.startActivity(ShopAppDeepLink.a(new Screen(brandedShop3) { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity$toHostScreen$1
                        public final String d;
                        public final String e;

                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
                        {
                            this.d = brandedShop3.d;
                            this.e = String.valueOf(brandedShop3.f.get("app.Section"));
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: a, reason: from getter */
                        public final String getE() {
                            return this.e;
                        }

                        @Override // au.com.woolworths.android.onesite.analytics.Screen
                        /* renamed from: d, reason: from getter */
                        public final String getD() {
                            return this.d;
                        }
                    }, str));
                } else {
                    if (!(effect instanceof Effect.LaunchInStoreMap)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ShopAppNavigator shopAppNavigator2 = brandedShopActivity.x;
                    if (shopAppNavigator2 == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator2.c(((Effect.LaunchInStoreMap) effect).f6660a);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BrandedShopActivity.this.new AnonymousClass2(continuation);
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
                int i2 = BrandedShopActivity.z;
                BrandedShopActivity brandedShopActivity = BrandedShopActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, brandedShopActivity, BrandedShopActivity.class, "handleEffect", "handleEffect(Lau/com/woolworths/feature/shop/brandedshop/Effect;)V", 4), FlowExtKt.a(brandedShopActivity.O4().n, brandedShopActivity.getD(), Lifecycle.State.g));
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

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return LifecycleOwnerKt.a(this);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            O4().t6(new UiEvent.OnSnackbarStateChanged(new SnackbarContent.AddToListSuccess((ListChangeEvent.AddToListSuccessEvent) listChangeEvent)));
        }
    }

    public final BrandedShopViewModel O4() {
        return (BrandedShopViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void j(ProductBottomSheetErrorCause productBottomSheetErrorCause) {
        O4().t6(new UiEvent.OnSnackbarStateChanged(new SnackbarContent.AddToCartError(productBottomSheetErrorCause)));
    }

    @Override // au.com.woolworths.feature.shop.brandedshop.Hilt_BrandedShopActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final BrandedShopActivity brandedShopActivity = BrandedShopActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1935846657, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                BrandedShopActivity brandedShopActivity2 = brandedShopActivity;
                                boolean zI = composer2.I(brandedShopActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    BrandedShopActivity$onCreate$1$1$1$1 brandedShopActivity$onCreate$1$1$1$1 = new BrandedShopActivity$onCreate$1$1$1$1(0, brandedShopActivity2, BrandedShopActivity.class, "finish", "finish()V", 0);
                                    composer2.A(brandedShopActivity$onCreate$1$1$1$1);
                                    objG = brandedShopActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(brandedShopActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    BrandedShopActivity$onCreate$1$1$2$1 brandedShopActivity$onCreate$1$1$2$1 = new BrandedShopActivity$onCreate$1$1$2$1(0, brandedShopActivity2, BrandedShopActivity.class, "onSearchClicked", "onSearchClicked()V", 0);
                                    composer2.A(brandedShopActivity$onCreate$1$1$2$1);
                                    objG2 = brandedShopActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(brandedShopActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    BrandedShopActivity$onCreate$1$1$3$1 brandedShopActivity$onCreate$1$1$3$1 = new BrandedShopActivity$onCreate$1$1$3$1(0, brandedShopActivity2, BrandedShopActivity.class, "onCartClicked", "onCartClicked()V", 0);
                                    composer2.A(brandedShopActivity$onCreate$1$1$3$1);
                                    objG3 = brandedShopActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                int i = BrandedShopActivity.z;
                                BrandedShopViewModel brandedShopViewModelO4 = brandedShopActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(brandedShopViewModelO4);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    BrandedShopActivity$onCreate$1$1$4$1 brandedShopActivity$onCreate$1$1$4$1 = new BrandedShopActivity$onCreate$1$1$4$1(1, brandedShopViewModelO4, BrandedShopViewModel.class, "onUiEvent", "onUiEvent(Lau/com/woolworths/feature/shop/brandedshop/UiEvent;)V", 0);
                                    composer2.A(brandedShopActivity$onCreate$1$1$4$1);
                                    objG4 = brandedShopActivity$onCreate$1$1$4$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG4);
                                BrandedShopViewModel brandedShopViewModelO42 = brandedShopActivity2.O4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(brandedShopViewModelO42);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    BrandedShopActivity$onCreate$1$1$5$1 brandedShopActivity$onCreate$1$1$5$1 = new BrandedShopActivity$onCreate$1$1$5$1(1, brandedShopViewModelO42, BrandedShopViewModel.class, "onItemSeen", "onItemSeen(Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;)V", 0);
                                    composer2.A(brandedShopActivity$onCreate$1$1$5$1);
                                    objG5 = brandedShopActivity$onCreate$1$1$5$1;
                                }
                                composer2.l();
                                BrandedShopHomeKt.d(function0, function02, function03, function1, (Function1) ((KFunction) objG5), brandedShopActivity2.O4(), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1441677639));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        Intent intent = getIntent();
        Activities.BrandedShopActivity.Extras extras = intent != null ? (Activities.BrandedShopActivity.Extras) intent.getParcelableExtra("EXTRA_CONTENT_ID") : null;
        if (extras == null) {
            extras = null;
        }
        String str = extras != null ? extras.d : null;
        BrandedShopViewModel brandedShopViewModelO4 = O4();
        BrandedShopViewModel.v6(brandedShopViewModelO4, true, null, null, null, null, 30);
        BuildersKt.c(ViewModelKt.a(brandedShopViewModelO4), null, null, new BrandedShopViewModel$fetchBrandedShopDetails$1(brandedShopViewModelO4, str, null), 3);
    }
}
