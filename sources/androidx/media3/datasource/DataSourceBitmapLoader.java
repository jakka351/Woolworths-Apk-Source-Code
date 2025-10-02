package androidx.media3.datasource;

import android.content.Context;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DefaultDataSource;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.util.concurrent.ListeningExecutorService;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final Supplier b = Suppliers.a(new a(0));

    /* renamed from: a, reason: collision with root package name */
    public final ListeningExecutorService f2956a;

    public DataSourceBitmapLoader(Context context) {
        ListeningExecutorService listeningExecutorService = (ListeningExecutorService) b.get();
        Assertions.g(listeningExecutorService);
        new DefaultDataSource.Factory(context);
        this.f2956a = listeningExecutorService;
    }
}
