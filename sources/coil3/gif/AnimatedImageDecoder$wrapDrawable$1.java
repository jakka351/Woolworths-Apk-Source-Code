package coil3.gif;

import android.graphics.drawable.AnimatedImageDrawable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {132}, m = "wrapDrawable")
/* loaded from: classes4.dex */
final class AnimatedImageDecoder$wrapDrawable$1 extends ContinuationImpl {
    public AnimatedImageDecoder p;
    public AnimatedImageDrawable q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AnimatedImageDecoder s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$1(AnimatedImageDecoder animatedImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = animatedImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, this);
    }
}
