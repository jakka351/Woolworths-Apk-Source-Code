package au.com.woolworths.shop.lists.ui.substitutions;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$handleActions$1", f = "ViewSimilarProductsActivity.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ViewSimilarProductsActivity$handleActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ViewSimilarProductsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsActivity$handleActions$1(ViewSimilarProductsActivity viewSimilarProductsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = viewSimilarProductsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewSimilarProductsActivity$handleActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewSimilarProductsActivity$handleActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ViewSimilarProductsActivity.C;
            final ViewSimilarProductsActivity viewSimilarProductsActivity = this.q;
            Flow flow = viewSimilarProductsActivity.T4().n;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$handleActions$1.1
                /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws NumberFormatException {
                    InfoSheet infoSheet;
                    String title;
                    InStoreAvailabilityInfo inStoreAvailabilityInfo;
                    InfoSheet infoSheet2;
                    String message;
                    ViewSimilarProductsContract.Action action = (ViewSimilarProductsContract.Action) obj2;
                    boolean z = action instanceof ViewSimilarProductsContract.Action.LaunchProductSearch;
                    ViewSimilarProductsActivity viewSimilarProductsActivity2 = viewSimilarProductsActivity;
                    if (z) {
                        String str = ((ViewSimilarProductsContract.Action.LaunchProductSearch) action).f12479a;
                        int i3 = ViewSimilarProductsActivity.C;
                        Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                        intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasBySearch(str, (List) null, (String) null, Activities.ProductList.ProductListType.G, 14), (Activities.ProductList.ExtrasConfig) null, 12));
                        viewSimilarProductsActivity2.startActivity(intentA);
                    } else if (action instanceof ViewSimilarProductsContract.Action.DisplayAddToCartBottomSheet) {
                        ProductCard productCard = ((ViewSimilarProductsContract.Action.DisplayAddToCartBottomSheet) action).f12473a;
                        int i4 = ViewSimilarProductsActivity.C;
                        FragmentManager supportFragmentManager = viewSimilarProductsActivity2.getSupportFragmentManager();
                        Object obj3 = ListsAnalytics.ViewSimilarItems.e.get("app.Section");
                        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.String");
                        AddToCartBottomSheetFragment.Companion.a(supportFragmentManager, new AddToCartBottomSheetFragment.Extras(productCard, false, new AddToCartBottomSheetFragment.ProductBottomSheetHostScreen("View Similar Items screen", (String) obj3, "viewsimilaritems_screen"), (ProductCard) null, 24));
                    } else if (action instanceof ViewSimilarProductsContract.Action.FinishWithNoResult) {
                        viewSimilarProductsActivity2.finish();
                    } else if (action instanceof ViewSimilarProductsContract.Action.FinishWithResult) {
                        ViewSimilarProductsContract.Action.FinishWithResult finishWithResult = (ViewSimilarProductsContract.Action.FinishWithResult) action;
                        int i5 = ViewSimilarProductsActivity.C;
                        ViewSimilarProductsContract.ResultStatus resultStatus = ViewSimilarProductsContract.ResultStatus.d;
                        if (ViewSimilarProductsActivity.WhenMappings.f12472a[0] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Activities.ViewSimilarProductsActivity.Status status = Activities.ViewSimilarProductsActivity.Status.d;
                        String str2 = finishWithResult.f12477a;
                        Intent intent = new Intent();
                        intent.putExtra("EXTRA_RESULT", new Activities.ViewSimilarProductsActivity.Result(status, str2));
                        viewSimilarProductsActivity2.setResult(-1, intent);
                        viewSimilarProductsActivity2.finish();
                    } else if (action instanceof ViewSimilarProductsContract.Action.DisplayAddToListBottomSheet) {
                        ProductCard productCard2 = ((ViewSimilarProductsContract.Action.DisplayAddToListBottomSheet) action).f12474a;
                        int i6 = ViewSimilarProductsActivity.C;
                        AddToListBottomSheetFragment.Companion.a(viewSimilarProductsActivity2.getSupportFragmentManager(), null, new Screen() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$displayAddToListBottomSheet$1
                            public final String d;
                            public final String e;

                            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                            {
                                ListsAnalytics.ViewSimilarItems viewSimilarItems = ListsAnalytics.ViewSimilarItems.d;
                                this.d = "View Similar Items screen";
                                Object obj4 = ListsAnalytics.ViewSimilarItems.e.get("app.Section");
                                Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.String");
                                this.e = (String) obj4;
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
                        }, CollectionsKt.Q(new AddToListProductParameters(productCard2, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard2), true, null, null, 914);
                    } else if (action instanceof ViewSimilarProductsContract.Action.DisplaySeeInStoreBottomSheet) {
                        ProductCard productCard3 = ((ViewSimilarProductsContract.Action.DisplaySeeInStoreBottomSheet) action).f12475a;
                        int i7 = ViewSimilarProductsActivity.C;
                        InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard3.getInStoreAvailabilityInfo();
                        if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard3.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                            ProductMessageBottomSheetFragment.Companion.a(viewSimilarProductsActivity2.getSupportFragmentManager(), productCard3, title, message, new Screen() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$displaySeeInStoreBottomSheet$1
                                public final String d;
                                public final String e;

                                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                                {
                                    ListsAnalytics.ViewSimilarItems viewSimilarItems = ListsAnalytics.ViewSimilarItems.d;
                                    this.d = "View Similar Items screen";
                                    Object obj4 = ListsAnalytics.ViewSimilarItems.e.get("app.Section");
                                    Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.String");
                                    this.e = (String) obj4;
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
                            }, null);
                        }
                    } else {
                        if (!(action instanceof ViewSimilarProductsContract.Action.LaunchProductDetailsScreen)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductCard productCard4 = ((ViewSimilarProductsContract.Action.LaunchProductDetailsScreen) action).f12478a;
                        ShopAppNavigator shopAppNavigator = viewSimilarProductsActivity2.x;
                        if (shopAppNavigator == null) {
                            Intrinsics.p("shopAppNavigator");
                            throw null;
                        }
                        shopAppNavigator.d(productCard4.getProductId());
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
