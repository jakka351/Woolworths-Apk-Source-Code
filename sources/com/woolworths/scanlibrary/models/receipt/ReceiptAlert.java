package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;", "", "showAlert", "", "alertTitle", "", "alertMessage", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getShowAlert", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAlertTitle", "()Ljava/lang/String;", "getAlertMessage", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReceiptAlert {
    public static final int $stable = 0;

    @SerializedName("alertMessage")
    @Nullable
    private final String alertMessage;

    @SerializedName("alertTitle")
    @Nullable
    private final String alertTitle;

    @SerializedName("showAlert")
    @Nullable
    private final Boolean showAlert;

    public ReceiptAlert(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.showAlert = bool;
        this.alertTitle = str;
        this.alertMessage = str2;
    }

    public static /* synthetic */ ReceiptAlert copy$default(ReceiptAlert receiptAlert, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = receiptAlert.showAlert;
        }
        if ((i & 2) != 0) {
            str = receiptAlert.alertTitle;
        }
        if ((i & 4) != 0) {
            str2 = receiptAlert.alertMessage;
        }
        return receiptAlert.copy(bool, str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getShowAlert() {
        return this.showAlert;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    @NotNull
    public final ReceiptAlert copy(@Nullable Boolean showAlert, @Nullable String alertTitle, @Nullable String alertMessage) {
        return new ReceiptAlert(showAlert, alertTitle, alertMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptAlert)) {
            return false;
        }
        ReceiptAlert receiptAlert = (ReceiptAlert) other;
        return Intrinsics.c(this.showAlert, receiptAlert.showAlert) && Intrinsics.c(this.alertTitle, receiptAlert.alertTitle) && Intrinsics.c(this.alertMessage, receiptAlert.alertMessage);
    }

    @Nullable
    public final String getAlertMessage() {
        return this.alertMessage;
    }

    @Nullable
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    @Nullable
    public final Boolean getShowAlert() {
        return this.showAlert;
    }

    public int hashCode() {
        Boolean bool = this.showAlert;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.alertTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.alertMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.showAlert;
        String str = this.alertTitle;
        String str2 = this.alertMessage;
        StringBuilder sb = new StringBuilder("ReceiptAlert(showAlert=");
        sb.append(bool);
        sb.append(", alertTitle=");
        sb.append(str);
        sb.append(", alertMessage=");
        return a.o(sb, str2, ")");
    }
}
