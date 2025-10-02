package au.com.woolworths.geolocation.location;

import android.content.Context;
import android.location.LocationManager;
import au.com.woolworths.feature.shop.delivery.address.a;
import com.google.android.gms.location.FusedLocationProviderClient;
import io.reactivex.Maybe;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybePeek;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/geolocation/location/LocationInteractor;", "", "Companion", "geolocation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8946a;
    public final LocationRepository b;
    public final FusedLocationProviderClient c;
    public LocationInteractor$requestLocationIfEmptyCache$1 d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/geolocation/location/LocationInteractor$Companion;", "", "", "LOCATION_REQUEST_INTERVAL", "J", "ONE_MINUTE_MILLIS", "geolocation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public LocationInteractor(Context applicationContext, LocationRepository repository, FusedLocationProviderClient fusedLocationProviderClient) {
        Intrinsics.h(applicationContext, "applicationContext");
        Intrinsics.h(repository, "repository");
        Intrinsics.h(fusedLocationProviderClient, "fusedLocationProviderClient");
        this.f8946a = applicationContext;
        this.b = repository;
        this.c = fusedLocationProviderClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.geolocation.location.LocationInteractor$getCurrentLocation$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.geolocation.location.LocationInteractor$getCurrentLocation$1 r0 = (au.com.woolworths.geolocation.location.LocationInteractor$getCurrentLocation$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.geolocation.location.LocationInteractor$getCurrentLocation$1 r0 = new au.com.woolworths.geolocation.location.LocationInteractor$getCurrentLocation$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.d()
            if (r6 == 0) goto L62
            android.content.Context r6 = r5.f8946a
            boolean r6 = au.com.woolworths.geolocation.location.LocationsKt.c(r6)
            if (r6 == 0) goto L62
            com.google.android.gms.tasks.CancellationTokenSource r6 = new com.google.android.gms.tasks.CancellationTokenSource
            r6.<init>()
            com.google.android.gms.tasks.CancellationToken r6 = r6.getToken()
            com.google.android.gms.location.FusedLocationProviderClient r2 = r5.c
            r4 = 100
            com.google.android.gms.tasks.Task r6 = r2.getCurrentLocation(r4, r6)
            java.lang.String r2 = "getCurrentLocation(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r2)
            r0.r = r3
            java.lang.Object r6 = kotlinx.coroutines.tasks.TasksKt.a(r6, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            android.location.Location r6 = (android.location.Location) r6
            return r6
        L62:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.geolocation.location.LocationInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Maybe b() {
        if (!d() || !LocationsKt.b(this.f8946a)) {
            return MaybeEmpty.d;
        }
        return new MaybePeek(new MaybeCreate(new a(this, 28)), Functions.d, new au.com.woolworths.feature.shop.account.viewmodel.delete.a(this, 4));
    }

    public final Flow c(long j, long j2) {
        return FlowKt.d(new LocationInteractor$getLocationUpdates$1(j2, j, this, null));
    }

    public final boolean d() {
        Object systemService = this.f8946a.getSystemService("location");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isLocationEnabled();
    }

    public final boolean e() {
        LocationRepository locationRepository = this.b;
        locationRepository.getClass();
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(Boolean.valueOf(locationRepository.f8947a.a(LocationRepository.b[i])));
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z) {
        LocationRepository locationRepository = this.b;
        locationRepository.getClass();
        for (int i = 0; i < 2; i++) {
            locationRepository.f8947a.d(LocationRepository.b[i], z);
        }
    }
}
