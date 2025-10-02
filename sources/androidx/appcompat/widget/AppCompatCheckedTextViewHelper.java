package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
class AppCompatCheckedTextViewHelper {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatCheckedTextView f152a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public AppCompatCheckedTextViewHelper(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f152a = appCompatCheckedTextView;
    }

    public final void a() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f152a;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode(this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
