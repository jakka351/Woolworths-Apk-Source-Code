package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TrackedObjectAdvancedOverlay f18757a;
    final /* synthetic */ Object b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, View view) {
        super(0);
        this.f18757a = trackedObjectAdvancedOverlay;
        this.b = obj;
        this.c = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f18757a.getAugmenter().setViewForTrackedObject(this.b, this.c);
        return Unit.f24250a;
    }
}
