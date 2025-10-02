package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "ERROR", "REWARDS", "GREEN", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerTypeApiData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsetBannerTypeApiData[] $VALUES;

    @DefaultValue
    @SerializedName("INFO")
    public static final InsetBannerTypeApiData INFO = new InsetBannerTypeApiData("INFO", 0);

    @SerializedName("WARNING")
    public static final InsetBannerTypeApiData WARNING = new InsetBannerTypeApiData("WARNING", 1);

    @SerializedName("ERROR")
    public static final InsetBannerTypeApiData ERROR = new InsetBannerTypeApiData("ERROR", 2);

    @SerializedName("REWARDS")
    public static final InsetBannerTypeApiData REWARDS = new InsetBannerTypeApiData("REWARDS", 3);

    @SerializedName("GREEN")
    public static final InsetBannerTypeApiData GREEN = new InsetBannerTypeApiData("GREEN", 4);

    private static final /* synthetic */ InsetBannerTypeApiData[] $values() {
        return new InsetBannerTypeApiData[]{INFO, WARNING, ERROR, REWARDS, GREEN};
    }

    static {
        InsetBannerTypeApiData[] insetBannerTypeApiDataArr$values = $values();
        $VALUES = insetBannerTypeApiDataArr$values;
        $ENTRIES = EnumEntriesKt.a(insetBannerTypeApiDataArr$values);
    }

    private InsetBannerTypeApiData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InsetBannerTypeApiData> getEntries() {
        return $ENTRIES;
    }

    public static InsetBannerTypeApiData valueOf(String str) {
        return (InsetBannerTypeApiData) Enum.valueOf(InsetBannerTypeApiData.class, str);
    }

    public static InsetBannerTypeApiData[] values() {
        return (InsetBannerTypeApiData[]) $VALUES.clone();
    }
}
