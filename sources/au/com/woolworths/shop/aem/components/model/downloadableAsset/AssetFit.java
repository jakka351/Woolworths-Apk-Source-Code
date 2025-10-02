package au.com.woolworths.shop.aem.components.model.downloadableAsset;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetFit;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetFit {
    public static final AssetFit d;
    public static final AssetFit e;
    public static final /* synthetic */ AssetFit[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        AssetFit assetFit = new AssetFit("CENTER", 0);
        d = assetFit;
        AssetFit assetFit2 = new AssetFit("ASPECT_FILL", 1);
        e = assetFit2;
        AssetFit[] assetFitArr = {assetFit, assetFit2};
        f = assetFitArr;
        g = EnumEntriesKt.a(assetFitArr);
    }

    public static AssetFit valueOf(String str) {
        return (AssetFit) Enum.valueOf(AssetFit.class, str);
    }

    public static AssetFit[] values() {
        return (AssetFit[]) f.clone();
    }
}
