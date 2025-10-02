package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzakl implements zzajv {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzakk zzc;
    private final zzef zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzakl() {
        this(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void zzb(zzef zzefVar, Charset charset) {
        while (true) {
            String strZzN = zzefVar.zzN(charset);
            if (strZzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                while (true) {
                    String strZzN2 = zzefVar.zzN(charset);
                    if (strZzN2 == null || (zzefVar.zzd() != 0 && zzefVar.zzp(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strZza = zzggj.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    break;
                                } else {
                                    this.zzf = Float.parseFloat(strArrSplit[1].trim());
                                    break;
                                }
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    break;
                                } else {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                        break;
                                    } catch (NumberFormatException unused) {
                                        break;
                                    }
                                }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzakm zzakmVarZza = null;
                while (true) {
                    String strZzN3 = zzefVar.zzN(charset);
                    if (strZzN3 != null && (zzefVar.zzd() == 0 || zzefVar.zzp(charset) != 91)) {
                        if (strZzN3.startsWith("Format:")) {
                            zzakmVarZza = zzakm.zza(strZzN3);
                        } else if (strZzN3.startsWith("Style:")) {
                            if (zzakmVarZza == null) {
                                zzds.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                            } else {
                                zzako zzakoVarZza = zzako.zza(strZzN3, zzakmVarZza);
                                if (zzakoVarZza != null) {
                                    linkedHashMap.put(zzakoVarZza.zza, zzakoVarZza);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                zzds.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzeo.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    @Override // com.google.android.gms.internal.ads.zzajv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzaju r26, com.google.android.gms.internal.ads.zzdf r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakl.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaju, com.google.android.gms.internal.ads.zzdf):void");
    }

    public zzakl(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzef();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzeo.zzi((byte[]) list.get(0));
        zzghc.zza(strZzi.startsWith("Format:"));
        zzakk zzakkVarZza = zzakk.zza(strZzi);
        zzakkVarZza.getClass();
        this.zzc = zzakkVarZza;
        zzb(new zzef((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
