package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewStructureCompat {

    /* renamed from: a, reason: collision with root package name */
    public final ViewStructure f1998a;

    @RequiresApi
    public static class Api23Impl {
    }

    public ViewStructureCompat(ViewStructure viewStructure) {
        this.f1998a = viewStructure;
    }

    public static ViewStructureCompat i(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public final Bundle a() {
        return this.f1998a.getExtras();
    }

    public final void b(String str) {
        this.f1998a.setClassName(str);
    }

    public final void c(String str) {
        this.f1998a.setContentDescription(str);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.f1998a.setDimens(i, i2, 0, 0, i3, i4);
    }

    public final void e(int i, String str) {
        this.f1998a.setId(i, null, null, str);
    }

    public final void f(CharSequence charSequence) {
        this.f1998a.setText(charSequence);
    }

    public final void g(float f) {
        this.f1998a.setTextStyle(f, 0, 0, 0);
    }

    public final ViewStructure h() {
        return this.f1998a;
    }
}
