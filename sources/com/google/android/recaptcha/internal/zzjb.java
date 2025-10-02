package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzjb {
    @NotNull
    public static final Map zza() {
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair(-4, zzba.zzo), new Pair(-12, zzba.zzp), new Pair(-6, zzba.zzk), new Pair(-11, zzba.zzm), new Pair(-13, zzba.zzq), new Pair(-14, zzba.zzr), new Pair(-2, zzba.zzl), new Pair(-7, zzba.zzs), new Pair(-5, zzba.zzt), new Pair(-9, zzba.zzu), new Pair(-8, zzba.zzE), new Pair(-15, zzba.zzn), new Pair(-1, zzba.zzv), new Pair(-3, zzba.zzx), new Pair(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        linkedHashMapL.put(-16, zzba.zzw);
        linkedHashMapL.put(1, zzba.zzA);
        linkedHashMapL.put(2, zzba.zzB);
        linkedHashMapL.put(0, zzba.zzC);
        linkedHashMapL.put(3, zzba.zzD);
        if (i >= 29) {
            linkedHashMapL.put(4, zzba.zzz);
        }
        return linkedHashMapL;
    }
}
