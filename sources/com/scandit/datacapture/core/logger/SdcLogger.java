package com.scandit.datacapture.core.logger;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\t\b\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger;", "", "Lcom/scandit/datacapture/core/logger/Event;", "event", "", "onEvent$scandit_capture_core", "(Lcom/scandit/datacapture/core/logger/Event;)Z", "onEvent", "a", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "b", "Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "getListener", "()Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "setListener", "(Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "Listener", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SdcLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy c = LazyKt.b(a.f18803a);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    private Listener listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger$Companion;", "", "Lcom/scandit/datacapture/core/logger/SdcLogger;", "get", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SdcLogger get() {
            return (SdcLogger) SdcLogger.c.getD();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "", "onEvent", "", "event", "Lcom/scandit/datacapture/core/logger/Event;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onEvent(@NotNull Event event);
    }

    @VisibleForTesting
    public SdcLogger() {
    }

    @JvmStatic
    @NotNull
    public static final SdcLogger get() {
        return INSTANCE.get();
    }

    @Nullable
    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final synchronized boolean onEvent$scandit_capture_core(@NotNull Event event) {
        Intrinsics.h(event, "event");
        Listener listener = this.listener;
        if (listener != null && this.isEnabled) {
            listener.onEvent(event);
            return true;
        }
        return false;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setListener(@Nullable Listener listener) {
        this.listener = listener;
    }
}
