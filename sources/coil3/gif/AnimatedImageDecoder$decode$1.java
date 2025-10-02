package coil3.gif;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {57, 98}, m = "decode")
/* loaded from: classes4.dex */
final class AnimatedImageDecoder$decode$1 extends ContinuationImpl {
    public Object p;
    public Ref.BooleanRef q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AnimatedImageDecoder s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$decode$1(AnimatedImageDecoder animatedImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = animatedImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
