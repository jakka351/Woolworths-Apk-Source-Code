package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class InstallationResponse {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        public static final ResponseCode d;
        public static final ResponseCode e;
        public static final /* synthetic */ ResponseCode[] f;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            d = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            e = responseCode2;
            f = new ResponseCode[]{responseCode, responseCode2};
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) f.clone();
        }
    }

    public abstract TokenResult a();

    public abstract String b();

    public abstract String c();

    public abstract ResponseCode d();

    public abstract String e();
}
