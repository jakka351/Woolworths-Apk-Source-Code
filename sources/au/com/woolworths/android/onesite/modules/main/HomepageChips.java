package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/HomepageChips;", "", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomepageChips {
    public static final Companion g;
    public static final LinkedHashMap h;
    public static final HomepageChips i;
    public static final HomepageChips j;
    public static final HomepageChips k;
    public static final /* synthetic */ HomepageChips[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int d;
    public final int e;
    public final CollectionMode[] f;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/HomepageChips$Companion;", "", "", "", "Lau/com/woolworths/android/onesite/modules/main/HomepageChips;", "map", "Ljava/util/Map;", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "collectionModeMap", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HomepageChips homepageChips = new HomepageChips("PICK_UP", 0, R.id.mode_chip_pick_up, R.string.shopping_header_pick_up_from, CollectionMode.PickUp.d);
        i = homepageChips;
        HomepageChips homepageChips2 = new HomepageChips("DELIVERY", 1, R.id.mode_chip_delivery, R.string.shopping_header_deliver_to, new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard), new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow));
        j = homepageChips2;
        HomepageChips homepageChips3 = new HomepageChips("IN_STORE", 2, R.id.mode_chip_in_store, R.string.shopping_header_in_store, CollectionMode.InStore.d);
        k = homepageChips3;
        HomepageChips[] homepageChipsArr = {homepageChips, homepageChips2, homepageChips3};
        l = homepageChipsArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(homepageChipsArr);
        m = enumEntriesA;
        g = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((HomepageChips) next).d), next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = ((AbstractList) m).iterator();
        while (it2.hasNext()) {
            HomepageChips homepageChips4 = (HomepageChips) it2.next();
            for (CollectionMode collectionMode : homepageChips4.f) {
                linkedHashMap2.put(collectionMode, homepageChips4);
            }
        }
        h = linkedHashMap2;
    }

    public HomepageChips(String str, int i2, int i3, int i4, CollectionMode... collectionModeArr) {
        this.d = i3;
        this.e = i4;
        this.f = collectionModeArr;
    }

    public static HomepageChips valueOf(String str) {
        return (HomepageChips) Enum.valueOf(HomepageChips.class, str);
    }

    public static HomepageChips[] values() {
        return (HomepageChips[]) l.clone();
    }
}
