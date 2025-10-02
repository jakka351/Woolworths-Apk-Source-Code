package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzen {

    @Nullable
    private static zzqk zza;

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final zzeo zzf;

    @NotNull
    private final Context zzg;

    @Nullable
    private final Integer zzh;

    @NotNull
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();

    @NotNull
    private final int zzk;

    @NotNull
    private final int zzl;

    public zzen(@NotNull int i, @NotNull String str, @NotNull int i2, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull zzeo zzeoVar, @NotNull zzcc zzccVar, @NotNull Context context, @Nullable Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i2;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:34:0x00c7, B:38:0x00e6], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: NameNotFoundException -> 0x0144, TryCatch #1 {NameNotFoundException -> 0x0144, blocks: (B:43:0x0113, B:45:0x0117, B:46:0x0130), top: B:61:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[Catch: NameNotFoundException -> 0x0144, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x0144, blocks: (B:43:0x0113, B:45:0x0117, B:46:0x0130), top: B:61:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzqq r13) throws java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() throws MissingResourceException {
        zzc(3, null);
    }

    public final void zzb(@NotNull zzbd zzbdVar) throws MissingResourceException {
        zzqo zzqoVarZzg = zzqq.zzg();
        zzqoVarZzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzqoVarZzg.zze(zzbdVar.zza().zza());
        zzqoVarZzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbdVar.zzd();
        if (strZzd != null) {
            zzqoVarZzg.zzf(strZzd);
        }
        zzc(4, (zzqq) zzqoVarZzg.zzk());
    }
}
