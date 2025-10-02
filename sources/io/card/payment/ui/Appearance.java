package io.card.payment.ui;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes7.dex */
public class Appearance {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f23912a = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] b = {R.attr.state_enabled};
    public static final int[] c = {-16842910};
    public static final int[] d = {R.attr.state_focused};
    public static final int e;
    public static final ColorDrawable f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final Typeface r;

    static {
        int color = Color.parseColor("#003087");
        e = color;
        int color2 = Color.parseColor("#009CDE");
        int color3 = Color.parseColor("#aa009CDE");
        f = new ColorDrawable(Color.parseColor("#717074"));
        g = Color.parseColor("#f5f5f5");
        h = color2;
        i = color3;
        j = color;
        k = Color.parseColor("#c5ddeb");
        l = Color.parseColor("#717074");
        m = Color.parseColor("#aa717074");
        n = Color.parseColor("#5a5a5d");
        o = Color.parseColor("#f5f5f5");
        int color4 = Color.parseColor("#515151");
        p = Color.parseColor("#b32317");
        q = color4;
        r = Typeface.create("sans-serif-light", 0);
    }

    public static LayerDrawable a(float f2, int i2, int i3) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(2.0f * f2);
        Paint paint = shapeDrawable.getPaint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        shapeDrawable.getPaint().setColor(g);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setStrokeWidth(f2);
        shapeDrawable2.getPaint().setStyle(style);
        shapeDrawable2.getPaint().setColor(i3);
        return new LayerDrawable(new Drawable[]{colorDrawable, shapeDrawable, shapeDrawable2});
    }

    public static LayerDrawable b(float f2, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(f2 * 2.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(g);
        return new LayerDrawable(new Drawable[]{colorDrawable, shapeDrawable});
    }

    public static float c(Activity activity) {
        return (ViewUtil.d(activity, "4dip") / 2.0f) * activity.getResources().getDisplayMetrics().density;
    }
}
