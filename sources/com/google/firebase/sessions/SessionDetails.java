package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails;", "", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class SessionDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f15815a;
    public final String b;
    public final int c;
    public final long d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/SessionDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SessionDetails> serializer() {
            return SessionDetails$$serializer.f15816a;
        }
    }

    public /* synthetic */ SessionDetails(long j, String str, int i, int i2, String str2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, SessionDetails$$serializer.f15816a.getDescriptor());
            throw null;
        }
        this.f15815a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return Intrinsics.c(this.f15815a, sessionDetails.f15815a) && Intrinsics.c(this.b, sessionDetails.b) && this.c == sessionDetails.c && this.d == sessionDetails.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.c(this.f15815a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.f15815a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return androidx.camera.core.impl.b.q(sb, this.d, ')');
    }

    public SessionDetails(long j, String str, String str2, int i) {
        this.f15815a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
