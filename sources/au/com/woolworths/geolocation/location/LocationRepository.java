package au.com.woolworths.geolocation.location;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/geolocation/location/LocationRepository;", "", "Companion", "geolocation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LocationRepository {
    public static final String[] b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: a, reason: collision with root package name */
    public final PermissionFlagInteractorImpl f8947a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/geolocation/location/LocationRepository$Companion;", "", "", "IS_DEVICE_LOCATION_SUPPORTED_KEY", "Ljava/lang/String;", "", "locationPermissions", "[Ljava/lang/String;", "geolocation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public LocationRepository(SharedPreferences sharedPreferences, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        this.f8947a = permissionFlagInteractorImpl;
    }
}
