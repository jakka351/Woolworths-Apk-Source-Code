package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    public Serializable p;
    public Iterator q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.a(null, null, this);
    }
}
