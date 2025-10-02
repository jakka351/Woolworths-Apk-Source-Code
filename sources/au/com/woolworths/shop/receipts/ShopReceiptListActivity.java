package au.com.woolworths.shop.receipts;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.receipts.analytics.ShopReceiptsScreens;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/receipts/ShopReceiptListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopReceiptListActivity extends Hilt_ShopReceiptListActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(ShopReceiptListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.receipts.ShopReceiptListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.receipts.ShopReceiptListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.receipts.ShopReceiptListActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final ShopReceiptListViewModel O4() {
        return (ShopReceiptListViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.shop.receipts.Hilt_ShopReceiptListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ShopReceiptListActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ShopReceiptListActivity shopReceiptListActivity = ShopReceiptListActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1034835062, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.receipts.ShopReceiptListActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer$Companion$Empty$1 composer$Companion$Empty$1;
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = ShopReceiptListActivity.y;
                                ShopReceiptListActivity shopReceiptListActivity2 = shopReceiptListActivity;
                                ShopReceiptListViewModel shopReceiptListViewModelO4 = shopReceiptListActivity2.O4();
                                ShopReceiptListViewModel shopReceiptListViewModelO42 = shopReceiptListActivity2.O4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(shopReceiptListViewModelO42);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$12) {
                                    ShopReceiptListActivity$onCreate$1$1$1$1 shopReceiptListActivity$onCreate$1$1$1$1 = new ShopReceiptListActivity$onCreate$1$1$1$1(1, shopReceiptListViewModelO42, ShopReceiptListViewModel.class, "onReceiptClicked", "onReceiptClicked(Lau/com/woolworths/shop/receipts/data/ReceiptListItem;)V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$1$1);
                                    objG = shopReceiptListActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                ShopReceiptListViewModel shopReceiptListViewModelO43 = shopReceiptListActivity2.O4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(shopReceiptListViewModelO43);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$12) {
                                    ShopReceiptListActivity$onCreate$1$1$2$1 shopReceiptListActivity$onCreate$1$1$2$1 = new ShopReceiptListActivity$onCreate$1$1$2$1(0, shopReceiptListViewModelO43, ShopReceiptListViewModel.class, "onViewMyOrdersClicked", "onViewMyOrdersClicked()V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$2$1);
                                    objG2 = shopReceiptListActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG2);
                                ShopReceiptListViewModel shopReceiptListViewModelO44 = shopReceiptListActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(shopReceiptListViewModelO44);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$12) {
                                    ShopReceiptListActivity$onCreate$1$1$3$1 shopReceiptListActivity$onCreate$1$1$3$1 = new ShopReceiptListActivity$onCreate$1$1$3$1(0, shopReceiptListViewModelO44, ShopReceiptListViewModel.class, "onChatToUsClicked", "onChatToUsClicked()V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$3$1);
                                    objG3 = shopReceiptListActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG3);
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(shopReceiptListActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$12) {
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                    ShopReceiptListActivity$onCreate$1$1$4$1 shopReceiptListActivity$onCreate$1$1$4$1 = new ShopReceiptListActivity$onCreate$1$1$4$1(0, shopReceiptListActivity2, ShopReceiptListActivity.class, "launchMyOrder", "launchMyOrder()V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$4$1);
                                    objG4 = shopReceiptListActivity$onCreate$1$1$4$1;
                                } else {
                                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG4);
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(shopReceiptListActivity2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    ShopReceiptListActivity$onCreate$1$1$5$1 shopReceiptListActivity$onCreate$1$1$5$1 = new ShopReceiptListActivity$onCreate$1$1$5$1(0, shopReceiptListActivity2, ShopReceiptListActivity.class, "launchChatToUs", "launchChatToUs()V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$5$1);
                                    objG5 = shopReceiptListActivity$onCreate$1$1$5$1;
                                }
                                composer2.l();
                                Function0 function04 = (Function0) ((KFunction) objG5);
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(shopReceiptListActivity2);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    ShopReceiptListActivity$onCreate$1$1$6$1 shopReceiptListActivity$onCreate$1$1$6$1 = new ShopReceiptListActivity$onCreate$1$1$6$1(1, shopReceiptListActivity2, ShopReceiptListActivity.class, "launchReceiptDetails", "launchReceiptDetails(Ljava/lang/String;)V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$6$1);
                                    objG6 = shopReceiptListActivity$onCreate$1$1$6$1;
                                }
                                composer2.l();
                                Function1 function12 = (Function1) ((KFunction) objG6);
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(shopReceiptListActivity2);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    ShopReceiptListActivity$onCreate$1$1$7$1 shopReceiptListActivity$onCreate$1$1$7$1 = new ShopReceiptListActivity$onCreate$1$1$7$1(0, shopReceiptListActivity2, ShopReceiptListActivity.class, "finish", "finish()V", 0);
                                    composer2.A(shopReceiptListActivity$onCreate$1$1$7$1);
                                    objG7 = shopReceiptListActivity$onCreate$1$1$7$1;
                                }
                                composer2.l();
                                ReceiptListScreenKt.f(shopReceiptListViewModelO4, function1, function0, function02, function03, function04, function12, (Function0) ((KFunction) objG7), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2067444946));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().f.a(ShopReceiptsScreens.e);
    }
}
