package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes5.dex */
public final class zzrc implements zzqc {
    private static final Object zza = new Object();

    @Nullable
    @GuardedBy
    private static ScheduledExecutorService zzb;

    @GuardedBy
    private static int zzc;
    private zzqs zzA;
    private zzau zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;

    @Nullable
    private ByteBuffer zzM;
    private int zzN;

    @Nullable
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private boolean zzU;
    private zzd zzV;

    @Nullable
    private AudioDeviceInfo zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;

    @Nullable
    private Looper zzaa;
    private long zzab;
    private long zzac;
    private Handler zzad;

    @Nullable
    private Context zzae;
    private boolean zzaf;
    private final zzqm zzag;
    private final zzqi zzah;

    @Nullable
    private final Context zzd;
    private final zzqh zze;
    private final zzrk zzf;
    private final zzcj zzg;
    private final zzrj zzh;
    private final zzgjz zzi;
    private final zzqg zzj;
    private final ArrayDeque zzk;
    private zzrb zzl;
    private final zzqx zzm;
    private final zzqx zzn;
    private final int zzo;

    @Nullable
    private zzox zzp;

    @Nullable
    private zzpz zzq;

    @Nullable
    private zzql zzr;
    private zzql zzs;
    private zzcb zzt;

    @Nullable
    private AudioTrack zzu;
    private zzoz zzv;
    private zzpe zzw;

    @Nullable
    private zzqw zzx;
    private zzc zzy;

    @Nullable
    private zzqs zzz;

