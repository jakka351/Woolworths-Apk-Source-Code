package io.grpc.okhttp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: classes7.dex */
public final class NegotiationType {
    public static final /* synthetic */ NegotiationType[] d = {new NegotiationType("TLS", 0), new NegotiationType("PLAINTEXT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    NegotiationType EF5;

    public static NegotiationType valueOf(String str) {
        return (NegotiationType) Enum.valueOf(NegotiationType.class, str);
    }

    public static NegotiationType[] values() {
        return (NegotiationType[]) d.clone();
    }
}
