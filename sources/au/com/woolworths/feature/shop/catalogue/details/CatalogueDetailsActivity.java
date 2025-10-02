package au.com.woolworths.feature.shop.catalogue.details;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shared.instore.wifi.ui.b;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsContract;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extra", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueDetailsActivity extends Hilt_CatalogueDetailsActivity {
    public static final /* synthetic */ int B = 0;
    public CatalogueDetailsPagerAdapter A;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CatalogueDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy y = LazyKt.b(new f(this, 11));
    public ActivityCatalogueDetailsBinding z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsActivity$Companion;", "", "", "EXTRA_CATALOGUE_DETAILS", "Ljava/lang/String;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(Context context, Extra extra) {
            Intrinsics.h(context, "context");
            Intent intent = new Intent(context, (Class<?>) CatalogueDetailsActivity.class);
            intent.putExtra("extra_catalogue_details", extra);
            context.startActivity(intent);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final String d;
        public final CatalogueTracking e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extra(parcel.readInt() == 0 ? null : CatalogueTracking.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(CatalogueTracking catalogueTracking, String id) {
            Intrinsics.h(id, "id");
            this.d = id;
            this.e = catalogueTracking;
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
            return Intrinsics.c(this.d, extra.d) && Intrinsics.c(this.e, extra.e);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            CatalogueTracking catalogueTracking = this.e;
            return iHashCode + (catalogueTracking == null ? 0 : catalogueTracking.hashCode());
        }

        public final String toString() {
            return "Extra(id=" + this.d + ", tracking=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            CatalogueTracking catalogueTracking = this.e;
            if (catalogueTracking == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                catalogueTracking.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CatalogueDetailsContract.PageState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CatalogueDetailsContract.PageState pageState = CatalogueDetailsContract.PageState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CatalogueDetailsContract.PageState pageState2 = CatalogueDetailsContract.PageState.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$onCreate$2", f = "CatalogueDetailsActivity.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/catalogue/details/CatalogueDetailsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$onCreate$2$1", f = "CatalogueDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<CatalogueDetailsContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ CatalogueDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CatalogueDetailsActivity catalogueDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = catalogueDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CatalogueDetailsContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CatalogueDetailsContract.Actions actions = (CatalogueDetailsContract.Actions) this.p;
                int i = CatalogueDetailsActivity.B;
                boolean z = actions instanceof CatalogueDetailsContract.Actions.LaunchCatalogueProductList;
                CatalogueDetailsActivity catalogueDetailsActivity = this.q;
                if (z) {
                    CatalogueDetailsContract.Actions.LaunchCatalogueProductList launchCatalogueProductList = (CatalogueDetailsContract.Actions.LaunchCatalogueProductList) actions;
                    CatalogueProductListActivity.Extra extra = new CatalogueProductListActivity.Extra(launchCatalogueProductList.f6820a, launchCatalogueProductList.b, launchCatalogueProductList.c, launchCatalogueProductList.d);
                    Intent intent = new Intent(catalogueDetailsActivity, (Class<?>) CatalogueProductListActivity.class);
                    intent.putExtra("extra_product_list", extra);
                    catalogueDetailsActivity.startActivity(intent);
                } else if (actions instanceof CatalogueDetailsContract.Actions.LaunchWebUrl) {
                    ContextExtKt.j(catalogueDetailsActivity, ((CatalogueDetailsContract.Actions.LaunchWebUrl) actions).f6824a, null, null, null, 62);
                } else if (actions instanceof CatalogueDetailsContract.Actions.LaunchRecipeDetails) {
                    catalogueDetailsActivity.startActivity(Activities.RecipeDetails.b(((CatalogueDetailsContract.Actions.LaunchRecipeDetails) actions).f6823a));
                } else if (actions instanceof CatalogueDetailsContract.Actions.LaunchProductList) {
                    Activities.ProductList.Extras extras = ((CatalogueDetailsContract.Actions.LaunchProductList) actions).f6822a;
                    Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                    intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", extras);
                    catalogueDetailsActivity.startActivity(intentA);
                } else {
                    if (!(actions instanceof CatalogueDetailsContract.Actions.LaunchDeepLink)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    catalogueDetailsActivity.startActivity(ShopAppDeepLink.a(CatalogueScreen.e, ((CatalogueDetailsContract.Actions.LaunchDeepLink) actions).f6821a));
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CatalogueDetailsActivity.this.new AnonymousClass2(continuation);
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
                int i2 = CatalogueDetailsActivity.B;
                CatalogueDetailsActivity catalogueDetailsActivity = CatalogueDetailsActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(catalogueDetailsActivity, null), FlowExtKt.a(catalogueDetailsActivity.O4().j, catalogueDetailsActivity.getD(), Lifecycle.State.g));
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

    public final CatalogueDetailsViewModel O4() {
        return (CatalogueDetailsViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.details.Hilt_CatalogueDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        this.z = (ActivityCatalogueDetailsBinding) DataBindingUtil.d(this, R.layout.activity_catalogue_details);
        this.A = new CatalogueDetailsPagerAdapter(O4());
        ActivityCatalogueDetailsBinding activityCatalogueDetailsBinding = this.z;
        if (activityCatalogueDetailsBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        ConstraintLayout contentView = activityCatalogueDetailsBinding.B;
        Intrinsics.g(contentView, "contentView");
        ViewExtKt.b(contentView, new b(16));
        activityCatalogueDetailsBinding.D(this);
        activityCatalogueDetailsBinding.L(O4());
        ViewPager viewPager = activityCatalogueDetailsBinding.A;
        CatalogueDetailsPagerAdapter catalogueDetailsPagerAdapter = this.A;
        if (catalogueDetailsPagerAdapter == null) {
            Intrinsics.p("catalogueDetailsPagerAdapter");
            throw null;
        }
        viewPager.setAdapter(catalogueDetailsPagerAdapter);
        setSupportActionBar(activityCatalogueDetailsBinding.E);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        O4().k.f(this, new CatalogueDetailsActivity$sam$androidx_lifecycle_Observer$0(new l(this, 16)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        if (!O4().g.b.z()) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_cart_only, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(CatalogueScreen.e);
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
        super.onResume();
        Extra extra = (Extra) this.y.getD();
        if (extra != null) {
            String str = extra.d;
            O4().p6(extra.e, str);
            CatalogueDetailsViewModel catalogueDetailsViewModelO4 = O4();
            if (catalogueDetailsViewModelO4.m != null) {
                catalogueDetailsViewModelO4.f.e(CatalogueScreen.e, TrackingMetadata.Companion.a(TrackableValue.x, str));
            }
        }
    }
}
