package com.scandit.datacapture.core.ui.animation;

import android.util.FloatProperty;

/* loaded from: classes6.dex */
final class u extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FloatProperty f18894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, FloatProperty floatProperty) {
        super(str);
        this.f18894a = floatProperty;
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        return ((Float) this.f18894a.get(obj)).floatValue();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f) {
        this.f18894a.setValue(obj, f);
    }
}
