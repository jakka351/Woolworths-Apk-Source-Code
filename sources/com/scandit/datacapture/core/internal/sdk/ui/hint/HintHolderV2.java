package com.scandit.datacapture.core.internal.sdk.ui.hint;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "", "platformHintPresenter", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "getPlatformHintPresenter", "()Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "viewFinderRect", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "getViewFinderRect", "()Lcom/scandit/datacapture/core/common/geometry/Rect;", "setViewFinderRect", "(Lcom/scandit/datacapture/core/common/geometry/Rect;)V", "hideGuidance", "", "guidance", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "hideGuidance-xQ0zqIA", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)V", "hideToast", "toast", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "hideToast-sNLnd7M", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)V", "showGuidance", "showGuidance-xQ0zqIA", "showToast", "showToast-sNLnd7M", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HintHolderV2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18726a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "implementation", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18726a = new Companion();

        private Companion() {
        }

        @NotNull
        public final HintHolderV2 implementation(@NotNull Context context) {
            Intrinsics.h(context, "context");
            return new HintHolderV2Impl(context);
        }
    }

    @NotNull
    NativePlatformHintPresenter getPlatformHintPresenter();

    @Nullable
    Rect getViewFinderRect();

    /* renamed from: hideGuidance-xQ0zqIA, reason: not valid java name */
    void mo317hideGuidancexQ0zqIA(@NotNull NativeGuidanceHint guidance);

    /* renamed from: hideToast-sNLnd7M, reason: not valid java name */
    void mo318hideToastsNLnd7M(@NotNull NativeToastHint toast);

    void setViewFinderRect(@Nullable Rect rect);

    /* renamed from: showGuidance-xQ0zqIA, reason: not valid java name */
    void mo319showGuidancexQ0zqIA(@NotNull NativeGuidanceHint guidance);

    /* renamed from: showToast-sNLnd7M, reason: not valid java name */
    void mo320showToastsNLnd7M(@NotNull NativeToastHint toast);
}
