package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* loaded from: classes2.dex */
public class SeekBarPreference extends Preference {
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public SeekBar U;
    public TextView V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final SeekBar.OnSeekBarChangeListener Z;
    public final View.OnKeyListener a0;

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.Z = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (!z || (!seekBarPreference.Y && seekBarPreference.T)) {
                    int i3 = i2 + seekBarPreference.Q;
                    TextView textView = seekBarPreference.V;
                    if (textView != null) {
                        textView.setText(String.valueOf(i3));
                        return;
                    }
                    return;
                }
                int progress = seekBar.getProgress() + seekBarPreference.Q;
                if (progress != seekBarPreference.P) {
                    seekBarPreference.C(progress, false);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.T = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                int progress;
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                seekBarPreference.T = false;
                int progress2 = seekBar.getProgress();
                int i2 = seekBarPreference.Q;
                if (progress2 + i2 == seekBarPreference.P || (progress = seekBar.getProgress() + i2) == seekBarPreference.P) {
                    return;
                }
                seekBarPreference.C(progress, false);
            }
        };
        this.a0 = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.W && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.U;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i2, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.l, i, 0);
        this.Q = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i3 = this.Q;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.R) {
            this.R = i2;
            m();
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.S) {
            this.S = Math.min(this.R - this.Q, Math.abs(i4));
            m();
        }
        this.W = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.X = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(int i, boolean z) {
        int i2 = this.Q;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.R;
        if (i > i3) {
            i = i3;
        }
        if (i != this.P) {
            this.P = i;
            TextView textView = this.V;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (B()) {
                int i4 = ~i;
                boolean zB = B();
                String str = this.n;
                if (zB) {
                    i4 = this.e.b().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorA = this.e.a();
                    editorA.putInt(str, i);
                    if (!this.e.e) {
                        editorA.apply();
                    }
                }
            }
            if (z) {
                m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) {
        super.q(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.a0);
        this.U = (SeekBar) preferenceViewHolder.c(com.woolworths.R.id.seekbar);
        TextView textView = (TextView) preferenceViewHolder.c(com.woolworths.R.id.seekbar_value);
        this.V = textView;
        if (this.X) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.V = null;
        }
        SeekBar seekBar = this.U;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.Z);
        this.U.setMax(this.R - this.Q);
        int i = this.S;
        if (i != 0) {
            this.U.setKeyProgressIncrement(i);
        } else {
            this.S = this.U.getKeyProgressIncrement();
        }
        this.U.setProgress(this.P - this.Q);
        int i2 = this.P;
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.U.setEnabled(l());
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        this.P = savedState.d;
        this.Q = savedState.e;
        this.R = savedState.f;
        m();
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
        savedState.e = this.Q;
        savedState.f = this.R;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (B()) {
            iIntValue = this.e.b().getInt(this.n, iIntValue);
        }
        C(iIntValue, true);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;
        public int e;
        public int f;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$1, reason: invalid class name */
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
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
