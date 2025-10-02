package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/LinearControlGroupOrientationDeserializer;", "", "", TextBundle.TEXT_ENTRY, "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "fromString", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LinearControlGroupOrientationDeserializer {

    @NotNull
    public static final LinearControlGroupOrientationDeserializer INSTANCE = new LinearControlGroupOrientationDeserializer();

    private LinearControlGroupOrientationDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final LinearControlGroupOrientation fromString(@NotNull String text) {
        Intrinsics.h(text, "text");
        if (text.equals("horizontal")) {
            return LinearControlGroupOrientation.HORIZONTAL;
        }
        if (text.equals("vertical")) {
            return LinearControlGroupOrientation.VERTICAL;
        }
        throw new IllegalStateException(text.concat(" is required to be one of [horizontal, vertical]").toString());
    }
}
