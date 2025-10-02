package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
/* loaded from: classes.dex */
final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public Ref.ObjectRef s;
    public DataStoreImpl t;
    public /* synthetic */ Object u;
    public final /* synthetic */ DataStoreImpl$InitDataStore$doRun$initData$1$api$1 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
