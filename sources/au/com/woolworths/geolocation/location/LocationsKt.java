package au.com.woolworths.geolocation.location;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.e;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"geolocation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LocationsKt {
    public static final void a(AppCompatActivity appCompatActivity, DeviceLocationServiceCallback callback) {
        Intrinsics.h(appCompatActivity, "<this>");
        Intrinsics.h(callback, "callback");
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(LocationRequest.create());
        Intrinsics.g(builderAddLocationRequest, "addLocationRequest(...)");
        Task<LocationSettingsResponse> taskCheckLocationSettings = LocationServices.getSettingsClient((Activity) appCompatActivity).checkLocationSettings(builderAddLocationRequest.build());
        Intrinsics.g(taskCheckLocationSettings, "checkLocationSettings(...)");
        taskCheckLocationSettings.addOnCompleteListener(new e(29, callback, appCompatActivity));
    }

    public static final boolean b(Context context) {
        Intrinsics.h(context, "<this>");
        if (c(context)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && ContextCompat.a(context.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static final boolean c(Context context) {
        Intrinsics.h(context, "<this>");
        for (int i = 0; i < 2; i++) {
            if (ContextCompat.a(context.getApplicationContext(), Locations.f8948a[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(AppCompatActivity appCompatActivity) {
        for (int i = 0; i < 2; i++) {
            if (ActivityCompat.m(appCompatActivity, Locations.f8948a[i])) {
                return false;
            }
        }
        return true;
    }

    public static final void e(AppCompatActivity appCompatActivity) {
        Intrinsics.h(appCompatActivity, "<this>");
        ActivityCompat.j(appCompatActivity, Locations.f8948a, 101);
    }
}
