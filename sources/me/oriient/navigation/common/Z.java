package me.oriient.navigation.common;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;

/* loaded from: classes8.dex */
public final class Z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26229a;
    public final /* synthetic */ NavigationManagerImpl b;
    public final /* synthetic */ NavigationConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(NavigationManagerImpl navigationManagerImpl, NavigationConfig navigationConfig, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
        this.c = navigationConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
