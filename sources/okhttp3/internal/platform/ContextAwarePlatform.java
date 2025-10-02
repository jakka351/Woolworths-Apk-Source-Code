package okhttp3.internal.platform;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/ContextAwarePlatform;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContextAwarePlatform {
    Context getApplicationContext();

    void setApplicationContext(Context context);
}
