package io.grpc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ExperimentalApi
/* loaded from: classes7.dex */
public final class SecurityLevel {
    public static final SecurityLevel d;
    public static final SecurityLevel e;
    public static final /* synthetic */ SecurityLevel[] f;

    static {
        SecurityLevel securityLevel = new SecurityLevel("NONE", 0);
        d = securityLevel;
        SecurityLevel securityLevel2 = new SecurityLevel("INTEGRITY", 1);
        SecurityLevel securityLevel3 = new SecurityLevel("PRIVACY_AND_INTEGRITY", 2);
        e = securityLevel3;
        f = new SecurityLevel[]{securityLevel, securityLevel2, securityLevel3};
    }

    public static SecurityLevel valueOf(String str) {
        return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
    }

    public static SecurityLevel[] values() {
        return (SecurityLevel[]) f.clone();
    }
}
