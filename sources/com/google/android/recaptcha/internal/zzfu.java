package com.google.android.recaptcha.internal;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzfu {

    @Nullable
    private Set zza;

    @Nullable
    private Set zzb;

    @Nullable
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = StringsKt.U(str, new char[]{JwtParser.SEPARATOR_CHAR}).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(@NotNull zzrv zzrvVar) {
        this.zza = CollectionsKt.L0(zzrvVar.zzf().zzi());
        this.zzb = CollectionsKt.L0(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(@NotNull String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        Intrinsics.f(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
