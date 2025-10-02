package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.Preconditions;
import com.dynatrace.android.callback.OkCallback;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public class OkHttpStreamFetcher implements DataFetcher<InputStream>, Callback {
    public final Call.Factory d;
    public final GlideUrl e;
    public ContentLengthInputStream f;
    public ResponseBody g;
    public DataFetcher.DataCallback h;
    public volatile Call i;

    public OkHttpStreamFetcher(Call.Factory factory, GlideUrl glideUrl) {
        this.d = factory;
        this.e = glideUrl;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() throws IOException {
        try {
            ContentLengthInputStream contentLengthInputStream = this.f;
            if (contentLengthInputStream != null) {
                contentLengthInputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.g;
        if (responseBody != null) {
            responseBody.close();
        }
        this.h = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource c() {
        return DataSource.e;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        Call call = this.i;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void d(Priority priority, DataFetcher.DataCallback dataCallback) {
        Request.Builder builder = new Request.Builder();
        builder.h(this.e.toStringUrl());
        for (Map.Entry<String, String> entry : this.e.getHeaders().entrySet()) {
            builder.a(entry.getKey(), entry.getValue());
        }
        Request request = new Request(builder);
        this.h = dataCallback;
        this.i = this.d.a(request);
        FirebasePerfOkHttpClient.enqueue(this.i, this);
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        OkCallback.b(call, iOException);
        try {
            if (Log.isLoggable("OkHttpFetcher", 3)) {
                Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
            }
            this.h.f(iOException);
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        OkCallback.c(call, response);
        try {
            ResponseBody responseBody = response.j;
            this.g = responseBody;
            if (!response.s) {
                this.h.f(new HttpException(response.g, null, response.f));
            } else {
                Preconditions.c(responseBody, "Argument must not be null");
                ContentLengthInputStream contentLengthInputStream = new ContentLengthInputStream(this.g.U0().z2(), responseBody.getH());
                this.f = contentLengthInputStream;
                this.h.e(contentLengthInputStream);
            }
        } catch (Throwable th) {
            String str = OkCallback.f14143a;
            throw th;
        }
    }
}
