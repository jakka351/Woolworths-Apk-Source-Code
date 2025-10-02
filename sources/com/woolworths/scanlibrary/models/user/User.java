package com.woolworths.scanlibrary.models.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/woolworths/scanlibrary/models/user/User;", "Ljava/io/Serializable;", "firstname", "", "lastname", Scopes.EMAIL, "rewardscardNumber", "hasAcceptedTCs", "", "refreshToken", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getFirstname", "()Ljava/lang/String;", "getLastname", "getEmail", "getRewardscardNumber", "getHasAcceptedTCs", "()Z", "getRefreshToken", "getAccessToken", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class User implements Serializable {
    public static final int $stable = 0;
    private static final long serialVersionUID = 1;

    @SerializedName("accessToken")
    @NotNull
    private final String accessToken;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("firstname")
    @NotNull
    private final String firstname;

    @SerializedName("hasAcceptedTCs")
    private final boolean hasAcceptedTCs;

    @SerializedName("lastname")
    @NotNull
    private final String lastname;

    @SerializedName("refreshToken")
    @NotNull
    private final String refreshToken;

    @SerializedName("rewardscardNumber")
    @NotNull
    private final String rewardscardNumber;

    public User(@NotNull String firstname, @NotNull String lastname, @NotNull String email, @NotNull String rewardscardNumber, boolean z, @NotNull String refreshToken, @NotNull String accessToken) {
        Intrinsics.h(firstname, "firstname");
        Intrinsics.h(lastname, "lastname");
        Intrinsics.h(email, "email");
        Intrinsics.h(rewardscardNumber, "rewardscardNumber");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(accessToken, "accessToken");
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.rewardscardNumber = rewardscardNumber;
        this.hasAcceptedTCs = z;
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getFirstname() {
        return this.firstname;
    }

    public final boolean getHasAcceptedTCs() {
        return this.hasAcceptedTCs;
    }

    @NotNull
    public final String getLastname() {
        return this.lastname;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getRewardscardNumber() {
        return this.rewardscardNumber;
    }
}
