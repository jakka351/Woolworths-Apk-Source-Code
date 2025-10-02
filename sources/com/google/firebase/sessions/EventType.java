package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/EventType;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventType implements NumberedEnum {
    public static final EventType e;
    public static final /* synthetic */ EventType[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d;

    static {
        EventType eventType = new EventType("EVENT_TYPE_UNKNOWN", 0, 0);
        EventType eventType2 = new EventType("SESSION_START", 1, 1);
        e = eventType2;
        EventType[] eventTypeArr = {eventType, eventType2};
        f = eventTypeArr;
        g = EnumEntriesKt.a(eventTypeArr);
    }

    public EventType(String str, int i, int i2) {
        this.d = i2;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) f.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    /* renamed from: g, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
