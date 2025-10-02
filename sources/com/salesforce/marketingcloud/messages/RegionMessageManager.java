package com.salesforce.marketingcloud.messages;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.messages.geofence.GeofenceMessageResponse;
import com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MCKeep
/* loaded from: classes6.dex */
public interface RegionMessageManager {

    @NonNull
    @RestrictTo
    public static final String BUNDLE_KEY_MESSAGING_ENABLED = "com.salesforce.marketingcloud.messaging.ENABLED";

    @MCKeep
    public interface GeofenceMessageResponseListener {
        void onGeofenceMessageResponse(@NonNull GeofenceMessageResponse geofenceMessageResponse);
    }

    @MCKeep
    public interface ProximityMessageResponseListener {
        void onProximityMessageResponse(@NonNull ProximityMessageResponse proximityMessageResponse);
    }

    @MCKeep
    public interface RegionTransitionEventListener {
        public static final int TRANSITION_ENTERED = 1;
        public static final int TRANSITION_EXITED = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        void onTransitionEvent(int i, @NonNull Region region);
    }

    void disableGeofenceMessaging();

    void disableProximityMessaging();

    @RequiresPermission
    boolean enableGeofenceMessaging();

    @RequiresPermission
    boolean enableProximityMessaging();

    boolean isGeofenceMessagingEnabled();

    boolean isProximityMessagingEnabled();

    void registerGeofenceMessageResponseListener(@NonNull GeofenceMessageResponseListener geofenceMessageResponseListener);

    void registerProximityMessageResponseListener(@NonNull ProximityMessageResponseListener proximityMessageResponseListener);

    void registerRegionTransitionEventListener(@NonNull RegionTransitionEventListener regionTransitionEventListener);

    void unregisterGeofenceMessageResponseListener(@NonNull GeofenceMessageResponseListener geofenceMessageResponseListener);

    void unregisterProximityMessageResponseListener(@NonNull ProximityMessageResponseListener proximityMessageResponseListener);

    void unregisterRegionTransitionEventListener(@NonNull RegionTransitionEventListener regionTransitionEventListener);
}
