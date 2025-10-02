package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DownloadableAssetType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DownloadableAssetType {
    public static final Companion e;
    public static final EnumType f;
    public static final DownloadableAssetType g;
    public static final /* synthetic */ DownloadableAssetType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DownloadableAssetType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DownloadableAssetType downloadableAssetType = new DownloadableAssetType("LOTTIE_ANIMATION", 0, "LOTTIE_ANIMATION");
        DownloadableAssetType downloadableAssetType2 = new DownloadableAssetType("IMAGE", 1, "IMAGE");
        DownloadableAssetType downloadableAssetType3 = new DownloadableAssetType("UNKNOWN__", 2, "UNKNOWN__");
        g = downloadableAssetType3;
        DownloadableAssetType[] downloadableAssetTypeArr = {downloadableAssetType, downloadableAssetType2, downloadableAssetType3};
        h = downloadableAssetTypeArr;
        i = EnumEntriesKt.a(downloadableAssetTypeArr);
        e = new Companion();
        f = new EnumType("DownloadableAssetType", CollectionsKt.R("LOTTIE_ANIMATION", "IMAGE"));
    }

    public DownloadableAssetType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static DownloadableAssetType valueOf(String str) {
        return (DownloadableAssetType) Enum.valueOf(DownloadableAssetType.class, str);
    }

    public static DownloadableAssetType[] values() {
        return (DownloadableAssetType[]) h.clone();
    }
}
