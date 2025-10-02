package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    public static ResourceManagerInternal g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f180a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public ResourceManagerHooks e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final ColorFilterLruCache h = new ColorFilterLruCache(6);

    /* loaded from: classes2.dex */
    public static class AsldcInflateDelegate implements InflateDelegate {
    }

    /* loaded from: classes2.dex */
    public static class AvdcInflateDelegate implements InflateDelegate {
    }

    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
    }

    /* loaded from: classes2.dex */
    public static class DrawableDelegate implements InflateDelegate {
    }

    /* loaded from: classes2.dex */
    public interface InflateDelegate {
    }

    @RestrictTo
    public interface ResourceManagerHooks {
    }

    /* loaded from: classes2.dex */
    public static class VdcInflateDelegate implements InflateDelegate {
    }

    public static synchronized ResourceManagerInternal b() {
        try {
            if (g == null) {
                g = new ResourceManagerInternal();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ColorFilterLruCache colorFilterLruCache = h;
        colorFilterLruCache.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = colorFilterLruCache.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            colorFilterLruCache.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray longSparseArray = (LongSparseArray) this.b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray((Object) null);
                    this.b.put(context, longSparseArray);
                }
                longSparseArray.h(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(Context context, long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) longSparseArray.c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.i(j);
        }
        return null;
    }

    public final synchronized Drawable d(int i, Context context) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableC;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(R.drawable.abc_vector_test, context);
                if (drawableD == null || (!(drawableD instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.c == null) {
                this.c = new TypedValue();
            }
            TypedValue typedValue = this.c;
            context.getResources().getValue(i, typedValue, true);
            long j = (typedValue.assetCookie << 32) | typedValue.data;
            drawableC = c(context, j);
            if (drawableC == null) {
                LayerDrawable layerDrawableC = null;
                if (this.e != null) {
                    if (i == R.drawable.abc_cab_background_top_material) {
                        layerDrawableC = new LayerDrawable(new Drawable[]{d(R.drawable.abc_cab_background_internal_bg, context), d(2131230934, context)});
                    } else if (i == R.drawable.abc_ratingbar_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_big);
                    } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_medium);
                    } else if (i == R.drawable.abc_ratingbar_small_material) {
                        layerDrawableC = AppCompatDrawableManager.AnonymousClass1.c(this, context, R.dimen.abc_star_small);
                    }
                }
                drawableC = layerDrawableC;
                if (drawableC != null) {
                    drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j, drawableC);
                }
            }
            if (drawableC == null) {
                drawableC = context.getDrawable(i);
            }
            if (drawableC != null) {
                drawableC = h(context, i, z, drawableC);
            }
            if (drawableC != null) {
                DrawableUtils.a(drawableC);
            }
        } finally {
        }
        return drawableC;
    }

    public final synchronized ColorStateList g(int i, Context context) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f180a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) SparseArrayCompatKt.b(sparseArrayCompat, i);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.e;
            if (resourceManagerHooks != null) {
                colorStateListD = ((AppCompatDrawableManager.AnonymousClass1) resourceManagerHooks).d(i, context);
            }
            if (colorStateListD != null) {
                if (this.f180a == null) {
                    this.f180a = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.f180a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat(0);
                    this.f180a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.a(i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            r8 = this;
            android.content.res.ColorStateList r0 = r8.g(r10, r9)
            r1 = 0
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r9 = r12.mutate()
            androidx.core.graphics.drawable.DrawableCompat.m(r9, r0)
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r11 = r8.e
            if (r11 != 0) goto L13
            goto L1a
        L13:
            r11 = 2131230982(0x7f080106, float:1.8078032E38)
            if (r10 != r11) goto L1a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1a:
            if (r1 == 0) goto L1f
            androidx.core.graphics.drawable.DrawableCompat.n(r9, r1)
        L1f:
            return r9
        L20:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r8.e
            r2 = 2130968892(0x7f04013c, float:1.754645E38)
            r3 = 2130968890(0x7f04013a, float:1.7546446E38)
            if (r0 == 0) goto L94
            r4 = 2131230977(0x7f080101, float:1.8078022E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            r7 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r4) goto L5e
            r10 = r12
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r7)
            int r0 = androidx.appcompat.widget.ThemeUtils.c(r2, r9)
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.AppCompatDrawableManager.b
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r11, r0, r1)
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r6)
            int r0 = androidx.appcompat.widget.ThemeUtils.c(r2, r9)
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r11, r0, r1)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r5)
            int r9 = androidx.appcompat.widget.ThemeUtils.c(r3, r9)
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r10, r9, r1)
            return r12
        L5e:
            r4 = 2131230968(0x7f0800f8, float:1.8078004E38)
            if (r10 == r4) goto L6d
            r4 = 2131230967(0x7f0800f7, float:1.8078002E38)
            if (r10 == r4) goto L6d
            r4 = 2131230969(0x7f0800f9, float:1.8078006E38)
            if (r10 != r4) goto L94
        L6d:
            r10 = r12
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r7)
            int r0 = androidx.appcompat.widget.ThemeUtils.b(r2, r9)
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.AppCompatDrawableManager.b
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r11, r0, r1)
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r6)
            int r0 = androidx.appcompat.widget.ThemeUtils.c(r3, r9)
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r11, r0, r1)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r5)
            int r9 = androidx.appcompat.widget.ThemeUtils.c(r3, r9)
            androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.e(r10, r9, r1)
            return r12
        L94:
            if (r0 == 0) goto Lee
            androidx.appcompat.widget.AppCompatDrawableManager$1 r0 = (androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1) r0
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.AppCompatDrawableManager.b
            int[] r5 = r0.f155a
            boolean r5 = androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.a(r10, r5)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto La6
        La4:
            r10 = r7
            goto Ld7
        La6:
            int[] r2 = r0.c
            boolean r2 = androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.a(r10, r2)
            if (r2 == 0) goto Lb0
            r2 = r3
            goto La4
        Lb0:
            int[] r0 = r0.d
            boolean r0 = androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.a(r10, r0)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto Lbe
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La4
        Lbe:
            r0 = 2131230954(0x7f0800ea, float:1.8077975E38)
            if (r10 != r0) goto Lce
            r10 = 1109603123(0x42233333, float:40.8)
            int r10 = java.lang.Math.round(r10)
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            goto Ld7
        Lce:
            r0 = 2131230936(0x7f0800d8, float:1.8077939E38)
            if (r10 != r0) goto Ld4
            goto La4
        Ld4:
            r2 = 0
            r6 = r2
            goto La4
        Ld7:
            if (r6 == 0) goto Lee
            android.graphics.drawable.Drawable r11 = r12.mutate()
            int r9 = androidx.appcompat.widget.ThemeUtils.c(r2, r9)
            android.graphics.PorterDuffColorFilter r9 = androidx.appcompat.widget.AppCompatDrawableManager.c(r9, r4)
            r11.setColorFilter(r9)
            if (r10 == r7) goto Lf1
            r11.setAlpha(r10)
            return r12
        Lee:
            if (r11 == 0) goto Lf1
            return r1
        Lf1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.h(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
