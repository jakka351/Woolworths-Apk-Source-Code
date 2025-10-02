package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM", "RIGHT", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerActionPlacementTypeApiData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InsetBannerActionPlacementTypeApiData[] $VALUES;

    @DefaultValue
    @SerializedName("BOTTOM")
    public static final InsetBannerActionPlacementTypeApiData BOTTOM = new InsetBannerActionPlacementTypeApiData("BOTTOM", 0);

    @SerializedName("RIGHT")
    public static final InsetBannerActionPlacementTypeApiData RIGHT = new InsetBannerActionPlacementTypeApiData("RIGHT", 1);

    private static final /* synthetic */ InsetBannerActionPlacementTypeApiData[] $values() {
        return new InsetBannerActionPlacementTypeApiData[]{BOTTOM, RIGHT};
    }

    static {
        InsetBannerActionPlacementTypeApiData[] insetBannerActionPlacementTypeApiDataArr$values = $values();
        $VALUES = insetBannerActionPlacementTypeApiDataArr$values;
        $ENTRIES = EnumEntriesKt.a(insetBannerActionPlacementTypeApiDataArr$values);
    }

    private InsetBannerActionPlacementTypeApiData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InsetBannerActionPlacementTypeApiData> getEntries() {
        return $ENTRIES;
    }

    public static InsetBannerActionPlacementTypeApiData valueOf(String str) {
        return (InsetBannerActionPlacementTypeApiData) Enum.valueOf(InsetBannerActionPlacementTypeApiData.class, str);
    }

    public static InsetBannerActionPlacementTypeApiData[] values() {
        return (InsetBannerActionPlacementTypeApiData[]) $VALUES.clone();
    }
}
