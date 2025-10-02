package androidx.compose.animation.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.PathInterpolator;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.graphics.res.AnimatorResources_androidKt;
import androidx.compose.animation.graphics.res.a;
import androidx.compose.animation.graphics.vector.AnimatorSet;
import androidx.compose.animation.graphics.vector.Keyframe;
import androidx.compose.animation.graphics.vector.ObjectAnimator;
import androidx.compose.animation.graphics.vector.Ordering;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder1D;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder2D;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderColor;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderInt;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderPath;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.core.graphics.PathParser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class XmlAnimatorParser_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ValueType f823a = ValueType.d;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ValueType valueType = ValueType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ValueType valueType2 = ValueType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ValueType valueType3 = ValueType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Easing a(TypedArray typedArray, Resources resources, Resources.Theme theme, int i, Easing easing) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes;
        Easing easing2;
        Easing easing3;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return easing;
        }
        Easing easing4 = (Easing) AnimatorResources_androidKt.e.get(Integer.valueOf(resourceId));
        if (easing4 != null) {
            return easing4;
        }
        XmlResourceParser xml = resources.getXml(resourceId);
        XmlPullParserUtils_androidKt.b(xml);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        String name = xml.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            int[] iArr = AndroidVectorResources.h;
            switch (iHashCode) {
                case -2140409460:
                    if (name.equals("pathInterpolator")) {
                        int[] iArr2 = AndroidVectorResources.m;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArrayObtainAttributes.getString(4);
                            return string != null ? new a(new PathInterpolator(PathParser.d(string))) : (typedArrayObtainAttributes.hasValue(2) && typedArrayObtainAttributes.hasValue(3)) ? new CubicBezierEasing(typedArrayObtainAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(2, 1.0f), typedArrayObtainAttributes.getFloat(3, 1.0f)) : new a(new PathInterpolator(typedArrayObtainAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED), typedArrayObtainAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED)));
                        } finally {
                        }
                    }
                    break;
                case -2120889007:
                    if (name.equals("anticipateInterpolator")) {
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                            typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                        }
                        try {
                            final float f = typedArrayObtainAttributes.getFloat(0, 2.0f);
                            final int i2 = 0;
                            return new Easing() { // from class: androidx.compose.animation.graphics.res.b
                                @Override // androidx.compose.animation.core.Easing
                                public final float a(float f2) {
                                    double dPow;
                                    int i3 = i2;
                                    float f3 = f;
                                    switch (i3) {
                                        case 0:
                                            androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
                                            return (((1 + f3) * f2) - f3) * f2 * f2;
                                        case 1:
                                            androidx.compose.animation.core.a aVar2 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.pow(f2, f3 * 2);
                                            break;
                                        case 2:
                                            androidx.compose.animation.core.a aVar3 = AnimatorResources_androidKt.f804a;
                                            float f4 = f2 - 1.0f;
                                            return ((((f3 + 1.0f) * f4) + f3) * f4 * f4) + 1.0f;
                                        case 3:
                                            androidx.compose.animation.core.a aVar4 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.sin(2 * f3 * 3.141592653589793d * f2);
                                            break;
                                        default:
                                            androidx.compose.animation.core.a aVar5 = AnimatorResources_androidKt.f804a;
                                            return 1.0f - ((float) Math.pow(1.0f - f2, 2 * f3));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case -1248486260:
                    if (name.equals("linearInterpolator")) {
                        return EasingKt.d;
                    }
                    break;
                case -935873468:
                    if (name.equals("accelerateInterpolator")) {
                        int[] iArr3 = AndroidVectorResources.i;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                        }
                        try {
                            final float f2 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            if (f2 == 1.0f) {
                                easing2 = AnimatorResources_androidKt.b;
                            } else {
                                final int i3 = 1;
                                easing2 = new Easing() { // from class: androidx.compose.animation.graphics.res.b
                                    @Override // androidx.compose.animation.core.Easing
                                    public final float a(float f22) {
                                        double dPow;
                                        int i32 = i3;
                                        float f3 = f2;
                                        switch (i32) {
                                            case 0:
                                                androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
                                                return (((1 + f3) * f22) - f3) * f22 * f22;
                                            case 1:
                                                androidx.compose.animation.core.a aVar2 = AnimatorResources_androidKt.f804a;
                                                dPow = Math.pow(f22, f3 * 2);
                                                break;
                                            case 2:
                                                androidx.compose.animation.core.a aVar3 = AnimatorResources_androidKt.f804a;
                                                float f4 = f22 - 1.0f;
                                                return ((((f3 + 1.0f) * f4) + f3) * f4 * f4) + 1.0f;
                                            case 3:
                                                androidx.compose.animation.core.a aVar4 = AnimatorResources_androidKt.f804a;
                                                dPow = Math.sin(2 * f3 * 3.141592653589793d * f22);
                                                break;
                                            default:
                                                androidx.compose.animation.core.a aVar5 = AnimatorResources_androidKt.f804a;
                                                return 1.0f - ((float) Math.pow(1.0f - f22, 2 * f3));
                                        }
                                        return (float) dPow;
                                    }
                                };
                            }
                            return easing2;
                        } finally {
                        }
                    }
                    break;
                case -425326737:
                    if (name.equals("bounceInterpolator")) {
                        return AnimatorResources_androidKt.c;
                    }
                    break;
                case 1192587314:
                    if (name.equals("overshootInterpolator")) {
                        int[] iArr4 = AndroidVectorResources.l;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                        }
                        try {
                            final float f3 = typedArrayObtainAttributes.getFloat(0, 2.0f);
                            final int i4 = 2;
                            return new Easing() { // from class: androidx.compose.animation.graphics.res.b
                                @Override // androidx.compose.animation.core.Easing
                                public final float a(float f22) {
                                    double dPow;
                                    int i32 = i4;
                                    float f32 = f3;
                                    switch (i32) {
                                        case 0:
                                            androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
                                            return (((1 + f32) * f22) - f32) * f22 * f22;
                                        case 1:
                                            androidx.compose.animation.core.a aVar2 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.pow(f22, f32 * 2);
                                            break;
                                        case 2:
                                            androidx.compose.animation.core.a aVar3 = AnimatorResources_androidKt.f804a;
                                            float f4 = f22 - 1.0f;
                                            return ((((f32 + 1.0f) * f4) + f32) * f4 * f4) + 1.0f;
                                        case 3:
                                            androidx.compose.animation.core.a aVar4 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.sin(2 * f32 * 3.141592653589793d * f22);
                                            break;
                                        default:
                                            androidx.compose.animation.core.a aVar5 = AnimatorResources_androidKt.f804a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, 2 * f32));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
                case 1472030440:
                    if (name.equals("anticipateOvershootInterpolator")) {
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes5 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                        }
                        try {
                            return new a(new AnticipateOvershootInterpolator(typedArrayObtainAttributes.getFloat(0, 2.0f), typedArrayObtainAttributes.getFloat(1, 1.5f)));
                        } finally {
                        }
                    }
                    break;
                case 1962594083:
                    if (name.equals("decelerateInterpolator")) {
                        int[] iArr5 = AndroidVectorResources.j;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes6 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr5);
                        }
                        try {
                            final float f4 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            if (f4 == 1.0f) {
                                easing3 = AnimatorResources_androidKt.d;
                            } else {
                                final int i5 = 4;
                                easing3 = new Easing() { // from class: androidx.compose.animation.graphics.res.b
                                    @Override // androidx.compose.animation.core.Easing
                                    public final float a(float f22) {
                                        double dPow;
                                        int i32 = i5;
                                        float f32 = f4;
                                        switch (i32) {
                                            case 0:
                                                androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
                                                return (((1 + f32) * f22) - f32) * f22 * f22;
                                            case 1:
                                                androidx.compose.animation.core.a aVar2 = AnimatorResources_androidKt.f804a;
                                                dPow = Math.pow(f22, f32 * 2);
                                                break;
                                            case 2:
                                                androidx.compose.animation.core.a aVar3 = AnimatorResources_androidKt.f804a;
                                                float f42 = f22 - 1.0f;
                                                return ((((f32 + 1.0f) * f42) + f32) * f42 * f42) + 1.0f;
                                            case 3:
                                                androidx.compose.animation.core.a aVar4 = AnimatorResources_androidKt.f804a;
                                                dPow = Math.sin(2 * f32 * 3.141592653589793d * f22);
                                                break;
                                            default:
                                                androidx.compose.animation.core.a aVar5 = AnimatorResources_androidKt.f804a;
                                                return 1.0f - ((float) Math.pow(1.0f - f22, 2 * f32));
                                        }
                                        return (float) dPow;
                                    }
                                };
                            }
                            return easing3;
                        } finally {
                        }
                    }
                    break;
                case 2019672672:
                    if (name.equals("accelerateDecelerateInterpolator")) {
                        return AnimatorResources_androidKt.f804a;
                    }
                    break;
                case 2038238413:
                    if (name.equals("cycleInterpolator")) {
                        int[] iArr6 = AndroidVectorResources.k;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr6, 0, 0)) == null) {
                            TypedArray typedArrayObtainAttributes7 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr6);
                        }
                        try {
                            final float f5 = typedArrayObtainAttributes.getFloat(0, 1.0f);
                            final int i6 = 3;
                            return new Easing() { // from class: androidx.compose.animation.graphics.res.b
                                @Override // androidx.compose.animation.core.Easing
                                public final float a(float f22) {
                                    double dPow;
                                    int i32 = i6;
                                    float f32 = f5;
                                    switch (i32) {
                                        case 0:
                                            androidx.compose.animation.core.a aVar = AnimatorResources_androidKt.f804a;
                                            return (((1 + f32) * f22) - f32) * f22 * f22;
                                        case 1:
                                            androidx.compose.animation.core.a aVar2 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.pow(f22, f32 * 2);
                                            break;
                                        case 2:
                                            androidx.compose.animation.core.a aVar3 = AnimatorResources_androidKt.f804a;
                                            float f42 = f22 - 1.0f;
                                            return ((((f32 + 1.0f) * f42) + f32) * f42 * f42) + 1.0f;
                                        case 3:
                                            androidx.compose.animation.core.a aVar4 = AnimatorResources_androidKt.f804a;
                                            dPow = Math.sin(2 * f32 * 3.141592653589793d * f22);
                                            break;
                                        default:
                                            androidx.compose.animation.core.a aVar5 = AnimatorResources_androidKt.f804a;
                                            return 1.0f - ((float) Math.pow(1.0f - f22, 2 * f32));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown interpolator: " + xml.getName());
    }

    public static final Keyframe b(TypedArray typedArray, float f, Easing easing, ValueType valueType, int i) {
        int iOrdinal = valueType.ordinal();
        if (iOrdinal == 0) {
            return new Keyframe(f, Float.valueOf(typedArray.getFloat(i, BitmapDescriptorFactory.HUE_RED)), easing);
        }
        if (iOrdinal == 1) {
            return new Keyframe(f, Integer.valueOf(typedArray.getInt(i, 0)), easing);
        }
        if (iOrdinal == 2) {
            return new Keyframe(f, new Color(ColorKt.b(typedArray.getColor(i, 0))), easing);
        }
        if (iOrdinal == 3) {
            return new Keyframe(f, VectorKt.a(typedArray.getString(i)), easing);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PropertyValuesHolder1D c(TypedArray typedArray, String str, int i, int i2, int i3, Easing easing, Function2 function2) {
        int i4 = typedArray.getInt(i, 4);
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i5 = typedValuePeekValue != null ? typedValuePeekValue.type : 4;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        ValueType valueTypeD = d(i4, i5, typedValuePeekValue2 != null ? typedValuePeekValue2.type : 4);
        ArrayList arrayList = new ArrayList();
        if (valueTypeD == null && (z || z2)) {
            valueTypeD = ValueType.d;
        }
        if (z) {
            Intrinsics.e(valueTypeD);
            arrayList.add(b(typedArray, BitmapDescriptorFactory.HUE_RED, easing, valueTypeD, i2));
        }
        if (z2) {
            Intrinsics.e(valueTypeD);
            arrayList.add(b(typedArray, 1.0f, easing, valueTypeD, i3));
        }
        ValueType valueType = (ValueType) function2.invoke(valueTypeD, arrayList);
        if (arrayList.size() > 1) {
            CollectionsKt.s0(arrayList, new XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$$inlined$sortBy$1());
        }
        int iOrdinal = valueType.ordinal();
        if (iOrdinal == 0) {
            return new PropertyValuesHolderFloat(str, arrayList);
        }
        if (iOrdinal == 1) {
            return new PropertyValuesHolderInt(str);
        }
        if (iOrdinal == 2) {
            return new PropertyValuesHolderColor(str, arrayList);
        }
        if (iOrdinal == 3) {
            return new PropertyValuesHolderPath(str, arrayList);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ValueType d(int i, int... iArr) {
        if (i == 0) {
            return ValueType.d;
        }
        if (i == 1) {
            return ValueType.e;
        }
        if (i == 2) {
            return ValueType.g;
        }
        if (i == 3) {
            return ValueType.f;
        }
        for (int i2 : iArr) {
            if (28 > i2 || i2 >= 32) {
                return null;
            }
        }
        return ValueType.f;
    }

    public static final AnimatorSet e(XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        int[] iArr = AndroidVectorResources.d;
        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        try {
            int i = typedArrayObtainAttributes.getInt(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlResourceParser.next();
            while (!XmlPullParserUtils_androidKt.a(xmlResourceParser) && (xmlResourceParser.getEventType() != 3 || !Intrinsics.c(xmlResourceParser.getName(), "set"))) {
                if (xmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParser.getName();
                    if (Intrinsics.c(name, "set")) {
                        arrayList.add(e(xmlResourceParser, resources, theme, attributeSet));
                    } else if (Intrinsics.c(name, "objectAnimator")) {
                        arrayList.add(f(xmlResourceParser, resources, theme, attributeSet));
                    }
                }
                xmlResourceParser.next();
            }
            AnimatorSet animatorSet = new AnimatorSet(arrayList, i != 0 ? Ordering.e : Ordering.d);
            typedArrayObtainAttributes.recycle();
            return animatorSet;
        } catch (Throwable th) {
            typedArrayObtainAttributes.recycle();
            throw th;
        }
    }

    public static final ObjectAnimator f(final XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        TypedArray typedArrayObtainAttributes2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Easing easing;
        ArrayList arrayList;
        int i6;
        TypedArray typedArrayObtainAttributes3;
        TypedArray typedArray;
        String string;
        Function2<ValueType, List<Keyframe<Object>>, ValueType> function2;
        final Resources resources2 = resources;
        final Resources.Theme theme2 = theme;
        final AttributeSet attributeSet2 = attributeSet;
        int[] iArr = AndroidVectorResources.c;
        if (theme2 == null || (typedArrayObtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0)) == null) {
            typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, iArr);
        }
        TypedArray typedArray2 = typedArrayObtainAttributes;
        try {
            int[] iArr2 = AndroidVectorResources.g;
            if (theme2 == null || (typedArrayObtainAttributes2 = theme2.obtainStyledAttributes(attributeSet2, iArr2, 0, 0)) == null) {
                typedArrayObtainAttributes2 = resources2.obtainAttributes(attributeSet2, iArr2);
            }
            typedArray2 = typedArrayObtainAttributes2;
            try {
                Easing easingA = a(typedArray2, resources2, theme2, 0, AnimatorResources_androidKt.f804a);
                ArrayList arrayList2 = new ArrayList();
                int i7 = 1;
                String string2 = typedArray2.getString(1);
                int i8 = 3;
                if (string2 != null) {
                    String string3 = typedArray2.getString(2);
                    Intrinsics.e(string3);
                    String string4 = typedArray2.getString(3);
                    Intrinsics.e(string4);
                    arrayList2.add(new PropertyValuesHolder2D(string3, string4, VectorKt.a(string2), easingA));
                    i = 1;
                    i3 = 3;
                    i2 = 2;
                } else {
                    int i9 = 2;
                    String string5 = typedArray2.getString(0);
                    if (string5 != null) {
                        arrayList2.add(c(typedArray2, string5, 7, 5, 6, easingA, XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1.h));
                    }
                    xmlResourceParser.next();
                    while (!XmlPullParserUtils_androidKt.a(xmlResourceParser) && (xmlResourceParser.getEventType() != i8 || !Intrinsics.c(xmlResourceParser.getName(), "objectAnimator"))) {
                        if (xmlResourceParser.getEventType() == i9 && Intrinsics.c(xmlResourceParser.getName(), "propertyValuesHolder")) {
                            int[] iArr3 = AndroidVectorResources.e;
                            if (theme2 == null || (typedArrayObtainAttributes3 = theme2.obtainStyledAttributes(attributeSet2, iArr3, 0, 0)) == null) {
                                typedArrayObtainAttributes3 = resources2.obtainAttributes(attributeSet2, iArr3);
                            }
                            try {
                                string = typedArrayObtainAttributes3.getString(i8);
                                Intrinsics.e(string);
                                i4 = i7;
                                i5 = i8;
                                final Easing easing2 = easingA;
                                i6 = i9;
                                function2 = new Function2<ValueType, List<Keyframe<Object>>, ValueType>() { // from class: androidx.compose.animation.graphics.vector.compat.XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                                        TypedArray typedArrayObtainAttributes4;
                                        ValueType valueTypeD;
                                        ValueType valueType = (ValueType) obj;
                                        List list = (List) obj2;
                                        Easing easing3 = easing2;
                                        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                                        xmlResourceParser2.next();
                                        ValueType valueType2 = null;
                                        while (!XmlPullParserUtils_androidKt.a(xmlResourceParser2) && (xmlResourceParser2.getEventType() != 3 || !Intrinsics.c(xmlResourceParser2.getName(), "propertyValuesHolder"))) {
                                            if (xmlResourceParser2.getEventType() == 2 && Intrinsics.c(xmlResourceParser2.getName(), "keyframe")) {
                                                ValueType valueType3 = XmlAnimatorParser_androidKt.f823a;
                                                Resources resources3 = resources2;
                                                Resources.Theme theme3 = theme2;
                                                AttributeSet attributeSet3 = attributeSet2;
                                                int[] iArr4 = AndroidVectorResources.f;
                                                if (theme3 == null || (typedArrayObtainAttributes4 = theme3.obtainStyledAttributes(attributeSet3, iArr4, 0, 0)) == null) {
                                                    typedArrayObtainAttributes4 = resources3.obtainAttributes(attributeSet3, iArr4);
                                                }
                                                if (valueType == null) {
                                                    try {
                                                        valueTypeD = XmlAnimatorParser_androidKt.d(typedArrayObtainAttributes4.getInt(2, 4), typedArrayObtainAttributes4.peekValue(0).type);
                                                        if (valueTypeD == null) {
                                                            valueTypeD = XmlAnimatorParser_androidKt.f823a;
                                                        }
                                                    } catch (Throwable th) {
                                                        typedArrayObtainAttributes4.recycle();
                                                        throw th;
                                                    }
                                                } else {
                                                    valueTypeD = valueType;
                                                }
                                                Keyframe keyframeB = XmlAnimatorParser_androidKt.b(typedArrayObtainAttributes4, typedArrayObtainAttributes4.getFloat(3, BitmapDescriptorFactory.HUE_RED), XmlAnimatorParser_androidKt.a(typedArrayObtainAttributes4, resources3, theme3, 1, easing3), valueTypeD, 0);
                                                typedArrayObtainAttributes4.recycle();
                                                if (valueType2 == null) {
                                                    valueType2 = valueTypeD;
                                                }
                                                list.add(keyframeB);
                                            }
                                            xmlResourceParser2.next();
                                        }
                                        return valueType2 == null ? valueType == null ? XmlAnimatorParser_androidKt.f823a : valueType : valueType2;
                                    }
                                };
                                easing = easing2;
                                arrayList = arrayList2;
                                typedArray = typedArrayObtainAttributes3;
                            } catch (Throwable th) {
                                th = th;
                                typedArray = typedArrayObtainAttributes3;
                            }
                            try {
                                PropertyValuesHolder1D propertyValuesHolder1DC = c(typedArray, string, 2, 0, 1, easing, function2);
                                typedArray.recycle();
                                arrayList.add(propertyValuesHolder1DC);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray.recycle();
                                throw th;
                            }
                        } else {
                            i4 = i7;
                            i5 = i8;
                            easing = easingA;
                            arrayList = arrayList2;
                            i6 = i9;
                        }
                        xmlResourceParser.next();
                        resources2 = resources;
                        theme2 = theme;
                        attributeSet2 = attributeSet;
                        arrayList2 = arrayList;
                        i7 = i4;
                        i8 = i5;
                        i9 = i6;
                        easingA = easing;
                    }
                    i = i7;
                    i2 = i9;
                    i3 = i8;
                }
                ObjectAnimator objectAnimator = new ObjectAnimator(typedArray2.getInt(i, nlnlnnn.xxx00780078x0078), typedArray2.getInt(i2, 0), typedArray2.getInt(i3, 0), typedArray2.getInt(4, 0) == i2 ? RepeatMode.e : RepeatMode.d, arrayList2);
                typedArray2.recycle();
                typedArray2.recycle();
                return objectAnimator;
            } finally {
                typedArray2.recycle();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
