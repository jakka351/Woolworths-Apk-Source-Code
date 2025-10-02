package androidx.media3.datasource;

import android.content.Context;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2961a;
    public final DefaultHttpDataSource.Factory b;

    public DefaultDataSourceFactory(Context context) {
        DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
        this.f2961a = context.getApplicationContext();
        this.b = factory;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource a() {
        return new DefaultDataSource(this.f2961a, this.b.a());
    }
}
