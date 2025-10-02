package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Augmentation f18752a;
    final /* synthetic */ AnimatedTrackedObjectAugmenter b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Augmentation augmentation, AnimatedTrackedObjectAugmenter animatedTrackedObjectAugmenter) {
        super(0);
        this.f18752a = augmentation;
        this.b = animatedTrackedObjectAugmenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup containerView = this.f18752a.getContainerView();
        if (containerView != null) {
            containerView.setVisibility(0);
        }
        this.b.a(this.f18752a, Transformation.INSTANCE.getID());
        return Unit.f24250a;
    }
}
