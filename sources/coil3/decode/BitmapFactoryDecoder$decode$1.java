package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
/* loaded from: classes4.dex */
final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ BitmapFactoryDecoder s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = bitmapFactoryDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
