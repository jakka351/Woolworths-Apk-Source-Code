package com.google.cloud.audit;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.rpc.Status;

/* loaded from: classes6.dex */
public final class AuditLog extends GeneratedMessageLite<AuditLog, Builder> implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private int bitField0_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private Struct response_;
    private Any serviceData_;
    private Status status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private Internal.ProtobufList<AuthorizationInfo> authorizationInfo_ = GeneratedMessageLite.w();

    /* renamed from: com.google.cloud.audit.AuditLog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14856a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f14856a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14856a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14856a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14856a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14856a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14856a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14856a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuditLog, Builder> implements AuditLogOrBuilder {
    }

    static {
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.J(AuditLog.class, auditLog);
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000fဉ\u0005\u0010ဉ\u0003\u0011ဉ\u0004", new Object[]{"bitField0_", "status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 3:
                return new AuditLog();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<AuditLog> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuditLog.class) {
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
