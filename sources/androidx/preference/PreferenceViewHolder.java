package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3605a;
    public final ColorStateList b;
    public final SparseArray c;
    public boolean d;
    public boolean e;

    public PreferenceViewHolder(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.c = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.woolworths.R.id.icon_frame, view.findViewById(com.woolworths.R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.f3605a = view.getBackground();
        if (textView != null) {
            this.b = textView.getTextColors();
        }
    }

    public final View c(int i) {
        SparseArray sparseArray = this.c;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
