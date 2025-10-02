package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.ips.Internal;
import me.oriient.ipssdk.realtime.ips.Positioning;

@Keep
/* loaded from: classes4.dex */
public class IPSInternal {
    private IPSInternal() {
    }

    @NonNull
    public static SharedFlow<Object> getDebugInformation() {
        return Internal.INSTANCE.getDebugInfo();
    }

    public static double getTestLockThreshold() {
        return Positioning.INSTANCE.getLockThreshold();
    }

    public static void setTestLockThreshold(double d) {
        Positioning.INSTANCE.setLockThreshold(d);
    }
}
