package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/rewards/base/data/CoreButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "TERTIARY", "DESTRUCTIVE", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreButtonStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoreButtonStyle[] $VALUES;

    @DefaultValue
    public static final CoreButtonStyle PRIMARY = new CoreButtonStyle("PRIMARY", 0);
    public static final CoreButtonStyle SECONDARY = new CoreButtonStyle("SECONDARY", 1);
    public static final CoreButtonStyle TERTIARY = new CoreButtonStyle("TERTIARY", 2);
    public static final CoreButtonStyle DESTRUCTIVE = new CoreButtonStyle("DESTRUCTIVE", 3);

    private static final /* synthetic */ CoreButtonStyle[] $values() {
        return new CoreButtonStyle[]{PRIMARY, SECONDARY, TERTIARY, DESTRUCTIVE};
    }

    static {
        CoreButtonStyle[] coreButtonStyleArr$values = $values();
        $VALUES = coreButtonStyleArr$values;
        $ENTRIES = EnumEntriesKt.a(coreButtonStyleArr$values);
    }

    private CoreButtonStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CoreButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static CoreButtonStyle valueOf(String str) {
        return (CoreButtonStyle) Enum.valueOf(CoreButtonStyle.class, str);
    }

    public static CoreButtonStyle[] values() {
        return (CoreButtonStyle[]) $VALUES.clone();
    }
}
