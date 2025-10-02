package com.woolworths.scanlibrary.models.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getRewardsNumber", "", "Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;", "scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthResponseKt {
    @NotNull
    public static final String getRewardsNumber(@NotNull AuthResponse authResponse) {
        Intrinsics.h(authResponse, "<this>");
        if (authResponse.getRewardscardNumber$scanGoLibrary_release() != null && (!StringsKt.D(r0))) {
            return authResponse.getRewardscardNumber$scanGoLibrary_release();
        }
        String profileRewardsNumber$scanGoLibrary_release = authResponse.getProfileRewardsNumber$scanGoLibrary_release();
        return (profileRewardsNumber$scanGoLibrary_release == null || !(StringsKt.D(profileRewardsNumber$scanGoLibrary_release) ^ true)) ? "" : authResponse.getProfileRewardsNumber$scanGoLibrary_release();
    }
}
