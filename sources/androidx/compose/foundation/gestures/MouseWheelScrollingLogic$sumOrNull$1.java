package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MouseWheelScrollingLogic$sumOrNull$1 extends Lambda implements Function0<MouseWheelScrollingLogic.MouseWheelScrollDelta> {
    public final /* synthetic */ Channel h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$sumOrNull$1(Channel channel) {
        super(0);
        this.h = channel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (MouseWheelScrollingLogic.MouseWheelScrollDelta) ChannelResult.b(this.h.o());
    }
}
