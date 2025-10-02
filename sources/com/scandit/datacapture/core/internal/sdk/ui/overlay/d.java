package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TrackedObjectAdvancedOverlay f18755a;
    final /* synthetic */ Object b;
    final /* synthetic */ Anchor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, Anchor anchor) {
        super(0);
        this.f18755a = trackedObjectAdvancedOverlay;
        this.b = obj;
        this.c = anchor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18755a.getAugmenter().setAnchorForTrackedObject(this.b, this.c);
        return Unit.f24250a;
    }
}
