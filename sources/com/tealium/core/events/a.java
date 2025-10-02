package com.tealium.core.events;

import com.tealium.core.Logger;
import com.tealium.dispatcher.TealiumEvent;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/events/a;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19149a;
    public final long b;
    public Long c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u0012\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/tealium/core/events/a$a;", "", "", "KEY_TIMED_EVENT_DURATION", "Ljava/lang/String;", "getKEY_TIMED_EVENT_DURATION$annotations", "()V", "KEY_TIMED_EVENT_END", "getKEY_TIMED_EVENT_END$annotations", "KEY_TIMED_EVENT_NAME", "getKEY_TIMED_EVENT_NAME$annotations", "KEY_TIMED_EVENT_START", "getKEY_TIMED_EVENT_START$annotations", "TIMED_EVENT_NAME", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.core.events.a$a, reason: collision with other inner class name */
    public static final class C0383a {
        public static boolean a(a aVar) {
            Long l = aVar.c;
            if (l != null) {
                if ((l != null ? Long.valueOf(l.longValue() - aVar.b) : null) != null) {
                    return true;
                }
            }
            Logger.f19124a.b("Tealium-1.6.0", "Missing required data on TimedEvent(" + aVar + ")");
            return false;
        }

        public static TealiumEvent b(a aVar) {
            long j = aVar.b;
            LinkedHashMap linkedHashMapL = null;
            if (!a(aVar)) {
                return null;
            }
            boolean zA = a(aVar);
            if (zA) {
                if (!zA) {
                    throw new NoWhenBranchMatchedException();
                }
                Long l = aVar.c;
                if (l != null) {
                    Long lValueOf = l != null ? Long.valueOf(l.longValue() - j) : null;
                    if (lValueOf != null) {
                        linkedHashMapL = MapsKt.l(new Pair("timed_event_name", aVar.f19149a), new Pair("timed_event_start", Long.valueOf(j)), new Pair("timed_event_end", l), new Pair("timed_event_duration", lValueOf));
                    }
                }
            }
            return new TealiumEvent("timed_event", linkedHashMapL);
        }
    }

    public a(String eventName, long j) {
        Intrinsics.h(eventName, "eventName");
        this.f19149a = eventName;
        this.b = j;
    }

    public final void a(Long l) {
        this.c = l;
    }

    /* renamed from: b, reason: from getter */
    public final String getF19149a() {
        return this.f19149a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f19149a, aVar.f19149a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return androidx.camera.core.impl.b.b(this.f19149a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TimedEvent(eventName=" + this.f19149a + ", startTime=" + this.b + ", data=null)";
    }
}
