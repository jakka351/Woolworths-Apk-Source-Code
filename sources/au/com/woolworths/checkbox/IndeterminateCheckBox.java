package au.com.woolworths.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.state.ToggleableState;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.color.MaterialColors;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002!\"B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lau/com/woolworths/checkbox/IndeterminateCheckBox;", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "Lau/com/woolworths/checkbox/IndeterminateCheckable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/ColorStateList;", "getMaterialThemeColorsTintList", "()Landroid/content/res/ColorStateList;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "checked", "", "setChecked", "(Z)V", "Lau/com/woolworths/checkbox/IndeterminateCheckBox$OnStateChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnStateChangedListener", "(Lau/com/woolworths/checkbox/IndeterminateCheckBox$OnStateChangedListener;)V", "Landroidx/compose/ui/state/ToggleableState;", "value", "H", "Landroidx/compose/ui/state/ToggleableState;", "getCheckBoxState", "()Landroidx/compose/ui/state/ToggleableState;", "setCheckBoxState", "(Landroidx/compose/ui/state/ToggleableState;)V", "checkBoxState", "OnStateChangedListener", "Companion", "indeterminate-checkbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IndeterminateCheckBox extends MaterialCheckBox implements IndeterminateCheckable {
    public static final int[] J = {com.woolworths.R.attr.state_indeterminate};
    public static final int[][] K = {new int[]{android.R.attr.state_enabled, com.woolworths.R.attr.state_indeterminate}, new int[]{-16842910, com.woolworths.R.attr.state_indeterminate}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean F;
    public boolean G;

    /* renamed from: H, reason: from kotlin metadata */
    public ToggleableState checkBoxState;
    public OnStateChangedListener I;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/checkbox/IndeterminateCheckBox$Companion;", "", "", "INDETERMINATE_STATE_SET", "[I", "", "ENABLED_CHECKED_STATES", "[[I", "indeterminate-checkbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/checkbox/IndeterminateCheckBox$OnStateChangedListener;", "", "indeterminate-checkbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnStateChangedListener {
        void a(ToggleableState toggleableState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndeterminateCheckBox(@NotNull Context context) {
        this(context, null);
        Intrinsics.h(context, "context");
    }

    private final ColorStateList getMaterialThemeColorsTintList() {
        int iB = MaterialColors.b(com.woolworths.R.attr.colorControlActivated, this);
        int iB2 = MaterialColors.b(com.woolworths.R.attr.colorSurface, this);
        int iB3 = MaterialColors.b(com.woolworths.R.attr.colorOnSurface, this);
        return new ColorStateList(K, new int[]{MaterialColors.g(1.0f, iB2, iB), MaterialColors.g(0.38f, iB2, iB3), MaterialColors.g(1.0f, iB2, iB), MaterialColors.g(0.54f, iB2, iB3), MaterialColors.g(0.38f, iB2, iB3), MaterialColors.g(0.38f, iB2, iB3)});
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "IndeterminateCheckBox";
    }

    @NotNull
    public ToggleableState getCheckBoxState() {
        return this.checkBoxState;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getCheckBoxState() == ToggleableState.f) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ToggleableState toggleableState;
        IndeterminateCheckboxSavedState indeterminateCheckboxSavedState = parcelable instanceof IndeterminateCheckboxSavedState ? (IndeterminateCheckboxSavedState) parcelable : null;
        this.F = false;
        super.onRestoreInstanceState(indeterminateCheckboxSavedState != null ? indeterminateCheckboxSavedState.d : null);
        this.F = true;
        if (indeterminateCheckboxSavedState == null || (toggleableState = indeterminateCheckboxSavedState.e) == null) {
            toggleableState = ToggleableState.e;
        }
        setCheckBoxState(toggleableState);
        if (getCheckBoxState() == ToggleableState.e || !this.F) {
            return;
        }
        this.F = false;
        OnStateChangedListener onStateChangedListener = this.I;
        if (onStateChangedListener != null) {
            onStateChangedListener.a(getCheckBoxState());
        }
        this.F = true;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new IndeterminateCheckboxSavedState(super.onSaveInstanceState(), getCheckBoxState());
    }

    public void setCheckBoxState(@NotNull ToggleableState value) {
        Intrinsics.h(value, "value");
        ToggleableState checkBoxState = getCheckBoxState();
        this.checkBoxState = value;
        if (this.G) {
            return;
        }
        this.G = true;
        if (value != ToggleableState.f) {
            setChecked(value == ToggleableState.d);
        }
        this.G = false;
        refreshDrawableState();
        if (checkBoxState == value || !this.F) {
            return;
        }
        this.F = false;
        OnStateChangedListener onStateChangedListener = this.I;
        if (onStateChangedListener != null) {
            onStateChangedListener.a(getCheckBoxState());
        }
        this.F = true;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        setCheckBoxState(checked ? ToggleableState.d : ToggleableState.e);
        super.setChecked(checked);
    }

    public final void setOnStateChangedListener(@Nullable OnStateChangedListener listener) {
        this.I = listener;
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (getCheckBoxState() == ToggleableState.f) {
            setChecked(false);
        } else {
            super.toggle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndeterminateCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        this.F = true;
        this.checkBoxState = ToggleableState.e;
        setButtonTintList(getMaterialThemeColorsTintList());
        Drawable drawable = context.getDrawable(com.woolworths.R.drawable.ic_checkmark);
        Intrinsics.e(drawable);
        setButtonDrawable(drawable);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4705a);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            setCheckBoxState(ToggleableState.f);
        }
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
        ViewCompat.A(this, new AccessibilityDelegateCompat() { // from class: au.com.woolworths.checkbox.IndeterminateCheckBox.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View host, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Intrinsics.h(host, "host");
                this.f2466a.onInitializeAccessibilityNodeInfo(host, accessibilityNodeInfoCompat.f2508a);
                accessibilityNodeInfoCompat.r(IndeterminateCheckBox.this.getCheckBoxState() == ToggleableState.f ? "Partially selected" : accessibilityNodeInfoCompat.g());
            }
        });
    }
}
