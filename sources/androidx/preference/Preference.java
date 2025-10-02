package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.preference.PreferenceGroupAdapter;
import com.dynatrace.android.callback.Callback;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public int G;
    public final int H;
    public PreferenceGroupAdapter I;
    public ArrayList J;
    public PreferenceGroup K;
    public boolean L;
    public OnPreferenceCopyListener M;
    public SummaryProvider N;
    public final View.OnClickListener O;
    public final Context d;
    public PreferenceManager e;
    public long f;
    public boolean g;
    public OnPreferenceClickListener h;
    public int i;
    public CharSequence j;
    public CharSequence k;
    public int l;
    public Drawable m;
    public final String n;
    public Intent o;
    public final String p;
    public Bundle q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final boolean z;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new AnonymousClass1();

        /* renamed from: androidx.preference.Preference$BaseSavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<BaseSavedState> {
            @Override // android.os.Parcelable.Creator
            public final BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    public interface OnPreferenceChangeInternalListener {
    }

    public interface OnPreferenceChangeListener {
    }

    public interface OnPreferenceClickListener {
    }

    public static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        public final Preference d;

        public OnPreferenceCopyListener(Preference preference) {
            this.d = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.d;
            CharSequence charSequenceF = preference.f();
            if (!preference.E || TextUtils.isEmpty(charSequenceF)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceF);
            contextMenu.add(0, 0, 0, com.woolworths.R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.d;
            Callback.n(menuItem);
            try {
                ClipboardManager clipboardManager = (ClipboardManager) preference.d.getSystemService("clipboard");
                CharSequence charSequenceF = preference.f();
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceF));
                Context context = preference.d;
                Toast.makeText(context, context.getString(com.woolworths.R.string.preference_copied, charSequenceF), 0).show();
                return true;
            } finally {
                Callback.o();
            }
        }
    }

    public interface SummaryProvider<T extends Preference> {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = Integer.MAX_VALUE;
        this.r = true;
        this.s = true;
        this.t = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.C = true;
        this.F = true;
        this.G = com.woolworths.R.layout.preference;
        this.O = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    Preference.this.x(view);
                } finally {
                    Callback.h();
                }
            }
        };
        this.d = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g, i, 0);
        this.l = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.n = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.j = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.k = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.i = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.p = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.G = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, com.woolworths.R.layout.preference));
        this.H = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.r = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.s = z;
        this.t = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.u = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.z = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.A = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.v = t(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.v = t(typedArrayObtainStyledAttributes, 11);
        }
        this.F = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.B = zHasValue;
        if (zHasValue) {
            this.C = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.y = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.E = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void z(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                z(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public boolean A() {
        return !l();
    }

    public final boolean B() {
        return (this.e == null || !this.t || TextUtils.isEmpty(this.n)) ? false : true;
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        String str = this.n;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.L = false;
        u(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void b(Bundle bundle) {
        String str = this.n;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.L = false;
        Parcelable parcelableV = v();
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableV != null) {
            bundle.putParcelable(str, parcelableV);
        }
    }

    public final Bundle c() {
        if (this.q == null) {
            this.q = new Bundle();
        }
        return this.q;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.i;
        int i2 = preference2.i;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.j;
        CharSequence charSequence2 = preference2.j;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.j.toString());
    }

    public long d() {
        return this.f;
    }

    public final String e(String str) {
        return !B() ? str : this.e.b().getString(this.n, str);
    }

    public CharSequence f() {
        SummaryProvider summaryProvider = this.N;
        return summaryProvider != null ? summaryProvider.a(this) : this.k;
    }

    public boolean l() {
        return this.r && this.w && this.x;
    }

    public void m() {
        int iIndexOf;
        PreferenceGroupAdapter preferenceGroupAdapter = this.I;
        if (preferenceGroupAdapter == null || (iIndexOf = preferenceGroupAdapter.i.indexOf(this)) == -1) {
            return;
        }
        preferenceGroupAdapter.n(iIndexOf, this);
    }

    public void n(boolean z) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.w == z) {
                preference.w = !z;
                preference.n(preference.A());
                preference.m();
            }
        }
    }

    public void o() {
        PreferenceScreen preferenceScreen;
        String str = this.u;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager preferenceManager = this.e;
        Preference preferenceC = null;
        if (preferenceManager != null && (preferenceScreen = preferenceManager.g) != null) {
            preferenceC = preferenceScreen.C(str);
        }
        if (preferenceC == null) {
            StringBuilder sbU = YU.a.u("Dependency \"", str, "\" not found for preference \"");
            sbU.append(this.n);
            sbU.append("\" (title: \"");
            sbU.append((Object) this.j);
            sbU.append("\"");
            throw new IllegalStateException(sbU.toString());
        }
        if (preferenceC.J == null) {
            preferenceC.J = new ArrayList();
        }
        preferenceC.J.add(this);
        boolean zA = preferenceC.A();
        if (this.w == zA) {
            this.w = !zA;
            n(A());
            m();
        }
    }

    public final void p(PreferenceManager preferenceManager) {
        long j;
        this.e = preferenceManager;
        if (!this.g) {
            synchronized (preferenceManager) {
                j = preferenceManager.b;
                preferenceManager.b = 1 + j;
            }
            this.f = j;
        }
        if (B()) {
            PreferenceManager preferenceManager2 = this.e;
            if ((preferenceManager2 != null ? preferenceManager2.b() : null).contains(this.n)) {
                w(null);
                return;
            }
        }
        Object obj = this.v;
        if (obj != null) {
            w(obj);
        }
    }

    public void q(PreferenceViewHolder preferenceViewHolder) {
        Integer numValueOf;
        View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.O);
        view.setId(0);
        TextView textView = (TextView) preferenceViewHolder.c(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceF = f();
            if (TextUtils.isEmpty(charSequenceF)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceF);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) preferenceViewHolder.c(android.R.id.title);
        boolean z = this.s;
        if (textView2 != null) {
            CharSequence charSequence = this.j;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.B) {
                    textView2.setSingleLine(this.C);
                }
                if (!z && l() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.c(android.R.id.icon);
        boolean z2 = this.D;
        if (imageView != null) {
            int i = this.l;
            if (i != 0 || this.m != null) {
                if (this.m == null) {
                    this.m = AppCompatResources.b(i, this.d);
                }
                Drawable drawable = this.m;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.m != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewC = preferenceViewHolder.c(com.woolworths.R.id.icon_frame);
        if (viewC == null) {
            viewC = preferenceViewHolder.c(android.R.id.icon_frame);
        }
        if (viewC != null) {
            if (this.m != null) {
                viewC.setVisibility(0);
            } else {
                viewC.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.F) {
            z(view, l());
        } else {
            z(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        preferenceViewHolder.d = this.z;
        preferenceViewHolder.e = this.A;
        boolean z3 = this.E;
        if (z3 && this.M == null) {
            this.M = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.M : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        view.setBackground(null);
    }

    public void r() {
    }

    public void s() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.u;
        if (str != null) {
            PreferenceManager preferenceManager = this.e;
            Preference preferenceC = null;
            if (preferenceManager != null && (preferenceScreen = preferenceManager.g) != null) {
                preferenceC = preferenceScreen.C(str);
            }
            if (preferenceC == null || (arrayList = preferenceC.J) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object t(TypedArray typedArray, int i) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.j;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceF = f();
        if (!TextUtils.isEmpty(charSequenceF)) {
            sb.append(charSequenceF);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void u(Parcelable parcelable) {
        this.L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable v() {
        this.L = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void w(Object obj) {
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.preference.PreferenceManager$OnPreferenceTreeClickListener, java.lang.Object] */
    public void x(View view) {
        Intent intent;
        ?? r3;
        if (l() && this.s) {
            r();
            OnPreferenceClickListener onPreferenceClickListener = this.h;
            if (onPreferenceClickListener != null) {
                PreferenceGroupAdapter.AnonymousClass3 anonymousClass3 = (PreferenceGroupAdapter.AnonymousClass3) onPreferenceClickListener;
                anonymousClass3.f3600a.U = Integer.MAX_VALUE;
                PreferenceGroupAdapter.this.J();
                return;
            }
            PreferenceManager preferenceManager = this.e;
            if ((preferenceManager == null || (r3 = preferenceManager.h) == 0 || !r3.Y(this)) && (intent = this.o) != null) {
                this.d.startActivity(intent);
            }
        }
    }

    public final void y(String str) {
        if (B() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorA = this.e.a();
            editorA.putString(this.n, str);
            if (this.e.e) {
                return;
            }
            editorA.apply();
        }
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
