package au.com.woolworths.android.onesite.bindings;

import androidx.appcompat.widget.SearchView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchViewCompatBindingAdapterKt {
    public static final void a(SearchView view, final OnQueryTextSubmit onQueryTextSubmit, final OnQueryTextChange onQueryTextChange) {
        Intrinsics.h(view, "view");
        if (onQueryTextSubmit == null && onQueryTextChange == null) {
            view.setOnQueryTextListener(null);
        } else {
            view.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: au.com.woolworths.android.onesite.bindings.SearchViewCompatBindingAdapterKt$setOnQueryTextListener$1
                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public final boolean onQueryTextChange(String newText) {
                    Intrinsics.h(newText, "newText");
                    OnQueryTextChange onQueryTextChange2 = onQueryTextChange;
                    if (onQueryTextChange2 != null) {
                        return onQueryTextChange2.onQueryTextChange(newText);
                    }
                    return false;
                }

                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public final boolean onQueryTextSubmit(String query) {
                    Intrinsics.h(query, "query");
                    OnQueryTextSubmit onQueryTextSubmit2 = onQueryTextSubmit;
                    if (onQueryTextSubmit2 != null) {
                        return onQueryTextSubmit2.onQueryTextSubmit(query);
                    }
                    return false;
                }
            });
        }
    }
}
