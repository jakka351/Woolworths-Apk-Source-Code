package me.oriient.positioningengine.ondevice;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1838z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26494a;
    public MappingData.Building b;
    public Collection c;
    public Iterator d;
    public Object e;
    public Object f;
    public Collection g;
    public int h;
    public final /* synthetic */ I i;
    public final /* synthetic */ long j;
    public final /* synthetic */ List k;
    public final /* synthetic */ MappingData.Building l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838z(I i, long j, List list, MappingData.Building building, Continuation continuation) {
        super(2, continuation);
        this.i = i;
        this.j = j;
        this.k = list;
        this.l = building;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1838z(this.i, this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1838z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01cf, code lost:
    
        if (r2.a(r4, r17) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0112, code lost:
    
        r1 = r0;
        r0 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00db -> B:28:0x0116). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.C1838z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
