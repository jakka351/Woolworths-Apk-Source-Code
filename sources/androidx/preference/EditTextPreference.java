package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;

/* loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {
    public String V;

    public interface OnBindEditTextListener {
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {
        public static SimpleSummaryProvider d;

        @Override // androidx.preference.Preference.SummaryProvider
        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.V) ? editTextPreference.d.getString(com.woolworths.R.string.not_set) : editTextPreference.V;
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.d, i, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (SimpleSummaryProvider.d == null) {
                SimpleSummaryProvider.d = new SimpleSummaryProvider();
            }
            this.N = SimpleSummaryProvider.d;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return TextUtils.isEmpty(this.V) || super.A();
    }

    public final void C(String str) {
        boolean zA = A();
        this.V = str;
        y(str);
        boolean zA2 = A();
        if (zA2 != zA) {
            n(zA2);
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        C(savedState.d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.d = this.V;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        C(e((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String d;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.d = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
