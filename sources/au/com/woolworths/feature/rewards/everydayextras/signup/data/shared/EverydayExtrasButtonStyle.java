package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasButtonStyle;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasButtonStyle {
    public static final EverydayExtrasButtonStyle d;
    public static final EverydayExtrasButtonStyle e;
    public static final EverydayExtrasButtonStyle f;
    public static final /* synthetic */ EverydayExtrasButtonStyle[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        EverydayExtrasButtonStyle everydayExtrasButtonStyle = new EverydayExtrasButtonStyle("PRIMARY", 0);
        d = everydayExtrasButtonStyle;
        EverydayExtrasButtonStyle everydayExtrasButtonStyle2 = new EverydayExtrasButtonStyle("SECONDARY", 1);
        e = everydayExtrasButtonStyle2;
        EverydayExtrasButtonStyle everydayExtrasButtonStyle3 = new EverydayExtrasButtonStyle("TERTIARY", 2);
        f = everydayExtrasButtonStyle3;
        EverydayExtrasButtonStyle[] everydayExtrasButtonStyleArr = {everydayExtrasButtonStyle, everydayExtrasButtonStyle2, everydayExtrasButtonStyle3};
        g = everydayExtrasButtonStyleArr;
        h = EnumEntriesKt.a(everydayExtrasButtonStyleArr);
    }

    public static EverydayExtrasButtonStyle valueOf(String str) {
        return (EverydayExtrasButtonStyle) Enum.valueOf(EverydayExtrasButtonStyle.class, str);
    }

    public static EverydayExtrasButtonStyle[] values() {
        return (EverydayExtrasButtonStyle[]) g.clone();
    }
}
