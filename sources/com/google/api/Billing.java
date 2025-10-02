package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes6.dex */
public final class Billing extends GeneratedMessageLite<Billing, Builder> implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_ = GeneratedMessageLite.w();

    /* renamed from: com.google.api.Billing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14801a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14801a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14801a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14801a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14801a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14801a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14801a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14801a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, Builder> implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.w();

        public static final class Builder extends GeneratedMessageLite.Builder<BillingDestination, Builder> implements BillingDestinationOrBuilder {
        }

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            GeneratedMessageLite.J(BillingDestination.class, billingDestination);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 3:
                    return new BillingDestination();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<BillingDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BillingDestination.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface BillingDestinationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Billing, Builder> implements BillingOrBuilder {
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        GeneratedMessageLite.J(Billing.class, billing);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 3:
                return new Billing();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Billing> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Billing.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
