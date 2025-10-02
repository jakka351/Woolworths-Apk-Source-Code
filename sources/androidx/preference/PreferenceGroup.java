package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.preference.Preference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {
    public final SimpleArrayMap P;
    public final ArrayList Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;

    /* renamed from: androidx.preference.PreferenceGroup$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                throw null;
            }
        }
    }

    @RestrictTo
    public interface OnExpandButtonClickListener {
    }

    public interface PreferencePositionCallback {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.P = new SimpleArrayMap(0);
        new Handler(Looper.getMainLooper());
        this.R = true;
        this.S = 0;
        this.T = false;
        this.U = Integer.MAX_VALUE;
        this.Q = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j, i, 0);
        this.R = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.n)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.U = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference C(CharSequence charSequence) {
        Preference preferenceC;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.n, charSequence)) {
            return this;
        }
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceD = D(i);
            if (TextUtils.equals(preferenceD.n, charSequence)) {
                return preferenceD;
            }
            if ((preferenceD instanceof PreferenceGroup) && (preferenceC = ((PreferenceGroup) preferenceD).C(charSequence)) != null) {
                return preferenceC;
            }
        }
        return null;
    }

    public final Preference D(int i) {
        return (Preference) this.Q.get(i);
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            D(i).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            D(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(boolean z) {
        super.n(z);
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceD = D(i);
            if (preferenceD.x == z) {
                preferenceD.x = !z;
                preferenceD.n(preferenceD.A());
                preferenceD.m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        super.o();
        this.T = true;
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            D(i).o();
        }
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        this.T = false;
        int size = this.Q.size();
        for (int i = 0; i < size; i++) {
            D(i).s();
        }
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.U = savedState.d;
        super.u(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new SavedState(this.U);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int d;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$1, reason: invalid class name */
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
            this.d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
        }

        public SavedState(int i) {
            super(AbsSavedState.EMPTY_STATE);
            this.d = i;
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
