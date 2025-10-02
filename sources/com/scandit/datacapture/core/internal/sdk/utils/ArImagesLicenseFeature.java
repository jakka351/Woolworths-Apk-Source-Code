package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "", "shouldStripImages", "", "getShouldStripImages", "()Z", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ArImagesLicenseFeature {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18771a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "forMode", "allowed", "Lkotlin/Function0;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeatureAvailability;", "isArFullSupported", "impl$scandit_capture_core", "(Lkotlin/jvm/functions/Function0;)Lcom/scandit/datacapture/core/internal/sdk/utils/ArImagesLicenseFeature;", "impl", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18771a = new Companion();

        private Companion() {
        }

        @NotNull
        public final ArImagesLicenseFeature allowed() {
            return impl$scandit_capture_core(a.f18772a);
        }

        @NotNull
        public final ArImagesLicenseFeature forMode(@NotNull DataCaptureMode mode) {
            Intrinsics.h(mode, "mode");
            return impl$scandit_capture_core(new b(mode));
        }

        @NotNull
        public final ArImagesLicenseFeature impl$scandit_capture_core(@NotNull Function0<? extends NativeFeatureAvailability> isArFullSupported) {
            Intrinsics.h(isArFullSupported, "isArFullSupported");
            return new c(isArFullSupported);
        }
    }

    boolean getShouldStripImages();
}
