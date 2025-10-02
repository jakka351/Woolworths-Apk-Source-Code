package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    public static final class Helper {
        public Helper(@NonNull Context context) {
            LayoutInflater.from(context);
        }
    }

    void b();

    Resources.Theme getDropDownViewTheme();
}
