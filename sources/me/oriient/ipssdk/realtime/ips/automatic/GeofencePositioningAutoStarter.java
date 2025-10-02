package me.oriient.ipssdk.realtime.ips.automatic;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/GeofencePositioningAutoStarter;", "", "onPositioningAutoStopped", "", "onPositioningSessionError", "onPositioningStartedByClient", "onPositioningStoppedByClient", "setFeatureEnabled", "enabled", "", "setPositioningState", "state", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface GeofencePositioningAutoStarter {
    void onPositioningAutoStopped();

    void onPositioningSessionError();

    void onPositioningStartedByClient();

    void onPositioningStoppedByClient();

    void setFeatureEnabled(boolean enabled);

    void setPositioningState(int state);
}
