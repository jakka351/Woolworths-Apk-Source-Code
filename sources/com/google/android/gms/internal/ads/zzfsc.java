package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class zzfsc implements Serializer {

    @NotNull
    public static final zzfsc zza = new zzfsc();

    @NotNull
    private static final zzfrz zzb;

    static {
        zzfrz zzfrzVarZzd = zzfrz.zzd();
        Intrinsics.g(zzfrzVarZzd, "getDefaultInstance(...)");
        zzb = zzfrzVarZzd;
    }

    private zzfsc() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
        try {
            zzfrz zzfrzVarZzc = zzfrz.zzc(inputStream);
            Intrinsics.e(zzfrzVarZzc);
            return zzfrzVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzfrz) obj).zzaO(outputStream);
        return Unit.f24250a;
    }
}
