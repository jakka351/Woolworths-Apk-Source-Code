package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

@Deprecated
/* loaded from: classes5.dex */
public final class zbd implements Api.ApiOptions.Optional {
    public static final zbd zba = new zbd(new zbc());
    private final String zbb = null;
    private final boolean zbc;

    @Nullable
    private final String zbd;

    public zbd(zbc zbcVar) {
        this.zbc = zbcVar.zba.booleanValue();
        this.zbd = zbcVar.zbb;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return Objects.equal(null, null) && this.zbc == zbdVar.zbc && Objects.equal(this.zbd, zbdVar.zbd);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.zbc), this.zbd);
    }

    public final Bundle zba() {
        Bundle bundleG = c.g("consumer_package", null);
        bundleG.putBoolean("force_save_dialog", this.zbc);
        bundleG.putString("log_session_id", this.zbd);
        return bundleG;
    }

    public final /* synthetic */ boolean zbb() {
        return this.zbc;
    }

    public final /* synthetic */ String zbc() {
        return this.zbd;
    }
}
