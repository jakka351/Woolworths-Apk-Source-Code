package com.scandit.datacapture.core.ui.animation;

/* loaded from: classes6.dex */
final class j extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FloatValueHolder f18892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FloatValueHolder floatValueHolder) {
        super("FloatValueHolder");
        this.f18892a = floatValueHolder;
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        return this.f18892a.getValue();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f) {
        this.f18892a.setValue(f);
    }
}
