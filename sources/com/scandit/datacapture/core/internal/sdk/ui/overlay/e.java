package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TrackedObjectAdvancedOverlay f18756a;
    final /* synthetic */ Object b;
    final /* synthetic */ PointWithUnit c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, PointWithUnit pointWithUnit) {
        super(0);
        this.f18756a = trackedObjectAdvancedOverlay;
        this.b = obj;
        this.c = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18756a.getAugmenter().setOffsetForTrackedObject(this.b, this.c);
        return Unit.f24250a;
    }
}
