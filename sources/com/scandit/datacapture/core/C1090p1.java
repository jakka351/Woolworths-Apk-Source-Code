package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter;
import com.scandit.datacapture.core.internal.sdk.ui.ContextStatusView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1090p1 implements ContextStatusPresenter {

    /* renamed from: a, reason: collision with root package name */
    private ContextStatusView f18814a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final ContextStatusView getView() {
        return this.f18814a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void onStatusChanged(ContextStatus status) {
        Intrinsics.h(status, "status");
        ContextStatusView contextStatusView = this.f18814a;
        if (contextStatusView != null) {
            contextStatusView.displayContextStatus(status);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void onWarningsChanged(ArrayList warnings) {
        Intrinsics.h(warnings, "warnings");
        ContextStatusView contextStatusView = this.f18814a;
        if (contextStatusView != null) {
            contextStatusView.displayWarnings(warnings);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.ContextStatusPresenter
    public final void setView(ContextStatusView contextStatusView) {
        this.f18814a = contextStatusView;
    }
}
