package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzff {

    @NotNull
    private final Lazy zza;

    @NotNull
    private final Lazy zzb;

    @NotNull
    private final Lazy zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = LazyKt.b(zzfc.zza);
        this.zzb = LazyKt.b(zzfd.zza);
        this.zzc = LazyKt.b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getD();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, Continuation continuation) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return StringsKt.Q(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb, false);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getD();
    }

    @Nullable
    public final Object zzc(@NotNull String str, @NotNull zzto zztoVar, @NotNull Continuation continuation) throws RecaptchaException {
        return CoroutineScopeKt.c(new zzfb(this, str, zztoVar, null), continuation);
    }

    @Nullable
    public final Object zzd(@NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull Continuation continuation) throws zzbd {
        return zze(this, zzscVar, zzekVar, continuation);
    }
}
