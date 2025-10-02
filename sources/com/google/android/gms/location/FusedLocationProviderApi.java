package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
/* loaded from: classes.dex */
public interface FusedLocationProviderApi {

    @NonNull
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";

    @NonNull
    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @NonNull
    PendingResult<Status> flushLocations(@NonNull GoogleApiClient googleApiClient);

    @Nullable
    @RequiresPermission
    Location getLastLocation(@NonNull GoogleApiClient googleApiClient);

    @Nullable
    @RequiresPermission
    LocationAvailability getLocationAvailability(@NonNull GoogleApiClient googleApiClient);

    @NonNull
    PendingResult<Status> removeLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull PendingIntent pendingIntent);

    @NonNull
    PendingResult<Status> removeLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationCallback locationCallback);

    @NonNull
    PendingResult<Status> removeLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationListener locationListener);

    @NonNull
    @RequiresPermission
    PendingResult<Status> requestLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationRequest locationRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission
    PendingResult<Status> requestLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationRequest locationRequest, @NonNull LocationCallback locationCallback, @NonNull Looper looper);

    @NonNull
    @RequiresPermission
    PendingResult<Status> requestLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationRequest locationRequest, @NonNull LocationListener locationListener);

    @NonNull
    @RequiresPermission
    PendingResult<Status> requestLocationUpdates(@NonNull GoogleApiClient googleApiClient, @NonNull LocationRequest locationRequest, @NonNull LocationListener locationListener, @NonNull Looper looper);

    @NonNull
    @RequiresPermission
    PendingResult<Status> setMockLocation(@NonNull GoogleApiClient googleApiClient, @NonNull Location location);

    @NonNull
    @RequiresPermission
    PendingResult<Status> setMockMode(@NonNull GoogleApiClient googleApiClient, boolean z);
}
