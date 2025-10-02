package com.woolworths.scanlibrary.ui.productsearch.adapter;

import android.content.Context;
import android.database.Cursor;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.cursoradapter.widget.CursorAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/adapter/SuggestionCursorAdapter;", "Landroidx/cursoradapter/widget/CursorAdapter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionCursorAdapter extends CursorAdapter {
    public final SearchActivity l;
    public String m;

    public SuggestionCursorAdapter(SearchActivity searchActivity) {
        e(searchActivity, 0);
        this.l = searchActivity;
        this.m = "";
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        Intrinsics.h(view, "view");
        Intrinsics.h(cursor, "cursor");
        View viewFindViewById = view.findViewById(R.id.search_auto_complete_text);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("suggest_text_1"));
        Intrinsics.g(string, "getString(...)");
        String queryText = this.m;
        Intrinsics.h(queryText, "queryText");
        StyleSpan styleSpan = new StyleSpan(1);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.l.getColor(R.color.sng_color_accent));
        SpannableString spannableString = new SpannableString(string);
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        String lowerCase2 = queryText.toLowerCase(locale);
        Intrinsics.g(lowerCase2, "toLowerCase(...)");
        int iC = StringsKt.C(lowerCase, lowerCase2, 0, false, 6);
        if (iC >= 0) {
            spannableString.setSpan(foregroundColorSpan, iC, queryText.length() + iC, 33);
            spannableString.setSpan(styleSpan, iC, queryText.length() + iC, 33);
        }
        textView.setText(spannableString);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_auto_suggest_search_result, viewGroup, false);
        Intrinsics.g(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
