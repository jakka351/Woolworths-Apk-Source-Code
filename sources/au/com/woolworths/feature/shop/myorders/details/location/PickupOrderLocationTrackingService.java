package au.com.woolworths.feature.shop.myorders.details.location;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationInteractor;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.geolocation.location.LocationInteractor;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/PickupOrderLocationTrackingService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "ExtrasStart", "ExtrasStop", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickupOrderLocationTrackingService extends Hilt_PickupOrderLocationTrackingService {
    public static final /* synthetic */ int q = 0;
    public LocationInteractor h;
    public PickupOrderLocationInteractor i;
    public DispatcherProvider j;
    public FeatureToggleManager k;
    public AnalyticsManager l;
    public Job m;
    public Integer n;
    public Job o;
    public final Lazy p = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 2));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/PickupOrderLocationTrackingService$Companion;", "", "", "MY_ORDERS_LOCATION_TRACKING_NOTIFICATION_ID", "I", "", "ORDER_ID_KEY", "Ljava/lang/String;", "EXTRAS_START", "EXTRAS_STOP", "ACTION_START", "ACTION_STOP", "ORDER_DETAILS_DEEPLINK", "MY_ORDERS_NOTIFICATION_CHANNEL_ID", "PENDING_INTENT_REQUEST_CODE", "", "DEFAULT_TERMINATE_SERVICE_TIMER_IN_SECONDS", "J", "TRACKING_OFF_EVENT_DESCRIPTION_STOP_TRACKING", "TRACKING_OFF_EVENT_DESCRIPTION_TIME_OUT", "TRACKING_OFF_EVENT_DESCRIPTION_BACKEND", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Intent a(int i, Context context) {
            Intent intent = new Intent(context, (Class<?>) PickupOrderLocationTrackingService.class);
            intent.setAction("ACTION_START");
            intent.putExtra("EXTRAS_START", new ExtrasStart(i));
            return intent;
        }

        public static Intent b(Context context, String str) {
            Intent intent = new Intent(context, (Class<?>) PickupOrderLocationTrackingService.class);
            intent.setAction("ACTION_STOP");
            intent.putExtra("EXTRAS_STOP", new ExtrasStop(str));
            return intent;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/PickupOrderLocationTrackingService$ExtrasStart;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtrasStart implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExtrasStart> CREATOR = new Creator();
        public final int d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExtrasStart> {
            @Override // android.os.Parcelable.Creator
            public final ExtrasStart createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new ExtrasStart(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ExtrasStart[] newArray(int i) {
                return new ExtrasStart[i];
            }
        }

        public ExtrasStart(int i) {
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExtrasStart) && this.d == ((ExtrasStart) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return YU.a.e(this.d, "ExtrasStart(orderId=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(this.d);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/location/PickupOrderLocationTrackingService$ExtrasStop;", "Landroid/os/Parcelable;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtrasStop implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExtrasStop> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExtrasStop> {
            @Override // android.os.Parcelable.Creator
            public final ExtrasStop createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new ExtrasStop(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ExtrasStop[] newArray(int i) {
                return new ExtrasStop[i];
            }
        }

        public ExtrasStop(String eventDescription) {
            Intrinsics.h(eventDescription, "eventDescription");
            this.d = eventDescription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExtrasStop) && Intrinsics.c(this.d, ((ExtrasStop) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("ExtrasStop(eventDescription=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    public final void a(String str) {
        Integer num = this.n;
        if (num != null) {
            int iIntValue = num.intValue();
            AnalyticsManager analyticsManager = this.l;
            if (analyticsManager == null) {
                Intrinsics.p("analyticsManager");
                throw null;
            }
            OrderDetailsActions orderDetailsActions = OrderDetailsActions.D;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.h1, Integer.valueOf(iIntValue));
            trackingMetadataA.b(TrackableValue.o0, str);
            analyticsManager.j(orderDetailsActions, trackingMetadataA);
        }
        stopForeground(1);
        stopSelf();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ExtrasStop extrasStop;
        ExtrasStart extrasStart;
        Job job;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -528730005) {
                if (iHashCode == 789225721 && action.equals("ACTION_START")) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 33) {
                        extrasStart = (ExtrasStart) intent.getParcelableExtra("EXTRAS_START", ExtrasStart.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("EXTRAS_START");
                        extrasStart = parcelableExtra instanceof ExtrasStart ? (ExtrasStart) parcelableExtra : null;
                    }
                    Integer numValueOf = extrasStart != null ? Integer.valueOf(extrasStart.d) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        this.n = Integer.valueOf(iIntValue);
                        AnalyticsManager analyticsManager = this.l;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager.j(OrderDetailsActions.E, TrackingMetadata.Companion.a(TrackableValue.h1, Integer.valueOf(iIntValue)));
                        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "my_orders_notification_channel");
                        Bundle bundle = new Bundle();
                        bundle.putInt("ORDER_ID_KEY", iIntValue);
                        Bundle bundle2 = builder.q;
                        if (bundle2 == null) {
                            builder.q = new Bundle(bundle);
                        } else {
                            bundle2.putAll(bundle);
                        }
                        builder.e = NotificationCompat.Builder.c(getString(R.string.location_tracking_notification_title));
                        builder.f = NotificationCompat.Builder.c(getString(R.string.location_tracking_notification_text));
                        builder.x.icon = R.drawable.wapple_grey;
                        builder.k(2, true);
                        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
                        bigTextStyle.e = NotificationCompat.Builder.c(getString(R.string.location_tracking_notification_text));
                        builder.q(bigTextStyle);
                        builder.g = PendingIntent.getActivity(this, 0, new Intent("android.intent.action.VIEW", Uri.parse(String.format("com.woolworths.shop://orders?orderId=%s", Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)))), 201326592);
                        builder.r = ResourcesCompat.a(R.color.location_tracking_notification_background, null, getResources());
                        builder.o = true;
                        builder.p = true;
                        builder.b.add(new NotificationCompat.Action(0, getString(R.string.stop_tracking), PendingIntent.getService(getApplicationContext(), 101, Companion.b(this, "stop tracking interaction"), 67108864)));
                        Object systemService = getApplicationContext().getSystemService("notification");
                        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("my_orders_notification_channel", getString(R.string.order_location_tracking), 3));
                        if (i3 >= 29) {
                            startForeground(1, builder.b(), 8);
                        } else {
                            startForeground(1, builder.b());
                        }
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        this.m = BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new PickupOrderLocationTrackingService$startTerminateServiceTimer$1(timeUnit.toMillis(600L), this, null), 3);
                        Job job2 = this.o;
                        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.o) != null) {
                            ((JobSupport) job).cancel((CancellationException) null);
                        }
                        LocationInteractor locationInteractor = this.h;
                        if (locationInteractor == null) {
                            Intrinsics.p("locationInteractor");
                            throw null;
                        }
                        Lazy lazy = this.p;
                        Object d = lazy.getD();
                        Intrinsics.g(d, "getValue(...)");
                        long millis = timeUnit.toMillis(((PickupOrderLocationTrackingConfig) d).getTrackingIntervalSeconds());
                        Object d2 = lazy.getD();
                        Intrinsics.g(d2, "getValue(...)");
                        Flow flowC = locationInteractor.c(millis, timeUnit.toMillis(((PickupOrderLocationTrackingConfig) d2).getTrackingIntervalSeconds()));
                        if (this.j == null) {
                            Intrinsics.p("dispatcherProvider");
                            throw null;
                        }
                        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                        this.o = FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new PickupOrderLocationTrackingService$startTracking$1(this, iIntValue, null), FlowKt.D(flowC, DefaultIoScheduler.f)), LifecycleOwnerKt.a(this));
                    }
                }
            } else if (action.equals("ACTION_STOP")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    extrasStop = (ExtrasStop) intent.getParcelableExtra("EXTRAS_STOP", ExtrasStop.class);
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("EXTRAS_STOP");
                    extrasStop = parcelableExtra2 instanceof ExtrasStop ? (ExtrasStop) parcelableExtra2 : null;
                }
                String str = extrasStop != null ? extrasStop.d : null;
                if (str == null) {
                    str = "";
                }
                a(str);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
