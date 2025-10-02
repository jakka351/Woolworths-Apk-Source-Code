package io.grpc;

/* loaded from: classes7.dex */
public final class TlsChannelCredentials extends ChannelCredentials {

    public static final class Builder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature {
        public static final Feature d;
        public static final Feature e;
        public static final /* synthetic */ Feature[] f;

        /* JADX INFO: Fake field, exist only in values array */
        Feature EF0;

        static {
            Feature feature = new Feature("FAKE", 0);
            Feature feature2 = new Feature("MTLS", 1);
            d = feature2;
            Feature feature3 = new Feature("CUSTOM_MANAGERS", 2);
            e = feature3;
            f = new Feature[]{feature, feature2, feature3};
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) f.clone();
        }
    }
}
