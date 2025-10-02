package com.scandit.datacapture.barcode;

import android.content.SharedPreferences;

/* loaded from: classes6.dex */
final class Ud implements K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Yd f17321a;

    public Ud(Yd yd) {
        this.f17321a = yd;
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void a(boolean z) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f17321a.f17360a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_audio_feedback_key", z)) != null) {
            editorPutBoolean.apply();
        }
        K kB = this.f17321a.b();
        if (kB != null) {
            kB.a(z);
        }
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void b(boolean z) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f17321a.f17360a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_color_scheme_key", z)) != null) {
            editorPutBoolean.apply();
        }
        K kB = this.f17321a.b();
        if (kB != null) {
            kB.b(z);
        }
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void c(boolean z) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f17321a.f17360a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_strap_mode_key", z)) != null) {
            editorPutBoolean.apply();
        }
        K kB = this.f17321a.b();
        if (kB != null) {
            kB.c(z);
        }
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void d(boolean z) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorEdit = this.f17321a.f17360a.edit();
        if (editorEdit != null && (editorPutBoolean = editorEdit.putBoolean("barcode_count_toolbar_haptic_feedback_key", z)) != null) {
            editorPutBoolean.apply();
        }
        K kB = this.f17321a.b();
        if (kB != null) {
            kB.d(z);
        }
    }
}
