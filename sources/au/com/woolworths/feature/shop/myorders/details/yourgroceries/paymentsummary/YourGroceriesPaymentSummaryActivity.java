package au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryContract;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Companion", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryContract$ViewState;", "viewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesPaymentSummaryActivity extends Hilt_YourGroceriesPaymentSummaryActivity {
    public static final /* synthetic */ int z = 0;
    public FeatureToggleManager x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(YourGroceriesPaymentSummaryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryActivity$Companion;", "", "", "EXTRA_ARGUMENTS_PAYMENT_INFO", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final OrderPaymentDetailsData d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(OrderPaymentDetailsData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(OrderPaymentDetailsData orderPaymentDetails) {
            Intrinsics.h(orderPaymentDetails, "orderPaymentDetails");
            this.d = orderPaymentDetails;
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
            return "Extras(orderPaymentDetails=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.Hilt_YourGroceriesPaymentSummaryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = YourGroceriesPaymentSummaryActivity.z;
                    final YourGroceriesPaymentSummaryActivity yourGroceriesPaymentSummaryActivity = YourGroceriesPaymentSummaryActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(((YourGroceriesPaymentSummaryViewModel) yourGroceriesPaymentSummaryActivity.y.getD()).f, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1441859352, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                OrderPaymentDetailsData orderPaymentDetailsData = ((YourGroceriesPaymentSummaryContract.ViewState) mutableStateA.getD()).f7823a;
                                composer2.o(5004770);
                                YourGroceriesPaymentSummaryActivity yourGroceriesPaymentSummaryActivity2 = yourGroceriesPaymentSummaryActivity;
                                boolean zI = composer2.I(yourGroceriesPaymentSummaryActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new YourGroceriesPaymentSummaryActivity$onCreate$1$1$1$1(0, yourGroceriesPaymentSummaryActivity2, YourGroceriesPaymentSummaryActivity.class, "finish", "finish()V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                YourGroceriesPaymentSummaryScreenKt.d(orderPaymentDetailsData, (Function0) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1020956868));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
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
        YourGroceriesPaymentSummaryViewModel yourGroceriesPaymentSummaryViewModel = (YourGroceriesPaymentSummaryViewModel) this.y.getD();
        Intent intent = getIntent();
        Extras extras = intent != null ? (Extras) intent.getParcelableExtra(".extra_payment_info") : null;
        if (extras == null) {
            throw new IllegalArgumentException("Extras not provided");
        }
        OrderPaymentDetailsData orderPaymentDetails = extras.d;
        Intrinsics.h(orderPaymentDetails, "orderPaymentDetails");
        MutableStateFlow mutableStateFlow = yourGroceriesPaymentSummaryViewModel.e;
        ((YourGroceriesPaymentSummaryContract.ViewState) yourGroceriesPaymentSummaryViewModel.f.getValue()).getClass();
        mutableStateFlow.setValue(new YourGroceriesPaymentSummaryContract.ViewState(orderPaymentDetails));
    }
}
