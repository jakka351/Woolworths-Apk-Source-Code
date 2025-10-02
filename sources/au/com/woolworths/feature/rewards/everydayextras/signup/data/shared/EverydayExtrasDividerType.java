package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasDividerType;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasDividerType {
    public static final EverydayExtrasDividerType d;
    public static final /* synthetic */ EverydayExtrasDividerType[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        EverydayExtrasDividerType everydayExtrasDividerType = new EverydayExtrasDividerType("STANDARD", 0);
        d = everydayExtrasDividerType;
        EverydayExtrasDividerType[] everydayExtrasDividerTypeArr = {everydayExtrasDividerType};
        e = everydayExtrasDividerTypeArr;
        f = EnumEntriesKt.a(everydayExtrasDividerTypeArr);
    }

    public static EverydayExtrasDividerType valueOf(String str) {
        return (EverydayExtrasDividerType) Enum.valueOf(EverydayExtrasDividerType.class, str);
    }

    public static EverydayExtrasDividerType[] values() {
        return (EverydayExtrasDividerType[]) e.clone();
    }
}
