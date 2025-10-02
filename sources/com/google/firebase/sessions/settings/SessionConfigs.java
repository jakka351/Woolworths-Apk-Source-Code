package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class SessionConfigs {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f15843a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SessionConfigs> serializer() {
            return SessionConfigs$$serializer.f15844a;
        }
    }

    public /* synthetic */ SessionConfigs(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, SessionConfigs$$serializer.f15844a.getDescriptor());
            throw null;
        }
        this.f15843a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.c(this.f15843a, sessionConfigs.f15843a) && Intrinsics.c(this.b, sessionConfigs.b) && Intrinsics.c(this.c, sessionConfigs.c) && Intrinsics.c(this.d, sessionConfigs.d) && Intrinsics.c(this.e, sessionConfigs.e);
    }

    public final int hashCode() {
        Boolean bool = this.f15843a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f15843a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f15843a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
