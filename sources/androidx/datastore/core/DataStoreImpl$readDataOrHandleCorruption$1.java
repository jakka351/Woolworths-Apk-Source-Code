package androidx.datastore.core;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, KyberEngine.KyberPolyBytes}, m = "readDataOrHandleCorruption")
/* loaded from: classes.dex */
final class DataStoreImpl$readDataOrHandleCorruption$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Serializable r;
    public Ref.ObjectRef s;
    public boolean t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ DataStoreImpl w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$1(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.w = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return DataStoreImpl.f(this.w, false, this);
    }
}
