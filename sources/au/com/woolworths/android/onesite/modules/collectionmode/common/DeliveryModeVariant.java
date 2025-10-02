package au.com.woolworths.android.onesite.modules.collectionmode.common;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "DeliveryStandard", "DeliveryNow", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DeliveryModeVariant {

    @SerializedName("DeliveryNow")
    public static final DeliveryModeVariant DeliveryNow;

    @SerializedName("DeliveryStandard")
    public static final DeliveryModeVariant DeliveryStandard;
    public static final Companion e;
    public static final LinkedHashMap f;
    public static final /* synthetic */ DeliveryModeVariant[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant$Companion;", "", "", "", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/DeliveryModeVariant;", "map", "Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DeliveryModeVariant deliveryModeVariant = new DeliveryModeVariant("DeliveryStandard", 0, "delivery");
        DeliveryStandard = deliveryModeVariant;
        DeliveryModeVariant deliveryModeVariant2 = new DeliveryModeVariant("DeliveryNow", 1, "deliveryNow");
        DeliveryNow = deliveryModeVariant2;
        DeliveryModeVariant[] deliveryModeVariantArr = {deliveryModeVariant, deliveryModeVariant2};
        g = deliveryModeVariantArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(deliveryModeVariantArr);
        h = enumEntriesA;
        e = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((DeliveryModeVariant) next).d, next);
        }
        f = linkedHashMap;
    }

    private DeliveryModeVariant(String str, int i, String str2) {
        this.d = str2;
    }

    public static DeliveryModeVariant valueOf(String str) {
        return (DeliveryModeVariant) Enum.valueOf(DeliveryModeVariant.class, str);
    }

    public static DeliveryModeVariant[] values() {
        return (DeliveryModeVariant[]) g.clone();
    }
}
