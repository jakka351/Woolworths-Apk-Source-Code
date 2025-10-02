package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;

@BindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class SearchViewBindingAdapter {

    /* renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements SearchView.OnQueryTextListener {
        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(String str) {
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: androidx.databinding.adapters.SearchViewBindingAdapter$2, reason: invalid class name */
    class AnonymousClass2 implements SearchView.OnSuggestionListener {
        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionClick(int i) {
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionSelect(int i) {
            return false;
        }
    }

    @TargetApi
    public interface OnQueryTextChange {
        boolean onQueryTextChange(String str);
    }

    @TargetApi
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi
    public interface OnSuggestionClick {
    }

    @TargetApi
    public interface OnSuggestionSelect {
    }
}
