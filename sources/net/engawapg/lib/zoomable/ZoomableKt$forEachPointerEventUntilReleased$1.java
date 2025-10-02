package net.engawapg.lib.zoomable;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomableKt", f = "Zoomable.kt", l = {141}, m = "forEachPointerEventUntilReleased")
/* loaded from: classes8.dex */
final class ZoomableKt$forEachPointerEventUntilReleased$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public Function1 q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return ZoomableKt.a(null, null, this);
    }
}
