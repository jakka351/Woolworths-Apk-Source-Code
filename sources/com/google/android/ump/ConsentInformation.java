package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConsentStatus {
    }

    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(FormError formError);
    }

    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PrivacyOptionsRequirementStatus {
        public static final PrivacyOptionsRequirementStatus d;
        public static final PrivacyOptionsRequirementStatus e;
        public static final PrivacyOptionsRequirementStatus f;
        public static final /* synthetic */ PrivacyOptionsRequirementStatus[] g;

        static {
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus = new PrivacyOptionsRequirementStatus("UNKNOWN", 0);
            d = privacyOptionsRequirementStatus;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus2 = new PrivacyOptionsRequirementStatus("NOT_REQUIRED", 1);
            e = privacyOptionsRequirementStatus2;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus3 = new PrivacyOptionsRequirementStatus("REQUIRED", 2);
            f = privacyOptionsRequirementStatus3;
            g = new PrivacyOptionsRequirementStatus[]{privacyOptionsRequirementStatus, privacyOptionsRequirementStatus2, privacyOptionsRequirementStatus3};
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus valueOf(@RecentlyNonNull String str) {
            return (PrivacyOptionsRequirementStatus) Enum.valueOf(PrivacyOptionsRequirementStatus.class, str);
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus[] values() {
            return (PrivacyOptionsRequirementStatus[]) g.clone();
        }
    }
}
