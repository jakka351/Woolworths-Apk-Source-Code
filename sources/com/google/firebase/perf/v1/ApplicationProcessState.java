package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes.dex */
public enum ApplicationProcessState implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public final int d;

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<ApplicationProcessState> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            if (i == 0) {
                return ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
            }
            if (i == 1) {
                return ApplicationProcessState.FOREGROUND;
            }
            if (i == 2) {
                return ApplicationProcessState.BACKGROUND;
            }
            if (i != 3) {
                return null;
            }
            return ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f15732a = new ApplicationProcessStateVerifier();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ApplicationProcessState.FOREGROUND_BACKGROUND : ApplicationProcessState.BACKGROUND : ApplicationProcessState.FOREGROUND : ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) != null;
        }
    }

    ApplicationProcessState(int i2) {
        this.d = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        return this.d;
    }
}
