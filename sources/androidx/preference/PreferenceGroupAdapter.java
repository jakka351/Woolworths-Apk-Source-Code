package androidx.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes2.dex */
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {
    public final PreferenceGroup g;
    public ArrayList h;
    public ArrayList i;
    public final ArrayList j;
    public final Runnable l = new Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public final void run() {
            PreferenceGroupAdapter.this.K();
        }
    };
    public final Handler k = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.preference.PreferenceGroupAdapter$2, reason: invalid class name */
    class AnonymousClass2 extends DiffUtil.Callback {
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean a(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean b(int i, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int d() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int e() {
            throw null;
        }
    }

    /* renamed from: androidx.preference.PreferenceGroupAdapter$3, reason: invalid class name */
    class AnonymousClass3 implements Preference.OnPreferenceClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PreferenceGroup f3600a;

        public AnonymousClass3(PreferenceGroup preferenceGroup) {
            this.f3600a = preferenceGroup;
        }
    }

    public static class PreferenceResourceDescriptor {

        /* renamed from: a, reason: collision with root package name */
        public final int f3601a;
        public final int b;
        public final String c;

        public PreferenceResourceDescriptor(Preference preference) {
            this.c = preference.getClass().getName();
            this.f3601a = preference.G;
            this.b = preference.H;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            return this.f3601a == preferenceResourceDescriptor.f3601a && this.b == preferenceResourceDescriptor.b && TextUtils.equals(this.c, preferenceResourceDescriptor.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((527 + this.f3601a) * 31) + this.b) * 31);
        }
    }

    public PreferenceGroupAdapter(PreferenceGroup preferenceGroup) {
        this.g = preferenceGroup;
        preferenceGroup.I = this;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            E(((PreferenceScreen) preferenceGroup).V);
        } else {
            E(true);
        }
        K();
    }

    public final ArrayList G(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.Q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference preferenceD = preferenceGroup.D(i2);
            if (preferenceD.y) {
                int i3 = preferenceGroup.U;
                if (i3 == Integer.MAX_VALUE || i < i3) {
                    arrayList.add(preferenceD);
                } else {
                    arrayList2.add(preferenceD);
                }
                if (preferenceD instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceD;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.U != Integer.MAX_VALUE && preferenceGroup2.U != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = G(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            int i4 = preferenceGroup.U;
                            if (i4 == Integer.MAX_VALUE || i < i4) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        int i5 = preferenceGroup.U;
        if (i5 == Integer.MAX_VALUE || i <= i5) {
            return arrayList;
        }
        Context context = preferenceGroup.d;
        long j = preferenceGroup.f;
        ExpandButton expandButton = new ExpandButton(context);
        expandButton.G = com.woolworths.R.layout.expand_button;
        Context context2 = expandButton.d;
        Drawable drawableB = AppCompatResources.b(com.woolworths.R.drawable.ic_arrow_down_24dp, context2);
        if (expandButton.m != drawableB) {
            expandButton.m = drawableB;
            expandButton.l = 0;
            expandButton.m();
        }
        expandButton.l = com.woolworths.R.drawable.ic_arrow_down_24dp;
        String string = context2.getString(com.woolworths.R.string.expand_button_title);
        if (!TextUtils.equals(string, expandButton.j)) {
            expandButton.j = string;
            expandButton.m();
        }
        if (999 != expandButton.i) {
            expandButton.i = 999;
            PreferenceGroupAdapter preferenceGroupAdapter = expandButton.I;
            if (preferenceGroupAdapter != null) {
                preferenceGroupAdapter.J();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        CharSequence string2 = null;
        while (it2.hasNext()) {
            Preference preference2 = (Preference) it2.next();
            CharSequence charSequence = preference2.j;
            boolean z = preference2 instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.K)) {
                if (z) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string2 = string2 == null ? charSequence : context2.getString(com.woolworths.R.string.summary_collapsed_preference_list, string2, charSequence);
            }
        }
        if (expandButton.N != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(expandButton.k, string2)) {
            expandButton.k = string2;
            expandButton.m();
        }
        expandButton.P = j + 1000000;
        expandButton.h = new AnonymousClass3(preferenceGroup);
        arrayList.add(expandButton);
        return arrayList;
    }

    public final void H(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.Q);
        }
        int size = preferenceGroup.Q.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceD = preferenceGroup.D(i);
            arrayList.add(preferenceD);
            PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(preferenceD);
            if (!this.j.contains(preferenceResourceDescriptor)) {
                this.j.add(preferenceResourceDescriptor);
            }
            if (preferenceD instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceD;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    H(arrayList, preferenceGroup2);
                }
            }
            preferenceD.I = this;
        }
    }

    public final Preference I(int i) {
        if (i < 0 || i >= this.i.size()) {
            return null;
        }
        return (Preference) this.i.get(i);
    }

    public final void J() {
        Handler handler = this.k;
        Runnable runnable = this.l;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    public final void K() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).I = null;
        }
        ArrayList arrayList = new ArrayList(this.h.size());
        this.h = arrayList;
        PreferenceGroup preferenceGroup = this.g;
        H(arrayList, preferenceGroup);
        this.i = G(preferenceGroup);
        l();
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        if (this.e) {
            return I(i).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(I(i));
        ArrayList arrayList = this.j;
        int iIndexOf = arrayList.indexOf(preferenceResourceDescriptor);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(preferenceResourceDescriptor);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        PreferenceViewHolder preferenceViewHolder = (PreferenceViewHolder) viewHolder;
        Preference preferenceI = I(i);
        ColorStateList colorStateList = preferenceViewHolder.b;
        Drawable background = preferenceViewHolder.itemView.getBackground();
        Drawable drawable = preferenceViewHolder.f3605a;
        if (background != drawable) {
            View view = preferenceViewHolder.itemView;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) preferenceViewHolder.c(android.R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceI.q(preferenceViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) this.j.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.f3606a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AppCompatResources.b(android.R.drawable.list_selector_background, viewGroup.getContext());
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(preferenceResourceDescriptor.f3601a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = preferenceResourceDescriptor.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(viewInflate);
    }
}
