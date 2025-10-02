package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements Function2<Object, Continuation<Object>, Object> {
    public Iterator p;
    public DataMigration q;
    public Object r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ List u;
    public final /* synthetic */ ArrayList v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.u = list;
        this.v = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.u, this.v, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.t = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r9.p
            java.lang.Object r4 = r9.t
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.b(r10)
            goto L3e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.r
            androidx.datastore.core.DataMigration r4 = r9.q
            java.util.Iterator r5 = r9.p
            java.lang.Object r6 = r9.t
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L60
        L2f:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.t
            java.util.List r1 = r9.u
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.v
        L3e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.t = r4
            r9.p = r1
            r9.q = r5
            r9.r = r10
            r9.s = r3
            java.lang.Object r6 = r5.n(r10, r9)
            if (r6 != r0) goto L5b
            goto L81
        L5b:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L84
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.t = r4
            r9.p = r5
            r9.q = r7
            r9.r = r7
            r9.s = r2
            java.lang.Object r10 = r6.o(r1, r9)
            if (r10 != r0) goto L82
        L81:
            return r0
        L82:
            r1 = r5
            goto L3e
        L84:
            r10 = r1
            goto L82
        L86:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
