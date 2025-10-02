package androidx.privacysandbox.ads.adservices.java.signals;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.compose.ui.input.pointer.a;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "", "Companion", "JavaImpl", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProtectedSignalsManagerFutures {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion;", "", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "a", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JavaImpl extends ProtectedSignalsManagerFutures {
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> a(@NotNull UpdateSignalsRequest request) {
            Intrinsics.h(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f24691a), null, new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null), 3));
        }
    }
}
