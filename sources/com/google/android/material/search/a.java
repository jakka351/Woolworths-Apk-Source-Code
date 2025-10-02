package com.google.android.material.search;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.search.SearchView;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ SearchView e;

    public /* synthetic */ a(SearchView searchView, int i) {
        this.d = i;
        this.e = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        SearchView searchView = this.e;
        switch (i) {
            case 0:
                int i2 = SearchView.G;
                Callback.g(view);
                try {
                    if (!searchView.E.equals(SearchView.TransitionState.e) && !searchView.E.equals(SearchView.TransitionState.d)) {
                        searchView.r.j();
                    }
                    return;
                } finally {
                }
            case 1:
                int i3 = SearchView.G;
                Callback.g(view);
                try {
                    searchView.m.setText("");
                    searchView.k();
                    return;
                } finally {
                }
            default:
                int i4 = SearchView.G;
                Callback.g(view);
                try {
                    searchView.m();
                    return;
                } finally {
                }
        }
    }
}
