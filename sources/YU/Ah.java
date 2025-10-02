package YU;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Ah {

    /* renamed from: a, reason: collision with root package name */
    public static int f2a = 3992;

    public static ArrayList a(View view) {
        int i;
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        arrayList2.add(view);
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(a(viewGroup.getChildAt(i2)));
            arrayList2.addAll(arrayList3);
            i2++;
            if (f2a <= 3991) {
                do {
                    i = f2a;
                } while (i + 39 != 30);
                while (true) {
                    f2a = ((f2a ^ 4091) + i) ^ 2562;
                }
            }
        }
        return arrayList2;
    }
}
