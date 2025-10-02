package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzfy extends zzfx {

    @NotNull
    private final Function2 zza;

    @NotNull
    private final String zzb;

    public zzfy(@NotNull Function2 function2, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        List arrayList;
        if (!Intrinsics.c(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                arrayList.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            arrayList = EmptyList.d;
        }
        zztfVarZzf.zze(arrayList);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        Function2 function2 = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        function2.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
