package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo
/* loaded from: classes.dex */
public class TintTypedArray {

    /* renamed from: a, reason: collision with root package name */
    public final Context f191a;
    public final TypedArray b;
    public TypedValue c;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @DoNotInline
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static int b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f191a = context;
        this.b = typedArray;
    }

    public static TintTypedArray e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static TintTypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListA;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA = AppCompatResources.a(resourceId, this.f191a)) == null) ? typedArray.getColorStateList(i) : colorStateListA;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AppCompatResources.b(resourceId, this.f191a);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableE;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.f191a;
        synchronized (appCompatDrawableManagerA) {
            drawableE = appCompatDrawableManagerA.f154a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public final Typeface d(int i, int i2, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal threadLocal = ResourcesCompat.f2423a;
        Context context = this.f191a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.f(context, resourceId, typedValue, i2, fontCallback, true, false);
    }

    public final void g() {
        this.b.recycle();
    }
}
