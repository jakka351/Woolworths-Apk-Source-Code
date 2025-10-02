package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener;", "", "None", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FlowControlListener {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener$None;", "Lokhttp3/internal/http2/FlowControlListener;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements FlowControlListener {

        /* renamed from: a, reason: collision with root package name */
        public static final None f26735a = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void a(WindowCounter windowCounter) {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void b(WindowCounter windowCounter) {
            Intrinsics.h(windowCounter, "windowCounter");
        }
    }

    void a(WindowCounter windowCounter);

    void b(WindowCounter windowCounter);
}
