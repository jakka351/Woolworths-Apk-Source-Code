package com.google.firebase.sessions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/SessionData;", "", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class SessionData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] d = {null, null, new LinkedHashMapSerializer(StringSerializer.f24821a, ProcessData$$serializer.f15807a)};

    /* renamed from: a, reason: collision with root package name */
    public final SessionDetails f15811a;
    public final Time b;
    public final Map c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SessionData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/SessionData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SessionData> serializer() {
            return SessionData$$serializer.f15812a;
        }
    }

    public /* synthetic */ SessionData(int i, SessionDetails sessionDetails, Time time, Map map) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, SessionData$$serializer.f15812a.getB());
            throw null;
        }
        this.f15811a = sessionDetails;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = time;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static SessionData a(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i) {
        if ((i & 1) != 0) {
            sessionDetails = sessionData.f15811a;
        }
        if ((i & 2) != 0) {
            time = sessionData.b;
        }
        if ((i & 4) != 0) {
            map = sessionData.c;
        }
        sessionData.getClass();
        Intrinsics.h(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, time, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        return Intrinsics.c(this.f15811a, sessionData.f15811a) && Intrinsics.c(this.b, sessionData.b) && Intrinsics.c(this.c, sessionData.c);
    }

    public final int hashCode() {
        int iHashCode = this.f15811a.hashCode() * 31;
        Time time = this.b;
        int iHashCode2 = (iHashCode + (time == null ? 0 : Long.hashCode(time.f15827a))) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionData(sessionDetails=");
        sb.append(this.f15811a);
        sb.append(", backgroundTime=");
        sb.append(this.b);
        sb.append(", processDataMap=");
        return android.support.v4.media.session.a.u(sb, this.c, ')');
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map map) {
        Intrinsics.h(sessionDetails, "sessionDetails");
        this.f15811a = sessionDetails;
        this.b = time;
        this.c = map;
    }
}
