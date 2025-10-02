package au.com.woolworths.feature.shop.myorders.details.proofofdelivery;

import YU.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderProofOfDeliveryFullScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/proofofdelivery/ProofOfDeliveryActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Extras", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProofOfDeliveryActivity extends Hilt_ProofOfDeliveryActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(ProofOfDeliveryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/proofofdelivery/ProofOfDeliveryActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Intent a(Context context, String str, String str2, String str3) {
            Intent intent = new Intent(context, (Class<?>) ProofOfDeliveryActivity.class);
            intent.putExtra("Extra_ProofOfDelivery", new Extras(str, str2, str3));
            return intent;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/proofofdelivery/ProofOfDeliveryActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(String title, String str, String str2) {
            Intrinsics.h(title, "title");
            this.d = title;
            this.e = str;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Extras(title=", this.d, ", imageUrl=", this.e, ", footnote="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.proofofdelivery.Hilt_ProofOfDeliveryActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("Extra_ProofOfDelivery");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Extras are required for ProofOfDeliveryActivity. Use ProofOfDeliveryActivity.createLaunchIntent when launch this activity");
        }
        Extras extras = (Extras) parcelableExtra;
        final String str = extras.d;
        final String str2 = extras.e;
        final String str3 = extras.f;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final String str4 = str2;
                    final String str5 = str3;
                    final ProofOfDeliveryActivity proofOfDeliveryActivity = ProofOfDeliveryActivity.this;
                    final String str6 = str;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(864568865, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                ProofOfDeliveryActivity proofOfDeliveryActivity2 = proofOfDeliveryActivity;
                                boolean zI = composer2.I(proofOfDeliveryActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(proofOfDeliveryActivity2, 5);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                OrderProofOfDeliveryFullScreenKt.a(str6, str4, str5, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                    int i = ProofOfDeliveryActivity.x;
                    ((ProofOfDeliveryViewModel) proofOfDeliveryActivity.w.getD()).e.c(OrderDetailsActions.Q);
                }
                return Unit.f24250a;
            }
        }, true, -1524644667));
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.proofofdelivery.Hilt_ProofOfDeliveryActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((ProofOfDeliveryViewModel) this.w.getD()).e.c(OrderDetailsActions.P);
    }
}
