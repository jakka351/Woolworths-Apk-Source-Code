package com.tealium.core;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/Session;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class Session {

    /* renamed from: a, reason: collision with root package name */
    public final long f19126a;
    public long b;
    public int c;
    public boolean d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tealium/core/Session$a;", "", "", "INVALID_SESSION_ID", "J", "", "KEY_SESSION_EVENT_COUNT", "Ljava/lang/String;", "KEY_SESSION_ID", "KEY_SESSION_LAST_EVENT_TIME", "KEY_SESSION_STARTED", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public static void a(SharedPreferences sharedPreferences, Session session) {
            Intrinsics.h(sharedPreferences, "sharedPreferences");
            Intrinsics.h(session, "session");
            sharedPreferences.edit().putLong("tealium_session_id", session.f19126a).putLong("tealium_session_last_event_time", session.b).putInt("tealium_session_event_count", session.c).putBoolean("tealium_session_started", session.d).apply();
        }
    }

    public Session(long j, int i, long j2, boolean z) {
        this.f19126a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.f19126a == session.f19126a && this.b == session.b && this.c == session.c && this.d == session.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.b(Long.hashCode(this.f19126a) * 31, 31, this.b), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iA + i;
    }

    public final String toString() {
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        StringBuilder sbT = androidx.camera.core.impl.b.t(this.f19126a, "Session(id=", ", lastEventTime=");
        sbT.append(j);
        sbT.append(", eventCount=");
        sbT.append(i);
        sbT.append(", sessionStarted=");
        sbT.append(z);
        sbT.append(")");
        return sbT.toString();
    }
}
