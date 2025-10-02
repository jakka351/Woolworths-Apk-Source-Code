package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import au.com.woolworths.feature.product.list.legacy.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.CutoutDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] F0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public Fade A;
    public boolean A0;
    public ColorStateList B;
    public ValueAnimator B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public MaterialShapeDrawable I;
    public MaterialShapeDrawable J;
    public StateListDrawable K;
    public boolean L;
    public MaterialShapeDrawable M;
    public MaterialShapeDrawable N;
    public ShapeAppearanceModel O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public final Rect b0;
    public final Rect c0;
    public final FrameLayout d;
    public final RectF d0;
    public final StartCompoundLayout e;
    public Typeface e0;
    public final EndCompoundLayout f;
    public ColorDrawable f0;
    public EditText g;
    public int g0;
    public CharSequence h;
    public final LinkedHashSet h0;
    public int i;
    public ColorDrawable i0;
    public int j;
    public int j0;
    public int k;
    public Drawable k0;
    public int l;
    public ColorStateList l0;
    public final IndicatorViewController m;
    public ColorStateList m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public boolean p;
    public int p0;
    public LengthCounter q;
    public ColorStateList q0;
    public AppCompatTextView r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public CharSequence u;
    public int u0;
    public boolean v;
    public int v0;
    public AppCompatTextView w;
    public int w0;
    public ColorStateList x;
    public boolean x0;
    public int y;
    public final CollapsingTextHelper y0;
    public Fade z;
    public boolean z0;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final TextInputLayout d;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.x0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            StartCompoundLayout startCompoundLayout = textInputLayout.e;
            AppCompatTextView appCompatTextView = startCompoundLayout.e;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(startCompoundLayout.g);
            }
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.s(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.s(string);
                if (!z && placeholderText != null) {
                    accessibilityNodeInfoCompat.s(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.s(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setHintText(string);
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.m.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f.b().m(accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.d.f.b().n(accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int d(Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void a(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public CharSequence f;
        public boolean g;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.g;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.I;
        }
        int iB = MaterialColors.b(com.woolworths.R.attr.colorControlHighlight, this.g);
        int i = this.R;
        int[][] iArr = F0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.I;
            int i2 = this.a0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.g(0.1f, iB, i2), i2}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.I;
        int iD = MaterialColors.d(context, com.woolworths.R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.d.f14634a);
        int iG = MaterialColors.g(0.1f, iB, iD);
        materialShapeDrawable3.m(new ColorStateList(iArr, new int[]{iG, 0}));
        materialShapeDrawable3.setTint(iD);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iG, iD});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.d.f14634a);
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], f(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.J == null) {
            this.J = f(true);
        }
        return this.J;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.g = editText;
        int i = this.i;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.k);
        }
        int i2 = this.j;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.l);
        }
        this.L = false;
        i();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface = this.g.getTypeface();
        CollapsingTextHelper collapsingTextHelper = this.y0;
        boolean zM = collapsingTextHelper.m(typeface);
        boolean zO = collapsingTextHelper.o(typeface);
        if (zM || zO) {
            collapsingTextHelper.i(false);
        }
        float textSize = this.g.getTextSize();
        if (collapsingTextHelper.l != textSize) {
            collapsingTextHelper.l = textSize;
            collapsingTextHelper.i(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.g.getLetterSpacing();
        if (collapsingTextHelper.g0 != letterSpacing) {
            collapsingTextHelper.g0 = letterSpacing;
            collapsingTextHelper.i(false);
        }
        int gravity = this.g.getGravity();
        collapsingTextHelper.l((gravity & (-113)) | 48);
        if (collapsingTextHelper.j != gravity) {
            collapsingTextHelper.j = gravity;
            collapsingTextHelper.i(false);
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        this.w0 = editText.getMinimumHeight();
        this.g.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            public int d;
            public final /* synthetic */ EditText e;

            {
                this.e = editText;
                this.d = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.u(!textInputLayout.D0, false);
                if (textInputLayout.n) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.v) {
                    textInputLayout.v(editable);
                }
                EditText editText2 = this.e;
                int lineCount = editText2.getLineCount();
                int i4 = this.d;
                if (lineCount != i4) {
                    if (lineCount < i4) {
                        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                        int minimumHeight = editText2.getMinimumHeight();
                        int i5 = textInputLayout.w0;
                        if (minimumHeight != i5) {
                            editText2.setMinimumHeight(i5);
                        }
                    }
                    this.d = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        if (this.l0 == null) {
            this.l0 = this.g.getHintTextColors();
        }
        if (this.F) {
            if (TextUtils.isEmpty(this.G)) {
                CharSequence hint = this.g.getHint();
                this.h = hint;
                setHint(hint);
                this.g.setHint((CharSequence) null);
            }
            this.H = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.r != null) {
            n(this.g.getText());
        }
        r();
        this.m.b();
        this.e.bringToFront();
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.bringToFront();
        Iterator it = this.h0.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).a(this);
        }
        endCompoundLayout.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.G)) {
            return;
        }
        this.G = charSequence;
        CollapsingTextHelper collapsingTextHelper = this.y0;
        if (charSequence == null || !TextUtils.equals(collapsingTextHelper.G, charSequence)) {
            collapsingTextHelper.G = charSequence;
            collapsingTextHelper.H = null;
            Bitmap bitmap = collapsingTextHelper.K;
            if (bitmap != null) {
                bitmap.recycle();
                collapsingTextHelper.K = null;
            }
            collapsingTextHelper.i(false);
        }
        if (this.x0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.v == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.w;
            if (appCompatTextView != null) {
                this.d.addView(appCompatTextView);
                this.w.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.w;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.w = null;
        }
        this.v = z;
    }

    public final void a(float f) {
        CollapsingTextHelper collapsingTextHelper = this.y0;
        if (collapsingTextHelper.b == f) {
            return;
        }
        if (this.B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B0 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.d(getContext(), com.woolworths.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.b));
            this.B0.setDuration(MotionUtils.c(getContext(), com.woolworths.R.attr.motionDurationMedium4, 167));
            this.B0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.y0.p(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.B0.setFloatValues(collapsingTextHelper.b, f);
        this.B0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        MaterialShapeDrawable materialShapeDrawable = this.I;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.d.f14634a;
        ShapeAppearanceModel shapeAppearanceModel2 = this.O;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (this.R == 2 && (i = this.T) > -1 && (i2 = this.W) != 0) {
            MaterialShapeDrawable materialShapeDrawable2 = this.I;
            materialShapeDrawable2.t(i);
            materialShapeDrawable2.s(ColorStateList.valueOf(i2));
        }
        int iC = this.a0;
        if (this.R == 1) {
            iC = ColorUtils.c(this.a0, MaterialColors.c(getContext(), com.woolworths.R.attr.colorSurface, 0));
        }
        this.a0 = iC;
        this.I.m(ColorStateList.valueOf(iC));
        MaterialShapeDrawable materialShapeDrawable3 = this.M;
        if (materialShapeDrawable3 != null && this.N != null) {
            if (this.T > -1 && this.W != 0) {
                materialShapeDrawable3.m(this.g.isFocused() ? ColorStateList.valueOf(this.n0) : ColorStateList.valueOf(this.W));
                this.N.m(ColorStateList.valueOf(this.W));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fE;
        if (!this.F) {
            return 0;
        }
        int i = this.R;
        CollapsingTextHelper collapsingTextHelper = this.y0;
        if (i == 0) {
            fE = collapsingTextHelper.e();
        } else {
            if (i != 2) {
                return 0;
            }
            fE = collapsingTextHelper.e() / 2.0f;
        }
        return (int) fE;
    }

    public final Fade d() {
        Fade fade = new Fade();
        fade.f = MotionUtils.c(getContext(), com.woolworths.R.attr.motionDurationShort2, 87);
        fade.g = MotionUtils.d(getContext(), com.woolworths.R.attr.motionEasingLinearInterpolator, AnimationUtils.f14504a);
        return fade;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.h != null) {
            boolean z = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.g.setHint(this.h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.g.setHint(hint);
                this.H = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.F;
        CollapsingTextHelper collapsingTextHelper = this.y0;
        if (z) {
            collapsingTextHelper.d(canvas);
        }
        if (this.N == null || (materialShapeDrawable = this.M) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.g.isFocused()) {
            Rect bounds = this.N.getBounds();
            Rect bounds2 = this.M.getBounds();
            float f = collapsingTextHelper.b;
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.c(f, iCenterX, bounds2.left);
            bounds.right = AnimationUtils.c(f, iCenterX, bounds2.right);
            this.N.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.C0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.C0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.google.android.material.internal.CollapsingTextHelper r3 = r4.y0
            if (r3 == 0) goto L2f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.i(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.g
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = androidx.core.view.ViewCompat.f2488a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.C0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof CutoutDrawable);
    }

    public final MaterialShapeDrawable f(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : BitmapDescriptorFactory.HUE_RED;
        EditText editText = this.g;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.woolworths.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.e(f);
        builder.f(f);
        builder.c(dimensionPixelOffset);
        builder.d(dimensionPixelOffset);
        ShapeAppearanceModel shapeAppearanceModelA = builder.a();
        EditText editText2 = this.g;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = MaterialShapeDrawable.A;
            dropDownBackgroundTintList = ColorStateList.valueOf(MaterialColors.d(context, com.woolworths.R.attr.colorSurface, "MaterialShapeDrawable"));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.k(context);
        materialShapeDrawable.m(dropDownBackgroundTintList);
        materialShapeDrawable.l(popupElevation);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.d;
        if (materialShapeDrawableState.g == null) {
            materialShapeDrawableState.g = new Rect();
        }
        materialShapeDrawable.d.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final int g(int i, boolean z) {
        int iC;
        if (!z && getPrefixText() != null) {
            iC = this.e.a();
        } else {
            if (!z || getSuffixText() == null) {
                return this.g.getCompoundPaddingLeft() + i;
            }
            iC = this.f.c();
        }
        return i + iC;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.g;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.R;
        if (i == 1 || i == 2) {
            return this.I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.a0;
    }

    public int getBoxBackgroundMode() {
        return this.R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zH = ViewUtils.h(this);
        RectF rectF = this.d0;
        return zH ? this.O.h.a(rectF) : this.O.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zH = ViewUtils.h(this);
        RectF rectF = this.d0;
        return zH ? this.O.g.a(rectF) : this.O.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zH = ViewUtils.h(this);
        RectF rectF = this.d0;
        return zH ? this.O.e.a(rectF) : this.O.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zH = ViewUtils.h(this);
        RectF rectF = this.d0;
        return zH ? this.O.f.a(rectF) : this.O.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.p0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.q0;
    }

    public int getBoxStrokeWidth() {
        return this.U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.o;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.n && this.p && (appCompatTextView = this.r) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.C;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    @Nullable
    @RequiresApi
    public ColorStateList getCursorColor() {
        return this.D;
    }

    @Nullable
    @RequiresApi
    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.l0;
    }

    @Nullable
    public EditText getEditText() {
        return this.g;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f.j.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f.j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f.p;
    }

    public int getEndIconMode() {
        return this.f.l;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f.q;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f.j;
    }

    @Nullable
    public CharSequence getError() {
        IndicatorViewController indicatorViewController = this.m;
        if (indicatorViewController.q) {
            return indicatorViewController.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.m.t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.m.s;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.m.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f.f.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        IndicatorViewController indicatorViewController = this.m;
        if (indicatorViewController.x) {
            return indicatorViewController.w;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.m.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.y0.e();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        CollapsingTextHelper collapsingTextHelper = this.y0;
        return collapsingTextHelper.f(collapsingTextHelper.o);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.m0;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.q;
    }

    public int getMaxEms() {
        return this.j;
    }

    @Px
    public int getMaxWidth() {
        return this.l;
    }

    public int getMinEms() {
        return this.i;
    }

    @Px
    public int getMinWidth() {
        return this.k;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f.j.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f.j.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.v) {
            return this.u;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.y;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.x;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.e.f;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.e.e.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.e.e;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.O;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.e.g.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.e.g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.e.j;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.e.k;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f.s;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f.t.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f.t;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.e0;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.g.getCompoundPaddingRight() : this.e.a() : this.f.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i = this.R;
        if (i == 0) {
            this.I = null;
            this.M = null;
            this.N = null;
        } else if (i == 1) {
            this.I = new MaterialShapeDrawable(this.O);
            this.M = new MaterialShapeDrawable();
            this.N = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(YU.a.m(new StringBuilder(), this.R, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.F || (this.I instanceof CutoutDrawable)) {
                this.I = new MaterialShapeDrawable(this.O);
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.O;
                int i2 = CutoutDrawable.C;
                if (shapeAppearanceModel == null) {
                    shapeAppearanceModel = new ShapeAppearanceModel();
                }
                CutoutDrawable.CutoutDrawableState cutoutDrawableState = new CutoutDrawable.CutoutDrawableState(shapeAppearanceModel, new RectF());
                CutoutDrawable.ImplApi18 implApi18 = new CutoutDrawable.ImplApi18(cutoutDrawableState);
                implApi18.B = cutoutDrawableState;
                this.I = implApi18;
            }
            this.M = null;
            this.N = null;
        }
        s();
        x();
        if (this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.S = getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.e(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.g != null && this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.g;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_filled_edittext_font_2_0_padding_top), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.e(getContext())) {
                EditText editText2 = this.g;
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_filled_edittext_font_1_3_padding_top), this.g.getPaddingEnd(), getResources().getDimensionPixelSize(com.woolworths.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.R != 0) {
            t();
        }
        EditText editText3 = this.g;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.R;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132083358);
        appCompatTextView.setTextColor(getContext().getColor(com.woolworths.R.color.design_error));
    }

    public final boolean m() {
        IndicatorViewController indicatorViewController = this.m;
        return (indicatorViewController.o != 1 || indicatorViewController.r == null || TextUtils.isEmpty(indicatorViewController.p)) ? false : true;
    }

    public final void n(Editable editable) throws Resources.NotFoundException {
        int iD = this.q.d(editable);
        boolean z = this.p;
        int i = this.o;
        if (i == -1) {
            this.r.setText(String.valueOf(iD));
            this.r.setContentDescription(null);
            this.p = false;
        } else {
            this.p = iD > i;
            Context context = getContext();
            this.r.setContentDescription(context.getString(this.p ? com.woolworths.R.string.character_counter_overflowed_content_description : com.woolworths.R.string.character_counter_content_description, Integer.valueOf(iD), Integer.valueOf(this.o)));
            if (z != this.p) {
                o();
            }
            BidiFormatter bidiFormatterC = BidiFormatter.c();
            AppCompatTextView appCompatTextView = this.r;
            String string = getContext().getString(com.woolworths.R.string.character_counter_pattern, Integer.valueOf(iD), Integer.valueOf(this.o));
            bidiFormatterC.getClass();
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f2459a;
            appCompatTextView.setText(string != null ? bidiFormatterC.d(string).toString() : null);
        }
        if (this.g == null || z == this.p) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.r;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.p ? this.s : this.t);
            if (!this.p && (colorStateList2 = this.B) != null) {
                this.r.setTextColor(colorStateList2);
            }
            if (!this.p || (colorStateList = this.C) == null) {
                return;
            }
            this.r.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y0.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.E0 = false;
        if (this.g != null && this.g.getMeasuredHeight() < (iMax = Math.max(endCompoundLayout.getMeasuredHeight(), this.e.getMeasuredHeight()))) {
            this.g.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.g.post(new d(this, 2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.g;
        if (editText != null) {
            Rect rect = this.b0;
            DescendantOffsetUtils.a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.M;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.U, rect.right, i5);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.N;
            if (materialShapeDrawable2 != null) {
                int i6 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i6 - this.V, rect.right, i6);
            }
            if (this.F) {
                float textSize = this.g.getTextSize();
                CollapsingTextHelper collapsingTextHelper = this.y0;
                if (collapsingTextHelper.l != textSize) {
                    collapsingTextHelper.l = textSize;
                    collapsingTextHelper.i(false);
                }
                int gravity = this.g.getGravity();
                collapsingTextHelper.l((gravity & (-113)) | 48);
                if (collapsingTextHelper.j != gravity) {
                    collapsingTextHelper.j = gravity;
                    collapsingTextHelper.i(false);
                }
                if (this.g == null) {
                    throw new IllegalStateException();
                }
                boolean zH = ViewUtils.h(this);
                int i7 = rect.bottom;
                Rect rect2 = this.c0;
                rect2.bottom = i7;
                int i8 = this.R;
                if (i8 == 1) {
                    rect2.left = g(rect.left, zH);
                    rect2.top = rect.top + this.S;
                    rect2.right = h(rect.right, zH);
                } else if (i8 != 2) {
                    rect2.left = g(rect.left, zH);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zH);
                } else {
                    rect2.left = this.g.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.g.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = collapsingTextHelper.h;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != i11 || rect3.bottom != i12) {
                    rect3.set(i9, i10, i11, i12);
                    collapsingTextHelper.S = true;
                }
                if (this.g == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = collapsingTextHelper.U;
                textPaint.setTextSize(collapsingTextHelper.l);
                textPaint.setTypeface(collapsingTextHelper.z);
                textPaint.setLetterSpacing(collapsingTextHelper.g0);
                float f = -textPaint.ascent();
                rect2.left = this.g.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.R != 1 || this.g.getMinLines() > 1) ? rect.top + this.g.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.g.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.R != 1 || this.g.getMinLines() > 1) ? rect.bottom - this.g.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = collapsingTextHelper.g;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    collapsingTextHelper.S = true;
                }
                collapsingTextHelper.i(false);
                if (!e() || this.x0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.E0;
        EndCompoundLayout endCompoundLayout = this.f;
        if (!z) {
            endCompoundLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if (this.w != null && (editText = this.g) != null) {
            this.w.setGravity(editText.getGravity());
            this.w.setPadding(this.g.getCompoundPaddingLeft(), this.g.getCompoundPaddingTop(), this.g.getCompoundPaddingRight(), this.g.getCompoundPaddingBottom());
        }
        endCompoundLayout.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setError(savedState.f);
        if (savedState.g) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public final void run() {
                    CheckableImageButton checkableImageButton = TextInputLayout.this.f.j;
                    checkableImageButton.performClick();
                    checkableImageButton.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.P) {
            CornerSize cornerSize = this.O.e;
            RectF rectF = this.d0;
            float fA = cornerSize.a(rectF);
            float fA2 = this.O.f.a(rectF);
            float fA3 = this.O.h.a(rectF);
            float fA4 = this.O.g.a(rectF);
            ShapeAppearanceModel shapeAppearanceModel = this.O;
            CornerTreatment cornerTreatment = shapeAppearanceModel.f14636a;
            CornerTreatment cornerTreatment2 = shapeAppearanceModel.b;
            CornerTreatment cornerTreatment3 = shapeAppearanceModel.d;
            CornerTreatment cornerTreatment4 = shapeAppearanceModel.c;
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.f14637a = cornerTreatment2;
            builder.b = cornerTreatment;
            builder.d = cornerTreatment4;
            builder.c = cornerTreatment3;
            builder.e(fA2);
            builder.f(fA);
            builder.c(fA4);
            builder.d(fA3);
            ShapeAppearanceModel shapeAppearanceModelA = builder.a();
            this.P = z;
            setShapeAppearanceModel(shapeAppearanceModelA);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f = getError();
        }
        EndCompoundLayout endCompoundLayout = this.f;
        savedState.g = endCompoundLayout.l != 0 && endCompoundLayout.j.g;
        return savedState;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListE = this.D;
        if (colorStateListE == null) {
            colorStateListE = MaterialColors.e(com.woolworths.R.attr.colorControlActivated, getContext());
        }
        EditText editText = this.g;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.g.getTextCursorDrawable().mutate();
        if ((m() || (this.r != null && this.p)) && (colorStateList = this.E) != null) {
            colorStateListE = colorStateList;
        }
        drawableMutate.setTintList(colorStateListE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.g;
        if (editText == null || this.R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = DrawableUtils.f173a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.p && (appCompatTextView = this.r) != null) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.g.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.g;
        if (editText == null || this.I == null) {
            return;
        }
        if ((this.L || editText.getBackground() == null) && this.R != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.g;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            editText2.setBackground(editTextBoxBackground);
            this.L = true;
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.a0 != i) {
            this.a0 = i;
            this.r0 = i;
            this.t0 = i;
            this.u0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.r0 = defaultColor;
        this.a0 = defaultColor;
        this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.R) {
            return;
        }
        this.R = i;
        if (this.g != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.S = i;
    }

    public void setBoxCornerFamily(int i) {
        ShapeAppearanceModel.Builder builderG = this.O.g();
        CornerSize cornerSize = this.O.e;
        builderG.f14637a = MaterialShapeUtils.a(i);
        builderG.e = cornerSize;
        CornerSize cornerSize2 = this.O.f;
        builderG.b = MaterialShapeUtils.a(i);
        builderG.f = cornerSize2;
        CornerSize cornerSize3 = this.O.h;
        builderG.d = MaterialShapeUtils.a(i);
        builderG.h = cornerSize3;
        CornerSize cornerSize4 = this.O.g;
        builderG.c = MaterialShapeUtils.a(i);
        builderG.g = cornerSize4;
        this.O = builderG.a();
        b();
    }

    public void setBoxStrokeColor(@ColorInt int i) throws Resources.NotFoundException {
        if (this.p0 != i) {
            this.p0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.n0 = colorStateList.getDefaultColor();
            this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.p0 != colorStateList.getDefaultColor()) {
            this.p0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.q0 != colorStateList) {
            this.q0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.U = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.V = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.n != z) {
            IndicatorViewController indicatorViewController = this.m;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.r = appCompatTextView;
                appCompatTextView.setId(com.woolworths.R.id.textinput_counter);
                Typeface typeface = this.e0;
                if (typeface != null) {
                    this.r.setTypeface(typeface);
                }
                this.r.setMaxLines(1);
                indicatorViewController.a(this.r, 2);
                ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.r != null) {
                    EditText editText = this.g;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                indicatorViewController.g(this.r, 2);
                this.r = null;
            }
            this.n = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.o != i) {
            if (i > 0) {
                this.o = i;
            } else {
                this.o = -1;
            }
            if (!this.n || this.r == null) {
                return;
            }
            EditText editText = this.g;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.s != i) {
            this.s = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.t != i) {
            this.t = i;
            o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o();
        }
    }

    @RequiresApi
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            p();
        }
    }

    @RequiresApi
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (m() || (this.r != null && this.p)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.m0 = colorStateList;
        if (this.g != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f.j.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f.j.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        EndCompoundLayout endCompoundLayout = this.f;
        CharSequence text = i != 0 ? endCompoundLayout.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        EndCompoundLayout endCompoundLayout = this.f;
        Drawable drawableB = i != 0 ? AppCompatResources.b(i, endCompoundLayout.getContext()) : null;
        TextInputLayout textInputLayout = endCompoundLayout.d;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        checkableImageButton.setImageDrawable(drawableB);
        if (drawableB != null) {
            IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.n, endCompoundLayout.o);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.n);
        }
    }

    public void setEndIconMinSize(@IntRange int i) {
        EndCompoundLayout endCompoundLayout = this.f;
        if (i < 0) {
            endCompoundLayout.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != endCompoundLayout.p) {
            endCompoundLayout.p = i;
            CheckableImageButton checkableImageButton = endCompoundLayout.j;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = endCompoundLayout.f;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) throws Resources.NotFoundException {
        this.f.g(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.r;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.r = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.q = scaleType;
        endCompoundLayout.j.setScaleType(scaleType);
        endCompoundLayout.f.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f;
        if (endCompoundLayout.n != colorStateList) {
            endCompoundLayout.n = colorStateList;
            IconHelper.a(endCompoundLayout.d, endCompoundLayout.j, colorStateList, endCompoundLayout.o);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f;
        if (endCompoundLayout.o != mode) {
            endCompoundLayout.o = mode;
            IconHelper.a(endCompoundLayout.d, endCompoundLayout.j, endCompoundLayout.n, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f.h(z);
    }

    public void setError(@Nullable CharSequence charSequence) throws Resources.NotFoundException {
        IndicatorViewController indicatorViewController = this.m;
        if (!indicatorViewController.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            indicatorViewController.f();
            return;
        }
        indicatorViewController.c();
        indicatorViewController.p = charSequence;
        indicatorViewController.r.setText(charSequence);
        int i = indicatorViewController.n;
        if (i != 1) {
            indicatorViewController.o = 1;
        }
        indicatorViewController.i(i, indicatorViewController.o, indicatorViewController.h(indicatorViewController.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.t = i;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.s = charSequence;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        IndicatorViewController indicatorViewController = this.m;
        TextInputLayout textInputLayout = indicatorViewController.h;
        if (indicatorViewController.q == z) {
            return;
        }
        indicatorViewController.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.g);
            indicatorViewController.r = appCompatTextView;
            appCompatTextView.setId(com.woolworths.R.id.textinput_error);
            indicatorViewController.r.setTextAlignment(5);
            Typeface typeface = indicatorViewController.B;
            if (typeface != null) {
                indicatorViewController.r.setTypeface(typeface);
            }
            int i = indicatorViewController.u;
            indicatorViewController.u = i;
            AppCompatTextView appCompatTextView2 = indicatorViewController.r;
            if (appCompatTextView2 != null) {
                indicatorViewController.h.l(appCompatTextView2, i);
            }
            ColorStateList colorStateList = indicatorViewController.v;
            indicatorViewController.v = colorStateList;
            AppCompatTextView appCompatTextView3 = indicatorViewController.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.s;
            indicatorViewController.s = charSequence;
            AppCompatTextView appCompatTextView4 = indicatorViewController.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = indicatorViewController.t;
            indicatorViewController.t = i2;
            AppCompatTextView appCompatTextView5 = indicatorViewController.r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            indicatorViewController.r.setVisibility(4);
            indicatorViewController.a(indicatorViewController.r, 0);
        } else {
            indicatorViewController.f();
            indicatorViewController.g(indicatorViewController.r, 0);
            indicatorViewController.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        indicatorViewController.q = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) throws Resources.NotFoundException {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.i(i != 0 ? AppCompatResources.b(i, endCompoundLayout.getContext()) : null);
        IconHelper.c(endCompoundLayout.d, endCompoundLayout.f, endCompoundLayout.g);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f;
        CheckableImageButton checkableImageButton = endCompoundLayout.f;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.i;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.i = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f;
        if (endCompoundLayout.g != colorStateList) {
            endCompoundLayout.g = colorStateList;
            IconHelper.a(endCompoundLayout.d, endCompoundLayout.f, colorStateList, endCompoundLayout.h);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f;
        if (endCompoundLayout.h != mode) {
            endCompoundLayout.h = mode;
            IconHelper.a(endCompoundLayout.d, endCompoundLayout.f, endCompoundLayout.g, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.u = i;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView != null) {
            indicatorViewController.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.v = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        IndicatorViewController indicatorViewController = this.m;
        if (zIsEmpty) {
            if (indicatorViewController.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!indicatorViewController.x) {
            setHelperTextEnabled(true);
        }
        indicatorViewController.c();
        indicatorViewController.w = charSequence;
        indicatorViewController.y.setText(charSequence);
        int i = indicatorViewController.n;
        if (i != 2) {
            indicatorViewController.o = 2;
        }
        indicatorViewController.i(i, indicatorViewController.o, indicatorViewController.h(indicatorViewController.y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.A = colorStateList;
        AppCompatTextView appCompatTextView = indicatorViewController.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        final IndicatorViewController indicatorViewController = this.m;
        TextInputLayout textInputLayout = indicatorViewController.h;
        if (indicatorViewController.x == z) {
            return;
        }
        indicatorViewController.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.g);
            indicatorViewController.y = appCompatTextView;
            appCompatTextView.setId(com.woolworths.R.id.textinput_helper_text);
            indicatorViewController.y.setTextAlignment(5);
            Typeface typeface = indicatorViewController.B;
            if (typeface != null) {
                indicatorViewController.y.setTypeface(typeface);
            }
            indicatorViewController.y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = indicatorViewController.y;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = indicatorViewController.z;
            indicatorViewController.z = i;
            AppCompatTextView appCompatTextView3 = indicatorViewController.y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = indicatorViewController.A;
            indicatorViewController.A = colorStateList;
            AppCompatTextView appCompatTextView4 = indicatorViewController.y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            indicatorViewController.a(indicatorViewController.y, 1);
            indicatorViewController.y.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.h.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            indicatorViewController.c();
            int i2 = indicatorViewController.n;
            if (i2 == 2) {
                indicatorViewController.o = 0;
            }
            indicatorViewController.i(i2, indicatorViewController.o, indicatorViewController.h(indicatorViewController.y, ""));
            indicatorViewController.g(indicatorViewController.y, 1);
            indicatorViewController.y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        indicatorViewController.x = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        IndicatorViewController indicatorViewController = this.m;
        indicatorViewController.z = i;
        AppCompatTextView appCompatTextView = indicatorViewController.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.F) {
            this.F = z;
            if (z) {
                CharSequence hint = this.g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.g.setHint((CharSequence) null);
                }
                this.H = true;
            } else {
                this.H = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.g.getHint())) {
                    this.g.setHint(this.G);
                }
                setHintInternal(null);
            }
            if (this.g != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        CollapsingTextHelper collapsingTextHelper = this.y0;
        collapsingTextHelper.k(i);
        this.m0 = collapsingTextHelper.o;
        if (this.g != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.m0 != colorStateList) {
            if (this.l0 == null) {
                CollapsingTextHelper collapsingTextHelper = this.y0;
                if (collapsingTextHelper.o != colorStateList) {
                    collapsingTextHelper.o = colorStateList;
                    collapsingTextHelper.i(false);
                }
            }
            this.m0 = colorStateList;
            if (this.g != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.q = lengthCounter;
    }

    public void setMaxEms(int i) {
        this.j = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.l = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.i = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.k = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.j.setContentDescription(i != 0 ? endCompoundLayout.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.j.setImageDrawable(i != 0 ? AppCompatResources.b(i, endCompoundLayout.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) throws Resources.NotFoundException {
        EndCompoundLayout endCompoundLayout = this.f;
        if (z && endCompoundLayout.l != 1) {
            endCompoundLayout.g(1);
        } else if (z) {
            endCompoundLayout.getClass();
        } else {
            endCompoundLayout.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.n = colorStateList;
        IconHelper.a(endCompoundLayout.d, endCompoundLayout.j, colorStateList, endCompoundLayout.o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.o = mode;
        IconHelper.a(endCompoundLayout.d, endCompoundLayout.j, endCompoundLayout.n, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.w == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.w = appCompatTextView;
            appCompatTextView.setId(com.woolworths.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.w;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            appCompatTextView2.setImportantForAccessibility(2);
            Fade fadeD = d();
            this.z = fadeD;
            fadeD.e = 67L;
            this.A = d();
            setPlaceholderTextAppearance(this.y);
            setPlaceholderTextColor(this.x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.v) {
                setPlaceholderTextEnabled(true);
            }
            this.u = charSequence;
        }
        EditText editText = this.g;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.y = i;
        AppCompatTextView appCompatTextView = this.w;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            AppCompatTextView appCompatTextView = this.w;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.e;
        startCompoundLayout.getClass();
        startCompoundLayout.f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        startCompoundLayout.e.setText(charSequence);
        startCompoundLayout.e();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        this.e.e.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.e.e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.I;
        if (materialShapeDrawable == null || materialShapeDrawable.d.f14634a == shapeAppearanceModel) {
            return;
        }
        this.O = shapeAppearanceModel;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.e.g.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.b(i, getContext()) : null);
    }

    public void setStartIconMinSize(@IntRange int i) {
        StartCompoundLayout startCompoundLayout = this.e;
        if (i < 0) {
            startCompoundLayout.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != startCompoundLayout.j) {
            startCompoundLayout.j = i;
            CheckableImageButton checkableImageButton = startCompoundLayout.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.e;
        CheckableImageButton checkableImageButton = startCompoundLayout.g;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.l;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.e;
        startCompoundLayout.l = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.e;
        startCompoundLayout.k = scaleType;
        startCompoundLayout.g.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.e;
        if (startCompoundLayout.h != colorStateList) {
            startCompoundLayout.h = colorStateList;
            IconHelper.a(startCompoundLayout.d, startCompoundLayout.g, colorStateList, startCompoundLayout.i);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.e;
        if (startCompoundLayout.i != mode) {
            startCompoundLayout.i = mode;
            IconHelper.a(startCompoundLayout.d, startCompoundLayout.g, startCompoundLayout.h, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.e.c(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.f;
        endCompoundLayout.getClass();
        endCompoundLayout.s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        endCompoundLayout.t.setText(charSequence);
        endCompoundLayout.n();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.f.t.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f.t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.g;
        if (editText != null) {
            ViewCompat.A(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.e0) {
            this.e0 = typeface;
            CollapsingTextHelper collapsingTextHelper = this.y0;
            boolean zM = collapsingTextHelper.m(typeface);
            boolean zO = collapsingTextHelper.o(typeface);
            if (zM || zO) {
                collapsingTextHelper.i(false);
            }
            IndicatorViewController indicatorViewController = this.m;
            if (typeface != indicatorViewController.B) {
                indicatorViewController.B = typeface;
                AppCompatTextView appCompatTextView = indicatorViewController.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = indicatorViewController.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.g;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.l0;
        CollapsingTextHelper collapsingTextHelper = this.y0;
        if (colorStateList2 != null) {
            collapsingTextHelper.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.l0;
            collapsingTextHelper.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.v0) : this.v0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.m.r;
            collapsingTextHelper.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.p && (appCompatTextView = this.r) != null) {
            collapsingTextHelper.j(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.m0) != null && collapsingTextHelper.o != colorStateList) {
            collapsingTextHelper.o = colorStateList;
            collapsingTextHelper.i(false);
        }
        EndCompoundLayout endCompoundLayout = this.f;
        StartCompoundLayout startCompoundLayout = this.e;
        if (z3 || !this.z0 || (isEnabled() && z4)) {
            if (z2 || this.x0) {
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B0.cancel();
                }
                if (z && this.A0) {
                    a(1.0f);
                } else {
                    collapsingTextHelper.p(1.0f);
                }
                this.x0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.g;
                v(editText3 != null ? editText3.getText() : null);
                startCompoundLayout.m = false;
                startCompoundLayout.e();
                endCompoundLayout.u = false;
                endCompoundLayout.n();
                return;
            }
            return;
        }
        if (z2 || !this.x0) {
            ValueAnimator valueAnimator2 = this.B0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B0.cancel();
            }
            if (z && this.A0) {
                a(BitmapDescriptorFactory.HUE_RED);
            } else {
                collapsingTextHelper.p(BitmapDescriptorFactory.HUE_RED);
            }
            if (e() && !((CutoutDrawable) this.I).B.s.isEmpty() && e()) {
                ((CutoutDrawable) this.I).x(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.x0 = true;
            AppCompatTextView appCompatTextView3 = this.w;
            if (appCompatTextView3 != null && this.v) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.a(this.d, this.A);
                this.w.setVisibility(4);
            }
            startCompoundLayout.m = true;
            startCompoundLayout.e();
            endCompoundLayout.u = true;
            endCompoundLayout.n();
        }
    }

    public final void v(Editable editable) {
        int iD = this.q.d(editable);
        FrameLayout frameLayout = this.d;
        if (iD != 0 || this.x0) {
            AppCompatTextView appCompatTextView = this.w;
            if (appCompatTextView == null || !this.v) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.a(frameLayout, this.A);
            this.w.setVisibility(4);
            return;
        }
        if (this.w == null || !this.v || TextUtils.isEmpty(this.u)) {
            return;
        }
        this.w.setText(this.u);
        TransitionManager.a(frameLayout, this.z);
        this.w.setVisibility(0);
        this.w.bringToFront();
        announceForAccessibility(this.u);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.q0.getDefaultColor();
        int colorForState = this.q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.W = colorForState2;
        } else if (z2) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.I == null || this.R == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.g) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.g) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.W = this.v0;
        } else if (m()) {
            if (this.q0 != null) {
                w(z2, z);
            } else {
                this.W = getErrorCurrentTextColors();
            }
        } else if (!this.p || (appCompatTextView = this.r) == null) {
            if (z2) {
                this.W = this.p0;
            } else if (z) {
                this.W = this.o0;
            } else {
                this.W = this.n0;
            }
        } else if (this.q0 != null) {
            w(z2, z);
        } else {
            this.W = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        EndCompoundLayout endCompoundLayout = this.f;
        TextInputLayout textInputLayout = endCompoundLayout.d;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        TextInputLayout textInputLayout2 = endCompoundLayout.d;
        endCompoundLayout.l();
        IconHelper.c(textInputLayout2, endCompoundLayout.f, endCompoundLayout.g);
        IconHelper.c(textInputLayout2, checkableImageButton, endCompoundLayout.n);
        if (endCompoundLayout.b() instanceof DropdownMenuEndIconDelegate) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.n, endCompoundLayout.o);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.e;
        IconHelper.c(startCompoundLayout.d, startCompoundLayout.g, startCompoundLayout.h);
        if (this.R == 2) {
            int i = this.T;
            if (z2 && isEnabled()) {
                this.T = this.V;
            } else {
                this.T = this.U;
            }
            if (this.T != i && e() && !this.x0) {
                if (e()) {
                    ((CutoutDrawable) this.I).x(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                j();
            }
        }
        if (this.R == 1) {
            if (!isEnabled()) {
                this.a0 = this.s0;
            } else if (z && !z2) {
                this.a0 = this.u0;
            } else if (z2) {
                this.a0 = this.t0;
            } else {
                this.a0 = this.r0;
            }
        }
        b();
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.e.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.e.b(drawable);
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132083888), attributeSet, i);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = new IndicatorViewController(this);
        this.q = new k(29);
        this.b0 = new Rect();
        this.c0 = new Rect();
        this.d0 = new RectF();
        this.h0 = new LinkedHashSet();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.y0 = collapsingTextHelper;
        this.E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AnimationUtils.f14504a;
        collapsingTextHelper.W = linearInterpolator;
        collapsingTextHelper.i(false);
        collapsingTextHelper.V = linearInterpolator;
        collapsingTextHelper.i(false);
        collapsingTextHelper.l(8388659);
        TintTypedArray tintTypedArrayE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.i0, i, 2132083888, 22, 20, 40, 45, 49);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, tintTypedArrayE);
        this.e = startCompoundLayout;
        TypedArray typedArray = tintTypedArrayE.b;
        this.F = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.A0 = typedArray.getBoolean(47, true);
        this.z0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.O = ShapeAppearanceModel.d(context2, attributeSet, i, 2132083888).a();
        this.Q = context2.getResources().getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.S = typedArray.getDimensionPixelOffset(9, 0);
        this.U = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.V = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.T = this.U;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        ShapeAppearanceModel.Builder builderG = this.O.g();
        if (dimension >= BitmapDescriptorFactory.HUE_RED) {
            builderG.e(dimension);
        }
        if (dimension2 >= BitmapDescriptorFactory.HUE_RED) {
            builderG.f(dimension2);
        }
        if (dimension3 >= BitmapDescriptorFactory.HUE_RED) {
            builderG.d(dimension3);
        }
        if (dimension4 >= BitmapDescriptorFactory.HUE_RED) {
            builderG.c(dimension4);
        }
        this.O = builderG.a();
        ColorStateList colorStateListB = MaterialResources.b(context2, tintTypedArrayE, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.r0 = defaultColor;
            this.a0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.s0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.t0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.u0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.t0 = this.r0;
                ColorStateList colorStateListB2 = ResourcesCompat.b(com.woolworths.R.color.mtrl_filled_background_color, context2.getTheme(), context2.getResources());
                this.s0 = colorStateListB2.getColorForState(new int[]{-16842910}, -1);
                this.u0 = colorStateListB2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.a0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 0;
            this.u0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListA = tintTypedArrayE.a(1);
            this.m0 = colorStateListA;
            this.l0 = colorStateListA;
        }
        ColorStateList colorStateListB3 = MaterialResources.b(context2, tintTypedArrayE, 14);
        this.p0 = typedArray.getColor(14, 0);
        this.n0 = context2.getColor(com.woolworths.R.color.mtrl_textinput_default_box_stroke_color);
        this.v0 = context2.getColor(com.woolworths.R.color.mtrl_textinput_disabled_color);
        this.o0 = context2.getColor(com.woolworths.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB3 != null) {
            setBoxStrokeColorStateList(colorStateListB3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(MaterialResources.b(context2, tintTypedArrayE, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.D = tintTypedArrayE.a(24);
        this.E = tintTypedArrayE.a(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i2 = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.t = typedArray.getResourceId(22, 0);
        this.s = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(tintTypedArrayE.a(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(tintTypedArrayE.a(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(tintTypedArrayE.a(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(tintTypedArrayE.a(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(tintTypedArrayE.a(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(tintTypedArrayE.a(58));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, tintTypedArrayE);
        this.f = endCompoundLayout;
        boolean z4 = typedArray.getBoolean(0, true);
        tintTypedArrayE.g();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(2);
        ViewCompat.G(this, 1);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f.j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f.j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f.i(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f.j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.f;
        TextInputLayout textInputLayout = endCompoundLayout.d;
        CheckableImageButton checkableImageButton = endCompoundLayout.j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.a(textInputLayout, checkableImageButton, endCompoundLayout.n, endCompoundLayout.o);
            IconHelper.c(textInputLayout, checkableImageButton, endCompoundLayout.n);
        }
    }
}
