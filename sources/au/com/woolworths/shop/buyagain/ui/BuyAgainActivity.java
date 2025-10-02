package au.com.woolworths.shop.buyagain.ui;

import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.offers.ProductBoostResultViewModel;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainActivity extends Hilt_BuyAgainActivity implements AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int D = 0;
    public final ViewModelLazy A;
    public final ViewModelLazy B;
    public final ActivityResultLauncher C;
    public FeatureToggleManager x;
    public CollectionModeInteractor y;
    public ShopAppNavigator z;

    public BuyAgainActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.A = new ViewModelLazy(reflectionFactory.b(BuyAgainViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new ViewModelLazy(reflectionFactory.b(ProductBoostResultViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.C = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 14));
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(O4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            View viewFindViewById = findViewById(R.id.content);
            Intrinsics.g(viewFindViewById, "findViewById(...)");
            ListChangeEventKt.a(addToListSuccessEvent, this, viewFindViewById, false, 28);
            BuyAgainViewModel buyAgainViewModelO4 = O4();
            List productsAdded = addToListSuccessEvent.h;
            Intrinsics.h(productsAdded, "productsAdded");
            TrackingMetadata trackingMetadataF = ProductAnalyticsExtKt.f(productsAdded);
            trackingMetadataF.b(TrackableValue.o0, "saved 1 in my shopping list");
            buyAgainViewModelO4.g.i(BuyAgainAnalytics.BuyAgain.Action.h, trackingMetadataF);
        }
    }

    public final BuyAgainViewModel O4() {
        return (BuyAgainViewModel) this.A.getD();
    }

    @Override // au.com.woolworths.shop.buyagain.ui.Hilt_BuyAgainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CollectionModeInteractor collectionModeInteractor = this.y;
        if (collectionModeInteractor == null) {
            Intrinsics.p("collectionModeInteractor");
            throw null;
        }
        if (collectionModeInteractor.b()) {
            setContentView(com.woolworths.R.layout.activity_buy_again);
        } else {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity.onCreate.1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final BuyAgainActivity buyAgainActivity = BuyAgainActivity.this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(423017604, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.BuyAgainActivity.onCreate.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    int i = BuyAgainActivity.D;
                                    BuyAgainActivity buyAgainActivity2 = buyAgainActivity;
                                    BuyAgainViewModel buyAgainViewModelO4 = buyAgainActivity2.O4();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(buyAgainActivity2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(buyAgainActivity2, 27);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    BuyAgainScreenKt.b(buyAgainViewModelO4, (Function0) objG, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1559054688));
        }
        Flow flow = O4().l;
        Lifecycle d = getD();
        Lifecycle.State state = Lifecycle.State.g;
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BuyAgainActivity$collectActions$1(2, this, BuyAgainActivity.class, "handleAction", "handleAction(Lau/com/woolworths/shop/buyagain/ui/BuyAgainContract$Actions;)V", 4), FlowExtKt.a(flow, d, state)), LifecycleOwnerKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BuyAgainActivity$collectActions$2(2, this, BuyAgainActivity.class, "handleBoostAction", "handleBoostAction(Lau/com/woolworths/product/offers/ProductBoostContract$Action;)V", 4), FlowExtKt.a(((ProductBoostResultViewModel) this.B.getD()).g, getD(), state)), LifecycleOwnerKt.a(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().u6(null, null);
    }
}
