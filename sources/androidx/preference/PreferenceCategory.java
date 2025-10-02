package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return !super.l();
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) {
        super.q(preferenceViewHolder);
        preferenceViewHolder.itemView.setAccessibilityHeading(true);
    }

    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(@NonNull Context context) {
        this(context, null);
    }
}
