package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.DataManager;

@Keep
/* loaded from: classes4.dex */
public class IPSDataManager {
    private static final String TAG = "IPSDataManager";

    private IPSDataManager() {
    }

    public static void addDataStatusObserver(IPSDataStatusObserver iPSDataStatusObserver) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addDataStatusObserver");
        DataManager.INSTANCE.addDataStatusObserver(iPSDataStatusObserver);
    }

    public static void cancelAllBuildingsDataPreparation() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "cancelAllBuildingsDataPreparation");
        DataManager.INSTANCE.cancelAllBuildingsDataPreparation();
    }

    public static void cancelDataPreparation(String str) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "cancelDataPreparation", androidx.constraintlayout.core.state.a.r("buildingId", str));
        DataManager.INSTANCE.cancelDataPreparation(str);
    }

    public static void clearAllCaches(IPSCompletionListener iPSCompletionListener) {
        Core.INSTANCE.clearAllCaches(iPSCompletionListener);
    }

    public static void clearData(String str) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "clearData", androidx.constraintlayout.core.state.a.r("buildingId", str));
        DataManager.INSTANCE.clearData(str);
    }

    public static void getDataStatus(String str, IPSDataStatusListener iPSDataStatusListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getDataStatus", androidx.constraintlayout.core.state.a.r("buildingId", str));
        DataManager.INSTANCE.getDataStatus(str, iPSDataStatusListener);
    }

    public static void prepareData(String str) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "prepareData", androidx.constraintlayout.core.state.a.r("buildingId", str));
        DataManager.INSTANCE.prepareData(str);
    }

    public static void removeDataStatusObserver(IPSDataStatusObserver iPSDataStatusObserver) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeDataStatusObserver");
        DataManager.INSTANCE.removeDataStatusObserver(iPSDataStatusObserver);
    }
}
