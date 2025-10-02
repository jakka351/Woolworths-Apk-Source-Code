package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
class ActionBarBackgroundDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f140a;

    @RequiresApi
    public static class Api21Impl {
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f140a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f140a;
        if (actionBarContainer.k) {
            Drawable drawable = actionBarContainer.j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.i;
        if (drawable3 == null || !actionBarContainer.l) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f140a;
        if (actionBarContainer.k) {
            if (actionBarContainer.j != null) {
                actionBarContainer.h.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.h;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
