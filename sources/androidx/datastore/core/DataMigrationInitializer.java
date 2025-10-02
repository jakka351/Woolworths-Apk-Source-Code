package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataMigrationInitializer<T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(java.util.List r6, androidx.datastore.core.InitializerApi r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
            /*
                boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.s = r1
                goto L18
            L13:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.r
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.util.Iterator r6 = r0.q
                java.io.Serializable r7 = r0.p
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L30
                goto L67
            L30:
                r8 = move-exception
                goto L80
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                java.io.Serializable r6 = r0.p
                java.util.List r6 = (java.util.List) r6
                kotlin.ResultKt.b(r8)
                goto L5c
            L42:
                kotlin.ResultKt.b(r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r5 = 0
                r2.<init>(r6, r8, r5)
                r0.p = r8
                r0.s = r4
                java.lang.Object r6 = r7.a(r2, r0)
                if (r6 != r1) goto L5b
                goto L95
            L5b:
                r6 = r8
            L5c:
                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                r7.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L67:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L8d
                java.lang.Object r8 = r6.next()
                kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
                r0.p = r7     // Catch: java.lang.Throwable -> L30
                r0.q = r6     // Catch: java.lang.Throwable -> L30
                r0.s = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L67
                goto L95
            L80:
                java.lang.Object r2 = r7.d
                if (r2 != 0) goto L87
                r7.d = r8
                goto L67
            L87:
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.ExceptionsKt.a(r2, r8)
                goto L67
            L8d:
                java.lang.Object r6 = r7.d
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 != 0) goto L96
                kotlin.Unit r1 = kotlin.Unit.f24250a
            L95:
                return r1
            L96:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.a(java.util.List, androidx.datastore.core.InitializerApi, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }
}
