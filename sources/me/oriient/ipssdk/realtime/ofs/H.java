package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.plai.PlaiProductResult;
import me.oriient.ipssdk.api.listeners.IPSProductLocationResultListener;

/* loaded from: classes8.dex */
public final class H extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public IPSProductLocationResultListener f25947a;
    public PlaiProductResult b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IPSProductLocationResultListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, String str2, IPSProductLocationResultListener iPSProductLocationResultListener, Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = str2;
        this.f = iPSProductLocationResultListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new H(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
