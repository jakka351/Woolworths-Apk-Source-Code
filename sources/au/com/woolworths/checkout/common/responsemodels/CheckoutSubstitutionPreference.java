package au.com.woolworths.checkout.common.responsemodels;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutSubstitutionPreference;", "", "isEnabled", "", "isWarningMessageEnabled", "warningMessage", "", "<init>", "(ZZLjava/lang/String;)V", "()Z", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutSubstitutionPreference {

    @SerializedName("Enabled")
    private final boolean isEnabled;

    @SerializedName("ShowWarningMessage")
    private final boolean isWarningMessageEnabled;

    @SerializedName("WarningMessage")
    @NotNull
    private final String warningMessage;

    public CheckoutSubstitutionPreference(boolean z, boolean z2, @NotNull String warningMessage) {
        Intrinsics.h(warningMessage, "warningMessage");
        this.isEnabled = z;
        this.isWarningMessageEnabled = z2;
        this.warningMessage = warningMessage;
    }

    public static /* synthetic */ CheckoutSubstitutionPreference copy$default(CheckoutSubstitutionPreference checkoutSubstitutionPreference, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkoutSubstitutionPreference.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = checkoutSubstitutionPreference.isWarningMessageEnabled;
        }
        if ((i & 4) != 0) {
            str = checkoutSubstitutionPreference.warningMessage;
        }
        return checkoutSubstitutionPreference.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWarningMessageEnabled() {
        return this.isWarningMessageEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    @NotNull
    public final CheckoutSubstitutionPreference copy(boolean isEnabled, boolean isWarningMessageEnabled, @NotNull String warningMessage) {
        Intrinsics.h(warningMessage, "warningMessage");
        return new CheckoutSubstitutionPreference(isEnabled, isWarningMessageEnabled, warningMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutSubstitutionPreference)) {
            return false;
        }
        CheckoutSubstitutionPreference checkoutSubstitutionPreference = (CheckoutSubstitutionPreference) other;
        return this.isEnabled == checkoutSubstitutionPreference.isEnabled && this.isWarningMessageEnabled == checkoutSubstitutionPreference.isWarningMessageEnabled && Intrinsics.c(this.warningMessage, checkoutSubstitutionPreference.warningMessage);
    }

    @NotNull
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        return this.warningMessage.hashCode() + b.e(Boolean.hashCode(this.isEnabled) * 31, 31, this.isWarningMessageEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isWarningMessageEnabled() {
        return this.isWarningMessageEnabled;
    }

    @NotNull
    public String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isWarningMessageEnabled;
        return a.o(b.v("CheckoutSubstitutionPreference(isEnabled=", ", isWarningMessageEnabled=", ", warningMessage=", z, z2), this.warningMessage, ")");
    }
}
