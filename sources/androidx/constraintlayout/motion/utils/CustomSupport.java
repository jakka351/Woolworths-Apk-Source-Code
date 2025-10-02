package androidx.constraintlayout.motion.utils;

import YU.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class CustomSupport {

    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2327a;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f2327a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2327a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2327a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2327a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2327a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2327a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2327a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void b(ConstraintAttribute constraintAttribute, View view, float[] fArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.b;
        try {
            int iOrdinal = constraintAttribute.c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (iOrdinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbU = a.u("Cannot access method ", str, " on View \"");
            sbU.append(Debug.d(view));
            sbU.append("\"");
            Log.e("CustomSupport", sbU.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sbU2 = a.u("No method ", str, " on View \"");
            sbU2.append(Debug.d(view));
            sbU2.append("\"");
            Log.e("CustomSupport", sbU2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbU3 = a.u("Cannot invoke method ", str, " on View \"");
            sbU3.append(Debug.d(view));
            sbU3.append("\"");
            Log.e("CustomSupport", sbU3.toString(), e3);
        }
    }
}
