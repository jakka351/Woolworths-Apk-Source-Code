package com.google.android.gms.internal.vision;

/* loaded from: classes5.dex */
public final class zzfe {
    private static final zzfd zza;
    private static final int zzb;

    public static final class zza extends zzfd {
        @Override // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable th, Throwable th2) {
        }

        @Override // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    static {
        /*
            java.lang.Integer r0 = zza()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L16
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L14
            r2 = 19
            if (r1 < r2) goto L16
            com.google.android.gms.internal.vision.zzfj r1 = new com.google.android.gms.internal.vision.zzfj     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L5d
        L14:
            r1 = move-exception
            goto L2c
        L16:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L24
            com.google.android.gms.internal.vision.zzfh r1 = new com.google.android.gms.internal.vision.zzfh     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L5d
        L24:
            com.google.android.gms.internal.vision.zzfe$zza r1 = new com.google.android.gms.internal.vision.zzfe$zza     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L5d
        L2a:
            r1 = move-exception
            r0 = 0
        L2c:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.vision.zzfe$zza> r3 = com.google.android.gms.internal.vision.zzfe.zza.class
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.vision.zzfe$zza r1 = new com.google.android.gms.internal.vision.zzfe$zza
            r1.<init>()
        L5d:
            com.google.android.gms.internal.vision.zzfe.zza = r1
            if (r0 != 0) goto L63
            r0 = 1
            goto L67
        L63:
            int r0 = r0.intValue()
        L67:
            com.google.android.gms.internal.vision.zzfe.zzb = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfe.<clinit>():void");
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    public static void zza(Throwable th) {
        zza.zza(th);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
