package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSProximityEventsListener;
import me.oriient.ipssdk.api.listeners.IPSTriggersListener;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.realtime.ips.Proximity;

@Keep
/* loaded from: classes4.dex */
public class IPSProximity {
    private static final String TAG = "IPSProximity";

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProximityServiceState {
        public static final int ACTIVE = 2;
        public static final int IDLE = 0;
        public static final int PENDING = 1;
    }

    private IPSProximity() {
    }

    public static void addLocalProximityEvents(List<IPSLocalProximityEvent> list) {
        HashMap map = new HashMap();
        map.put("count", Integer.valueOf(list.size()));
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addLocalProximityEvents", map);
        Proximity.INSTANCE.addLocalProximityEvents(list);
    }

    public static void addProximityEventsListener(@NonNull IPSProximityEventsListener iPSProximityEventsListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addProximityEventsListener() called");
        Proximity.INSTANCE.addProximityEventsListener(iPSProximityEventsListener);
    }

    public static void addTriggersListener(@NonNull IPSTriggersListener iPSTriggersListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addTriggersListener() called");
        Proximity.INSTANCE.addTriggersListener(iPSTriggersListener);
    }

    public static String describeServiceState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown" : "Active" : "Pending" : "Idle";
    }

    @NonNull
    public static List<? extends IPSRegion> getRegionsContainingUser() {
        return Proximity.INSTANCE.getRegionsContainingUser();
    }

    public static int getServiceState() {
        return Proximity.INSTANCE.getCurrentServiceState();
    }

    public static void removeAllLocalProximityEvents() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeAllLocalProximityEvents");
        Proximity.INSTANCE.removeAllLocalProximityEvents();
    }

    public static void removeLocalProximityEvents(List<IPSLocalProximityEvent> list) {
        HashMap map = new HashMap();
        map.put("count", Integer.valueOf(list.size()));
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeLocalProximityEvents", map);
        Proximity.INSTANCE.removeLocalProximityEvents(list);
    }

    public static void removeLocalProximityEventsByGroupIds(List<String> list) {
        HashMap map = new HashMap();
        map.put("count", Integer.valueOf(list.size()));
        map.put("groupIds", list.toString().substring(0, 20));
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeLocalProximityEventsByGroupIds", map);
        Proximity.INSTANCE.removeLocalProximityEventsByGroupIds(list);
    }

    public static void removeProximityEventsListener(@NonNull IPSProximityEventsListener iPSProximityEventsListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeTriggersEventsListener");
        Proximity.INSTANCE.removeProximityEventsListener(iPSProximityEventsListener);
    }

    public static void removeTriggersListener(@NonNull IPSTriggersListener iPSTriggersListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeTriggersListener");
        Proximity.INSTANCE.removeTriggersListener(iPSTriggersListener);
    }

    public static void setLocalProximityEvents(List<IPSLocalProximityEvent> list) {
        HashMap map = new HashMap();
        map.put("count", Integer.valueOf(list.size()));
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setLocalProximityEvents", map);
        Proximity.INSTANCE.setLocalProximityEvents(list);
    }
}
