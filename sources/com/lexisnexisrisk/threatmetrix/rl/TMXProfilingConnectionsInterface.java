package com.lexisnexisrisk.threatmetrix.rl;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnnnnn;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public interface TMXProfilingConnectionsInterface {

    public enum HttpMethod {
        GET,
        POST;

        public static HttpMethod valueOf(String str) {
            return (HttpMethod) nlnnnnn.ooo006F006Foo(HttpMethod.class, str);
        }
    }

    public interface TMXCallback {
        boolean onComplete(@Nonnull TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream);
    }

    public static class TMXHttpResponseCode extends TMXSocketResponseCode {
        public static final int HttpResponseCRLError = -15;
        public static final int HttpResponseCertPathBuilderError = -12;
        public static final int HttpResponseCertPathValidatorError = -13;
        public static final int HttpResponseCertStoreError = -14;
        public static final int HttpResponseCertificateEncodingError = -8;
        public static final int HttpResponseCertificateError = -7;
        public static final int HttpResponseCertificateExpired = -9;
        public static final int HttpResponseCertificateMismatch = -6;
        public static final int HttpResponseCertificateNotYetValid = -10;
        public static final int HttpResponseCertificateParsingError = -11;
        public static final int HttpResponseConnectionError = -1;
        public static final int HttpResponseHostNotFoundError = -3;
        public static final int HttpResponseHostVerificationError = -5;
        public static final int HttpResponseNetworkTimeoutError = -4;
        public static final int HttpResponseNotYet = -2;
        public static final int HttpResponseOK = 200;
        private int q00710071qqqq;

        public TMXHttpResponseCode(int i) {
            super();
            this.q00710071qqqq = i;
        }

        public int getHttpResponseCode() {
            return this.q00710071qqqq;
        }

        public void setHttpResponseCode(int i) {
            this.q00710071qqqq = i;
        }

        public boolean succeeded() {
            int i = this.q00710071qqqq;
            return i == 200 || i == 204;
        }

        public String toString() {
            return String.valueOf(this.q00710071qqqq);
        }
    }

    public static class TMXSocketResponseCode {
        public static final int ResponseIOException = -22;
        public static final int ResponseIllegalArgumentException = -23;
        public static final int ResponseOk = -20;
        public static final int ResponseUnknownHost = -21;

        private TMXSocketResponseCode() {
        }
    }

    void cancelProfiling();

    void closeSocket(@Nonnull String str, int i);

    void httpRequest(@Nonnull HttpMethod httpMethod, @Nonnull String str, Map<String, String> map, byte[] bArr, @Nullable TMXCallback tMXCallback);

    void resolveHostByName(String str);

    void sendSocketRequest(@Nonnull String str, int i, @Nonnull byte[] bArr, boolean z, @Nullable TMXCallback tMXCallback);

    @Deprecated
    void socketRequest(String str, int i, String str2);
}
