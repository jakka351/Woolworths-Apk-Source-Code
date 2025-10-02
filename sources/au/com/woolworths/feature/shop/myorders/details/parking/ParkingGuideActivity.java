package au.com.woolworths.feature.shop.myorders.details.parking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityParkingGuideBinding;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.parking.ParkingGuideActivity;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/parking/ParkingGuideActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extras", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ParkingGuideActivity extends Hilt_ParkingGuideActivity {
    public static final /* synthetic */ int A = 0;
    public ActivityParkingGuideBinding x;
    public final ParkingGuideEpoxyController y = new ParkingGuideEpoxyController();
    public final Lazy z = LazyKt.b(new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.parking.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OrderCollectionParkingDetails orderCollectionParkingDetails;
            int i = ParkingGuideActivity.A;
            ParkingGuideActivity.Extras extras = (ParkingGuideActivity.Extras) this.d.getIntent().getParcelableExtra("EXTRAS_PARKING_GUIDE");
            if (extras == null || (orderCollectionParkingDetails = extras.d) == null) {
                throw new IllegalStateException("must provide parking guide data");
            }
            return orderCollectionParkingDetails;
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/parking/ParkingGuideActivity$Companion;", "", "", "EXTRAS_PARKING_GUIDE", "Ljava/lang/String;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Intent a(Context context, OrderCollectionParkingDetails parkingDetail) {
            Intrinsics.h(parkingDetail, "parkingDetail");
            Intent intentPutExtra = new Intent(context, (Class<?>) ParkingGuideActivity.class).putExtra("EXTRAS_PARKING_GUIDE", new Extras(parkingDetail));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/parking/ParkingGuideActivity$Extras;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final OrderCollectionParkingDetails d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(OrderCollectionParkingDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(OrderCollectionParkingDetails parkingDetail) {
            Intrinsics.h(parkingDetail, "parkingDetail");
            this.d = parkingDetail;
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
            return "Extras(parkingDetail=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.parking.Hilt_ParkingGuideActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityParkingGuideBinding activityParkingGuideBinding = (ActivityParkingGuideBinding) DataBindingUtil.d(this, R.layout.activity_parking_guide);
        this.x = activityParkingGuideBinding;
        if (activityParkingGuideBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = activityParkingGuideBinding.y;
        ParkingGuideEpoxyController parkingGuideEpoxyController = this.y;
        epoxyRecyclerView.setController(parkingGuideEpoxyController);
        parkingGuideEpoxyController.setData((OrderCollectionParkingDetails) this.z.getD());
        ActivityParkingGuideBinding activityParkingGuideBinding2 = this.x;
        if (activityParkingGuideBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityParkingGuideBinding2.z);
        ActivityParkingGuideBinding activityParkingGuideBinding3 = this.x;
        if (activityParkingGuideBinding3 != null) {
            activityParkingGuideBinding3.z.setNavigationOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.shop.myorders.details.parking.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ParkingGuideActivity parkingGuideActivity = this.d;
                    int i = ParkingGuideActivity.A;
                    Callback.g(view);
                    try {
                        parkingGuideActivity.onBackPressed();
                    } finally {
                        Callback.h();
                    }
                }
            });
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }
}
