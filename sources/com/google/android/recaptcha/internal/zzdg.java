package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes6.dex */
final class zzdg extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        Exception e;
        TimeoutCancellationException e2;
        zzbd e3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.b(obj);
            } catch (zzbd e4) {
                e3 = e4;
                zzbd zzbdVarZzs = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (TimeoutCancellationException e5) {
                e2 = e5;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            ResultKt.b(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objB = TimeoutKt.b(j, zzdfVar, this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zzenVar = zzenVarZzf;
                obj = objB;
            } catch (zzbd e7) {
                zzenVar = zzenVarZzf;
                e3 = e7;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (TimeoutCancellationException e8) {
                zzenVar = zzenVarZzf;
                e2 = e8;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e9) {
                zzenVar = zzenVarZzf;
                e = e9;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
