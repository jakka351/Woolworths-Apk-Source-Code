package au.com.woolworths.feature.shop.catalogue.productlist;

import YU.a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.q;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueProductListBinding;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductBoostContract;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Extra", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueProductListActivity extends Hilt_CatalogueProductListActivity implements AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int F = 0;
    public ActivityCatalogueProductListBinding A;
    public CatalogueProductListAdapter B;
    public Extra C;
    public final ViewModelLazy D;
    public final ViewModelLazy E;
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ShopAppNavigator z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListActivity$Companion;", "", "", "EXTRA_PRODUCT_LIST", "Ljava/lang/String;", "", "UPDATE_CART_SNACKBAR_DURATION_MS", "J", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;
        public final CatalogueTracking g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CatalogueTracking.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(String itemId, String itemName, String storeId, CatalogueTracking catalogueTracking) {
            Intrinsics.h(itemId, "itemId");
            Intrinsics.h(itemName, "itemName");
            Intrinsics.h(storeId, "storeId");
            this.d = itemId;
            this.e = itemName;
            this.f = storeId;
            this.g = catalogueTracking;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extra)) {
                return false;
            }
            Extra extra = (Extra) obj;
            return Intrinsics.c(this.d, extra.d) && Intrinsics.c(this.e, extra.e) && Intrinsics.c(this.f, extra.f) && Intrinsics.c(this.g, extra.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            CatalogueTracking catalogueTracking = this.g;
            return iC + (catalogueTracking == null ? 0 : catalogueTracking.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("Extra(itemId=", this.d, ", itemName=", this.e, ", storeId=");
            sbV.append(this.f);
            sbV.append(", tracking=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            CatalogueTracking catalogueTracking = this.g;
            if (catalogueTracking == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                catalogueTracking.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3", f = "CatalogueProductListActivity.kt", l = {113, 118}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CatalogueProductListContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
                InfoSheet infoSheet;
                String title;
                InStoreAvailabilityInfo inStoreAvailabilityInfo;
                InfoSheet infoSheet2;
                String message;
                CatalogueProductListContract.Action action = (CatalogueProductListContract.Action) obj;
                CatalogueProductListActivity catalogueProductListActivity = (CatalogueProductListActivity) this.d;
                int i = CatalogueProductListActivity.F;
                if (action instanceof CatalogueProductListContract.Action.LaunchCatalogueProductDetails) {
                    ShopAppNavigator shopAppNavigator = catalogueProductListActivity.z;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator.d(((CatalogueProductListContract.Action.LaunchCatalogueProductDetails) action).f6912a.c);
                } else if (action instanceof CatalogueProductListContract.Action.LaunchAddToList) {
                    CatalogueProductListContract.Action.LaunchAddToList launchAddToList = (CatalogueProductListContract.Action.LaunchAddToList) action;
                    AddToListBottomSheetFragment.Companion.a(catalogueProductListActivity.getSupportFragmentManager(), null, CatalogueScreen.i, CollectionsKt.Q(new AddToListProductParameters(launchAddToList.f6910a, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(launchAddToList.f6910a), true, null, null, 914);
                } else {
                    catalogueProductListActivity.getClass();
                    if (action instanceof CatalogueProductListContract.Action.LaunchProductBottomSheet) {
                        AddToCartBottomSheetFragment.Companion.a(catalogueProductListActivity.getSupportFragmentManager(), new AddToCartBottomSheetFragment.Extras(((CatalogueProductListContract.Action.LaunchProductBottomSheet) action).f6915a, false, CatalogueScreen.i));
                    } else {
                        int i2 = 4;
                        if (action instanceof CatalogueProductListContract.Action.LaunchLoginForRestrictedPurchaseDialog) {
                            new AlertDialog.Builder(catalogueProductListActivity).setTitle(R.string.product_age_restricted_item_prompt_title).setMessage(R.string.product_age_restricted_item_prompt_message).setPositiveButton(R.string.login_action, new au.com.woolworths.base.wallet.digipay.framesview.a(catalogueProductListActivity, 6)).setNegativeButton(R.string.cancel, new q(i2)).create().show();
                        } else if (action instanceof CatalogueProductListContract.Action.LaunchSimpleRestrictedPurchaseDialog) {
                            new AlertDialog.Builder(catalogueProductListActivity).setTitle(R.string.product_age_restricted_item_prompt_title).setMessage(R.string.product_age_restricted_item_prompt_message_underage).setPositiveButton(R.string.ok, new q(i2)).create().show();
                        } else if (action instanceof CatalogueProductListContract.Action.LaunchAvailabilityMessageBottomSheet) {
                            ProductCard productCard = ((CatalogueProductListContract.Action.LaunchAvailabilityMessageBottomSheet) action).f6911a;
                            InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard.getInStoreAvailabilityInfo();
                            if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                                ProductMessageBottomSheetFragment.Companion.a(catalogueProductListActivity.getSupportFragmentManager(), productCard, title, message, CatalogueScreen.i, null);
                            }
                        } else if (action instanceof CatalogueProductListContract.Action.LaunchInStoreMap) {
                            ProductCard productCard2 = ((CatalogueProductListContract.Action.LaunchInStoreMap) action).f6914a;
                            ShopAppNavigator shopAppNavigator2 = catalogueProductListActivity.z;
                            if (shopAppNavigator2 == null) {
                                Intrinsics.p("shopAppNavigator");
                                throw null;
                            }
                            shopAppNavigator2.c(productCard2);
                        } else {
                            if (!(action instanceof CatalogueProductListContract.Action.LaunchCheckStock)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ProductCard productCard3 = ((CatalogueProductListContract.Action.LaunchCheckStock) action).f6913a;
                            ShopAppNavigator shopAppNavigator3 = catalogueProductListActivity.z;
                            if (shopAppNavigator3 == null) {
                                Intrinsics.p("shopAppNavigator");
                                throw null;
                            }
                            if (productCard3 != null) {
                                shopAppNavigator3.b.startActivity(Activities.ProductAvailabilityActivity.f4502a.b(productCard3));
                            }
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<ProductBoostContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final ProductBoostContract.Action action = (ProductBoostContract.Action) obj;
                final CatalogueProductListActivity catalogueProductListActivity = (CatalogueProductListActivity) this.d;
                ActivityCatalogueProductListBinding activityCatalogueProductListBinding = catalogueProductListActivity.A;
                if (activityCatalogueProductListBinding == null) {
                    Intrinsics.p("activityBinding");
                    throw null;
                }
                View view = activityCatalogueProductListBinding.h;
                Intrinsics.g(view, "getRoot(...)");
                view.postDelayed(new Runnable() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$handleAction$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ProductBoostContract.Action action2 = action;
                        boolean z = action2 instanceof ProductBoostContract.Action.ShowSnackbar;
                        final CatalogueProductListActivity catalogueProductListActivity2 = catalogueProductListActivity;
                        if (z) {
                            ActivityCatalogueProductListBinding activityCatalogueProductListBinding2 = catalogueProductListActivity2.A;
                            if (activityCatalogueProductListBinding2 != null) {
                                Snackbar.j(null, activityCatalogueProductListBinding2.h, ((ProductBoostContract.Action.ShowSnackbar) action2).b, 0).l();
                                return;
                            } else {
                                Intrinsics.p("activityBinding");
                                throw null;
                            }
                        }
                        if (!(action2 instanceof ProductBoostContract.Action.ShowRetrySnackbar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivityCatalogueProductListBinding activityCatalogueProductListBinding3 = catalogueProductListActivity2.A;
                        if (activityCatalogueProductListBinding3 == null) {
                            Intrinsics.p("activityBinding");
                            throw null;
                        }
                        Snackbar snackbarJ = Snackbar.j(null, activityCatalogueProductListBinding3.h, ((ProductBoostContract.Action.ShowRetrySnackbar) action2).b, 0);
                        snackbarJ.k("Retry", new View.OnClickListener() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$handleAction$1$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.g(view2);
                                try {
                                    ProductBoostResultViewModel productBoostResultViewModel = (ProductBoostResultViewModel) catalogueProductListActivity2.E.getD();
                                    ProductBoostContract.Action action3 = action2;
                                    productBoostResultViewModel.p6(((ProductBoostContract.Action.ShowRetrySnackbar) action3).d, null, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).b, ((ProductBoostContract.Action.ShowRetrySnackbar) action3).c);
                                } finally {
                                    Callback.h();
                                }
                            }
                        });
                        snackbarJ.l();
                    }
                }, 4000L);
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CatalogueProductListActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.g(r1, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r11.p
                r2 = 2
                r3 = 1
                au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity r6 = au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity.this
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r12)
                goto L81
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.ResultKt.b(r12)
                goto L52
            L1e:
                kotlin.ResultKt.b(r12)
                int r12 = au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity.F
                au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel r12 = r6.O4()
                kotlinx.coroutines.flow.SharedFlowImpl r12 = r12.l
                kotlinx.coroutines.flow.SharedFlow r12 = kotlinx.coroutines.flow.FlowKt.a(r12)
                androidx.lifecycle.Lifecycle r1 = r6.getD()
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.h
                kotlinx.coroutines.flow.Flow r12 = androidx.lifecycle.FlowExtKt.a(r12, r1, r4)
                au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$1 r4 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$1
                java.lang.String r9 = "handleAction(Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$Action;)V"
                r10 = 4
                r5 = 2
                java.lang.Class<au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity> r7 = au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity.class
                java.lang.String r8 = "handleAction"
                r4.<init>(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
                r1.<init>(r4, r12)
                r11.p = r3
                java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.g(r1, r11)
                if (r12 != r0) goto L52
                goto L80
            L52:
                androidx.lifecycle.ViewModelLazy r12 = r6.E
                java.lang.Object r12 = r12.getD()
                au.com.woolworths.product.offers.ProductBoostResultViewModel r12 = (au.com.woolworths.product.offers.ProductBoostResultViewModel) r12
                kotlinx.coroutines.flow.SharedFlowImpl r12 = r12.g
                androidx.lifecycle.Lifecycle r1 = r6.getD()
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.h
                kotlinx.coroutines.flow.Flow r12 = androidx.lifecycle.FlowExtKt.a(r12, r1, r3)
                au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$2 r4 = new au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$onCreate$3$2
                java.lang.String r9 = "handleAction(Lau/com/woolworths/product/offers/ProductBoostContract$Action;)V"
                r10 = 4
                r5 = 2
                java.lang.Class<au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity> r7 = au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity.class
                java.lang.String r8 = "handleAction"
                r4.<init>(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
                r1.<init>(r4, r12)
                r11.p = r2
                java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.g(r1, r11)
                if (r12 != r0) goto L81
            L80:
                return r0
            L81:
                kotlin.Unit r12 = kotlin.Unit.f24250a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CatalogueProductListActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.D = new ViewModelLazy(reflectionFactory.b(CatalogueProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.E = new ViewModelLazy(reflectionFactory.b(ProductBoostResultViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(O4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            ActivityCatalogueProductListBinding activityCatalogueProductListBinding = this.A;
            if (activityCatalogueProductListBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            View view = activityCatalogueProductListBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            ListChangeEventKt.a(addToListSuccessEvent, this, view, false, 28);
        }
    }

    public final CatalogueProductListViewModel O4() {
        return (CatalogueProductListViewModel) this.D.getD();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.Hilt_CatalogueProductListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Extra extra;
        super.onCreate(bundle);
        ActivityCatalogueProductListBinding activityCatalogueProductListBinding = (ActivityCatalogueProductListBinding) DataBindingUtil.d(this, R.layout.activity_catalogue_product_list);
        this.A = activityCatalogueProductListBinding;
        if (activityCatalogueProductListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityCatalogueProductListBinding.C);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        this.B = new CatalogueProductListAdapter(O4());
        ActivityCatalogueProductListBinding activityCatalogueProductListBinding2 = this.A;
        if (activityCatalogueProductListBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityCatalogueProductListBinding2.D(this);
        activityCatalogueProductListBinding2.L(O4());
        RecyclerView recyclerView = activityCatalogueProductListBinding2.y;
        CatalogueProductListAdapter catalogueProductListAdapter = this.B;
        if (catalogueProductListAdapter == null) {
            Intrinsics.p("recyclerViewAdapter");
            throw null;
        }
        recyclerView.setAdapter(catalogueProductListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Context context = recyclerView.getContext();
        Intrinsics.g(context, "getContext(...)");
        recyclerView.i(new DefaultDividerItemDecoration(context));
        ViewExtKt.a(recyclerView);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (extra = (Extra) extras.getParcelable("extra_product_list")) == null) {
            throw new IllegalArgumentException("Catalogue product details intent extra must be provided");
        }
        this.C = extra;
        O4().u6(extra.f, extra.d, extra.e, extra.g);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        if (!O4().j.b.z()) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_cart_only, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(CatalogueScreen.i);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        TrackableValue trackableValue = TrackableValue.A;
        Extra extra = this.C;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, extra.d);
        Extra extra2 = this.C;
        if (extra2 == null) {
            Intrinsics.p("extra");
            throw null;
        }
        CatalogueTracking catalogueTracking = extra2.g;
        if (catalogueTracking != null && (str = catalogueTracking.d) != null) {
            trackingMetadataA.b(TrackableValue.x, str);
        }
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.e(CatalogueScreen.i, trackingMetadataA);
        O4().k.f(this, new CatalogueProductListActivity$sam$androidx_lifecycle_Observer$0(new l(this, 17)));
    }
}
