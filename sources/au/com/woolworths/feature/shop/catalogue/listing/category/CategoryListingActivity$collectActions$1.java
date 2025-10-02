package au.com.woolworths.feature.shop.catalogue.listing.category;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$collectActions$1", f = "CategoryListingActivity.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CategoryListingActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CategoryListingActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CategoryListingContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            CategoryListingContract.Action action = (CategoryListingContract.Action) obj;
            CategoryListingActivity categoryListingActivity = (CategoryListingActivity) this.d;
            int i = CategoryListingActivity.A;
            categoryListingActivity.getClass();
            if (action instanceof CategoryListingContract.Action.LaunchProductDetails) {
                ProductCard productCard = ((CategoryListingContract.Action.LaunchProductDetails) action).f6867a;
                ShopAppNavigator shopAppNavigator = categoryListingActivity.y;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(productCard.getProductId());
            } else if (action instanceof CategoryListingContract.Action.LaunchProductBottomSheet) {
                ProductCard productCard2 = ((CategoryListingContract.Action.LaunchProductBottomSheet) action).f6866a;
                FragmentManager supportFragmentManager = categoryListingActivity.getSupportFragmentManager();
                Object obj3 = CatalogueAnalytics.Listing.d;
                AddToCartBottomSheetFragment.Companion.b(supportFragmentManager, productCard2, new Screen() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$toHostScreen$1
                    public final String d;

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
                    {
                        Object obj4 = CatalogueAnalytics.Listing.d;
                        this.d = String.valueOf(CatalogueAnalytics.Listing.d.get("app.Section"));
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: a, reason: from getter */
                    public final String getD() {
                        return this.d;
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: b */
                    public final String getF() {
                        Object obj4 = CatalogueAnalytics.Listing.d;
                        return "cataloguelist_screen";
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: d */
                    public final String getD() {
                        return "Catalogue List screen";
                    }
                });
            } else if (action instanceof CategoryListingContract.Action.LaunchListsBottomSheet) {
                ProductCard productCard3 = ((CategoryListingContract.Action.LaunchListsBottomSheet) action).f6865a;
                FragmentManager supportFragmentManager2 = categoryListingActivity.getSupportFragmentManager();
                Object obj4 = CatalogueAnalytics.Listing.d;
                AddToListBottomSheetFragment.Companion.a(supportFragmentManager2, null, new Screen() { // from class: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity$toHostScreen$1
                    public final String d;

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
                    {
                        Object obj42 = CatalogueAnalytics.Listing.d;
                        this.d = String.valueOf(CatalogueAnalytics.Listing.d.get("app.Section"));
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: a, reason: from getter */
                    public final String getD() {
                        return this.d;
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: b */
                    public final String getF() {
                        Object obj42 = CatalogueAnalytics.Listing.d;
                        return "cataloguelist_screen";
                    }

                    @Override // au.com.woolworths.android.onesite.analytics.Screen
                    /* renamed from: d */
                    public final String getD() {
                        return "Catalogue List screen";
                    }
                }, CollectionsKt.Q(new AddToListProductParameters(productCard3, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard3), true, null, null, 914);
            } else {
                if (!(action instanceof CategoryListingContract.Action.LaunchViewShoppingList)) {
                    throw new NoWhenBranchMatchedException();
                }
                categoryListingActivity.startActivity(Activities.ShoppingListDetails.f4535a.b(((CategoryListingContract.Action.LaunchViewShoppingList) action).f6868a, false));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingActivity$collectActions$1(CategoryListingActivity categoryListingActivity, Continuation continuation) {
        super(2, continuation);
        this.q = categoryListingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CategoryListingActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CategoryListingActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = CategoryListingActivity.A;
            CategoryListingActivity categoryListingActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, categoryListingActivity, CategoryListingActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingContract$Action;)V", 4), FlowExtKt.a(categoryListingActivity.O4().i, categoryListingActivity.getD(), Lifecycle.State.g));
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
