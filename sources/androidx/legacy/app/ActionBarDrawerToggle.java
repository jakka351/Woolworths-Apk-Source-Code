package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

@Deprecated
/* loaded from: classes2.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    @Deprecated
    public interface Delegate {
    }

    @Deprecated
    public interface DelegateProvider {
    }

    public static class SetIndicatorInfo {
    }

    public class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            copyBounds(null);
            canvas.save();
            throw null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void a(float f) {
        throw null;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void b(View view) {
        throw null;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void c(View view) {
        throw null;
    }
}
