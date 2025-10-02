package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {337, 339, 385}, m = "detectZoom")
/* loaded from: classes2.dex */
final class TransformableKt$detectZoom$1 extends ContinuationImpl {
    public /* synthetic */ Object A;
    public int B;
    public AwaitPointerEventScope p;
    public Channel q;
    public Function1 r;
    public PointerEvent s;
    public float t;
    public float u;
    public float v;
    public long w;
    public int x;
    public int y;
    public int z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return TransformableKt.b(null, null, null, this);
    }
}
