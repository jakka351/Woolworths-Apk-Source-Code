package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExifOrientationPolicy {
    public static final ExifOrientationPolicy d;
    public static final /* synthetic */ ExifOrientationPolicy[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ExifOrientationPolicy exifOrientationPolicy = new ExifOrientationPolicy("IGNORE", 0);
        ExifOrientationPolicy exifOrientationPolicy2 = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
        d = exifOrientationPolicy2;
        ExifOrientationPolicy[] exifOrientationPolicyArr = {exifOrientationPolicy, exifOrientationPolicy2, new ExifOrientationPolicy("RESPECT_ALL", 2)};
        e = exifOrientationPolicyArr;
        f = EnumEntriesKt.a(exifOrientationPolicyArr);
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) e.clone();
    }
}
