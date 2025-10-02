package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class zzfvk implements zzfve {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzfvk(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final /* synthetic */ void zzd(java.lang.String r6, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvk.zzd(java.lang.String, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, boolean, java.lang.String, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final ListenableFuture zza(final String str, final byte[] bArr, String str2) {
        final boolean z = true;
        final String str3 = "application/x-protobuf";
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver(str, z, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvh
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "application/x-protobuf";
            private final /* synthetic */ byte[] zzd;

            {
                this.zzd = bArr;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.zza.zzb(this.zzb, true, this.zzc, this.zzd, completer);
            }
        });
    }

    public final /* synthetic */ Object zzb(final String str, boolean z, String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        final boolean z2 = true;
        final String str3 = "application/x-protobuf";
        this.zza.execute(new Runnable(str, completer, z2, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvg
            private final /* synthetic */ String zzb;
            private final /* synthetic */ CallbackToFutureAdapter.Completer zzc;
            private final /* synthetic */ String zzd = "application/x-protobuf";
            private final /* synthetic */ byte[] zze;

            {
                this.zze = bArr;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(this.zzb, this.zzc, true, this.zzd, this.zze);
            }
        });
        return "";
    }

    public final /* synthetic */ void zzc(String str, CallbackToFutureAdapter.Completer completer, boolean z, String str2, byte[] bArr) {
        zzd(str, completer, true, "application/x-protobuf", bArr);
    }
}
