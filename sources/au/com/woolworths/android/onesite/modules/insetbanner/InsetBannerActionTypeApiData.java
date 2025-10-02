package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "LINK", "APPLOCAL", "UNKNOWN", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerActionTypeApiData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsetBannerActionTypeApiData[] $VALUES;

    @SerializedName("LINK")
    public static final InsetBannerActionTypeApiData LINK = new InsetBannerActionTypeApiData("LINK", 0);

    @SerializedName("APPLOCAL")
    public static final InsetBannerActionTypeApiData APPLOCAL = new InsetBannerActionTypeApiData("APPLOCAL", 1);

    @DefaultValue
    public static final InsetBannerActionTypeApiData UNKNOWN = new InsetBannerActionTypeApiData("UNKNOWN", 2);

    private static final /* synthetic */ InsetBannerActionTypeApiData[] $values() {
        return new InsetBannerActionTypeApiData[]{LINK, APPLOCAL, UNKNOWN};
    }

    static {
        InsetBannerActionTypeApiData[] insetBannerActionTypeApiDataArr$values = $values();
        $VALUES = insetBannerActionTypeApiDataArr$values;
        $ENTRIES = EnumEntriesKt.a(insetBannerActionTypeApiDataArr$values);
    }

    private InsetBannerActionTypeApiData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InsetBannerActionTypeApiData> getEntries() {
        return $ENTRIES;
    }

    public static InsetBannerActionTypeApiData valueOf(String str) {
        return (InsetBannerActionTypeApiData) Enum.valueOf(InsetBannerActionTypeApiData.class, str);
    }

    public static InsetBannerActionTypeApiData[] values() {
        return (InsetBannerActionTypeApiData[]) $VALUES.clone();
    }
}
