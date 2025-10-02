package curtains;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/WindowType;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowType {
    public static final /* synthetic */ WindowType[] d = {new WindowType("PHONE_WINDOW", 0), new WindowType("POPUP_WINDOW", 1), new WindowType("TOOLTIP", 2), new WindowType("TOAST", 3), new WindowType("UNKNOWN", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    WindowType EF5;

    public static WindowType valueOf(String str) {
        return (WindowType) Enum.valueOf(WindowType.class, str);
    }

    public static WindowType[] values() {
        return (WindowType[]) d.clone();
    }
}
