package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.analytics.o;
import androidx.media3.exoplayer.analytics.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi
/* loaded from: classes5.dex */
public final class zzot implements zzmg, zzou {
    private boolean zzA;
    private final Context zza;
    private final zzov zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzat zzo;

    @Nullable
    private zzos zzp;

    @Nullable
    private zzos zzq;

    @Nullable
    private zzos zzr;

    @Nullable
    private zzu zzs;

    @Nullable
    private zzu zzt;

    @Nullable
    private zzu zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcv.zza();
    private final zzbd zzf = new zzbd();
    private final zzbc zzg = new zzbc();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzot(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzom zzomVar = new zzom(zzom.zza);
        this.zzc = zzomVar;
        zzomVar.zza(this);
    }

    private final void zzA(int i, long j, @Nullable zzu zzuVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = androidx.core.splashscreen.a.g(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzuVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzuVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzuVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzuVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzuVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzuVar.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzuVar.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzuVar.zzG;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzuVar.zzH;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzuVar.zzd;
            if (str4 != null) {
                String str5 = zzeo.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzuVar.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    @RequiresNonNull
    private final void zzB(zzbe zzbeVar, @Nullable zzup zzupVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzupVar == null || (iZze = zzbeVar.zze(zzupVar.zza)) == -1) {
            return;
        }
        zzbc zzbcVar = this.zzg;
        int i = 0;
        zzbeVar.zzd(iZze, zzbcVar, false);
        zzbd zzbdVar = this.zzf;
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzaf zzafVar = zzbdVar.zzd.zzb;
        if (zzafVar != null) {
            int iZzG = zzeo.zzG(zzafVar.zza);
            i = iZzG != 0 ? iZzG != 1 ? iZzG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbdVar.zzm;
        if (j != -9223372036854775807L && !zzbdVar.zzk && !zzbdVar.zzi && !zzbdVar.zzb()) {
            builder.setMediaDurationMillis(zzeo.zzp(j));
        }
        builder.setPlaybackType(true != zzbdVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @SuppressLint
    private static int zzD(int i) {
        switch (zzeo.zzF(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static zzot zza(Context context) {
        MediaMetricsManager mediaMetricsManagerB = o.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzot(context, mediaMetricsManagerB.createPlaybackSession());
    }

    @EnsuresNonNullIf
    private final boolean zzw(@Nullable zzos zzosVar) {
        if (zzosVar != null) {
            return zzosVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzs, zzuVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzuVar;
        zzA(1, j, zzuVar, i2);
    }

    private final void zzy(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzt, zzuVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzuVar;
        zzA(0, j, zzuVar, i2);
    }

    private final void zzz(long j, @Nullable zzu zzuVar, int i) {
        if (Objects.equals(this.zzu, zzuVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzuVar;
        zzA(2, j, zzuVar, i2);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzc(zzme zzmeVar, String str) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = p.g().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            zzB(zzmeVar.zzb, zzupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzd(zzme zzmeVar, String str, boolean z) {
        zzup zzupVar = zzmeVar.zzd;
        if ((zzupVar == null || !zzupVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdj(zzme zzmeVar, zzaz zzazVar, zzaz zzazVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdk(zzme zzmeVar, zzul zzulVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return;
        }
        zzu zzuVar = zzulVar.zzb;
        zzuVar.getClass();
        zzos zzosVar = new zzos(zzuVar, 0, this.zzc.zzb(zzmeVar.zzb, zzupVar));
        int i = zzulVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzosVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzosVar;
                return;
            }
        }
        this.zzp = zzosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdl(zzme zzmeVar, int i, long j, long j2) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar != null) {
            String strZzb = this.zzc.zzb(zzmeVar.zzb, zzupVar);
            HashMap map = this.zzi;
            Long l = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l2 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strZzb, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdm(zzme zzmeVar, zzhr zzhrVar) {
        this.zzx += zzhrVar.zzg;
        this.zzy += zzhrVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029f  */
    @Override // com.google.android.gms.internal.ads.zzmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzdn(com.google.android.gms.internal.ads.zzba r20, com.google.android.gms.internal.ads.zzmf r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzot.zzdn(com.google.android.gms.internal.ads.zzba, com.google.android.gms.internal.ads.zzmf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        this.zzo = zzatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzos zzosVar = this.zzp;
        if (zzosVar != null) {
            zzu zzuVar = zzosVar.zza;
            if (zzuVar.zzw == -1) {
                zzs zzsVarZza = zzuVar.zza();
                zzsVarZza.zzt(zzbuVar.zzb);
                zzsVarZza.zzu(zzbuVar.zzc);
                this.zzp = new zzos(zzsVarZza.zzM(), 0, zzosVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
