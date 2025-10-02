package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes5.dex */
final class zzaks {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzaky zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzaks zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzaks(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable zzaky zzakyVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzaks zzaksVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzakyVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaksVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzaks zza(String str) {
        return new zzaks(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaks zzb(@Nullable String str, long j, long j2, @Nullable zzaky zzakyVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzaks zzaksVar) {
        return new zzaks(str, null, j, j2, zzakyVar, strArr, str2, str3, zzaksVar);
    }

    private final void zzi(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzaks zzaksVar = (zzaks) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzaksVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (zzc(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, String str, Map map) {
        long j2;
        boolean z2;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzck) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zzaks zzaksVarZze = zze(i);
                if (z || zEquals) {
                    j2 = j;
                    z2 = true;
                } else {
                    j2 = j;
                    z2 = false;
                }
                zzaksVarZze.zzk(j2, z2, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzck) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzck zzckVar = new zzck();
            zzckVar.zza(new SpannableStringBuilder());
            map.put(str, zzckVar);
        }
        CharSequence charSequenceZzb = ((zzck) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzaks zzaksVar;
        zzaky zzakyVarZza;
        int i;
        boolean z;
        int i2;
        Map map4 = map;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzck zzckVar = (zzck) map3.get(str4);
                    zzckVar.getClass();
                    zzakw zzakwVar = (zzakw) map2.get(str3);
                    zzakwVar.getClass();
                    int i3 = zzakwVar.zzj;
                    zzaky zzakyVarZza2 = zzakx.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzckVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzckVar.zza(spannableStringBuilder);
                    }
                    if (zzakyVarZza2 != null) {
                        zzaks zzaksVar2 = this.zzi;
                        if (zzakyVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzakyVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzl()) {
                            zzcr.zza(spannableStringBuilder, new ForegroundColorSpan(zzakyVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzo()) {
                            zzcr.zza(spannableStringBuilder, new BackgroundColorSpan(zzakyVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzh() != null) {
                            zzcr.zza(spannableStringBuilder, new TypefaceSpan(zzakyVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzE() != null) {
                            zzakr zzakrVarZzE = zzakyVarZza2.zzE();
                            zzakrVarZzE.getClass();
                            int i4 = zzakrVarZzE.zza;
                            it = it2;
                            if (i4 == -1) {
                                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzakrVarZzE.zzb;
                            }
                            int i5 = zzakrVarZzE.zzc;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            zzcr.zza(spannableStringBuilder, new zzcs(i4, i2, i5), iIntValue, iIntValue2, 33);
                        } else {
                            it = it2;
                        }
                        int iZzv = zzakyVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzaksVar2 == null) {
                                    zzaksVar2 = null;
                                    break;
                                }
                                zzaky zzakyVarZza3 = zzakx.zza(zzaksVar2.zzf, zzaksVar2.zzj, map4);
                                if (zzakyVarZza3 != null && zzakyVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaksVar2 = zzaksVar2.zzi;
                                }
                            }
                            if (zzaksVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaksVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaksVar = null;
                                        break;
                                    }
                                    zzaks zzaksVar3 = (zzaks) arrayDeque.pop();
                                    zzaky zzakyVarZza4 = zzakx.zza(zzaksVar3.zzf, zzaksVar3.zzj, map4);
                                    if (zzakyVarZza4 != null && zzakyVarZza4.zzv() == 3) {
                                        zzaksVar = zzaksVar3;
                                        break;
                                    }
                                    for (int iZzf = zzaksVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzaksVar3.zze(iZzf));
                                    }
                                }
                                if (zzaksVar != null) {
                                    if (zzaksVar.zzf() != 1 || zzaksVar.zze(0).zzb == null) {
                                        zzds.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaksVar.zze(0).zzb;
                                        String str6 = zzeo.zza;
                                        zzaky zzakyVarZza5 = zzakx.zza(zzaksVar.zzf, zzaksVar.zzj, map4);
                                        int iZzx = zzakyVarZza5 != null ? zzakyVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzakyVarZza = zzakx.zza(zzaksVar2.zzf, zzaksVar2.zzj, map4)) != null) {
                                            iZzx = zzakyVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzcq(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzakq(), iIntValue, iIntValue2, 33);
                        }
                        if (zzakyVarZza2.zzC()) {
                            i = 33;
                            zzcr.zza(spannableStringBuilder, new zzcp(), iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        int iZzI = zzakyVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzakyVarZza2.zzJ()), iIntValue, iIntValue2, i);
                            } else if (iZzI == 3) {
                                zzcr.zzb(spannableStringBuilder, zzakyVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, i);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzcr.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzakyVarZza2.zzJ(), true), iIntValue, iIntValue2, i);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzakyVarZza2.zzq() != Float.MAX_VALUE) {
                                zzckVar.zzp((zzakyVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzakyVarZza2.zzy() != null) {
                                zzckVar.zzd(zzakyVarZza2.zzy());
                            }
                            if (zzakyVarZza2.zzA() != null) {
                                zzckVar.zze(zzakyVarZza2.zzA());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i6 = 0;
            while (i6 < zzf()) {
                zze(i6).zzm(j, map4, map2, str3, map3);
                i6++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzaks zzaksVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaksVar);
    }

    public final zzaks zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaks) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzakw zzakwVar = (zzakw) map2.get(pair.first);
                zzakwVar.getClass();
                zzck zzckVar = new zzck();
                zzckVar.zzc(bitmapDecodeByteArray);
                zzckVar.zzi(zzakwVar.zzb);
                zzckVar.zzj(0);
                zzckVar.zzf(zzakwVar.zzc, 0);
                zzckVar.zzg(zzakwVar.zze);
                zzckVar.zzm(zzakwVar.zzf);
                zzckVar.zzn(zzakwVar.zzg);
                zzckVar.zzo(zzakwVar.zzj);
                arrayList2.add(zzckVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzakw zzakwVar2 = (zzakw) map2.get(entry.getKey());
            zzakwVar2.getClass();
            zzck zzckVar2 = (zzck) entry.getValue();
            CharSequence charSequenceZzb = zzckVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzakq zzakqVar : (zzakq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakq.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzakqVar), spannableStringBuilder.getSpanEnd(zzakqVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzckVar2.zzf(zzakwVar2.zzc, zzakwVar2.zzd);
            zzckVar2.zzg(zzakwVar2.zze);
            zzckVar2.zzi(zzakwVar2.zzb);
            zzckVar2.zzm(zzakwVar2.zzf);
            zzckVar2.zzl(zzakwVar2.zzi, zzakwVar2.zzh);
            zzckVar2.zzo(zzakwVar2.zzj);
            arrayList2.add(zzckVar2.zzr());
        }
        return arrayList2;
    }
}
