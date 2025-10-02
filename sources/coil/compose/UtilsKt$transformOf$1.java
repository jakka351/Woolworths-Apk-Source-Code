package coil.compose;

import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UtilsKt$transformOf$1 extends Lambda implements Function1<AsyncImagePainter.State, AsyncImagePainter.State> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AsyncImagePainter.State state = (AsyncImagePainter.State) obj;
        if (state instanceof AsyncImagePainter.State.Loading) {
            return (AsyncImagePainter.State.Loading) state;
        }
        if (!(state instanceof AsyncImagePainter.State.Error)) {
            return state;
        }
        AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
        Throwable th = error.b.c;
        return error;
    }
}
