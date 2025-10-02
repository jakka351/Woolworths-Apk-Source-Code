package au.com.woolworths.shop.aem.components.model.downloadableAsset;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/downloadableAsset/DownloadableAssetData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "", "assetId", "Lau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetType;", "assetType", "assetUrl", "", "assetWidth", "assetHeight", "Lau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetFit;", "fit", "altText", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetType;Ljava/lang/String;IILau/com/woolworths/shop/aem/components/model/downloadableAsset/AssetFit;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DownloadableAssetData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10154a;

    @SerializedName("alternativeText")
    @MappedName
    @Nullable
    private final String altText;
    public final AssetType b;
    public final String c;
    public final int d;
    public final int e;
    public final AssetFit f;

    public DownloadableAssetData(@Nullable String str, @NotNull AssetType assetType, @NotNull String assetUrl, int i, int i2, @Nullable AssetFit assetFit, @Nullable String str2) {
        Intrinsics.h(assetType, "assetType");
        Intrinsics.h(assetUrl, "assetUrl");
        this.f10154a = str;
        this.b = assetType;
        this.c = assetUrl;
        this.d = i;
        this.e = i2;
        this.f = assetFit;
        this.altText = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableAssetData)) {
            return false;
        }
        DownloadableAssetData downloadableAssetData = (DownloadableAssetData) obj;
        return Intrinsics.c(this.f10154a, downloadableAssetData.f10154a) && this.b == downloadableAssetData.b && Intrinsics.c(this.c, downloadableAssetData.c) && this.d == downloadableAssetData.d && this.e == downloadableAssetData.e && this.f == downloadableAssetData.f && Intrinsics.c(this.altText, downloadableAssetData.altText);
    }

    public final int hashCode() {
        String str = this.f10154a;
        int iA = b.a(this.e, b.a(this.d, b.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31), 31);
        AssetFit assetFit = this.f;
        int iHashCode = (iA + (assetFit == null ? 0 : assetFit.hashCode())) * 31;
        String str2 = this.altText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.altText;
        StringBuilder sb = new StringBuilder("DownloadableAssetData(assetId=");
        sb.append(this.f10154a);
        sb.append(", assetType=");
        sb.append(this.b);
        sb.append(", assetUrl=");
        a.x(this.d, this.c, ", assetWidth=", ", assetHeight=", sb);
        sb.append(this.e);
        sb.append(", fit=");
        sb.append(this.f);
        sb.append(", altText=");
        return a.o(sb, str, ")");
    }
}
