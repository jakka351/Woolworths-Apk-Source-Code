package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
final class zzk extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, continuation);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzen zzenVar;
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            ResultKt.b(obj);
        } else {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt.a(coroutineScope, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = AwaitKt.b(deferredArr2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objA = ResultKt.a(zzbdVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((Result) it2.next()).d instanceof Result.Failure)) {
                    zzenVar.zza();
                    objA = Unit.f24250a;
                    break;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objA = ResultKt.a(zzbdVar2);
        }
        return new Result(objA);
    }
}
