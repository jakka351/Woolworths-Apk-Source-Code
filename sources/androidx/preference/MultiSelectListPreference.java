package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] V;
    public final CharSequence[] W;
    public final HashSet X;

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.X = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.V = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.W = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(Set set) {
        HashSet hashSet = this.X;
        hashSet.clear();
        hashSet.addAll(set);
        if (B()) {
            boolean zB = B();
            String str = this.n;
            if (!set.equals(zB ? this.e.b().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editorA = this.e.a();
                editorA.putStringSet(str, set);
                if (!this.e.e) {
                    editorA.apply();
                }
            }
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        savedState.d = this.X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (B()) {
            stringSet = this.e.b().getStringSet(this.n, stringSet);
        }
        C(stringSet);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public HashSet d;

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$1, reason: invalid class name */
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
            int i = parcel.readInt();
            this.d = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.d, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d.size());
            HashSet hashSet = this.d;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(@NonNull Context context) {
        this(context, null);
    }
}
