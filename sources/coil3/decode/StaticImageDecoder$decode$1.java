package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
/* loaded from: classes.dex */
final class StaticImageDecoder$decode$1 extends ContinuationImpl {
    public StaticImageDecoder p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ StaticImageDecoder s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
