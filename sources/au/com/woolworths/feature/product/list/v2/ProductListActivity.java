package au.com.woolworths.feature.product.list.v2;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.v2.ui.ProductListScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListActivity extends Hilt_ProductListActivity {
    public static final /* synthetic */ int z = 0;
    public ShopAppNavigator x;
    public final ViewModelLazy y;

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

    public ProductListActivity() {
        final androidx.lifecycle.a aVar = new androidx.lifecycle.a(this, 20);
        this.y = new ViewModelLazy(Reflection.f24268a.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.v2.ProductListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.v2.ProductListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>(this) { // from class: au.com.woolworths.feature.product.list.v2.ProductListActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (CreationExtras) this.h.invoke();
            }
        });
    }

    @Override // au.com.woolworths.feature.product.list.v2.Hilt_ProductListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.b(this);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ProductListActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductListActivity productListActivity = ProductListActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1761053520, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.v2.ProductListActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductListActivity productListActivity2 = productListActivity;
                                ShopAppNavigator shopAppNavigator = productListActivity2.x;
                                if (shopAppNavigator == null) {
                                    Intrinsics.p("navigator");
                                    throw null;
                                }
                                ProductListViewModel productListViewModel = (ProductListViewModel) productListActivity2.y.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(productListActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new e(productListActivity2, 9);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ProductListScreenKt.a(productListViewModel, shopAppNavigator, (Function2) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1872390740));
    }
}
