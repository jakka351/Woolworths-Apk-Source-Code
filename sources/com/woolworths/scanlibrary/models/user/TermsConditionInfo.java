package com.woolworths.scanlibrary.models.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/woolworths/scanlibrary/models/user/TermsConditionInfo;", "", "isTnCAccepted", "", "<init>", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TermsConditionInfo {
    public static final int $stable = 0;

    @SerializedName("istncaccepted")
    private final boolean isTnCAccepted;

    public TermsConditionInfo(boolean z) {
        this.isTnCAccepted = z;
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getIsTnCAccepted() {
        return this.isTnCAccepted;
    }

    public static /* synthetic */ TermsConditionInfo copy$default(TermsConditionInfo termsConditionInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = termsConditionInfo.isTnCAccepted;
        }
        return termsConditionInfo.copy(z);
    }

    @NotNull
    public final TermsConditionInfo copy(boolean isTnCAccepted) {
        return new TermsConditionInfo(isTnCAccepted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TermsConditionInfo) && this.isTnCAccepted == ((TermsConditionInfo) other).isTnCAccepted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTnCAccepted);
    }

    @NotNull
    public String toString() {
        return a.n("TermsConditionInfo(isTnCAccepted=", ")", this.isTnCAccepted);
    }
}
