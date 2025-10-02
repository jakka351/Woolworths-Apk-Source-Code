package com.scandit.datacapture.core.internal.module.ui.control;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.L6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f18625a;
    final /* synthetic */ ToggleImageButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bitmap bitmap, ToggleImageButton toggleImageButton) {
        super(0);
        this.f18625a = bitmap;
        this.b = toggleImageButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f18625a != null) {
            this.b.setImageDrawable(new L6(this.f18625a, ((Number) ToggleImageButton.e.getD()).floatValue(), 1073741824));
        } else {
            this.b.setImageDrawable(null);
        }
        return Unit.f24250a;
    }
}
