package me.oriient.internal.infra.utils.android.appState;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/utils/android/appState/AppState;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "UNDEFINED", "FOREGROUND", "BACKGROUND", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    private final int code;
    public static final AppState UNDEFINED = new AppState("UNDEFINED", 0, 0);
    public static final AppState FOREGROUND = new AppState("FOREGROUND", 1, 1);
    public static final AppState BACKGROUND = new AppState("BACKGROUND", 2, 2);

    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{UNDEFINED, FOREGROUND, BACKGROUND};
    }

    static {
        AppState[] appStateArr$values = $values();
        $VALUES = appStateArr$values;
        $ENTRIES = EnumEntriesKt.a(appStateArr$values);
    }

    private AppState(String str, int i, int i2) {
        this.code = i2;
    }

    @NotNull
    public static EnumEntries<AppState> getEntries() {
        return $ENTRIES;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
