package au.com.woolworths.shop.aem.components.model.downloadableAsset;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetType;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetType {
    public static final AssetType d;
    public static final AssetType e;
    public static final AssetType f;
    public static final /* synthetic */ AssetType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        AssetType assetType = new AssetType("LOTTIE_ANIMATION", 0);
        d = assetType;
        AssetType assetType2 = new AssetType("IMAGE", 1);
        e = assetType2;
        AssetType assetType3 = new AssetType("UNKNOWN", 2);
        f = assetType3;
        AssetType[] assetTypeArr = {assetType, assetType2, assetType3};
        g = assetTypeArr;
        h = EnumEntriesKt.a(assetTypeArr);
    }

    public static AssetType valueOf(String str) {
        return (AssetType) Enum.valueOf(AssetType.class, str);
    }

    public static AssetType[] values() {
        return (AssetType[]) g.clone();
    }
}
