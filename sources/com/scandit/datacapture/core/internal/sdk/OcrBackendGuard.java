package com.scandit.datacapture.core.internal.sdk;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/OcrBackendGuard;", "", "Lcom/scandit/datacapture/core/internal/sdk/OcrBackend;", "backend", "", "setBackend", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class OcrBackendGuard {

    @NotNull
    public static final OcrBackendGuard INSTANCE = new OcrBackendGuard();

    /* renamed from: a, reason: collision with root package name */
    private static WeakReference f18643a = new WeakReference(null);

    private OcrBackendGuard() {
    }

    public final void setBackend(@NotNull OcrBackend backend) {
        Intrinsics.h(backend, "backend");
        OcrBackend ocrBackend = (OcrBackend) f18643a.get();
        if (ocrBackend != null) {
            ocrBackend.deinitialize();
        }
        f18643a = new WeakReference(backend);
    }
}
