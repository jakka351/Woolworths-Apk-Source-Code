package au.com.woolworths.foundation.shop.cart.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/BundleType;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BundleType {
    public static final BundleType d;
    public static final BundleType e;
    public static final /* synthetic */ BundleType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BundleType bundleType = new BundleType("MEMBER", 0);
        d = bundleType;
        BundleType bundleType2 = new BundleType("ONLINE", 1);
        e = bundleType2;
        BundleType[] bundleTypeArr = {bundleType, bundleType2};
        f = bundleTypeArr;
        g = EnumEntriesKt.a(bundleTypeArr);
    }

    public static BundleType valueOf(String str) {
        return (BundleType) Enum.valueOf(BundleType.class, str);
    }

    public static BundleType[] values() {
        return (BundleType[]) f.clone();
    }
}
