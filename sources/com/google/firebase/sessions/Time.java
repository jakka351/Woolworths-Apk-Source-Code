package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/Time;", "", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class Time {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final long f15827a;
    public final long b;
    public final long c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/Time;", "serializer", "()Lkotlinx/serialization/KSerializer;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Time> serializer() {
            return Time$$serializer.f15828a;
        }
    }

    public /* synthetic */ Time(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.a(i, 1, Time$$serializer.f15828a.getB());
            throw null;
        }
        this.f15827a = j;
        this.b = (i & 2) == 0 ? 1000 * j : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Time) && this.f15827a == ((Time) obj).f15827a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15827a);
    }

    public final String toString() {
        return androidx.camera.core.impl.b.q(new StringBuilder("Time(ms="), this.f15827a, ')');
    }

    public Time(long j) {
        this.f15827a = j;
        long j2 = 1000;
        this.b = j * j2;
        this.c = j / j2;
    }
}
