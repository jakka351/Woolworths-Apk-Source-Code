package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes4.dex */
public final class DrawableDecoderCompat {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f13934a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, null);
    }

    public static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f13934a) {
                return d(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f13934a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.c(i, theme, context2.getResources());
    }

    public static Drawable d(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context);
            contextThemeWrapper.b = theme;
            contextThemeWrapper.a(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.b(i, context);
    }
}
