package me.oriient.ipssdk.realtime.ips;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSStartingPosition;

/* loaded from: classes8.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25883a;
    public SystemLocation b;
    public int c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Building e;
    public final /* synthetic */ IPSCompletionListener f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ IPSStartingPosition h;
    public final /* synthetic */ Building i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Boolean bool, Building building, IPSCompletionListener iPSCompletionListener, Integer num, IPSStartingPosition iPSStartingPosition, Building building2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.d = bool;
        this.e = building;
        this.f = iPSCompletionListener;
        this.g = num;
        this.h = iPSStartingPosition;
        this.i = building2;
        this.j = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
