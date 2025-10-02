package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null);
    private final boolean zab = false;
    private final boolean zac = false;

    @Nullable
    private final String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;

    @Nullable
    private final String zaf = null;

    @Nullable
    private final String zag = null;

    @Nullable
    private final Long zai = null;

    @Nullable
    private final Long zaj = null;

    private SignInOptions(boolean z, boolean z2, @Nullable String str, boolean z3, @Nullable String str2, @Nullable String str3, boolean z4, @Nullable Long l, @Nullable Long l2) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SignInOptions) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
