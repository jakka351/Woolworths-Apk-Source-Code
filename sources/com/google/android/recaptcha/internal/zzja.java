package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzja extends zze {
    public CompletableDeferred zza;
    public zzfo zzb;

    @NotNull
    private final zzek zzc;
    private zzsc zzf;

    @NotNull
    private final zzek zzj;

    @NotNull
    private final Lazy zzk;

    @NotNull
    private final Lazy zzl;

    @NotNull
    private final Lazy zzm;

    @NotNull
    private final Lazy zzn;

    @NotNull
    private final Lazy zzo;

    @Nullable
    private zzen zzp;

    @NotNull
    private final zzbi zzq;

    @NotNull
    private final Map zzd = zzjb.zza();

    @NotNull
    private final Map zze = new LinkedHashMap();

    @NotNull
    private final zzcb zzg = new zzcb(zzje.zza);

    @NotNull
    private final zzjh zzh = zzjh.zzc();

    @NotNull
    private final zzij zzi = new zzij(this);

    public zzja(@NotNull zzek zzekVar, @NotNull zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = LazyKt.b(zzis.zza);
        this.zzl = LazyKt.b(zzit.zza);
        this.zzm = LazyKt.b(zziu.zza);
        this.zzn = LazyKt.b(zziv.zza);
        this.zzo = LazyKt.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzja r5 = r0.zzd
            kotlin.ResultKt.b(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            kotlin.Lazy r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r6 = r6.getD()     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L5f
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzbi r0 = r5.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            kotlinx.coroutines.CoroutineScope r0 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzin r1 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r6 = 3
            kotlinx.coroutines.BuildersKt.c(r0, r2, r2, r1, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L69
        L5f:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L62:
            kotlinx.coroutines.CompletableDeferred r5 = r5.zzA()
            r5.g(r6)
        L69:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.util.MissingResourceException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L30
            r3 = r9
            r4 = r1
            r9 = r2
            goto L66
        L30:
            r0 = move-exception
            r9 = r0
            goto L7b
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.ResultKt.b(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            kotlin.Lazy r10 = r8.zzl     // Catch: java.lang.Exception -> L78
            java.lang.Object r10 = r10.getD()     // Catch: java.lang.Exception -> L78
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L78
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L78
            r0.zzd = r8     // Catch: java.lang.Exception -> L78
            r0.zze = r9     // Catch: java.lang.Exception -> L78
            r0.zzf = r10     // Catch: java.lang.Exception -> L78
            r0.zzc = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L78
            if (r0 == r1) goto L77
            r4 = r9
            r3 = r10
            r10 = r0
            r9 = r8
        L66:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L72
            goto L99
        L72:
            r0 = move-exception
            r10 = r0
            r2 = r9
            r9 = r10
            goto L7b
        L77:
            return r1
        L78:
            r0 = move-exception
            r9 = r0
            r2 = r8
        L7b:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r0, r1, r9)
            com.google.android.recaptcha.internal.zzen r9 = r2.zzp
            if (r9 == 0) goto L8f
            r9.zzb(r10)
        L8f:
            r9 = 0
            r2.zzp = r9
            kotlinx.coroutines.CompletableDeferred r9 = r2.zzA()
            r9.g(r10)
        L99:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            kotlin.ResultKt.b(r10)
            goto L77
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            kotlin.ResultKt.b(r10)
            goto L5c
        L40:
            kotlin.ResultKt.b(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r6, r7}
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r5
            java.lang.Object r10 = r10.zzb(r2, r0)
            if (r10 == r1) goto L99
            r2 = r8
        L5c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L65
            return r3
        L65:
            com.google.android.recaptcha.internal.zzcb r10 = r2.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r2
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r10.zzc(r5, r0)
            if (r10 != r1) goto L76
            goto L99
        L76:
            r0 = r2
        L77:
            kotlinx.coroutines.CompletableDeferred r10 = kotlinx.coroutines.CompletableDeferredKt.a()
            r0.zza = r10
            com.google.android.recaptcha.internal.zzek r10 = r0.zzj
            r10.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r10.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r10 = r0.zzq
            kotlinx.coroutines.CoroutineScope r10 = r10.zza()
            com.google.android.recaptcha.internal.zziz r1 = new com.google.android.recaptcha.internal.zziz
            r2 = 0
            r1.<init>(r0, r9, r2)
            r9 = 3
            kotlinx.coroutines.BuildersKt.c(r10, r2, r2, r1, r9)
            return r3
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getD();
    }

    @NotNull
    public final CompletableDeferred zzA() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }

    @NotNull
    public final zzft zzC(@NotNull zzsc zzscVar, @NotNull zzcg zzcgVar, @NotNull WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.H0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull Continuation continuation) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: Exception -> 0x004d, PHI: r2 r11
  0x00c7: PHI (r2v8 ??) = (r2v15 ??), (r2v16 ??) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00c7: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v18 java.lang.String) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:45:0x00c7, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzg(@NotNull zzbd zzbdVar, @NotNull Continuation continuation) throws MissingResourceException {
        if (Intrinsics.c(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            goto L6c
        L36:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L5f
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L6b
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L5f:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            kotlin.Result$Failure r6 = kotlin.ResultKt.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzi(@NotNull String str, long j, @NotNull Exception exc, @NotNull Continuation continuation) {
        exc.getMessage();
        CompletableDeferred completableDeferred = (CompletableDeferred) this.zze.remove(str);
        if (completableDeferred != null) {
            completableDeferred.g(exc);
        }
        return Unit.f24250a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzj(@NotNull Exception exc, @NotNull Continuation continuation) {
        return ((exc instanceof TimeoutCancellationException) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    @NotNull
    public final zzcb zzm() {
        return this.zzg;
    }

    @NotNull
    public final zzij zzq() {
        return this.zzi;
    }

    @Nullable
    public final Object zzw(@NotNull Continuation continuation) {
        return BuildersKt.f(this.zzq.zzb().getE(), new zzjc((zzjd) this.zzk.getD(), zzD(), null), continuation);
    }

    @Nullable
    public final Object zzx(@NotNull Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(this.zzq.zzb().getE(), new zzil(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }
}
