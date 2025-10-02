package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u001b\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0004R\"\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintPresenterV2;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "", "showToast-sNLnd7M", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)V", "showToast", "", "tag", "hideToast", "hideAllToasts", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "showGuidance-xQ0zqIA", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)V", "showGuidance", "hideCurrentGuidance", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "kotlin.jvm.PlatformType", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "get_impl$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeHintPresenterV2;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "hintHolderV2", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class HintPresenterV2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeHintPresenterV2 _impl;

    public HintPresenterV2(@NotNull HintHolderV2 hintHolderV2) {
        Intrinsics.h(hintHolderV2, "hintHolderV2");
        this._impl = NativeHintPresenterV2.create(hintHolderV2.getPlatformHintPresenter());
    }

    /* renamed from: get_impl$scandit_capture_core, reason: from getter */
    public final NativeHintPresenterV2 get_impl() {
        return this._impl;
    }

    public final void hideAllToasts() {
        this._impl.hideAllToasts();
    }

    public final void hideCurrentGuidance() {
        this._impl.hideCurrentGuidance();
    }

    public final void hideToast(@NotNull String tag) {
        Intrinsics.h(tag, "tag");
        this._impl.hideToast(tag);
    }

    /* renamed from: showGuidance-xQ0zqIA, reason: not valid java name */
    public final void m325showGuidancexQ0zqIA(@NotNull NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        this._impl.showGuidance(guidance);
    }

    /* renamed from: showToast-sNLnd7M, reason: not valid java name */
    public final void m326showToastsNLnd7M(@NotNull NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        this._impl.showToast(toast);
    }
}
