package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.api.LaunchStage$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<LaunchStage> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return LaunchStage.a(i);
        }
    }

    public static final class LaunchStageVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return LaunchStage.a(i) != null;
        }
    }

    LaunchStage(int i) {
        this.d = i;
    }

    public static LaunchStage a(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
