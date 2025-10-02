package com.auth0.android.result;

import com.auth0.android.request.internal.JsonRequired;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/auth0/android/result/Challenge;", "", "", "challengeType", "oobCode", "bindingMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getChallengeType", "()Ljava/lang/String;", "getOobCode", "getBindingMethod", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Challenge {

    @SerializedName("binding_method")
    @Nullable
    private final String bindingMethod;

    @SerializedName("challenge_type")
    @JsonRequired
    @NotNull
    private final String challengeType;

    @SerializedName("oob_code")
    @Nullable
    private final String oobCode;

    public Challenge(@NotNull String challengeType, @Nullable String str, @Nullable String str2) {
        Intrinsics.h(challengeType, "challengeType");
        this.challengeType = challengeType;
        this.oobCode = str;
        this.bindingMethod = str2;
    }
}
