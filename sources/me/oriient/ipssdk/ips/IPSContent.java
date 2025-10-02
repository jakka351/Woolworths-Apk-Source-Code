package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCategoryLocationListener;
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.api.listeners.IPSProductAndCategoriesLocationListener;
import me.oriient.ipssdk.api.listeners.IPSProductLocationResultListener;
import me.oriient.ipssdk.api.listeners.IPSRegionsListener;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.api.models.IPSLocationTag;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.api.models.IPSShape;
import me.oriient.ipssdk.api.models.IPSSnapToRegionResult;
import me.oriient.ipssdk.api.models.IPSSnapToShapeResult;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.realtime.ips.Content;

@Keep
/* loaded from: classes4.dex */
public class IPSContent {
    private static final String TAG = "IPSContent";

    public static void addRegionsListener(@NonNull String str, @NonNull IPSRegionsListener iPSRegionsListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "addBuildingRegionsListener() called with: buildingId = [" + str + "], listener = [" + iPSRegionsListener + "]");
        Content.INSTANCE.addBuildingRegionsListener(str, iPSRegionsListener);
    }

    @Nullable
    public static IPSCancelable fetch(@NonNull IPSContentSearchPage iPSContentSearchPage, @NonNull IPSContentSearchListener iPSContentSearchListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "fetchNextPage() called with: nextPage = [" + iPSContentSearchPage + "], listener = [" + iPSContentSearchListener + "]");
        return Content.INSTANCE.fetch(iPSContentSearchPage, iPSContentSearchListener);
    }

    @Nullable
    public static IPSCancelable getCategoryLocation(@NonNull String str, @NonNull String str2, @NonNull IPSCategoryLocationListener iPSCategoryLocationListener) {
        ((ELog) JavaDi.get(ELog.class)).v(TAG, "getCategoryLocation", new au.com.woolworths.android.onesite.deeplink.c(str, str2, 4));
        return Content.INSTANCE.getPlaiCategoryLocation(str, str2, iPSCategoryLocationListener);
    }

    @Nullable
    public static IPSCancelable getLocationTagsById(@NonNull String str, @NonNull List<String> list, @NonNull IPSGetByIdListener<IPSLocationTag> iPSGetByIdListener) {
        ELog eLog = (ELog) JavaDi.get(ELog.class);
        String str2 = TAG;
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("getLocationTagsOnMapById() called with: buildingId = [", str, "], ids = [", "], listener = [", list);
        sbS.append(iPSGetByIdListener);
        sbS.append("]");
        eLog.api(str2, sbS.toString());
        return Content.INSTANCE.getLocationTagsById(str, list, iPSGetByIdListener);
    }

    @Nullable
    public static IPSCancelable getProductAndCategoriesLocation(@NonNull String str, @NonNull String str2, @NonNull List<String> list, @NonNull IPSProductAndCategoriesLocationListener iPSProductAndCategoriesLocationListener) {
        ((ELog) JavaDi.get(ELog.class)).v(TAG, "getProductAndCategoriesLocation", new au.com.woolworths.android.onesite.deeplink.d(str, str2, list));
        return Content.INSTANCE.getPlaiProductAndCategoriesLocation(str, str2, list, iPSProductAndCategoriesLocationListener);
    }

    @Nullable
    public static IPSCancelable getProductLocation(@NonNull String str, @NonNull String str2, @NonNull IPSProductLocationResultListener iPSProductLocationResultListener) {
        ((ELog) JavaDi.get(ELog.class)).v(TAG, "getProductLocation", new au.com.woolworths.android.onesite.deeplink.c(str, str2, 3));
        return Content.INSTANCE.getProductLocation(str, str2, iPSProductLocationResultListener);
    }

    @Nullable
    public static IPSCancelable getRegions(@NonNull String str, @NonNull IPSGetByIdListener<IPSRegion> iPSGetByIdListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "getRegions() called with: buildingId = [" + str + "], listener = [" + iPSGetByIdListener + "]");
        return Content.INSTANCE.getRegions(str, iPSGetByIdListener);
    }

    @Nullable
    public static IPSCancelable getRegionsById(@NonNull String str, @NonNull List<String> list, @NonNull IPSGetByIdListener<IPSRegion> iPSGetByIdListener) {
        ELog eLog = (ELog) JavaDi.get(ELog.class);
        String str2 = TAG;
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("getRegionsById() called with: buildingId = [", str, "], ids = [", "], listener = [", list);
        sbS.append(iPSGetByIdListener);
        sbS.append("]");
        eLog.api(str2, sbS.toString());
        return Content.INSTANCE.getRegionsById(str, list, iPSGetByIdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getCategoryLocation$1(String str, String str2) {
        HashMap map = new HashMap();
        map.put("buildingId", str);
        map.put("categoryId", str2);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getProductAndCategoriesLocation$2(String str, String str2, List list) {
        HashMap map = new HashMap();
        map.put("buildingId", str);
        map.put("productId", str2);
        map.put("categoryIds", String.join(",", list));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getProductLocation$0(String str, String str2) {
        HashMap map = new HashMap();
        map.put("buildingId", str);
        map.put("productId", str2);
        return map;
    }

    public static void removeRegionsListener(@NonNull String str, @NonNull IPSRegionsListener iPSRegionsListener) {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "removeBuildingRegionsListener() called with: buildingId = [" + str + "], listener = [" + iPSRegionsListener + "]");
        Content.INSTANCE.removeBuildingRegionsListener(str, iPSRegionsListener);
    }

    @Nullable
    public static IPSCancelable search(@NonNull String str, @NonNull String str2, int i, @NonNull IPSContentSearchListener iPSContentSearchListener) {
        ELog eLog = (ELog) JavaDi.get(ELog.class);
        String str3 = TAG;
        StringBuilder sbV = YU.a.v("searchInBuilding() called with: buildingId = [", str, "], searchTerm = [", str2, "], pageSize = [");
        sbV.append(i);
        sbV.append("], listener = [");
        sbV.append(iPSContentSearchListener);
        sbV.append("]");
        eLog.api(str3, sbV.toString());
        return Content.INSTANCE.search(str, str2, i, iPSContentSearchListener);
    }

    @Nullable
    public static IPSSnapToRegionResult snapToClosestRegion(@NonNull IPSCoordinateInBuilding iPSCoordinateInBuilding, @NonNull List<IPSRegion> list) {
        return Content.INSTANCE.snapToClosestRegion(iPSCoordinateInBuilding, list);
    }

    @Nullable
    public static IPSSnapToShapeResult snapToClosestShape(@NonNull IPSCoordinate iPSCoordinate, @NonNull List<IPSShape> list) {
        return Content.INSTANCE.snapToClosestShape(iPSCoordinate, list);
    }
}
