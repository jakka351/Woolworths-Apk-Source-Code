package io.card.payment.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class ViewUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f23913a;
    public static final Pattern b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        a.x(map, "dp", 1, 2, "sp");
        androidx.constraintlayout.core.state.a.u(3, map, "pt", 4, "in");
        map.put("mm", 5);
        f23913a = Collections.unmodifiableMap(map);
        b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
        c = new HashMap();
    }

    public static void a(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(e(context, str), e(context, str2), e(context, str3), e(context, str4));
        }
    }

    public static void b(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        view.setPadding(e(context, str), e(context, str2), e(context, str3), e(context, str4));
    }

    public static void c(Button button, boolean z, Activity activity, boolean z2) {
        StateListDrawable stateListDrawable;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        button.setFocusable(true);
        b(button, "10dip", "0dip", "10dip", "0dip");
        if (z2) {
            return;
        }
        if (z) {
            int[] iArr = Appearance.f23912a;
            stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(Appearance.f23912a, new ColorDrawable(Appearance.j));
            stateListDrawable.addState(Appearance.c, new ColorDrawable(Appearance.k));
            int[] iArr2 = Appearance.d;
            int i = Appearance.h;
            stateListDrawable.addState(iArr2, Appearance.a(Appearance.c(activity), i, Appearance.i));
            stateListDrawable.addState(Appearance.b, Appearance.b(Appearance.c(activity), i));
        } else {
            int[] iArr3 = Appearance.f23912a;
            stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(Appearance.f23912a, new ColorDrawable(Appearance.n));
            stateListDrawable.addState(Appearance.c, new ColorDrawable(Appearance.o));
            int[] iArr4 = Appearance.d;
            int i2 = Appearance.l;
            stateListDrawable.addState(iArr4, Appearance.a(Appearance.c(activity), i2, Appearance.m));
            stateListDrawable.addState(Appearance.b, Appearance.b(Appearance.c(activity), i2));
        }
        button.setBackground(stateListDrawable);
        button.setGravity(17);
        button.setMinimumHeight(e(activity, "54dip"));
        button.setTextColor(-1);
        button.setTextSize(20.0f);
        button.setTypeface(Appearance.r);
    }

    public static float d(Context context, String str) throws NumberFormatException {
        if (str == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        String lowerCase = str.toLowerCase();
        HashMap map = c;
        if (map.containsKey(lowerCase)) {
            return ((Float) map.get(lowerCase)).floatValue();
        }
        Matcher matcher = b.matcher(lowerCase);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float f = Float.parseFloat(matcher.group(1));
        Integer num = (Integer) f23913a.get(matcher.group(3).toLowerCase());
        if (num == null) {
            num = 1;
        }
        float fApplyDimension = TypedValue.applyDimension(num.intValue(), f, context.getResources().getDisplayMetrics());
        map.put(lowerCase, Float.valueOf(fApplyDimension));
        return fApplyDimension;
    }

    public static int e(Context context, String str) {
        if (str == null) {
            return 0;
        }
        return (int) d(context, str);
    }
}
