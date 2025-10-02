package com.google.firebase.crashlytics.internal.metadata;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EventMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final String f15289a;
    public final long b;
    public final Map c;

    public EventMetadata(String str, long j, Map additionalCustomKeys) {
        Intrinsics.h(additionalCustomKeys, "additionalCustomKeys");
        this.f15289a = str;
        this.b = j;
        this.c = additionalCustomKeys;
    }

    /* renamed from: a, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF15289a() {
        return this.f15289a;
    }

    /* renamed from: c, reason: from getter */
    public final long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return Intrinsics.c(this.f15289a, eventMetadata.f15289a) && this.b == eventMetadata.b && Intrinsics.c(this.c, eventMetadata.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.camera.core.impl.b.b(this.f15289a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.f15289a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", additionalCustomKeys=");
        return android.support.v4.media.session.a.u(sb, this.c, ')');
    }
}
