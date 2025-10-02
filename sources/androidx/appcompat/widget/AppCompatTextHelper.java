package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes2.dex */
class AppCompatTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f167a;
    public TintInfo b;
    public TintInfo c;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public TintInfo g;
    public TintInfo h;
    public final AppCompatTextViewAutoSizeHelper i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f167a = textView;
        this.i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList colorStateListG;
        synchronized (appCompatDrawableManager) {
            colorStateListG = appCompatDrawableManager.f154a.g(i, context);
        }
        if (colorStateListG == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.d = true;
        tintInfo.f190a = colorStateListG;
        return tintInfo;
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, this.f167a.getDrawableState());
    }

    public final void b() {
        TintInfo tintInfo = this.b;
        TextView textView = this.f167a;
        if (tintInfo != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.f190a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.f(android.util.AttributeSet, int):void");
    }

    public final void g(int i, Context context) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.z);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f167a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        j(context, tintTypedArray);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Api26Impl.d(textView, string);
        }
        tintTypedArray.g();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new TintInfo();
        }
        TintInfo tintInfo = this.h;
        tintInfo.f190a = colorStateList;
        tintInfo.d = colorStateList != null;
        this.b = tintInfo;
        this.c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new TintInfo();
        }
        TintInfo tintInfo = this.h;
        tintInfo.b = mode;
        tintInfo.c = mode != null;
        this.b = tintInfo;
        this.c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void j(Context context, TintTypedArray tintTypedArray) {
        String string;
        int i = this.j;
        TypedArray typedArray = tintTypedArray.b;
        this.j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.k = i2;
        if (i2 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        final int i5 = this.k;
        final int i6 = this.j;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f167a);
            try {
                Typeface typefaceD = tintTypedArray.d(i4, this.j, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void d(int i7) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void e(final Typeface typeface) {
                        int i7 = i5;
                        if (i7 != -1) {
                            typeface = Api28Impl.a(typeface, i7, (i6 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        if (appCompatTextHelper.m) {
                            appCompatTextHelper.l = typeface;
                            final TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                if (!textView.isAttachedToWindow()) {
                                    textView.setTypeface(typeface, appCompatTextHelper.j);
                                } else {
                                    final int i8 = appCompatTextHelper.j;
                                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            textView.setTypeface(typeface, i8);
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                if (typefaceD != null) {
                    if (this.k != -1) {
                        this.l = Api28Impl.a(Typeface.create(typefaceD, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = typefaceD;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = Api28Impl.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.j);
        }
    }
}
