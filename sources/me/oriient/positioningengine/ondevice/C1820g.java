package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1820g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public I f26431a;
    public MappingData.Map b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ I e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820g(I i, String str, String str2, String str3, double d, Continuation continuation) {
        super(2, continuation);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1820g c1820g = new C1820g(this.e, this.f, this.g, this.h, this.i, continuation);
        c1820g.d = obj;
        return c1820g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1820g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0312  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.C1820g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
