package com.bumptech.glide;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable, ModelTypes<RequestBuilder<TranscodeType>> {
    public final Class A;
    public final GlideContext B;
    public TransitionOptions C;
    public Object D;
    public ArrayList E;
    public RequestBuilder F;
    public RequestBuilder G;
    public final boolean H = true;
    public boolean I;
    public boolean J;
    public final Context y;
    public final RequestManager z;

    /* renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13763a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Priority.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f13763a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13763a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13763a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13763a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13763a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestBuilder(Glide glide, RequestManager requestManager, Class cls, Context context) {
        RequestOptions requestOptions;
        this.z = requestManager;
        this.A = cls;
        this.y = context;
        ArrayMap arrayMap = requestManager.d.g.f;
        TransitionOptions transitionOptions = (TransitionOptions) arrayMap.get(cls);
        if (transitionOptions == null) {
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        this.C = transitionOptions == null ? GlideContext.k : transitionOptions;
        this.B = glide.g;
        Iterator it2 = requestManager.l.iterator();
        while (it2.hasNext()) {
            C((RequestListener) it2.next());
        }
        synchronized (requestManager) {
            requestOptions = requestManager.m;
        }
        a(requestOptions);
    }

    public final RequestBuilder C(RequestListener requestListener) {
        if (this.u) {
            return clone().C(requestListener);
        }
        if (requestListener != null) {
            if (this.E == null) {
                this.E = new ArrayList();
            }
            this.E.add(requestListener);
        }
        s();
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder a(BaseRequestOptions baseRequestOptions) {
        Preconditions.b(baseRequestOptions);
        return (RequestBuilder) super.a(baseRequestOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request E(Object obj, Target target, RequestListener requestListener, RequestCoordinator requestCoordinator, TransitionOptions transitionOptions, Priority priority, int i, int i2, BaseRequestOptions baseRequestOptions, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator errorRequestCoordinator;
        BaseRequestOptions baseRequestOptions2;
        SingleRequest singleRequest;
        Priority priority2;
        if (this.G != null) {
            errorRequestCoordinator = new ErrorRequestCoordinator(obj, requestCoordinator);
            requestCoordinator2 = errorRequestCoordinator;
        } else {
            requestCoordinator2 = null;
            errorRequestCoordinator = requestCoordinator;
        }
        RequestBuilder requestBuilder = this.F;
        if (requestBuilder == null) {
            Context context = this.y;
            GlideContext glideContext = this.B;
            Object obj2 = this.D;
            Class cls = this.A;
            ArrayList arrayList = this.E;
            Engine engine = glideContext.g;
            transitionOptions.getClass();
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = new SingleRequest(context, glideContext, obj, obj2, cls, baseRequestOptions2, i, i2, priority, target, requestListener, arrayList, errorRequestCoordinator, engine, executor);
        } else {
            if (this.J) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            TransitionOptions transitionOptions2 = requestBuilder.H ? transitionOptions : requestBuilder.C;
            if (BaseRequestOptions.h(requestBuilder.d, 8)) {
                priority2 = this.F.f;
            } else {
                int iOrdinal = priority.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    priority2 = Priority.d;
                } else if (iOrdinal == 2) {
                    priority2 = Priority.e;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f);
                    }
                    priority2 = Priority.f;
                }
            }
            Priority priority3 = priority2;
            RequestBuilder requestBuilder2 = this.F;
            int i3 = requestBuilder2.m;
            int i4 = requestBuilder2.l;
            if (Util.j(i, i2)) {
                RequestBuilder requestBuilder3 = this.F;
                if (!Util.j(requestBuilder3.m, requestBuilder3.l)) {
                    i3 = baseRequestOptions.m;
                    i4 = baseRequestOptions.l;
                }
            }
            int i5 = i4;
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, errorRequestCoordinator);
            Context context2 = this.y;
            GlideContext glideContext2 = this.B;
            ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = thumbnailRequestCoordinator;
            Object obj3 = this.D;
            Class cls2 = this.A;
            ArrayList arrayList2 = this.E;
            Engine engine2 = glideContext2.g;
            transitionOptions.getClass();
            SingleRequest singleRequest2 = new SingleRequest(context2, glideContext2, obj, obj3, cls2, baseRequestOptions, i, i2, priority, target, requestListener, arrayList2, thumbnailRequestCoordinator2, engine2, executor);
            this.J = true;
            RequestBuilder requestBuilder4 = this.F;
            Request requestE = requestBuilder4.E(obj, target, requestListener, thumbnailRequestCoordinator2, transitionOptions2, priority3, i3, i5, requestBuilder4, executor);
            this.J = false;
            thumbnailRequestCoordinator2.c = singleRequest2;
            thumbnailRequestCoordinator2.d = requestE;
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = thumbnailRequestCoordinator2;
        }
        if (requestCoordinator2 == null) {
            return singleRequest;
        }
        RequestBuilder requestBuilder5 = this.G;
        int i6 = requestBuilder5.m;
        int i7 = requestBuilder5.l;
        if (Util.j(i, i2)) {
            RequestBuilder requestBuilder6 = this.G;
            if (!Util.j(requestBuilder6.m, requestBuilder6.l)) {
                i6 = baseRequestOptions2.m;
                i7 = baseRequestOptions2.l;
            }
        }
        int i8 = i7;
        RequestBuilder requestBuilder7 = this.G;
        ErrorRequestCoordinator errorRequestCoordinator2 = requestCoordinator2;
        Request requestE2 = requestBuilder7.E(obj, target, requestListener, errorRequestCoordinator2, requestBuilder7.C, requestBuilder7.f, i6, i8, requestBuilder7, executor);
        errorRequestCoordinator2.c = singleRequest;
        errorRequestCoordinator2.d = requestE2;
        return errorRequestCoordinator2;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder clone() {
        RequestBuilder requestBuilder = (RequestBuilder) super.clone();
        requestBuilder.C = requestBuilder.C.clone();
        if (requestBuilder.E != null) {
            requestBuilder.E = new ArrayList(requestBuilder.E);
        }
        RequestBuilder requestBuilder2 = requestBuilder.F;
        if (requestBuilder2 != null) {
            requestBuilder.F = requestBuilder2.clone();
        }
        RequestBuilder requestBuilder3 = requestBuilder.G;
        if (requestBuilder3 != null) {
            requestBuilder.G = requestBuilder3.clone();
        }
        return requestBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.widget.ImageView r5) {
        /*
            r4 = this;
            com.bumptech.glide.util.Util.a()
            com.bumptech.glide.util.Preconditions.b(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.d
            boolean r0 = com.bumptech.glide.request.BaseRequestOptions.h(r1, r0)
            if (r0 != 0) goto L67
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L67
            int[] r0 = com.bumptech.glide.RequestBuilder.AnonymousClass1.f13763a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L57;
                case 2: goto L47;
                case 3: goto L37;
                case 4: goto L37;
                case 5: goto L37;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L67
        L27:
            com.bumptech.glide.RequestBuilder r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.b
            com.bumptech.glide.load.resource.bitmap.CenterInside r3 = new com.bumptech.glide.load.resource.bitmap.CenterInside
            r3.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.r(r2, r3, r1)
            goto L68
        L37:
            com.bumptech.glide.RequestBuilder r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f13909a
            com.bumptech.glide.load.resource.bitmap.FitCenter r3 = new com.bumptech.glide.load.resource.bitmap.FitCenter
            r3.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.r(r2, r3, r1)
            goto L68
        L47:
            com.bumptech.glide.RequestBuilder r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.b
            com.bumptech.glide.load.resource.bitmap.CenterInside r3 = new com.bumptech.glide.load.resource.bitmap.CenterInside
            r3.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.r(r2, r3, r1)
            goto L68
        L57:
            com.bumptech.glide.RequestBuilder r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
            com.bumptech.glide.load.resource.bitmap.CenterCrop r2 = new com.bumptech.glide.load.resource.bitmap.CenterCrop
            r2.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.j(r1, r2)
            goto L68
        L67:
            r0 = r4
        L68:
            com.bumptech.glide.GlideContext r1 = r4.B
            com.bumptech.glide.request.target.ImageViewTargetFactory r1 = r1.c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.A
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            com.bumptech.glide.request.target.BitmapImageViewTarget r1 = new com.bumptech.glide.request.target.BitmapImageViewTarget
            r1.<init>(r5)
            goto L8c
        L7f:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L93
            com.bumptech.glide.request.target.DrawableImageViewTarget r1 = new com.bumptech.glide.request.target.DrawableImageViewTarget
            r1.<init>(r5)
        L8c:
            r5 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.Executors.f13983a
            r4.J(r1, r5, r0, r2)
            return
        L93:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = androidx.constraintlayout.core.state.a.e(r2, r0, r1)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.H(android.widget.ImageView):void");
    }

    public final void I(Target target) {
        J(target, null, this, Executors.f13983a);
    }

    public final void J(Target target, RequestFutureTarget requestFutureTarget, BaseRequestOptions baseRequestOptions, Executor executor) {
        Preconditions.b(target);
        if (!this.I) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request requestE = E(new Object(), target, requestFutureTarget, null, this.C, baseRequestOptions.f, baseRequestOptions.m, baseRequestOptions.l, baseRequestOptions, executor);
        Request requestA = target.a();
        if (requestE.d(requestA) && (baseRequestOptions.k || !requestA.isComplete())) {
            Preconditions.c(requestA, "Argument must not be null");
            if (requestA.isRunning()) {
                return;
            }
            requestA.h();
            return;
        }
        this.z.f(target);
        target.i(requestE);
        RequestManager requestManager = this.z;
        synchronized (requestManager) {
            requestManager.i.d.add(target);
            RequestTracker requestTracker = requestManager.g;
            requestTracker.f13953a.add(requestE);
            if (requestTracker.c) {
                requestE.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                requestTracker.b.add(requestE);
            } else {
                requestE.h();
            }
        }
    }

    public final RequestBuilder K(RequestListener requestListener) {
        if (this.u) {
            return clone().K(requestListener);
        }
        this.E = null;
        return C(requestListener);
    }

    public final RequestBuilder L(Uri uri) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        RequestBuilder requestBuilderN = N(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return requestBuilderN;
        }
        Context context = this.y;
        RequestBuilder requestBuilder = (RequestBuilder) requestBuilderN.w(context.getTheme());
        ConcurrentHashMap concurrentHashMap = ApplicationVersionSignature.f13978a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = ApplicationVersionSignature.f13978a;
        Key key = (Key) concurrentHashMap2.get(packageName);
        if (key == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            ObjectKey objectKey = new ObjectKey(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            Key key2 = (Key) concurrentHashMap2.putIfAbsent(packageName, objectKey);
            key = key2 == null ? objectKey : key2;
        }
        return (RequestBuilder) requestBuilder.u(new AndroidResourceSignature(context.getResources().getConfiguration().uiMode & 48, key));
    }

    public final RequestBuilder M(String str) {
        return N(str);
    }

    public final RequestBuilder N(Object obj) {
        if (this.u) {
            return clone().N(obj);
        }
        this.D = obj;
        this.I = true;
        s();
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        return super.equals(requestBuilder) && Objects.equals(this.A, requestBuilder.A) && this.C.equals(requestBuilder.C) && Objects.equals(this.D, requestBuilder.D) && Objects.equals(this.E, requestBuilder.E) && Objects.equals(this.F, requestBuilder.F) && Objects.equals(this.G, requestBuilder.G) && this.H == requestBuilder.H && this.I == requestBuilder.I;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final int hashCode() {
        return Util.h(this.I ? 1 : 0, Util.h(this.H ? 1 : 0, Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(super.hashCode(), this.A), this.C), this.D), this.E), this.F), this.G), null)));
    }
}
