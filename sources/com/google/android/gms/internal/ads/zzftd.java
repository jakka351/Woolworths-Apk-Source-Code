package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzftd implements zzfrw {

    @NotNull
    private final CoroutineScope zza;

    @NotNull
    private final Mutex zzb;

    @NotNull
    private final Mutex zzc;

    @NotNull
    private final Mutex zzd;
    private boolean zze;
    private zzfru zzf;
    private boolean zzg;

    @NotNull
    private final DataStore zzh;

    @NotNull
    private final zzdpw zzi;

    public zzftd(@NotNull DataStore adQualityDataStore, @NotNull zzftf coroutineScopeProvider, @NotNull zzdpw dataPinger, @NotNull zzfsf clock) {
        Intrinsics.h(adQualityDataStore, "adQualityDataStore");
        Intrinsics.h(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.h(dataPinger, "dataPinger");
        Intrinsics.h(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = MutexKt.a();
        this.zzc = MutexKt.a();
        this.zzd = MutexKt.a();
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzs(java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfsi
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfsi r0 = (com.google.android.gms.internal.ads.zzfsi) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsi r0 = new com.google.android.gms.internal.ads.zzfsi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.zza
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r9 = move-exception
            goto L7a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.zzb
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L58
        L47:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 == r1) goto L7e
        L58:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzfsj r4 = new com.google.android.gms.internal.ads.zzfsj     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L76
            r0.zza = r9     // Catch: java.lang.Throwable -> L76
            r0.zzb = r5     // Catch: java.lang.Throwable -> L76
            r0.zze = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L76
            if (r8 == r1) goto L7e
            r6 = r9
            r9 = r8
            r8 = r6
        L6e:
            com.google.android.gms.internal.ads.zzfrz r9 = (com.google.android.gms.internal.ads.zzfrz) r9     // Catch: java.lang.Throwable -> L2f
            r8.c(r5)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L76:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7a:
            r8.c(r5)
            throw r9
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzs(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzt(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsl
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsl r0 = (com.google.android.gms.internal.ads.zzfsl) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsl r0 = new com.google.android.gms.internal.ads.zzfsl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L65
        L2f:
            r8 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r8)
            r8 = r2
            goto L51
        L42:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 == r1) goto L75
        L51:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.zzfsm r4 = new com.google.android.gms.internal.ads.zzfsm     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6d
            r0.zza = r8     // Catch: java.lang.Throwable -> L6d
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == r1) goto L75
            r6 = r0
            r0 = r8
            r8 = r6
        L65:
            com.google.android.gms.internal.ads.zzfrz r8 = (com.google.android.gms.internal.ads.zzfrz) r8     // Catch: java.lang.Throwable -> L2f
            r0.c(r5)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L6d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            r0.c(r5)
            throw r8
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzt(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzu(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsk
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsk r0 = (com.google.android.gms.internal.ads.zzfsk) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsk r0 = new com.google.android.gms.internal.ads.zzfsk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.a(r0)
            if (r0 == r1) goto L73
            r0 = r8
        L47:
            r8 = 0
            com.google.android.gms.internal.ads.zzfru r1 = r5.zzf     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L6b
            long r3 = r1.zzi()     // Catch: java.lang.Throwable -> L65
            long r6 = r6 - r3
            com.google.android.gms.internal.ads.zzfru r3 = r5.zzf     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L67
            long r2 = r3.zzg()     // Catch: java.lang.Throwable -> L65
            long r6 = r6 - r2
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L65
            r0.c(r8)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L65:
            r6 = move-exception
            goto L6f
        L67:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L6b:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L6f:
            r0.c(r8)
            throw r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzu(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsp
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsp r0 = (com.google.android.gms.internal.ads.zzfsp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsp r0 = new com.google.android.gms.internal.ads.zzfsp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.zza
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L92
        L32:
            r8 = move-exception
            goto L9c
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            java.lang.Object r2 = r0.zzb
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.zza
            com.google.android.gms.internal.ads.zzfrv r4 = (com.google.android.gms.internal.ads.zzfrv) r4
            kotlin.ResultKt.b(r8)
            goto L7e
        L48:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r8)
            goto L5f
        L50:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzb
            r0.zza = r2
            r0.zze = r5
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto Lac
        L5f:
            com.google.android.gms.internal.ads.zzfru r8 = r7.zzf     // Catch: java.lang.Throwable -> La0
            if (r8 == 0) goto La2
            com.google.android.gms.internal.ads.zzhih r8 = r8.zzbu()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.internal.ads.zzfrv r8 = (com.google.android.gms.internal.ads.zzfrv) r8     // Catch: java.lang.Throwable -> La0
            r2.c(r6)
            kotlin.jvm.internal.Intrinsics.e(r8)
            kotlinx.coroutines.sync.Mutex r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r4
            java.lang.Object r4 = r2.a(r0)
            if (r4 == r1) goto Lac
            r4 = r8
        L7e:
            androidx.datastore.core.DataStore r8 = r7.zzh     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.ads.zzfsq r5 = new com.google.android.gms.internal.ads.zzfsq     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L9a
            r0.zza = r2     // Catch: java.lang.Throwable -> L9a
            r0.zzb = r6     // Catch: java.lang.Throwable -> L9a
            r0.zze = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r8 = r8.a(r5, r0)     // Catch: java.lang.Throwable -> L9a
            if (r8 == r1) goto Lac
            r0 = r2
        L92:
            com.google.android.gms.internal.ads.zzfrz r8 = (com.google.android.gms.internal.ads.zzfrz) r8     // Catch: java.lang.Throwable -> L32
            r0.c(r6)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L9a:
            r8 = move-exception
            r0 = r2
        L9c:
            r0.c(r6)
            throw r8
        La0:
            r8 = move-exception
            goto La8
        La2:
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.p(r8)     // Catch: java.lang.Throwable -> La0
            throw r6     // Catch: java.lang.Throwable -> La0
        La8:
            r2.c(r6)
            throw r8
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzv(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfrv r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = kotlin.collections.CollectionsKt.P(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzw(com.google.android.gms.internal.ads.zzfrv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zza() {
        BuildersKt.c(this.zza, null, null, new zzfsy(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzb(@NotNull String gwsQueryId) {
        Intrinsics.h(gwsQueryId, "gwsQueryId");
        BuildersKt.c(this.zza, null, null, new zzfss(this, gwsQueryId, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzc() {
        BuildersKt.c(this.zza, null, null, new zzfso(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzd() {
        BuildersKt.c(this.zza, null, null, new zzftc(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zze() {
        BuildersKt.c(this.zza, null, null, new zzfsw(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzf() {
        BuildersKt.c(this.zza, null, null, new zzfta(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzg() {
        BuildersKt.c(this.zza, null, null, new zzfsu(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzftd] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.zzfsx
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.zzfsx r0 = (com.google.android.gms.internal.ads.zzfsx) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsx r0 = new com.google.android.gms.internal.ads.zzfsx
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.zzb
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zzd
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.b(r10)
            return r3
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L40
            goto L6b
        L40:
            r10 = move-exception
            goto Ld3
        L43:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r10)
            goto L5b
        L4b:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.sync.Mutex r10 = r9.zzd
            r0.zza = r10
            r0.zzd = r6
            java.lang.Object r2 = r10.a(r0)
            if (r2 == r1) goto Ld7
            r2 = r10
        L5b:
            androidx.datastore.core.DataStore r10 = r9.zzh     // Catch: java.lang.Throwable -> L40
            kotlinx.coroutines.flow.Flow r10 = r10.getD()     // Catch: java.lang.Throwable -> L40
            r0.zza = r2     // Catch: java.lang.Throwable -> L40
            r0.zzd = r5     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.y(r10, r0)     // Catch: java.lang.Throwable -> L40
            if (r10 == r1) goto Ld7
        L6b:
            com.google.android.gms.internal.ads.zzfrz r10 = (com.google.android.gms.internal.ads.zzfrz) r10     // Catch: java.lang.Throwable -> L40
            r2.c(r7)
            if (r10 == 0) goto Ld2
            int r2 = r10.zza()
            if (r2 != 0) goto L79
            goto Ld2
        L79:
            java.util.Map r10 = r10.zzb()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L85:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            com.google.android.gms.internal.ads.zzfrv r5 = (com.google.android.gms.internal.ads.zzfrv) r5
            com.google.android.gms.internal.ads.zzhib r5 = r5.zzcc()
            java.lang.String r8 = "toBuilder(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r8)
            com.google.android.gms.internal.ads.zzfru r5 = (com.google.android.gms.internal.ads.zzfru) r5
            java.lang.Object r2 = r2.getValue()
            java.lang.String r8 = "<get-value>(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r8)
            com.google.android.gms.internal.ads.zzfrv r2 = (com.google.android.gms.internal.ads.zzfrv) r2
            boolean r2 = zzw(r2)
            if (r2 == 0) goto Lb6
            r5.zzf(r6)
        Lb6:
            com.google.android.gms.internal.ads.zzdpw r2 = r9.zzi
            com.google.android.gms.internal.ads.zzhih r5 = r5.zzbu()
            java.lang.String r8 = "build(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r8)
            com.google.android.gms.internal.ads.zzfrv r5 = (com.google.android.gms.internal.ads.zzfrv) r5
            r2.zza(r5)
            goto L85
        Lc7:
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r10 = r9.zzt(r0)
            if (r10 != r1) goto Ld2
            goto Ld7
        Ld2:
            return r3
        Ld3:
            r2.c(r7)
            throw r10
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzh(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsr r0 = (com.google.android.gms.internal.ads.zzfsr) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsr r0 = new com.google.android.gms.internal.ads.zzfsr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.zzb
            java.lang.Object r7 = r0.zza
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.String r0 = r0.zzf
            kotlin.ResultKt.b(r8)
            goto L51
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzf = r7
            r0.zza = r8
            r0.zzb = r4
            r0.zze = r3
            java.lang.Object r0 = r8.a(r0)
            if (r0 == r1) goto L82
            r0 = r7
            r7 = r8
            r1 = r4
        L51:
            r8 = 0
            boolean r4 = r6.zze     // Catch: java.lang.Throwable -> L76
            kotlin.Unit r5 = kotlin.Unit.f24250a
            if (r4 == 0) goto L5c
            r7.c(r8)
            return r5
        L5c:
            r6.zze = r3     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzfrv r3 = com.google.android.gms.internal.ads.zzfrv.zzp()     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzhib r3 = r3.zzcc()     // Catch: java.lang.Throwable -> L76
            com.google.android.gms.internal.ads.zzfru r3 = (com.google.android.gms.internal.ads.zzfru) r3     // Catch: java.lang.Throwable -> L76
            r6.zzf = r3     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L78
            r3.zza(r0)     // Catch: java.lang.Throwable -> L76
            r3.zzj(r1)     // Catch: java.lang.Throwable -> L76
            r7.c(r8)
            return r5
        L76:
            r0 = move-exception
            goto L7e
        L78:
            java.lang.String r0 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.p(r0)     // Catch: java.lang.Throwable -> L76
            throw r8     // Catch: java.lang.Throwable -> L76
        L7e:
            r7.c(r8)
            throw r0
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzi(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.zzfsn
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.gms.internal.ads.zzfsn r0 = (com.google.android.gms.internal.ads.zzfsn) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsn r0 = new com.google.android.gms.internal.ads.zzfsn
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L51
            if (r2 == r7) goto L49
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlin.ResultKt.b(r12)
            return r3
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            kotlin.ResultKt.b(r12)
            goto L94
        L3f:
            long r6 = r0.zzb
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r12)
            goto L80
        L49:
            java.lang.Object r2 = r0.zza
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            kotlin.ResultKt.b(r12)
            goto L60
        L51:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.sync.Mutex r2 = r11.zzc
            r0.zza = r2
            r0.zze = r7
            java.lang.Object r12 = r2.a(r0)
            if (r12 == r1) goto Laf
        L60:
            boolean r12 = r11.zzg     // Catch: java.lang.Throwable -> Laa
            if (r12 == 0) goto L68
            r2.c(r8)
            return r3
        L68:
            r11.zzg = r7     // Catch: java.lang.Throwable -> Laa
            r2.c(r8)
            kotlinx.coroutines.sync.Mutex r2 = r11.zzb
            long r9 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r9
            r0.zze = r6
            java.lang.Object r12 = r2.a(r0)
            if (r12 == r1) goto Laf
            r6 = r9
        L80:
            com.google.android.gms.internal.ads.zzfru r12 = r11.zzf     // Catch: java.lang.Throwable -> L9e
            if (r12 == 0) goto La0
            r12.zzo(r6)     // Catch: java.lang.Throwable -> L9e
            r2.c(r8)
            r0.zza = r8
            r0.zze = r5
            java.lang.Object r12 = r11.zzu(r6, r0)
            if (r12 == r1) goto Laf
        L94:
            r0.zze = r4
            java.lang.Object r12 = r11.zzv(r0)
            if (r12 != r1) goto L9d
            goto Laf
        L9d:
            return r3
        L9e:
            r12 = move-exception
            goto La6
        La0:
            java.lang.String r12 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.p(r12)     // Catch: java.lang.Throwable -> L9e
            throw r8     // Catch: java.lang.Throwable -> L9e
        La6:
            r2.c(r8)
            throw r12
        Laa:
            r12 = move-exception
            r2.c(r8)
            throw r12
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzk(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzk(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzl(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzm(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzfst
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.zzfst r0 = (com.google.android.gms.internal.ads.zzfst) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfst r0 = new com.google.android.gms.internal.ads.zzfst
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zzc
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.sync.Mutex r7 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzb = r7
            r0.zza = r4
            r0.zze = r3
            java.lang.Object r0 = r7.a(r0)
            if (r0 == r1) goto L66
            r0 = r7
            r1 = r4
        L4c:
            r7 = 0
            com.google.android.gms.internal.ads.zzfru r3 = r6.zzf     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5c
            r3.zzs(r1)     // Catch: java.lang.Throwable -> L5a
            r0.c(r7)
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L5a:
            r1 = move-exception
            goto L62
        L5c:
            java.lang.String r1 = "adQualityDataBuilder"
            kotlin.jvm.internal.Intrinsics.p(r1)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5a
        L62:
            r0.c(r7)
            throw r1
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzn(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
