package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static AppCompatDrawableManager c;

    /* renamed from: a, reason: collision with root package name */
    public ResourceManagerInternal f154a;

    /* renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1, reason: invalid class name */
    class AnonymousClass1 implements ResourceManagerInternal.ResourceManagerHooks {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f155a = {2131230993, 2131230991, 2131230917};
        public final int[] b = {2131230941, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {2131230990, 2131230992, 2131230934, R.drawable.abc_text_cursor_material, com.medallia.digital.mobilesdk.R.drawable.abc_text_select_handle_left_mtrl, com.medallia.digital.mobilesdk.R.drawable.abc_text_select_handle_middle_mtrl, com.medallia.digital.mobilesdk.R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {2131230966, R.drawable.abc_cab_background_internal_bg, 2131230965};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i, Context context) {
            int iC = ThemeUtils.c(R.attr.colorControlHighlight, context);
            int iB = ThemeUtils.b(R.attr.colorButtonNormal, context);
            int[] iArr = ThemeUtils.b;
            int[] iArr2 = ThemeUtils.d;
            int iC2 = ColorUtils.c(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, ThemeUtils.c, ThemeUtils.f}, new int[]{iB, iC2, ColorUtils.c(iC, i), i});
        }

        public static LayerDrawable c(ResourceManagerInternal resourceManagerInternal, Context context, int i) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableD = resourceManagerInternal.d(R.drawable.abc_star_black_48dp, context);
            Drawable drawableD2 = resourceManagerInternal.d(R.drawable.abc_star_half_black_48dp, context);
            if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableD;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableD2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.b;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(i, mode));
        }

        public final ColorStateList d(int i, Context context) {
            if (i == R.drawable.abc_edit_text_material) {
                return AppCompatResources.a(R.color.abc_tint_edittext, context);
            }
            if (i == 2131230983) {
                return AppCompatResources.a(R.color.abc_tint_switch_track, context);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(ThemeUtils.c(R.attr.colorButtonNormal, context), context);
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(ThemeUtils.c(R.attr.colorAccent, context), context);
                }
                if (i == 2131230978 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return AppCompatResources.a(R.color.abc_tint_spinner, context);
                }
                if (a(i, this.b)) {
                    return ThemeUtils.d(R.attr.colorControlNormal, context);
                }
                if (a(i, this.e)) {
                    return AppCompatResources.a(R.color.abc_tint_default, context);
                }
                if (a(i, this.f)) {
                    return AppCompatResources.a(R.color.abc_tint_btn_checkable, context);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return AppCompatResources.a(R.color.abc_tint_seek_thumb, context);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = ThemeUtils.d(R.attr.colorSwitchThumbNormal, context);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = ThemeUtils.b;
                iArr2[0] = ThemeUtils.b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = ThemeUtils.e;
                iArr2[1] = ThemeUtils.c(R.attr.colorControlActivated, context);
                iArr[2] = ThemeUtils.f;
                iArr2[2] = ThemeUtils.c(R.attr.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = ThemeUtils.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.e;
                iArr2[1] = ThemeUtils.c(R.attr.colorControlActivated, context);
                iArr[2] = ThemeUtils.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized AppCompatDrawableManager a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            c = appCompatDrawableManager;
            appCompatDrawableManager.f154a = ResourceManagerInternal.b();
            ResourceManagerInternal resourceManagerInternal = c.f154a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.e = anonymousClass1;
            }
        }
    }

    public static void e(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.d;
        if (!z && !tintInfo.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? tintInfo.f190a : null;
        PorterDuff.Mode mode2 = tintInfo.c ? tintInfo.b : ResourceManagerInternal.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = ResourceManagerInternal.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(int i, Context context) {
        return this.f154a.d(i, context);
    }
}
