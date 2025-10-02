package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import com.woolworths.R;

/* loaded from: classes2.dex */
public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {
    public final AppCompatBackgroundHelper d;
    public final AppCompatImageHelper e;
    public boolean f;

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f160a;
        public int b;
        public int c;
        public int d;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f160a = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.b = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.c = propertyMapper.mapObject("tint", R.attr.tint);
            this.d = propertyMapper.mapObject("tintMode", R.attr.tintMode);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) obj;
            propertyReader.readObject(this.f160a, appCompatImageButton.getBackgroundTintList());
            propertyReader.readObject(this.b, appCompatImageButton.getBackgroundTintMode());
            propertyReader.readObject(this.c, appCompatImageButton.getImageTintList());
            propertyReader.readObject(this.d, appCompatImageButton.getImageTintMode());
        }
    }

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportImageTintList() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.b) == null) {
            return null;
        }
        return tintInfo.f190a;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportImageTintMode() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.b) == null) {
            return null;
        }
        return tintInfo.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.e.f161a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null && drawable != null && !this.f) {
            appCompatImageHelper.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
            if (this.f) {
                return;
            }
            ImageView imageView = appCompatImageHelper.f161a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(appCompatImageHelper.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.e.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.a();
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.d;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    @RestrictTo
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.b == null) {
                appCompatImageHelper.b = new TintInfo();
            }
            TintInfo tintInfo = appCompatImageHelper.b;
            tintInfo.f190a = colorStateList;
            tintInfo.d = true;
            appCompatImageHelper.a();
        }
    }

    @RestrictTo
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.e;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.b == null) {
                appCompatImageHelper.b = new TintInfo();
            }
            TintInfo tintInfo = appCompatImageHelper.b;
            tintInfo.b = mode;
            tintInfo.c = true;
            appCompatImageHelper.a();
        }
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.a(context);
        this.f = false;
        ThemeUtils.a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.d = appCompatBackgroundHelper;
        appCompatBackgroundHelper.d(attributeSet, i);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.e = appCompatImageHelper;
        appCompatImageHelper.b(attributeSet, i);
    }
}
