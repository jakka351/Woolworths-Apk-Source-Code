package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* loaded from: classes.dex */
final class AutoValue_SendRequest extends SendRequest {

    public static final class Builder extends SendRequest.Builder {

        /* renamed from: a, reason: collision with root package name */
        public TransportContext f14435a;
        public String b;
        public Event c;
        public Transformer d;
        public Encoding e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Encoding a() {
        return null;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Event b() {
        return null;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Transformer c() {
        return null;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final TransportContext d() {
        return null;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        ((SendRequest) obj).d();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SendRequest{transportContext=" + ((Object) null) + ", transportName=" + ((String) null) + ", event=" + ((Object) null) + ", transformer=" + ((Object) null) + ", encoding=" + ((Object) null) + "}";
    }
}
