package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.woolworths.R;

/* loaded from: classes2.dex */
public class AppCompatRadioButton extends RadioButton implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    public final AppCompatCompoundButtonHelper d;
    public final AppCompatBackgroundHelper e;
    public final AppCompatTextHelper f;
    public AppCompatEmojiTextHelper g;

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f165a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f165a = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.b = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.c = propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
            this.d = propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
            this.e = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) obj;
            propertyReader.readObject(this.f165a, appCompatRadioButton.getBackgroundTintList());
            propertyReader.readObject(this.b, appCompatRadioButton.getBackgroundTintMode());
            propertyReader.readObject(this.c, appCompatRadioButton.getButtonTintList());
            propertyReader.readObject(this.d, appCompatRadioButton.getButtonTintMode());
            propertyReader.readObject(this.e, appCompatRadioButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.f, appCompatRadioButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.g == null) {
            this.g = new AppCompatEmojiTextHelper(this);
        }
        return this.g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportButtonTintList() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.d;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.b;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportButtonTintMode() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.d;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.c;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f.d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.d;
        if (appCompatCompoundButtonHelper != null) {
            if (appCompatCompoundButtonHelper.f) {
                appCompatCompoundButtonHelper.f = false;
            } else {
                appCompatCompoundButtonHelper.f = true;
                appCompatCompoundButtonHelper.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().b.a(inputFilterArr));
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.d;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.b = colorStateList;
            appCompatCompoundButtonHelper.d = true;
            appCompatCompoundButtonHelper.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.d;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.c = mode;
            appCompatCompoundButtonHelper.e = true;
            appCompatCompoundButtonHelper.a();
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.f;
        appCompatTextHelper.h(colorStateList);
        appCompatTextHelper.b();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.f;
        appCompatTextHelper.i(mode);
        appCompatTextHelper.b();
    }

    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.a(context);
        ThemeUtils.a(this, getContext());
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = new AppCompatCompoundButtonHelper(this);
        this.d = appCompatCompoundButtonHelper;
        appCompatCompoundButtonHelper.b(attributeSet, i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.e = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f = appCompatTextHelper;
        appCompatTextHelper.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(AppCompatResources.b(i, getContext()));
    }
}
