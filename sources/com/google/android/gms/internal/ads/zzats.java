package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
final class zzats implements Runnable {
    private zzats() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzatt.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzatt.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzatt.zzb;
        } catch (Throwable th) {
            zzatt.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzats(byte[] bArr) {
    }
}
