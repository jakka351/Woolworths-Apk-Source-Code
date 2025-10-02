package com.behaviosec.rl.android;

import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yyyllll;

/* loaded from: classes4.dex */
public interface IBehavioSecFieldCallback {
    public static final String MASKED_COLLECTION;
    public static final String NORMAL_COLLECTION = uuxuuuu.pppp0070ppp("\u0004", (char) (yyyllll.rrrr007200720072() ^ 383822026), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)));
    public static final int h00680068006800680068hh = 2;
    public static final int h0068h006800680068hh = 65;
    public static final int hh0068006800680068hh;

    static {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u000e\u0016", (char) (yyyllll.rrrr007200720072() ^ 383821991), (char) (yyyllll.rrrr007200720072() ^ 383821866));
        int i = h0068h006800680068hh;
        if (((hh0068006800680068hh + i) * i) % h00680068006800680068hh != 0) {
            hh0068006800680068hh = 11;
        }
        MASKED_COLLECTION = strPppp0070ppp;
    }

    @Nullable
    String getFieldName(@NonNull EditText editText);

    @Nullable
    String getFieldType(@NonNull EditText editText);

    @Nullable
    Boolean shouldBeMonitored(@NonNull EditText editText);
}