    public /* synthetic */ zzrc(zzqk zzqkVar, byte[] bArr) {
        int deviceId;
        byte[] bArr2 = null;
        Context applicationContext = zzqkVar.zzb() == null ? null : zzqkVar.zzb().getApplicationContext();
        this.zzd = applicationContext;
        this.zzy = zzc.zza;
        this.zzv = applicationContext != null ? null : zzqkVar.zzc();
        this.zzag = zzqkVar.zzd();
        zzqi zzqiVarZze = zzqkVar.zze();
        zzqiVarZze.getClass();
        this.zzah = zzqiVarZze;
        this.zzj = new zzqg(new zzqy(this, bArr2));
        zzqh zzqhVar = new zzqh();
        this.zze = zzqhVar;
        zzrk zzrkVar = new zzrk();
        this.zzf = zzrkVar;
        this.zzg = new zzcj();
        this.zzh = new zzrj();
        this.zzi = zzgjz.zzk(zzrkVar, zzqhVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzV = new zzd(0, BitmapDescriptorFactory.HUE_RED);
        zzau zzauVar = zzau.zza;
        this.zzA = new zzqs(zzauVar, 0L, 0L, null);
        this.zzB = zzauVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzqx();
        this.zzn = new zzqx();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzqkVar.zzb() != null && (deviceId = zzqkVar.zzb().getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.zzo = i;
        this.zzaf = true;
    }

    public static /* synthetic */ void zzE(AudioTrack audioTrack, final zzpz zzpzVar, Handler handler, final zzpw zzpwVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpzVar.zzc(zzpwVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i = zzc - 1;
                    zzc = i;
                    if (i == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zzpzVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpzVar.zzc(zzpwVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static /* synthetic */ boolean zzH() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    private final void zzN() {
        zzcb zzcbVar = this.zzs.zzi;
        this.zzt = zzcbVar;
        zzcbVar.zzb(zzcd.zza);
    }

    private final AudioTrack zzO(zzql zzqlVar) throws zzpy {
        Context context;
        try {
            int i = this.zzT;
            int i2 = this.zzo;
            Context context2 = null;
            if (i2 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzae == null) {
                    this.zzae = context.createDeviceContext(i2);
                }
                context2 = this.zzae;
                i = 0;
            }
            return zzaf(zzqlVar.zza(), this.zzy, i, zzqlVar.zza, context2);
        } catch (zzpy e) {
            zzpz zzpzVar = this.zzq;
            if (zzpzVar != null) {
                zzpzVar.zzb(e);
            }
            throw e;
        }
    }

    private final void zzP(long j) throws Exception {
        zzS(j);
        if (this.zzO != null) {
            return;
        }
        if (!this.zzt.zzc()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer != null) {
                zzR(byteBuffer);
                zzS(j);
                return;
            }
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzt.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzR(byteBufferZze);
                    zzS(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zzd(this.zzM);
                    }
                }
            } while (this.zzO == null);
            return;
        }
    }

    private final boolean zzQ() throws Exception {
        if (!this.zzt.zzc()) {
            zzS(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzf();
        zzP(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzR(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrc.zzR(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzS(long r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzO
            if (r8 != 0) goto L6
            goto Lb6
        L6:
            com.google.android.gms.internal.ads.zzqx r8 = r7.zzn
            boolean r9 = r8.zzb()
            if (r9 != 0) goto Lb6
            java.nio.ByteBuffer r9 = r7.zzO
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.zzu
            java.nio.ByteBuffer r1 = r7.zzO
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.zzX = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L6d
            r9 = -6
            if (r0 == r9) goto L32
            r9 = -32
            if (r0 != r9) goto L30
            goto L32
        L30:
            r2 = r1
            goto L46
        L32:
            long r5 = r7.zzG()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3b
            goto L46
        L3b:
            android.media.AudioTrack r9 = r7.zzu
            boolean r9 = zzac(r9)
            if (r9 == 0) goto L30
            r7.zzT()
        L46:
            com.google.android.gms.internal.ads.zzqb r9 = new com.google.android.gms.internal.ads.zzqb
            com.google.android.gms.internal.ads.zzql r1 = r7.zzs
            com.google.android.gms.internal.ads.zzu r1 = r1.zza
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzpz r0 = r7.zzq
            if (r0 == 0) goto L56
            r0.zzb(r9)
        L56:
            boolean r0 = r9.zzb
            if (r0 == 0) goto L69
            android.content.Context r0 = r7.zzd
            if (r0 != 0) goto L5f
            goto L69
        L5f:
            com.google.android.gms.internal.ads.zzoz r8 = com.google.android.gms.internal.ads.zzoz.zza
            r7.zzv = r8
            com.google.android.gms.internal.ads.zzpe r0 = r7.zzw
            r0.zza(r8)
            throw r9
        L69:
            r8.zza(r9)
            return
        L6d:
            r8.zzc()
            android.media.AudioTrack r8 = r7.zzu
            boolean r8 = zzac(r8)
            if (r8 == 0) goto L8c
            long r5 = r7.zzG
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L80
            r7.zzZ = r1
        L80:
            boolean r8 = r7.zzS
            if (r8 == 0) goto L8c
            com.google.android.gms.internal.ads.zzpz r8 = r7.zzq
            if (r8 == 0) goto L8c
            if (r0 >= r9) goto L8c
            com.google.android.gms.internal.ads.zzrf r8 = (com.google.android.gms.internal.ads.zzrf) r8
        L8c:
            com.google.android.gms.internal.ads.zzql r8 = r7.zzs
            int r8 = r8.zzc
            if (r8 != 0) goto L98
            long r3 = r7.zzF
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.zzF = r3
        L98:
            if (r0 != r9) goto Lb6
            if (r8 == 0) goto Lb3
            java.nio.ByteBuffer r8 = r7.zzO
            java.nio.ByteBuffer r9 = r7.zzM
            if (r8 != r9) goto La3
            goto La4
        La3:
            r2 = r1
        La4:
            com.google.android.gms.internal.ads.zzghc.zzh(r2)
            long r8 = r7.zzG
            int r0 = r7.zzH
            long r0 = (long) r0
            int r2 = r7.zzN
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r8
            r7.zzG = r0
        Lb3:
            r8 = 0
            r7.zzO = r8
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrc.zzS(long):void");
    }

    private final void zzT() {
        if (this.zzs.zzc == 1) {
            this.zzY = true;
        }
    }

    private final void zzU() {
        if (zzY()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzV(zzau zzauVar) {
        zzqs zzqsVar = new zzqs(zzauVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzY()) {
            this.zzz = zzqsVar;
        } else {
            this.zzA = zzqsVar;
        }
    }

    private final void zzW(long j) {
        zzau zzauVar;
        boolean z;
        if (zzX()) {
            zzqm zzqmVar = this.zzag;
            zzauVar = this.zzB;
            zzqmVar.zzb(zzauVar);
        } else {
            zzauVar = zzau.zza;
        }
        zzau zzauVar2 = zzauVar;
        this.zzB = zzauVar2;
        if (zzX()) {
            zzqm zzqmVar2 = this.zzag;
            z = this.zzC;
            zzqmVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzqs(zzauVar2, Math.max(0L, j), zzeo.zzr(zzG(), this.zzs.zze), null));
        zzN();
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzav().zzh(this.zzC);
        }
    }

    private final boolean zzX() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return false;
        }
        int i = zzqlVar.zza.zzI;
        return true;
    }

    private final boolean zzY() {
        return this.zzu != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public final long zzF() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaa, reason: merged with bridge method [inline-methods] */
    public final long zzG() {
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j2 = zzqlVar.zzd;
        String str = zzeo.zza;
        return ((j + j2) - 1) / j2;
    }

    @EnsuresNonNull
    private final void zzab() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = true;
        if (this.zzw != null && this.zzaa != looperMyLooper) {
            z = false;
        }
        zzghc.zzj(z, "DefaultAudioSink accessed on multiple threads: %s and %s", zzae(this.zzaa), zzae(looperMyLooper));
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzaa = looperMyLooper;
            zzpe zzpeVar = new zzpe(context, new zzpd() { // from class: com.google.android.gms.internal.ads.zzqn
                @Override // com.google.android.gms.internal.ads.zzpd
                public final /* synthetic */ void zza(zzoz zzozVar) {
                    this.zza.zzC(zzozVar);
                }
            }, this.zzy, this.zzW);
            this.zzw = zzpeVar;
            this.zzv = zzpeVar.zzd();
        }
        this.zzv.getClass();
    }

    private static boolean zzac(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzad() throws IllegalStateException {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzg(zzG());
        if (zzac(this.zzu)) {
            this.zzR = false;
        }
        this.zzu.stop();
    }

    private static String zzae(@Nullable Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private static final AudioTrack zzaf(zzpw zzpwVar, zzc zzcVar, int i, zzu zzuVar, @Nullable Context context) throws UnsupportedOperationException, zzpy, IllegalArgumentException {
        zzu zzuVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzcVar.zza()).setAudioFormat(zzeo.zzC(zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzpwVar.zze).setSessionId(i);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzpwVar.zzd);
                } catch (IllegalArgumentException e) {
                    e = e;
                    exc = e;
                    zzuVar2 = zzuVar;
                    throw new zzpy(0, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar2, zzpwVar.zzd, exc);
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    exc = e;
                    zzuVar2 = zzuVar;
                    throw new zzpy(0, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar2, zzpwVar.zzd, exc);
                }
            }
            if (i2 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzpy(state, zzpwVar.zzb, zzpwVar.zzc, zzpwVar.zza, zzpwVar.zze, zzuVar, zzpwVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e3) {
            zzuVar2 = zzuVar;
            exc = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzA() throws IllegalStateException {
        zzz();
        zzgjz zzgjzVar = this.zzi;
        int size = zzgjzVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcf) zzgjzVar.get(i)).zzj();
        }
        this.zzg.zzj();
        this.zzh.zzj();
        zzcb zzcbVar = this.zzt;
        if (zzcbVar != null) {
            zzcbVar.zzh();
        }
        this.zzS = false;
        this.zzY = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzB() {
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zze();
        }
    }

    public final void zzC(zzoz zzozVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzaa;
        zzghc.zzj(looper == looperMyLooper, "Current looper (%s) is not the playback looper (%s)", zzae(looperMyLooper), zzae(this.zzaa));
        zzoz zzozVar2 = this.zzv;
        if (zzozVar2 == null || zzozVar.equals(zzozVar2)) {
            return;
        }
        this.zzv = zzozVar;
        zzpz zzpzVar = this.zzq;
        if (zzpzVar != null) {
            ((zzrf) zzpzVar).zza.zzR();
        }
    }

    public final /* synthetic */ void zzD() {
        if (this.zzac >= 300000) {
            ((zzrf) this.zzq).zza.zzax(true);
            this.zzac = 0L;
        }
    }

    public final /* synthetic */ zzpz zzI() {
        return this.zzq;
    }

    public final /* synthetic */ AudioTrack zzJ() {
        return this.zzu;
    }

    public final /* synthetic */ void zzK(boolean z) {
        this.zzR = true;
    }

    public final /* synthetic */ boolean zzL() {
        return this.zzS;
    }

    public final /* synthetic */ long zzM() {
        return this.zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zza(zzpz zzpzVar) {
        this.zzq = zzpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzb(@Nullable zzox zzoxVar) {
        this.zzp = zzoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzc(zzdb zzdbVar) {
        this.zzj.zzk(zzdbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzd(zzu zzuVar) {
        return zze(zzuVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zze(zzu zzuVar) {
        zzab();
        if (!"audio/raw".equals(zzuVar.zzo)) {
            return this.zzv.zzd(zzuVar, this.zzy) != null ? 2 : 0;
        }
        int i = zzuVar.zzI;
        if (zzeo.zzA(i)) {
            return i != 2 ? 1 : 2;
        }
        com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(i).length() + 22), "Invalid PCM encoding: ", i, "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzpg zzf(zzu zzuVar) {
        return this.zzY ? zzpg.zza : this.zzah.zza(zzuVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzY() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zzb(), zzeo.zzr(zzG(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || jMin < ((zzqs) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzqs) arrayDeque.remove();
        }
        zzqs zzqsVar = this.zzA;
        long j2 = jMin - zzqsVar.zzc;
        long jZzv = zzeo.zzv(j2, zzqsVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzag.zzd(j2);
            zzqs zzqsVar2 = this.zzA;
            j = zzqsVar2.zzb + jZzd;
            zzqsVar2.zzd = jZzd - jZzv;
        } else {
            zzqs zzqsVar3 = this.zzA;
            j = zzqsVar3.zzb + jZzv + zzqsVar3.zzd;
        }
        long jZze = this.zzag.zze();
        long jZzr = zzeo.zzr(jZze, this.zzs.zze) + j;
        long j3 = this.zzab;
        if (jZze > j3) {
            long jZzr2 = zzeo.zzr(jZze - j3, this.zzs.zze);
            this.zzab = jZze;
            this.zzac += jZzr2;
            if (this.zzad == null) {
                this.zzad = new Handler(Looper.myLooper());
            }
            this.zzad.removeCallbacksAndMessages(null);
            this.zzad.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzD();
                }
            }, 100L);
        }
        return jZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzh(zzu zzuVar, int i, @Nullable int[] iArr) throws zzpx {
        zzcb zzcbVar;
        int i2;
        int i3;
        int iZzE;
        int iIntValue;
        int i4;
        int i5;
        zzab();
        if ("audio/raw".equals(zzuVar.zzo)) {
            int i6 = zzuVar.zzI;
            zzghc.zza(zzeo.zzA(i6));
            int i7 = zzuVar.zzG;
            iZzE = zzeo.zzE(i6) * i7;
            zzgjw zzgjwVar = new zzgjw();
            zzgjwVar.zzh(this.zzi);
            zzgjwVar.zzf(this.zzg);
            zzgjwVar.zzg(this.zzag.zza());
            zzcbVar = new zzcb(zzgjwVar.zzi());
            if (zzcbVar.equals(this.zzt)) {
                zzcbVar = this.zzt;
            }
            this.zzf.zzq(zzuVar.zzJ, zzuVar.zzK);
            this.zze.zzq(iArr);
            try {
                zzcc zzccVarZza = zzcbVar.zza(new zzcc(zzuVar.zzH, i7, i6));
                int i8 = zzccVarZza.zzd;
                i2 = zzccVarZza.zzb;
                int i9 = zzccVarZza.zzc;
                int iZzB = zzeo.zzB(i9);
                int iZzE2 = zzeo.zzE(i8) * i9;
                i3 = 0;
                iIntValue = iZzB;
                i4 = i8;
                i5 = iZzE2;
            } catch (zzce e) {
                throw new zzpx(e, zzuVar);
            }
        } else {
            zzcbVar = new zzcb(zzgjz.zzi());
            i2 = zzuVar.zzH;
            zzpg zzpgVar = zzpg.zza;
            Pair pairZzd = this.zzv.zzd(zzuVar, this.zzy);
            if (pairZzd == null) {
                throw new zzpx("Unable to configure passthrough for: ".concat(String.valueOf(zzuVar)), zzuVar);
            }
            int iIntValue2 = ((Integer) pairZzd.first).intValue();
            i3 = 2;
            iZzE = -1;
            iIntValue = ((Integer) pairZzd.second).intValue();
            i4 = iIntValue2;
            i5 = -1;
        }
        int i10 = i2;
        if (i4 == 0) {
            String strValueOf = String.valueOf(zzuVar);
            StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i3, 37) + strValueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i3);
            sb.append(") for: ");
            sb.append(strValueOf);
            throw new zzpx(sb.toString(), zzuVar);
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(zzuVar);
            StringBuilder sb2 = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i3, 43) + strValueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i3);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new zzpx(sb2.toString(), zzuVar);
        }
        int i11 = zzuVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzuVar.zzo) && i11 == -1) {
            i11 = 768000;
        }
        int i12 = i11;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue, i4);
        zzghc.zzh(minBufferSize != -2);
        int i13 = i5 != -1 ? i5 : 1;
        int i14 = i4;
        int iZzb = zzre.zzb(minBufferSize, i14, i3, i13, i10, i12);
        int i15 = i13;
        this.zzY = false;
        zzql zzqlVar = new zzql(zzuVar, iZzE, i3, i5, i10, iIntValue, i14, (((Math.max(minBufferSize, iZzb) + i15) - 1) / i15) * i15, zzcbVar, false, false, false);
        if (zzY()) {
            this.zzr = zzqlVar;
        } else {
            this.zzs = zzqlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzi() throws IllegalStateException {
        this.zzS = true;
        if (zzY()) {
            this.zzj.zzc();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.play();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzj() {
        this.zzI = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    @Override // com.google.android.gms.internal.ads.zzqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.nio.ByteBuffer r29, long r30, int r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrc.zzk(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzl() throws IllegalStateException, zzqb {
        if (!this.zzP && zzY() && zzQ()) {
            zzad();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzm() {
        if (zzY()) {
            return this.zzP && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzn() {
        if (zzY()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && this.zzj.zzh(zzG());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzo(zzau zzauVar) {
        float f = zzauVar.zzb;
        String str = zzeo.zza;
        this.zzB = new zzau(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzauVar.zzc, 8.0f)));
        zzV(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final zzau zzp() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzq(boolean z) {
        this.zzC = z;
        zzV(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzr(zzc zzcVar) throws IllegalStateException {
        if (this.zzy.equals(zzcVar)) {
            return;
        }
        this.zzy = zzcVar;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzb(zzcVar);
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzs(int i) throws IllegalStateException {
        if (this.zzU) {
            if (this.zzT != i) {
                return;
            } else {
                this.zzU = false;
            }
        }
        if (this.zzT != i) {
            this.zzT = i;
            zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzt(zzd zzdVar) {
        if (this.zzV.equals(zzdVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzV.zza;
        }
        this.zzV = zzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzW = audioDeviceInfo;
        zzpe zzpeVar = this.zzw;
        if (zzpeVar != null) {
            zzpeVar.zzc(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(this.zzW);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzv() {
        if (!zzY()) {
            return -9223372036854775807L;
        }
        zzql zzqlVar = this.zzs;
        if (zzqlVar.zzc == 0) {
            return zzeo.zzr(this.zzu.getBufferSizeInFrames(), zzqlVar.zze);
        }
        long bufferSizeInFrames = this.zzu.getBufferSizeInFrames();
        int iZzf = zzacy.zzf(this.zzs.zzg);
        zzghc.zzh(iZzf != -2147483647);
        return zzeo.zzt(bufferSizeInFrames, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    @RequiresApi
    public final void zzw(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzac(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzx(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzU();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzy() throws IllegalStateException {
        this.zzS = false;
        if (zzY()) {
            this.zzj.zzi();
            if (!this.zzQ || zzac(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzz() throws IllegalStateException {
        if (zzY()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzZ = false;
            this.zzH = 0;
            this.zzA = new zzqs(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzr();
            zzN();
            zzqg zzqgVar = this.zzj;
            if (zzqgVar.zzd()) {
                this.zzu.pause();
            }
            if (zzac(this.zzu)) {
                zzrb zzrbVar = this.zzl;
                zzrbVar.getClass();
                zzrbVar.zzb(this.zzu);
            }
            final zzpw zzpwVarZza = this.zzs.zza();
            zzql zzqlVar = this.zzr;
            if (zzqlVar != null) {
                this.zzs = zzqlVar;
                this.zzr = null;
            }
            zzqgVar.zzj();
            zzqw zzqwVar = this.zzx;
            if (zzqwVar != null) {
                zzqwVar.zza();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzpz zzpzVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzb = zzeo.zzg("ExoPlayer:AudioTrackReleaseThread");
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzrc.zzE(audioTrack, zzpzVar, handler, zzpwVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzu = null;
        }
        this.zzn.zzc();
        this.zzm.zzc();
        this.zzab = 0L;
        this.zzac = 0L;
        Handler handler2 = this.zzad;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }
}
