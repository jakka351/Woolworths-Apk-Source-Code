package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.plai.PlaiProductResult;
import me.oriient.ipssdk.api.listeners.IPSProductAndCategoriesLocationListener;

/* loaded from: classes8.dex */
public final class G extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Outcome f25941a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public PlaiProductResult f;
    public List g;
    public Iterator h;
    public int i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ IPSProductAndCategoriesLocationListener l;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(String str, String str2, IPSProductAndCategoriesLocationListener iPSProductAndCategoriesLocationListener, List list, Continuation continuation) {
        super(2, continuation);
        this.j = str;
        this.k = str2;
        this.l = iPSProductAndCategoriesLocationListener;
        this.m = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new G(this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r2 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r5 == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c4  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00df -> B:27:0x00e3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
