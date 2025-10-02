package me.oriient.ipssdk.realtime.services.rest;

import kotlin.Metadata;
import me.oriient.ipssdk.api.listeners.IPSFailable;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/ICalibrationCheckListener;", "Lme/oriient/ipssdk/api/listeners/IPSFailable;", "onReceived", "", "needsCalibration", "", "expirationTimeUtc", "", "(ZLjava/lang/Long;)V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ICalibrationCheckListener extends IPSFailable {
    void onReceived(boolean needsCalibration, @Nullable Long expirationTimeUtc);
}
