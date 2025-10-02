package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.AnonymousClass1;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {
    public final Context f;
    public Animator.AnimatorListener g = null;
    public ArrayList h = null;
    public final Drawable.Callback i = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    };
    public final AnimatedVectorDrawableCompatState e = new AnimatedVectorDrawableCompatState();

    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public VectorDrawableCompat f3808a;
        public AnimatorSet b;
        public ArrayList c;
        public ArrayMap d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        public static void a(Object obj) {
            ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
        }

        @DoNotInline
        public static void b(Object obj, Object obj2) {
            ((AnimatedVectorDrawable) obj).registerAnimationCallback((Animatable2.AnimationCallback) obj2);
        }

        @DoNotInline
        public static boolean c(Object obj, Object obj2) {
            return ((AnimatedVectorDrawable) obj).unregisterAnimationCallback((Animatable2.AnimationCallback) obj2);
        }
    }

    public AnimatedVectorDrawableCompat(Context context, int i) {
        this.f = context;
    }

    public static AnimatedVectorDrawableCompat a(int i, Context context) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context, 0);
        Drawable drawableC = ResourcesCompat.c(i, context.getTheme(), context.getResources());
        drawableC.setCallback(animatedVectorDrawableCompat.i);
        new AnimatedVectorDrawableDelegateState(drawableC.getConstantState());
        animatedVectorDrawableCompat.d = drawableC;
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void b(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f3806a == null) {
                animationCallback.f3806a = animationCallback.new AnonymousClass1();
            }
            Api23Impl.b(animatedVectorDrawable, animationCallback.f3806a);
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (this.h.contains(animationCallback)) {
            return;
        }
        this.h.add(animationCallback);
        if (this.g == null) {
            this.g = new AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.h);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i)).a(animatedVectorDrawableCompat);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.h);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i)).b(animatedVectorDrawableCompat);
                    }
                }
            };
        }
        this.e.b.addListener(this.g);
    }

    public final boolean c(Animatable2Compat.AnimationCallback animationCallback) {
        Animator.AnimatorListener animatorListener;
        if (animationCallback == null) {
            return false;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f3806a == null) {
                animationCallback.f3806a = animationCallback.new AnonymousClass1();
            }
            Api23Impl.c(animatedVectorDrawable, animationCallback.f3806a);
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.h.size() == 0 && (animatorListener = this.g) != null) {
            this.e.b.removeListener(animatorListener);
            this.g = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void clearAnimationCallbacks() {
        Drawable drawable = this.d;
        if (drawable != null) {
            Api23Impl.a(drawable);
            return;
        }
        Animator.AnimatorListener animatorListener = this.g;
        if (animatorListener != null) {
            this.e.b.removeListener(animatorListener);
            this.g = null;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.e;
        animatedVectorDrawableCompatState.f3808a.draw(canvas);
        if (animatedVectorDrawableCompatState.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getAlpha() : this.e.f3808a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getColorFilter() : this.e.f3808a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.d != null) {
            return new AnimatedVectorDrawableDelegateState(this.d.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.e.f3808a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.e.f3808a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getOpacity() : this.e.f3808a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r3.b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        r3.b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r3.b.playTogether(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.d
            if (r0 == 0) goto L8
            r0.inflate(r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r3 = r8.e
            if (r0 == r2) goto Lb4
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lb4
        L1f:
            r4 = 2
            if (r0 != r4) goto Lae
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L54
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.e
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.g(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L50
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r4 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.a(r4, r12, r9)
            r4.i = r5
            android.graphics.drawable.Drawable$Callback r5 = r8.i
            r4.setCallback(r5)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r3.f3808a
            if (r5 == 0) goto L4e
            r6 = 0
            r5.setCallback(r6)
        L4e:
            r3.f3808a = r4
        L50:
            r0.recycle()
            goto Lae
        L54:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lae
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lab
            android.content.Context r7 = r8.f
            if (r7 == 0) goto La0
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r7 = r3.f3808a
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r7 = r7.e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r7 = r7.b
            androidx.collection.ArrayMap r7 = r7.o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.c
            if (r7 != 0) goto L95
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.c = r7
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>(r5)
            r3.d = r7
        L95:
            java.util.ArrayList r5 = r3.c
            r5.add(r6)
            androidx.collection.ArrayMap r3 = r3.d
            r3.put(r6, r4)
            goto Lab
        La0:
            r0.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Context can't be null when inflating animators"
            r9.<init>(r10)
            throw r9
        Lab:
            r0.recycle()
        Lae:
            int r0 = r10.next()
            goto L12
        Lb4:
            android.animation.AnimatorSet r9 = r3.b
            if (r9 != 0) goto Lbf
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r3.b = r9
        Lbf:
            android.animation.AnimatorSet r9 = r3.b
            java.util.ArrayList r10 = r3.c
            r9.playTogether(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.isAutoMirrored() : this.e.f3808a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.e.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.isStateful() : this.e.f3808a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.e.f3808a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setLevel(i) : this.e.f3808a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setState(iArr) : this.e.f3808a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.e.f3808a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.e.f3808a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e.f3808a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.l(drawable, i);
        } else {
            this.e.f3808a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.m(drawable, colorStateList);
        } else {
            this.e.f3808a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.n(drawable, mode);
        } else {
            this.e.f3808a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.e.f3808a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.e;
        if (animatedVectorDrawableCompatState.b.isStarted()) {
            return;
        }
        animatedVectorDrawableCompatState.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.e.b.end();
        }
    }

    @RequiresApi
    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3809a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f3809a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f3809a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f3809a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, 0);
            Drawable drawableNewDrawable = this.f3809a.newDrawable();
            animatedVectorDrawableCompat.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.i);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, 0);
            Drawable drawableNewDrawable = this.f3809a.newDrawable(resources);
            animatedVectorDrawableCompat.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.i);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, 0);
            Drawable drawableNewDrawable = this.f3809a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.i);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
