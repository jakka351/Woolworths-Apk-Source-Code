package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DefaultDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2959a;
    public final ArrayList b;
    public final DataSource c;
    public FileDataSource d;
    public AssetDataSource e;
    public ContentDataSource f;
    public DataSource g;
    public UdpDataSource h;
    public DataSchemeDataSource i;
    public RawResourceDataSource j;
    public DataSource k;

    public static final class Factory implements DataSource.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2960a;
        public final DataSource.Factory b;

        public Factory(Context context) {
            this(context, new DefaultHttpDataSource.Factory());
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            return new DefaultDataSource(this.f2960a, this.b.a());
        }

        public Factory(Context context, DataSource.Factory factory) {
            this.f2960a = context.getApplicationContext();
            this.b = factory;
        }
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.f2959a = context.getApplicationContext();
        dataSource.getClass();
        this.c = dataSource;
        this.b = new ArrayList();
    }

    public static void n(DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.g(transferListener);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        Assertions.f(this.k == null);
        Uri uri = dataSpec.f2957a;
        String scheme = uri.getScheme();
        int i = Util.f2928a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f2959a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.d = fileDataSource;
                    m(fileDataSource);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.e = assetDataSource;
                    m(assetDataSource);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.e = assetDataSource2;
                m(assetDataSource2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                m(contentDataSource);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            DataSource dataSource = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        DataSource dataSource2 = (DataSource) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = dataSource2;
                        m(dataSource2);
                    } catch (ClassNotFoundException unused) {
                        Log.g("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = dataSource;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.h = udpDataSource;
                    m(udpDataSource);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource(false);
                    this.i = dataSchemeDataSource;
                    m(dataSchemeDataSource);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.j = rawResourceDataSource;
                    m(rawResourceDataSource);
                }
                this.k = this.j;
            } else {
                this.k = dataSource;
            }
        }
        return this.k.a(dataSpec);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        DataSource dataSource = this.k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        DataSource dataSource = this.k;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.d();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        this.c.g(transferListener);
        this.b.add(transferListener);
        n(this.d, transferListener);
        n(this.e, transferListener);
        n(this.f, transferListener);
        n(this.g, transferListener);
        n(this.h, transferListener);
        n(this.i, transferListener);
        n(this.j, transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSource dataSource = this.k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    public final void m(DataSource dataSource) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            dataSource.g((TransferListener) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        DataSource dataSource = this.k;
        dataSource.getClass();
        return dataSource.read(bArr, i, i2);
    }
}
