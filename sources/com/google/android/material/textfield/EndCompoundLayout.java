package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

@SuppressLint
/* loaded from: classes6.dex */
class EndCompoundLayout extends LinearLayout {
    public static final /* synthetic */ int A = 0;
    public final TextInputLayout d;
    public final FrameLayout e;
    public final CheckableImageButton f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public View.OnLongClickListener i;
    public final CheckableImageButton j;
    public final EndIconDelegates k;
    public int l;
    public final LinkedHashSet m;
    public ColorStateList n;
    public PorterDuff.Mode o;
    public int p;
    public ImageView.ScaleType q;
    public View.OnLongClickListener r;
    public CharSequence s;
    public final AppCompatTextView t;
    public boolean u;
    public EditText v;
    public final AccessibilityManager w;
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener x;
    public final TextWatcher y;
    public final TextInputLayout.OnEditTextAttachedListener z;

    public static class EndIconDelegates {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f14668a = new SparseArray();
        public final EndCompoundLayout b;
        public final int c;
        public final int d;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.b = endCompoundLayout;
            TypedArray typedArray = tintTypedArray.b;
            this.c = typedArray.getResourceId(28, 0);
            this.d = typedArray.getResourceId(52, 0);
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) throws Resources.NotFoundException {
        CharSequence text;
        super(textInputLayout.getContext());
        this.l = 0;
        this.m = new LinkedHashSet();
        this.y = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.b().a();
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.b().b();
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public final void a(TextInputLayout textInputLayout2) {
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                TextWatcher textWatcher = endCompoundLayout.y;
                if (endCompoundLayout.v == textInputLayout2.getEditText()) {
                    return;
                }
                EditText editText = endCompoundLayout.v;
                if (editText != null) {
                    editText.removeTextChangedListener(textWatcher);
                    if (endCompoundLayout.v.getOnFocusChangeListener() == endCompoundLayout.b().e()) {
                        endCompoundLayout.v.setOnFocusChangeListener(null);
                    }
                }
                EditText editText2 = textInputLayout2.getEditText();
                endCompoundLayout.v = editText2;
                if (editText2 != null) {
                    editText2.addTextChangedListener(textWatcher);
                }
                endCompoundLayout.b().l(endCompoundLayout.v);
                endCompoundLayout.j(endCompoundLayout.b());
            }
        };
        this.z = onEditTextAttachedListener;
        this.w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.j = checkableImageButtonA2;
        this.k = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.t = appCompatTextView;
        TypedArray typedArray = tintTypedArray.b;
        if (typedArray.hasValue(38)) {
            this.g = MaterialResources.b(getContext(), tintTypedArray, 38);
        }
        if (typedArray.hasValue(39)) {
            this.h = ViewUtils.i(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(tintTypedArray.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.n = MaterialResources.b(getContext(), tintTypedArray, 32);
            }
            if (typedArray.hasValue(33)) {
                this.o = ViewUtils.i(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.n = MaterialResources.b(getContext(), tintTypedArray, 54);
            }
            if (typedArray.hasValue(55)) {
                this.o = ViewUtils.i(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.p) {
            this.p = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(31, -1));
            this.q = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(tintTypedArray.a(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.s = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.h0.add(onEditTextAttachedListener);
        if (textInputLayout.g != null) {
            onEditTextAttachedListener.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                int i = EndCompoundLayout.A;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManager accessibilityManager = endCompoundLayout.w;
                if (endCompoundLayout.x == null || accessibilityManager == null) {
                    return;
                }
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                if (endCompoundLayout.isAttachedToWindow()) {
                    AccessibilityManagerCompat.a(accessibilityManager, endCompoundLayout.x);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AccessibilityManager accessibilityManager;
                int i = EndCompoundLayout.A;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = endCompoundLayout.x;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = endCompoundLayout.w) == null) {
                    return;
                }
                AccessibilityManagerCompat.b(accessibilityManager, touchExplorationStateChangeListener);
            }
        });
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (MaterialResources.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final EndIconDelegate b() {
        EndIconDelegate customEndIconDelegate;
        int i = this.l;
        EndIconDelegates endIconDelegates = this.k;
        SparseArray sparseArray = endIconDelegates.f14668a;
        EndIconDelegate endIconDelegate = (EndIconDelegate) sparseArray.get(i);
        if (endIconDelegate != null) {
            return endIconDelegate;
        }
        EndCompoundLayout endCompoundLayout = endIconDelegates.b;
        if (i == -1) {
            customEndIconDelegate = new CustomEndIconDelegate(endCompoundLayout);
        } else if (i == 0) {
            customEndIconDelegate = new NoEndIconDelegate(endCompoundLayout);
        } else if (i == 1) {
            customEndIconDelegate = new PasswordToggleEndIconDelegate(endCompoundLayout, endIconDelegates.d);
        } else if (i == 2) {
            customEndIconDelegate = new ClearTextEndIconDelegate(endCompoundLayout);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(YU.a.d(i, "Invalid end icon mode: "));
            }
            customEndIconDelegate = new DropdownMenuEndIconDelegate(endCompoundLayout);
        }
        sparseArray.append(i, customEndIconDelegate);
        return customEndIconDelegate;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.j;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return this.t.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.e.getVisibility() == 0 && this.j.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        EndIconDelegate endIconDelegateB = b();
        boolean zJ = endIconDelegateB.j();
        CheckableImageButton checkableImageButton = this.j;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.g) == endIconDelegateB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(endIconDelegateB instanceof DropdownMenuEndIconDelegate) || (zIsActivated = checkableImageButton.isActivated()) == ((DropdownMenuEndIconDelegate) endIconDelegateB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            IconHelper.c(this.d, checkableImageButton, this.n);
        }
    }

    public final void g(int i) throws Resources.NotFoundException {
        if (this.l == i) {
            return;
        }
        EndIconDelegate endIconDelegateB = b();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.x;
        AccessibilityManager accessibilityManager = this.w;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.b(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.x = null;
        endIconDelegateB.r();
        this.l = i;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).a();
        }
        h(i != 0);
        EndIconDelegate endIconDelegateB2 = b();
        int iD = this.k.c;
        if (iD == 0) {
            iD = endIconDelegateB2.d();
        }
        Drawable drawableB = iD != 0 ? AppCompatResources.b(iD, getContext()) : null;
        CheckableImageButton checkableImageButton = this.j;
        checkableImageButton.setImageDrawable(drawableB);
        TextInputLayout textInputLayout = this.d;
        if (drawableB != null) {
            IconHelper.a(textInputLayout, checkableImageButton, this.n, this.o);
            IconHelper.c(textInputLayout, checkableImageButton, this.n);
        }
        int iC = endIconDelegateB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(endIconDelegateB2.j());
        if (!endIconDelegateB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        endIconDelegateB2.q();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = endIconDelegateB2.h();
        this.x = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (isAttachedToWindow()) {
                AccessibilityManagerCompat.a(accessibilityManager, this.x);
            }
        }
        View.OnClickListener onClickListenerF = endIconDelegateB2.f();
        View.OnLongClickListener onLongClickListener = this.r;
        checkableImageButton.setOnClickListener(onClickListenerF);
        IconHelper.d(checkableImageButton, onLongClickListener);
        EditText editText = this.v;
        if (editText != null) {
            endIconDelegateB2.l(editText);
            j(endIconDelegateB2);
        }
        IconHelper.a(textInputLayout, checkableImageButton, this.n, this.o);
        f(true);
    }

    public final void h(boolean z) throws Resources.NotFoundException {
        if (d() != z) {
            this.j.setVisibility(z ? 0 : 8);
            k();
            m();
            this.d.q();
        }
    }

    public final void i(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        IconHelper.a(this.d, checkableImageButton, this.g, this.h);
    }

    public final void j(EndIconDelegate endIconDelegate) {
        if (this.v == null) {
            return;
        }
        if (endIconDelegate.e() != null) {
            this.v.setOnFocusChangeListener(endIconDelegate.e());
        }
        if (endIconDelegate.g() != null) {
            this.j.setOnFocusChangeListener(endIconDelegate.g());
        }
    }

    public final void k() {
        this.e.setVisibility((this.j.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.s == null || this.u) ? 8 : false)) ? 0 : 8);
    }

    public final void l() throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.m.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.l != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() throws Resources.NotFoundException {
        int paddingEnd;
        TextInputLayout textInputLayout = this.d;
        if (textInputLayout.g == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.g;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.g.getPaddingTop();
        int paddingBottom = textInputLayout.g.getPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.f2488a;
        this.t.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.t;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.s == null || this.u) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.d.q();
    }
}
