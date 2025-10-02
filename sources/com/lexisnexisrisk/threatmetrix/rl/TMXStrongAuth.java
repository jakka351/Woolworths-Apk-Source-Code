package com.lexisnexisrisk.threatmetrix.rl;

import android.app.Activity;
import android.content.Intent;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnnnnn;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class TMXStrongAuth {
    public static final String AUTH_ACTION = "auth_action";
    public static final String AUTH_CONTEXT = "auth_context";
    public static final String AUTH_METHOD = "auth_method";
    public static final String AUTH_PROMPT = "auth_prompt";
    public static final String AUTH_REQUEST_ID = "auth_request_id";
    public static final String AUTH_TITLE = "title";
    private static final Map<Integer, AuthenticationCallback> q007100710071q0071q = new HashMap(2);
    public static final String qq00710071q0071q = "stepup";
    private static final int qqqq00710071q = 65534;

    public enum AuthMethod {
        TMX_UNKNOWN_METHOD("unknownmethod"),
        TMX_USER_PRESENCE("tmxuserpresence"),
        TMX_DEVICE_PRESENCE("tmxdevicepresence");

        public final String methodName;

        AuthMethod(String str) {
            this.methodName = str;
        }

        public static AuthMethod valueOf(String str) {
            return (AuthMethod) nlnnnnn.ooo006F006Foo(AuthMethod.class, str);
        }

        public static AuthMethod w0077ww0077w0077w(String str) {
            for (AuthMethod authMethod : values()) {
                if (str.equals(authMethod.methodName)) {
                    return authMethod;
                }
            }
            return TMX_UNKNOWN_METHOD;
        }
    }

    public static class AuthParamResult {

        @Nullable
        public final String q00710071q00710071q;

        @Nonnull
        public final AuthResult qq0071q00710071q;

        public AuthParamResult(@Nonnull AuthResult authResult, @Nullable String str) {
            this.qq0071q00710071q = authResult;
            this.q00710071q00710071q = str;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEREGISTRATION_FAILED' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class AuthResult {
        public static final AuthResult ALREADY_REGISTERED;
        public static final AuthResult CONTEXT_NOT_FOUND;
        public static final AuthResult DEREGISTERED;
        public static final AuthResult DEREGISTRATION_FAILED;
        public static final AuthResult MISSING_FUNCTION;
        public static final AuthResult MISSING_PARAMETER;
        public static final AuthResult NOT_SUPPORTED;
        public static final AuthResult REGISTERED;
        public static final AuthResult REGISTRATION_CANCELLED;
        public static final AuthResult REGISTRATION_FAILED;
        public static final AuthResult STEPUP_CANCELLED;
        public static final AuthResult STEPUP_COMPLETE;
        public static final AuthResult STEPUP_FAILED;
        private static final /* synthetic */ AuthResult[] qq0071007100710071q;
        public final TMXStatusCode q0071q007100710071q;
        public final String qqq007100710071q;

        static {
            AuthResult authResult = new AuthResult("ALREADY_REGISTERED", 0, "ALREADY_REGISTERED", TMXStatusCode.TMX_StrongAuth_AlreadyRegistered);
            ALREADY_REGISTERED = authResult;
            AuthResult authResult2 = new AuthResult("CONTEXT_NOT_FOUND", 1, "CONTEXT_NOT_FOUND", TMXStatusCode.TMX_StrongAuth_UserNotFound);
            CONTEXT_NOT_FOUND = authResult2;
            TMXStatusCode tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Failed;
            AuthResult authResult3 = new AuthResult("DEREGISTRATION_FAILED", 2, "DEREGISTRATION_FAILED", tMXStatusCode);
            DEREGISTRATION_FAILED = authResult3;
            TMXStatusCode tMXStatusCode2 = TMXStatusCode.TMX_OK;
            AuthResult authResult4 = new AuthResult("DEREGISTERED", 3, "DEREGISTERED", tMXStatusCode2);
            DEREGISTERED = authResult4;
            TMXStatusCode tMXStatusCode3 = TMXStatusCode.TMX_Internal_Error;
            AuthResult authResult5 = new AuthResult("MISSING_FUNCTION", 4, "MISSING_FUNCTION", tMXStatusCode3);
            MISSING_FUNCTION = authResult5;
            AuthResult authResult6 = new AuthResult("MISSING_PARAMETER", 5, "MISSING_PARAMETER", tMXStatusCode3);
            MISSING_PARAMETER = authResult6;
            AuthResult authResult7 = new AuthResult("NOT_SUPPORTED", 6, "NOT_SUPPORTED", TMXStatusCode.TMX_StrongAuth_Unsupported);
            NOT_SUPPORTED = authResult7;
            AuthResult authResult8 = new AuthResult("REGISTRATION_FAILED", 7, "REGISTRATION_FAILED", tMXStatusCode);
            REGISTRATION_FAILED = authResult8;
            TMXStatusCode tMXStatusCode4 = TMXStatusCode.TMX_StrongAuth_Cancelled;
            AuthResult authResult9 = new AuthResult("REGISTRATION_CANCELLED", 8, "REGISTRATION_CANCELLED", tMXStatusCode4);
            REGISTRATION_CANCELLED = authResult9;
            AuthResult authResult10 = new AuthResult("REGISTERED", 9, "REGISTERED", tMXStatusCode2);
            REGISTERED = authResult10;
            AuthResult authResult11 = new AuthResult("STEPUP_CANCELLED", 10, "STEPUP_CANCELLED", tMXStatusCode4);
            STEPUP_CANCELLED = authResult11;
            AuthResult authResult12 = new AuthResult("STEPUP_COMPLETE", 11, "STEPUP_COMPLETE", tMXStatusCode2);
            STEPUP_COMPLETE = authResult12;
            AuthResult authResult13 = new AuthResult("STEPUP_FAILED", 12, "STEPUP_FAILED", tMXStatusCode);
            STEPUP_FAILED = authResult13;
            qq0071007100710071q = new AuthResult[]{authResult, authResult2, authResult3, authResult4, authResult5, authResult6, authResult7, authResult8, authResult9, authResult10, authResult11, authResult12, authResult13};
        }

        private AuthResult(String str, int i, String str2, TMXStatusCode tMXStatusCode) {
            this.qqq007100710071q = str2;
            this.q0071q007100710071q = tMXStatusCode;
        }

        public static AuthResult valueOf(String str) {
            return (AuthResult) nlnnnnn.ooo006F006Foo(AuthResult.class, str);
        }

        public static AuthResult[] values() {
            return (AuthResult[]) qq0071007100710071q.clone();
        }
    }

    public static class AuthenticationCallback implements StrongAuthCallback {
        private final Activity qqqqqq0071;
        private int qq0071qqq0071 = 0;
        private final CountDownLatch q00710071007100710071q = new CountDownLatch(1);
        private int q0071qqqq0071 = (int) (Math.random() * 65534.0d);

        public AuthenticationCallback(Activity activity) {
            this.qqqqqq0071 = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w0077007700770077w0077w(int i) {
            this.q0071qqqq0071 = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CountDownLatch w0077w00770077w0077w() {
            return this.q00710071007100710071q;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ww007700770077w0077w(int i) {
            this.qq0071qqq0071 = i;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth.StrongAuthCallback
        public int callIntent(@androidx.annotation.Nullable Intent intent) throws InterruptedException {
            try {
                this.qqqqqq0071.startActivityForResult(intent, this.q0071qqqq0071);
                this.q00710071007100710071q.await();
                return this.qq0071qqq0071;
            } catch (InterruptedException unused) {
                return 0;
            }
        }

        public int getRequestCode() {
            return this.q0071qqqq0071;
        }
    }

    public enum AuthenticationStatus {
        TMX_STRONG_AUTH_NOT_POSSIBLE,
        TMX_STRONG_AUTH_OK,
        TMX_STRONG_AUTH_FAILED,
        TMX_STRONG_AUTH_CANCELLED;

        public static AuthenticationStatus valueOf(String str) {
            return (AuthenticationStatus) nlnnnnn.ooo006F006Foo(AuthenticationStatus.class, str);
        }
    }

    public interface StrongAuthCallback {
        int callIntent(@Nullable Intent intent);
    }

    public static final class StrongAuthConfiguration {
        public String q007100710071qq0071;
        public String q0071q0071qq0071;
        public String q0071qq0071q0071;
        public String qq00710071qq0071;
        public String qqq0071qq0071;
        public String qqqq0071q0071;

        public StrongAuthConfiguration() {
        }

        public StrongAuthConfiguration setAuthAction(String str) {
            this.qqq0071qq0071 = str;
            return this;
        }

        public StrongAuthConfiguration setAuthContext(String str) {
            this.qq00710071qq0071 = str;
            return this;
        }

        public StrongAuthConfiguration setAuthMethod(String str) {
            this.q0071qq0071q0071 = str;
            return this;
        }

        public StrongAuthConfiguration setAuthPrompt(String str) {
            this.q007100710071qq0071 = str;
            return this;
        }

        public StrongAuthConfiguration setAuthRequestId(String str) {
            this.q0071q0071qq0071 = str;
            return this;
        }

        public StrongAuthConfiguration setAuthTitle(String str) {
            this.qqqq0071q0071 = str;
            return this;
        }

        public StrongAuthConfiguration(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull String str4, @Nullable String str5, @Nonnull String str6) {
            this.q0071qq0071q0071 = str2;
            this.q007100710071qq0071 = str6;
            this.qq00710071qq0071 = str4;
            this.q0071q0071qq0071 = str3;
            this.qqq0071qq0071 = str;
            this.qqqq0071q0071 = str5;
        }
    }

    private TMXStrongAuth() {
    }

    @Nonnull
    public static AuthParamResult generateAuthParamResult(@Nonnull AuthResult authResult, @Nullable String str) {
        return new AuthParamResult(authResult, str);
    }

    public static AuthenticationCallback newAuthenticationCallback(Activity activity) {
        AuthenticationCallback authenticationCallback = new AuthenticationCallback(activity);
        int requestCode = authenticationCallback.getRequestCode();
        Map<Integer, AuthenticationCallback> map = q007100710071q0071q;
        synchronized (map) {
            try {
                if (map.get(Integer.valueOf(requestCode)) != null) {
                    authenticationCallback.w0077007700770077w0077w((int) (Math.random() * 65534.0d));
                }
                map.put(Integer.valueOf(authenticationCallback.getRequestCode()), authenticationCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return authenticationCallback;
    }

    public static void processAuthenticationResult(int i, int i2) {
        Map<Integer, AuthenticationCallback> map = q007100710071q0071q;
        synchronized (map) {
            try {
                AuthenticationCallback authenticationCallback = map.get(Integer.valueOf(i));
                if (authenticationCallback != null) {
                    authenticationCallback.ww007700770077w0077w(i2);
                    authenticationCallback.w0077w00770077w0077w().countDown();
                }
                map.remove(Integer.valueOf(i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
