package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f14622a;
    public final ApplyFont b;
    public boolean c;

    public interface ApplyFont {
        void a(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f14622a = typeface;
        this.b = applyFont;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void a(int i) {
        if (this.c) {
            return;
        }
        this.b.a(this.f14622a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void b(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
