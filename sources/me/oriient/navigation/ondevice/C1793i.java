package me.oriient.navigation.ondevice;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: me.oriient.navigation.ondevice.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1793i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26288a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ o h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1793i(CoroutineScope coroutineScope, o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.g = coroutineScope;
        this.h = oVar;
        this.i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1793i c1793i = new C1793i(this.g, this.h, this.i, continuation);
        c1793i.f = obj;
        return c1793i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1793i) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f2 -> B:25:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x012e -> B:33:0x012f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.C1793i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
