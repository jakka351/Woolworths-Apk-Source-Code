package com.google.android.material.search;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchView e;

    public /* synthetic */ b(SearchView searchView, int i) {
        this.d = i;
        this.e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowInsetsControllerCompat windowInsetsControllerCompatQ;
        switch (this.d) {
            case 0:
                SearchView searchView = this.e;
                EditText editText = searchView.m;
                editText.clearFocus();
                SearchBar searchBar = searchView.w;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                ViewUtils.g(editText, searchView.C);
                break;
            case 1:
                SearchView searchView2 = this.e;
                EditText editText2 = searchView2.m;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                if (searchView2.C && (windowInsetsControllerCompatQ = ViewCompat.q(editText2)) != null) {
                    windowInsetsControllerCompatQ.g();
                    break;
                } else {
                    ((InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText2, 1);
                    break;
                }
                break;
            case 2:
                this.e.m();
                break;
            default:
                this.e.k();
                break;
        }
    }
}
