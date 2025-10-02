package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006&"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/NominatedPersonIdCheck;", "", "enabled", "", "showInputField", "showWarningMessage", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "inputLabel", "nominatedName", "warningMessage", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Z", "getShowInputField", "getShowWarningMessage", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getInputLabel", "getNominatedName", "getWarningMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NominatedPersonIdCheck {

    @SerializedName("Enabled")
    private final boolean enabled;

    @SerializedName("InputLabel")
    @NotNull
    private final String inputLabel;

    @SerializedName("NominatedName")
    @NotNull
    private final String nominatedName;

    @SerializedName("ShowInputField")
    private final boolean showInputField;

    @SerializedName("ShowWarningMessage")
    private final boolean showWarningMessage;

    @SerializedName("Subtitle")
    @NotNull
    private final String subtitle;

    @SerializedName("Title")
    @NotNull
    private final String title;

    @SerializedName("WarningMessage")
    @Nullable
    private final String warningMessage;

    public NominatedPersonIdCheck(boolean z, boolean z2, boolean z3, @NotNull String title, @NotNull String subtitle, @NotNull String inputLabel, @NotNull String nominatedName, @Nullable String str) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(inputLabel, "inputLabel");
        Intrinsics.h(nominatedName, "nominatedName");
        this.enabled = z;
        this.showInputField = z2;
        this.showWarningMessage = z3;
        this.title = title;
        this.subtitle = subtitle;
        this.inputLabel = inputLabel;
        this.nominatedName = nominatedName;
        this.warningMessage = str;
    }

    public static /* synthetic */ NominatedPersonIdCheck copy$default(NominatedPersonIdCheck nominatedPersonIdCheck, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nominatedPersonIdCheck.enabled;
        }
        if ((i & 2) != 0) {
            z2 = nominatedPersonIdCheck.showInputField;
        }
        if ((i & 4) != 0) {
            z3 = nominatedPersonIdCheck.showWarningMessage;
        }
        if ((i & 8) != 0) {
            str = nominatedPersonIdCheck.title;
        }
        if ((i & 16) != 0) {
            str2 = nominatedPersonIdCheck.subtitle;
        }
        if ((i & 32) != 0) {
            str3 = nominatedPersonIdCheck.inputLabel;
        }
        if ((i & 64) != 0) {
            str4 = nominatedPersonIdCheck.nominatedName;
        }
        if ((i & 128) != 0) {
            str5 = nominatedPersonIdCheck.warningMessage;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return nominatedPersonIdCheck.copy(z, z2, z3, str, str8, str9, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowInputField() {
        return this.showInputField;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowWarningMessage() {
        return this.showWarningMessage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInputLabel() {
        return this.inputLabel;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getNominatedName() {
        return this.nominatedName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    @NotNull
    public final NominatedPersonIdCheck copy(boolean enabled, boolean showInputField, boolean showWarningMessage, @NotNull String title, @NotNull String subtitle, @NotNull String inputLabel, @NotNull String nominatedName, @Nullable String warningMessage) {
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(inputLabel, "inputLabel");
        Intrinsics.h(nominatedName, "nominatedName");
        return new NominatedPersonIdCheck(enabled, showInputField, showWarningMessage, title, subtitle, inputLabel, nominatedName, warningMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NominatedPersonIdCheck)) {
            return false;
        }
        NominatedPersonIdCheck nominatedPersonIdCheck = (NominatedPersonIdCheck) other;
        return this.enabled == nominatedPersonIdCheck.enabled && this.showInputField == nominatedPersonIdCheck.showInputField && this.showWarningMessage == nominatedPersonIdCheck.showWarningMessage && Intrinsics.c(this.title, nominatedPersonIdCheck.title) && Intrinsics.c(this.subtitle, nominatedPersonIdCheck.subtitle) && Intrinsics.c(this.inputLabel, nominatedPersonIdCheck.inputLabel) && Intrinsics.c(this.nominatedName, nominatedPersonIdCheck.nominatedName) && Intrinsics.c(this.warningMessage, nominatedPersonIdCheck.warningMessage);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getInputLabel() {
        return this.inputLabel;
    }

    @NotNull
    public final String getNominatedName() {
        return this.nominatedName;
    }

    public final boolean getShowInputField() {
        return this.showInputField;
    }

    public final boolean getShowWarningMessage() {
        return this.showWarningMessage;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.e(b.e(Boolean.hashCode(this.enabled) * 31, 31, this.showInputField), 31, this.showWarningMessage), 31, this.title), 31, this.subtitle), 31, this.inputLabel), 31, this.nominatedName);
        String str = this.warningMessage;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.showInputField;
        boolean z3 = this.showWarningMessage;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.inputLabel;
        String str4 = this.nominatedName;
        String str5 = this.warningMessage;
        StringBuilder sbV = b.v("NominatedPersonIdCheck(enabled=", ", showInputField=", ", showWarningMessage=", z, z2);
        a.y(", title=", str, ", subtitle=", sbV, z3);
        androidx.constraintlayout.core.state.a.B(sbV, str2, ", inputLabel=", str3, ", nominatedName=");
        return androidx.constraintlayout.core.state.a.l(sbV, str4, ", warningMessage=", str5, ")");
    }
}
