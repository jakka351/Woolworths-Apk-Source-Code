package coil3.intercept;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequest;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {BERTags.PRIVATE}, m = "decode")
/* loaded from: classes.dex */
final class EngineInterceptor$decode$1 extends ContinuationImpl {
    public int A;
    public EngineInterceptor p;
    public SourceFetchResult q;
    public ComponentRegistry r;
    public ImageRequest s;
    public Object t;
    public Options u;
    public EventListener v;
    public Decoder w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ EngineInterceptor z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.z = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return EngineInterceptor.b(this.z, null, null, null, null, null, null, this);
    }
}
