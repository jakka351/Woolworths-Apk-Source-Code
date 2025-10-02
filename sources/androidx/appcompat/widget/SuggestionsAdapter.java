package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.dynatrace.android.callback.Callback;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    public static final /* synthetic */ int B = 0;
    public int A;
    public final SearchView o;
    public final SearchableInfo p;
    public final Context q;
    public final WeakHashMap r;
    public final int s;
    public int t;
    public ColorStateList u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static final class ChildViewCache {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f186a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public ChildViewCache(View view) {
            this.f186a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.e = (ImageView) view.findViewById(com.woolworths.R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        e(context, 1);
        this.m = suggestionRowLayout;
        this.l = suggestionRowLayout;
        this.n = (LayoutInflater) context.getSystemService("layout_inflater");
        this.t = 1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.o = searchView;
        this.p = searchableInfo;
        this.s = searchView.getSuggestionCommitIconResId();
        this.q = context;
        this.r = weakHashMap;
    }

    public static String l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.v = cursor.getColumnIndex("suggest_text_1");
                this.w = cursor.getColumnIndex("suggest_text_2");
                this.x = cursor.getColumnIndex("suggest_text_2_url");
                this.y = cursor.getColumnIndex("suggest_icon_1");
                this.z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.o;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor cursorK = k(this.p, string);
                if (cursorK != null) {
                    cursorK.getCount();
                    return cursorK;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String convertToString(Cursor cursor) {
        String strL;
        String strL2;
        if (cursor == null) {
            return null;
        }
        String strL3 = l(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strL3 != null) {
            return strL3;
        }
        SearchableInfo searchableInfo = this.p;
        if (searchableInfo.shouldRewriteQueryFromData() && (strL2 = l(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strL2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strL = l(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // androidx.cursoradapter.widget.CursorAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.d(android.view.View, android.database.Cursor):void");
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new ChildViewCache(viewG));
        ((ImageView) viewG.findViewById(com.woolworths.R.id.edit_query)).setImageResource(this.s);
        return viewG;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewF = f(this.q, this.f, viewGroup);
            if (viewF != null) {
                ((ChildViewCache) viewF.getTag()).f186a.setText(e.toString());
            }
            return viewF;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewG = g(this.q, this.f, viewGroup);
            ((ChildViewCache) viewG.getTag()).f186a.setText(e.toString());
            return viewG;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public final Drawable i(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.q.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(android.support.v4.media.session.a.m(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable j(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.j(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor k(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.q.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            Object tag = view.getTag();
            if (tag instanceof CharSequence) {
                this.o.p((CharSequence) tag);
            }
            Callback.h();
        } catch (Throwable th) {
            Callback.h();
            throw th;
        }
    }
}
