package com.woolworths.scanlibrary.models.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/woolworths/scanlibrary/models/profile/Preference;", "", "isemailinvoiceopted", "", "<init>", "(Ljava/lang/Boolean;)V", "getIsemailinvoiceopted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woolworths/scanlibrary/models/profile/Preference;", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Preference {
    public static final int $stable = 0;

    @SerializedName("isemailinvoiceopted")
    @Nullable
    private final Boolean isemailinvoiceopted;

    public Preference() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Preference copy$default(Preference preference, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = preference.isemailinvoiceopted;
        }
        return preference.copy(bool);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsemailinvoiceopted() {
        return this.isemailinvoiceopted;
    }

    @NotNull
    public final Preference copy(@Nullable Boolean isemailinvoiceopted) {
        return new Preference(isemailinvoiceopted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Preference) && Intrinsics.c(this.isemailinvoiceopted, ((Preference) other).isemailinvoiceopted);
    }

    @Nullable
    public final Boolean getIsemailinvoiceopted() {
        return this.isemailinvoiceopted;
    }

    public int hashCode() {
        Boolean bool = this.isemailinvoiceopted;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return a.k(this.isemailinvoiceopted, "Preference(isemailinvoiceopted=", ")");
    }

    public Preference(@Nullable Boolean bool) {
        this.isemailinvoiceopted = bool;
    }

    public /* synthetic */ Preference(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
