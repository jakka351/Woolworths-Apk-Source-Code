package au.com.woolworths.android.onesite.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/data/DownloadableAssetFit;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "ASPECT_FILL", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadableAssetFit {

    @DefaultValue
    @SerializedName("ASPECT_FILL")
    public static final DownloadableAssetFit ASPECT_FILL;

    @SerializedName("CENTER")
    public static final DownloadableAssetFit CENTER;
    public static final /* synthetic */ DownloadableAssetFit[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        DownloadableAssetFit downloadableAssetFit = new DownloadableAssetFit("CENTER", 0);
        CENTER = downloadableAssetFit;
        DownloadableAssetFit downloadableAssetFit2 = new DownloadableAssetFit("ASPECT_FILL", 1);
        ASPECT_FILL = downloadableAssetFit2;
        DownloadableAssetFit[] downloadableAssetFitArr = {downloadableAssetFit, downloadableAssetFit2};
        d = downloadableAssetFitArr;
        e = EnumEntriesKt.a(downloadableAssetFitArr);
    }

    private DownloadableAssetFit(String str, int i) {
    }

    public static DownloadableAssetFit valueOf(String str) {
        return (DownloadableAssetFit) Enum.valueOf(DownloadableAssetFit.class, str);
    }

    public static DownloadableAssetFit[] values() {
        return (DownloadableAssetFit[]) d.clone();
    }
}
