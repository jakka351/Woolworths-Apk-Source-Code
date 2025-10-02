package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Encodable
/* loaded from: classes.dex */
public final /* data */ class SessionEvent {

    /* renamed from: a, reason: collision with root package name */
    public final SessionInfo f15817a;
    public final ApplicationInfo b;

    public SessionEvent(SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        EventType eventType = EventType.e;
        this.f15817a = sessionInfo;
        this.b = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        EventType eventType = EventType.e;
        return this.f15817a.equals(sessionEvent.f15817a) && this.b.equals(sessionEvent.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f15817a.hashCode() + (EventType.e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EventType.e + ", sessionData=" + this.f15817a + ", applicationInfo=" + this.b + ')';
    }
}
