package androidx.preference;

/* loaded from: classes2.dex */
final class ExpandButton extends Preference {
    public long P;

    @Override // androidx.preference.Preference
    public final long d() {
        return this.P;
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) {
        super.q(preferenceViewHolder);
        preferenceViewHolder.d = false;
    }
}
