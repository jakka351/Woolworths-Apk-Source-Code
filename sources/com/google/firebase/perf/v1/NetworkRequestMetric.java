package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;

/* loaded from: classes.dex */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.e;
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15739a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15739a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15739a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15739a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15739a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15739a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15739a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15739a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
    }

    public static final class CustomAttributesDefaultEntryHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f15740a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.n;
            f15740a = new MapEntryLite(fieldType, fieldType, "");
        }
    }

    public enum HttpMethod implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public final int d;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<HttpMethod> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return HttpMethod.a(i);
            }
        }

        public static final class HttpMethodVerifier implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f15741a = new HttpMethodVerifier();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return HttpMethod.a(i) != null;
            }
        }

        HttpMethod(int i) {
            this.d = i;
        }

        public static HttpMethod a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    public enum NetworkClientErrorReason implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public final int d;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<NetworkClientErrorReason> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                if (i == 0) {
                    return NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            }
        }

        public static final class NetworkClientErrorReasonVerifier implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final Internal.EnumVerifier f15742a = new NetworkClientErrorReasonVerifier();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return (i != 0 ? i != 1 ? null : NetworkClientErrorReason.GENERIC_CLIENT_ERROR : NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN) != null;
            }
        }

        NetworkClientErrorReason(int i) {
            this.d = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.J(NetworkRequestMetric.class, networkRequestMetric);
    }

    public static void L(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 1;
        networkRequestMetric.url_ = str;
    }

    public static void M(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        networkRequestMetric.networkClientErrorReason_ = 1;
        networkRequestMetric.bitField0_ |= 16;
    }

    public static void N(NetworkRequestMetric networkRequestMetric, int i) {
        networkRequestMetric.bitField0_ |= 32;
        networkRequestMetric.httpResponseCode_ = i;
    }

    public static void O(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 64;
        networkRequestMetric.responseContentType_ = str;
    }

    public static void P(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.bitField0_ &= -65;
        networkRequestMetric.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void Q(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 128;
        networkRequestMetric.clientStartTimeUs_ = j;
    }

    public static void R(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 256;
        networkRequestMetric.timeToRequestCompletedUs_ = j;
    }

    public static void S(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 512;
        networkRequestMetric.timeToResponseInitiatedUs_ = j;
    }

    public static void T(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 1024;
        networkRequestMetric.timeToResponseCompletedUs_ = j;
    }

    public static MapFieldLite U(NetworkRequestMetric networkRequestMetric) {
        MapFieldLite<String, String> mapFieldLite = networkRequestMetric.customAttributes_;
        if (!mapFieldLite.d) {
            networkRequestMetric.customAttributes_ = mapFieldLite.c();
        }
        return networkRequestMetric.customAttributes_;
    }

    public static void V(NetworkRequestMetric networkRequestMetric, List list) {
        Internal.ProtobufList<PerfSession> protobufList = networkRequestMetric.perfSessions_;
        if (!protobufList.r()) {
            networkRequestMetric.perfSessions_ = GeneratedMessageLite.C(protobufList);
        }
        AbstractMessageLite.k(list, networkRequestMetric.perfSessions_);
    }

    public static void W(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
        networkRequestMetric.getClass();
        networkRequestMetric.httpMethod_ = httpMethod.d;
        networkRequestMetric.bitField0_ |= 2;
    }

    public static void X(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 4;
        networkRequestMetric.requestPayloadBytes_ = j;
    }

    public static void Y(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 8;
        networkRequestMetric.responsePayloadBytes_ = j;
    }

    public static NetworkRequestMetric a0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder s0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final long Z() {
        return this.clientStartTimeUs_;
    }

    public final HttpMethod b0() {
        HttpMethod httpMethodA = HttpMethod.a(this.httpMethod_);
        return httpMethodA == null ? HttpMethod.HTTP_METHOD_UNKNOWN : httpMethodA;
    }

    public final int c0() {
        return this.httpResponseCode_;
    }

    public final Internal.ProtobufList d0() {
        return this.perfSessions_;
    }

    public final long e0() {
        return this.requestPayloadBytes_;
    }

    public final long f0() {
        return this.responsePayloadBytes_;
    }

    public final long g0() {
        return this.timeToRequestCompletedUs_;
    }

    public final long h0() {
        return this.timeToResponseCompletedUs_;
    }

    public final long i0() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String j0() {
        return this.url_;
    }

    public final boolean k0() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean l0() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean m0() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean n0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean o0() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean p0() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean q0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean r0() {
        return (this.bitField0_ & 512) != 0;
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
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.HttpMethodVerifier.f15741a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.NetworkClientErrorReasonVerifier.f15742a, "customAttributes_", CustomAttributesDefaultEntryHolder.f15740a, "perfSessions_", PerfSession.class});
            case 3:
                return new NetworkRequestMetric();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<NetworkRequestMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NetworkRequestMetric.class) {
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
