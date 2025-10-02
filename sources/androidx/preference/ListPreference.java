package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;

/* loaded from: classes2.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] V;
    public final CharSequence[] W;
    public String X;
    public final String Y;
    public boolean Z;

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {
        public static SimpleSummaryProvider d;

        @Override // androidx.preference.Preference.SummaryProvider
        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            CharSequence[] charSequenceArr = listPreference.V;
            int iC = listPreference.C(listPreference.X);
            if (TextUtils.isEmpty((iC < 0 || charSequenceArr == null) ? null : charSequenceArr[iC])) {
                return listPreference.d.getString(com.woolworths.R.string.not_set);
            }
            int iC2 = listPreference.C(listPreference.X);
            if (iC2 < 0 || charSequenceArr == null) {
                return null;
            }
            return charSequenceArr[iC2];
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.V = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.W = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (SimpleSummaryProvider.d == null) {
                SimpleSummaryProvider.d = new SimpleSummaryProvider();
            }
            this.N = SimpleSummaryProvider.d;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.Y = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int C(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.W) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void D(String str) {
        boolean zEquals = TextUtils.equals(this.X, str);
        if (zEquals && this.Z) {
            return;
        }
        this.X = str;
        this.Z = true;
        y(str);
        if (zEquals) {
            return;
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        CharSequence[] charSequenceArr;
        Preference.SummaryProvider summaryProvider = this.N;
        if (summaryProvider != null) {
            return summaryProvider.a(this);
        }
        int iC = C(this.X);
        CharSequence charSequence = (iC < 0 || (charSequenceArr = this.V) == null) ? null : charSequenceArr[iC];
        CharSequence charSequenceF = super.f();
        String str = this.Y;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceF)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceF;
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
        D(savedState.d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.d = this.X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        D(e((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String d;

        /* renamed from: androidx.preference.ListPreference$SavedState$1, reason: invalid class name */
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

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
