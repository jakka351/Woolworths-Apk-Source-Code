package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeIdData;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/CollectionModeId;", "", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShoppingModeIdData implements CollectionModeId {
    public static final ShoppingModeIdData f;
    public static final /* synthetic */ ShoppingModeIdData[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;
    public final CollectionMode e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeIdData$Companion;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ShoppingModeIdData shoppingModeIdData = new ShoppingModeIdData("DELIVERY", 0, "DELIVERY", new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard));
        ShoppingModeIdData shoppingModeIdData2 = new ShoppingModeIdData("DELIVERY_NOW", 1, "DELIVERY_NOW", new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow));
        f = shoppingModeIdData2;
        ShoppingModeIdData[] shoppingModeIdDataArr = {shoppingModeIdData, shoppingModeIdData2, new ShoppingModeIdData("INSTORE", 2, "INSTORE", CollectionMode.InStore.d), new ShoppingModeIdData("PICKUP", 3, "PICKUP", CollectionMode.PickUp.d)};
        g = shoppingModeIdDataArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(shoppingModeIdDataArr);
        h = enumEntriesA;
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : enumEntriesA) {
            linkedHashMap.put(((ShoppingModeIdData) obj).e, obj);
        }
    }

    public ShoppingModeIdData(String str, int i, String str2, CollectionMode collectionMode) {
        this.d = str2;
        this.e = collectionMode;
    }

    public static ShoppingModeIdData valueOf(String str) {
        return (ShoppingModeIdData) Enum.valueOf(ShoppingModeIdData.class, str);
    }

    public static ShoppingModeIdData[] values() {
        return (ShoppingModeIdData[]) g.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
