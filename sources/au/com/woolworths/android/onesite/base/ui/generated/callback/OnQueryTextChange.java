package au.com.woolworths.android.onesite.base.ui.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBindingImpl;

/* loaded from: classes3.dex */
public final class OnQueryTextChange implements au.com.woolworths.android.onesite.bindings.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final IncludeSearchableToolbarWrapperBindingImpl f4227a;

    public interface Listener {
    }

    public OnQueryTextChange(IncludeSearchableToolbarWrapperBindingImpl includeSearchableToolbarWrapperBindingImpl) {
        this.f4227a = includeSearchableToolbarWrapperBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextChange
    public final boolean onQueryTextChange(String str) {
        SearchViewBindingAdapter.OnQueryTextChange onQueryTextChange = this.f4227a.C;
        if (onQueryTextChange != null) {
            return onQueryTextChange.onQueryTextChange(str);
        }
        return false;
    }
}
