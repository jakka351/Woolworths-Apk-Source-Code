package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1819f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public I f26430a;
    public MappingData.FloorFullData b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ I e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819f(I i, String str, String str2, double d, Continuation continuation) {
        super(2, continuation);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1819f c1819f = new C1819f(this.e, this.f, this.g, this.h, continuation);
        c1819f.d = obj;
        return c1819f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1819f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.C1819f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
