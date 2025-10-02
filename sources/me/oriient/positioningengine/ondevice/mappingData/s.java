package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26447a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ double f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, String str, String str2, double d, Continuation continuation) {
        super(2, continuation);
        this.c = wVar;
        this.d = str;
        this.e = str2;
        this.f = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s sVar = new s(this.c, this.d, this.e, this.f, continuation);
        sVar.b = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0244  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.mappingData.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
