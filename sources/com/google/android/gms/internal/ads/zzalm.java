package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzalm {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        androidx.compose.ui.input.pointer.a.s(255, 255, 255, map, "white");
        androidx.compose.ui.input.pointer.a.s(0, 255, 0, map, "lime");
        androidx.compose.ui.input.pointer.a.s(0, 255, 255, map, "cyan");
        androidx.compose.ui.input.pointer.a.s(255, 0, 0, map, "red");
        androidx.compose.ui.input.pointer.a.s(255, 255, 0, map, "yellow");
        androidx.compose.ui.input.pointer.a.s(255, 0, 255, map, "magenta");
        androidx.compose.ui.input.pointer.a.s(0, 0, 255, map, "blue");
        androidx.compose.ui.input.pointer.a.s(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.compose.ui.input.pointer.a.s(255, 255, 255, map2, "bg_white");
        androidx.compose.ui.input.pointer.a.s(0, 255, 0, map2, "bg_lime");
        androidx.compose.ui.input.pointer.a.s(0, 255, 255, map2, "bg_cyan");
        androidx.compose.ui.input.pointer.a.s(255, 0, 0, map2, "bg_red");
        androidx.compose.ui.input.pointer.a.s(255, 255, 0, map2, "bg_yellow");
        androidx.compose.ui.input.pointer.a.s(255, 0, 255, map2, "bg_magenta");
        androidx.compose.ui.input.pointer.a.s(0, 0, 255, map2, "bg_blue");
        androidx.compose.ui.input.pointer.a.s(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    @Nullable
    public static zzalg zza(zzef zzefVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzefVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzefVar, list);
            }
            String strZzN2 = zzefVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzefVar, list);
                }
            }
        }
        return null;
    }

    public static zzck zzb(String str) {
        zzall zzallVar = new zzall();
        zze(str, zzallVar);
        return zzallVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zzc(@androidx.annotation.Nullable java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    @Nullable
    private static zzalg zzd(@Nullable String str, Matcher matcher, zzef zzefVar, List list) {
        zzall zzallVar = new zzall();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzallVar.zza = zzalo.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzallVar.zzb = zzalo.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzallVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzN.trim());
                strZzN = zzefVar.zzN(StandardCharsets.UTF_8);
            }
            zzallVar.zzc = zzc(str, sb.toString(), list);
            return new zzalg(zzallVar.zza().zzr(), zzallVar.zza, zzallVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzds.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zze(java.lang.String r16, com.google.android.gms.internal.ads.zzall r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zze(java.lang.String, com.google.android.gms.internal.ads.zzall):void");
    }

    private static void zzf(@Nullable String str, zzalj zzaljVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = zzaljVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaljVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzg = zzg(list2, str, zzaljVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzali.zza);
                        int i3 = i;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((zzali) arrayList.get(i4)).zzc().zza)) {
                                zzali zzaliVar = (zzali) arrayList.get(i4);
                                int iZzg2 = zzg(list2, str, zzaliVar.zzc());
                                if (iZzg2 == i2) {
                                    iZzg2 = iZzg != i2 ? iZzg : 1;
                                }
                                int i5 = zzaliVar.zzc().zzb - length2;
                                int iZzd = zzaliVar.zzd() - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, iZzd);
                                spannableStringBuilder.delete(i5, iZzd);
                                spannableStringBuilder.setSpan(new zzcq(charSequenceSubSequence.toString(), iZzg2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (String str3 : zzaljVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzct(zzaljVar.zzc), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzh = zzh(list2, str, zzaljVar);
        for (int i6 = 0; i6 < listZzh.size(); i6++) {
            zzalf zzalfVar = ((zzalk) listZzh.get(i6)).zzb;
            if (zzalfVar != null) {
                if (zzalfVar.zzf() != -1) {
                    zzcr.zza(spannableStringBuilder, new StyleSpan(zzalfVar.zzf()), i, length, 33);
                }
                if (zzalfVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzalfVar.zzo()) {
                    zzcr.zza(spannableStringBuilder, new ForegroundColorSpan(zzalfVar.zzm()), i, length, 33);
                }
                if (zzalfVar.zzr()) {
                    zzcr.zza(spannableStringBuilder, new BackgroundColorSpan(zzalfVar.zzp()), i, length, 33);
                }
                if (zzalfVar.zzk() != null) {
                    zzcr.zza(spannableStringBuilder, new TypefaceSpan(zzalfVar.zzk()), i, length, 33);
                }
                int iZzu = zzalfVar.zzu();
                if (iZzu == 1) {
                    zzcr.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalfVar.zzv(), true), i, length, 33);
                } else if (iZzu == 2) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv()), i, length, 33);
                } else if (iZzu == 3) {
                    zzcr.zza(spannableStringBuilder, new RelativeSizeSpan(zzalfVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzalfVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzcp(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, @Nullable String str, zzalj zzaljVar) {
        List listZzh = zzh(list, str, zzaljVar);
        for (int i = 0; i < listZzh.size(); i++) {
            zzalf zzalfVar = ((zzalk) listZzh.get(i)).zzb;
            if (zzalfVar.zzx() != -1) {
                return zzalfVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, @Nullable String str, zzalj zzaljVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalf zzalfVar = (zzalf) list.get(i);
            int iZze = zzalfVar.zze(str, zzaljVar.zza, zzaljVar.zzd, zzaljVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzalk(iZze, zzalfVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
