package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.woolworths.R;
import java.util.WeakHashMap;

@SuppressLint
/* loaded from: classes6.dex */
class StartCompoundLayout extends LinearLayout {
    public final TextInputLayout d;
    public final AppCompatTextView e;
    public CharSequence f;
    public final CheckableImageButton g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public int j;
    public ImageView.ScaleType k;
    public View.OnLongClickListener l;
    public boolean m;

    public StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.g = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.e = appCompatTextView;
        if (MaterialResources.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.l;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.l = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        TypedArray typedArray = tintTypedArray.b;
        if (typedArray.hasValue(69)) {
            this.h = MaterialResources.b(getContext(), tintTypedArray, 69);
        }
        if (typedArray.hasValue(70)) {
            this.i = ViewUtils.i(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(tintTypedArray.b(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.j) {
            this.j = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(68, -1));
            this.k = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(tintTypedArray.a(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.g;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return this.e.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.h;
            PorterDuff.Mode mode = this.i;
            TextInputLayout textInputLayout = this.d;
            IconHelper.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            IconHelper.c(textInputLayout, checkableImageButton, this.h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.l;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.l = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.g;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.d.g;
        if (editText == null) {
            return;
        }
        if (this.g.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
        this.e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f == null || this.m) ? 8 : 0;
        setVisibility((this.g.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.e.setVisibility(i);
        this.d.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        d();
    }
}
