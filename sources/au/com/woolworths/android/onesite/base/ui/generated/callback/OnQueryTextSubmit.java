package au.com.woolworths.android.onesite.base.ui.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBindingImpl;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit implements au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final IncludeSearchableToolbarWrapperBindingImpl f4228a;

    public interface Listener {
    }

    public OnQueryTextSubmit(IncludeSearchableToolbarWrapperBindingImpl includeSearchableToolbarWrapperBindingImpl) {
        this.f4228a = includeSearchableToolbarWrapperBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String str) {
        SearchViewBindingAdapter.OnQueryTextSubmit onQueryTextSubmit = this.f4228a.D;
        if (onQueryTextSubmit != null) {
            return onQueryTextSubmit.onQueryTextSubmit(str);
        }
        return false;
    }
}
