package coil3;

import coil3.request.ImageRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/EventListener;", "Lcoil3/request/ImageRequest$Listener;", "Factory", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EventListener implements ImageRequest.Listener {

    /* renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f13042a = new EventListener$Companion$NONE$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/EventListener$Companion;", "", "Lcoil3/EventListener;", "NONE", "Lcoil3/EventListener;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/EventListener$Factory;", "", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        public static final androidx.compose.ui.graphics.colorspace.a p3 = new androidx.compose.ui.graphics.colorspace.a(9);

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil3/EventListener$Factory$Companion;", "", "Lcoil3/EventListener$Factory;", "NONE", "Lcoil3/EventListener$Factory;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void a() {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onCancel() {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onStart() {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onSuccess() {
    }
}
