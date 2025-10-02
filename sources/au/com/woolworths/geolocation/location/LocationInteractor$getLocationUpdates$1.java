package au.com.woolworths.geolocation.location;

import android.location.Location;
import android.os.Looper;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/location/Location;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.geolocation.location.LocationInteractor$getLocationUpdates$1", f = "LocationInteractor.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocationInteractor$getLocationUpdates$1 extends SuspendLambda implements Function2<ProducerScope<? super Location>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ LocationInteractor t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationInteractor$getLocationUpdates$1(long j, long j2, LocationInteractor locationInteractor, Continuation continuation) {
        super(2, continuation);
        this.r = j;
        this.s = j2;
        this.t = locationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationInteractor$getLocationUpdates$1 locationInteractor$getLocationUpdates$1 = new LocationInteractor$getLocationUpdates$1(this.r, this.s, this.t, continuation);
        locationInteractor$getLocationUpdates$1.q = obj;
        return locationInteractor$getLocationUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationInteractor$getLocationUpdates$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.q;
            LocationCallback locationCallback = new LocationCallback() { // from class: au.com.woolworths.geolocation.location.LocationInteractor$getLocationUpdates$1$locationCallback$1
                @Override // com.google.android.gms.location.LocationCallback
                public final void onLocationResult(LocationResult result) {
                    Intrinsics.h(result, "result");
                    List<Location> locations = result.getLocations();
                    Intrinsics.g(locations, "getLocations(...)");
                    Location location = (Location) CollectionsKt.P(locations);
                    if (location != null) {
                        ProducerScope producerScope2 = producerScope;
                        BuildersKt.c(producerScope2, null, null, new LocationInteractor$getLocationUpdates$1$locationCallback$1$onLocationResult$1$1(producerScope2, location, null), 3);
                    }
                }
            };
            LocationRequest interval = LocationRequest.create().setPriority(100).setFastestInterval(this.r).setInterval(this.s);
            Intrinsics.g(interval, "setInterval(...)");
            LocationInteractor locationInteractor = this.t;
            locationInteractor.c.requestLocationUpdates(interval, locationCallback, Looper.getMainLooper());
            f fVar = new f(28, locationInteractor, locationCallback);
            this.p = 1;
            if (ProduceKt.a(producerScope, fVar, this) == coroutineSingletons) {
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
