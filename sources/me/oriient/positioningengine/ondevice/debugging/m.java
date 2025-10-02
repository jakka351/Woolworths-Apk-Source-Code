package me.oriient.positioningengine.ondevice.debugging;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public n f26427a;
    public Iterator b;
    public int c;
    public final /* synthetic */ n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.d = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.d, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r10, r0) == r3) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:131:0x04d6, B:79:0x02a0], limit reached: 274 */
    /* JADX WARN: Path cross not found for [B:33:0x014e, B:32:0x0147], limit reached: 274 */
    /* JADX WARN: Removed duplicated region for block: B:237:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x087b  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.util.Iterator, me.oriient.positioningengine.ondevice.debugging.n] */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x086e -> B:246:0x0875). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            Method dump skipped, instructions count: 2263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.debugging.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
