package au.com.woolworths.foundation.rewards.banner.model;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/model/ApiElevationType;", "", "<init>", "(Ljava/lang/String;I)V", "INLINE", "ELEVATED", "banner-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiElevationType {

    @SerializedName("ELEVATED")
    public static final ApiElevationType ELEVATED;

    @DefaultValue
    @SerializedName("INLINE")
    public static final ApiElevationType INLINE;
    public static final /* synthetic */ ApiElevationType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ApiElevationType apiElevationType = new ApiElevationType("INLINE", 0);
        INLINE = apiElevationType;
        ApiElevationType apiElevationType2 = new ApiElevationType("ELEVATED", 1);
        ELEVATED = apiElevationType2;
        ApiElevationType[] apiElevationTypeArr = {apiElevationType, apiElevationType2};
        d = apiElevationTypeArr;
        e = EnumEntriesKt.a(apiElevationTypeArr);
    }

    private ApiElevationType(String str, int i) {
    }

    public static ApiElevationType valueOf(String str) {
        return (ApiElevationType) Enum.valueOf(ApiElevationType.class, str);
    }

    public static ApiElevationType[] values() {
        return (ApiElevationType[]) d.clone();
    }
}
