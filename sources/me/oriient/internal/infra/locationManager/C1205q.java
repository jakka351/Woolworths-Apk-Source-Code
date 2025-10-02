package me.oriient.internal.infra.locationManager;

import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.infra.locationManager.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1205q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManagerAndroid f24955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205q(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.f24955a = locationManagerAndroid;
    }

    public static final void a(LocationManagerAndroid locationManagerAndroid, Location location) {
        if (location != null) {
            locationManagerAndroid.oneTimeLocationListener.onLocationChanged(location);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1205q(this.f24955a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1205q(this.f24955a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [me.oriient.internal.infra.locationManager.a0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f24955a.getLogger().d("LocationManagerAndroid", "requestSingleUpdates() called");
        boolean hasPermission = this.f24955a.getHasPermission();
        Unit unit = Unit.f24250a;
        if (!hasPermission) {
            this.f24955a.getLogger().w("LocationManagerAndroid", "Cannot request location without permission!");
            this.f24955a.getErrors().f(new Error("Can not request location without permission!"));
            return unit;
        }
        try {
            if (Build.VERSION.SDK_INT < 31) {
                this.f24955a.getLocationManager().requestSingleUpdate("gps", this.f24955a.oneTimeLocationListener, (Looper) null);
                return unit;
            }
            CancellationSignal cancellationSignal = this.f24955a.currentLocationCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            this.f24955a.currentLocationCancellationSignal = new CancellationSignal();
            LocationManager locationManager = this.f24955a.getLocationManager();
            com.google.android.gms.common.util.a.m();
            LocationRequest locationRequestBuild = com.google.android.gms.common.util.a.e(LocationManagerAndroid.LOCATION_REQUEST_INTERVAL_TIME_MILLI).build();
            CancellationSignal cancellationSignal2 = this.f24955a.currentLocationCancellationSignal;
            ExecutorService executorService = this.f24955a.singleLocationRequestsExecutor;
            final LocationManagerAndroid locationManagerAndroid = this.f24955a;
            locationManager.getCurrentLocation("fused", locationRequestBuild, cancellationSignal2, executorService, new Consumer() { // from class: me.oriient.internal.infra.locationManager.a0
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    C1205q.a(locationManagerAndroid, (Location) obj2);
                }
            });
            return unit;
        } catch (Exception e) {
            this.f24955a.getErrors().f(new Error(YU.a.f(e, new StringBuilder("Failed to request single update, "))));
            this.f24955a.getLogger().e("LocationManagerAndroid", "Failed to request single update, " + e.getMessage(), e);
            return unit;
        }
    }
}
