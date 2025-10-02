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
import androidx.preference.Preference;

/* loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean P;
    public CharSequence Q;
    public CharSequence R;
    public boolean S;
    public boolean T;

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return (this.T ? this.P : !this.P) || super.A();
    }

    public final void C(boolean z) {
        boolean z2 = this.P != z;
        if (z2 || !this.S) {
            this.P = z;
            this.S = true;
            if (B()) {
                boolean z3 = !z;
                boolean zB = B();
                String str = this.n;
                if (zB) {
                    z3 = this.e.b().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorA = this.e.a();
                    editorA.putBoolean(str, z);
                    if (!this.e.e) {
                        editorA.apply();
                    }
                }
            }
            if (z2) {
                n(A());
                m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.P
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.Q
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.P
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.R
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.f()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.D(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public final void r() {
        C(!this.P);
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        savedState.d = this.P;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (B()) {
            zBooleanValue = this.e.b().getBoolean(this.n, zBooleanValue);
        }
        C(zBooleanValue);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean d;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$1, reason: invalid class name */
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
            this.d = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@NonNull Context context) {
        this(context, null);
    }
}
