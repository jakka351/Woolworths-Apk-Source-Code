package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean V;

    @RestrictTo
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.V = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.preference.PreferenceManager$OnNavigateToScreenListener, java.lang.Object] */
    @Override // androidx.preference.Preference
    public final void r() {
        ?? r0;
        if (this.o != null || this.p != null || this.Q.size() == 0 || (r0 = this.e.j) == 0) {
            return;
        }
        r0.l0(this);
    }
}
