package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasSpacerSize;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSpacerSize {
    public static final EverydayExtrasSpacerSize d;
    public static final EverydayExtrasSpacerSize e;
    public static final EverydayExtrasSpacerSize f;
    public static final EverydayExtrasSpacerSize g;
    public static final /* synthetic */ EverydayExtrasSpacerSize[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        EverydayExtrasSpacerSize everydayExtrasSpacerSize = new EverydayExtrasSpacerSize("SMALL", 0);
        d = everydayExtrasSpacerSize;
        EverydayExtrasSpacerSize everydayExtrasSpacerSize2 = new EverydayExtrasSpacerSize("REGULAR", 1);
        e = everydayExtrasSpacerSize2;
        EverydayExtrasSpacerSize everydayExtrasSpacerSize3 = new EverydayExtrasSpacerSize("LARGE", 2);
        f = everydayExtrasSpacerSize3;
        EverydayExtrasSpacerSize everydayExtrasSpacerSize4 = new EverydayExtrasSpacerSize("XLARGE", 3);
        g = everydayExtrasSpacerSize4;
        EverydayExtrasSpacerSize[] everydayExtrasSpacerSizeArr = {everydayExtrasSpacerSize, everydayExtrasSpacerSize2, everydayExtrasSpacerSize3, everydayExtrasSpacerSize4};
        h = everydayExtrasSpacerSizeArr;
        i = EnumEntriesKt.a(everydayExtrasSpacerSizeArr);
    }

    public static EverydayExtrasSpacerSize valueOf(String str) {
        return (EverydayExtrasSpacerSize) Enum.valueOf(EverydayExtrasSpacerSize.class, str);
    }

    public static EverydayExtrasSpacerSize[] values() {
        return (EverydayExtrasSpacerSize[]) h.clone();
    }
}
