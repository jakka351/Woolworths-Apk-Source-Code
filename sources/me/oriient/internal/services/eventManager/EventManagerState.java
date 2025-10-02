package me.oriient.internal.services.eventManager;

import androidx.annotation.Keep;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/eventManager/EventManagerState;", "", "eLogName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getELogName", "()Ljava/lang/String;", "OFFLINE", "CONNECTING", "DISCONNECTING", "ONLINE", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventManagerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventManagerState[] $VALUES;

    @NotNull
    private final String eLogName;
    public static final EventManagerState OFFLINE = new EventManagerState("OFFLINE", 0, "offline");
    public static final EventManagerState CONNECTING = new EventManagerState("CONNECTING", 1, "reconnecting");
    public static final EventManagerState DISCONNECTING = new EventManagerState("DISCONNECTING", 2, "disconnecting");
    public static final EventManagerState ONLINE = new EventManagerState("ONLINE", 3, CustomTabsCallback.ONLINE_EXTRAS_KEY);

    private static final /* synthetic */ EventManagerState[] $values() {
        return new EventManagerState[]{OFFLINE, CONNECTING, DISCONNECTING, ONLINE};
    }

    static {
        EventManagerState[] eventManagerStateArr$values = $values();
        $VALUES = eventManagerStateArr$values;
        $ENTRIES = EnumEntriesKt.a(eventManagerStateArr$values);
    }

    private EventManagerState(String str, int i, String str2) {
        this.eLogName = str2;
    }

    @NotNull
    public static EnumEntries<EventManagerState> getEntries() {
        return $ENTRIES;
    }

    public static EventManagerState valueOf(String str) {
        return (EventManagerState) Enum.valueOf(EventManagerState.class, str);
    }

    public static EventManagerState[] values() {
        return (EventManagerState[]) $VALUES.clone();
    }

    @NotNull
    public final String getELogName() {
        return this.eLogName;
    }
}
