package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.DeepRecursiveScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
/* loaded from: classes7.dex */
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    public DeepRecursiveScope p;
    public JsonTreeReader q;
    public LinkedHashMap r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ JsonTreeReader u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.u = jsonTreeReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return JsonTreeReader.a(this.u, null, this);
    }
}
