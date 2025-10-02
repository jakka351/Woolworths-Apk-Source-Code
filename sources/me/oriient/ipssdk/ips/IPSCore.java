package me.oriient.ipssdk.ips;

import android.location.Location;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSBuildingListener;
import me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSConnectionStateListener;
import me.oriient.ipssdk.api.listeners.IPSCoordinatesConverterListener;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.api.listeners.IPSLogoutListener;
import me.oriient.ipssdk.api.listeners.IPSMapListener;
import me.oriient.ipssdk.api.models.IPSBuildingLayout;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSFloorImageData;
import me.oriient.ipssdk.api.models.IPSSpace;
import me.oriient.ipssdk.api.utils.IPSUnavailableFeature;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.realtime.ips.Core;

@Keep
/* loaded from: classes4.dex */
public class IPSCore {
    private static final String TAG = "IPSCore";

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int LIMITED_CONNECTIVITY = 2;
        public static final int OFFLINE = 0;
        public static final int ONLINE = 1;
    }

    private IPSCore() {
    }

    public static void addConnectionStateListener(@NonNull IPSConnectionStateListener iPSConnectionStateListener) {
        Core.INSTANCE.addConnectionStateListener(iPSConnectionStateListener);
    }

    public static void clearAllCaches(IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "clearAllCaches");
        Core.INSTANCE.clearAllCaches(iPSCompletionListener);
    }

    @Nullable
    public static IPSCancelable createCoordinatesConverter(@NonNull String str, @NonNull IPSCoordinatesConverterListener iPSCoordinatesConverterListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "createCoordinatesConverter() called with: id = [" + str + "], listener = [" + iPSCoordinatesConverterListener + "]");
        return Core.INSTANCE.createCoordinatesConverter(str, iPSCoordinatesConverterListener);
    }

    @NonNull
    public static String describeConnectionState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown" : "Limited Connectivity" : "Online" : "Offline";
    }

    @Nullable
    public static IPSCancelable getBuildingByClientId(@NonNull String str, @NonNull IPSBuildingListener iPSBuildingListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getBuildingByClientId", androidx.constraintlayout.core.state.a.r("clientBuildingId", str));
        return Core.INSTANCE.getBuildingByClientId(str, iPSBuildingListener);
    }

    @Nullable
    public static IPSCancelable getBuildingById(@NonNull String str, @NonNull IPSBuildingListener iPSBuildingListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getBuildingById() called with: id = [" + str + "], listener = [" + iPSBuildingListener + "]");
        return Core.INSTANCE.getBuildingById(str, iPSBuildingListener);
    }

    @Nullable
    public static IPSCancelable getBuildingLayout(@NonNull String str, @NonNull IPSListener<IPSBuildingLayout> iPSListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getBuildingLayout", androidx.constraintlayout.core.state.a.r("buildingId", str));
        return Core.INSTANCE.getBuildingLayout(str, iPSListener);
    }

    @Nullable
    public static IPSCancelable getClientBuildingId(@NonNull String str, @NonNull IPSListener<String> iPSListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getClientBuildingId", androidx.constraintlayout.core.state.a.r("oriientBuildingId", str));
        return Core.INSTANCE.getClientBuildingId(str, iPSListener);
    }

    public static int getConnectionState() {
        return Core.INSTANCE.getConnectionState();
    }

    @Nullable
    public static IPSCancelable getFloorImageDataById(@NonNull String str, @NonNull String str2, @NonNull IPSListener<IPSFloorImageData> iPSListener) {
        HashMap map = new HashMap();
        map.put("buildingId", str);
        map.put("floorId", str2);
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getFloorMapById", map);
        return Core.INSTANCE.getFloorMapById(str, str2, iPSListener);
    }

    @NonNull
    public static String getIPSClientId() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getIPSClientId");
        return Core.INSTANCE.getIPSClientId();
    }

    @Nullable
    public static String getLoggedInUser() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getLoggedInUser");
        return Core.INSTANCE.getLoggedInUser();
    }

    @Nullable
    @Deprecated(forRemoval = true, since = "8.5.0")
    public static IPSCancelable getMapById(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IPSMapListener iPSMapListener) {
        HashMap map = new HashMap();
        map.put("buildingId", str);
        map.put("floorId", str2);
        map.put("mapId", str3);
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getMapById() called", map);
        return Core.INSTANCE.getMapById(str, str2, str3, iPSMapListener);
    }

    @NonNull
    public static List<Integer> getMissingSensors() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getMissingSensors");
        return Core.INSTANCE.getMissingSensors();
    }

    @Nullable
    public static IPSSpace getSpace() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getSpace");
        return Core.INSTANCE.getSpace();
    }

    @Nullable
    public static String getUserSessionId() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getUserSessionId");
        return Core.INSTANCE.getUserSessionId();
    }

    @NonNull
    public static String getVersionName() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getVersionName");
        return ((BuildData) JavaDi.get(BuildData.class)).getVersionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$registerApplicationEvent$1(int i) {
        HashMap map = new HashMap();
        map.put("applicationEvent", Integer.valueOf(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$userDidEngageWithFeature$0(String str) {
        return androidx.constraintlayout.core.state.a.r("feature", str);
    }

    public static void login(@Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable IPSLoginListener iPSLoginListener) {
        ELog eLog = (ELog) JavaDi.get(ELog.class);
        String str4 = TAG;
        StringBuilder sbV = YU.a.v("login() called with: userName = [", str, "], ipsName = [", str3, "], listener = [");
        sbV.append(iPSLoginListener);
        sbV.append("]");
        eLog.api(str4, sbV.toString());
        Core.INSTANCE.login(str, str2, str3, iPSLoginListener);
    }

    public static void logout(@Nullable IPSLogoutListener iPSLogoutListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "logout() called with: listener = [" + iPSLogoutListener + "]");
        Core.INSTANCE.logout(iPSLogoutListener);
    }

    public static void registerApplicationEvent(final int i) {
        ((ELog) JavaDi.get(ELog.class)).v(TAG, "registerApplicationEvent() called", new Function0() { // from class: me.oriient.ipssdk.ips.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IPSCore.lambda$registerApplicationEvent$1(i);
            }
        });
        Core.INSTANCE.registerApplicationEvent(i);
    }

    public static void removeConnectionStateListener(@NonNull IPSConnectionStateListener iPSConnectionStateListener) {
        Core.INSTANCE.removeConnectionStateListener(iPSConnectionStateListener);
    }

    @Nullable
    public static IPSCancelable searchBuildingsByLocation(@NonNull Location location, @Nullable IPSBuildingsSearchListener iPSBuildingsSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "searchBuildingsByLocation() called with: location = [" + location + "], listener = [" + iPSBuildingsSearchListener + "]");
        return Core.INSTANCE.searchBuildingsByLocation(location, iPSBuildingsSearchListener);
    }

    @Nullable
    public static IPSCancelable searchBuildingsByName(@NonNull String str, @Nullable IPSBuildingsSearchListener iPSBuildingsSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "searchBuildingsByName() called with: name = [" + str + "], listener = [" + iPSBuildingsSearchListener + "]");
        return Core.INSTANCE.searchBuildingsByName(str, iPSBuildingsSearchListener);
    }

    public static void setSpaceId(@NonNull String str, @Nullable IPSCompletionListener iPSCompletionListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "setSpaceId() called with: id = [" + str + "], listener = [" + iPSCompletionListener + "]");
        Core.INSTANCE.setSpaceId(str, iPSCompletionListener);
    }

    public static List<IPSUnavailableFeature> unavailableFeatures() {
        return Core.INSTANCE.unavailableFeatures();
    }

    public static void userDidEngageWithFeature(String str) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "userDidEngageWithFeature", new androidx.navigation.internal.h(str, 21));
        Core.INSTANCE.userDidEngageWithFeature(str);
    }

    @Nullable
    public static IPSCancelable searchBuildingsByLocation(@NonNull Location location, float f, @Nullable IPSBuildingsSearchListener iPSBuildingsSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "searchBuildingsByLocation() called with: location = [" + location + "], radiusMeters = [" + f + "], listener = [" + iPSBuildingsSearchListener + "]");
        return Core.INSTANCE.searchBuildingsByLocation(location, f, iPSBuildingsSearchListener);
    }

    @Nullable
    public static IPSCancelable searchBuildingsByLocation(float f, float f2, @Nullable IPSBuildingsSearchListener iPSBuildingsSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "searchBuildingsByLocation() called with: latitude = [" + f + "], longitude = [" + f2 + "], listener = [" + iPSBuildingsSearchListener + "]");
        return Core.INSTANCE.searchBuildingsByLocation(f, f2, iPSBuildingsSearchListener);
    }

    @Nullable
    public static IPSCancelable searchBuildingsByLocation(float f, float f2, float f3, @Nullable IPSBuildingsSearchListener iPSBuildingsSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "searchBuildingsByLocation() called with: latitude = [" + f + "], longitude = [" + f2 + "], radiusMeters = [" + f3 + "], listener = [" + iPSBuildingsSearchListener + "]");
        return Core.INSTANCE.searchBuildingsByLocation(f, f2, f3, iPSBuildingsSearchListener);
    }

    public static void login(@NonNull String str, @Nullable IPSLoginListener iPSLoginListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "login() called with: listener = [" + iPSLoginListener + "]");
        Core.INSTANCE.login(null, str, null, iPSLoginListener);
    }
}
