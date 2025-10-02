package au.com.woolworths.android.onesite.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/data/DownloadableAssetType;", "", "<init>", "(Ljava/lang/String;I)V", "LOTTIE_ANIMATION", "IMAGE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadableAssetType {

    @SerializedName("IMAGE")
    public static final DownloadableAssetType IMAGE;

    @SerializedName("LOTTIE_ANIMATION")
    public static final DownloadableAssetType LOTTIE_ANIMATION;
    public static final DownloadableAssetType d;
    public static final /* synthetic */ DownloadableAssetType[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        DownloadableAssetType downloadableAssetType = new DownloadableAssetType("LOTTIE_ANIMATION", 0);
        LOTTIE_ANIMATION = downloadableAssetType;
        DownloadableAssetType downloadableAssetType2 = new DownloadableAssetType("IMAGE", 1);
        IMAGE = downloadableAssetType2;
        DownloadableAssetType downloadableAssetType3 = new DownloadableAssetType("UNKNOWN", 2);
        d = downloadableAssetType3;
        DownloadableAssetType[] downloadableAssetTypeArr = {downloadableAssetType, downloadableAssetType2, downloadableAssetType3};
        e = downloadableAssetTypeArr;
        f = EnumEntriesKt.a(downloadableAssetTypeArr);
    }

    private DownloadableAssetType(String str, int i) {
    }

    public static DownloadableAssetType valueOf(String str) {
        return (DownloadableAssetType) Enum.valueOf(DownloadableAssetType.class, str);
    }

    public static DownloadableAssetType[] values() {
        return (DownloadableAssetType[]) e.clone();
    }
}
