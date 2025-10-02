package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TrackedObjectAdvancedOverlay f18754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay) {
        super(0);
        this.f18754a = trackedObjectAdvancedOverlay;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18754a.getAugmenter().clearAugmentations();
        return Unit.f24250a;
    }
}
