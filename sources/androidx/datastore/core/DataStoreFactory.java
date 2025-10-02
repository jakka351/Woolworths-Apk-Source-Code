package androidx.datastore.core;

import androidx.datastore.core.FileStorage;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataStoreFactory;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataStoreFactory {
    public static DataStoreImpl a(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, ContextScope contextScope, Function0 function0) {
        Intrinsics.h(serializer, "serializer");
        Intrinsics.h(migrations, "migrations");
        return b(new FileStorage(serializer, FileStorage.AnonymousClass1.h, function0), replaceFileCorruptionHandler, migrations, contextScope);
    }

    public static DataStoreImpl b(Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, CoroutineScope coroutineScope) {
        Intrinsics.h(migrations, "migrations");
        CorruptionHandler noOpCorruptionHandler = replaceFileCorruptionHandler;
        if (replaceFileCorruptionHandler == null) {
            noOpCorruptionHandler = new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, CollectionsKt.Q(new DataMigrationInitializer$Companion$getInitializer$1(migrations, null)), noOpCorruptionHandler, coroutineScope);
    }
}
