package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1727t1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727t1(String str, Continuation continuation) {
        super(2, continuation);
        this.f26149a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1727t1(this.f26149a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1727t1(this.f26149a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        User user = CoreLogic.INSTANCE.getUser();
        Unit unit = Unit.f24250a;
        if (user != null) {
            DataManager.access$getDataPreloadingManager(DataManager.INSTANCE).preloadData(this.f26149a);
            return unit;
        }
        List list = DataManager.f25825a;
        String str = this.f26149a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((IPSDataStatusObserver) it.next()).onDataPreparationFailed(str, new Error("Not logged in", 1, 0));
        }
        return unit;
    }
}
