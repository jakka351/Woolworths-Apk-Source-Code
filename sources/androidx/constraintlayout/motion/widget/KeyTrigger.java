package androidx.constraintlayout.motion.widget;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class KeyTrigger extends Key {
    public float w;
    public float e = 0.1f;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public RectF i = new RectF();
    public RectF j = new RectF();
    public HashMap k = new HashMap();
    public String l = null;
    public int m = -1;
    public String n = null;
    public String o = null;
    public int p = -1;
    public int q = -1;
    public View r = null;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public float v = Float.NaN;
    public boolean x = false;

    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f2335a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2335a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public KeyTrigger() {
        this.d = new HashMap();
    }

    public static void j(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(HashMap map) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: b */
    public final Key clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        super.c(this);
        keyTrigger.l = this.l;
        keyTrigger.m = this.m;
        keyTrigger.n = this.n;
        keyTrigger.o = this.o;
        keyTrigger.p = this.p;
        keyTrigger.q = this.q;
        keyTrigger.r = this.r;
        keyTrigger.e = this.e;
        keyTrigger.s = this.s;
        keyTrigger.t = this.t;
        keyTrigger.u = this.u;
        keyTrigger.v = this.v;
        keyTrigger.w = this.w;
        keyTrigger.x = this.x;
        keyTrigger.i = this.i;
        keyTrigger.j = this.j;
        keyTrigger.k = this.k;
        return keyTrigger;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void d(HashSet hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.o);
        SparseIntArray sparseIntArray = Loader.f2335a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.f2335a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.s0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f2329a);
                    this.f2329a = integer;
                    this.v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 10:
                    this.x = typedArrayObtainStyledAttributes.getBoolean(index, this.x);
                    break;
                case 11:
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.h = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 13:
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 14:
                    this.g = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.View r11, float r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.h(android.view.View, float):void");
    }

    public final void i(View view, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.k.containsKey(str)) {
                method = (Method) this.k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + Debug.d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.d.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    String str3 = constraintAttribute.b;
                    String strA = !constraintAttribute.f2360a ? a.A("set", str3) : str3;
                    try {
                        int iOrdinal = constraintAttribute.c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(constraintAttribute.d));
                                break;
                            case 1:
                                cls.getMethod(strA, cls3).invoke(view, Float.valueOf(constraintAttribute.e));
                                break;
                            case 2:
                                cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(constraintAttribute.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strA, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strA, CharSequence.class).invoke(view, constraintAttribute.f);
                                break;
                            case 5:
                                cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.g));
                                break;
                            case 6:
                                cls.getMethod(strA, cls3).invoke(view, Float.valueOf(constraintAttribute.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbU = a.u(" Custom Attribute \"", str3, "\" not found on ");
                        sbU.append(cls.getName());
                        Log.e("TransitionLayout", sbU.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strA, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbU2 = a.u(" Custom Attribute \"", str3, "\" not found on ");
                        sbU2.append(cls.getName());
                        Log.e("TransitionLayout", sbU2.toString(), e3);
                    }
                }
            }
        }
    }
}
