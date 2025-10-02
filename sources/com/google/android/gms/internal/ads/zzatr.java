package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzatr {
    private final ListenableFuture zza;
    private final zzaux zzb;
    private final zzarp zzc;

    public zzatr(final Context context, Executor executor, zzarp zzarpVar, zzaux zzauxVar) {
        this.zzb = zzauxVar;
        this.zzc = zzarpVar;
        this.zza = zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzatq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(context);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzb(android.content.Context r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzaux r0 = r8.zzb
            r1 = 31
            java.lang.String r2 = "E"
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzarp r3 = r8.zzc
            boolean r4 = r3.zzd()
            if (r4 != 0) goto L42
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza()
            if (r4 == 0) goto L42
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L24
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza()
            boolean r4 = r4.isDone()
            if (r4 == 0) goto L42
        L24:
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()     // Catch: java.lang.Throwable -> L42
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> L42
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.get(r3, r5)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzast r0 = (com.google.android.gms.internal.ads.zzast) r0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L42
            boolean r3 = r0.zza()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L42
            java.lang.String r0 = r0.zzb()     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r0 = r2
        L43:
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto Lc6
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r1) goto L4f
            goto Lc6
        L4f:
            java.lang.String r4 = ""
            if (r3 >= r1) goto L58
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgot.zza(r4)     // Catch: java.lang.Throwable -> Lc6
            goto Lb8
        L58:
            java.lang.String r1 = r9.getPackageName()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgmk r5 = com.google.android.gms.internal.ads.zzgmk.zzn()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgmk r5 = r5.zzi()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"
            byte[] r5 = r5.zzk(r6)     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r6.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lb4
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lb4
            java.security.cert.Certificate r5 = r3.generateCertificate(r7)     // Catch: java.lang.Throwable -> Lb4
            r6.add(r5)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "user"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r5 != 0) goto La5
            com.google.android.gms.internal.ads.zzgmk r5 = com.google.android.gms.internal.ads.zzgmk.zzn()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgmk r5 = r5.zzi()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"
            byte[] r5 = r5.zzk(r7)     // Catch: java.lang.Throwable -> Lb4
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lb4
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lb4
            java.security.cert.Certificate r3 = r3.generateCertificate(r7)     // Catch: java.lang.Throwable -> Lb4
            r6.add(r3)     // Catch: java.lang.Throwable -> Lb4
        La5:
            com.google.android.gms.internal.ads.zzatp r3 = new com.google.android.gms.internal.ads.zzatp     // Catch: java.lang.Throwable -> Lb4
            r3.<init>()     // Catch: java.lang.Throwable -> Lb4
            android.content.pm.PackageManager r5 = r9.getPackageManager()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.common.util.a.o(r5, r1, r6, r3)     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.internal.ads.zzgpm r1 = r3.zza     // Catch: java.lang.Throwable -> Lb4
            goto Lb8
        Lb4:
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgot.zza(r4)     // Catch: java.lang.Throwable -> Lc6 java.lang.Throwable -> Lc6
        Lb8:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lc6 java.lang.Throwable -> Lc6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc6 java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzghs.zzc(r1)     // Catch: java.lang.Throwable -> Lc6 java.lang.Throwable -> Lc6
            r4 = 1
            if (r4 == r3) goto Lc6
            r0 = r1
        Lc6:
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto Ld8
            com.google.android.gms.internal.ads.zzarp r1 = r8.zzc
            boolean r1 = r1.zza()
            if (r1 != 0) goto Ld8
            java.lang.String r0 = zzd(r9)     // Catch: java.lang.ClassCastException -> Ld8
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatr.zzb(android.content.Context):java.lang.String");
    }

    private static String zzd(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                byte[] bArrDigest = messageDigest.digest();
                String strZzj = zzgmkVarZzi.zzj(bArrDigest, 0, bArrDigest.length);
                fileInputStream.close();
                return strZzj;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public final ListenableFuture zza() {
        return this.zza;
    }
}
