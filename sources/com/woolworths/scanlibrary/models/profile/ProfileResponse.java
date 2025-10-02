package com.woolworths.scanlibrary.models.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/ProfileResponse;", "", Scopes.PROFILE, "Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;", "preference", "Lcom/woolworths/scanlibrary/models/profile/Preference;", "storeinfo", "Lcom/woolworths/scanlibrary/models/profile/Storeinfo;", "status", "Lcom/woolworths/scanlibrary/models/profile/Status;", "survey", "Lcom/woolworths/scanlibrary/models/profile/Survey;", "kioskFlags", "Lcom/woolworths/scanlibrary/models/profile/KioskFlags;", "paymentMethodVerification", "Lcom/woolworths/scanlibrary/models/profile/PaymentMethodVerification;", "<init>", "(Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;Lcom/woolworths/scanlibrary/models/profile/Preference;Lcom/woolworths/scanlibrary/models/profile/Storeinfo;Lcom/woolworths/scanlibrary/models/profile/Status;Lcom/woolworths/scanlibrary/models/profile/Survey;Lcom/woolworths/scanlibrary/models/profile/KioskFlags;Lcom/woolworths/scanlibrary/models/profile/PaymentMethodVerification;)V", "getProfile", "()Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;", "getPreference", "()Lcom/woolworths/scanlibrary/models/profile/Preference;", "getStoreinfo", "()Lcom/woolworths/scanlibrary/models/profile/Storeinfo;", "getStatus", "()Lcom/woolworths/scanlibrary/models/profile/Status;", "getSurvey", "()Lcom/woolworths/scanlibrary/models/profile/Survey;", "getKioskFlags", "()Lcom/woolworths/scanlibrary/models/profile/KioskFlags;", "getPaymentMethodVerification", "()Lcom/woolworths/scanlibrary/models/profile/PaymentMethodVerification;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProfileResponse {
    public static final int $stable = 8;

    @SerializedName("kioskflags")
    @Nullable
    private final KioskFlags kioskFlags;

    @SerializedName("paymentverification")
    @Nullable
    private final PaymentMethodVerification paymentMethodVerification;

    @SerializedName("preference")
    @Nullable
    private final Preference preference;

    @SerializedName(Scopes.PROFILE)
    @Nullable
    private final AuthResponse profile;

    @SerializedName("status")
    @NotNull
    private final Status status;

    @SerializedName("storeinfo")
    @Nullable
    private final Storeinfo storeinfo;

    @SerializedName("survey")
    @Nullable
    private final Survey survey;

    public ProfileResponse(@Nullable AuthResponse authResponse, @Nullable Preference preference, @Nullable Storeinfo storeinfo, @NotNull Status status, @Nullable Survey survey, @Nullable KioskFlags kioskFlags, @Nullable PaymentMethodVerification paymentMethodVerification) {
        Intrinsics.h(status, "status");
        this.profile = authResponse;
        this.preference = preference;
        this.storeinfo = storeinfo;
        this.status = status;
        this.survey = survey;
        this.kioskFlags = kioskFlags;
        this.paymentMethodVerification = paymentMethodVerification;
    }

    public static /* synthetic */ ProfileResponse copy$default(ProfileResponse profileResponse, AuthResponse authResponse, Preference preference, Storeinfo storeinfo, Status status, Survey survey, KioskFlags kioskFlags, PaymentMethodVerification paymentMethodVerification, int i, Object obj) {
        if ((i & 1) != 0) {
            authResponse = profileResponse.profile;
        }
        if ((i & 2) != 0) {
            preference = profileResponse.preference;
        }
        if ((i & 4) != 0) {
            storeinfo = profileResponse.storeinfo;
        }
        if ((i & 8) != 0) {
            status = profileResponse.status;
        }
        if ((i & 16) != 0) {
            survey = profileResponse.survey;
        }
        if ((i & 32) != 0) {
            kioskFlags = profileResponse.kioskFlags;
        }
        if ((i & 64) != 0) {
            paymentMethodVerification = profileResponse.paymentMethodVerification;
        }
        KioskFlags kioskFlags2 = kioskFlags;
        PaymentMethodVerification paymentMethodVerification2 = paymentMethodVerification;
        Survey survey2 = survey;
        Storeinfo storeinfo2 = storeinfo;
        return profileResponse.copy(authResponse, preference, storeinfo2, status, survey2, kioskFlags2, paymentMethodVerification2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AuthResponse getProfile() {
        return this.profile;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Preference getPreference() {
        return this.preference;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Storeinfo getStoreinfo() {
        return this.storeinfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Survey getSurvey() {
        return this.survey;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final KioskFlags getKioskFlags() {
        return this.kioskFlags;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final PaymentMethodVerification getPaymentMethodVerification() {
        return this.paymentMethodVerification;
    }

    @NotNull
    public final ProfileResponse copy(@Nullable AuthResponse profile, @Nullable Preference preference, @Nullable Storeinfo storeinfo, @NotNull Status status, @Nullable Survey survey, @Nullable KioskFlags kioskFlags, @Nullable PaymentMethodVerification paymentMethodVerification) {
        Intrinsics.h(status, "status");
        return new ProfileResponse(profile, preference, storeinfo, status, survey, kioskFlags, paymentMethodVerification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileResponse)) {
            return false;
        }
        ProfileResponse profileResponse = (ProfileResponse) other;
        return Intrinsics.c(this.profile, profileResponse.profile) && Intrinsics.c(this.preference, profileResponse.preference) && Intrinsics.c(this.storeinfo, profileResponse.storeinfo) && Intrinsics.c(this.status, profileResponse.status) && Intrinsics.c(this.survey, profileResponse.survey) && Intrinsics.c(this.kioskFlags, profileResponse.kioskFlags) && Intrinsics.c(this.paymentMethodVerification, profileResponse.paymentMethodVerification);
    }

    @Nullable
    public final KioskFlags getKioskFlags() {
        return this.kioskFlags;
    }

    @Nullable
    public final PaymentMethodVerification getPaymentMethodVerification() {
        return this.paymentMethodVerification;
    }

    @Nullable
    public final Preference getPreference() {
        return this.preference;
    }

    @Nullable
    public final AuthResponse getProfile() {
        return this.profile;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final Storeinfo getStoreinfo() {
        return this.storeinfo;
    }

    @Nullable
    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        AuthResponse authResponse = this.profile;
        int iHashCode = (authResponse == null ? 0 : authResponse.hashCode()) * 31;
        Preference preference = this.preference;
        int iHashCode2 = (iHashCode + (preference == null ? 0 : preference.hashCode())) * 31;
        Storeinfo storeinfo = this.storeinfo;
        int iHashCode3 = (this.status.hashCode() + ((iHashCode2 + (storeinfo == null ? 0 : storeinfo.hashCode())) * 31)) * 31;
        Survey survey = this.survey;
        int iHashCode4 = (iHashCode3 + (survey == null ? 0 : survey.hashCode())) * 31;
        KioskFlags kioskFlags = this.kioskFlags;
        int iHashCode5 = (iHashCode4 + (kioskFlags == null ? 0 : kioskFlags.hashCode())) * 31;
        PaymentMethodVerification paymentMethodVerification = this.paymentMethodVerification;
        return iHashCode5 + (paymentMethodVerification != null ? paymentMethodVerification.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfileResponse(profile=" + this.profile + ", preference=" + this.preference + ", storeinfo=" + this.storeinfo + ", status=" + this.status + ", survey=" + this.survey + ", kioskFlags=" + this.kioskFlags + ", paymentMethodVerification=" + this.paymentMethodVerification + ")";
    }

    public /* synthetic */ ProfileResponse(AuthResponse authResponse, Preference preference, Storeinfo storeinfo, Status status, Survey survey, KioskFlags kioskFlags, PaymentMethodVerification paymentMethodVerification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authResponse, (i & 2) != 0 ? null : preference, (i & 4) != 0 ? null : storeinfo, status, (i & 16) != 0 ? null : survey, (i & 32) != 0 ? null : kioskFlags, (i & 64) != 0 ? null : paymentMethodVerification);
    }
}
