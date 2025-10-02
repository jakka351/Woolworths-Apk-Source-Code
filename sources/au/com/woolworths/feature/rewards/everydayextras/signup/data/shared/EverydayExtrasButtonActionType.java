package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasButtonActionType;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasButtonActionType {
    public static final EverydayExtrasButtonActionType d;
    public static final EverydayExtrasButtonActionType e;
    public static final EverydayExtrasButtonActionType f;
    public static final /* synthetic */ EverydayExtrasButtonActionType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        EverydayExtrasButtonActionType everydayExtrasButtonActionType = new EverydayExtrasButtonActionType("SUBMIT", 0);
        d = everydayExtrasButtonActionType;
        EverydayExtrasButtonActionType everydayExtrasButtonActionType2 = new EverydayExtrasButtonActionType("CANCEL", 1);
        e = everydayExtrasButtonActionType2;
        EverydayExtrasButtonActionType everydayExtrasButtonActionType3 = new EverydayExtrasButtonActionType("URL", 2);
        f = everydayExtrasButtonActionType3;
        EverydayExtrasButtonActionType[] everydayExtrasButtonActionTypeArr = {everydayExtrasButtonActionType, everydayExtrasButtonActionType2, everydayExtrasButtonActionType3};
        g = everydayExtrasButtonActionTypeArr;
        h = EnumEntriesKt.a(everydayExtrasButtonActionTypeArr);
    }

    public static EverydayExtrasButtonActionType valueOf(String str) {
        return (EverydayExtrasButtonActionType) Enum.valueOf(EverydayExtrasButtonActionType.class, str);
    }

    public static EverydayExtrasButtonActionType[] values() {
        return (EverydayExtrasButtonActionType[]) g.clone();
    }
}
