package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzl {

    @NotNull
    private final List zza;

    @Nullable
    private zzek zzb;

    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        CollectionsKt.j(this.zza, zzeVarArr);
    }

    @Nullable
    public final Object zzb(@NotNull String str, long j, @NotNull Continuation continuation) {
        return CoroutineScopeKt.c(new zzh(this, str, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r12, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r14, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzek r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L15
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.zzc = r2
            goto L1a
        L15:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.zza
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r1.zzc
            r10 = 1
            if (r2 == 0) goto L31
            if (r2 != r10) goto L29
            kotlin.ResultKt.b(r0)
            goto L47
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            kotlin.ResultKt.b(r0)
            com.google.android.recaptcha.internal.zzk r2 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r3 = r11
            r5 = r12
            r7 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r10
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.c(r2, r1)
            if (r0 != r9) goto L47
            return r9
        L47:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final List zzd() {
        return this.zza;
    }

    public final void zzf(@NotNull zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(@NotNull zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) EmptyList.d.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
