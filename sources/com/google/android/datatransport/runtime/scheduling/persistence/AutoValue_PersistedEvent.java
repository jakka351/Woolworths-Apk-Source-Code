package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* loaded from: classes.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {

    /* renamed from: a, reason: collision with root package name */
    public final long f14481a;
    public final TransportContext b;
    public final EventInternal c;

    public AutoValue_PersistedEvent(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f14481a = j;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.c = eventInternal;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal a() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long b() {
        return this.f14481a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f14481a == persistedEvent.b() && this.b.equals(persistedEvent.c()) && this.c.equals(persistedEvent.a());
    }

    public final int hashCode() {
        long j = this.f14481a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f14481a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
