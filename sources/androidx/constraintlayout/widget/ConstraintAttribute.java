package androidx.constraintlayout.widget;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConstraintAttribute {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2360a = false;
    public String b;
    public AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {
        public static final AttributeType d;
        public static final AttributeType e;
        public static final AttributeType f;
        public static final AttributeType g;
        public static final AttributeType h;
        public static final AttributeType i;
        public static final AttributeType j;
        public static final AttributeType k;
        public static final /* synthetic */ AttributeType[] l;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            d = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            e = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            f = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            g = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            h = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            i = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            j = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            k = attributeType8;
            l = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) l.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.b = constraintAttribute.b;
        this.c = constraintAttribute.c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        AttributeType attributeType = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType = AttributeType.i;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                attributeType = AttributeType.f;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                attributeType = AttributeType.g;
            } else {
                AttributeType attributeType2 = AttributeType.j;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    attributeType = AttributeType.e;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    attributeType = AttributeType.d;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    attributeType = AttributeType.h;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    attributeType = AttributeType.k;
                }
                attributeType = attributeType2;
            }
        }
        if (string != null && objValueOf != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.b = string;
            constraintAttribute.c = attributeType;
            constraintAttribute.f2360a = z;
            constraintAttribute.f(objValueOf);
            map.put(string, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) map.get(str);
            String strA = !constraintAttribute.f2360a ? a.A("set", str) : str;
            try {
                int iOrdinal = constraintAttribute.c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                    case 1:
                        cls.getMethod(strA, cls2).invoke(view, Float.valueOf(constraintAttribute.e));
                        break;
                    case 2:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strA, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strA, CharSequence.class).invoke(view, constraintAttribute.f);
                        break;
                    case 5:
                        cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.g));
                        break;
                    case 6:
                        cls.getMethod(strA, cls2).invoke(view, Float.valueOf(constraintAttribute.e));
                        break;
                    case 7:
                        cls.getMethod(strA, cls3).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbU = a.u(" Custom Attribute \"", str, "\" not found on ");
                sbU.append(cls.getName());
                Log.e("TransitionLayout", sbU.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strA, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbU2 = a.u(" Custom Attribute \"", str, "\" not found on ");
                sbU2.append(cls.getName());
                Log.e("TransitionLayout", sbU2.toString(), e3);
            }
        }
    }

    public final float a() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
            case 6:
                return this.e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.g) {
                    return 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i = (this.h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.g ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
