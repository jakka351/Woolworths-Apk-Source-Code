package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo
/* loaded from: classes.dex */
public class TypedArrayUtils {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!f(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        return ColorStateListInflaterCompat.c(typedArray.getResourceId(1, 0), theme, typedArray.getResources());
    }

    public static ComplexColorCompat c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ComplexColorCompat complexColorCompatA;
        if (f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ComplexColorCompat(null, null, typedValue.data);
            }
            try {
                complexColorCompatA = ComplexColorCompat.a(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                complexColorCompatA = null;
            }
            if (complexColorCompatA != null) {
                return complexColorCompatA;
            }
        }
        return new ComplexColorCompat(null, null, 0);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !f(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (f(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
