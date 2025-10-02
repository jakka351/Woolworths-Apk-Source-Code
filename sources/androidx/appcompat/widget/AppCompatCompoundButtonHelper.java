package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
class AppCompatCompoundButtonHelper {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f153a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f153a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f153a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode(this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f153a;
        Context context = compoundButton.getContext();
        int[] iArr = R.styleable.n;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        ViewCompat.z(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayF.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AppCompatResources.b(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AppCompatResources.b(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(tintTypedArrayF.a(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
            tintTypedArrayF.g();
        } catch (Throwable th) {
            tintTypedArrayF.g();
            throw th;
        }
    }
}
