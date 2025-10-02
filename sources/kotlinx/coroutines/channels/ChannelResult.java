package kotlinx.coroutines.channels;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Failed", "Closed", "Companion", "holder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChannelResult<T> {
    public static final Failed b = new Failed();

    /* renamed from: a, reason: collision with root package name */
    public final Object f24699a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Closed extends Failed {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f24700a;

        public Closed(Throwable th) {
            this.f24700a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Closed) {
                return Intrinsics.c(this.f24700a, ((Closed) obj).f24700a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f24700a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public final String toString() {
            return "Closed(" + this.f24700a + ')';
        }
    }

    @InternalCoroutinesApi
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "failed", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ ChannelResult(Object obj) {
        this.f24699a = obj;
    }

    public static final Throwable a(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.f24700a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ChannelResult) {
            return Intrinsics.c(this.f24699a, ((ChannelResult) obj).f24699a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24699a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f24699a;
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
