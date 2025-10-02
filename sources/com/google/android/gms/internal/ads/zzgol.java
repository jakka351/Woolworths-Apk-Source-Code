package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public class zzgol extends zzgou {
    public static zzgol zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgol ? (zzgol) listenableFuture : new zzgom(listenableFuture);
    }
}
