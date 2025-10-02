package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final Map zzb;

    @NotNull
    private final zzbb zzc;

    @NotNull
    private final zzba zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final Map zzf;

    static {
        Pair pair = new Pair(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, null));
        zztv zztvVar = zztv.JS_INTERNAL_ERROR;
        zzbb zzbbVar = zzbb.zzb;
        zzb = MapsKt.j(pair, new Pair(zztvVar, new zzbd(zzbbVar, zzba.zzc, null)), new Pair(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, null)), new Pair(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, null)), new Pair(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, null)), new Pair(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, null)), new Pair(zztv.JS_PROGRAM_ERROR, new zzbd(zzbbVar, zzba.zzj, null)));
    }

    public zzbd(@NotNull zzbb zzbbVar, @NotNull zzba zzbaVar, @Nullable String str) {
        this.zzc = zzbbVar;
        this.zzd = zzbaVar;
        this.zze = str;
        zzbb zzbbVar2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = MapsKt.j(new Pair(zzbbVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new Pair(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new Pair(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new Pair(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new Pair(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new Pair(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new Pair(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    @NotNull
    public final zzba zza() {
        return this.zzd;
    }

    @NotNull
    public final zzbb zzb() {
        return this.zzc;
    }

    @NotNull
    public final RecaptchaException zzc() {
        zzba zzbaVar = this.zzd;
        if (Intrinsics.c(zzbaVar, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (Intrinsics.c(zzbaVar, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    @Nullable
    public final String zzd() {
        return this.zze;
    }
}
