package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0007\u001a\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"EventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "MutableSharedFlowConfigured", "stackTraceToStringOneLine", "", "e", "", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    @Keep
    @NotNull
    public static final <T> MutableSharedFlow<T> EventFlow() {
        return MutableSharedFlowConfigured();
    }

    @Deprecated
    @Keep
    @NotNull
    public static final <T> MutableSharedFlow<T> MutableSharedFlowConfigured() {
        return SharedFlowKt.a(0, 1, BufferOverflow.e);
    }

    @Keep
    @NotNull
    public static final String stackTraceToStringOneLine(@NotNull Throwable e) {
        Intrinsics.h(e, "e");
        StringBuilder sb = new StringBuilder("[");
        StackTraceElement[] stackTrace = e.getStackTrace();
        Intrinsics.g(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";");
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
