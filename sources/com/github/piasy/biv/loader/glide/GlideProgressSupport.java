package com.github.piasy.biv.loader.glide;

import java.util.HashMap;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.RealBufferedSource;

/* loaded from: classes.dex */
public class GlideProgressSupport {

    public static class DispatchingProgressListener implements ResponseProgressListener {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14354a = new HashMap();
        public static final HashMap b = new HashMap();

        public static void a(String str) {
            f14354a.remove(str.split("\\?")[0]);
            b.remove(str.split("\\?")[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static class OkHttpProgressResponseBody extends ResponseBody {
        public final HttpUrl g;
        public final ResponseBody h;
        public final DispatchingProgressListener i;
        public RealBufferedSource j;

        public OkHttpProgressResponseBody(HttpUrl httpUrl, ResponseBody responseBody, DispatchingProgressListener dispatchingProgressListener) {
            this.g = httpUrl;
            this.h = responseBody;
            this.i = dispatchingProgressListener;
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource U0() {
            if (this.j == null) {
                this.j = Okio.c(new ForwardingSource(this.h.U0()) { // from class: com.github.piasy.biv.loader.glide.GlideProgressSupport.OkHttpProgressResponseBody.1
                    public long e = 0;

                    @Override // okio.ForwardingSource, okio.Source
                    public final long q2(Buffer buffer, long j) {
                        long jQ2 = super.q2(buffer, j);
                        OkHttpProgressResponseBody okHttpProgressResponseBody = OkHttpProgressResponseBody.this;
                        long jB = okHttpProgressResponseBody.h.getH();
                        if (jQ2 == -1) {
                            this.e = jB;
                        } else {
                            this.e += jQ2;
                        }
                        DispatchingProgressListener dispatchingProgressListener = okHttpProgressResponseBody.i;
                        HttpUrl httpUrl = okHttpProgressResponseBody.g;
                        long j2 = this.e;
                        dispatchingProgressListener.getClass();
                        String str = httpUrl.i.split("\\?")[0];
                        ProgressListener progressListener = (ProgressListener) DispatchingProgressListener.f14354a.get(str);
                        if (progressListener != null) {
                            HashMap map = DispatchingProgressListener.b;
                            Integer num = (Integer) map.get(str);
                            if (num == null) {
                                progressListener.c();
                            }
                            if (jB <= j2) {
                                progressListener.f();
                                DispatchingProgressListener.a(str);
                                return jQ2;
                            }
                            int i = (int) ((j2 / jB) * 100.0f);
                            if (num == null || i != num.intValue()) {
                                map.put(str, Integer.valueOf(i));
                                progressListener.onProgress(i);
                                return jQ2;
                            }
                        }
                        return jQ2;
                    }
                });
            }
            return this.j;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: b */
        public final long getH() {
            return this.h.getH();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: c */
        public final MediaType getG() {
            return this.h.getG();
        }
    }

    /* loaded from: classes4.dex */
    public interface ProgressListener {
        void c();

        void f();

        void onProgress(int i);
    }

    public interface ResponseProgressListener {
    }
}
