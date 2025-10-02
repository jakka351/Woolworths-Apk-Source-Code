package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzajo implements zzajt {
    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zza(zzu zzuVar) {
        String str = zzuVar.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzajt
    public final int zzb(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return 2;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.ads.zzajt
    public final zzajv zzc(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new zzakh(zzuVar.zzr);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new zzakj();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new zzald();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new zzaln();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new zzala(zzuVar.zzr);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new zzakl(zzuVar.zzr);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new zzalc(zzuVar.zzr);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new zzakp();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new zzakv();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
