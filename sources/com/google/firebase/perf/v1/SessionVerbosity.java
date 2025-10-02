package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes.dex */
public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public final int d;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<SessionVerbosity> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return SessionVerbosity.a(i);
        }
    }

    public static final class SessionVerbosityVerifier implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f15745a = new SessionVerbosityVerifier();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return SessionVerbosity.a(i) != null;
        }
    }

    SessionVerbosity(int i) {
        this.d = i;
    }

    public static SessionVerbosity a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        return this.d;
    }
}
