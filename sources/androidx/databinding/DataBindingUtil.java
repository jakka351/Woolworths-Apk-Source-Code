package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class DataBindingUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f2545a = new DataBinderMapperImpl();

    public static ViewDataBinding a(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        DataBinderMapperImpl dataBinderMapperImpl = f2545a;
        if (i3 == 1) {
            return dataBinderMapperImpl.b(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return dataBinderMapperImpl.c(dataBindingComponent, viewArr, i2);
    }

    public static ViewDataBinding b(View view) {
        while (view != null) {
            ViewDataBinding viewDataBindingM = ViewDataBinding.m(view);
            if (viewDataBindingM != null) {
                return viewDataBindingM;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static ViewDataBinding c(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, DataBindingComponent dataBindingComponent) {
        boolean z2 = viewGroup != null && z;
        return z2 ? a(dataBindingComponent, viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : f2545a.b(dataBindingComponent, layoutInflater.inflate(i, viewGroup, z), i);
    }

    public static ViewDataBinding d(Activity activity, int i) {
        activity.setContentView(i);
        return a(null, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i);
    }
}
