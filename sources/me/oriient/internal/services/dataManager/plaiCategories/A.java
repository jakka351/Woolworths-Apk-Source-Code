package me.oriient.internal.services.dataManager.plaiCategories;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* loaded from: classes7.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f25318a;
    public Collection b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ D f;
    public final /* synthetic */ BuildingId g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(List list, D d, BuildingId buildingId, Continuation continuation) {
        super(2, continuation);
        this.e = list;
        this.f = d;
        this.g = buildingId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        A a2 = new A(this.e, this.f, this.g, continuation);
        a2.d = obj;
        return a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:19:0x007f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.c
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.util.Collection r1 = r10.b
            java.util.Iterator r3 = r10.f25318a
            java.lang.Object r4 = r10.d
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.b(r11)
            goto L7f
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.d
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.util.List r1 = r10.e
            me.oriient.internal.services.dataManager.plaiCategories.D r3 = r10.f
            me.oriient.internal.services.dataManager.building.BuildingId r4 = r10.g
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = kotlin.collections.CollectionsKt.s(r1, r6)
            r5.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r1.next()
            me.oriient.internal.services.dataManager.plaiCategories.a0 r7 = (me.oriient.internal.services.dataManager.plaiCategories.a0) r7
            me.oriient.internal.services.dataManager.plaiCategories.z r8 = new me.oriient.internal.services.dataManager.plaiCategories.z
            r9 = 0
            r8.<init>(r3, r4, r7, r9)
            r7 = 3
            kotlinx.coroutines.Deferred r7 = kotlinx.coroutines.BuildersKt.a(r11, r9, r8, r7)
            r5.add(r7)
            goto L39
        L54:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.s(r5, r6)
            r11.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
            r3 = r1
            r1 = r11
        L63:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L86
            java.lang.Object r11 = r3.next()
            kotlinx.coroutines.Deferred r11 = (kotlinx.coroutines.Deferred) r11
            r10.d = r1
            r10.f25318a = r3
            r10.b = r1
            r10.c = r2
            java.lang.Object r11 = r11.await(r10)
            if (r11 != r0) goto L7e
            return r0
        L7e:
            r4 = r1
        L7f:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            r1.add(r11)
            r1 = r4
            goto L63
        L86:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plaiCategories.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
