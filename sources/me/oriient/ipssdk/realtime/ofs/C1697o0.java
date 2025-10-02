package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1697o0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Building f26119a;
    public List b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ CoreLogic e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697o0(CoreLogic coreLogic, Continuation continuation) {
        super(continuation);
        this.e = coreLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.getBuildingLayout((String) null, this);
    }
}
