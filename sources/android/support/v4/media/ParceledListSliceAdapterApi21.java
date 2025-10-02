package android.support.v4.media;

import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi
/* loaded from: classes2.dex */
class ParceledListSliceAdapterApi21 {
    static {
        try {
            Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
