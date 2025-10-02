package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
final class zzh extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, continuation);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzen zzenVarZzf;
        zzen zzenVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            ResultKt.b(obj);
        } else {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(BuildersKt.a(coroutineScope, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = AwaitKt.b(deferredArr2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((Result) it.next()).d;
            if (!(obj2 instanceof Result.Failure)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
