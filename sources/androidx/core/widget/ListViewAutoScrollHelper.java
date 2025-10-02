package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes2.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    public final ListView u;

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.u = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public final boolean c(int i) {
        ListView listView = this.u;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public final void h(int i) {
        this.u.scrollListBy(i);
    }
}
